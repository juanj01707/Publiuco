package co.edu.uco.publiuco.entity;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Departamento")
public class DepartamentoEntity {
	
	
	@Id
	private UUID codigo;
	@ManyToOne
	@JoinColumn(name = "pais")
	private PaisEntity pais;
	
	private String nombre;

}
