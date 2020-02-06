package fr.onepoint.hubrh.service;

import fr.onepoint.hubrh.model.Collaborateur;
import fr.onepoint.hubrh.repository.CollaborateurRepository;

import java.sql.Date;
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

	public int setFixedName(String change, int id) {
		return repository.setFixedName(change, id);
	}

	public int setFixedFirstname(String change, int id) {
		return repository.setFixedFirstname(change, id);
	}

	public int setFixedEmail(String change, int id) {
		return repository.setFixedEmail(change, id);
	}

	public int setFixedCv(String change, int id) {
		return repository.setFixedCv(change, id);
	}

	public int setFixedComment(String change, int id) {
		return repository.setFixedComment(change, id);
	}

	public int setFixedIsProvider(boolean change, int id) {
		return repository.setFixedIsProvider(change, id);
	}

	public int setFixedArrivalDateOp(Date change, int id) {
		return repository.setFixedArrivalDateOp(change, id);
	}

	public int setFixedLeftDateOp(Date change, int id) {
		return repository.setFixedLeftDateOp(change, id);
	}

	public int setFixedFkIdStatus(int change, int id) {
		return repository.setFixedFkIdStatus(change, id);
	}

	public int setFixedDeleted(boolean change, int id) {
		return repository.setFixedDeleted(change, id);
	}

}