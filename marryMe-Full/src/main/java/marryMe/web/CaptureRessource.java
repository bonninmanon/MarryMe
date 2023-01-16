//package marryMe.web;
//
//import java.util.List;
//import java.util.Optional;
//
//import javax.validation.Valid;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.server.ResponseStatusException;
//
//import com.fasterxml.jackson.annotation.JsonView;
//
//import marryMe.dao.IDAOPrestation;
//import marryMe.model.Capture;
//
//import marryMe.model.Views;
//
//@RestController
//@RequestMapping("/captures")
//@CrossOrigin("*")
//public class CaptureRessource {
//	
//	@Autowired
//	private IDAOPrestation daoCapture;
//
//	@GetMapping("")
//	@JsonView(Views.ViewCapture.class)
//	public List<Capture> findAllCapture() {
//		List<Capture> Captures = daoCapture.findAllCapture();
//
//		return Captures;
//	}
//
//	@GetMapping("/{id}")
//	@JsonView(Views.ViewCapture.class)
//	public Capture findCaptureById(@PathVariable Integer id) {
//		Optional<Capture> optCapture = daoCapture.findCaptureById(id);
//
//		if (optCapture.isEmpty()) {
//			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
//		}
//
//		return optCapture.get();
//	}
//
//
//	@PostMapping("")
//	@JsonView(Views.ViewCapture.class)
//	public Capture create(@Valid @RequestBody Capture capture, BindingResult result) {
//		if (result.hasErrors()) {
//			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "La capture n'a pu être créé");
//		}
//
//		capture = daoCapture.save(capture);
//
//		return capture;
//	}
//
//	@PutMapping("/{id}")
//	@JsonView(Views.ViewCapture.class)
//	public Capture update(@PathVariable Integer id, @RequestBody Capture capture) {
//		if (id != capture.getId() || !daoCapture.existsById(id)) {
//			throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
//		}
//
//		capture = daoCapture.save(capture);
//
//		return capture;
//	}
//
//	@DeleteMapping("/{id}")
//	public void delete(@PathVariable Integer id) {
//		if (!daoCapture.existsById(id)) {
//			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
//		}
//
//		daoCapture.deleteById(id);
//	}
//}
