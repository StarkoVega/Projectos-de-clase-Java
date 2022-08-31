public class Compra {
    public Compra() {
        this.nombre = "";
        this.tipoCliente = 0;
        this.cantidadHojas = 0;
        this.precioHoja = 0;
        this.subtotal = 0;
        this.descuento = 0;
        this.total = 0;
    }
    private String nombre;
    private int tipoCliente, cantidadHojas;
    private double precioHoja, subtotal, total, descuento;
    public void setNombre() {
        this.nombre = Utilidades.leerString("Nombre del cliente: ");
    }
    public void setTipoCliente() {
        this.tipoCliente = Utilidades.leerInt("Tipo de cliente: ");
    }
    public void setCantidadHojas() {
        this.cantidadHojas = Utilidades.leerInt("Cantidad de hojas compradas: ");
    }
    public void setPrecioHoja() {
        this.precioHoja = Utilidades.leerDouble("Precio por hoja: $");
    }
    public void setSubtotal() {
        this.subtotal = cantidadHojas * precioHoja;
    }
    public void setDescuento() {
        switch (tipoCliente) {
            case 1 :
                this.descuento = subtotal * 0.05;
                break;
            case 2:
                this.descuento = subtotal * 0.08;
                break;
            case 3:
                this.descuento = subtotal * 0.12;
                break;
            case 4:
                this.descuento = subtotal * 0.15;
                break;
            default:
                System.out.println(tipoCliente + " no es un tipo de cliente valido, por lo que no se aplicara ningun descuento");
        }
    }
    public void setTotal() {
        this.total = subtotal - descuento;
    }
    public String getNombre() {
        return nombre;
    }
    public double getSubtotal() {
        return subtotal;
    }
    public double getTotal() {
        return total;
    }
    public double getDescuento() {
        return descuento;
    }
    
}
