public class Figures {

    private double x;
    private double y;
    private double z;


    public Figures(){
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    public Figures(double x,double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }


    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public double périmetre(){
        return 0.;
    }

    public double aire(){
        return 0.;
    }

    public double volume(){
        return 0.;
    }

    public String getDescription(){
        return "Figure";
    }
    @Override
    public String toString(){
        return this.x + " " + this.y + " " + this.z;
    }
}
