public class ManutentionnaireRisque extends  Manutentionnaire{

    public ManutentionnaireRisque(String prenom, String nom, int age, String dateEntree, double nbrHeur){
        super(prenom, nom, age, dateEntree, nbrHeur);
    }
    @Override

    //'super' permert d'aller cherche dans sa class mére la méthode calculerSalaire (manutentionnaire)
    public double calculerSalair(){
        return super.calculerSalair() + 200;
    }
}
