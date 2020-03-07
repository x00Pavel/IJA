package vut.fit.ija.homework1.myMaps;


import vut.fit.ija.homework1.Maps.Coordinate;
import vut.fit.ija.homework1.Maps.Stop;
import vut.fit.ija.homework1.Maps.Street;

public class MyStop implements Stop {
    private String stop_id = "Empty";
    private Coordinate stop_cord = null;
    private Street stop_street = null;

    public MyStop(String stop_name, Coordinate ... cord) {
        if (stop_name != null & !stop_name.isBlank()) {
            this.stop_id = stop_name;
        }
        
        try{
            System.out.println(cord[0].toString());
            this.stop_cord = cord[0];
        }
        catch(Exception e){
            System.out.println("Cord is null");

        }
    }
    
    @Override
    public boolean equals(Object o) {
        if (o instanceof Stop) {
            return this.stop_id.equals(((Stop)o).getId());
        }
        return false;
    }

    public String toString() {
        if (this.stop_id != null & this.stop_cord != null) {
            String str = "{\n\tStop ID:" + this.stop_id + "\n\tCoordinates: " + this.stop_cord.toString() + "\n";
            if (this.stop_street != null) {
                String tmp = "\tStreet: there is some string }\n";
                return str + tmp;
            } else {
                String tmp = "}\n";
                return str + tmp;
            }

        } else {
            if (this.stop_id != null) {
                System.out.println("stop id is null");
            }
            if (this.stop_street != null) {
                System.out.println("Stop street is null");
            }

            if (this.stop_cord != null) {
                System.out.println("Cord is null");
            }
        }
        return "FUCK";
    }

    /**
     * Vrátí identifikátor zastávky.
     * 
     * @return Identifikátor zastávky.
     */
    public String getId() {
        return this.stop_id;
    }

    /**
     * Vrátí pozici zastávky.
     * 
     * @return Pozice zastávky. Pokud zastávka existuje, ale dosud nemá umístění,
     *         vrací null.
     */
    public Coordinate getCoordinate() {
        return this.stop_cord;
    }

    /**
     * Nastaví ulici, na které je zastávka umístěna.
     * 
     * @param s Ulice, na které je zastávka umístěna.
     */
    public void setStreet(Street s) {
        if (s == null) {
            System.out.println("Street in setStreet is null");
        }
        this.stop_street = s;
    }

    /**
     * Vrátí ulici, na které je zastávka umístěna.
     * 
     * @return Ulice, na které je zastávka umístěna. Pokud zastávka existuje, ale
     *         dosud nemá umístění, vrací null.
     */
    public Street getStreet() {
        return this.stop_street;
    }

}