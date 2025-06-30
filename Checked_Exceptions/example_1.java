import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class example_1 {
    public static void main(String[] args) {
        // Scenario: Reading a file and connecting to a database (both can throw checked exceptions)
        try {
            // Attempt to open a file (can throw FileNotFoundException or IOException)
            FileReader file = new FileReader("sample.txt");
            System.out.println("File opened successfully.");
            file.close();

            // Attempt to connect to a database (can throw SQLException)
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "user", "password");
            System.out.println("Database connected successfully.");
            conn.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("An IO error occurred: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("A database error occurred: " + e.getMessage());
        }
    }
}