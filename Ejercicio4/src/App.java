public class App {
    public static void main(String[] args) throws Exception {
        double celsius = Double.parseDouble(System.console().readLine("Grados celsius: "));
        Temperatura objTemperatura = new Temperatura(celsius);
        objTemperatura.calcularFarenheit();
        System.out.println("Grados farenheit: " + objTemperatura.obtenerFarenheit());
    }
}
