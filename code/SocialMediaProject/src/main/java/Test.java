import Database.Data.UsersData;
import Database.Database;
import Model.*;

public class Test {

    public static void main(String[] args){
        Post post = new Post();
        post.user.id = "abc";
        post.content.images.add("NULL_IMG");
        post.content.videos.add("NULL_VIDEO");
        Database db = new Database();
        db.insertPost(post);
    }
}
