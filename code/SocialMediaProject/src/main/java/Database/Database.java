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
    public static List<Comment> getListComments(String postID) {
        // TODO implement here
        return null;
    }

    /**
     * @param mediaPath
     */
    public static void loadMedia(String mediaPath) {
        // TODO implement here
    }

    /**
     * @param cmt
     */
    public static void insertComment(Comment cmt) {
        // TODO implement here
    }


    public static void insertPost(Post p) {
        checkData(p);
        PostsData.insertPost(p);
    }

    /**
     * @param postID
     */
    public static void increaseLike(String postID) {
        // TODO implement here
    }

    /**
     * @param postID
     */
    public static void decreaseLike(String postID) {
        // TODO implement here
    }

    /**
     * @param postID 
     * @return
     */
    public static Post getPost(String postID) {
        return PostsData.getPost(postID);
    }

    /**
     * @param post
     */
    public static void checkData(Post post) {
        // TODO implement here
    }
    public static String generateID(){
        return PostsData.getSize() + "";
    }

}