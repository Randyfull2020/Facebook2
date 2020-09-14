package mx.com.randyfull8.facebook2;

public class Renglon {
    private String renglon;
    private String codigo;

    public Renglon(String renglon, String codigo) {
        this.renglon=renglon;
        this.codigo=codigo;
    }

    public Renglon() {

    }

    public Renglon(String renglon) {
        this.renglon = renglon;
    }

    public String getRenglon() {
        return renglon;
    }

    public void setRenglon(String renglon) {
        this.renglon = renglon;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
