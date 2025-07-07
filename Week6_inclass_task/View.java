// Represents a view operation that can be performed by an account
package Week6_inclass_task;
// Import necessary classes
import Week6_inclass_task.DataSource;

public class View implements DataSource {
    @Override
    public void execute() {
        // Print view message
        System.out.println("Some data to be displayed.");
    }
}