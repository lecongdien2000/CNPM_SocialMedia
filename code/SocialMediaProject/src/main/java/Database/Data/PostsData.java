package Database.Data;
import Database.ConnectionDB;
import Model.*;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PostsData {

    public static void insertPost(Post post){
        if(post.content != null) insertMedia(post);
        try {
            PreparedStatement state1 = ConnectionDB.connect("insert into post" +
                    " values(?, ?, ?, ?, ?)");
            state1.setString(1, post.id); //insert user id
            state1.setString(2, post.user.id);
            state1.setString(3, post.content.text);
            state1.setString(4, post.id);
            state1.setDate(5, java.sql.Date.valueOf(post.date.convertDateToSqlString()));
            state1.executeUpdate();
            state1.close();
        }catch(ClassNotFoundException| SQLException e){
            e.printStackTrace();
        }
    }

    private static void insertMedia(Post post) {
        for(String img: post.content.images){
            insertMedia(post.id, img);
        }
        for(String video: post.content.videos){
            insertMedia(post.id, video);
        }
    }

    private static void insertMedia(String mediaID, String mediaPath){
        try {
            PreparedStatement state1 = ConnectionDB.connect("insert into media" +
                    " values(?, ?)");
            state1.setString(1, mediaID); //insert user id
            state1.setString(2, mediaPath);
            state1.executeUpdate();
            state1.close();
        }catch(ClassNotFoundException| SQLException e){
            e.printStackTrace();
        }
    }



    public static int getSize() {
        List<User> result = new ArrayList<>();
        int size =0;
        try {
            Statement statement = null;
            statement = ConnectionDB.connect();
            ResultSet rs = statement.executeQuery("SELECT * FROM post");
            if (rs != null)
            {
                rs.last();
                size = rs.getRow();
            }

            rs.close();
            statement.close();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return size;
    }



}
