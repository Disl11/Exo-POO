import java.util.ArrayList;

//La classe Staff permet de gérer la collection des employés et d'afficher les informations
public class Staff {

    // creattion de l'attribue arraylist pour faire la liste des employer
    private ArrayList<Employer> employers;


    //Initialisation de la liste vide
    public Staff() {
        employers = new ArrayList<>();
    }

    //Méthode pour ajouter un employer a la collection
    public void add(Employer employer) {
        employers.add(employer);
    }


    //Méthode pour afficher les salaire de tout les employer
    public void afficherSalaires() {
        for (Employer employer : employers) {
            System.out.println("L'employé " + employer.getPrenom() + " " + employer.getNom() + " à un salaire de " + employer.calculerSalair() + " € ");
        }
    }
    public void afficherMoyenneSalaire(){
        double totalSalary = 0; // variable pour accumuler les salaire.
        for (Employer employer : employers) {
                totalSalary += employer.calculerSalair(); // Ajouter le salaire a chaque employer
        }

        double moyenneSalaire = totalSalary / employers.size(); // calcule la moyene des salaire.   le totale de tout le salaire diviser par le nombre d'employer
        System.out.println("Valeur du salaire moyen : " + moyenneSalaire + " € " );
    }
}
