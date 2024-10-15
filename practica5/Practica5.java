import javax.swing.*;
import java.util.*;

public class Practica5 {
    private static Map<Character, List<String>> palabrasPorLetra = new HashMap<>();

    public static void main(String[] args) {
        ingresarPalabra();
    }

    private static void ingresarPalabra() {
        String palabra = JOptionPane.showInputDialog("Ingresa una palabra (o deja en blanco para salir):").toLowerCase();
        
        // Si el usuario deja en blanco, se termina la recursión
        if (palabra == null || palabra.isEmpty()) {
            mostrarListas();
            return;
        }

        // Guardar palabra en tiempo real
        guardarPalabra(palabra);
        mostrarListas();  // Mostrar el estado actual después de cada entrada

        // Continuar ingresando palabras de forma recursiva
        ingresarPalabra();
    }

    private static void guardarPalabra(String palabra) {
        char letraInicial = palabra.charAt(0);
        palabrasPorLetra.putIfAbsent(letraInicial, new ArrayList<>());
        palabrasPorLetra.get(letraInicial).add(palabra);
    }

    private static void mostrarListas() {
        StringBuilder resultado = new StringBuilder();
        for (Map.Entry<Character, List<String>> entry : palabrasPorLetra.entrySet()) {
            resultado.append("Lista ").append(entry.getKey().toString().toUpperCase()).append(": ")
                    .append(String.join(", ", entry.getValue())).append("\n");
        }
        JOptionPane.showMessageDialog(null, resultado.toString(), "Palabras agrupadas", JOptionPane.INFORMATION_MESSAGE);
    }
}
