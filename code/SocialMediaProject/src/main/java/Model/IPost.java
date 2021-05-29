package Model;
import java.util.*;

/**
 * 
 */
public interface IPost {




    /**
     * 
     */
    public void notif();

    /**
     * @param user
     */
    public void addTaggedFriend(IUser user);

    /**
     * @param user
     */
    public void removeTaggedFriend(IUser user);

}