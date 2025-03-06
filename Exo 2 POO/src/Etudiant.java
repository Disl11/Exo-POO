public class Etudiant {

            int ID;
            String Nom;
            String Note;


        public Etudiant(){
            this(0,"Anonyme","None");
        }

        public Etudiant(int ID, String Nom, String Note){
            this.ID = ID;
            this.Nom = Nom;
            this.Note = Note;

    }
}
