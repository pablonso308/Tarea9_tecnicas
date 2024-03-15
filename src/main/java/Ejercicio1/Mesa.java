package Ejercicio1;

import java.time.LocalDate;

abstract class Mesa {
    protected int numeroIntegrantes;
    protected String ubicacion;
    protected LocalDate ultimaReserva;

    public Mesa(int numeroIntegrantes, String ubicacion, LocalDate ultimaReserva) {
        this.numeroIntegrantes = numeroIntegrantes;
        this.ubicacion = ubicacion;
        this.ultimaReserva = ultimaReserva;

    }
    public abstract double calcularPrecioReserva();

    // Método para mostrar la información de la mesa
    public void mostrarInformacion() {
        System.out.println("Mesa " + getClass().getSimpleName() + " nº" + numeroIntegrantes + " (" + ubicacion + ") " +
                "última reserva: " + ultimaReserva.toString());
    }
}

