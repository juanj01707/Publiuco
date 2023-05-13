package co.edu.uco.publiuco.api.controller.ciudad;

import org.springframework.http.HttpStatus;

@RestController
@RequestMapping("publiuco/api/v1/ciudad")
public class RegistrarCiudadController {
	
	@Autowired
	private RegistrarCiudadUseCaseFacade facade;
	
	@PostMapping
	public ResponseEntity<String>
	execute (@RequestBody CiudadDTO ciudad){
		
		facade.execute(ciudad);
		return new ResponseEntity<>("Éxito", HttpStatus.ACCEPTED);
		
	}
	

}
