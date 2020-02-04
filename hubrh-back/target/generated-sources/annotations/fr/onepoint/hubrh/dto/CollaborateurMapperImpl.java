package fr.onepoint.hubrh.dto;

import fr.onepoint.hubrh.model.Collaborateur;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-02-04T13:18:49+0100",
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

        collaborateurDto.setName( collaborateur.getNom() );
        collaborateurDto.setFirstname( collaborateur.getPrenom() );
        collaborateurDto.setEmail( collaborateur.getMail() );
        collaborateurDto.setId( collaborateur.getId() );
        collaborateurDto.setCommentaire( collaborateur.getCommentaire() );
        collaborateurDto.setCv( collaborateur.getCv() );
        collaborateurDto.setPrestataire( collaborateur.isPrestataire() );
        collaborateurDto.setDateEntreeOp( collaborateur.getDateEntreeOp() );
        collaborateurDto.setDateSortieOp( collaborateur.getDateSortieOp() );
        collaborateurDto.setFkIdStatut( collaborateur.getFkIdStatut() );
        collaborateurDto.setDeleted( collaborateur.isDeleted() );

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

        collaborateur1.setMail( collaborateur.getEmail() );
        collaborateur1.setNom( collaborateur.getName() );
        collaborateur1.setPrenom( collaborateur.getFirstname() );
        collaborateur1.setCv( collaborateur.getCv() );
        collaborateur1.setCommentaire( collaborateur.getCommentaire() );
        collaborateur1.setPrestataire( collaborateur.isPrestataire() );
        collaborateur1.setDateEntreeOp( collaborateur.getDateEntreeOp() );
        collaborateur1.setDateSortieOp( collaborateur.getDateSortieOp() );
        collaborateur1.setFkIdStatut( collaborateur.getFkIdStatut() );
        collaborateur1.setDeleted( collaborateur.isDeleted() );

        return collaborateur1;
    }
}
