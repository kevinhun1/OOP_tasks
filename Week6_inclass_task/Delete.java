// Represents a delete operation that can be performed by an account

package Week6_inclass_task;
// Import necessary classes
import Week6_inclass_task.DataSource;


public class Delete implements DataSource {
    @Override
    public void execute() {
        // Print delete confirmation message
        System.out.println("Data has been deleted.");
    }
}