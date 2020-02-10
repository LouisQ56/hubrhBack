package fr.onepoint.hubrh.controller;

import java.util.List;

import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.onepoint.hubrh.dto.StatusDto;
import fr.onepoint.hubrh.dto.StatusMapper;
import fr.onepoint.hubrh.model.Status;
import fr.onepoint.hubrh.service.StatusService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("status")


public class StatusController {
	@Autowired
	private StatusService service;
	
	@GetMapping
	@Transactional
	@Modifying
	public List<StatusDto> findAll() {
		StatusMapper mapper = Mappers.getMapper(StatusMapper.class);
		List<Status> status = service.findAll();
		return mapper.to(status);
	}
}
