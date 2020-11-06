import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class timeConversion {
 
    private static final Scanner scan = new Scanner(System.in);

    static String timeConversion(String s) {

        return LocalTime.parse(s, DateTimeFormatter.ofPattern("hh:mm:ssa"))
                        .format(DateTimeFormatter.ofPattern("HH:mm:ss"));

    }

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();
        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();
        bw.close();
    }
}
