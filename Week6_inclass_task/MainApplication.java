// Entry point of the application
public class MainApplication {
    public static void main(String[] args) {
        // Create an admin and a user
        Admin curAdmin = new Admin(1234, "Stephan", "xa1@LW42%3");
        User curUser = new User(4455, "John");

        // Admin performs an update operation
        curAdmin.performOperation(new Update());

        // User performs a view operation
        curUser.performOperation(new View());
    }
}