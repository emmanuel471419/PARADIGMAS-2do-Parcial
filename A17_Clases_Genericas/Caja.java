package A17_Clases_Genericas;

public class Caja<T> {
    private T contenido;

    public void guardar(T contenido) {
        this.contenido = contenido;
    }

    public T abrir() {
        return contenido;
    }

    public boolean estaVacia() {
        return contenido == null;
    }

    public static void main(String[] args) {
        Caja<Double> cajaCalificacion = new Caja<>();
        System.out.println("¿Vacía al inicio?: " + cajaCalificacion.estaVacia());

        cajaCalificacion.guardar(9.5);
        System.out.println("¿Vacía después?: " + cajaCalificacion.estaVacia());
        System.out.println("Calificación: " + cajaCalificacion.abrir());

        Caja<Character> cajaGrupo = new Caja<>();
        cajaGrupo.guardar('A');
        System.out.println("Grupo: " + cajaGrupo.abrir());
    }
}