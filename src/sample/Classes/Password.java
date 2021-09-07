package sample.Classes;

import java.util.Objects;

public class Password {
    private String password;
    private boolean isActive;

    public Password(String password) {
        if (isValid(password)) {
            this.password = password;
            this.setActive(true);
        } else {
            this.password = null;
        }
    }

    public static Password generateRandomly() {
        String pass = String.valueOf(Math.random() * 100);
        // TODO add random password generator
        // https://github.com/it-school/JavaSE_Strings/blob/master/src/com/itschool/Main.java
        return new Password(pass);
    }

    public static boolean isValid(String password) {
        // TODO add validity password check
        // https://github.com/it-school/JavaSE_Strings/blob/master/src/com/itschool/Main.java
        if (!password.equals(""))
            return true;
        else
            return false;
    }

    @Override
    public String toString() {
        return password + ", isActive=" + isActive;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Password password1 = (Password) o;
        return password.equals(password1.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(password);
    }
}