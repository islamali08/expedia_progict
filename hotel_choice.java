/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expedia_progict;

import static expedia_progict.fly_choic.acon;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author islaam
 */
public class hotel_choice {

    Scanner in = new Scanner(System.in);
    static ArrayList<hotel_choice> islam_hotel = new ArrayList<hotel_choice>();
    static ArrayList<hotel_choice> ali_hotel = new ArrayList<hotel_choice>();

    @Override
    public String toString() {
        return "hotel_choice{" + name + ", from_date=" + from_date + ", to_date=" + to_date + ", country=" + country + ", city=" + city + ", children=" + children + ", price=" + price + ", name=" + name + '}';
    }
    String from_date;
    String to_date;
    String country;
    String city;
    int children;
  static  int price;
    String name;

    public hotel_choice(String name, String from_date, String to_date, String country, String city, int children) {
        this.from_date = from_date;
        this.to_date = to_date;
        this.country = country;
        this.city = city;
        this.children = children;
        this.price = price;
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public hotel_choice() {
    }

    public String getFrom_date() {
        return from_date;
    }

    public void setFrom_date(String from_date) {
        this.from_date = from_date;
    }

    public String getTo_date() {
        return to_date;
    }

    public void setTo_date(String to_date) {
        this.to_date = to_date;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    static int itotal;
    static int atotal;

    public void hotelpage() {

        hotel hilton = new hotel(" hilton ", "cityview", 3, 300, "29-10-2020", "29-10-2023");
        hotel mariot = new hotel("mariot ", "doorview", 6, 500, "25-10-2020", "25-11-2021");
        ArrayList<hotel> hotel_array = new ArrayList<>();
        hotel_array.add(hilton);
        hotel_array.add(mariot);
        System.out.println("inter from date");
        String from = in.next();
        System.out.println("inter to date");
        String to = in.next();
        System.out.println("inter country");
        String country = in.next();
        System.out.println("inter city");
        String city = in.next();
        System.out.println("inter childrin");
        int cheldrin = in.nextInt();
        for (int x = 0; x < hotel_array.size(); x++) {
            System.out.println(hotel_array.get(x));

        }
        System.out.println("choice");
        int choice = in.nextInt();
        if (user.getId1() == 2) {
            itotal += hotel_array.get(choice - 1).getAvalible() * hotel_array.get(choice - 1).getPricefornight();
            
        } else if (user.getId1() == 1) {
            atotal += hotel_array.get(choice - 1).getAvalible() * hotel_array.get(choice - 1).getPricefornight();
        }
        int price1=hotel_array.get(choice-1).getAvalible()*hotel_array.get(choice-1).getPricefornight();
        setPrice(price1);
        hotel_choice hot = new hotel_choice(hotel_array.get(choice - 1).getName(), from, to, country, city, cheldrin);
        System.out.println(user.id1);
        if (user.getId1() == 1) {
            ali_hotel.add(hot);
        } else if (user.getId1() == 2) {
            islam_hotel.add(hot);
        }
        System.out.println("done");
        
        user n = new user();
        n.userchoic();
    }

}
