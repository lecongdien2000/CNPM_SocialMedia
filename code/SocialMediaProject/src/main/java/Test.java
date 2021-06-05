import Database.Data.UsersData;
import Database.Database;
import Model.*;
public class Test {

    public static void main(String[] args){
        Post post = Database.getPost("0");
        System.out.print(post);
    }
}
