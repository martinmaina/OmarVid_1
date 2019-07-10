
package Panels;


public class USER_1 {

private String productName;
private int quantity;
private String UCode;
private int BP;
private int SP;
private int ProductId;

public USER_1(String productName, int quantity,int BP, int SP, String UCode){
    this.productName = productName;
    this.quantity = quantity;
    this.UCode = UCode;
    this.BP = BP;
    this.SP= SP;
    this.ProductId = ProductId;

//    USER_1(String string, int aInt,  int aInt0, String string) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
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

}
