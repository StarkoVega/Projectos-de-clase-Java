public abstract class Vehiculo {
  private double costoProduccion, utilidad, impuesto, importacion, precioVenta;
  private String modelo, descripcion;
  public Vehiculo(double costoProduccion, String modelo, String descripcion) {
    this.costoProduccion = costoProduccion;
    this.modelo = modelo;
    this.descripcion = descripcion;
  }
  public abstract double calcularUtilidad();
  public void setUtilidad() {
    this.utilidad = this.calcularUtilidad();
  }
  public void setImpuesto() {
    this.impuesto = (costoProduccion + utilidad) * 0.16;
  }
  public abstract double calcularImportacion();
  public void setImportacion() {
    this.importacion = this.calcularImportacion();
  }
  public void setPrecioVenta() {
    this.precioVenta = costoProduccion + utilidad + impuesto + importacion;
  }
  public double getCostoProduccion() {
    return costoProduccion;
  }
  public double getUtilidad() {
    return utilidad;
  }
  public double getImpuesto() {
    return impuesto;
  }
  public double getImportacion() {
    return importacion;
  }
  public double getPrecioVenta() {
    return precioVenta;
  }
  public String getModelo() {
    return modelo;
  }
  public String getDescripcion() {
    return descripcion;
  }
  
}
