package fr.onepoint.hubrh.controller;

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
    
    
    @GetMapping(path = "/{id}")
	public String test(@PathVariable String id) {
		return "ok  " + id;
	}

	@GetMapping(path = "/update")
	@Transactional
	public int update(@RequestParam String change,@RequestParam String ColumnToChange,@RequestParam Integer id) {
		return service.setFixedPrenom(change, 0 );
	}

}
