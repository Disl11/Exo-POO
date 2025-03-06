public class Cercle extends Figures{

    private double Rayon;

    public Cercle(double Rayon){
        super();
        this.Rayon = Rayon;
    }

    public Cercle(double Rayon, double x, double y, double z){
        super(x, y, z);
        this.Rayon = Rayon;
    }

    public double getRayon(){
        return Rayon;
    }

    @Override
    public double périmetre() {
        return 2 * Math.PI * this.Rayon;
    }

    @Override
    public double aire() {
        return Math.PI * Math.pow(Rayon,2);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "<|--- Cercle";
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.Rayon;
    }
}
