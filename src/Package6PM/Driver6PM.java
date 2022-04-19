package Package6PM;

import java.util.Scanner;
import Game.*;
public class Driver6PM {
    public static void main(String[] args){
        final int max = 100;
        User user = new User("admin@gmail.com","admin", "admin");
        Game[] listGame = {
            new FPS("APEX", "FPS", "EA", new String[max]),
            new FPS("Valorant", "FPS", "Riot", new String[max]),
            new MOBA("DOTA 2", "MOBA", "Valve", new String[max]),
            new MOBA("ML", "MOBA", "Moonton", new String[max]),
        };
        Team[] listTeam = {
            new Team("GG", "FPS", "aktif", 6, new String[max]),
            new Team("EVOS", "MOBA", "aktif", 6, new String[max]),
            new Team("RRQ", "FPS", "aktif", 6, new String[max]),
            new Team("JINXPRO", "FPS", "aktif", 6, new String[max])
        };
        News[] listNews = {
            new News("Permainan semakin ahli", "Adit"),
            new News("RRQ memenangkan kejuaraan", "Joni"),
        };
        Turnamen[] listTurnamen = new Turnamen[max];
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
        
        String ulg = "y";
        while (ulg.equals("y"))
        {
        System.out.println(" ");
        Scanner input = new Scanner(System.in);
        String ul="",lagi;
        System.out.println("********** SELAMAT DATANG ***********");
        System.out.println(" ");
        System.out.println("             MENU UTAMA             ");
        System.out.println("1. List Game");
        System.out.println("2. List team");
        System.out.println("3. List berita");
        System.out.println("4. Keluar");
        System.out.println("=====================================");
        System.out.print("Pilihan [1/2/3/4] = ");
        int pilih = input.nextInt();
        System.out.println("=====================================");
        switch (pilih) {
            case 1:{
                int i;
                System.out.println("=====LIST GAME=====");
                for(i = 0; i < listGame.length; i++){
                    System.out.println((i+1) + ". " + listGame[i].getNamaGame());
                }
                break;
            }
            case 2:{
                int i;
                System.out.println("=====LIST TEAM=====");
                for(i = 0; i < listTeam.length; i++){
                    System.out.println((i+1) + ". " + listTeam[i].getNamaTeam());
                }
                break;
            }
            case 3:{
                System.out.println("=====BERITA=====");
                int i;
                for(i = 0; i < listNews.length; i++){
                    System.out.println((i+1) + ". " + listNews[i].getJudul());
                }
                break;
            }
            case 4:{
                System.out.println("Anda sudah logout");
                System.exit(0);
            }
                break;
        }
        System.out.println("=====================================");
        System.out.print("Apakah anda ingin mengulang (y/t)? ");
        ulg = input.next();
        }
    }
}
