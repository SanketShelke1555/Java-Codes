import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "cust")
public class Customer {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "mono")
    private long mono;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
        name = "customer_product",
        joinColumns = @JoinColumn(name = "customer_id"),
        inverseJoinColumns = @JoinColumn(name = "product_id")
    )
    private Set<Product> products = new HashSet<>();

    // Default Constructor
    public Customer() {
    }

    // Parameterized Constructor
    public Customer(int id, String name, long mono) {
        this.id = id;
        this.name = name;
        this.mono = mono;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getMono() {
        return mono;
    }

    public void setMono(long mono) {
        this.mono = mono;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Customer [id=" + id +
                ", name=" + name +
                ", mono=" + mono + "]";
    }
}