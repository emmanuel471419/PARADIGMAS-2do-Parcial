package A20_Ejercicio_DAO;

public class Main {
    public static void main(String[] args) {
      
        // Ahora: new EstudianteDAOMySQL();   -> guarda en tu MySQL Workbench
        DAO<Estudiante> estudianteDAO = new EstudianteDAOMySQL();

        Estudiante nuevoEstudiante = new Estudiante(2525041, "Angel Apolonio Sanchez Sanchez"); // Cambia el ID y nombre a los tuyos
        estudianteDAO.guardar(nuevoEstudiante);

        for (Estudiante e : estudianteDAO.obtenerTodos()) {
            System.out.println("ID: " + e.getId() + " | Nombre: " + e.getNombre());
        }
    }
}
