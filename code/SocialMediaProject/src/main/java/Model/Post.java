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
     * @param id
     * @param listPicture 
     * @param listVideo 
     * @param user
     */
    public Post createPost(String id,String text, List<String> listPicture, List<String> listVideo, String user) {
        // TODO implement here
        Post current = new Post();

        current.getContent().setText(text);
        current.getContent().setImages(listPicture);
        current.getContent().setVideos(listVideo);
        current.getUser().setUsername(user);

        return current;
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


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Content getContent() {
        return content;
    }

    public void setContent(Content content) {
        this.content = content;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<Like> getLikes() {
        return likes;
    }

    public void setLikes(List<Like> likes) {
        this.likes = likes;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public List<Share> getShares() {
        return shares;
    }

    public void setShares(List<Share> shares) {
        this.shares = shares;
    }

    public List<User> getTaggedFriends() {
        return taggedFriends;
    }

    public void setTaggedFriends(List<User> taggedFriends) {
        this.taggedFriends = taggedFriends;
    }
}