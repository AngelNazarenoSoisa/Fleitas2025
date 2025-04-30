package Principal;

public class Figura {
    private String codigo;
    private double precio;
    private Superheroe superheroe;
    private Dimension dimensiones;

    public Figura(String codigo, double precio, Dimension dimensiones, Superheroe superheroe) {
        this.codigo = codigo;
        this.precio = precio;
        this.dimensiones = dimensiones;
        this.superheroe = superheroe;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Superheroe getSuperheroe() {
        return superheroe;
    }

    public void setSuperheroe(Superheroe superheroe) {
        this.superheroe = superheroe;
    }

    public Dimension getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(Dimension dimensiones) {
        this.dimensiones = dimensiones;
    }

    public void subirPrecio(double cantidad) {
        this.precio += cantidad;
    }

    @Override
    public String toString() {
        return "Código: " + codigo + ", Precio: " + precio + ", Superhéroe: [" + superheroe + "], Dimensiones: [" + dimensiones + "]";
    }
}