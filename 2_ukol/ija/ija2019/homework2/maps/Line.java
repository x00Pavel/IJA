package ija.ija2019.homework2.maps;

import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import ija.ija2019.homework2.interfaces.MyLine;

public class Line implements MyLine {
    private String id;
    private List<SimpleImmutableEntry<Street,Stop>> line_route;
    private List<Stop> stops;

    public Line(String id) {
        this.line_route = new ArrayList<>();
        this.stops = new ArrayList<>();
        this.id = id;
    }

    public static Line defaultLine(String id) {
        return new Line(id);
    }

    public boolean addStop(Stop stop) {
        int number_of_stops = this.line_route.size();
        if (number_of_stops == 0) {
            SimpleImmutableEntry<Street,Stop> tuple = new SimpleImmutableEntry<>(stop.getStreet(), stop);
            this.line_route.add(tuple);
            this.stops.add(stop);
            return true;
        } else {
            SimpleImmutableEntry<Street, Stop> last_stop = this.line_route.get(number_of_stops - 1);
            Street str = last_stop.getKey();
            // Stop last_stop = this.stops.get(number_of_stops-1);
            if(str.follows(stop.getStreet())){
                SimpleImmutableEntry<Street, Stop> tuple = new SimpleImmutableEntry<>(stop.getStreet(), stop);
                this.line_route.add(tuple);
                this.stops.add(stop);
                return true; 
            }
        }
        return false;
    }

    @Override
    public boolean addStreet(Street street) {
        int number_of_stops = this.line_route.size();
        if (number_of_stops == 0) {
            SimpleImmutableEntry<Street, Stop> tuple = new SimpleImmutableEntry<>(street, null);
            this.line_route.add(tuple);
            return true;
        } else {
            SimpleImmutableEntry<Street, Stop> last_stop = this.line_route.get(number_of_stops-1);
            Street str = last_stop.getKey();

            if(str.follows(street)){
                SimpleImmutableEntry<Street, Stop> tuple = new SimpleImmutableEntry<>(street, null);
                this.line_route.add(tuple);
                return true;
            }
        }
        return false;
    }

    @Override
    public List<SimpleImmutableEntry<Street, Stop>> getRoute() {
        return Collections.unmodifiableList(this.line_route);
    }

}