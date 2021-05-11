package pl.mkluzniak;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	/* for-each = traversing technique to iterate through the elements in an array/collection
	              less steps, more readable
                  less flexible
        */

        //String[]animals={"cat","dog","rat","bird"}; //string list of animals

        ArrayList<String> animals=new ArrayList<String>();//array list of animals
        animals.add("cat");//adding to array lst all animal that we need
        animals.add("dog");
        animals.add("rat");
        animals.add("bird");


        for (String i:animals){ //loop to display every animal that is added
            System.out.println(i); 

        }




    }
}
