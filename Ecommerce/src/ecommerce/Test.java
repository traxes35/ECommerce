
package ecommerce;

public class Test {
public void test(){
User u1 = new User("Baris","Koc","traxes12135@gmail.com","traxes","19.01.2002","adresev","adresis");
CreditCart c1 = new CreditCart(u1,"123456789","123","19.01.2026");
CreditCart c2 = new CreditCart(u1,"987654321","987","19.01.2026");
CreditCart c3 = new CreditCart(u1,"987654321","987","19.01.2026");
u1.printCreditCarts();
Product p1 = new Product("smartphone","black","Electronic",1000,140,"inf");
Product p2 = new Product("pc","blue","Electronic",1000,259,"inf");
Product p3 = new Product("chips","brwon","food",1000,2500,"chips");
Product p4 = new Product("smartphone","black","Electronic",1000,140,"inf");
Product p5 = new Product("smartphone","black","Electronic",1000,140,"inf");
u1.addProduct(p1);
u1.addProduct(p2);
u1.addProduct(p3);
u1.addProduct(p4);
u1.addProduct(p5);
u1.printProducts();
u1.addFavoriteProducts(p1);
u1.addFavoriteProducts(p2);
u1.printFavoriteProducts();
Order o1 =new Order(u1,c1,p1,50);
u1.purchasing(o1);
}    
}
