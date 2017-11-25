package software.academy.hibermate.orders.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="[order]")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name="client_id")
    private Client client;

    @Column(name="inser_date")
    private Date insertDate;

    @Column(name="update_date")
    private Date updateDate;


    @Column(name="status")
    @Enumerated(EnumType.STRING)
    private OrderStatus status;

 @Column(name="update_date")
    private BigDecimal totalCost;

    public Order(Client client, Date insertDate, Date updateDate, OrderStatus status, BigDecimal totalCost) {
        this.client = client;
        this.insertDate = insertDate;
        this.updateDate = updateDate;
        this.status = status;
        this.totalCost = totalCost;
    }

    public Order(){

    }

    @OneToMany(mappedBy = "order",cascade = CascadeType.ALL)
    private List<OrderItem> orderItems = new ArrayList<OrderItem>();

    public void addItem(Product product,Integer quantity){
        OrderItem orderItem = new OrderItem(this, product, quantity);
        orderItems.add(orderItem);
    }


    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public Integer getId() {
        return id;
    }

    public Client getClient() {
        return client;
    }

    public Date getInsertDate() {
        return insertDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public BigDecimal getTotalCost() {
        return totalCost;
    }
}
