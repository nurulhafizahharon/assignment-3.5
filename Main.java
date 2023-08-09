public class Main {

    public static void main(String[] args) {

        Pet cat = new Pet("Oreo", "Cat");
        Pet dog = new Pet("KitKat", "Dog");

        cat.call("meow");
        cat.eat("salmon");
        cat.sleep();

        dog.call("woof");
        dog.eat("beef");
        dog.sleep();

    }
}
