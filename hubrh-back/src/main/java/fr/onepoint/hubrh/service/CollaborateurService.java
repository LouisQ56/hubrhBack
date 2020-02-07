package fr.onepoint.hubrh.service;

import fr.onepoint.hubrh.model.Collaborateur;
import fr.onepoint.hubrh.repository.CollaborateurRepository;

import java.sql.Date;
import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.var;

@Service
public class CollaborateurService implements ICollaborateurService {

	@Autowired
	private CollaborateurRepository repository;
	
	protected EntityManager em;
    public CollaborateurService(EntityManager em) {
        this.em = em;
    }

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
	
	@Modifying
	@Transactional
	public void addCollaborateur(int id, String nom, String prenom, String mail, Date dateEntreeOp, Date dateSortieOp, String cv, boolean isPrestataire, int idStatut, String commentaire, boolean deleted) {
        em.createNativeQuery("insert into collaborateur( name, first_name, email, arrival_date_op, left_date_op, cv, is_provider, fk_id_status, comment, deleted)"+" values( ?1, ?2,?3, ?4, ?5, ?6, ?7, ?8, ?9, ?10)")
        .setParameter(1, nom).setParameter(2, prenom).setParameter(3, mail).setParameter(4, dateEntreeOp).setParameter(5, dateSortieOp).setParameter(6, cv).setParameter(7, isPrestataire).setParameter(8, idStatut).setParameter(9, commentaire).setParameter(10, deleted)
        .executeUpdate();
    }

}