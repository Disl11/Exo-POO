public class Main {
    public static void main(String[] args) {

        Triangle t = new Triangle(5,10);
        System.out.println(t.getDescription());
        System.out.println(t);
        System.out.println("Périmetre  = " + t.périmetre());
        System.out.println("Aire  = " + t.aire());
        System.out.println("---------------------");


        Carre C = new Carre(8,10);
        System.out.println(C.getDescription());
        System.out.println(C);
        System.out.println("Périmetre  = " + C.périmetre());
        System.out.println("Aire = " + C.aire());
        System.out.println("---------------------");

        Cercle cercle = new Cercle(5);
        System.out.println(cercle.getDescription());
        System.out.println(cercle);
        System.out.println("Circonference = " + cercle.périmetre());
        System.out.println("Aire = " + cercle.aire());
        System.out.println("---------------------");

    }
}