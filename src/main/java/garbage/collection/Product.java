package garbage.collection;

public class Product {
    private String name;

    public String getName() {
        return name;
    }

    public Product(String name) {
        this.name = name;
    }

    public Product(Product oldProduct) {
        this.name = oldProduct.name;
    }


    public String toString() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

 /*   public void runfinalization(){

    }*/
}
