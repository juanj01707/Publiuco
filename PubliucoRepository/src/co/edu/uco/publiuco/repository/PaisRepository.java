package co.edu.uco.publiuco.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PaisRepository extends JpaRepository<PaisEntity,UUID>{

}
