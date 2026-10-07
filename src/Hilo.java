public class Hilo implements Runnable{
    private VariableCompartida compartida;

    @Override
    public void run() {
        for (int i = 1; i <= 30; i++) {
            compartida.incrementar();
            System.out.print("Se ha incrementado en +1 la variable compartida -");
            System.out.println(Thread.currentThread().getName());
        }
    }

    public Hilo(VariableCompartida compartida) {
        this.compartida = compartida;
    }
}
