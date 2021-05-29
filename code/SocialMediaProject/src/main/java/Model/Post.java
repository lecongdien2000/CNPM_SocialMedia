package Model;
import java.util.*;

/**
 * 
 */
public class Post implements IPost {

    /**
     * Default constructor
     */
    public Post() {
    }

    /**
     * 
     */
    public String id;

    /**
     * 
     */
    public User user;

    /**
     * 
     */
    public Content content;

    /**
     * 
     */
    public Date date;

    /**
     * 
     */
    public List<Like> likes;

    /**
     * 
     */
    public List<Comment> comments;

    /**
     * 
     */
    public List<Share> shares;

    /**
     * 
     */
    public List<User> taggedFriends;












    /**
     * @param text 
     * @param listPicture 
     * @param listVideo 
     * @param user
     */
    public void createPost(String text, List<String> listPicture, List<String> listVideo, String user) {
        // TODO implement here
    }

    /**
     * @param text 
     * @param post
     */
    public void createPost(String text, Post post) {
        // TODO implement here
    }

    /**
     * 
     */
    public void notif() {
        // TODO implement here
    }

    /**
     * @param user
     */
    public void addTaggedFriend(IUser user) {
        // TODO implement here
    }

    /**
     * @param user
     */
    public void removeTaggedFriend(IUser user) {
        // TODO implement here
    }

}