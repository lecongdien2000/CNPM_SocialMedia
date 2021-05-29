package Model;
import java.util.*;

/**
 * 
 */
public class User implements IUser {

    /**
     * Default constructor
     */
    public User() {
    }

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

}