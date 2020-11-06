import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class makeAnagram {

    // Complete the makeAnagram function below.
    static int makeAnagrams(String a, String b) {
        
        Map<Character, Integer> anagramCheck = new HashMap<>();
        for(char ch: a.toCharArray()){
            int count = anagramCheck.containsKey(ch) ? anagramCheck.get(ch) : 0;
            anagramCheck.put(ch, (count+1));
        }
        for(char ch: b.toCharArray()){
            int count = anagramCheck.containsKey(ch) ? anagramCheck.get(ch) : 0;
            anagramCheck.put(ch, (count-1));
        }
        int diff=0;
        for(Integer i: anagramCheck.values()) diff += Math.abs(i);
        
        return diff;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String a = scanner.nextLine();

        String b = scanner.nextLine();

        int res = makeAnagrams(a, b);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
