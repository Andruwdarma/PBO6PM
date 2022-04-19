package Package6PM;

import java.util.Random;
import java.util.Date;
import java.text.SimpleDateFormat;

public class News {
    private String idNews, judul, author, isiBerita;
    private Date tanggal;
    SimpleDateFormat convert = new SimpleDateFormat("dd-MM-yyyy");
    public News(){}
    public News(String judul, String author){
        this.judul = judul;
        this.author = author;
        idNews = "N"+new Random().nextInt(50);
    }
    public String getIdNews(){
        return idNews;
    }
    public String getJudul(){
        return judul;
    }
    public String getAuthor(){
        return author;
    }
    public String getIsiBerita(){
        return isiBerita;
    }
    public Date getTanggal(){
        return tanggal;
    }
    
    public void setIdNews(String id){
        idNews = id;
    }
    public void setJudul(String judul){
        this.judul = judul;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public void setIsiBerita(String berita){
        isiBerita = berita;
    }
    public void setTanggal(String tanggal){
        try{
            this.tanggal = convert.parse(tanggal);
        }
        catch(Exception e){
            System.out.println("Salah Format Tanggal");
        }
    }
}
