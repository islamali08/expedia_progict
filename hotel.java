/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expedia_progict;

/**
 *
 * @author islaam
 */
public class hotel {

    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    String roomtyp;
    int avalible;
    int pricefornight;
    String date_from;
    String date_to;

    public hotel() {
    }

    public String getRoomtyp() {
        return roomtyp;
    }

    public void setRoomtyp(String roomtyp) {
        this.roomtyp = roomtyp;
    }

    public int getAvalible() {
        return avalible;
    }

    public void setAvalible(int avalible) {
        this.avalible = avalible;
    }

    public int getPricefornight() {
        return pricefornight;
    }

    public void setPricefornight(int pricefornight) {
        this.pricefornight = pricefornight;
    }

    public String getDate_from() {
        return date_from;
    }

    public void setDate_from(String date_from) {
        this.date_from = date_from;
    }

    public String getDate_to() {
        return date_to;
    }

    public void setDate_to(String date_to) {
        this.date_to = date_to;
    }

    public hotel(String name, String roomtyp, int avalible, int pricefornight, String date_from, String date_to) {
        this.roomtyp = roomtyp;
        this.avalible = avalible;
        this.pricefornight = pricefornight;
        this.date_from = date_from;
        this.date_to = date_to;
        this.name = name;
    }

    @Override
    public String toString() {
        return "hotel name : " + name + "roomtyp=" + roomtyp + ", avalible=" + avalible + ", pricefornight=" + pricefornight + ", date_from=" + date_from + ", date_to=" + date_to + '}';
    }

}
