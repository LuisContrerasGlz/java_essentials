package practicas_simples;

public class Main {

    public static void main(String[] args) {

        Challenger muscle = new Challenger();
        Limo fancy = new Limo();

        muscle.setDoors();
        fancy.setDoors();

        System.out.println(muscle.doors);
        System.out.println(fancy.doors);

    }
}
