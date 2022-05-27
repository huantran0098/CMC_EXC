package BackEnd.service;

import java.util.Optional;

public interface IGeneralService<T> {
    Optional<T> findById(Long id);
    void save(T t);
    void deleteById(Long id);
}
