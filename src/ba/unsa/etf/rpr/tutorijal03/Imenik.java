package ba.unsa.etf.rpr.tutorijal03;

import java.util.*;


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
        Iterator it=mapa.entrySet().iterator();
        while(it.hasNext()){
            HashMap.Entry<String,TelefonskiBroj> par= (HashMap.Entry<String, TelefonskiBroj>) it.next();
            if(par.getValue()==broj) {return par.getKey();}
        }
        return "";
    }

    String naSlovo(char s) {
        String ispis="";
        int brojac=1;
        Iterator it = mapa.entrySet().iterator();
        while (it.hasNext()) {
            HashMap.Entry<String, TelefonskiBroj> par = (HashMap.Entry<String, TelefonskiBroj>) it.next();
            if(par.getKey().charAt(0)==s) {
                ispis = ispis + brojac + ". " + par.getKey() + " - " + par.getValue().ispisi() + "\n";
                brojac++;
            }
        }
        return ispis;
    }

    Set<String> izGrada(FiksniBroj.Grad g){
        TreeSet<String> skup=new TreeSet<String>();
        Iterator it=mapa.entrySet().iterator();
        while(it.hasNext()){
            HashMap.Entry<String, TelefonskiBroj> par = (HashMap.Entry<String, TelefonskiBroj>) it.next();
            if (par.getValue() instanceof FiksniBroj) {
                if ( ( (FiksniBroj) par.getValue() ).getGrad().equals(g) ) {
                    skup.add(par.getKey());
                }
            }
        }
        return skup;
    }

    Set<TelefonskiBroj> izGradaBrojevi(FiksniBroj.Grad g){
        TreeSet<TelefonskiBroj> brojeviIzGrada = new TreeSet<>(); //TreeSet u koji smjestamo odgovarajuce TelefonskeBrojeve sortirana po Stringu ispisi();
        Iterator it = mapa.entrySet().iterator();
        while (it.hasNext()) {
            HashMap.Entry<String, TelefonskiBroj> par = (HashMap.Entry<String, TelefonskiBroj>) it.next();
            if (par.getValue() instanceof FiksniBroj) { //ako je odg. Object instanca klase FiksniBroj i ako je grad tog broja jednak parametru g onda dodajemo u skup odg string koji je ime i prezime ;
                if (g.equals(((FiksniBroj) par.getValue()).getGrad())) {
                    brojeviIzGrada.add(par.getValue());
                }
            }
        }
        return brojeviIzGrada;
    }


}
