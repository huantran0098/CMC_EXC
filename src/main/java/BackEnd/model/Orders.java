package BackEnd.model;


import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "orders")
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idOrders;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_customers")
    private Customers customers;

    private Date createdDate;

    @ManyToMany
    @JoinTable(name = "orders_cart",
                joinColumns = @JoinColumn(name = "id_ebooks"),
                inverseJoinColumns = @JoinColumn(name = "quantity"))
    private Set<EBooks> eBooks;


    public Orders() {
    }

    public Orders(Long idOrders, Customers customers, Date createdDate, Set<EBooks> eBooks) {
        this.idOrders = idOrders;
        this.customers = customers;
        this.createdDate = createdDate;
        this.eBooks = eBooks;
    }

    public Long getIdOrders() {
        return idOrders;
    }

    public void setIdOrders(Long idOrders) {
        this.idOrders = idOrders;
    }

    public Customers getCustomers() {
        return customers;
    }

    public void setCustomers(Customers customers) {
        this.customers = customers;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Set<EBooks> geteBooks() {
        return eBooks;
    }

    public void seteBooks(Set<EBooks> eBooks) {
        this.eBooks = eBooks;
    }
}
