package Ejercicio1;

import java.util.ArrayList;

public class Gestor {
    private ArrayList<Mesa> mesas;

    public Gestor() {
        this.mesas = new ArrayList<>();
    }


    public void agregarMesa(Mesa mesa) {
        mesas.add(mesa);
    }
    public void mostrarMesasDisponibles() {
        System.out.println("Estas son las mesas que ofrecemos para reservar:");
        for (Mesa mesa : mesas) {
            mesa.mostrarInformacion();
        }
    }


}


