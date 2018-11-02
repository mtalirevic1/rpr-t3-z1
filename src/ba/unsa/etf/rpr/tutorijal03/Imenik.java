package ba.unsa.etf.rpr.tutorijal03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Imenik {

    private HashMap<String, TelefonskiBroj> mapa;

    Imenik(){
        mapa= new HashMap<String, TelefonskiBroj>();
    }

    void dodaj(String ime, TelefonskiBroj broj){
        mapa.put(ime,broj);
    }

    String dajBroj(String ime){
        return mapa.get(ime).ispisi();
    }

    String dajIme(TelefonskiBroj broj){
        Iterator<> it=mapa.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry par=it.next();
        }
    }

    String naSlovo(char s){

    }
}
