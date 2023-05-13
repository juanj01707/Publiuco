package co.edu.uco.publiuco.service.usecase.ciudad.implementation;

import org.springframework.beans.factory.annotation.Autowired;

import co.edu.uco.publiuco.entity.CiudadEntity;
import co.edu.uco.publiuco.repository.CiudadRepository;
import co.edu.uco.publiuco.service.domain.CiudadDomain;
import co.edu.uco.publiuco.service.usecase.ciudad.RegistrarCiudadUseCase;

public class RegistrarCiudadUseCaseImpl implements RegistrarCiudadUseCase {
	
	@Autowired
	private CiudadRepository repository;
	
	
	@Override
	public void execute(CiudadDomain domain) {
		
		//Crear reglas de negocio
		//Specification Pattern o un Validator Pattern
				
		//Aquí deberascrear el ensamblador
		CiudadEntity entity = null;
		repository.save(null);
		
	}

}
