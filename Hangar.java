public class Hangar {

    public static void main(String [] args) {

        Car clio = new Car ("Clio");
        System.out.println("Je suis " + clio.getBrand() + " et je fais vroom vroom !");

        Boat titanic = new Boat ("Titanic");
        System.out.println("Je suis " + titanic.getBrand() + " et je fais glou glou " + titanic.doStuff() + " !");
    }
}
