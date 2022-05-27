package BackEnd.service.impl;

import BackEnd.model.Authors;
import BackEnd.model.EBooks;
import BackEnd.repository.IEBooksRepository;
import BackEnd.service.IEBooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EBooksService implements IEBooksService {

    @Autowired
    private IEBooksRepository booksRepository;

    @Override
    public Optional<EBooks> findByStandardBookNumber(String standardBookNumber){
        return booksRepository.findByStandardBookNumber(standardBookNumber);
    }

    @Override
    public Boolean existsByAuthors(Authors authors) {
        return booksRepository.existsByAuthors(authors);
    }

    @Override
    public Boolean existsByIdBook(Long idEBook) {
        return booksRepository.existsByIdBook(idEBook);
    }

    @Override
    public Boolean existsByStandardBookNumber(String standardBookNumber) {
        return booksRepository.existsByStandardBookNumber(standardBookNumber);
    }

    @Override
    public void minusQuantityByStandardBookNumber(String standardBookNumber, int quantity) {
        booksRepository.minusQuantityByStandardBookNumber(standardBookNumber, quantity);
    }

    @Override
    public Optional<EBooks> findById(Long id) {
        return booksRepository.findById(id);
    }

    @Override
    public void save(EBooks eBooks) {
        if (existsByStandardBookNumber(eBooks.getStandardBookNumber())){
            booksRepository.plusQuantityByStandardBookNumber(eBooks.getStandardBookNumber(), eBooks.getQuantity());
        } else {
            booksRepository.save(eBooks);
        }
    }

    @Override
    public void deleteById(Long id) {
        EBooks eBooks = booksRepository.findById(id).get();
        eBooks.setDeleted(true);
        booksRepository.save(eBooks);
    }
}
