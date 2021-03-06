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
    @Query(value =
            "SELECT quantity FROM books " +
                    "WHERE id_book = " + ":idEBooks;", nativeQuery = true)
    int getEBooksQuantityByIdEBooks(Long idEBooks);

    @Query(value =
            "UPDATE books SET quantity = quantity + " + ":bookQuantity " +
                    "WHERE standard_book_number = " + ":standardBookNumber", nativeQuery = true)
    void plusQuantityByStandardBookNumber(@Param("standardBookNumber") String standardBookNumber, @Param("bookQuantity") int bookQuantity);

    @Query(value =
            "UPDATE books SET quantity = quantity - " + ":bookQuantity " +
                    "WHERE standard_book_number =  " + ":standardBookNumber", nativeQuery = true)
    void minusQuantityByStandardBookNumber(@Param("standardBookNumber") String standardBookNumber, @Param("bookQuantity") int bookQuantity);
}
