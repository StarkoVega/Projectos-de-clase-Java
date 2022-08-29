public class App {
    public static void main(String[] args) throws Exception {
        String descripcion = System.console().readLine("Descripcion o nombre del producto: ");
        double costoProduccion = Double.parseDouble(System.console().readLine("Costo de produccion del producto: $"));
        Producto objProducto = new Producto(descripcion, costoProduccion);
        objProducto.calcularPrecioVenta();
        System.out.println("El precio de venta de " + objProducto.obtenerDescripcion() + " es $" +objProducto.obtenerPrecioVenta());
    }
}
