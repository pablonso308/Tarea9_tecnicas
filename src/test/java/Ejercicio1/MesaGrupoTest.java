package Ejercicio1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.time.LocalDate;

public class MesaGrupoTest {

    @Test
    public void testCalcularPrecioReserva() {
        MesaGrupo mesaGrupo = new MesaGrupo(8, "interior", LocalDate.now(), 4);
        assertEquals(7.90, mesaGrupo.calcularPrecioReserva());
    }

    @Test
    public void testMostrarInformacion() {
        MesaGrupo mesaGrupo = new MesaGrupo(8, "interior", LocalDate.now(), 4);

        // Redireccionar salida estándar para capturarla
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        mesaGrupo.mostrarInformacion();
        String expectedOutput = "Número de integrantes: 8\nUbicación: interior\nÚltima Reserva: " + LocalDate.now() + "\n";
        expectedOutput += "4 enchufes\nPrecio de reserva: 7.9€/hora\n";

        assertEquals(expectedOutput, outputStream.toString());
    }
}
