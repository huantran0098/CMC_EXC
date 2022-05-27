package BackEnd.service.impl;

import BackEnd.model.Publishers;
import BackEnd.repository.IPublishersRepository;
import BackEnd.service.IPublishersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PublishersService implements IPublishersService {
    @Autowired
    private IPublishersRepository publishersRepository;
    @Override
    public Optional<Publishers> findById(Long id) {
        return publishersRepository.findById(id);
    }

    @Override
    public void save(Publishers publishers) {
        publishersRepository.save(publishers);
    }

    @Override
    public void deleteById(Long id) {
        publishersRepository.deleteById(id);
    }

    @Override
    public Boolean existsByIdPublisher(Long idPublishers) {
        return publishersRepository.existsByIdPublisher(idPublishers);
    }

    @Override
    public int getPublishersBookCount(Long idPublishers) {
        return publishersRepository.getPublishersBookCount(idPublishers);
    }
}
