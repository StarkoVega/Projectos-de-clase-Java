public class Temperatura {
  private double celsius;
  private double farenheit;
  private final double CELSIUSTOFARENHEITRATIO = 9 / 5;
  public Temperatura(double celsius) {
    this.celsius = celsius;
  }
  public void calcularFarenheit() {
    this.farenheit = celsius * CELSIUSTOFARENHEITRATIO + 32;
  }
  public double obtenerFarenheit() {
    return farenheit;
  }
}
