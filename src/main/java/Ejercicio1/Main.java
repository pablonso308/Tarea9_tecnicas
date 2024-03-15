package Ejercicio1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        MesaIndividual mesaIndividual = new MesaIndividual(5, "interior", LocalDate.now(), "jardín");
        MesaDoble mesaDoble = new MesaDoble(10, "terraza", LocalDate.now(), "calle");
        MesaGrupo mesaGrupo = new MesaGrupo(20, "interior", LocalDate.now(), 6);

        System.out.println("Estas son las mesas que ofrecemos para reservar:");
        mesaIndividual.mostrarInformacion();
        mesaDoble.mostrarInformacion();
        mesaGrupo.mostrarInformacion();

Gestor gestor = new Gestor();
        gestor.agregarMesa(mesaIndividual);
        gestor.agregarMesa(mesaDoble);
        gestor.agregarMesa(mesaGrupo);

        gestor.pedirMesa();
        gestor.mostrarMesasDisponibles();

    }
}