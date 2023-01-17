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
import marryMe.model.Cake;
import marryMe.model.Views;


@RestController
@RequestMapping("/cakes")
@CrossOrigin("*")
public class CakeRessource {
	
	@Autowired
	private IDAOPrestation daoCake;
	
	

	@GetMapping("")
	@JsonView(Views.ViewCake.class)
	public List<Cake> findAllCake() {
		List<Cake> Cakes = daoCake.findAllCake();

		return Cakes;
	}

	@GetMapping("/{id}")
	@JsonView(Views.ViewCake.class)
	public Cake findCakeById(@PathVariable Integer id) {
		Optional<Cake> optCake = daoCake.findCakeById(id);

		if (optCake.isEmpty()) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
		}

		return optCake.get();
	}


	@PostMapping("")
	@JsonView(Views.ViewCake.class)
	public Cake create(@Valid @RequestBody Cake cake, BindingResult result) {
		if (result.hasErrors()) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "La cake n'a pu être créé");
		}

		cake = daoCake.save(cake);

		return cake;
	}

	@PutMapping("/{id}")
	@JsonView(Views.ViewCake.class)
	public Cake update(@PathVariable Integer id, @RequestBody Cake cake) {
		if (id != cake.getId() || !daoCake.existsById(id)) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
		}

		cake = daoCake.save(cake);

		return cake;
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable Integer id) {
		if (!daoCake.existsById(id)) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
		}

		daoCake.deleteById(id);
	}

	
}