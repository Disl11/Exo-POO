public class ProducteurRisque extends Producteur {

    public ProducteurRisque(String prenom, String nom, int age, String dateEntree, double nombreUnitée){
        super(prenom, nom, age, dateEntree, nombreUnitée);
    }

    //'super' permert d'aller cherche dans sa class mére la méthode calculerSalaire(Producteur)
    @Override
    public double calculerSalair(){
        return super.calculerSalair() + 200;
    }
}
