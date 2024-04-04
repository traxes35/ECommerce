
package ecommerce;
public class Product {

private String name;
private String color;
private String category;
private int stock;
private double weight;
private String inf;
private int sold;
    public Product(String name, String color, String category, int stock,double weight, String inf) {
        this.name = name;
        this.color = color;
        this.category = category;
        this.stock = stock;
        this.inf = inf;
        this.weight =weight;
        this.sold = 0;
    }
    public int getSold() {
        return sold;
    }
    public void setSold(int sold) {
        this.sold = sold;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public String getInf() {
        return inf;
    }
    public void setInf(String inf) {
        this.inf = inf;
    }
    public void printAllAt(){
        System.out.println("Product name: "+ name);
        System.out.println("Product color "+ color);
        System.out.println("Product category"+category);
        System.out.println("Product stock"+ stock);
        System.out.println("Product weight" + weight);
        System.out.println("Product information" + inf);
    }
    public int stockControl(int numbofOrder){
    if(stock >= numbofOrder){
            this.stock = this.stock - numbofOrder ;
    }
    else{
        System.out.println("There is no more stock");
        
    }
    return this.stock;
    }
}