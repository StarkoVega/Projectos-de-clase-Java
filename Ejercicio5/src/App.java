public class App {
    public static void main(String[] args) throws Exception {
        double radio = Double.parseDouble(System.console().readLine("Radio de la esfera: "));
        Esfera objEsfera = new Esfera(radio);
        objEsfera.calcularArea();
        objEsfera.calcularVolumen();
        System.out.println("Volumen de la esfera: " + objEsfera.obtenerVolumen() + "\nArea de la esfera: " + objEsfera.obtenerArea());
    }
}
