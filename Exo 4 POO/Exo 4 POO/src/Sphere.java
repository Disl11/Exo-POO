public class Sphere extends Cercle{

    public Sphere (double Rayon){
        super(Rayon);
    }

    public Sphere(double Rayon, double x, double y, double z){
        super(Rayon, x, y, z);
    }

    public double volume(){
        return (4.0 / 3.0) * Math.PI * Math.pow(getRayon(), 3);
    }

    @Override
    public String getDescription(){
        return super.getDescription() + " <|--- Sphere";
    }

    @Override
    public String toString(){
        return super.toString() + " (Sphère)";
    }
}
