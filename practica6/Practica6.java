import javax.swing.*;

public class Practica6 {
    public static void main(String[] args) {
        String palabra = JOptionPane.showInputDialog("Ingresa una palabra para invertirla:");
        if (palabra != null && !palabra.isEmpty()) {
            String palabraInvertida = invertirPalabra(palabra);
            JOptionPane.showMessageDialog(null, "Palabra invertida: " + palabraInvertida, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No se ingresó una palabra válida.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private static String invertirPalabra(String palabra) {
        if (palabra.isEmpty()) {
            return palabra;
        }
        // recursividad
        return invertirPalabra(palabra.substring(1)) + palabra.charAt(0);
    }
}
