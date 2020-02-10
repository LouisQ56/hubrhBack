package fr.onepoint.hubrh.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import fr.onepoint.hubrh.model.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long>{
	@Query("select r from role r where r.name = ?1")
	List<Role> find(String name);
}
