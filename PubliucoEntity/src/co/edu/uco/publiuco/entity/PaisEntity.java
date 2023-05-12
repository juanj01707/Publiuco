package co.edu.uco.publiuco.entity;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "pais")
@Document
public class PaisEntity {
	
	@Id
	@Column (name = "codigo")
	private UUID codigo;
	@Column (name = "nombre")
	private String nombre;
}
