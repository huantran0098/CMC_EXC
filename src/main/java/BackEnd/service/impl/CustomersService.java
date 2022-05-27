package BackEnd.service.impl;

import BackEnd.model.Customers;
import BackEnd.service.ICustomersService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomersService implements ICustomersService {
    @Override
    public Optional<Customers> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public void save(Customers customers) {

    }

    @Override
    public void deleteById(Long id) {

    }
}
