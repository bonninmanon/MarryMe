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
import marryMe.model.Robe;

import marryMe.model.Views;

@RestController
@RequestMapping("/robes")
@CrossOrigin("*")
public class RobeRessource {
	
	@Autowired
	private IDAOPrestation daoRobe;

	@GetMapping("")
	@JsonView(Views.ViewRobe.class)
	public List<Robe> findAllRobe() {
		List<Robe> Robes = daoRobe.findAllRobe();

		return Robes;
	}

	@GetMapping("/{id}")
	@JsonView(Views.ViewRobe.class)
	public Robe findRobeById(@PathVariable Integer id) {
		Optional<Robe> optRobe = daoRobe.findRobeById(id);

		if (optRobe.isEmpty()) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
		}

		return optRobe.get();
	}


	@PostMapping("")
	@JsonView(Views.ViewRobe.class)
	public Robe create(@Valid @RequestBody Robe robe, BindingResult result) {
		if (result.hasErrors()) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "La robe n'a pu être créé");
		}

		robe = daoRobe.save(robe);

		return robe;
	}

	@PutMapping("/{id}")
	@JsonView(Views.ViewRobe.class)
	public Robe update(@PathVariable Integer id, @RequestBody Robe robe) {
		if (id != robe.getId() || !daoRobe.existsById(id)) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
		}

		robe = daoRobe.save(robe);

		return robe;
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable Integer id) {
		if (!daoRobe.existsById(id)) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
		}

		daoRobe.deleteById(id);
	}
}
