public class Funcion {
  private double x;
  private double y;
  public Funcion(double x) {
    this.x = x;
  }
  public void calcularY() {
    this.y = 3 * (x * x) + 7 * x - 15;
  }
  public double obtenerY() {
    return y;
  }
}
