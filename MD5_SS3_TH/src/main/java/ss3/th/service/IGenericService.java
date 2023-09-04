package ss3.th.service;

import java.util.List;
import java.util.Optional;

public interface IGenericService<T,E> {

    Iterable<T> findAll();

    Optional<T> findById(E id);

    void save(T t);
    void delete(E id);
}
