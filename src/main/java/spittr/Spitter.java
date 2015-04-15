package spittr;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.hibernate.validator.constraints.Email;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


/**
 * Created by hudectom on 5.4.2015.
 */
public class Spitter {

    private Long id;

    @NotNull
    @Size(min=5, max=16, message = "{username.size}")
    private String username;

    @NotNull
    @Size(min=5, max=25, message = "{password.size}")
    private String password;

    @NotNull
    @Size(min=2, max=30, message = "{firstName.size}")
    private String firstName;

    @NotNull
    @Size(min=2, max=30, message = "{lastName.size}")
    private String lastName;

    @NotNull
    @Email
    private String email;

    public Spitter() {}

    public Spitter(String firstName, String lastName, String email, String username, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.username = username;
        this.password = password;
    }

    public Spitter(Long id, String firstName, String lastName, String username, String password) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public boolean equals(Object obj) {
        return EqualsBuilder.reflectionEquals(this, obj, "firstName", "lastName", "email","username", "password");
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this, "firstName", "lastName", "email", "username", "password");
    }
}
