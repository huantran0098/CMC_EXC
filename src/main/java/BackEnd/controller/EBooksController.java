package BackEnd.controller;

import BackEnd.model.EBooks;
import BackEnd.service.IAuthorsService;
import BackEnd.service.IEBooksService;
import BackEnd.service.IPublishersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@RestController
@RequestMapping("/ebooks")
public class EBooksController {
    @Autowired
    private IEBooksService booksService;
    @Autowired
    IAuthorsService authorsService;
    @Autowired
    private IPublishersService publishersService;

    @PostMapping("/create/{idAuthors}/{idPublishers}")
    public ResponseEntity<?> addBook(@RequestBody EBooks eBooks, @PathVariable("idAuthors") Long idAuthors, @PathVariable("idPublishers") Long idPublishers){
        eBooks.setPublishers(publishersService.findById(idPublishers).get());
        eBooks.setAuthors(authorsService.findById(idAuthors).get());
        eBooks.setDeleted(false);
        booksService.save(eBooks);
        return new ResponseEntity<>(HttpStatus.OK);
    } //ok

    @PutMapping("/update")
    public ResponseEntity<?> updateBook(@RequestBody EBooks eBooks){
        if (!booksService.existsByIdBook(eBooks.getIdBook())){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            booksService.save(eBooks);
            return new ResponseEntity<>(HttpStatus.OK);
        }
    }
    @PutMapping("/delete/{idEBook}")
    public ResponseEntity<?> deleteBook(@PathVariable("idEBook") Long idEBook){
        if (booksService.existsByIdBook(idEBook)){
            booksService.deleteById(idEBook);
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    } //ok
}
