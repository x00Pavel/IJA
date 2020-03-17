package vut.fit.ija.homework1.myMaps;

import vut.fit.ija.homework1.maps.Coordinate;

public class MyCoordinate implements Coordinate {
    private  int y_cord;
    private  int x_cord;


    public MyCoordinate(int x, int y){
        this.x_cord = x;
        this.y_cord = y;
   } 

    @Override
    public boolean equals(Object o){
        if(o instanceof Coordinate){
            Coordinate cord = (Coordinate)o;
            if(this.hashCode() ==cord.hashCode()){
                return this.y_cord == cord.getY() && this.x_cord == cord.getX();
            }
            else{
                return false;
            }
        }
        return false;
    }

    @Override
    public int hashCode(){
        final int prime = 31;
        int res = 1;
        return  prime * res + this.x_cord + this.y_cord;
         
    }

    public static MyCoordinate create(int x, int y){
        if(x < 0 || y < 0){
            return null;
        }
        MyCoordinate cord = new MyCoordinate(x, y);
        return cord;
    }

    public int getX(){
        return this.x_cord;
    }

    public int getY(){
        return this.y_cord;
    }

    public String toString(){
        return "["+this.x_cord+";"+this.y_cord+"]";
    }

}
