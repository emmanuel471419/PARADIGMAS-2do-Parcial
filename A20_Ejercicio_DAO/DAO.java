package A20_Ejercicio_DAO;

import java.util.List;

public interface DAO<T> {
    void guardar(T entidad);
    List<T> obtenerTodos();
}
