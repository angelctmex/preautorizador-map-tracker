package zeus.preaut.tracker.service.impl;

import org.springframework.stereotype.Service;
import zeus.preaut.tracker.dto.ResponseDto;
import zeus.preaut.tracker.dto.TrackPositionDto;
import zeus.preaut.tracker.enums.ResponseEnum;
import zeus.preaut.tracker.service.PointsTrackerService;

@Service("cordenadaService")
public class PointsTrackerServiceImpl implements PointsTrackerService {

    public ResponseDto saveTrackPosition(TrackPositionDto positionDto) {
        System.out.println(positionDto.getLatitud());
        System.out.println(positionDto.getLongitud());
        System.out.println(positionDto.getIdCar());

        ResponseDto responseDto = new ResponseDto(ResponseEnum.OK);


        return responseDto;
    }
}
