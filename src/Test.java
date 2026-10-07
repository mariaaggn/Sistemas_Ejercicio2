public class Test {
    public static void main(String[] args) {
        VariableCompartida compartida = new VariableCompartida();

        Hilo hilo1 = new Hilo(compartida);
        Hilo hilo2 = new Hilo(compartida);

        Thread t1 = new Thread(hilo1);
        Thread t2 = new Thread(hilo2);
        t1.start();
        t2.start();
        
    }
}
