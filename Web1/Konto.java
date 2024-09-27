package Web1;

public class Konto {
    private int id;
    private float saldo;

    public Konto() {
    }
    public Konto(int id, float saldo) {
        this.id = id;
        this.saldo = saldo;
    }
    public Konto(int id) {
        this.id = id;
        this.saldo = 100;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public float getSaldo() {
        return saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void checkBal() {
        System.out.println(this.saldo);
    }

    public void withdraw (float amount) {
        this.saldo -= amount;
    }

    public void deposit (float amount) {
        this.saldo += amount;
    }
}
