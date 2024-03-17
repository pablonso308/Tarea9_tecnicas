package Ejercicio1;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

public class MesaDobleTest {

    @Test
    public void testCalcularPrecioReserva() {
        MesaDoble mesaDoble = new MesaDoble(2, "terraza", LocalDate.now(), "calle");
        assertEquals(4.50, mesaDoble.calcularPrecioReserva());
    }

    @Test
    public void testMostrarInformacion() {
        MesaDoble mesaDoble = new MesaDoble(2, "terraza", LocalDate.now(), "calle");

        // Redireccionar salida estándar para capturarla
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        mesaDoble.mostrarInformacion();
        String expectedOutput = "Mesa MesaDoble nº2 (terraza) última reserva: " + LocalDate.now() + "\n";
        expectedOutput += "Vista: calle\n";
        expectedOutput += "Precio de reserva: 4.5€/hora\n";

        assertEquals(expectedOutput, outputStream.toString());
    }
}
