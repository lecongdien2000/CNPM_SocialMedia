package Controller;
import java.util.*;

/**
 * 
 */
public class Controller {

    /**
     * Default constructor
     */
    public Controller() {
    }

    /**
     * @param postID
     */
    public void loadListComments(String postID) {
        // TODO implement here
    }

    /**
     * @param text 
     * @return
     */
    public boolean checkLength(String text) {
        // TODO implement here
        return false;
    }

    /**
     * @return
     */
    public boolean checkAlreadyLoaded() {
        // TODO implement here
        return false;
    }

    /**
     * @param mediaPath 
     * @return
     */
    public boolean checkSize(String mediaPath) {
        // TODO implement here
        return false;
    }

    /**
     * @param text 
     * @param mediaPath 
     * @return
     */
    public boolean checkEmptyComment(String text, String mediaPath) {
        // TODO implement here
        return false;
    }

    /**
     * @param userID 
     * @param postID 
     * @param text 
     * @param mediaPath
     */
    public void postComment(String userID, String postID, String text, String mediaPath) {
        // TODO implement here
    }


    public boolean post(String text, List<String> listPicture, List<String> listVideo) {
        // TODO implement here
        return false;
    }

    /**
     * @param postID 
     * @param userID
     */
    public void like(String postID, String userID) {
        // TODO implement here
    }

}