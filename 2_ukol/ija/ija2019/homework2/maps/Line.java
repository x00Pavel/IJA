package ija.ija2019.homework2.maps;

import ija.ija2019.homework2.maps.Stop;
import ija.ija2019.homework2.interfaces.MyLine;
import ija.ija2019.homework2.maps.Coordinate;

import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Line implements MyLine {
    private String id;

    private Line(String id) {
        this.id = id;
    }

    public static Line defaultLine(String id) {
        return new Line(id);
    }

    @Override
    public boolean addStop(Stop stop) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean addStreet(Street street) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public List<SimpleImmutableEntry<Street, Stop>> getRoute() {
        // TODO Auto-generated method stub
        return null;
    }

    
}