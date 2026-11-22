package A17_Clases_Genericas;

public class Registro<T> {
    private T valorActual;
    private int totalCambios;

    public void actualizar(T nuevoValor) {
        this.valorActual = nuevoValor;
        this.totalCambios++;
    }

    public T obtenerValor() {
        return valorActual;
    }

    public int obtenerTotalCambios() {
        return totalCambios;
    }

    public static void main(String[] args) {
        Registro<String> registroRama = new Registro<>();
        registroRama.actualizar("dev");
        registroRama.actualizar("main");

        System.out.println("Rama actual: " + registroRama.obtenerValor());
        System.out.println("Cambios realizados: " + registroRama.obtenerTotalCambios());

        Registro<Boolean> registroActivo = new Registro<>();
        registroActivo.actualizar(true);
        System.out.println("Estado activo: " + registroActivo.obtenerValor());
    }
}
