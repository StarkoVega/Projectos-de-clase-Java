public class CircularFigure {
  protected double radio, altura, volumen;
  protected double PI = Math.PI;
  public void setRadio() {
    this.radio = Utileria.leerInput(0.0, "Escriba el radio : ");
  }
  public void setAltura() {
    this.altura = Utileria.leerInput(0.0, "Escriba la altura : ");
  }
  public double getVolumen() {
    return this.volumen;
  }
}
