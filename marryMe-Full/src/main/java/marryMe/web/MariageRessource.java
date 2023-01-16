package marryMe.web;

import java.util.ArrayList;

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
import marryMe.dao.IDAOPrestation;

import marryMe.model.Cake;

import marryMe.model.Mariage;
import marryMe.model.Prestation;
import marryMe.model.Robe;
import marryMe.model.Salle;
import marryMe.model.Traiteur;
import marryMe.model.Views;
import marryMe.web.dto.CakeDTO;
import marryMe.web.dto.MariageDTO;
import marryMe.web.dto.PrestationDTO;
import marryMe.web.dto.RobeDTO;
import marryMe.web.dto.SalleDTO;
import marryMe.web.dto.TraiteurDTO;



@RestController
@RequestMapping("/mariages")
@CrossOrigin("*")
public class MariageRessource {

	@Autowired
	private IDAOMariage daoMariage;
	
	@Autowired
	private IDAOPrestation daoPrestation;



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

	@GetMapping("/{id}/detail")		
	
	public MariageDTO findDTOById(@PathVariable Integer id) {
		Optional<Mariage> optMariage = daoMariage.findById(id);
		

		if (optMariage.isEmpty()) {
		throw new ResponseStatusException(HttpStatus.NOT_FOUND);
		}
		
	Mariage mariage = optMariage.get();

		MariageDTO mariageDTO = new MariageDTO();
   	PrestationDTO prestationDTO = new PrestationDTO();

   	
	mariageDTO.setIdMariage(mariage.getId());
	mariageDTO.setDate(mariage.getDate());
	mariageDTO.setTheme(mariage.getTheme());
	
	
	List<Prestation> prestations = daoPrestation.findAllByMariage(mariageDTO.getIdMariage());
	
	List<RobeDTO> robeDto=new ArrayList<>();
	mariageDTO.setRobes(robeDto);
		
	List<CakeDTO> cakeDto=new ArrayList<>();
	mariageDTO.setCakes(cakeDto);
	
	List<SalleDTO> salleDto=new ArrayList<>();
	mariageDTO.setSalles(salleDto);
	
	List<TraiteurDTO> traiteurDto=new ArrayList<>();
	mariageDTO.setTraiteurs(traiteurDto);
	
		for(Prestation prestation : prestations) {
			
//			if(prestation instanceof Cake cake) {
//				// Cake cake = (Cake)prestation;
//				CakeDTO cakeDto = new CakeDTO();
//				
//				cakeDto.setIdCake(cake.getId());
//				cakeDto.setPrixCake(cake.getPrix());
//				cakeDto.setAlcoolisée(cake.getAlcoolisée());
//				cakeDto.setSaveur(cake.getSaveur());
//				cakeDto.setDesign(cake.getDesign());
//				cakeDto.setGenoise(cake.getGenoise());
//				cakeDto.setGanaches(cake.getGanaches());
//				
//				mariageDTO.setCakes(cakeDto);
//			}
			
			if(prestation instanceof Cake cake) {
				
				CakeDTO cakeDTO = new CakeDTO();
				
				cakeDTO.setIdCake(cake.getId());
				cakeDTO.setPrixCake(cake.getPrix());
				cakeDTO.setAlcoolisée(cake.getAlcoolisée());
				cakeDTO.setCremes(cake.getCremes());
				cakeDTO.setDesign(cake.getDesign());
				cakeDTO.setGenoise(cake.getGenoise());
				cakeDTO.setGanaches(cake.getGanaches());
				cakeDTO.setNombreInvite(cake.getNombreInvite());
			    
			    cakeDto.add(cakeDTO);
			}
			
			if(prestation instanceof Robe robe) {
				
				RobeDTO robeDTO = new RobeDTO();
				
				robeDTO.setIdRobe(robe.getId());
				robeDTO.setPrixRobe(robe.getPrix());
				robeDTO.setTaille(robe.getTaille());
				robeDTO.setModel(robe.getModel());
				robeDTO.setTaille(robe.getTaille());
				robeDTO.setNom(robe.getNom());
			    
			    robeDto.add(robeDTO);
			}
			
			if(prestation instanceof Salle salle) {
				
				SalleDTO salleDTO = new SalleDTO();
				
				salleDTO.setIdSalle(salle.getId());
				salleDTO.setPrixSalle(salle.getPrix());
				salleDTO.setNom(salle.getNom());
				salleDTO.setCapacite(salle.getCapacite());
			    
				salleDto.add(salleDTO);
			}
			
			if(prestation instanceof Traiteur traiteur) {
				
				TraiteurDTO traiteurDTO = new TraiteurDTO();
				
				traiteurDTO.setIdTraiteur(traiteur.getId());
				traiteurDTO.setPrixTraiteur(traiteur.getPrix());
				traiteurDTO.setVinDHonneur(traiteur.getVinDHonneur());
				traiteurDTO.setCuisine(traiteur.getCuisine());
			    
				traiteurDto.add(traiteurDTO);
			}

		}
		
		return mariageDTO;
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
