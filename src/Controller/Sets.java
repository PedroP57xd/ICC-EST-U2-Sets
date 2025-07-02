package Controller;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {

    public Set<String> construirHashSet() {
        Set<String> palabras = new HashSet<>();
        palabras.add("Laptop");
        palabras.add("Manzana");
        palabras.add("Pera");
        palabras.add("Celular");
        palabras.add("Laptop");
        palabras.add("Celular");
        return palabras;
    }

    public Set<String> construirLinkedHashSet() {
        Set<String> palabras = new LinkedHashSet<>();
        palabras.add("Laptop");
        palabras.add("Manzana");
        palabras.add("Pera");
        palabras.add("Celular");
        palabras.add("Laptop");
        palabras.add("Celular");
        return palabras;
    }

    public Set<String> construirTreeSet() {
        Set<String> palabras = new TreeSet<>();
        palabras.add("Laptop");
        palabras.add("Manzana");
        palabras.add("Pera");
        palabras.add("Celular");
        palabras.add("Laptop");
        palabras.add("Celular");
        return palabras;
    }

    public Set<String> construirTreeSetConComparador() {
        //Implementacion de Comparator, para comparaacion espesifica
        Comparator<String> comparador = new Comparator<String>(){

            @Override
            public int compare(String s1,String s2) {
                //Primero comparamos por la longitud
                int result = Integer.compare(s1.length(), s2.length());
                //Si son iguales en tamaño, comparo alfabeticamente
                if (result==0) {
                    result = s1.compareTo(s2);
                }
                return result;
            }

        };
        Set<String> palabras = new TreeSet(comparador);
        palabras.add("Laptop");
        palabras.add("Manzana");
        palabras.add("Pera");
        palabras.add("Celular");
        palabras.add("Laptop");
        palabras.add("Celular");
        palabras.add("Celulas");
        return palabras;
    }
    public Set<String> construirTreeSetConComparadorR() {
        //Implementacion de Comparator, para comparaacion espesifica
        Comparator<String> comparador = new Comparator<String>(){

            @Override
            public int compare(String s1,String s2) {
                //Primero comparamos por la longitud
                int result = Integer.compare(s2.length(), s1.length());
                //Si son iguales en tamaño, comparo alfabeticamente
                if (result==0) {
                    result = s2.compareTo(s1);
                }
                return result;
            }

        };
        Set<String> palabras = new TreeSet(comparador);
        palabras.add("Laptop");
        palabras.add("Manzana");
        palabras.add("Pera");
        palabras.add("Celular");
        palabras.add("Laptop");
        palabras.add("Celular");
        palabras.add("Celulas");
        return palabras;
    }
}
