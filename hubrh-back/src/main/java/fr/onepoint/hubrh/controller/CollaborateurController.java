package fr.onepoint.hubrh.controller;

import java.sql.Date;
import java.util.List;

import javax.xml.ws.soap.Addressing;

import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import fr.onepoint.hubrh.dto.CollaborateurDto;
import fr.onepoint.hubrh.dto.CollaborateurMapper;
import fr.onepoint.hubrh.model.Collaborateur;
import fr.onepoint.hubrh.service.CollaborateurService;

@RestController
@RequestMapping("collaborateurs")
public class CollaborateurController {

	@Autowired
	private CollaborateurService service;

	@GetMapping
	public List<CollaborateurDto> findAll() {
		CollaborateurMapper mapper = Mappers.getMapper(CollaborateurMapper.class);
		List<Collaborateur> collaborateurs = service.findAll();
		return mapper.to(collaborateurs);
	}

	// retourne 1 si le changement à bien été éffectué dans la bdd 0 sinon
	@GetMapping(path = "/{change}_{column}_{id}")
	public String update(@PathVariable String change, @PathVariable String column, @PathVariable int id) {

		switch (column) {
		case "setFixedName":
			return "name : " + service.setFixedName(change, id);
		case "setFixedFirstname":
			return "FirstName : " + service.setFixedFirstname(change, id);
		case "setFixedEmail":
			return "name : " + service.setFixedEmail(change, id);
		case "setFixedComment":
			return "name : " + service.setFixedComment(change, id);
		default:
			return "Error";
		}
	}
/*
	// column est une date
	@GetMapping(path = "/{change}_{column}_{id}")
	public String update(@PathVariable Date change, @PathVariable String column, @PathVariable int id) {

		switch (column) {
		case "setFixedArrivalDateOp":
			return "name : " + service.setFixedArrivalDateOp(change, id);
		case "setFixedLeftDateOp":
			return "name : " + service.setFixedLeftDateOp(change, id);
		default:
			return "Invalid Date";
		}
	}*/
/*
	// column est un boolean
	@GetMapping(path = "/{change}_{column}_{id}")
	public String update(@PathVariable boolean change, @PathVariable String column, @PathVariable int id) {

		switch (column) {
		case "setFixedIsProvider":
			return "name : " + service.setFixedIsProvider(change, id);
		case "setFixedDeleted":
			return "name : " + service.setFixedDeleted(change, id);
		default:
			return "Error in boolean";
		}
	}*/
	/*
	// column est un int
	@GetMapping(path = "/{change}_{column}_{id}")
	public String update(@PathVariable int change, @PathVariable String column, @PathVariable int id) {

		switch (column) {
		case "setFixedFkIdStatus":
			return "name : " + service.setFixedFkIdStatus(change, id);
		default:
			return "Error In int";
		}
	}*/
}
