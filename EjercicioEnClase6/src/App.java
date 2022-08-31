public class App {
    public static void main(String[] args) throws Exception {
        Compra objCompra = new Compra();
        objCompra.setNombre();
        objCompra.setTipoCliente();
        objCompra.setCantidadHojas();
        objCompra.setPrecioHoja();
        objCompra.setSubtotal();
        objCompra.setDescuento();
        objCompra.setTotal();
        System.out.println("Nombre del cliente: " + objCompra.getNombre() + 
        "\nSubtotal: $" + objCompra.getSubtotal() + "\nDescuento: $" + objCompra.getDescuento() +
        "\nTotal: $" + objCompra.getTotal());
    }
}
