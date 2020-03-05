package vut.fit.ija.homework1.myMaps;

import vut.fit.ija.homework1.Maps.Street;
import vut.fit.ija.homework1.Maps.StreetMap;
import java.util.ArrayList;
import java.util.List;

public class MyStreetMap implements StreetMap {
    private List<Street> streets;
    /**
     * Přidá ulici do mapy.
     * @param s Objekt reprezentující ulici.
     */

    public MyStreetMap(){
        this.streets = new ArrayList<>();
    }

    public void addStreet(Street s){
        this.streets.add(s);
    }

    /**
     * Vrátí objekt reprezentující ulici se zadaným id.
     * @param id Identifikátor ulice.
     * @return Nalezenou ulici. Pokud ulice s daným identifikátorem není součástí mapy, vrací null.
     */
    public Street getStreet(String id){
        return  null;
    }
}
