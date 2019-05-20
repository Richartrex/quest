public class Hangar {

    public static void main(String [] args) {

        Car clio = new Car ("Clio");
        System.out.println("Je suis " + clio.getBrand() + clio.doStuff());

        Boat titanic = new Boat ("Titanic");
        System.out.println("Je suis " + titanic.getBrand() + titanic.doStuff());
    }
}
