package Package6PM;

import java.util.Random;

public class Game {
    private String idGame, namaGame, jenisGame, namaDeveloper;
    public Game(){}
    public Game(String nama, String jenis, String dev){
        namaGame = nama;
        jenisGame = jenis;
        namaDeveloper = dev;
        idGame = "G"+new Random().nextInt(50);
    }
    public String getIdGame(){
        return idGame;
    }
    public String getNamaGame(){
        return namaGame;
    }
    public String getJenisGame(){
        return jenisGame;
    }
    public String getNamaDeveloper(){
        return namaDeveloper;
    }
    
    public void setIdGame(String id){
        idGame = id;
    }
    public void setnamaGame(String nama){
        namaGame = nama;
    }
    public void setJenisGame(String jenis){
        jenisGame = jenis;
    }
    public void setNamaDeveloper(String dev){
        namaDeveloper = dev;
    }
}
