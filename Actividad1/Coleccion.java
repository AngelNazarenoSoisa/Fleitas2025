package Principal;

import java.util.ArrayList;

public class Coleccion {
    private String nombreColeccion;
    private ArrayList<Figura> listaFiguras;

    public Coleccion(String nombreColeccion) {
        this.nombreColeccion = nombreColeccion;
        this.listaFiguras = new ArrayList<>();
    }

    public String getNombreColeccion() {
        return nombreColeccion;
    }

    public void setNombreColeccion(String nombreColeccion) {
        this.nombreColeccion = nombreColeccion;
    }

    public void añadirFigura(Figura fig) {
        listaFiguras.add(fig);
    }

    public void subirPrecio(double cantidad, String id) {
        for (Figura fig : listaFiguras) {
            if (fig.getCodigo().equals(id)) {
                fig.subirPrecio(cantidad);
                break;
            }
        }
    }

    public String conCapa() {
        StringBuilder sb = new StringBuilder();
        for (Figura fig : listaFiguras) {
            if (fig.getSuperheroe().isCapa()) {
                sb.append(fig).append("\n");
            }
        }
        return sb.toString();
    }

    public Figura masValioso() {
        if (listaFiguras.isEmpty()) return null;
        Figura max = listaFiguras.get(0);
        for (Figura fig : listaFiguras) {
            if (fig.getPrecio() > max.getPrecio()) {
                max = fig;
            }
        }
        return max;
    }

    public double getValorColeccion() {
        double total = 0;
        for (Figura fig : listaFiguras) {
            total += fig.getPrecio();
        }
        return total;
    }

    public double getVolumenColeccion() {
        double totalVolumen = 0;
        for (Figura fig : listaFiguras) {
            totalVolumen += fig.getDimensiones().getVolumen();
        }
        return totalVolumen + 200;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Colección: " + nombreColeccion + "\n");
        for (Figura fig : listaFiguras) {
            sb.append(fig).append("\n");
        }
        return sb.toString();
    }
}
