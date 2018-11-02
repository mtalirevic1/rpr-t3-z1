package ba.unsa.etf.rpr.tutorijal03;

import java.util.Objects;

public class MobilniBroj extends TelefonskiBroj {

    private int mobilnaMreza;
    private String broj;

    MobilniBroj(int mobilnaMreza, String broj){
        if(mobilnaMreza<60 || mobilnaMreza>67) throw new IllegalArgumentException("Mobilna mreza nije validna");
        this.mobilnaMreza=mobilnaMreza;
        this.broj=broj;
    }

    @Override
    public String ispisi(){
        return "0"+mobilnaMreza+"/"+broj;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MobilniBroj)) return false;
        MobilniBroj that = (MobilniBroj) o;
        return mobilnaMreza == that.mobilnaMreza &&
                Objects.equals(broj, that.broj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mobilnaMreza, broj);
    }
}
