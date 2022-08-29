public class Producto {
    private String descripcion;
    private int produccion;
    private double costoProduccion;
    private final double FACTORDEMATERIALES = 3.5;
    private final int COSTOFIJO = 10700;
    public Producto(String descripcion, int produccion) {
        this.descripcion = descripcion;
        this.produccion = produccion;
    }
    public void calcularCostoProduccion() {
        this.costoProduccion = produccion * FACTORDEMATERIALES + COSTOFIJO;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public int getProduccion() {
        return produccion;
    }
    public double getCostoProduccion() {
        return costoProduccion;
    }
}
