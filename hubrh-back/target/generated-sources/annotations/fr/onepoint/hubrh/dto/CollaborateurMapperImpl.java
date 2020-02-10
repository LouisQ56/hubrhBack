package fr.onepoint.hubrh.dto;

import fr.onepoint.hubrh.model.Collaborateur;
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
public class CollaborateurMapperImpl implements CollaborateurMapper {

    @Override
    public CollaborateurDto to(Collaborateur collaborateur) {
        if ( collaborateur == null ) {
            return null;
        }

        CollaborateurDto collaborateurDto = new CollaborateurDto();

        collaborateurDto.setId( collaborateur.getId() );
        collaborateurDto.setName( collaborateur.getName() );
        collaborateurDto.setFirstname( collaborateur.getFirstname() );
        collaborateurDto.setEmail( collaborateur.getEmail() );
        collaborateurDto.setComment( collaborateur.getComment() );
        collaborateurDto.setCv( collaborateur.getCv() );
        collaborateurDto.setProvider( collaborateur.isProvider() );
        collaborateurDto.setArrivalDateOp( collaborateur.getArrivalDateOp() );
        collaborateurDto.setLeftDateOp( collaborateur.getLeftDateOp() );
        collaborateurDto.setFkIdStatus( collaborateur.getFkIdStatus() );
        collaborateurDto.setDeleted( collaborateur.isDeleted() );
        collaborateurDto.setFkIdRole( collaborateur.getFkIdRole() );

        return collaborateurDto;
    }

    @Override
    public List<CollaborateurDto> to(List<Collaborateur> collaborateur) {
        if ( collaborateur == null ) {
            return null;
        }

        List<CollaborateurDto> list = new ArrayList<CollaborateurDto>( collaborateur.size() );
        for ( Collaborateur collaborateur1 : collaborateur ) {
            list.add( to( collaborateur1 ) );
        }

        return list;
    }

    @Override
    public Collaborateur create(CollaborateurDto collaborateur) {
        if ( collaborateur == null ) {
            return null;
        }

        Collaborateur collaborateur1 = new Collaborateur();

        collaborateur1.setName( collaborateur.getName() );
        collaborateur1.setFirstname( collaborateur.getFirstname() );
        collaborateur1.setEmail( collaborateur.getEmail() );
        collaborateur1.setCv( collaborateur.getCv() );
        collaborateur1.setComment( collaborateur.getComment() );
        collaborateur1.setProvider( collaborateur.isProvider() );
        collaborateur1.setArrivalDateOp( collaborateur.getArrivalDateOp() );
        collaborateur1.setLeftDateOp( collaborateur.getLeftDateOp() );
        collaborateur1.setFkIdStatus( collaborateur.getFkIdStatus() );
        collaborateur1.setDeleted( collaborateur.isDeleted() );
        collaborateur1.setFkIdRole( collaborateur.getFkIdRole() );

        return collaborateur1;
    }
}
