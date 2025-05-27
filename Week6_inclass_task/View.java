// Represents a view operation that can be performed by an account
public class View implements DataSource {
    @Override
    public void execute() {
        // Print view message
        System.out.println("Some data to be displayed.");
    }
}