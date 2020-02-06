package fr.onepoint.hubrh.dto;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

import fr.onepoint.hubrh.model.Collaborateur;

@Mapper(unmappedTargetPolicy = ReportingPolicy.ERROR, componentModel = "spring")
public interface CollaborateurMapper {

	@Mapping(target = "id")
	CollaborateurDto to(Collaborateur collaborateur);

	List<CollaborateurDto> to(List<Collaborateur> collaborateur);

	@InheritInverseConfiguration
	@Mapping(target = "id", ignore = true)
	Collaborateur create(CollaborateurDto collaborateur);

}
