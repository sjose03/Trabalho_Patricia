public class FilaInt {

    private class No{
        Paciente paciente;
        No prox;
    }

    private No ini;
    private No fim;

    public void init() {
        ini = fim = null;
    }

    public boolean isEmpty() {
        if (ini==null && fim==null)
            return true;
        else
            return false;
    }

    public void enqueue (Paciente paciente) {
        No novo = new No();
        novo.paciente = paciente;
        novo.prox = null;
        if (isEmpty())
            ini = novo;
        else
            fim.prox = novo;
        fim = novo;
    }

    public Paciente dequeue() {
        Paciente v = ini.paciente;
        ini = ini.prox;
        if (ini == null)
            fim = null;
        return v;
    }


    public Paciente first() {
        return ini.paciente;
    }
}