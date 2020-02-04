package fr.onepoint.hubrh.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity(name = "collaborateur")
public class Collaborateur {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column
	private String nom;
	@Column
	private String prenom;
	@Column
	private String mail;
	@Column
	private String cv;
	@Column
	private String commentaire;
	@Column(name = "is_prestataire")
	private boolean isPrestataire;
	@Column(name = "date_entree_op")
	private Date dateEntreeOp;
	@Column(name = "date_sortie_op")
	private Date dateSortieOp;
	@Column(name = "fk_id_statut")
	private Integer fkIdStatut;
	@Column(name = "deleted")
	private boolean Deleted;

}