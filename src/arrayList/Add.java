package arrayList;

import java.util.ArrayList;

public class Add {
    public static ArrayList<String> test(){
        ArrayList<String> names = new ArrayList<String>();
        //write code below

        names.add("Hello");
        names.add("Cydeo");



        //leave below code alone
        return names;
    }

    public static void main(String[] args) {
        System.out.println(test().size());
    }

}
/*
We will be manipulating elements of an ArrayList by using List methods.

The first List method we will learn is .add()

The following code will take an ArrayList of Strings called strs and add "Hello" to it.

strs.add("Hello");

The syntax is:

arraylistvariable.add(data_to_add);

In the test() method, add three names (any names) to the ArrayList called names.
 */