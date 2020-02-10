package fr.onepoint.hubrh.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import fr.onepoint.hubrh.model.Status;

@Repository
public interface StatusRepository extends JpaRepository<Status, Long> {
	@Query("select s from status s where s.name = ?1")
	List<Status> find(String name);
}
