import java.util.Scanner;

public class Articulo {
    private String articulo;
    private double precio, total, subtotal, descuento;
    private int cantidad;
    private Scanner leer = new Scanner(System.in);
    public Articulo() {
        this.articulo = "";
        this.precio = 0;
        this.total = 0;
        this.subtotal = 0;
        this.descuento = 0;
        this.cantidad = 0;
    }
    public void setArticulo(String mensaje) {
        System.out.println(mensaje);
        this.articulo = leer.nextLine();
    }
    public void setPrecio(String mensaje) {
        System.out.println(mensaje);
        this.precio = leer.nextDouble();
    }
    public void setCantidad(String mensaje) {
        System.out.println(mensaje);
        this.cantidad = leer.nextInt();
    }
    public void setTotal() {
        this.total = subtotal - descuento;
    }
    public void setSubtotal() {
        this.subtotal = precio * cantidad;
    }
    public void setDescuento() {
        if(cantidad >= 5) this.descuento = subtotal * 0.05;
    }
    public String getArticulo() {
        return this.articulo;
    }
    public double getSubtotal() {
        return this.subtotal;
    }
    public double getTotal() {
        return this.total;
    }
}
