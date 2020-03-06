package vut.fit.ija.homework1.myMaps;

import vut.fit.ija.homework1.Maps.Street;
import vut.fit.ija.homework1.Maps.StreetMap;
import java.util.ArrayList;
import java.util.List;

public class MyStreetMap implements StreetMap {
    private List<Street> streets;

    public MyStreetMap(){
        this.streets = new ArrayList<>();
    }

    public void addStreet(Street s){
        this.streets.add(s);
    }

    public Street getStreet(String id){
        for(int i = 0; i < this.streets.size(); i++){
            if (this.streets.get(i).getId() == id) {
                return this.streets.get(i);
            }
        }
        return  null; // If there is no street with given ID
    }

    public String toString(){
        String delim = "-";

        StringBuilder sb = new StringBuilder();

        int i = 0;
        while (i < this.streets.size() - 1) {
            sb.append(this.streets.get(i).getId());
            sb.append(delim);
            i++;
        }
        sb.append(this.streets.get(i).getId());
        return sb.toString();
    }
}
