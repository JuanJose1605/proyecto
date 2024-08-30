import javax.swing.*;

public class parqueadero {
    private int capacidad;
    private   vehiculo[] vehiculosEs;


    public parqueadero(int capacidad, vehiculo[] vehiculosEs) {
        this.capacidad = capacidad;
        this.vehiculosEs = new vehiculo[capacidad];
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public vehiculo[] getVehiculosEs() {
        return vehiculosEs;
    }

    public void setVehiculosEs(vehiculo[] vehiculosEs) {
        this.vehiculosEs = vehiculosEs;
    }
    public void registrarIngreso(vehiculo vehiculo) {
        for (int i = 0; i < vehiculosEs.length; i++) {
            if (vehiculosEs[i] == null) {
                vehiculo.getHoraEntrada();
                vehiculosEs[i] = vehiculo;
                JOptionPane.showMessageDialog(null,"Vehiculo ingresado con exito");
                return;
            }
        }
        JOptionPane.showMessageDialog(null,"Parqueadero lleno. No se puede registrar el vehículo");}

        public void registrarEgreso(vehiculo vehiculo ) {
            for (int i = 0; i < vehiculosEs.length; i++) {
                if (vehiculosEs[i] != null && vehiculosEs[i].equals(vehiculo)) {
                   vehiculo.getHoraSalida();
                    vehiculosEs[i] = null;
                    JOptionPane.showMessageDialog(null,"Vehiculo egresado con exito");
                    return;
                }
            }
            JOptionPane.showMessageDialog(null,"vehiculo no encontrado");}

    public void tarifa (vehiculo vehiculo){

        //La hora vale 10
        long horaE = Long.parseLong(vehiculo.getHoraSalida());
        long horaS = Long.parseLong(vehiculo.getHoraEntrada());
        long time = ((horaS - horaE)/3600000)*10;

    }
    public int actualizarCapacidadDisponible() {
        int count = 0;
        for (vehiculo v : vehiculosEs) {
            if (v == null) {
                count++;
            }
        }
        return count;
    }



}
