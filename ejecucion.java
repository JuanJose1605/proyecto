import javax.swing.*;

public class ejecucion {
    public static void main(String[] args) {
        vehiculo ve = new vehiculo("","","","");
        String opcion = "";

        do {
            opcion = JOptionPane.showInputDialog(null,"\n" +
                    "A. Registrar vehiculo \n" +
                    "B. Retirar vehiuclo \n" +
                    "C. Consultar capacidad disponible \n" +
                    "D. salir");
            switch (opcion.charAt(0)){
                case 'a' : case 'A':
                    break;
                case 'b': case 'B':
                break;

                case 'c': case 'C':
                    break;

                default:
                    JOptionPane.showMessageDialog(null,"Letra incorrecta");

            }
        }while (!opcion.equalsIgnoreCase("d"));
    }
}
