import java.time.LocalDate;

public class Deliverable {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.now();
        LocalDate dateJT = LocalDate.of(1987, 3, 9);
        System.out.println("Now: " + date1 + "\n" + "Then: " + dateJT);
        LocalDate subtDate = date1.minusDays(9).minusMonths(3).minusYears(1987);
        System.out.println("Time since: " + subtDate);
        LocalDate dateRH = LocalDate.of(1988,10, 10);
        LocalDate datesubRH = dateRH.minusDays(9).minusMonths(3).minusYears(1987);
        System.out.println("Time between albums: " + datesubRH);
        LocalDate newAlbum = dateRH.plusDays(1).plusMonths(7).plusYears(1);
        System.out.println("New album date: " + newAlbum);

    }
}
