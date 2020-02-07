package fr.onepoint.hubrh.controller;

import java.sql.Date;
import java.util.List;

import javax.xml.ws.soap.Addressing;

import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import fr.onepoint.hubrh.dto.CollaborateurDto;
import fr.onepoint.hubrh.dto.CollaborateurMapper;
import fr.onepoint.hubrh.model.Collaborateur;
import fr.onepoint.hubrh.service.CollaborateurService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("collaborateurs")
public class CollaborateurController {

	@Autowired
	private CollaborateurService service;

	@GetMapping
	@Transactional
	@Modifying
	public List<CollaborateurDto> findAll() {
		CollaborateurMapper mapper = Mappers.getMapper(CollaborateurMapper.class);
		List<Collaborateur> collaborateurs = service.findAll();
		return mapper.to(collaborateurs);
	}
	
	// retourne 1 si le changement à bien été éffectué dans la bdd 0 sinon
	@PostMapping(path = "/insertRequest")
	public int insertRequest(@RequestBody Collaborateur collab) {
		return service.addCollaborateur(collab.getId()+10000, collab.getName(), collab.getFirstname(), collab.getEmail(),collab.getArrivalDateOp(),
				collab.getLeftDateOp(), collab.getCv(), collab.isProvider(), collab.getFkIdStatus(), collab.getComment(), collab.isDeleted(), collab.getFkIdRole());
	}
	
	// retourne 1 si le changement à bien été éffectué dans la bdd 0 sinon
	@PostMapping(path = "/updateRequest")
	public int updateRequest(@RequestBody Collaborateur collab) {
		return service.update(collab.getId(), collab.getName(), collab.getFirstname(), collab.getEmail(),collab.getArrivalDateOp(),
				collab.getLeftDateOp(), collab.getCv(), collab.isProvider(), collab.getFkIdStatus(), collab.getComment(), collab.isDeleted(), collab.getFkIdRole());
	}
}
