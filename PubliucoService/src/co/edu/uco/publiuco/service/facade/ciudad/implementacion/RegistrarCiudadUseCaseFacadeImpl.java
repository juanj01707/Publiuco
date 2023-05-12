package co.edu.uco.publiuco.service.facade.ciudad.implementacion;

import co.edu.uco.publiuco.service.usecase.ciudad.RegistrarCiudadUseCase;

@Service
@Transactional
public class RegistrarCiudadUseCaseFacadeImpl 
implements RegistrarCiudadUseCaseFacade{
	
	
	@Autowired
	private RegistrarCiudadUseCase useCase;
	
	@Override
	public void execute (CiudadDTO dto) {
		//sirve el assembler para llevar de DTO a Domain
		CiudadDomain domain = null;
		
		useCase.execute(domain);
	}

}
