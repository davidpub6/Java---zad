package Zad4;

public class Bookshop extends Shop{

    private String[] products = {
            "Book1",
            "Book2",
            "Book3"
    };

    public Bookshop() {
    }

    public Bookshop(String address, int size) {
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
