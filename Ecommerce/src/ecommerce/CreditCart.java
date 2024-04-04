
package ecommerce;

public class CreditCart {
private String number;
private User user;
private String secCode;
private String expDate;
CreditCart(User user,String number,String secCode,String expDate){
this.number=number;
this.secCode=secCode;
this.expDate=expDate;
user.addCreditCart(this);
}
public String getNumber() {
        return number;
    }
public void setNumber(String number) {
        this.number = number;
    }
public String getSecCode() {
        return secCode;
    }
public void setSecCode(String secCode) {
        this.secCode = secCode;
    }
public String getExpDate() {
        return expDate;
    }
public void setExpDate(String expDate) {
        this.expDate = expDate;
    }
public void printAllAt(){
    System.out.println("cc number: " + number);
    System.out.println("cc security code: " + secCode);
    System.out.println("cc expiration date " + expDate);
}
}