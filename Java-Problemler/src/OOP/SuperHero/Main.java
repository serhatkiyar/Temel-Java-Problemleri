package OOP.SuperHero;

public class Main {
    public static void main(String[] args) {
        Human human = new Human("Serhat", 19);
        System.out.println(human.toString());
        Hero serhat = new Hero("Serhat", 19, 99);
        System.out.println(serhat.toString());
    }
}
