package BackEnd.repository;

import BackEnd.model.Publishers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPublishersRepository extends JpaRepository<Publishers, Long> {
    Boolean existsByIdPublisher(Long idPublishers);
}
