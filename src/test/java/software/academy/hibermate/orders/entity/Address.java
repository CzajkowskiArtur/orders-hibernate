package software.academy.hibermate.orders.entity;

import javax.persistence.*;

@Entity
@Table(name= "address")
public class Address {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Integer id;
    @Column(name="street")
    private String street;

    @Column(name="city")
        private String city;

    @Column(name="postal_code")
    private String polsta_code;

    @OneToOne
    @PrimaryKeyJoinColumn
    private Address address;


    public Address(String street, String city, String polsta_code) {
        this.street = street;
        this.city = city;
        this.polsta_code = polsta_code;
    }
    public Address(){

    }

    public Address getAddress() {
        return address;
    }

    public Integer getId() {
        return id;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getPolsta_code() {
        return polsta_code;
    }
}
