package fr.onepoint.hubrh.dto;

import fr.onepoint.hubrh.model.Role;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-02-10T11:57:49+0100",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 1.8.0_241 (Oracle Corporation)"
)
@Component
public class RoleMapperImpl implements RoleMapper {

    @Override
    public RoleDto to(Role role) {
        if ( role == null ) {
            return null;
        }

        RoleDto roleDto = new RoleDto();

        roleDto.setPkIdRole( role.getPkIdRole() );
        roleDto.setName( role.getName() );

        return roleDto;
    }

    @Override
    public List<RoleDto> to(List<Role> role) {
        if ( role == null ) {
            return null;
        }

        List<RoleDto> list = new ArrayList<RoleDto>( role.size() );
        for ( Role role1 : role ) {
            list.add( to( role1 ) );
        }

        return list;
    }

    @Override
    public Role create(RoleDto role) {
        if ( role == null ) {
            return null;
        }

        Role role1 = new Role();

        role1.setName( role.getName() );

        return role1;
    }
}
