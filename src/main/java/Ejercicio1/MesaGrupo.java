package Ejercicio1;

import java.time.LocalDate;

class MesaGrupo extends Mesa {
    private int numeroEnchufes;

    public MesaGrupo(int numeroIntegrantes, String ubicacion, LocalDate ultimaReserva, int numeroEnchufes) {
        super(numeroIntegrantes, ubicacion, ultimaReserva);
        this.numeroEnchufes = numeroEnchufes;
    }

    @Override
    public double calcularPrecioReserva() {
        return 7.90;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println(numeroEnchufes + " enchufes");
        System.out.println("Precio de reserva: " + calcularPrecioReserva() + "€/hora");
    }
}