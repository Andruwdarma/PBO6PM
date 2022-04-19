package Game;

import Package6PM.Game;

public class MOBA extends Game{
    final private int maxHero = 100;
    private String[] listHero;
    public MOBA(String nama, String jenis, String dev, String[] list){
        super(nama, jenis, dev);
        listHero = list;
    }
    public int cariHero(String hero){
        int index = -1;
        int i = 0;
        while(i < listHero.length){
            if(listHero[i].equals(hero)){
                index = i;
                break;
            }
            i++;
        }
        return index;
    }
    public void tambahHero(String hero){
        int i;
        for(i = 0; i < listHero.length; i++){
        }
        if(i < maxHero){
            listHero[i+1] = hero;
        }
    }
}
