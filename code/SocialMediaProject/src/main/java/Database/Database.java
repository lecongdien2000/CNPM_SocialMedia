package Database;
import Model.Comment;
import Model.Post;
import Database.Data.*;
import java.util.*;

/**
 * 
 */
public class Database {

    /**
     * Default constructor
     */
    public Database() {
    }

    /**
     * @param postID 
     * @return
     */
    public List<Comment> getListComments(String postID) {
        // TODO implement here
        return null;
    }

    /**
     * @param mediaPath
     */
    public void loadMedia(String mediaPath) {
        // TODO implement here
    }

    /**
     * @param cmt
     */
    public void insertComment(Comment cmt) {
        // TODO implement here
    }


    public void insertPost(Post p) {
        checkData(p);
        PostsData.insertPost(p);
    }

    /**
     * @param postID
     */
    public void increaseLike(String postID) {
        // TODO implement here
    }

    /**
     * @param postID
     */
    public void decreaseLike(String postID) {
        // TODO implement here
    }

    /**
     * @param postID 
     * @return
     */
    public Post getPost(String postID) {
        // TODO implement here
        return null;
    }

    /**
     * @param post
     */
    public void checkData(Post post) {
        // TODO implement here
    }

}