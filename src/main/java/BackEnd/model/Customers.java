package BackEnd.model;


import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "customers")
public class Customers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCustomers;
    @NotNull
    private String firstNameCustomers;
    @NotNull
    private String lastNameCustomers;
    @NotNull
    @Column(unique = true)
    @Email
    private String emailCustomers;
    @NotNull
    private String phoneCustomers;
    @NotNull
    private String addressCustomers;

    public Customers() {
    }

    public Customers(Long idCustomers, String firstNameCustomers, String lastNameCustomers, String emailCustomers, String phoneCustomers, String addressCustomers) {
        this.idCustomers = idCustomers;
        this.firstNameCustomers = firstNameCustomers;
        this.lastNameCustomers = lastNameCustomers;
        this.emailCustomers = emailCustomers;
        this.phoneCustomers = phoneCustomers;
        this.addressCustomers = addressCustomers;
    }

    public Long getIdCustomers() {
        return idCustomers;
    }

    public void setIdCustomers(Long idCustomers) {
        this.idCustomers = idCustomers;
    }

    public String getFirstNameCustomers() {
        return firstNameCustomers;
    }

    public void setFirstNameCustomers(String firstNameCustomers) {
        this.firstNameCustomers = firstNameCustomers;
    }

    public String getLastNameCustomers() {
        return lastNameCustomers;
    }

    public void setLastNameCustomers(String lastNameCustomers) {
        this.lastNameCustomers = lastNameCustomers;
    }

    public String getEmailCustomers() {
        return emailCustomers;
    }

    public void setEmailCustomers(String emailCustomers) {
        this.emailCustomers = emailCustomers;
    }

    public String getPhoneCustomers() {
        return phoneCustomers;
    }

    public void setPhoneCustomers(String phoneCustomers) {
        this.phoneCustomers = phoneCustomers;
    }

    public String getAddressCustomers() {
        return addressCustomers;
    }

    public void setAddressCustomers(String addressCustomers) {
        this.addressCustomers = addressCustomers;
    }
}
