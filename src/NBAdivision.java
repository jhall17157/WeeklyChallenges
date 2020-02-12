import java.util.Scanner;

public class NBAdivision {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is your favorite NorthWest division team? Enter city or abbreviation");
        String input = keyboard.nextLine();

        NorthWest team = null;
        if (NorthWest.valueOf("NUGGETS").getAbbrev().equalsIgnoreCase(input) || NorthWest.valueOf("NUGGETS").getCity().equalsIgnoreCase(input)) {
            team = NorthWest.NUGGETS;
        } else if (NorthWest.valueOf("THUNDER").getAbbrev().equalsIgnoreCase(input) || NorthWest.valueOf("THUNDER").getCity().equalsIgnoreCase(input)) {
            team = NorthWest.THUNDER;
        } else if (NorthWest.valueOf("TRAILBLAZERS").getAbbrev().equalsIgnoreCase(input) || NorthWest.valueOf("TRAILBLAZERS").getCity().equalsIgnoreCase(input)) {
            team = NorthWest.TRAILBLAZERS;
        } else if (NorthWest.valueOf("TIMBERWOLVES").getAbbrev().equalsIgnoreCase(input) || NorthWest.valueOf("TIMBERWOLVES").getCity().equalsIgnoreCase(input)) {
            team = NorthWest.TIMBERWOLVES;
        } else if (NorthWest.valueOf("JAZZ").getAbbrev().equalsIgnoreCase(input) || NorthWest.valueOf("JAZZ").getCity().equalsIgnoreCase(input)) {
            team = NorthWest.JAZZ;
        }




        switch (team) {
            case THUNDER:
                System.out.println("Oklahoma City Thunder");
                break;
            case NUGGETS:
                System.out.println("Minnesota Nuggets");
                break;
            case TIMBERWOLVES:
                System.out.println("Denver Timberwolves");
                break;
            case TRAILBLAZERS:
                System.out.println("Portland Trail Blazers");
                break;
            case JAZZ:
                System.out.println( "Utah Jazz");
        }


    }

}
