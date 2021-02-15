/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expedia_progict;

import static expedia_progict.user.getId;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author islaam
 */
public class fly_choic {

    Scanner in = new Scanner(System.in);
    static ArrayList<fly_choic> fly_choice = new ArrayList<fly_choic>();
    static ArrayList<fly_choic> fly_choicea = new ArrayList<fly_choic>();

    String name = "";
    String from = "";
    String TO = "";
    int children;
    static int price;
  public fly_choic(int children, int price, String name, String from, String to) {
        this.children = children;
        this.price = price;
        this.from = from;
        this.TO = to;
        this.name = name;
    }

  

    public String getName() {
        return name;
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

    public int getChildren() {
        return children;
    }

    public void setChildren(int children) {
        this.children = children;
    }

    public int getPrice() {
        return price;
    }

    public fly_choic() {
    }

  
    public void setPrice(int price) {
        this.price = price;
    }
      @Override
    public String toString() {
        return " name of fly company : " + name + "  from " + from + ", TO " + TO + ", children=" + children + " price " + price;
    }
    static int icon = 0;
    static int acon = 0;

    public void flu_page() {

        fly turky = new fly("turky fly", "2020", "2021", 300);
        fly amerca = new fly("amerca fly", "2030", "2040", 500);
        ArrayList<fly> flyarray = new ArrayList<fly>();
        flyarray.add(amerca);
        flyarray.add(turky);

        System.out.println("INTER from");
        String from = in.next();
        System.out.println("INTER to");
        String to = in.next();
        System.out.println("inter children");
        int child = in.nextInt();
        for (int x = 0; x < flyarray.size(); x++) {
            System.out.println(flyarray.get(x));

        }
        System.out.println("choice");
        int choice = in.nextInt();
        if (user.getId1() == 1) {
            acon += flyarray.get(choice - 1).getPrice();
        } else if (user.getId1() == 2) {
            icon += flyarray.get(choice - 1).getPrice();
        }

        fly_choic f = new fly_choic(child, flyarray.get(choice - 1).getPrice(), flyarray.get(choice - 1).getName(), from, to);

        if (user.id1 == 1) {
            fly_choicea.add(f);
        } else if (user.id1 == 2) {
            fly_choice.add(f);
        }

        System.out.println("done");
        user n = new user();
        n.userchoic();
    }

   

}
