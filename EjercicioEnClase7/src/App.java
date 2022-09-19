public class App {
    public static void main(String[] args) throws Exception {
        double subtotal = 0, total = 0;
        int k = Integer.parseInt(System.console().readLine("Escriba cuantos articulos desea capturar: "));
        Articulo objArt[] = new Articulo[k];
        for (int i = 0; i < k; i++){
            objArt[i] = new Articulo();
            objArt[i].setArticulo("Escriba el nombre o descripcion del articulo: ");
            objArt[i].setCantidad("Escriba la cantidad de articulos: ");
            objArt[i].setPrecio("Escriba el precio del articulo: ");
            objArt[i].setSubtotal();
            objArt[i].setDescuento();
            objArt[i].setTotal();
            System.out.println("Subtotal   : $" + objArt[i].getSubtotal());
            System.out.println("Total neto : $" + objArt[i].getTotal());
            subtotal += objArt[i].getSubtotal();
            total += objArt[i].getTotal();
        }
        System.out.println("Subtotal a pagar   : $" + subtotal);
        System.out.println("Total neto a pagar : $" + total);
    }
}
