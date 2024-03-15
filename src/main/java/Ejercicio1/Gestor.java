package Ejercicio1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

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

    public void pedirMesa() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el tipo de mesa que desea (Individual/Doble/Grupo): ");
        String tipoMesa = scanner.nextLine();
        System.out.println("Ingrese el número de la mesa: ");
        int numero = Integer.parseInt(scanner.nextLine());
        System.out.println("Ingrese la ubicación de la mesa (interior/terraza): ");
        String ubicacion = scanner.nextLine();
        LocalDate ultimaReserva = LocalDate.now();

        switch (tipoMesa.toLowerCase()) {
            case "individual":
                System.out.println("Ingrese la vista de la mesa (jardín/calle): ");
                String vistaIndividual = scanner.nextLine();
                MesaIndividual mesaIndividual = new MesaIndividual(numero, ubicacion, ultimaReserva, vistaIndividual);
                agregarMesa(mesaIndividual);
                break;
            case "doble":
                System.out.println("Ingrese la vista de la mesa (jardín/calle): ");
                String vistaDoble = scanner.nextLine();
                MesaDoble mesaDoble = new MesaDoble(numero, ubicacion, ultimaReserva, vistaDoble);
                agregarMesa(mesaDoble);
                break;
            case "grupo":
                System.out.println("Ingrese el número de enchufes de la mesa: ");
                int numeroEnchufes = Integer.parseInt(scanner.nextLine());
                MesaGrupo mesaGrupo = new MesaGrupo(numero, ubicacion, ultimaReserva, numeroEnchufes);
                agregarMesa(mesaGrupo);
                break;
            default:
                System.out.println("Tipo de mesa no válido.");
                break;
        }
    }

}


