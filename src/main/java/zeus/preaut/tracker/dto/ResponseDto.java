package zeus.preaut.tracker.dto;

import zeus.preaut.tracker.enums.ResponseEnum;

public class ResponseDto {

    private int codigo;
    private String descripcion;

    public ResponseDto() {
    }

    public ResponseDto(ResponseEnum respuesta){
        this.codigo         = respuesta.getCodigo();
        this.descripcion    = respuesta.getDescripcion();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
