package catalog;

public final class SearchCriteria {

    String title;
    String contributor;

    public String getTitle() {
        return title;
    }

    public String getContributor() {
        return contributor;
    }

    public boolean hasTitle(){
        return false;
    }

    public boolean hasContributor(){
        return false;
    }

    public SearchCriteria createByTitle(String title){
        return null;
    }

    public SearchCriteria createByContributor(String contributor){
        return null;
    }

    public SearchCriteria createByBoth(String title, String contributor){
        return null;
    }

}
