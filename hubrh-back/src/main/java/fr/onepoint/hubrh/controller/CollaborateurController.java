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
		//service.addCollaborateur(1000, "truc", "muche", "truc@muche.fr", new Date(2131), new Date(2131), "blabla", true, 45, "hghghghghg", false);
		CollaborateurMapper mapper = Mappers.getMapper(CollaborateurMapper.class);
		List<Collaborateur> collaborateurs = service.findAll();
		return mapper.to(collaborateurs);
	}
	
	// retourne 1 si le changement à bien été éffectué dans la bdd 0 sinon
		@PostMapping(path = "/bigChange")
		public String bigChange(@RequestBody Collaborateur collab) {
			System.out.println("TEST DE QUALIIITE");
			System.out.println(collab.getId());
			System.out.println(collab.getName());
			System.out.println(collab.getFirstname());
			System.out.println(collab.getComment());
			System.out.println(collab.getEmail());

			System.out.println(collab.getCv());
			System.out.println(collab.isProvider());
			System.out.println(collab.getArrivalDateOp());
			System.out.println(collab.getLeftDateOp());
			System.out.println(collab.getFkIdStatus());
			System.out.println(collab.isDeleted());
			
			service.addCollaborateur(collab.getId()+10000, collab.getName(), collab.getFirstname(), collab.getEmail(),collab.getArrivalDateOp(),
					collab.getLeftDateOp(), collab.getCv(), collab.isProvider(), collab.getFkIdStatus(), collab.getComment(), collab.isDeleted());
			return "TEST DE QUALIIITE";
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
