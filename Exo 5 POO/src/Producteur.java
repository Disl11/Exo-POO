public class Producteur extends Employer{

    private double nombreUnitée;

    public Producteur(String prenom, String nom, int age, String dateEntree, double nombreUnitée){
        super(prenom, nom, age, dateEntree);
        this.nombreUnitée = nombreUnitée;
    }

    @Override
    public double calculerSalair(){
        return nombreUnitée * 5 ;
    }
}
