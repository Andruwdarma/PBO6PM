package Package6PM;

import java.util.Random;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Turnamen {
    private String idTurnamen, namaTurnamen, tempat, prizePool, rules, deskripsi, status;
    private int slot;
    private Date waktu;
    SimpleDateFormat convert = new SimpleDateFormat("dd-MM-yyyy");
    public Turnamen(){}
    public Turnamen(String nama, String tempat, String waktu, String status){
        namaTurnamen = nama;
        this.tempat = tempat;
        this.status = status;
        try{
            this.waktu = convert.parse(waktu);
        }
        catch(Exception e){
            System.out.println("Salah Format Tanggal");
        }
        idTurnamen = "Tr"+new Random().nextInt(50);
    }
    
    public void ubahStatus(String status){
        this.status = status;
    }
    public String getIdTurnamen(){
        return idTurnamen;
    }
    public String getNamaTurnamen(){
        return namaTurnamen;
    }
    public void setIdTurnamen(String id){
        idTurnamen = id;
    }
    public void setNamaTurnamen(String nama){
        namaTurnamen = nama;
    }
   
}
