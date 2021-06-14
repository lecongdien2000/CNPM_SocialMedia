import Database.Data.UsersData;
import Database.Database;
import Model.*;


public class Test {

    public static void main(String[] args){
        //create post test
        Post post = new Post();
        post.user.id = "0";
        post.content.images.add("imgs/selfie.png");
        Database.insertPost(post);
        //get post test
        Post post2 = Database.getPost("0");
        System.out.print(post2);
    }
}
