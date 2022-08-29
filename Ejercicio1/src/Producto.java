public class Producto {
  private String descripcion;
  private double costoProduccion;
  private double precioVenta;
  private final double UTILIDADES = 2.2;
  private final double IVA = 1.15;
  public Producto(String descripcion, double costoProduccion) {
    this.descripcion = descripcion;
    this.costoProduccion = costoProduccion;
  }
  public void calcularPrecioVenta() {
    this.precioVenta = costoProduccion * UTILIDADES * IVA;
  }
  public String obtenerDescripcion() {
    return descripcion;
  }
  public double obtenerPrecioVenta() {
    return precioVenta;
  }
}
