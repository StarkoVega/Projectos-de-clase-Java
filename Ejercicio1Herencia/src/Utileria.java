public class Utileria {
  public static double leerInput(double a, String prompt){
    double input;
    while (true) {
      try {
        input = Double.parseDouble(System.console().readLine(prompt));
        if (input <= a) input = 1/0;
        return input;
      } catch (Exception e) {
        System.out.println("Input invalido");
      }
    }
  }

  public static int leerInput(int min, int max, String prompt) {
    int input;
    while (true) {
      try {
        input = Integer.parseInt(System.console().readLine(prompt));
        if (input < min || input > max) input = 1/0;
        return input;
      } catch (Exception e) {
        System.out.println("Input invalido");
      }
    }
  }
}
