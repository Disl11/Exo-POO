import java.util.Random;

public class PoissonCarnivor extends Poisson{

    public PoissonCarnivor(String nom, String sexe){
        super(nom, sexe);
    }

    @Override
        public String manger(Object nourriture) {


        if (nourriture instanceof Algue) {
            System.out.println(getNom() + " ne mange pas d'algue, il est carnivore !");
        } else if (nourriture instanceof Poisson) {
            Poisson poisson = (Poisson) nourriture;
            System.out.println(getNom() + " mange " + poisson.getNom() + " !");
        }
        return null;
    }
}
