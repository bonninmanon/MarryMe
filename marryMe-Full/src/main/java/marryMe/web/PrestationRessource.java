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
import marryMe.model.Prestation;
import marryMe.model.Views;

@RestController
@RequestMapping("/prestations")
@CrossOrigin("*")
public class PrestationRessource {

	@Autowired
	private IDAOPrestation daoPrestation;
	
//	@Autowired
//	private IDAOMariage daoMariage;


	@GetMapping("")
	@JsonView(Views.ViewPrestation.class)
	public List<Prestation> findAll() {
		List<Prestation> prestations = daoPrestation.findAll();

		return prestations;
	}

	@GetMapping("/{id}")
	@JsonView(Views.ViewPrestation.class)
	public Prestation findById(@PathVariable Integer id) {
		Optional<Prestation> optPrestation = daoPrestation.findById(id);

		if (optPrestation.isEmpty()) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
		}

		return optPrestation.get();
	}



	@PostMapping("")
	@JsonView(Views.ViewPrestation.class)
	public Prestation create(@Valid @RequestBody Prestation prestation, BindingResult result) {
		if (result.hasErrors()) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Le prestation n'a pu être créé");
		}

		prestation = daoPrestation.save(prestation);

		return prestation;
	}

	@PutMapping("/{id}")
	@JsonView(Views.ViewPrestation.class)
	public Prestation update(@PathVariable Integer id, @RequestBody Prestation prestation) {
		if (id != prestation.getId() || !daoPrestation.existsById(id)) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
		}

		prestation = daoPrestation.save(prestation);

		return prestation;
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable Integer id) {
		if (!daoPrestation.existsById(id)) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
		}

		daoPrestation.deleteById(id);
	}
}

