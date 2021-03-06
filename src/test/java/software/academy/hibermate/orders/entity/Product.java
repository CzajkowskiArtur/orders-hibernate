package software.academy.hibermate.orders.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name="product")
public class Product implements Serializable{

    @Id
    private Integer id;
    private String name;
    private BigDecimal price;

    public Product() {

    }

    public Integer getId() {
        return id;
    }

    public BigDecimal getPrice() {
        return price;
    }



    public String getName() {
        return name;


    }
}
