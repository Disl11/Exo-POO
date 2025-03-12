public abstract class Employer {

    private String prenom;
    private String nom;
    private int age;
    private String dateEntree;


    public Employer(String prenom, String nom, int age, String dateEntree){
        this.prenom = prenom;
        this.nom = nom;
        this.age = age;
        this.dateEntree = dateEntree;

    }
    // calculateSalary() est abstraite car le calcul du salaire varie en fonction du type d'employé (Vendeur, Représentant, Producteur, etc.), et donc chaque sous-classe doit fournir sa propre implémentation.
    public abstract double calculerSalair();

    public String getPrenom() {
        return prenom;
    }

    public String getNom() {
        return nom;
    }

    public int getAge() {
        return age;
    }

    public String getDateEntree() {
        return dateEntree;
    }


}
