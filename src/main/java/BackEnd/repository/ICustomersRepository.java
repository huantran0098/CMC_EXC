package BackEnd.repository;

import BackEnd.model.Customers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICustomersRepository extends JpaRepository<Customers, Long> {
    Boolean existsByEmailCustomers(String emailCustomers);
}
