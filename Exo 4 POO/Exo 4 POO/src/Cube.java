public class Cube extends Carre{

    private double hauteur;

    public Cube(double longeur, double largeur, double hauteur){
        super(longeur,largeur);
        this.hauteur = hauteur;
    }

    public double getHauteur(){
        return hauteur;
    }

    public double Volume(){
        return  getLongeur() * getLargeur() * this.hauteur;
    }

    @Override
    public double périmetre(){
        return 4 * (getLongeur() + getLargeur() + this.hauteur);
    }

    @Override
    public double aire() {
        return 6 * (getLongeur() * getLargeur());
    }

    @Override
    public String getDescription(){
        return  super.getDescription() + " <|--- Cube";
    }

    @Override

    public  String toString(){
        return super.toString() + " " + this.hauteur ;
    }
}
