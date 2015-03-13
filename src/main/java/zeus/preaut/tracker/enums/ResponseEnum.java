package zeus.preaut.tracker.enums;

public enum ResponseEnum {

    OK(1,"Todo OK"),ERROR(2,"ERROR");

    private int codigo;
    private String descripcion;

    ResponseEnum(int codigo, String descripcion){
        this.codigo         = codigo;
        this.descripcion    = descripcion;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
