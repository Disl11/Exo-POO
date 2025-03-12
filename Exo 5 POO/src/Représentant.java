public class Représentant extends Employer{

    private double chiffreAffaireReprésentant;

    public Représentant(String prenom, String nom, int age, String dateEntree, double chiffreAffaireReprésentant){
        super(prenom, nom, age, dateEntree);
        this.chiffreAffaireReprésentant = chiffreAffaireReprésentant;
    }

    @Override
    public double calculerSalair(){
        return chiffreAffaireReprésentant * 0.20 + 800;
    }
}
