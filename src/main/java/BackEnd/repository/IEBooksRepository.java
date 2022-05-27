package BackEnd.repository;

import BackEnd.model.Authors;
import BackEnd.model.EBooks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IEBooksRepository extends JpaRepository<EBooks, Long> {
    Optional<EBooks> findByStandardBookNumber(String standardBookNumber);
    Boolean existsByAuthors(Authors authors);
    Boolean existsByIdBook(Long idEBook);
    Boolean existsByStandardBookNumber(String standardBookNumber);
    @Query(value = "UPDATE books SET quantity = quantity + :bookQuantity  WHERE  = standardBookNumber = :standardBookNumber;" , nativeQuery = true)
    void plusQuantityByStandardBookNumber(@Param("standardBookNumber") String standardBookNumber, @Param("bookQuantity") int bookQuantity);
}
