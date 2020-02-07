package fr.onepoint.hubrh.service;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import fr.onepoint.hubrh.model.Collaborateur;

public interface ICollaborateurService {

	List<Collaborateur> findAll();
	int update(int id, String name, String firstname, String email, Date arrivalDateOp, Date leftDateOp,
			 String cv, boolean isProvider, int fkIdStatus, String comment, boolean deleted);
	int setFixedName(String change, int id);
	int setFixedFirstname(String change, int id);
	int setFixedEmail(String change, int id);
	int setFixedCv(String change, int id);
	int setFixedComment(String change, int id);
	int setFixedIsProvider(boolean change, int id);
	int setFixedArrivalDateOp(Date change, int id);
	int setFixedLeftDateOp(Date change, int id);
	int setFixedFkIdStatus(int change, int id);
	int setFixedDeleted(boolean change, int id);
	
	public int addCollaborateur(int id, String nom, String prenom, String mail, Date dateEntreeOp, Date dateSortieOp, String cv, boolean isPrestataire, int idStatut, String commentaire, boolean deleted);

}