import Database.Data.UsersData;
import Entity.User;

public class Test {

    public static void main(String[] args){
        User user = UsersData.getUsers("abc");
        System.out.print(user.getPassword());

    }
}
