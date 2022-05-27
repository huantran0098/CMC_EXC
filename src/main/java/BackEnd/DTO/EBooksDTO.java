package BackEnd.DTO;

public class EBooksDTO {
    private String title;
    private String standardBookNumber;
    private String descriptionBook;
    private Long idAuthors;
    private Long idPublishers;
    private int pages;
    private Long price;
    private int quantity;

    public EBooksDTO() {
    }

    public EBooksDTO(String title, String standardBookNumber, String descriptionBook, Long idAuthors, Long idPublishers, int pages, Long price, int quantity) {
        this.title = title;
        this.standardBookNumber = standardBookNumber;
        this.descriptionBook = descriptionBook;
        this.idAuthors = idAuthors;
        this.idPublishers = idPublishers;
        this.pages = pages;
        this.price = price;
        this.quantity = quantity;
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

    public Long getIdAuthors() {
        return idAuthors;
    }

    public void setIdAuthors(Long idAuthors) {
        this.idAuthors = idAuthors;
    }

    public Long getIdPublishers() {
        return idPublishers;
    }

    public void setIdPublishers(Long idPublishers) {
        this.idPublishers = idPublishers;
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
}
