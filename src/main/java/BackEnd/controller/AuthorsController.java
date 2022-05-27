package BackEnd.controller;

import BackEnd.model.Authors;
import BackEnd.service.IAuthorsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/authors")
public class AuthorsController {

    @Autowired
    private IAuthorsService authorsService;

    @GetMapping("/information/{idAuthors}")
    public ResponseEntity<?> getAuthorsDetails(@PathVariable Long idAuthors){
        int countBook = authorsService.getAuthorsBookCount(idAuthors);
        // chưa tìm ra danh sách 3 đầu sách bán chạy nhất
        return new ResponseEntity<>(countBook, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody Authors authors){
        if (!authorsService.existsByIdAuthors(authors.getIdAuthors())){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        } else {
            authorsService.save(authors);
            return new ResponseEntity<>(HttpStatus.OK);
        }
    }
    @PutMapping("/update/{idAuthors}")
    public ResponseEntity<?> update(@PathVariable Long idAuthors, @RequestBody Authors authors){
        if (!authorsService.existsByIdAuthors(idAuthors)){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        } else {
            authors.setIdAuthors(idAuthors);
            authorsService.save(authors);
            return new ResponseEntity<>(HttpStatus.OK);
        }
    }
    @DeleteMapping("/delete/{idAuthors}")
    public ResponseEntity<?> delete(@PathVariable Long idAuthors){
        if (!authorsService.existsByIdAuthors(idAuthors)){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        } else {
            authorsService.deleteById(idAuthors);
            return new ResponseEntity<>(HttpStatus.OK);
        }
    }

}
