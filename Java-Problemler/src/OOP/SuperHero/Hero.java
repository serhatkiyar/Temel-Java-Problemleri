package OOP.SuperHero;

public class Hero extends Human{
    int power;

    public Hero(String name, int age, int power) {
        super(name, age);
        this.power = power;
    }

    public String toString() {
        return super.toString() + this.power + "\n";
    }
}
