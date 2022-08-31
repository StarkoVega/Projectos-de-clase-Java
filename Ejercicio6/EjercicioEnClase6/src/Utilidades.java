public class Utilidades {
    public static String leerString(String prompt) {
        String input = System.console().readLine(prompt);
        return input;
    }
    public static int leerInt(String prompt) {
        int input = Integer.parseInt(System.console().readLine(prompt));
        return input;
    }
    public static double leerDouble(String prompt) {
        double input = Double.parseDouble(System.console().readLine(prompt));
        return input;
    }
}
