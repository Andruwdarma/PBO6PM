package Package6PM;

import java.util.Random;

public class Team {
    private String idTeam, namaTeam, status, jenisGame;
    private int jumlahAnggota;
    private String[] namaAnggota;
    
    public Team(){}
    public Team(String nama, String jenisGame, String status, int jumlah, String[] list){
        namaTeam = nama;
        this.jenisGame = jenisGame;
        this.status = status;
        jumlahAnggota = jumlah;
        namaAnggota = list;
        idTeam = "T"+new Random().nextInt(50);
    }
    public String getIdTeam(){
        return idTeam;
    }
}
