package catalog;

import java.util.ArrayList;
import java.util.List;

public class PrintedFeatures implements Feature{

    private List<String> authors;
    private int numberOfPages;
    private String title;

    public PrintedFeatures(String title, int numberOfPages, List<String> authors) {
        if(authors == null || authors.size() == 0){
            throw new IllegalArgumentException("Authors are not specified!");
        }
        this.authors = authors;
        if(numberOfPages < 1){
            throw new IllegalArgumentException("Number of pages is not valid!");
        }
        this.numberOfPages = numberOfPages;
        if(title == null || "".equals(title)){
            throw new IllegalArgumentException("Empty title");
        }
        this.title = title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    @Override
    public List<String> getContributors() {
        List<String> result = new ArrayList<>(authors);
        return result;
    }

    @Override
    public String getTitle() {
        return this.title;
    }
}
