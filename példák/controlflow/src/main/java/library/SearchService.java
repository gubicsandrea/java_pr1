package library;

import java.util.List;
import java.util.stream.Collectors;

public class SearchService<T extends Item> {

    public T findFirst(List<T> items, SearchCriteria criteria){
        if(items == null){
            throw new IllegalArgumentException("List cannot be null");
        }
        for (T item: items) {
            if(criteria.pass(item)){
                return item;
            }
        }
        return null;
    }
}
