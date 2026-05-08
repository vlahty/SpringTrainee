package repository;

import java.util.Optional;

public interface Repository<K,E> {

    Optional<E> findById(K id);
    void delete(E entity);
}
