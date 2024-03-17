package Ejercicio1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

public class GestorTest {

    @Test
    public void testAgregarMesa() {
        Gestor gestor = new Gestor();
        MesaIndividual mesaIndividual = new MesaIndividual(1, "interior", LocalDate.now(), "jardín");
        gestor.agregarMesa(mesaIndividual);
        assertEquals(1, gestor.getMesa().size());
    }

    @Test
    public void testMostrarMesasDisponibles() {
        Gestor gestor = new Gestor();
        MesaIndividual mesaIndividual = new MesaIndividual(1, "interior", LocalDate.now(), "jardín");
        gestor.agregarMesa(mesaIndividual);
        MesaDoble mesaDoble = new MesaDoble(2, "terraza", LocalDate.now(), "calle");
        gestor.agregarMesa(mesaDoble);

        // Redireccionar salida estándar para capturarla
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        gestor.mostrarMesasDisponibles();
        String expectedOutput = "Estas son las mesas que ofrecemos para reservar:\n";
        expectedOutput += "Número: 1, Ubicación: interior, Última Reserva: " + LocalDate.now() + ", Vista: jardín\n";
        expectedOutput += "Número: 2, Ubicación: terraza, Última Reserva: " + LocalDate.now() + ", Vista: calle\n";

        assertEquals(expectedOutput, outputStream.toString());
    }

    @Test
    public void testPedirMesa() {
        Gestor gestor = new Gestor();

        String simulatedInput = "individual\n1\ninterior\njardín\n";
        InputStream savedStandardInputStream = System.in;
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        gestor.pedirMesa();

        assertEquals(1, gestor.getMesa().size());

        System.setIn(savedStandardInputStream);
    }
}
