import java.util.Scanner;

/**
 * Created by tim on 1/21/15.
 */
public class lab2 {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your favorite city?");
        String favoriteCity = (scanner.next());
        int length = favoriteCity.length();
        String cityUpper = favoriteCity.toUpperCase();
        String cityLower = favoriteCity.toLowerCase();
        char cityFirstChar = favoriteCity.charAt(0);

        System.out.println("You said your favorite city is " + favoriteCity);
        System.out.println(favoriteCity + " is " + length + " characters long");
        System.out.println(cityUpper);
        System.out.println(cityLower);
        System.out.println("The first character of " + favoriteCity + " is " + cityFirstChar);
    }
}
