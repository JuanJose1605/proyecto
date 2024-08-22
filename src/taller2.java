import javax.swing.*;


public class taller2 {
    public static void main(String[] args) {

        int monto = 0;
        float tasa = 0;
        double couta =0;
        float interes = 0;
        float tasaInteres=0;
        int plazo =0;
        double montoPa = 0;
        double total =0;
        String opcion = "";


        do {

            opcion = JOptionPane.showInputDialog(null,""+
                     "A. Ingresar datos \n" +
                     "B. Calcular la couta mensual \n" +
                     "C. Mostrar e total \n" +
                     "D. Salir");
            switch (opcion.charAt(0)){
                case  'a' : case 'A':
                    monto = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad del monto"));
                    tasa = Float.parseFloat(JOptionPane.showInputDialog(null,"Cuanto es la taza de interes %"));
                    plazo = Integer.parseInt(JOptionPane.showInputDialog(null,"Cuanto es el plazo del prestamo"));
                break;

                case 'b' : case 'B':
                    interes = tasa / 100;
                    tasaInteres = interes / 12;
                    couta = monto * (tasaInteres * Math.pow(1 + tasaInteres, plazo)) / (Math.pow(1 + tasaInteres, plazo) - 1);
                    JOptionPane.showMessageDialog(null,"La cuota mensual es: "+couta+" $");
                    break;

                case 'c': case'C':
                    montoPa = plazo * couta;
                    total = montoPa - monto;
                    JOptionPane.showMessageDialog(null,"El valor de todas las cuotas en el prestamo es de: "+montoPa+" $");
                    JOptionPane.showMessageDialog(null,"Costo total del prestamo: "+total+" $");
            }
        }while (!opcion.equalsIgnoreCase("D"));







    }

}
