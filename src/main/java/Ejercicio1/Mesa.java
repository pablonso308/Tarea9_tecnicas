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
}
