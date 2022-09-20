public class Compacto extends Vehiculo {

  public Compacto(double costoProduccion, String modelo, String descripcion) {
    super(costoProduccion, modelo, descripcion);
  }
  public void setUtilidad() {
    super.setUtilidad();
  }
  public void setImpuesto() {
    super.setImpuesto();
  }
  public void setImportacion() {
    super.setImportacion();
  }
  public void setPrecioVenta() {
    super.setPrecioVenta();
  }
  public double getCostoProduccion() {
    return super.getCostoProduccion();
  }
  public double getUtilidad() {
    return super.getUtilidad();
  }
  public double getImpuesto() {
    return super.getImpuesto();
  }
  public double getImportacion() {
    return super.getImportacion();
  }
  public double getPrecioVenta() {
    return super.getPrecioVenta();
  }
  public String getModelo() {
    return super.getModelo();
  }
  public String getDescripcion() {
    return super.getDescripcion();
  }

  @Override
  public double calcularUtilidad() {
    return super.getCostoProduccion() * 1.2;
  }

  @Override
  public double calcularImportacion() {
    return (super.getCostoProduccion() + super.getUtilidad()) * 0.05;
  }
  
}
