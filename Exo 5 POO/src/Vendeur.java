public class Vendeur extends Employer{

    private double chiffreAffaireVendeur ;

    public Vendeur(String prenom, String nom, int age, String dateEntree, double chiffreAffaireVendeur){
        super(prenom, nom, age, dateEntree);
        this.chiffreAffaireVendeur = chiffreAffaireVendeur;
    }

    @Override
    public double calculerSalair(){
        return chiffreAffaireVendeur * 0.20 + 400;
    }
}
