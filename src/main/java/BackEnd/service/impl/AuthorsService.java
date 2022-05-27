package BackEnd.service.impl;

import BackEnd.model.Authors;
import BackEnd.repository.IAuthorsRepository;
import BackEnd.service.IAuthorsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthorsService implements IAuthorsService {

    @Autowired
    private IAuthorsRepository authorsRepository;

    @Override
    public Boolean existsByIdAuthors(Long idAuthors) {
        return authorsRepository.existsByIdAuthors(idAuthors);
    }

    @Override
    public Optional<Authors> findById(Long id) {
        return authorsRepository.findById(id);
    }

    @Override
    public void save(Authors authors) {
        authorsRepository.save(authors);
    }

    @Override
    public void deleteById(Long id) {
        authorsRepository.deleteById(id);
    }
}
