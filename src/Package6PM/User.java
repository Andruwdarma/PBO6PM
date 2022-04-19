package Package6PM;

public class User {
    private String username, password, email, nama, asal, team, jenisKelamin, kontak;
    public User(){}
    public User(String email, String nama, String pass){
        username = nama;
        password = pass;
        this.email = email;
    }
    public boolean Login(String nama, String pass){
        if(nama.equals(username) && pass.equals(password)){
            return true;
        }
        else{
            return false;
        }
    }
}
