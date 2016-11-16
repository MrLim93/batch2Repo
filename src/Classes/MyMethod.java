package Classes;

import Classes.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MyMethod {

    public MyMethod(){}

    public static int setN(int n, int z){

        int x=0;


        while(n<=z){
            System.out.print(n+ "+");
            x=x+n;
            n++;
        }
        return x;

    }

    public static int setI(int z){

        int i=1;

        do {
            System.out.print("[" + i + "]");
            i++;
        }
        while(i<=z);


        return i;

    }


    public static String getMyFriends(){

        Random rand = new Random();

        int randomizer = rand.nextInt(3);

        ArrayList<String> myFriends= new ArrayList<String>();
        myFriends.add("Bato");
        myFriends.add("Gart");
        myFriends.add("Duterte");


        return myFriends.get(randomizer);
    }

    public static String getRelationship(){

        Random rand = new Random();

        int randomizer = rand.nextInt(3);

        ArrayList<String> relationship= new ArrayList<String>();
        relationship.add("Bato");
        relationship.add("Gart");
        relationship.add("Duterte");

        return relationship.get(randomizer);
    }

    public static String getMyGirls(){


        Random rand = new Random();

        int randomizer = rand.nextInt(3);

        ArrayList<String> myGirls= new ArrayList<String>();
        myGirls.add("Bato");
        myGirls.add("Gart");
        myGirls.add("Duterte");


        return myGirls.get(randomizer);
    }

    public static int randomizer(){

        int randomizer = rand.nextInt(3);
    }

}
