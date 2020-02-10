package fr.onepoint.hubrh.dto;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

import fr.onepoint.hubrh.model.Role;

@Mapper(unmappedTargetPolicy = ReportingPolicy.ERROR, componentModel = "spring")
public interface RoleMapper {
	@Mapping(target = "pkIdRole")
	RoleDto to(Role role);

	List<RoleDto> to(List<Role> role);

	@InheritInverseConfiguration
	@Mapping(target = "pkIdRole", ignore = true)
	Role create(RoleDto role);
}
