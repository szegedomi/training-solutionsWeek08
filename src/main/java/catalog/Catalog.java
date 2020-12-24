package catalog;

import java.util.ArrayList;
import java.util.List;

public class Catalog {

    private List<CatalogItem> catalogItems = new ArrayList<>();

    public void addItem(CatalogItem catalogItem){
        this.catalogItems.add(catalogItem);
    }

    public double averagePageNumberOver(int over){
        return 0;
    }

    public void deleteItemByRegistrationNumber(String regNumber){
        int i = 0;
        for(CatalogItem item : catalogItems){
            if(regNumber.equals(item.getRegistrationNumber())){
                catalogItems.remove(i); //assuming that regNumber is unique, this method works fine otherwise for every found element i should be decremented
            }
            i++;
        }
    }

    public List<CatalogItem> findByCriteria(SearchCriteria sc){
        return null;
    }

    public int getAllPageNumber(){
        int result = 0;
        for (CatalogItem item : catalogItems){
            result += item.numberOfPagesAtOneItem();
        }
        return result;
    }

    public List<CatalogItem> getAudioLibraryItems(){
        return null;
    }

    public int getFullLength(){
        return 0;
    }

    public List<CatalogItem> getPrintedLibraryItems(){
        return null;
    }


}
