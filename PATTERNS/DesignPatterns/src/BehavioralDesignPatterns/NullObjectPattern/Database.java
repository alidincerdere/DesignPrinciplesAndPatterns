package BehavioralDesignPatterns.NullObjectPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by adere on 28.06.2019.
 */
public class Database {

    private List<String> customerNames;

    public Database() {

        customerNames = new ArrayList<>();

        customerNames.add("Dincer");
        customerNames.add("Zeynep");
        customerNames.add("Selma");
        customerNames.add("Tuncer");
        customerNames.add("Zeliha");


    }

    public boolean customerExists(String s) {

        for(String name : customerNames )
            if(name.equals(s))
                return true;
        return false;
    }
}
