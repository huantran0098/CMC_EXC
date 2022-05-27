package BackEnd.repository;

import BackEnd.model.Publishers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IPublishersRepository extends JpaRepository<Publishers, Long> {
    Boolean existsByIdPublisher(Long idPublishers);
    @Query(value = "SELECT COUNT(p.id_publisher) \n" +
            "FROM publishers p JOIN books b \n" +
            "ON p.id_publisher = b.id_publisher \n" +
            "WHERE p.id_publisher = :idPublishers \n" +
            "GROUP BY p.id_publisher", nativeQuery = true)
    int getPublishersBookCount(@Param("idPublishers") Long idPublishers);
}
