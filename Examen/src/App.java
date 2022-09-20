import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String loop = "Continuar";
        while (loop.charAt(0) == 'C' || loop.charAt(0) == 'c') {
            System.out.println("Modelo del vehiculo: ");
            String modelo = read.readLine();
            System.out.println("Descripcion del vehiculo: ");
            String descripcion = read.readLine();
            System.out.println("Costo de Produccion del vehiculo: ");
            double costoProduccion = Double.parseDouble(read.readLine());
            System.out.println("Tipo de vehiculo\n  1-Compacto\n  2-De Lujo\n  3-Camioneta\n  4-Vagoneta");
            String tipo = read.readLine();
            switch (tipo) {
                case "1":
                    Compacto objComp = new Compacto(costoProduccion, modelo, descripcion);
                    objComp.setUtilidad();
                    objComp.setImpuesto();
                    objComp.setImportacion();
                    objComp.setPrecioVenta();
                    System.out.println("Modelo      : " + objComp.getModelo());
                    System.out.println("Descripcion : " + objComp.getDescripcion());
                    System.out.println("Costo de Produccion      : $" + objComp.getCostoProduccion());
                    System.out.println("Utilidades               : $" + objComp.getUtilidad());
                    System.out.println("Impuestos                : $" + objComp.getImpuesto());
                    System.out.println("Impuestos de exportacion : $" + objComp.getImportacion());
                    System.out.println("Precio de Venta          : $" + objComp.getPrecioVenta());
                    break;
                case "2":
                    Lujo objLujo = new Lujo(costoProduccion, modelo, descripcion);
                    objLujo.setUtilidad();
                    objLujo.setImpuesto();
                    objLujo.setImportacion();
                    objLujo.setPrecioVenta();
                    System.out.println("Modelo      : " + objLujo.getModelo());
                    System.out.println("Descripcion : " + objLujo.getDescripcion());
                    System.out.println("Costo de Produccion      : $" + objLujo.getCostoProduccion());
                    System.out.println("Utilidades               : $" + objLujo.getUtilidad());
                    System.out.println("Impuestos                : $" + objLujo.getImpuesto());
                    System.out.println("Impuestos de exportacion : $" + objLujo.getImportacion());
                    System.out.println("Precio de Venta          : $" + objLujo.getPrecioVenta());
                    break;
                case "3":
                    Camioneta objCamio = new Camioneta(costoProduccion, modelo, descripcion);
                    objCamio.setUtilidad();
                    objCamio.setImpuesto();
                    objCamio.setImportacion();
                    objCamio.setPrecioVenta();
                    System.out.println("Modelo      : " + objCamio.getModelo());
                    System.out.println("Descripcion : " + objCamio.getDescripcion());
                    System.out.println("Costo de Produccion      : $" + objCamio.getCostoProduccion());
                    System.out.println("Utilidades               : $" + objCamio.getUtilidad());
                    System.out.println("Impuestos                : $" + objCamio.getImpuesto());
                    System.out.println("Impuestos de exportacion : $" + objCamio.getImportacion());
                    System.out.println("Precio de Venta          : $" + objCamio.getPrecioVenta());
                    break;
                case "4":
                    Vagoneta objVago = new Vagoneta(costoProduccion, modelo, descripcion);
                    objVago.setUtilidad();
                    objVago.setImpuesto();
                    objVago.setImportacion();
                    objVago.setPrecioVenta();
                    System.out.println("Modelo      : " + objVago.getModelo());
                    System.out.println("Descripcion : " + objVago.getDescripcion());
                    System.out.println("Costo de Produccion      : $" + objVago.getCostoProduccion());
                    System.out.println("Utilidades               : $" + objVago.getUtilidad());
                    System.out.println("Impuestos                : $" + objVago.getImpuesto());
                    System.out.println("Impuestos de exportacion : $" + objVago.getImportacion());
                    System.out.println("Precio de Venta          : $" + objVago.getPrecioVenta());
                    break;
                default:
                    System.out.println(tipo + " no era una opcion.");
                    break;
            }
            System.out.println("(C)ontinuar o (S)alir");
            loop = read.readLine();
        }
    }
}
