package BackEnd.model;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "books")
public class EBooks {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBook;
    @NotNull
    private String title;
    @NotNull
    @Column(unique = true)
    private String standardBookNumber;
    private String descriptionBook;

    @ManyToOne
    private Authors authors;

    @ManyToOne
    private Publishers publishers;
    @NotNull
    private Date publicationDate;
    private int pages;
    private Long price;
    private int quantity;

    private Boolean isDeleted = false;

    public EBooks() {
    }

    public EBooks(String title, String standardBookNumber, String descriptionBook, int pages, Long price, int quantity) {
        this.title = title;
        this.standardBookNumber = standardBookNumber;
        this.descriptionBook = descriptionBook;
        this.pages = pages;
        this.price = price;
        this.quantity = quantity;
    }

    public EBooks(Long idBook, String title, String standardBookNumber, String descriptionBook, Publishers publishers, Authors authors, Date publicationDate, int pages, Long price, int quantity, Boolean isDeleted) {
        this.idBook = idBook;
        this.title = title;
        this.standardBookNumber = standardBookNumber;
        this.descriptionBook = descriptionBook;
        this.publishers = publishers;
        this.authors = authors;
        this.publicationDate = publicationDate;
        this.pages = pages;
        this.price = price;
        this.quantity = quantity;
        this.isDeleted = isDeleted;
    }

    public Long getIdBook() {
        return idBook;
    }

    public void setIdBook(Long idBook) {
        this.idBook = idBook;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStandardBookNumber() {
        return standardBookNumber;
    }

    public void setStandardBookNumber(String standardBookNumber) {
        this.standardBookNumber = standardBookNumber;
    }

    public String getDescriptionBook() {
        return descriptionBook;
    }

    public void setDescriptionBook(String descriptionBook) {
        this.descriptionBook = descriptionBook;
    }

    public Publishers getPublishers() {
        return publishers;
    }

    public void setPublishers(Publishers publishers) {
        this.publishers = publishers;
    }

    public Authors getAuthors() {
        return authors;
    }

    public void setAuthors(Authors authors) {
        this.authors = authors;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Boolean getDeleted() {
        return isDeleted;
    }

    public void setDeleted(Boolean deleted) {
        isDeleted = deleted;
    }
}
