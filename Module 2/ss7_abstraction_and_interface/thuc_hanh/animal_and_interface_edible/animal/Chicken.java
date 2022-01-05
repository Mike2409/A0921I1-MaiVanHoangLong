package ss7_abstraction_and_interface.thuc_hanh.AnimalAndInterfaceEdible.animal;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken : cluck-cluck!";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
