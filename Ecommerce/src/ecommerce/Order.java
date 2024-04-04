
package ecommerce;
public class Order {
 private User user;
 private CreditCart creditCart;
 private Product product;
 private int numbofOrder;
 public Order(User u, CreditCart c, Product p,int numbofOrder) {
        this.user = u;
        this.creditCart = c;
        this.product = p;
        this.numbofOrder = numbofOrder;
    }
 public User getUser() {
        return user;
    }
 public void setUser(User user) {
        this.user = user;
    }
 public CreditCart getCreditCart() {
        return creditCart;
    }
 public void setCreditCart(CreditCart creditCart) {
        this.creditCart = creditCart;
    }
 public Product getProduct() {
        return product;
    }
 public void setProduct(Product product) {
        this.product = product;
    }
 public int getNumbofOrder() {
        return numbofOrder;
    }
 public void setNumbofOrder(int numbofOrder) {
        this.numbofOrder = numbofOrder;
    }
 public boolean productControl(int stock){
 if(stock >= numbofOrder)
 return true;
 else{
 return false;
 }
 }
 public void printAllAt(){
     System.out.println("User name is " + user.getName());
     System.out.println("User credit cart number is " + creditCart.getNumber());
     System.out.println("Product name is " + product.getName());
 } 
}
