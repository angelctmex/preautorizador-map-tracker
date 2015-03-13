package zeus.preaut.tracker.service;

import zeus.preaut.tracker.dto.ResponseDto;
import zeus.preaut.tracker.dto.TrackPositionDto;

public interface PointsTrackerService {

    ResponseDto saveTrackPosition(TrackPositionDto trackPositionDto);

}
