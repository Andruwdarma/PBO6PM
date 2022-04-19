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
    public String getIdTurnamen(){
        return idTurnamen;
    }
    public String getNamaTurnamen(){
        return namaTurnamen;
    }
    public String getTempat(){
        return tempat;
    }
    public String getPrizePool(){
        return prizePool;
    }
    public String getRules(){
        return rules;
    }
    public String getDeskripsi(){
        return deskripsi;
    }
    public String getStatus(){
        return status;
    }
    public int getSlot(){
        return slot;
    }
    public Date getWaktu(){
        return waktu;
    }
    
    public void setIdTurnamen(String id){
        idTurnamen = id;
    }
    public void setNamaTurnamen(String nama){
        namaTurnamen = nama;
    }
    public void setTempat(String tempat){
        this.tempat = tempat;
    }
    public void setPrizePool(String prize){
        prizePool = prize;
    }
    public void setRules(String rules){
        this.rules = rules;
    }
    public void setDeskripsi(String desc){
        deskripsi = desc;
    }
    public void setStatus(String status){
        this.status = status;
    }
    public void setSlot(int slot){
        this.slot = slot;
    }
    public void setWaktu(String waktu){
        try{
            this.waktu = convert.parse(waktu);
        }
        catch(Exception e){
            System.out.println("Salah Format Tanggal");
        }
    }
}
