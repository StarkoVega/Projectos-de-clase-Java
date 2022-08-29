public class App {
    public static void main(String[] args) throws Exception {
        double x = Double.parseDouble(System.console().readLine("X: "));
        Funcion objFuncion = new Funcion(x);
        objFuncion.calcularY();
        System.out.println("Y = " + objFuncion.obtenerY());
    }
}
