package co.edu.uco.publiuco.service.usecase;

import java.util.List;

public interface UseCaseList<D> {
	List<D> execute (D domain);
}
