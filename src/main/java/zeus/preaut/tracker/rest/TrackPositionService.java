package zeus.preaut.tracker.rest;

import zeus.preaut.tracker.dto.ResponseDto;
import zeus.preaut.tracker.dto.TrackPositionDto;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * @author Francisco Resendiz
 */
@Path("/Ruta/")
public interface TrackPositionService {

    @POST
    @Consumes({"application/json"})
    @Produces({"application/json"})
    ResponseDto newTrackPosition(TrackPositionDto trackPositionDto);

}
