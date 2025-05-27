// Represents a delete operation that can be performed by an account
public class Delete implements DataSource {
    @Override
    public void execute() {
        // Print delete confirmation message
        System.out.println("Data has been deleted.");
    }
}