package org.launchcode.models;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class User {
    @Size(min = 5, max = 15, message = "Username has to be between 5-15 characters)")
    private String username;
    @Email(message = "Invalid email format")
    private String email;
    @Size(min = 6)
    @NotBlank(message = "Password must be at least 6 characters long")
    private String password;
    @Size(min = 6)
    @NotBlank(message = "Password must be at least 6 characters long")
    private String verifyPassword;

    public User() {

    }
    public User(String username, String email, String password, String verifyPassword) {
        this();
        this.username = username;
        this.email = email;
        this.password = password;
        this.verifyPassword = verifyPassword;
    }

    public String getVerifyPassword() {
        return verifyPassword;
    }

    public void setVerifyPassword(String verifyPassword) {
        this.verifyPassword = verifyPassword;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    private void checkPassword() {
        if(this.password != null && !password.equals(verifyPassword)) {
            setVerifyPassword(null);
        }
    }
}

