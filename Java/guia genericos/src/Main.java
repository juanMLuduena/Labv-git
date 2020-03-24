import java.util.ArrayList;

public class Main {

    public static void main(String args[]) {

        GenericClass cajaP = new GenericClass();

        Pila pilita= new Pila();




        Persona p1 = new Persona("Juan", 21);
        Persona p2 = new Persona("Bianca", 20);
        Persona p3 = new Persona("Andrea", 40);
        Persona p4 = new Persona("Ornella", 17);

        pilita.push(p1);
        pilita.push(p2);
        pilita.push(p3);
        pilita.push(p4);

        System.out.println(pilita.size());


    }
}
