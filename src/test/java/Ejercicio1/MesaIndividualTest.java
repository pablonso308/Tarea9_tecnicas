package Ejercicio1;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

public class MesaIndividualTest {

    @Test
    public void testCalcularPrecioReserva() {
        MesaIndividual mesaIndividual = new MesaIndividual(1, "interior", LocalDate.now(), "jardín");
        assertEquals(2.50, mesaIndividual.calcularPrecioReserva());
    }

    @Test
    public void testMostrarInformacion() {
        MesaIndividual mesaIndividual = new MesaIndividual(1, "interior", LocalDate.now(), "jardín");

        // Redireccionar salida estándar para capturarla
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        mesaIndividual.mostrarInformacion();
        String expectedOutput = "Mesa MesaIndividual nº1 (interior) última reserva: " + LocalDate.now() + "\n";
        expectedOutput += "Vista: jardín\n";
        expectedOutput += "Precio de reserva: 2.5€/hora\n";

        assertEquals(expectedOutput, outputStream.toString());
    }
}
