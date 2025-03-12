
public class Main {
    public static void main(String[] args) {

        final Staff monEmployer = new Staff();
        monEmployer.add(new Vendeur("Pierre", "Business", 45, "1995", 30000));
        monEmployer.add(new Représentant("Léon", "Ventout", 25, "2001", 20000));
        monEmployer.add(new Producteur("Yves", "Ahalouest", 28, "1998", 1000));
        monEmployer.add(new Manutentionnaire("Jeanne", "Stoktout", 32, "1998", 45));
        monEmployer.add(new ProducteurRisque("Jean", "Flippe", 28, "2000", 1000));
        monEmployer.add(new ManutentionnaireRisque("Al", "Abordage", 30, "2001", 45));

        monEmployer.afficherSalaires();

        monEmployer.afficherMoyenneSalaire();


    }
}