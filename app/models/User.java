package models;

import play.db.jpa.*;
import play.data.validation.*;
import javax.persistence.*;

@Entity
@Table(name="clov4r_user")
public class User extends Model {
	
	@Column(name="username")
    @Required
    @MaxSize(15)
    @MinSize(4)
    @Match(value="^\\w*$", message="Not a valid username")
    public String username;

	@Column(name="password")
    @Required
    @MaxSize(15)
    @MinSize(5)
    public String password;

	@Column(name="name")
    @Required
    @MaxSize(100)
    public String name;
   
    public User(String name, String password, String username) {
        this.name = name;
        this.password = password;
        this.username = username;
    }

    public String toString()  {
        return "User(" + username + ")";
    }
    
}
