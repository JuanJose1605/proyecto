import javax.swing.*;

public class vehiculos {
    public static void main(String[] args) {
        propiedadesVe carro = new propiedadesVe("","","","",0,0);
        propiedadesVe moto = new propiedadesVe("","","","",0,0);
        String opcion = "";
        String cad="";
        String caddos = "";
        do {
            opcion = JOptionPane.showInputDialog(null,""+
                    "A. Ingreasar datos del carro \n" +
                    "B. Ingresar datos de la moto \n" +
                    "C. mostrar informacion del carro \n" +
                    "D. mostrar informacion de la moto \n" +
                    "E. Salir");
            switch (opcion.charAt(0)){
                case 'a' : case 'A':
                    carro.setMarca(JOptionPane.showInputDialog(null,"Que marca es el carro: "));
                    carro.setPlaca(JOptionPane.showInputDialog(null,"Que placa tienes: "));
                    carro.setModelo(JOptionPane.showInputDialog(null,"Que modelo es el carro: "));
                    carro.setColor(JOptionPane.showInputDialog(null,"Que color tiene el carro: "));
                    carro.setAnio(Integer.parseInt(JOptionPane.showInputDialog(null,"Que año es el carro: ")));
                    carro.setPrecio(Float.parseFloat(JOptionPane.showInputDialog(null,"Que precio tiene el carro: ")));
                    break;
                case 'b' : case 'B':
                    moto.setMarca(JOptionPane.showInputDialog(null,"Que marca es el moto: "));
                    moto.setPlaca(JOptionPane.showInputDialog(null,"Que placa tienes: "));
                    moto.setModelo(JOptionPane.showInputDialog(null,"Que modelo es el moto: "));
                    moto.setColor(JOptionPane.showInputDialog(null,"Que color tiene el moto: "));
                    moto.setAnio(Integer.parseInt(JOptionPane.showInputDialog(null,"Que año es el moto: ")));
                    moto.setPrecio(Float.parseFloat(JOptionPane.showInputDialog(null,"Que precio tiene el moto: ")));
                    break;

                case 'c': case 'C':

                    cad="La marca del carro es: " +
                            ""+carro.getMarca()+"\n"+"El modelo del vehículo es: " +
                            ""+carro.getModelo()+"\n"+"El color del vehículo es: " +
                            ""+carro.getColor()+"\n"+"La placa del vehículo es: " +
                            ""+carro.getPlaca()+"\n"+"El año de fabricación es: " +
                            ""+carro.getAnio()+"\n"+ "Su valor es: "+carro.getPrecio();

                    JOptionPane.showMessageDialog(null, cad);
                    break;

                case 'd': case 'D':
                    caddos="La marca de la moto es: " +
                            ""+moto.getMarca()+"\n"+"El modelo del vehículo es: " +
                            ""+moto.getModelo()+"\n"+"El color del vehículo es: " +
                            ""+moto.getColor()+"\n"+"La placa del vehículo es: " +
                            ""+moto.getPlaca()+"\n"+"El año de fabricación es: " +
                            ""+moto.getAnio();

                    JOptionPane.showMessageDialog(null, caddos);
                    break;

                default:
                    JOptionPane.showMessageDialog(null,"Opcion incorrecta");

            }



        }while (!opcion.equalsIgnoreCase("E"));
        JOptionPane.showMessageDialog(null,"Saliendo.....");
    }

}
