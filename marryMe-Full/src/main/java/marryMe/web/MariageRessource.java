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


import marryMe.dao.IDAOMariage;
import marryMe.model.Mariage;
import marryMe.model.Views;


@RestController
@RequestMapping("/mariages")
@CrossOrigin("*")
public class MariageRessource {

	@Autowired
	private IDAOMariage daoMariage;
	
//	@Autowired
//	private IDAOInvite daoInvite;
//	
//	@Autowired
//	private IDAOPrestation daoPrestation;

	@GetMapping("")
	@JsonView(Views.ViewMariage.class)
	public List<Mariage> findAll() {
		List<Mariage> mariages = daoMariage.findAll();

		return mariages;
	}

	@GetMapping("/{id}")
	@JsonView(Views.ViewMariage.class)
	public Mariage findById(@PathVariable Integer id) {
		Optional<Mariage> optMariage = daoMariage.findById(id);

		if (optMariage.isEmpty()) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
		}

		return optMariage.get();
	}



	@PostMapping("")
	@JsonView(Views.ViewMariage.class)
	public Mariage create(@Valid @RequestBody Mariage mariage, BindingResult result) {
		if (result.hasErrors()) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Le mariage n'a pu être créé");
		}

		mariage = daoMariage.save(mariage);

		return mariage;
	}

	@PutMapping("/{id}")
	@JsonView(Views.ViewMariage.class)
	public Mariage update(@PathVariable Integer id, @RequestBody Mariage mariage) {
		if (id != mariage.getId() || !daoMariage.existsById(id)) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
		}

		mariage = daoMariage.save(mariage);

		return mariage;
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable Integer id) {
		if (!daoMariage.existsById(id)) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
		}

		daoMariage.deleteById(id);
	}
}
