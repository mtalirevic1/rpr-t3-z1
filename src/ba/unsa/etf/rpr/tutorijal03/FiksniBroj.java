package ba.unsa.etf.rpr.tutorijal03;

import java.util.Objects;

public class FiksniBroj extends TelefonskiBroj {

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
    }
    private Grad grad;
    private String broj;
    FiksniBroj(Grad grad, String broj){
        this.grad=grad;
        this.broj=broj;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FiksniBroj)) return false;
        FiksniBroj that = (FiksniBroj) o;
        return grad == that.grad &&
                Objects.equals(broj, that.broj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(grad, broj);
    }

    @Override
    public String ispisi(){
        return grad+"/"+broj;
    }
}
