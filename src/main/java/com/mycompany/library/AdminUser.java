package com.mycompany.library;

public class AdminUser {

    private String username;
    private String password;

    public AdminUser(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean authenticate(String enteredUsername, String enteredPassword) {
        return username.equals(enteredUsername) && password.equals(enteredPassword);
    }

    @Override
    public String toString() {
        return "AdminUser { "
                + "username:' " + username + '\''
                + ", password:' " + password + '\''
                + '}';
    }
}
