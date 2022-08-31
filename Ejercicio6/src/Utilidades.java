public class Utilidades {
    public static double leerDouble(String prompt) {
        double input = Double.parseDouble(System.console().readLine(prompt));
        return input;
    }
}
