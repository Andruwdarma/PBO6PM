package Package6PM;
import java.util.Scanner;

public class Driver6PM {
    public static void main(String[] args){
        User user = new User("admin@gmail.com","admin", "admin");
        Scanner read = new Scanner(System.in);
        boolean masuk = false;
        while(!masuk){
            System.out.print("Username: ");
            String username = read.nextLine();
            System.out.print("Password: ");
            String password = read.nextLine();
            if(user.Login(username, password)){
                break;
            }
            System.out.println("Coba lagi");
        }
        Team t1 = new Team("joni", "FPS", "aktif", 6, new String[]{"joni", "jojo"});
        Team t2 = new Team("joni", "FPS", "aktif", 6, new String[]{"joni", "jojo"});
        //System.out.println(t1.getIdTeam());
        //System.out.println(t2.getIdTeam());
        System.out.println("DONE");
    }
}
