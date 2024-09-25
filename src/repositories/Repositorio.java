package repositories;

import java.util.List;

public interface Repositorio<T, I> {

    void adicionar(T t);
    void editar(T t, String id);
    T remover(T t);
    T buscar(I id);
    List<T> listar();

}
