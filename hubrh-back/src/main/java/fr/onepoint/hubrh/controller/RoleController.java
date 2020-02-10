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

import fr.onepoint.hubrh.dto.RoleDto;
import fr.onepoint.hubrh.dto.RoleMapper;
import fr.onepoint.hubrh.model.Role;
import fr.onepoint.hubrh.service.RoleService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("roles")

public class RoleController {
	@Autowired
	private RoleService service;
	
	@GetMapping
	@Transactional
	@Modifying
	public List<RoleDto> findAll() {
		RoleMapper mapper = Mappers.getMapper(RoleMapper.class);
		List<Role> role = service.findAll();
		return mapper.to(role);
	}
}
