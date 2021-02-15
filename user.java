/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expedia_progict;

import static expedia_progict.fly_choic.icon;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author islaam
 */
public class user {

    Scanner in = new Scanner(System.in);
    ArrayList<user> username = new ArrayList<user>();

    String name = "";
    int pass;
    static int id;
static int id1 = 0;
    user(String name, int pass, int id) {
        this.name = name;
        this.pass = pass;
        this.id = id;
    }

    public static int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public user() {
    }

   

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPass() {
        return pass;
    }

    public void setPass(int pass) {
        this.pass = pass;
    }

    public int setid(int id) {
        return this.id = id;

    }
 public static int getId1() {
        return id1;
    }

    public void setId1(int id1) {
        this.id1 = id1;
    }
     @Override
    public String toString() {
        return "user " + "name=" + name + ", pass=" + pass +  "id"+id;
    }

    public void login() {
        user user1 = new user("islam", 123, 1);
        user user2 = new user("ali", 345, 2);
        username.add(user2);
        username.add(user1);
        System.out.println("inter name");
        String name = in.next();
        System.out.println("inter id");
        id1 = in.nextInt();
        setId1(id1);

        for (int x = 0; x < username.size(); x++) {
            if (name.equals(username.get(x).getName())) {
                System.out.println("halow " + name);
                userchoic();

            }
        }
        System.out.println("wrong user");
    }
    int choice;

    public void userchoic() {
        System.out.println("inter 1 for fly");
        System.out.println("inter 2 for hotel");
        System.out.println("inter 3 for profile");
        System.out.println("inter 4 to logout");
        choice = in.nextInt();
        switch (choice) {
            case 1:
                fly_choic f = new fly_choic();
                f.flu_page();
                break;
            case 2:
                hotel_choice h = new hotel_choice();
                h.hotelpage();
            case 3:

                userprofil();
            case 4:
                login();

        }
    }
 public void userprofil() {
        System.out.println(user.getId1());
        if (user.getId1() == 2) {
            System.out.println("your id : " + user.getId1());
            for (int x = 0; x < fly_choic.fly_choice.size(); x++) {

                System.out.println(fly_choic.fly_choice.get(x));

            }
            for (int y = 0; y < hotel_choice.islam_hotel.size(); y++) {
                System.out.println(hotel_choice.islam_hotel.get(y));
            }
            System.out.println("total travel mony " + fly_choic.icon);
            System.out.println("total hotil mony " + hotel_choice.itotal);

        }
        if (user.id1 == 1) {
            System.out.println("YOUR ID : " + user.getId1());
            for (int x = 0; x < fly_choic.fly_choicea.size(); x++) {

                System.out.println(fly_choic.fly_choicea.get(x));

            }
            for (int y = 0; y < hotel_choice.ali_hotel.size(); y++) {
                System.out.println(hotel_choice.ali_hotel.get(y));
            }
            System.out.println("total travel mony" + fly_choic.acon);
            System.out.println("total hotel mony" + hotel_choice.atotal);

        }
        user u = new user();
        u.userchoic();
    }
   

}
