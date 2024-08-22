import javax.swing.*;

public class doWhile {
    public static void main(String[] args) {
        String nombre;
        do {
            nombre = JOptionPane.showInputDialog(null,"Ingrese Su nombre");
        }while (nombre.isEmpty());

        JOptionPane.showMessageDialog(null,"Bienvenido "+nombre);
    }

}
