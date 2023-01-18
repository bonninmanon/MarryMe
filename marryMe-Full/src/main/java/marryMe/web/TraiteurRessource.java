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
import marryMe.model.Traiteur;

import marryMe.model.Views;

@RestController
@RequestMapping("/traiteur")
@CrossOrigin("*")
public class TraiteurRessource {
	
	@Autowired
	private IDAOPrestation daoTraiteur;

	@GetMapping("")
	@JsonView(Views.ViewTraiteur.class)
	public List<Traiteur> findAllTraiteur() {
		List<Traiteur> Traiteurs = daoTraiteur.findAllTraiteur();

		return Traiteurs;
	}

	@GetMapping("/{id}")
	@JsonView(Views.ViewTraiteur.class)
	public Traiteur findTraiteurById(@PathVariable Integer id) {
		Optional<Traiteur> optTraiteur = daoTraiteur.findTraiteurById(id);

		if (optTraiteur.isEmpty()) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
		}

		return optTraiteur.get();
	}


	@PostMapping("")
	@JsonView(Views.ViewTraiteur.class)
	public Traiteur create(@Valid @RequestBody Traiteur traiteur, BindingResult result) {
		if (result.hasErrors()) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "La traiteur n'a pu être créé");
		}

		traiteur = daoTraiteur.save(traiteur);

		return traiteur;
	}

	@PutMapping("/{id}")
	@JsonView(Views.ViewTraiteur.class)
	public Traiteur update(@PathVariable Integer id, @RequestBody Traiteur traiteur) {
		if (id != traiteur.getId() || !daoTraiteur.existsById(id)) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
		}

		traiteur = daoTraiteur.save(traiteur);

		return traiteur;
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable Integer id) {
		if (!daoTraiteur.existsById(id)) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
		}

		daoTraiteur.deleteById(id);
	}
}
