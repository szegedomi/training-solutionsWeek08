package catalog;

import java.util.ArrayList;
import java.util.List;

public class CatalogItem {

    private List<Feature> features = new ArrayList<>();
    private int price;
    private String registrationNumber;

    public CatalogItem(String registrationNumber, int price, List<Feature> features) {
        if(features == null){
            throw  new IllegalArgumentException("Feature is not specified!");
        }
        this.features = features;
        if(price<1){
            throw new IllegalArgumentException("Price is not valid!");
        }
        this.price = price;
        if(registrationNumber == null || "".equals(registrationNumber)){
            throw new IllegalArgumentException("No registration number is specified!");
        }
        this.registrationNumber = registrationNumber;
    }

    public List<Feature> getFeatures() {
        List<Feature> result = new ArrayList<>(this.features);
        return result;
    }

    public int getPrice() {
        return price;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public int fullLengthAtOneItem(){
        return 0;
    }

    public List<String> getContributors(){
        return null;
    }

    public List<String> getTitles(){
        return null;
    }

    public boolean hasAudioFeature(){
        for (Feature feature : features){
            if(feature instanceof AudioFeatures){
                return true;
            }
        }
        return false;
    }

    public boolean hasPrintedFeature(){
        for (Feature feature : features){
            if(feature instanceof PrintedFeatures){
                return true;
            }
        }
        return false;
    }

    public int numberOfPagesAtOneItem(){
        return 0;
    }

}
