import java.util.ArrayList;
import java.util.List;

public class GeneradorTurnos {

    private static GeneradorTurnos instancia;

    // variables protegidas para que las terminales no las toquen directo
    private int contador;
    private List<Turno> historial;

    private GeneradorTurnos() {
        this.contador = 0; // arranca en 0 para que el primero sea el 1
        this.historial = new ArrayList<>();
    }

    public static GeneradorTurnos getInstancia() {
        if (instancia == null) {
            instancia = new GeneradorTurnos();
        }
        return instancia;
    }

    public Turno generarNumero(String nombreTerminal) {
        this.contador++;
        Turno nuevoTurno = new Turno(this.contador, nombreTerminal);
        this.historial.add(nuevoTurno);

        return nuevoTurno;
    }

    // devuelve el numero actual pero sin sumarle nada
    public int consultarUltimoNumero() {
        return this.contador;
    }

    public List<Turno> obtenerHistorial() {
        return new ArrayList<>(this.historial);
    }
}