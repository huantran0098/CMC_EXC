package BackEnd.service.impl;

import BackEnd.model.Authors;
import BackEnd.repository.IAuthorsRepository;
import BackEnd.service.IAuthorsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthorsService implements IAuthorsService {

    @Autowired
    private IAuthorsRepository authorsRepository;

    @Override
    public Boolean existsByIdAuthors(Long idAuthors)  {
        return authorsRepository.existsByIdAuthors(idAuthors);
    }

    @Override
    public int getAuthorsBookCount(Long idAuthors) {
        if (existsByIdAuthors(idAuthors)){
            return authorsRepository.getAuthorsBookCount(idAuthors);
        } else {
            return 0;
        }
    }

    @Override
    public Optional<Authors> findById(Long id) throws NullPointerException, NumberFormatException {
        if (existsByIdAuthors(id)){
            return authorsRepository.findById(id);
        } else {
            return null;
        }
    }

    @Override
    public void save(Authors authors)  {
        if (existsByIdAuthors(authors.getIdAuthors()))
            authorsRepository.save(authors);
    }

    @Override
    public void deleteById(Long id) {
        authorsRepository.deleteById(id);
    }


}
