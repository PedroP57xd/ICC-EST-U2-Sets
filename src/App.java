import java.util.Set;

import Controller.ContactoController;
import Controller.Sets;
import Models.Contacto;

public class App {
    public static void main(String[] args) throws Exception {
        // runHashSet(null);
        // runLinkedHashSet(null);
        // runTreeSet(null);
        // runTreeSetConComparacion(null);
        // runTreeSetConComparacionR(null);
        ContactoController contactoController = new ContactoController();
    
    }

    public static void runHashSet(Sets sets) {
        System.out.println(" ");
        System.out.println("==========HashSet==========");
        Sets s = new Sets();
        Set<String> palabras = s.construirHashSet();
        int i = 1;
        for (String string : palabras) {
            System.out.println("Palabra " + i++ + " : " + string);
        }

    }

    private static void runLinkedHashSet(Sets sets) {
        System.out.println(" ");
        System.out.println("==========LinkedHashSet==========");
        Sets s = new Sets();
        Set<String> palabras = s.construirLinkedHashSet();
        int i = 1;
        for (String string : palabras) {
            System.out.println("Palabra " + i++ + " : " + string);
        }
    }

    private static void runTreeSet(Sets sets) {
        System.out.println(" ");
        System.out.println("==========TreeSet==========");
        Sets s = new Sets();
        Set<String> palabras = s.construirTreeSet();
        int i = 1;
        for (String string : palabras) {
            System.out.println("Palabra " + i++ + " : " + string);
        }
    }

    private static void runTreeSetConComparacion(Object object) {
        System.out.println(" ");
        System.out.println("==========TreeSet con Comparador==========");
        Sets s = new Sets();
        Set<String> palabras = s.construirTreeSetConComparador();
        int i = 1;
        for (String string : palabras) {
            System.out.println("Palabra " + i++ + " : " + string);
        }
    }
    private static void runTreeSetConComparacionR(Object object) {
        System.out.println(" ");
        System.out.println("==========TreeSet con Comparador inverso==========");
        Sets s = new Sets();
        Set<String> palabras = s.construirTreeSetConComparadorR();
        int i = 1;
        for (String string : palabras) {
            System.out.println("Palabra " + i++ + " : " + string);
        }
    }
}
