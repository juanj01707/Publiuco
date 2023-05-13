package co.edu.uco.publiuco.service.facade.ciudad.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.uco.publiuco.dto.CiudadDTO;
import co.edu.uco.publiuco.service.domain.CiudadDomain;
import co.edu.uco.publiuco.service.facade.ciudad.RegistrarCiudadUseCaseFacade;
import co.edu.uco.publiuco.service.usecase.ciudad.RegistrarCiudadUseCase;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class RegistrarCiudadUseCaseFacadeImpl 
implements RegistrarCiudadUseCaseFacade{
	
	@Autowired
	private RegistrarCiudadUseCase useCase;
	
	@Override
	public void execute(CiudadDTO dto) {
		
		//sirve el assembler para llevar de DTO a Domain
		CiudadDomain domain = null;
				
		useCase.execute(domain);
	}

}
