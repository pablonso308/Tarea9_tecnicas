package Ejercicio1;

import java.time.LocalDate;

class MesaIndividual extends Mesa {
    private String vista;

    public MesaIndividual(int numeroIntegrantes, String ubicacion, LocalDate ultimaReserva, String vista) {
        super(numeroIntegrantes, ubicacion, ultimaReserva);
        this.vista = vista;
    }

    @Override
    public double calcularPrecioReserva() {
        return 2.50;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Vista: " + vista);
        System.out.println("Precio de reserva: " + calcularPrecioReserva() + "€/hora");
    }
}