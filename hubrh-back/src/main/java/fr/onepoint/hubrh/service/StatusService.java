package fr.onepoint.hubrh.service;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.onepoint.hubrh.model.Status;
import fr.onepoint.hubrh.repository.StatusRepository;

@Service
public class StatusService implements IStatusService {
	@Autowired
	private StatusRepository repository;
	protected EntityManager em;
    public StatusService(EntityManager em) {
        this.em = em;
    }
    
    public List<Status> findAll() {
		return (List<Status>) repository.findAll();
	}
}
