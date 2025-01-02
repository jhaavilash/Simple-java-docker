import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        // Get current date and time
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDate = now.format(formatter);

        // Get system information
        String osName = System.getProperty("os.name");
        String osVersion = System.getProperty("os.version");
        String osArch = System.getProperty("os.arch");
        String javaVersion = System.getProperty("java.version");
        String userName = System.getProperty("user.name");

        // Print the information
        System.out.println("Hello User Your Current information is below");
        System.out.println("Current Date and Time: " + formattedDate);
        System.out.println("Operating System: " + osName);
        System.out.println("OS Version: " + osVersion);
        System.out.println("OS Architecture: " + osArch);
        System.out.println("Java Version: " + javaVersion);
        System.out.println("User Name: " + userName);
        System.out.println("How is the Josh now ");
    }
}
