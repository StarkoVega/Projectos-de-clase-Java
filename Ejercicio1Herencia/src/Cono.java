public class Cono extends CircularFigure {
  private double CONORATIO = 1.0 / 3.0;
  public void setVolumen() {
    volumen = CONORATIO * PI * radio * radio * altura;
  }
}
