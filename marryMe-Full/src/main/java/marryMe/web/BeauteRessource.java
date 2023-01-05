package marryMe.web;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.fasterxml.jackson.annotation.JsonView;

import marryMe.dao.IDAOPrestation;
import marryMe.model.Beaute;

import marryMe.model.Views;

@RestController
@RequestMapping("/beautes")
@CrossOrigin("*")
public class BeauteRessource {
	
	@Autowired
	private IDAOPrestation daoBeaute;

	@GetMapping("")
	@JsonView(Views.ViewBeaute.class)
	public List<Beaute> findAllBeaute() {
		List<Beaute> Beautes = daoBeaute.findAllBeaute();

		return Beautes;
	}

	@GetMapping("/{id}")
	@JsonView(Views.ViewBeaute.class)
	public Beaute findBeauteById(@PathVariable Integer id) {
		Optional<Beaute> optBeaute = daoBeaute.findBeauteById(id);

		if (optBeaute.isEmpty()) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
		}

		return optBeaute.get();
	}


	@PostMapping("")
	@JsonView(Views.ViewBeaute.class)
	public Beaute create(@Valid @RequestBody Beaute beaute, BindingResult result) {
		if (result.hasErrors()) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "La beaute n'a pu être créé");
		}

		beaute = daoBeaute.save(beaute);

		return beaute;
	}

	@PutMapping("/{id}")
	@JsonView(Views.ViewBeaute.class)
	public Beaute update(@PathVariable Integer id, @RequestBody Beaute beaute) {
		if (id != beaute.getId() || !daoBeaute.existsById(id)) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
		}

		beaute = daoBeaute.save(beaute);

		return beaute;
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable Integer id) {
		if (!daoBeaute.existsById(id)) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
		}

		daoBeaute.deleteById(id);
	}
}
