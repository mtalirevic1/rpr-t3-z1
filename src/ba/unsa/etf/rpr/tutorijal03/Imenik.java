package ba.unsa.etf.rpr.tutorijal03;

import java.util.*;

public class Imenik {

    public enum Grad{
        SARAJEVO("033"),
        TUZLA("035"),
        ODZAK("031"),
        ZENICA("032"),
        LIVNO("034"),
        MOSTAR("036"),
        BIHAC("037"),
        GORAZDE("038"),
        LJUBUSKI("039"),
        BRCKO("049"),
        MRKONJICGRAD("050"),
        BANJALUKA("051"),
        PRIJEDOR("052"),
        DOBOJ("053"),
        SAMAC("054"),
        BIJELJINA("055"),
        ZVORNIK("056"),
        PALE("057"),
        FOCA("058"),
        TREBINJE("059");

        private final String pozivniBroj;

        Grad(String pozivniBroj){
            this.pozivniBroj=pozivniBroj;
        }

        public final String getPozivniBroj(){
            return pozivniBroj;
        }
    }

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
        Iterator it=mapa.entrySet().iterator();
        while(it.hasNext()){
            HashMap.Entry<String,TelefonskiBroj> par= (HashMap.Entry<String, TelefonskiBroj>) it.next();
            if(par.getValue()==broj) return par.getKey();
        }
        return "";
    }

    String naSlovo(char s) {
        String ispis="";
        int brojac=1;
        Iterator it = mapa.entrySet().iterator();
        while (it.hasNext()) {
            HashMap.Entry<String, TelefonskiBroj> par = (HashMap.Entry<String, TelefonskiBroj>) it.next();
            if(par.getKey().charAt(0)==s) ispis=ispis+brojac+". "+par.getKey()+" - "+par.getValue().ispisi()+"\n";
        }
        return ispis;
    }

    TreeSet<String> izGrada(Grad g){

    }
}
