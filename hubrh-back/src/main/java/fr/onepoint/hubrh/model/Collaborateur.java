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

	@Column(name = "name")
	private String name;
	@Column(name = "first_name")
	private String firstname;
	@Column(name = "email")
	private String email;
	@Column(name = "cv")
	private String cv;
	@Column(name = "comment")
	private String comment;
	@Column(name = "is_provider")
	private boolean isProvider;
	@Column(name ="arrival_date_op")
	private Date arrivalDateOp;
	@Column(name ="left_date_op")
	private Date leftDateOp;
	@Column(name ="fk_id_status")
	private Integer fkIdStatus;
	@Column(name ="deleted")
	private boolean deleted;
	@Column(name ="fk_id_role")
	private Integer fkIdRole;

}