package model;

/**
 * Created by hiennv on 21/03/2018.
 */

public class Food {
    private int id;
    private String productName;
    private long price;
    private int quantity;
    private String urlImage;

    public Food() {
    }

    public Food(int id, String productName, long price, int quantity, String urlImage) {
        this.id = id;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.urlImage = urlImage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }
}
