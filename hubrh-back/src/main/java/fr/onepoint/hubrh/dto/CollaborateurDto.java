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
	private String comment;
	private String cv;
	private boolean isProvider;
	private Date arrivalDateOp;
	private Date leftDateOp;
	private Integer fkIdStatus;
	private boolean deleted;
	private Integer fkIdRole;

}