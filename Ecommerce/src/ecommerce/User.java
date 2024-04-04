
package ecommerce;

public class User {
    private String name;
    private String surName;
    private String email;
    private String password;
    private String birthDay;
    private String homeAd;
    private String workAd;
    private CreditCart[] creditCart; 
    private int creditCartCounter;
    private Product[] product;
    private int productCounter;
    private Product[] favProduct;
    private int favProductCounter;
    public User(String name, String surName, String email, String password, String birthDay, String homeAd, String workAd) {
        this.name = name;
        this.surName = surName;
        this.email = email;
        this.password = password;
        this.birthDay = birthDay;
        this.homeAd = homeAd;
        this.workAd = workAd;
        this.creditCart = new CreditCart[10];
        this.creditCartCounter = 0;
        this.product = new Product[10];
        this.productCounter = 0 ;
        this.favProduct = new Product[10];
        this.favProductCounter = 0;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurName() {
        return surName;
    }
    public void setSurName(String surName) {
        this.surName = surName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getBirthDay() {
        return birthDay;
    }
    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }
    public String getHomeAd() {
        return homeAd;
    }
    public void setHomeAd(String homeAd) {
        this.homeAd = homeAd;
    }
    public String getWorkAd() {
        return workAd;
    }
    public void setWorkAd(String workAd) {
        this.workAd = workAd;
    }
    public void addCreditCart(CreditCart c){
    if(this.creditCartCounter==this.creditCart.length){
     CreditCart[] temp = this.creditCart;
     creditCart = new CreditCart[2*creditCart.length];
        for (int i = 0; i < creditCart.length/2; i++) {
         creditCart[i] =temp[i];    
        }
    }        
     creditCart[creditCartCounter] = c;
     creditCartCounter++;
    }
    public void printCreditCarts(){
        for (int i = 0; i < creditCartCounter+1; i++) {
        if(i >= creditCartCounter)
                System.out.println("No more Credit cart");
        else{
            System.out.println((i+1) + ". Credit card " + creditCart[i].getNumber());   
        }
        }    
    }    
    public void purchasing(Order o){
       
    if(!o.productControl(o.getProduct().getStock())){
        System.out.println("The stock is " + o.getProduct().getStock()+ " please don't try to buy more then that " + o.getProduct().getName());
   }
    else{
        addProduct(o.getProduct());
        int sold  = o.getProduct().getSold();
        o.getProduct().stockControl(o.getNumbofOrder());
        System.out.println("You have ordered " + o.getNumbofOrder() + " " + o.getProduct().getName());
        System.out.println("New stock is " + o.getProduct().getStock());
        o.getProduct().setSold(sold + o.getNumbofOrder()); 
    }}
    public void addProduct(Product p){
    if(this.productCounter==this.product.length){
     Product[] temp = this.product;
     product = new Product[2*product.length];
        for (int i = 0; i < product.length/2; i++) {
         product[i] =temp[i];    
        }
    }        
    product[productCounter] = p;
    productCounter++;
    }
    public void printProducts(){
            for (int i = 0; i < productCounter+1; i++) {
        if(i >= productCounter)
                System.out.println("No more Product");
        else{
            System.out.println((i+1) + ". Product " + product[i].getName());   
        }
        }     
    }
    public void printAllAt(){
        System.out.println("User name is " + this.name);
        System.out.println("User surname is " + this.surName);
        System.out.println("User e-mail is " + this.email);
        System.out.println("User password is " + this.password);
        System.out.println("User birthday is " + this.birthDay);
        System.out.println("User home adress is " + this.homeAd);
        System.out.println("User working adress is " + this.workAd);
    }
    public void addFavoriteProducts(Product p){
     if(this.favProductCounter==this.favProduct.length){
     Product[] temp = this.favProduct;
     favProduct = new Product[2*favProduct.length];
        for (int i = 0; i < favProduct.length/2; i++) {
         favProduct[i] =temp[i]; 
        }
    }    
    favProduct[favProductCounter] = p;
    favProductCounter++;
    }
    public void printFavoriteProducts(){
            for (int i = 0; i < favProductCounter+1; i++) {
        if(i >= favProductCounter)
                System.out.println("No more Favorite Product");
        else{
            System.out.println((i+1) + ". Favorite Product " + favProduct[i].getName());   
        }
        }    
    }
}
