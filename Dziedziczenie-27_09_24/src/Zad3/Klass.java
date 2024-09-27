package Zad3;

public class Klass {
    private String arg1;
    private String arg2;
    private String arg3;
    private String arg4;
    private String arg5;

    public Klass(String arg1, String arg2, String arg3, String arg4, String arg5) {
        this.arg1 = arg1;
        this.arg2 = arg2;
        this.arg3 = arg3;
        this.arg4 = arg4;
        this.arg5 = arg5;
    }


    public String toString(){
        return this.arg1+" "+this.arg2+" "+this.arg3+" "+this.arg4+" "+this.arg5;
    }
}
