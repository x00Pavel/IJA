package vut.fit.ija.homework1.myMaps;

import vut.fit.ija.homework1.Maps.Coordinate;
import vut.fit.ija.homework1.Maps.Stop;
import vut.fit.ija.homework1.Maps.Street;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyStreet implements Street {
    
    private String street_name;
    private List<Coordinate> cords;
    private List<Stop> street_stops = null;

    public MyStreet(String name, Coordinate point_1, Coordinate point_2) {
        this.street_name = name;
        this.cords = new ArrayList<>();
        cords.add(point_1);
        cords.add(point_2);
        this.street_stops = new ArrayList<>();
    }

    public String getId() {
        return this.street_name;
    }

    public List<Coordinate> getCoordinates() {
        return this.cords;
    }

    /**
     * Vrátí seznam zastávek na ulici.
     * 
     * @return Seznam zastávek na ulici. Pokud ulize nemá žádnou zastávku, je seznam
     *         prázdný.
     */
    public List<Stop> getStops() {
        return this.street_stops;
    }

    /**
     * Přidá do seznamu zastávek novou zastávku.
     * 
     * @param stop Nově přidávaná zastávka.
     */
    public void addStop(Stop stop) {
        stop.setStreet(this);
        this.street_stops.add(stop);
    }

    public String toString() {
        String str = "{\n\t" + this.street_name + " - (" + this.cords.toString() + " " + this.cords.toString()
                + ")\n";
        if (this.street_stops != null) {
            String tmp = "\tStops: " + this.street_stops.toString() + "\n}\n";
            return str + tmp;
        } else {
            assert this.street_stops != null;
            String tmp = "\tStops: " + Arrays.toString(this.street_stops.toArray()) + "\n}\n";
            return str + tmp;
        }

    }
}
