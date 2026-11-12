public class Turno {
    private int numero;
    private String terminal;

    public Turno(int numero, String terminal) {
        this.numero = numero;
        this.terminal = terminal;
    }

    public int getNumero() {
        return numero;
    }

    public String getTerminal() {
        return terminal;
    }

    @Override
    public String toString() {
        return "Turno N° " + numero + " -> Emitido en: " + terminal;
    }
}
