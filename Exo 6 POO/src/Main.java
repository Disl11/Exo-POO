public class Main {
    public static void main(String[] args) {

        Aquarium aquarium = new Aquarium();
        aquarium.ajouterPoisson("Mérou", "Mâle", true);
        aquarium.ajouterPoisson("Thon", "Femelle", true);
        aquarium.ajouterPoisson("Poisson-clown" ,"Mâle", true);
        aquarium.ajouterPoisson("Sole" , "Femelle" , false);
        aquarium.ajouterPoisson("Bar", "Mâle", false);
        aquarium.ajouterPoisson("Carpe" , "Femelle", false);

        aquarium.ajouterAlgue(new Algue());
        aquarium.ajouterAlgue(new Algue());


        aquarium.passerLeTemps();
        aquarium.actionManger();
    }
}