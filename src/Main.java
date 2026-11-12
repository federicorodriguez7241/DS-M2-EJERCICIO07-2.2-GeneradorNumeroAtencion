import java.util.List;

public class Main {
    public static void main(String[] args) {

        GeneradorTurnos terminalA = GeneradorTurnos.getInstancia();
        GeneradorTurnos terminalB = GeneradorTurnos.getInstancia();
        GeneradorTurnos terminalC = GeneradorTurnos.getInstancia();

        System.out.println("--- GENERANDO 20 TURNOS ALTERNADOS ---");

        // simulamos que las terminales piden turnos una tras otra
        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 1) {
                terminalA.generarNumero("Terminal A");
            } else if (i % 3 == 2) {
                terminalB.generarNumero("Terminal B");
            } else {
                terminalC.generarNumero("Terminal C");
            }
        }

        System.out.println("\n✅ Turnos generados exitosamente sin duplicados.");

        System.out.println("\n--- CONSULTA DEL ÚLTIMO NÚMERO ---");
        System.out.println("El último número emitido fue el: " + terminalB.consultarUltimoNumero());

        System.out.println("\n--- HISTORIAL COMPLETO DE ATENCIÓN ---");
        List<Turno> historialCompleto = terminalC.obtenerHistorial();
        for (Turno turno : historialCompleto) {
            System.out.println(turno.toString());
        }
    }
}