package base;

public class Utilizador {
    private int passwordHash;
    private String username;

    public int getPasswordHash() {
        return passwordHash;
    }
    public String getUsername() {
        return username;
    }

    public void setPassword(String password) {
        passwordHash = password.hashCode();
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public Utilizador(String nome, String password){
        username = nome;
        passwordHash = password.hashCode();
    }
}

