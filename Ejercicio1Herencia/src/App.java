public class App {
    public static void main(String[] args) throws Exception {
        while (true) {
            System.out.println("Elija un figura para calcular su volumen: \n 1. Cilindro\n 2. Cono\n 3. Esfera\n 0. Salir");
            int i = Utileria.leerInput(0, 3, "Escriba su eleccion: ");
            switch (i) {
                case 1:
                    Cilindro cilObj = new Cilindro();
                    cilObj.setRadio();
                    cilObj.setAltura();
                    cilObj.setVolumen();
                    System.out.println("Volumen del cilindro: " + cilObj.getVolumen());
                    continue;
                case 2:
                    Cono conoObj = new Cono();
                    conoObj.setRadio();
                    conoObj.setAltura();
                    conoObj.setVolumen();
                    System.out.println("Volumen del cono: " + conoObj.getVolumen());
                    continue;
                case 3:
                    Esfera esfObj = new Esfera();
                    esfObj.setRadio();
                    esfObj.setVolumen();
                    System.out.println("Volumen de la esfera: " + esfObj.getVolumen());
                    continue;
            }
            break;
        }
    }
}
