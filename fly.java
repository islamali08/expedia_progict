/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expedia_progict;

import java.util.ArrayList;

/**
 *
 * @author islaam
 */
public class fly {

    String name = "";
    String from = "";
    String TO = "";
    int children;
    static int price;

  

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getChildren() {
        return children;
    }

    public void setChildren(int children) {
        this.children = children;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "fly name " + name + " from " + from + " TO " + TO + "  " + "price " + price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTO() {
        return TO;
    }

    public void setTO(String TO) {
        this.TO = TO;
    }

    public fly(String name, String to, String from, int price) {
        this.name = name;
        this.TO = to;
        this.from = from;
        this.price = price;
    }

}
