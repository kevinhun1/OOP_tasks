package Week6_inclass_task;

import Week6_inclass_task.DataSource;


public class Admin extends Account {
    private String AuthPassword;

    public Admin(int _id, String _name, String _password) {
        id = _id;
        name = _name;
        AuthPassword = _password;
    }

    public String getAuthPassword() {
        return AuthPassword;
    }

    public void setAuthPassword(String authPassword) {
        this.AuthPassword = authPassword;
    }
}