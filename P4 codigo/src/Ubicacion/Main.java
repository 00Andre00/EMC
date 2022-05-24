package EMC;

public class Main {
    public static void main(String args[]) {
        Departamento depa = new Departamento("Loreto", "quilla", "acolla");

        System.out.println(depa.getNombre());
        System.out.println(depa.getProvincia());
        System.out.println(depa.getDistrito());

    }
}
