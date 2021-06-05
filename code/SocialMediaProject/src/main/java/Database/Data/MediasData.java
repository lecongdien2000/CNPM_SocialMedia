package Database.Data;

import Database.ConnectionDB;
import Model.Content;
import Model.Date;
import Model.User;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MediasData {
    //can't find anything
    public static List<String> getImgs(String mediaID) {
        List<String> values = new ArrayList<>();
        String sql = "SELECT * FROM media WHERE mediaID like "+ mediaID ;
        sql+=" AND ( mediaPath like '%." + Content.imgTypes[0] + "'";
        for(int i = 1; i < Content.imgTypes.length; i++){
            sql+=" OR mediaPath like '%." + Content.imgTypes[i] + "'";
        }
        sql+=")";
        return getDataQuery(sql);
    }

    private static List<String> getDataQuery(String query) {
        List<String> result = new ArrayList<>();
        try {
            Statement statement = null;
            statement = ConnectionDB.connect();
            ResultSet rs = statement.executeQuery(query);
            while(rs.next()){
               result.add(rs.getString("mediaPath"));
            }
            rs.close();
            statement.close();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return result;
    }

    public static List<String> getVideos(String mediaID) {
        List<String> values = new ArrayList<>();
        String sql = "SELECT * FROM media WHERE mediaID like "+ mediaID ;
        sql+=" AND ( mediaPath like '%." + Content.videoTypes[0] + "'";
        for(int i = 1; i < Content.videoTypes.length; i++){
            sql+=" OR mediaPath like '%." + Content.videoTypes[i] + "'";
        }
        sql+=")";
        return getDataQuery(sql);
    }
}
