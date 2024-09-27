package Zad4;

public class Bakery extends Shop{
    private String[] products = {
            "Bread",
            "Doughnut"
    };

    public Bakery() {
    }

    public Bakery(String address, int size) {
        super(address, size);
    }

    @Override
    public String getInfo() {
        String productList = "";
        for (String item : this.products){
            productList += item+", ";
        }
        productList=productList.substring(0,productList.length()-2);
        return STR."Address : \{this.getAddress()} , Size : \{this.getSize()} , Products : \{productList}";
    }
}
