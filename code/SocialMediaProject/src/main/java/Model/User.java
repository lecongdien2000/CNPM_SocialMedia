package Model;
import java.util.*;

/**
 * 
 */
public class User implements IUser {



    /**
     * 
     */
    public String id;

    /**
     * 
     */
    public String fullName;

    /**
     * 
     */
    public String username;

    /**
     * 
     */
    public String password;

    /**
     * 
     */
    public Date dateCreated;

    /**
     * 
     */
    public List<User> friends;




    public User(){
        //default value
        this.id = "-1";
        this.dateCreated = new Date(1,1,2000);
        this.username = "";
        this.password="";
    }

    public User(String id, String fullname, String username, String password, Date dateCreated) {
        this.username = username;
        this.password = password;
        this.id = id;
        this.dateCreated = dateCreated;
        this.fullName = fullname;
    }



    public String getFullname() {
        return fullName;
    }

    public void setFullname(String fullname) {
        this.fullName = fullname;
    }



    /**
     * @param userID 
     * @param postID
     */
    public void commentedNotify(String userID, String postID) {
        // TODO implement here
    }

    /**
     * @param userID 
     * @param postID
     */
    public void sharedNotify(String userID, String postID) {
        // TODO implement here
    }

    /**
     * 
     */
    public void updateNotif() {
        // TODO implement here
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
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

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public List<User> getFriends() {
        return friends;
    }

    public void setFriends(List<User> friends) {
        this.friends = friends;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", fullName='" + fullName + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", dateCreated=" + dateCreated +
                ", friends=" + friends +
                '}';
    }
}