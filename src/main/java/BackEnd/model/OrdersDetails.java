package BackEnd.model;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
@Table(name = "orders_details")
public class OrdersDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Orders orders;

    @ManyToOne
    private EBooks eBooks;

    @NotNull
    private int Quantity;

    public OrdersDetails() {
    }

    public OrdersDetails(Long id, Orders orders, EBooks eBooks, int quantity) {
        this.id = id;
        this.orders = orders;
        this.eBooks = eBooks;
        Quantity = quantity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }

    public EBooks geteBooks() {
        return eBooks;
    }

    public void seteBooks(EBooks eBooks) {
        this.eBooks = eBooks;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }
}
