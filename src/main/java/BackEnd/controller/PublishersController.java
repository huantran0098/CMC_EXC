package BackEnd.controller;

import BackEnd.model.Publishers;
import BackEnd.service.IPublishersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/publishers")
public class PublishersController {
    @Autowired
    private IPublishersService publishersService;

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody Publishers publishers){
        publishersService.save(publishers);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @PutMapping("/update/{idAuthors}")
    public ResponseEntity<?> update(@PathVariable Long idPublishers, Publishers publishers){
        if (!publishersService.existsByIdPublisher(idPublishers)){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            publishers.setIdPublisher(idPublishers);
            publishersService.save(publishers);
            return new ResponseEntity<>(HttpStatus.OK);
        }
    }
}
