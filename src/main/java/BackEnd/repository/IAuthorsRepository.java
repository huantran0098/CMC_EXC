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
            "SELECT COUNT(b.authors_id_authors) \n" +
                    "FROM books b JOIN authors a \n" +
                    "ON b.authors_id_authors = a.id_authors \n" +
                    "WHERE b.authors_id_authors = " + " :idAuthors \n" +
                    "GROUP BY b.authors_id_authors ", nativeQuery = true)
    int getAuthorsBookCount(Long idAuthors);
}
