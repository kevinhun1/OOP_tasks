// Represents an update operation that can be performed by an account
public class Update implements DataSource {
    @Override
    public void execute() {
        // Print update confirmation message
        System.out.println("Data has been Updated Successfully!");
    }
}