package fr.onepoint.hubrh.service;

import java.util.List;
import fr.onepoint.hubrh.model.Collaborateur;

public interface ICollaborateurService {

	List<Collaborateur> findAll();
	int setFixedPrenom(String prenom, int id);

}