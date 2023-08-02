package PrototypePattern;

public class Product implements Cloneable {
    public void use(String s) {

    }

    public Product createClone(){
        Product p = null;
        try{
            p = (Product) this.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return p;
    }
}
