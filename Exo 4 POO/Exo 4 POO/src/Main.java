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


        Cube cube =  new Cube(8,8,8);
        System.out.println(cube.getDescription());
        System.out.println(cube);
        System.out.println("Périmetre  = " + cube.périmetre());
        System.out.println("Aire  = " + cube.aire());
        System.out.println("Volume = " + cube.Volume());
        System.out.println("---------------------");


        Sphere s = new Sphere(5);
        System.out.println(s.getDescription());
        System.out.println(s);
        System.out.println("Volume = " + s.volume());
        System.out.println("---------------------");
    }
}