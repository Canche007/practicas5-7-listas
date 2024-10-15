import javax.swing.*;

public class Practica7 {
    public static void main(String[] args) {
        String palabra = JOptionPane.showInputDialog("Ingresa una palabra para verificar si es un palindromo:");
        if (palabra != null && !palabra.isEmpty()) {
            if (esPalindromo(palabra.toLowerCase(), 0, palabra.length() - 1)) {
                JOptionPane.showMessageDialog(null, "'" + palabra + "' es un palindromo.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "'" + palabra + "' no es un palindromo.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se ingreso una palabra valida.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private static boolean esPalindromo(String palabra, int inicio, int fin) {
        // Caso base: si ya hemos comparado todas las letras
        if (inicio >= fin) {
            return true;
        }
        // Si las letras no coinciden, no es un palíndromo
        if (palabra.charAt(inicio) != palabra.charAt(fin)) {
            return false;
        }
        // Continuar la verificación de forma recursiva
        return esPalindromo(palabra, inicio + 1, fin - 1);
    }
}
