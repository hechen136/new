package test.Test10;

public class User {
    String name;
    String key;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public User(String name, String key) {
        this.name = name;
        this.key = key;
    }

    public User() {

    }
}
