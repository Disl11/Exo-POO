
public class Main {
    public static void main(String[] args) {


        Personnes p = new Personnes();

        Personnes p1 = new Personnes("Doe","John", 30,"Homme");
        Personnes p2 = new Personnes("Dupont","Marie", 25,"Femme");


        System.out.println("Personne 1 Nom : " +  p1.Nom);
        System.out.println("Personne 1 Prenom : " +  p1.Prenom);
        System.out.println("Personne 1 Age : " +  p1.Age);
        System.out.println("Personne 1 Sexe : " +  p1.Sexe);

        System.out.println("\n Les deux personnes ont-elles le même nom ? " + p1.sameLastName(p2));

        Personnes oldest = p1.oldest(p2);
        System.out.println("La personne la plus agé est : " +  oldest.getNom() +" "+ oldest.getPrenom() + " " + oldest.getAge() + " ans ");
    }
}