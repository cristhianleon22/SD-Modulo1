
import javax.swing.*;

public class Restaurante {
    public static void main(String[] args) {

        final double PORCENTAJE_PROPINA = 0.10;
        final double DESCUENTO_FRECUENTE = 0.05;
        final double TOPE_DESCUENTO = 100000;
        boolean frecuente;

        String textoCuenta = JOptionPane.showInputDialog("valor de la cuenta $");
        double cuenta = Double.parseDouble(textoCuenta);

        String textoPersonas = JOptionPane.showInputDialog("numero de personas: ");
        int personas = Integer.parseInt(textoPersonas);

        String textoCliente = JOptionPane.showInputDialog("¿cliente frecuente? (si / no)");

        if (textoCliente.equals("si") || textoCliente.equals("Si") || textoCliente.equals("SI")) {
            frecuente = true;
        }

        else {
            frecuente = false;
        }

        double propina = cuenta * PORCENTAJE_PROPINA;
        double total = cuenta + propina;

        if (frecuente && cuenta > TOPE_DESCUENTO) {
            JOptionPane.showMessageDialog(null, "Su Descuento es de: $" + total * DESCUENTO_FRECUENTE);
            total = total - (total * DESCUENTO_FRECUENTE);

        }
        else{
            JOptionPane.showMessageDialog(null, "La compra no aplica para descuento");
        }

        double porPersona = total / personas;

        JOptionPane.showMessageDialog(null,
                "Propina: $" + propina + "\n" + "Total final: $" + total + "\n" + "cada persona paga: $" + porPersona);

    }
}
