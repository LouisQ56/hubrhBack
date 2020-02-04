package fr.onepoint.hubrh.dto;

import java.sql.Date;

import javax.persistence.Column;

import lombok.Data;

@Data
public class CollaborateurDto {
	private Integer id;
	
	private String name;
	private String firstname;
	private String email;
	private String commentaire;
	private String cv;
	private boolean isPrestataire;
	private Date dateEntreeOp;
	private Date dateSortieOp;
	private Integer fkIdStatut;
	private boolean isDeleted;

}