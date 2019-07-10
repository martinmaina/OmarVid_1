
package Panels;


public class User {

private String productName;
private int quantity;
private String UCode;
private int BP;
private int SP;
private int ProductId;

public User(String productName, int quantity, String UCode, int BP, int SP,int ProductId){
    this.productName = productName;
    this.quantity = quantity;
    this.UCode = UCode;
    this.BP = BP;
    this.SP= SP;
    this.ProductId = ProductId;
}

    User(String string, int aInt, String string0, int aInt0, int aInt1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

public String getproductName(){
    return productName;
}
public int getquantity(){
    return quantity;
}
public String getUCode(){
    return UCode;
}
public int getBP(){
    return BP;
}
public int getSP(){
    return SP;
}
public int getProductId(){
    return ProductId;
}
}
