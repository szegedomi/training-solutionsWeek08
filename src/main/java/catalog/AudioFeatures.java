package catalog;

import java.util.ArrayList;
import java.util.List;

public class AudioFeatures implements Feature{

    private List<String> composer;
    private int length;
    private List<String> performer;
    private String title;

    public AudioFeatures(String title, int length, List<String> performer) {
        if(length < 1){
            throw new IllegalArgumentException("Invalid length!");
        }
        this.length = length;
        if(title == null || "".equals(title)){
            throw new IllegalArgumentException("Missing performer!");
        }
        this.performer = performer;
        if(title == null || "".equals(title)){
            throw new IllegalArgumentException("Missing title!");
        }
        this.title = title;
    }

    public AudioFeatures( String title, int length, List<String> performer, List<String> composer) {
        this.composer = composer;
        this.length = length;
        this.performer = performer;
        this.title = title;
    }

    public int getLength() {
        return length;
    }

    public List<String> getContributors() {
        List<String> result = new ArrayList<String>();
        if(this.composer != null) {
            for (String element : this.composer) {
                result.add(element);
            }
        }
        for (String element : this.performer){
            result.add(element);
        }
        return result;
    }

    public String getTitle() {
        return title;
    }
}
