package Package6PM;

import java.util.Random;

public class Game {
    private String idGame, namaGame, jenisGame, developerGame;
    public Game(){}
    public Game(String nama, String jenis, String dev){
        namaGame = nama;
        jenisGame = jenis;
        developerGame = dev;
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
    public String getDeveloperGame(){
        return developerGame;
    }
    
    public void setIdGame(String id){
        idGame = id;
    }
    public void setNamaGame(String nama){
        namaGame = nama;
    }
    public void setJenisGame(String jenis){
        jenisGame = jenis;
    }
    public void setDeveloperGame(String dev){
        developerGame = dev;
    }
}
