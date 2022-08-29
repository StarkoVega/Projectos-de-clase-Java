public class App {
    public static void main(String[] args) throws Exception {
        String descripcion = System.console().readLine("Nombre o descripcion del producto: ");
        int produccion = Integer.parseInt(System.console().readLine("Cantidad a producir: "));
        Producto objpProducto = new Producto(descripcion, produccion);
        objpProducto.calcularCostoProduccion();
        System.out.println("Producir " + objpProducto.getProduccion() + " " + objpProducto.getDescripcion() + " costara : $" + objpProducto.getCostoProduccion());
    }
}
