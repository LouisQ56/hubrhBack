package fr.onepoint.hubrh.service;

import fr.onepoint.hubrh.model.Collaborateur;
import fr.onepoint.hubrh.repository.CollaborateurRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import lombok.var;

@Service
public class CollaborateurService implements ICollaborateurService {

    @Autowired
    private CollaborateurRepository repository;

    public List<Collaborateur> findAll() {
    	return (List<Collaborateur>) repository.findAll();
    }
    
    public 	int setFixedPrenom(String prenom, int id) {
    	return repository.setFixedPrenomFor(prenom, id);
    }

}