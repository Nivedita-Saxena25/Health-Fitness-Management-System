package project.gym.pojos;
import jakarta.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "users")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long userID;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "contact_number")
    private String contactNumber;

    @Column(name = "email")
    private String email;

    @Column(name = "address")
    private String address;

    @Column(name = "health_records")
    private String healthRecords;

    @Column(name = "registration_date")
    @Temporal(TemporalType.DATE)
    private Date registrationDate;

    @OneToMany(mappedBy = "user")
    private List<Membership> memberships;

    @OneToMany(mappedBy = "user")
    private List<Attendance> attendances;

    @OneToMany(mappedBy = "user")
    private List<Booking> bookings;

    @OneToMany(mappedBy = "user")
    private List<BillingAndPayments> bills;

    @OneToMany(mappedBy = "user")
    private List<ReportsAndAnalytics> reports;

    @OneToMany(mappedBy = "user")
    private List<Communication> communications;

    @OneToMany(mappedBy = "user")
    private List<HealthAndFitnessTracking> trackings;

    @OneToMany(mappedBy = "user")
    private List<CustomerSupport> tickets;

    @OneToMany(mappedBy = "user")
    private List<SecurityAndPrivacy> securities;

    @OneToMany(mappedBy = "user")
    private List<FeedbackAndSurveys> surveys;

    // Constructors, getters, and setters...

    public Users() {
        // Default constructor
    }

    public Users(String firstName, String lastName, String contactNumber, String email, String address,
                String healthRecords, Date registrationDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.contactNumber = contactNumber;
        this.email = email;
        this.address = address;
        this.healthRecords = healthRecords;
        this.registrationDate = registrationDate;
    }

    public Long getUserID() {
        return userID;
    }

    public void setUserID(Long userID) {
        this.userID = userID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getHealthRecords() {
        return healthRecords;
    }

    public void setHealthRecords(String healthRecords) {
        this.healthRecords = healthRecords;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    // Additional methods, if needed
}