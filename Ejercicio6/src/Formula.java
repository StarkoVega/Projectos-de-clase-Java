public class Formula {
    private double x, y, z, w, f, b;

    public Formula() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
        this.w = 0;
        this.b = 0;
        this.f = 0;
    }

    public void setX() {
        this.x = Utilidades.leerDouble("X : ");
    }

    public void setY() {
        this.y = Utilidades.leerDouble("Y : ");
    }

    public void setZ() {
        this.z = Utilidades.leerDouble("Z : ");
    }

    public void setW() {
        this.w = Utilidades.leerDouble("W : ");
    }

    public void setB() {
        this.b = Utilidades.leerDouble("B : ");
    }
    
    public void setF() {
        this.f = Math.pow((4 * Math.pow(this.x, 2) * Math.pow(this.y, 2) * 2 * this.z * this.w),2) / ((4 * Math.pow(this.x, 1.0/2.0)) / Math.pow(this.b, 3.0/4.0));
    }

    public double getF() {
        return this.f;
    }
}
