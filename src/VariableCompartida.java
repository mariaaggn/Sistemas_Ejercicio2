public class VariableCompartida {
    private static int variableV=0;

    public void incrementar(){
        variableV++;
    }

    public static int getVariableV() {
        return variableV;
    }

    public static void setVariableV(int variableV) {
        VariableCompartida.variableV = variableV;
    }
}
