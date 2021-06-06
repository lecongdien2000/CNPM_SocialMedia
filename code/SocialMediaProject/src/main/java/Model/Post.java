package Model;
import java.util.*;
import Database.*;
/**
 * 
 */
public class Post implements IPost {

    /**
     * Default constructor
     */
    public Post() {
        id = Database.generateID();
        user = new User();
        content = new Content();
        date = Date.convertSqlStringToDate(java.time.LocalDate.now().toString(), java.time.LocalTime.now().toString());
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

    @Override
    public String toString() {
        return "Post{" +
                "id='" + id + '\'' +
                ", user=" + user +
                ", content=" + content +
                ", date=" + date +
                '}';
    }
}