public class Animal {
    public int age;
    public String gender;
    public void isMammal(){
        System.out.println("This is the public method isMammal() from Animal class");
    }
    public void mate(){
        System.out.println("This is the public method mate() from Animal class");
    }
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Fish myFish = new Fish();
        Zebra myZebra = new Zebra();

        myAnimal.isMammal();
        myAnimal.mate();
        myZebra.run();

    }
}

class Fish extends Animal {
    private int sizeInFeet;
    private void canEat(){
        System.out.println("This is the private method canEat() from Fish class");
    }

}

class Zebra extends Animal {
    public boolean is_wild;
    public void run(){
        System.out.println("This is the public method run() from Zebra class");
    }
}