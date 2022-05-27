package BackEnd.repository;

import BackEnd.model.Authors;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IAuthorsRepository extends JpaRepository<Authors, Long> {
    Boolean existsByIdAuthors(Long idAuthors);

    @Query(value =
            "SELECT * FROM eb_shop.authors;\n" +
            "SELECT COUNT(b.id_authors) \n" +
            "FROM books b JOIN authors a \n" +
            "ON b.id_authors = a.id_authors \n" +
            "WHERE b.id_authors = :idAuthors \n" +
            "GROUP BY b.id_authors ", nativeQuery = true)
    int getAuthorsBookCount(Long idAuthors);
}
