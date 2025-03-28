import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Aquarium {

    private List<Algue> algues;
    private List<Poisson> poissons;


    public Aquarium() {
        this.algues = new ArrayList<>();
        this.poissons = new ArrayList<>();
    }

    public void ajouterAlgue(Algue algue) {
        algues.add(new Algue());
    }

    public void ajouterPoisson(String nom, String sexe, boolean estCarnivor) {
        Poisson poisson;
        if (estCarnivor){
            poisson = new PoissonCarnivor(nom,sexe);
        } else {
            poisson = new PoissonHerbivores(nom, sexe);
        }
       poissons.add(poisson);
    }


    public void passerLeTemps() {
        System.out.println("Nombre d'algues : " + algues.size());
        System.out.println("Liste des poissons :");
        for (Poisson poisson : poissons) {
            System.out.println(poisson);
        }
    }

    public void actionManger() {

        for (Poisson poisson : poissons) {
            if (!algues.isEmpty()) {
                poisson.manger(algues.get(0));
                algues.remove(0);
            }
            if (poissons.size() > 1) {
                poisson.manger(poissons.get(1));

            }
        }
    }
}