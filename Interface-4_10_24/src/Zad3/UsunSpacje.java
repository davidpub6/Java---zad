package Zad3;

public class UsunSpacje extends OperacjeNaTekscie{
    private String lastText;
    @Override
    public String wykonaj(String text) {
        this.lastText = text;
        return text.replace(" ","");
    }

    @Override
    public String cofnij() {
        return this.lastText;
    }

    @Override
    String nazwaOperacji() {
        return "Usun Spacje";
    }
}
