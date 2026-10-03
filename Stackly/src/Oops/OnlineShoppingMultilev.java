package Oops;


public class OnlineShoppingMultilev {

    public static void main(String[] args) {

        Electronics e =
            new Electronics(101, "Laptop", 50000, 2);

        Food f =
            new Food(102, "Biscuit", 100, "25-12-2026");

        Clothing c =
            new Clothing(103, "Shirt", 1500, "XL");


        System.out.println("........... ELECTRONICS ..........");
        e.calculateTotal();

        System.out.println(".............FOOD............");
        f.calculateTotal();

        System.out.println("............. CLOTHING............");
        c.calculateTotal();
    }
}

class Product {

    int productId;
    String productName;
    double productAmount;

    Product(int productId, String productName, double productAmount) {
        this.productId = productId;
        this.productName = productName;
        this.productAmount = productAmount;
    }
}

class Electronics extends Product {

    int warranty;

    Electronics(int productId, String productName,
                double productAmount, int warranty) {

        super(productId, productName, productAmount);
        this.warranty = warranty;
    }

    void calculateTotal() {

        double tax = productAmount * 18 / 100;
        double total = productAmount + tax;

        System.out.println("Product ID     : " + productId);
        System.out.println("Product Name   : " + productName);
        System.out.println("Product Amount : " + productAmount);
        System.out.println("Warranty       : " + warranty + " years");
        System.out.println("Tax            : " + tax);
        System.out.println("Total Bill     : " + total);
    }
}
class Food extends Product {

    String expiryDate;

    Food(int productId, String productName,
         double productAmount, String expiryDate) {

        super(productId, productName, productAmount);
        this.expiryDate = expiryDate;
    }

    void calculateTotal() {

        double tax = productAmount * 18 / 100;
        double total = productAmount + tax;

        System.out.println("Product ID     : " + productId);
        System.out.println("Product Name   : " + productName);
        System.out.println("Product Amount : " + productAmount);
        System.out.println("Expiry Date    : " + expiryDate);
        System.out.println("Tax            : " + tax);
        System.out.println("Total Bill     : " + total);
    }
}

class Clothing extends Product {

    String size;

    Clothing(int productId, String productName,
             double productAmount, String size) {

        super(productId, productName, productAmount);
        this.size = size;
    }

    void calculateTotal() {

        double tax = productAmount * 18 / 100;
        double total = productAmount + tax;

        System.out.println("Product ID     : " + productId);
        System.out.println("Product Name   : " + productName);
        System.out.println("Product Amount : " + productAmount);
        System.out.println("Size           : " + size);
        System.out.println("Tax            : " + tax);
        System.out.println("Total Bill     : " + total);
    }
}



