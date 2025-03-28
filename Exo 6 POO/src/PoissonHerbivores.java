public class PoissonHerbivores extends Poisson {

    public PoissonHerbivores(String nom, String sexe){
        super(nom, sexe);
    }


    @Override
    public String manger(Object nourriture){
        if (nourriture instanceof Poisson) {
            System.out.println(getNom() + " ne mange pas d'autres poissons, il est herbivore !");
        } else if (nourriture instanceof Algue) {
            System.out.println(getNom() + " mange une algue !");
        }
        return null;
    }
}

