package entity;

import javax.persistence.*;

@Entity
public class Favorite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User user;

    @ManyToOne
    private Product product;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public entity.User getUser() {
        return user;
    }

    public void setUser(entity.User user) {
        this.user = user;
    }

    public entity.Product getProduct() {
        return product;
    }

    public void setProduct(entity.Product product) {
        this.product = product;
    }
}