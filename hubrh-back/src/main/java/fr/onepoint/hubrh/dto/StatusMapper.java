package fr.onepoint.hubrh.dto;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

import fr.onepoint.hubrh.model.Status;

@Mapper(unmappedTargetPolicy = ReportingPolicy.ERROR, componentModel = "spring")
public interface StatusMapper {
	@Mapping(target = "pkIdStatus")
	CollaborateurDto to(Status status);

	List<StatusDto> to(List<Status> status);

	@InheritInverseConfiguration
	@Mapping(target = "pkIdStatus", ignore = true)
	Status create(StatusDto status);
}
