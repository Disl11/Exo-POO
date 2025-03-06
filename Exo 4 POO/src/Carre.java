public class Carre extends Figures{

    private double longeur;
    private double largeur;

    public Carre(double longeur, double largeur){
        super();
        this.longeur = longeur;
        this.largeur = largeur;
    }

    public Carre(double longeur,double largeur, double x, double y, double z){
        super(x,y,z);
        this.longeur = longeur;
        this.largeur = largeur;
    }

    public double getLongeur(){
        return longeur;
    }
    public  double getLargeur(){
        return largeur;
    }

    @Override
    public double périmetre() {
        return 2 * (this.longeur + this.largeur );
    }

    public  double aire(){
        return this.longeur * this.largeur;
    }

    public String  getDescription(){
        return super.getDescription() + "<|--- Carré";
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.longeur + " " + this.largeur;
    }
}
