public class Main {
    public static void main(String[] args) {


        Etudiant etudiant =  new Etudiant();

        System.out.println("e1 ID: " + etudiant.ID);
        System.out.println("e1 Nom: " + etudiant.Nom);
        System.out.println("e1 Note: " + etudiant.Note);



        Etudiant etudiant1 = new Etudiant(101,"Alex", "B");

        System.out.println("Etudiant  ID : " + etudiant1.ID);
        System.out.println("Etudiant  Nom : " + etudiant1.Nom);
        System.out.println("Etudiant  Note : " + etudiant1.Note);
    }
}