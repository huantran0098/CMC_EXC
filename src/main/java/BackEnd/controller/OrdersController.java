package BackEnd.controller;

import BackEnd.model.Authors;
import BackEnd.model.Customers;
import BackEnd.model.EBooks;
import BackEnd.model.Publishers;
import BackEnd.service.IAuthorsService;
import BackEnd.service.IEBooksService;
import BackEnd.service.IOrdersService;
import BackEnd.service.IPublishersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrdersController {
    @Autowired
    private IOrdersService ordersService;
    @Autowired
    private IAuthorsService authorsService;
    @Autowired
    private IPublishersService publishersService;
    @Autowired
    private IEBooksService booksService;

    @PostMapping("/create")
    public ResponseEntity<?> createOrders(@Param("standardBookNumber") String standardBookNumber, int addQuantity, @RequestBody Customers customers){
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
