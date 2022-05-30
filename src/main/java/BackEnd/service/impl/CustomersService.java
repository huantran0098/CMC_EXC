package BackEnd.service.impl;

import BackEnd.model.Customers;
import BackEnd.repository.ICustomersRepository;
import BackEnd.service.ICustomersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomersService implements ICustomersService {
    @Autowired
    private ICustomersRepository customersRepository;

    @Override
    public Optional<Customers> findById(Long id) {
        return customersRepository.findById(id);
    }

    @Override
    public void save(Customers customers) {
        customersRepository.save(customers);
    }

    @Override
    public void deleteById(Long id) {
        customersRepository.deleteById(id);
    }
}
