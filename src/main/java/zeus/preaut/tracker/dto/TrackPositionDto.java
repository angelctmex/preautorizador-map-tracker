package zeus.preaut.tracker.dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class TrackPositionDto {

    private String latitud;
    private String longitud;
    private String idCar;

    public TrackPositionDto() {
    }

    public TrackPositionDto(String latitud, String longitud, String idCar) {
        this.latitud        = latitud;
        this.longitud       = longitud;
        this.idCar          = idCar;
    }

    public String getLatitud() {
        return latitud;
    }

    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    public String getIdCar() {
        return idCar;
    }

    public void setIdCar(String idCar) {
        this.idCar = idCar;
    }
}
