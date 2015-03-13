package zeus.preaut.tracker.rest.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zeus.preaut.tracker.dto.ResponseDto;
import zeus.preaut.tracker.dto.TrackPositionDto;
import zeus.preaut.tracker.rest.TrackPositionService;
import zeus.preaut.tracker.service.PointsTrackerService;

@Service("trackPositionService")
public class TrackPositionServiceImpl implements TrackPositionService{

    @Autowired
    private PointsTrackerService cordenadaService;

    public ResponseDto newTrackPosition(TrackPositionDto trackPositionDto) {
        return cordenadaService.saveTrackPosition(trackPositionDto);
    }
}
