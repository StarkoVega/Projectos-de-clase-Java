public class App {
    public static void main(String[] args) throws Exception {
        Formula objFormula = new Formula();
        objFormula.setX();
        objFormula.setY();
        objFormula.setW();
        objFormula.setZ();
        objFormula.setB();
        objFormula.setF();
        System.out.println("F = " + objFormula.getF());
    }
}
