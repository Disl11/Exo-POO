public abstract class Poisson  {

    private String nom;
    private String sexe;

    public Poisson(String nom, String sexe){
        this.nom = nom;
        this.sexe = sexe;
    }

    public abstract String manger(Object nourriture);

        public String getNom() {
            return nom;
        }

        public String getSexe(){
        return sexe;
        }

        @Override
        public String toString(){
            return nom + " (" + sexe + ") ";
        }
    }

