package Model;
import java.util.*;

/**
 *
 */
public class Content {
    public final static String[] imgTypes = {"jpg", "gif", "png"};
    public final static String[] videoTypes = {"mp4", "3gp", "mpeg"};
    public Content() {
        images = new ArrayList<>();
        videos = new ArrayList<>();
    }
    public String text;
    public List<String> images;
    public List<String> videos;

    public boolean isEmptyMedia(){
        return images.isEmpty()&videos.isEmpty();
    }
    @Override
    public String toString() {
        return "Content{" +
                "text='" + text + '\'' +
                ", images=" + images +
                ", videos=" + videos +
                '}';
    }
}