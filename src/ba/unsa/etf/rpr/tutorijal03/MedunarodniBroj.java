package ba.unsa.etf.rpr.tutorijal03;

import java.util.Objects;

public class MedunarodniBroj extends TelefonskiBroj {

    private String drzava;
    private String broj;

    MedunarodniBroj(String drzava, String broj){
        this.drzava=drzava;
        this.broj=broj;
    }

    @Override
    public String ispisi(){
        return drzava+"/"+broj;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MedunarodniBroj)) return false;
        MedunarodniBroj that = (MedunarodniBroj) o;
        return Objects.equals(drzava, that.drzava) &&
                Objects.equals(broj, that.broj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(drzava, broj);
    }
}
