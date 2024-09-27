package Zad4;

public class Shop {
    private String address;
    private int size;

    public Shop() {
    }

    public Shop(String address, int size) {
        this.address = address;
        this.size = size;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getInfo(){
        return STR."Address : \{this.address} , Size : \{this.size}";
    }
}
