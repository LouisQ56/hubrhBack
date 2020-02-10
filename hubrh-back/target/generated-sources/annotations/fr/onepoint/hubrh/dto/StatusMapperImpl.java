package fr.onepoint.hubrh.dto;

import fr.onepoint.hubrh.model.Status;
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
public class StatusMapperImpl implements StatusMapper {

    @Override
    public StatusDto to(Status status) {
        if ( status == null ) {
            return null;
        }

        StatusDto statusDto = new StatusDto();

        statusDto.setPkIdStatus( status.getPkIdStatus() );
        statusDto.setName( status.getName() );

        return statusDto;
    }

    @Override
    public List<StatusDto> to(List<Status> status) {
        if ( status == null ) {
            return null;
        }

        List<StatusDto> list = new ArrayList<StatusDto>( status.size() );
        for ( Status status1 : status ) {
            list.add( to( status1 ) );
        }

        return list;
    }

    @Override
    public Status create(StatusDto status) {
        if ( status == null ) {
            return null;
        }

        Status status1 = new Status();

        status1.setName( status.getName() );

        return status1;
    }
}
