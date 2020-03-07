package vut.fit.ija.homework1.myMaps;

import vut.fit.ija.homework1.Maps.Coordinate;

public class MyCoordinate implements Coordinate {
    private  int y_cord;
    private  int x_cord;


    private MyCoordinate(int x, int y){
        this.x_cord = x;
        this.y_cord = y;
    }

    @Override
    public boolean equals(Object o){
        if(o instanceof Coordinate){
            Coordinate cord = (Coordinate)o;
            return this.y_cord == cord.getY() && this.x_cord == cord.getX();
        }
        return false;
    }

    public static MyCoordinate create(int x, int y){
        if(x < 0 || y < 0){
            System.out.print("Some of parameters are less then 0");
            return null;
        }
        MyCoordinate cord = new MyCoordinate(x, y);
        System.out.println("Create new coordinate");
        System.out.println(x + " -- " + y);
        return cord;
    }

    public int getX(){
        System.out.print("Execute getX");
        return this.x_cord;
    }

    public int getY(){
        System.out.print("Execute getY");
        return this.y_cord;
    }

    public String toString(){
        return "["+this.x_cord+";"+this.y_cord+"]";
    }

}
