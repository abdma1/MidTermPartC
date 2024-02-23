import java.util.Scanner;

public class TestUserProfile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // my name is marwan this is the change im making
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your favorite actor: ");
        String favoriteActor = scanner.nextLine();

        System.out.println("User profile for " + name + " created successfully.");
        System.out.println("Favorite actor: " + favoriteActor);

        scanner.close();
    }
}
