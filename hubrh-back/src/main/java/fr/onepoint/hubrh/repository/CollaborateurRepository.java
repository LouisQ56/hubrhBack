package fr.onepoint.hubrh.repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import fr.onepoint.hubrh.model.Collaborateur;

@Repository
public interface CollaborateurRepository extends JpaRepository<Collaborateur, Long> {

	List<Collaborateur> findByEmail(String email);
	
	@Query("select c from collaborateur c where c.name = ?1 AND c.firstname = ?2 ")
	List<Collaborateur> find(String nom, String prenom);
	
	@Modifying
	@Transactional
	@Query("update collaborateur u set u.name = ?1 where u.id = ?2")
	int setFixedName(String change, int id);
	
	@Modifying
	@Transactional
	@Query("update collaborateur u set u.firstname = ?1 where u.id = ?2")
	int setFixedFirstname(String change, int id);
	
	@Modifying
	@Transactional
	@Query("update collaborateur u set u.email = ?1 where u.id = ?2")
	int setFixedEmail(String change, int id);
	
	@Modifying
	@Transactional
	@Query("update collaborateur u set u.cv = ?1 where u.id = ?2")
	int setFixedCv(String change, int id);
	
	@Modifying
	@Transactional
	@Query("update collaborateur u set u.comment = ?1 where u.id = ?2")
	int setFixedComment(String change, int id);
	
	@Modifying
	@Transactional
	@Query("update collaborateur u set u.isProvider = ?1 where u.id = ?2")
	int setFixedIsProvider(boolean change, int id);
	
	@Modifying
	@Transactional
	@Query("update collaborateur u set u.arrivalDateOp = ?1 where u.id = ?2")
	int setFixedArrivalDateOp(Date change, int id);
	
	@Modifying
	@Transactional
	@Query("update collaborateur u set u.leftDateOp = ?1 where u.id = ?2")
	int setFixedLeftDateOp(Date change, int id);
	
	@Modifying
	@Transactional
	@Query("update collaborateur u set u.fkIdStatus = ?1 where u.id = ?2")
	int setFixedFkIdStatus(int change, int id);
	
	@Modifying
	@Transactional
	@Query("update collaborateur u set u.deleted = ?1 where u.id = ?2")
	int setFixedDeleted(boolean change, int id);
    
}
