import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class RansomNote {

    // Complete the checkMagazine function below.
    static void checkMagazine(String[] magazine, String[] note) {
        if(note.length > magazine.length){ 
            System.out.println("No");
            return; 
            }
        Hashtable<String, Integer> checkMag = new Hashtable<String, Integer>();
        for(String m: magazine){
            if(!checkMag.containsKey(m)) checkMag.put(m, 1);
            else checkMag.put(m, checkMag.get(m)+1);
        }

        for(String n: note){
            if(checkMag.contains(n)){
                checkMag.put(n, checkMag.get(n)-1);
                if(checkMag.get(n)<0) {
                    System.out.println("No");
                    return;
                } 
            }
            else{
                 System.out.println("No");
                 return;
            }
        }
        System.out.println("Yes");
    }


    public static void main(String[] args) {
        String magazine[] = new String[] {"two", "times", "three", "is", "not", "four"};
        String note[]   = new String[] {"two", "times", "two", "is", "four"};
        checkMagazine(magazine, note);
    }
}
