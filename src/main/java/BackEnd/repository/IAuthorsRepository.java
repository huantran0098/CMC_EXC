package BackEnd.repository;

import BackEnd.model.Authors;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAuthorsRepository extends JpaRepository<Authors, Long> {
    Boolean existsByIdAuthors(Long idAuthors);
}
