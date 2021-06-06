import Database.Data.UsersData;
import Database.Database;
import Model.*;


public class Test {

    public static void main(String[] args){
        Post post = new Post();
        post.user.id = "abc";
        Database.insertPost(post);
    }
}
