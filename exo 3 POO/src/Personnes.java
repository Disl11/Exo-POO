public class Personnes {


     String Nom;
     String Prenom;
     int Age = 0 ;
     String Sexe;

    public Personnes(){
        this("inconue", "inconue", 0 , "inconue");
    }

      public Personnes(String Nom, String Prenom, int Age, String genre) {
        this.Nom = Nom;
        this.Prenom = Prenom;
        this.Age = Age;
        this.Sexe = genre;

    }

    public String getNom() {
        return Nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public int getAge(){
        return Age;
    }
    public String getGenre(){
        return Sexe;
    }

    public boolean sameLastName(Personnes p){
        return this.Nom.equals(p.getNom());
    }

    public Personnes oldest(Personnes p) {
        if (this.Age > p.Age){
        return this;
    }else {
        return p;

        }
    }
}


