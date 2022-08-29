public class Esfera {
  private final double PI = 3.1415;
  private double radio;
  private double area;
  private double volumen;
  public Esfera(double radio) {
    this.radio = radio;
  }
  public void calcularArea() {
    this.area = 4 * PI * (radio * radio);
  }
  public void calcularVolumen() {
    this.volumen = (4 * PI * Math.pow(radio, 3)) / 3;
  }
  public double obtenerArea() {
    return area;
  }
  public double obtenerVolumen() {
    return volumen;
  }
}
