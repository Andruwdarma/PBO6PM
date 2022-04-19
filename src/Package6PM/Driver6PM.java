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
        menu();
    }
    
    public static void menu(){
        String ulg = "y";
        while (ulg.equals("y"))
        {
        System.out.println(" ");
        Scanner input = new Scanner(System.in);
        String ul="",lagi;
        System.out.println("********** SELAMAT DATANG ***********");
        System.out.println(" ");
        System.out.println("             MENU UTAMA             ");
        System.out.println("1. menu1");
        System.out.println("2. menu2");
        System.out.println("3. menu3");
        System.out.println("4. Keluar");
        System.out.println("=====================================");
        System.out.print("Pilihan [1/2/3/4] = ");
        int pilih = input.nextInt();
        System.out.println("=====================================");
        switch (pilih) {
            case 1:{
                break;
            }
            case 2:{
                break;
            }
             case 3:{
                break;
             }
            case 4:{
                System.exit(4);
                System.out.println("Warning !! Pilihan tidak tersedia !! ");
            }
                break;
        }
        System.out.println("=====================================");
        System.out.print("Apakah anda ingin mengulang (y/t)? ");
        ulg = input.next();
        }
    }
}

