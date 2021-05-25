
import java.util.*;

/**
 * 
 */
public class Post {

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

}