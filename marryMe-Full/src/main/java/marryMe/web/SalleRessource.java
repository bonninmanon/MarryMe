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
import marryMe.model.Salle;

import marryMe.model.Views;

@RestController
@RequestMapping("/salles")
@CrossOrigin("*")
public class SalleRessource {
	
	@Autowired
	private IDAOPrestation daoSalle;

	@GetMapping("")
	@JsonView(Views.ViewSalle.class)
	public List<Salle> findAllSalle() {
		List<Salle> Salles = daoSalle.findAllSalle();

		return Salles;
	}

	@GetMapping("/{id}")
	@JsonView(Views.ViewSalle.class)
	public Salle findSalleById(@PathVariable Integer id) {
		Optional<Salle> optSalle = daoSalle.findSalleById(id);

		if (optSalle.isEmpty()) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
		}

		return optSalle.get();
	}


	@PostMapping("")
	@JsonView(Views.ViewSalle.class)
	public Salle create(@Valid @RequestBody Salle salle, BindingResult result) {
		if (result.hasErrors()) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "La salle n'a pu être créé");
		}

		salle = daoSalle.save(salle);

		return salle;
	}

	@PutMapping("/{id}")
	@JsonView(Views.ViewSalle.class)
	public Salle update(@PathVariable Integer id, @RequestBody Salle salle) {
		if (id != salle.getId() || !daoSalle.existsById(id)) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
		}

		salle = daoSalle.save(salle);

		return salle;
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable Integer id) {
		if (!daoSalle.existsById(id)) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
		}

		daoSalle.deleteById(id);
	}
}
