package Game;

import Package6PM.Game;

public class FPS extends Game {
    final private int maxSenjata = 100;
    private String[] listSenjata;
    public FPS(String nama, String jenis, String dev, String[] list){
        super(nama, jenis, dev);
        listSenjata = list;
    }
    public int cariSenjata(String senjata){
        int index = -1;
        int i = 0;
        while(i < listSenjata.length){
            if(listSenjata[i].equals(senjata)){
                index = i;
                break;
            }
            i++;
        }
        return index;
    }
    public void tambahSenjata(String senjata){
        int i;
        for(i = 0; i < listSenjata.length; i++){
        }
        if(i < maxSenjata){
            listSenjata[i+1] = senjata;
        }
    }
}
