public class Manutentionnaire extends Employer{

    private double nbrHeur ;

    public Manutentionnaire(String prenom, String nom, int age, String dateEntree, double nbrHeur){
        super(prenom, nom, age, dateEntree);
        this.nbrHeur = nbrHeur;
    }

    @Override
    public double calculerSalair(){
        return nbrHeur * 65;
    }
}
