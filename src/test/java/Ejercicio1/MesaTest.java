package Ejercicio1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.time.LocalDate;

public class MesaTest {

    @Test
    public void testMostrarInformacionMesaIndividual() {
        MesaIndividual mesaIndividual = new MesaIndividual(1, "interior", LocalDate.now(), "jardín");

        // Redireccionar salida estándar para capturarla
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        mesaIndividual.mostrarInformacion();
        String expectedOutput = "Mesa MesaIndividual nº1 (interior) última reserva: " + LocalDate.now() + "\n";

        assertEquals(expectedOutput, outputStream.toString());
    }

    @Test
    public void testMostrarInformacionMesaDoble() {
        MesaDoble mesaDoble = new MesaDoble(2, "terraza", LocalDate.now(), "calle");

        // Redireccionar salida estándar para capturarla
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        mesaDoble.mostrarInformacion();
        String expectedOutput = "Mesa MesaDoble nº2 (terraza) última reserva: " + LocalDate.now() + "\n";

        assertEquals(expectedOutput, outputStream.toString());
    }

    @Test
    public void testMostrarInformacionMesaGrupo() {
        MesaGrupo mesaGrupo = new MesaGrupo(8, "interior", LocalDate.now(), 4);

        // Redireccionar salida estándar para capturarla
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        mesaGrupo.mostrarInformacion();
        String expectedOutput = "Mesa MesaGrupo nº8 (interior) última reserva: " + LocalDate.now() + "\n";

        assertEquals(expectedOutput, outputStream.toString());
    }
}
