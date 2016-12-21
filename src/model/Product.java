package model;

/**
 * Created by double on 16-12-21.
 */
public class Product {
    private  int id;
    private String name;
    private double price;
    private int num;
    private int total;
    private String desc;
    private double discount;
    private String img;
    private int status;

    public Product() {

    }

    public Product(int id, String name, double price, int num, int total, String desc, double discount, String img, int status) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.num = num;
        this.total = total;
        this.desc = desc;
        this.discount = discount;
        this.img = img;
        this.status = status;
    }

    public Product(String name, double price, int num, int total, String desc, double discount, String img, int status) {
        this.name = name;
        this.price = price;
        this.num = num;
        this.total = total;
        this.desc = desc;
        this.discount = discount;
        this.img = img;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", num=" + num +
                ", total=" + total +
                ", desc='" + desc + '\'' +
                ", discount=" + discount +
                ", img='" + img + '\'' +
                ", status=" + status +
                '}';
    }
}
