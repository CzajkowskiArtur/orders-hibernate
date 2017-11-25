package software.academy.hibermate.orders.entity;


import javax.persistence.*;

@Entity
@Table(name = "client")
public class Client {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    @Column(name = "first name")
    private String firstName;
    @Column(name = "second name")
    private String secondName;
    @Column(name = "email")
    private String email;

    @Column(name = "type")
    @Enumerated(EnumType.STRING)
    private ClientType type;
    private Object street;

    @OneToOne(fetch=FetchType.LAZY)
    @PrimaryKeyJoinColumn
    private Address address;


    public Address getAddress() {
        return address;
    }

    public Client(Integer id, String firstName, String secondName, String email, ClientType type) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.email = email;
        this.type = type;
        this.id=id;
    }

    public Client(){

    }
    public Client(String firstName, String secondName, String email, ClientType type) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.email = email;
        this.type = type;

    }





    public Integer getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getEmail() {
        return email;
    }

    public ClientType getType() {
        return type;
    }

    public Object getStreet() {
        return street;
    }
}
