public class Esfera extends CircularFigure {
  private double ESFERARATIO = 4.0 / 3.0;
  public void setVolumen() {
    volumen = ESFERARATIO * PI * radio * radio * radio;
  }
}
