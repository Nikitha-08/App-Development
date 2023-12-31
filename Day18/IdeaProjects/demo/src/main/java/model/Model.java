package model;


import jakarta.persistence.Entity;


import jakarta.persistence.Table;
import org.springframework.data.annotation.Id;

@Entity
@Table(name="Feedback")
public class Model {
    @Id
    private int id;
    private String username;
    private String password;

    private String feedback;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback)
    {
        this.feedback = feedback;
    }

    public Model(int id, String username, String password,String feedback) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.feedback = feedback;
    }
    public Model() {

    }
}
