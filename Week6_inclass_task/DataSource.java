// Interface for operations that can be performed by an account

package Week6_inclass_task;

public interface DataSource {
    // Method to execute the operation
    void execute();
    // Method to get the ID of the account
    int getId();
    // Method to get the name of the account
    String getName();
    // Method to get the authentication password of the account
    String getAuthPassword();
}