// Represents an update operation that can be performed by an account
package Week6_inclass_task;
// Import necessary classes
import Week6_inclass_task.DataSource;


public class Update implements DataSource {
    @Override
    public void execute() {
        // Print update confirmation message
        System.out.println("Data has been Updated Successfully!");
    }
}