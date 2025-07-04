package Controller;

import java.util.HashSet;
import java.util.Set;

public class Ejercicios {

    public Ejercicios() {
        System.out.println("Ejercicio 1");
        System.out.println(tieneCDuplicados(new int[] { 1, 2, 3, 4, 5 }));
        System.out.println(tieneCDuplicados(new int[] { 1, 2, 3, 4, 5, 4, 3, 2, 45 }));
        System.out.println("Ejercicio 2");
        System.out.println(esIsograma("murcielago"));
        System.out.println(esIsograma("camaleon"));
        System.out.println("Ejercicio 3");
        System.out.println("El texto tiene" + contarPalabrasUnicas(
                """
                        "    La inteligencia artificial (IA) está transformando el mundo a una velocidad sin precedentes. Desde asistentes virtuales que responden preguntas hasta vehículos autónomos que recorren las ciudades, la IA está presente en casi todos los aspectos de nuestra vida diaria. Sin embargo, este avance también plantea desafíos éticos, sociales y económicos que deben ser cuidadosamente analizados. ¿Estamos preparados para delegar decisiones importantes a sistemas que no poseen conciencia ni empatía?\n" + //
                        "                  Por otro lado, la IA puede ser una herramienta poderosa en sectores como la salud, la educación y el medio ambiente. Con algoritmos bien entrenados, es posible detectar enfermedades de forma temprana, personalizar la enseñanza o monitorear los ecosistemas en tiempo real. No obstante, es fundamental garantizar que su implementación sea inclusiva, justa y transparente.\n" + //
                        "                 En resumen, el desarrollo responsable de la inteligencia artificial no solo debe centrarse en la innovación, sino también en el impacto que genera en la humanidad y en el planeta. El futuro no está escrito, pero lo que decidamos hoy tendrá consecuencias duraderas.""")
                + " palabras únicas.");
        System.out.println("Ejercicio 4");
        compararTextos(
                "¡Hola! La programación en Java es muy divertida, sobre todo cuando se entienden los conceptos.",
                "Java es divertido. Aprender programación puede ser un reto, pero también muy gratificante.");
    }

    public boolean tieneCDuplicados(int[] numeros) {
        Set<Integer> set = new HashSet<>();
        for (int num : numeros) {
            if (set.contains(num)) {
                return true;
            }
        }
        return true;
    }

    public boolean esIsograma(String palabra) {
        // si se ingresa mursielago -> true
        // si se ingresa camaleon -> false
        palabra = palabra.toLowerCase();
        java.util.Set<Character> letras = new java.util.HashSet<>();
        for (char c : palabra.toCharArray()) {
            if (letras.contains(c)) {
                return false;
            }
            letras.add(c);
        }
        return true;
    }

    public int contarPalabrasUnicas(String frase) {
        // si se ingresa "hola hola como estas estas" -> 2
        frase = frase.toLowerCase();
        String[] palabras = frase.split("\\W+");
        java.util.Set<String> palabrasUnicas = new java.util.HashSet<>();
        for (String palabra : palabras) {
            if (!palabra.isEmpty()) {
                palabrasUnicas.add(palabra);
            }
        }
        return palabrasUnicas.size();
    }

    public void compararTextos(String texto1, String texto2) {
        Set<String> palabrasTexto1 = new HashSet<>();
        Set<String> palabrasTexto2 = new HashSet<>();

        for (String palabra : texto1.toLowerCase().split("\\W+")) {
            if (!palabra.isEmpty())
                palabrasTexto1.add(palabra);
        }
        for (String palabra : texto2.toLowerCase().split("\\W+")) {
            if (!palabra.isEmpty())
                palabrasTexto2.add(palabra);
        }

        Set<String> palabrasComunes = new HashSet<>(palabrasTexto1);
        palabrasComunes.retainAll(palabrasTexto2);

        Set<String> soloTexto1 = new HashSet<>(palabrasTexto1);
        soloTexto1.removeAll(palabrasTexto2);

        Set<String> soloTexto2 = new HashSet<>(palabrasTexto2);
        soloTexto2.removeAll(palabrasTexto1);

        System.out.println("Palabras únicas en texto1: " + soloTexto1.size());
        System.out.println("Palabras únicas en texto2: " + soloTexto2.size());
        System.out.println("Palabras comunes: " + palabrasComunes.size());
        System.out.println("coincidencias léxicas: " + palabrasComunes.size());
        System.out.println("solo en texto1: " + soloTexto1);
        System.out.println("solo en texto2: " + soloTexto2);
    }
}
