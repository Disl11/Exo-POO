public class Human {

    String name;
    int age;
    double wieght;

    Human(String name, int age, double wieght){
        this.name = name;
        this.age = age;
        this.wieght = wieght;
    }

    void eat(){
        System.out.println(this.name + " is eating");
    }

    void drink(){
        System.out.println(this.name + " is driking");
    }

}




