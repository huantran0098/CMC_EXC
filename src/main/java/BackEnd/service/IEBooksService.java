package BackEnd.service;

import BackEnd.model.Authors;
import BackEnd.model.EBooks;

import java.util.Optional;

public interface IEBooksService extends IGeneralService<EBooks> {
    Optional<EBooks> findByStandardBookNumber(String standardBookNumber);
    Boolean existsByAuthors(Authors authors);
    Boolean existsByIdBook(Long idEBook);
    Boolean existsByStandardBookNumber(String standardBookNumber);
    void minusQuantityByStandardBookNumber(String standardBookNumber, int quantity);
}
