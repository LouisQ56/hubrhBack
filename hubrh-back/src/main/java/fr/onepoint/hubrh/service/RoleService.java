package fr.onepoint.hubrh.service;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.onepoint.hubrh.model.Role;
import fr.onepoint.hubrh.repository.RoleRepository;

@Service
public class RoleService {
	@Autowired
	private RoleRepository repository;
	protected EntityManager em;
    public RoleService(EntityManager em) {
        this.em = em;
    }
    
    public List<Role> findAll() {
		return (List<Role>) repository.findAll();
	}
}
