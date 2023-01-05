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

import marryMe.dao.IDAOInvite;
import marryMe.dao.IDAOMariage;
import marryMe.model.Invite;
import marryMe.model.Views;

@RestController
@RequestMapping("/invites")
@CrossOrigin("*")
public class InviteRessource {

	@Autowired
	private IDAOInvite daoInvite;
	
//	@Autowired
//	private IDAOMariage daoMariage;

	@GetMapping("")
	@JsonView(Views.ViewInvite.class)
	public List<Invite> findAll() {
		List<Invite> invites = daoInvite.findAll();

		return invites;
	}

	@GetMapping("/{id}")
	@JsonView(Views.ViewInvite.class)
	public Invite findById(@PathVariable Integer id) {
		Optional<Invite> optInvite = daoInvite.findById(id);

		if (optInvite.isEmpty()) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
		}

		return optInvite.get();
	}



	@PostMapping("")
	@JsonView(Views.ViewInvite.class)
	public Invite create(@Valid @RequestBody Invite invite, BindingResult result) {
		if (result.hasErrors()) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Le invite n'a pu être créé");
		}

		invite = daoInvite.save(invite);

		return invite;
	}

	@PutMapping("/{id}")
	@JsonView(Views.ViewInvite.class)
	public Invite update(@PathVariable Integer id, @RequestBody Invite invite) {
		if (id != invite.getId() || !daoInvite.existsById(id)) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
		}

		invite = daoInvite.save(invite);

		return invite;
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable Integer id) {
		if (!daoInvite.existsById(id)) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
		}

		daoInvite.deleteById(id);
	}
}
