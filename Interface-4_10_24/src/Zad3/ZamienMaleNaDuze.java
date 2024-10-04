package Zad3;

public class ZamienMaleNaDuze extends OperacjeNaTekscie{

    private String lastText;
    @Override
    public String wykonaj(String text) {
        return text.toUpperCase();
    }

    @Override
    public String cofnij() {
        return this.lastText;
    }

    @Override
    String nazwaOperacji() {
        return "Zamien Male Na Duze";
    }
}
