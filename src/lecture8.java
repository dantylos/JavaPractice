public class lecture8 {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Tom", 4, 3.14);
        Dog dog1 = new Dog("Spike", 7, 10.5);
        cat1.makeSound();
        dog1.makeSound();




//        Animal animal = new Animal("Animal", 1, 1);

        Animal cat2 = new Cat("Jake", 3, 3);

        Animal[] animals = {cat1, dog1};
        for(var animal: animals){
            animal.makeSound();
        }

        BoundaryBox[] boundaryBoxes = {cat1, dog1, new Car("Skoda", 1000000)};
        double totalVolume = 0;
        for(var box: boundaryBoxes){
            totalVolume += box.getXBoundaryLenght() *
                    box.getZBoundaryLenght() *
                    box.getYBoundaryLenght();
        }
    }
}

interface BoundaryBox {
    double getXBoundaryLenght();
    double getYBoundaryLenght();
    double getZBoundaryLenght();
}

class Car implements BoundaryBox{
    String modelName;
    double price;

    public Car(String modelName, double price) {
        this.modelName = modelName;
        this.price = price;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public double getXBoundaryLenght() {
        return 10;
    }

    @Override
    public double getYBoundaryLenght() {
        return 3;
    }

    @Override
    public double getZBoundaryLenght() {
        return 2;
    }
}

abstract class Animal implements BoundaryBox {
    private String name;
    private int age;
    private double weight;

    public Animal(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = Math.max(age, 0);
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    abstract void makeSound();


    @Override
    public double getXBoundaryLenght() {
        return 1;
    }

    @Override
    public double getYBoundaryLenght() {
        return 2;
    }

    @Override
    public double getZBoundaryLenght() {
        return 3;
    }
}

class Cat extends Animal {

    public Cat(String name, int age, double weight) {
        super(name, age, weight);
    }

    void makeSound(){
        System.out.println("Miau");
    }
}

class Dog extends Animal {

    public Dog(String name, int age, double weight) {
        super(name, age, weight);
    }

    void makeSound(){
        System.out.println("Haf");
    }

    double getHumanEquiavalentAge(){
        return getAge() * 7;
    }
}

class Bird extends Animal {

    public Bird(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    void makeSound() {
        System.out.println("Squeak");
    }
}

//class Dog {
//    String name;
//    int age;
//    double weight;
//
//    public Dog(String name, int age, double weight) {
//        this.name = name;
//        this.age = age;
//        this.weight = weight;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public double getWeight() {
//        return weight;
//    }
//
//    public void setWeight(double weight) {
//        this.weight = weight;
//    }
//
//    void makeSound(){
//        System.out.println("Haf");
//    }
//}
//
//class Cat {
//    String name;
//    int age;
//    double weight;
//
//
//    public Cat(String name, int age, double weight) {
//        this.name = name;
//        this.age = age;
//        this.weight = weight;
//    }
//
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public double getWeight() {
//        return weight;
//    }
//
//    public void setWeight(double weight) {
//        this.weight = weight;
//    }
//
//    void makeSound(){
//        System.out.println("Miau");
//    }
//}