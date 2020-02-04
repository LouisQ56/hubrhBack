package fr.onepoint.hubrh.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import fr.onepoint.hubrh.model.Collaborateur;

@Repository
public interface CollaborateurRepository extends JpaRepository<Collaborateur, Long> {

	List<Collaborateur> findByMail(String email);
	
	@Query("select c from collaborateur c where c.nom = ?1 AND c.prenom = ?2 ")
	List<Collaborateur> find(String nom, String prenom);
	
	@Modifying
    @Query("update collaborateur c set c.prenom = ?1 where c.id = ?2")
    int setFixedPrenomFor(String prenom, int id);
	
}
