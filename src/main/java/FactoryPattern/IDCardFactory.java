package FactoryPattern;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class IDCardFactory extends Factory{
    private List owners = new ArrayList();
    private HashMap hash = new HashMap();

    @Override
    protected Product createProduct(String owner) {
        Random random = new Random();
        int id = -1;
        while (id < 0 || hash.containsKey(String.valueOf(id))){
            id = random.nextInt(10000);
        }
        return new IDCard(owner,String.valueOf(id));
    }

    @Override
    protected void registerProduct(Product product){
        IDCard idCard = (IDCard) product;
        owners.add(idCard.getOwner());
        hash.put(idCard.getID(),idCard.getOwner());
    }

    public List getOwners(){
        return owners;
    }

    public HashMap getMap() {
        return hash;
    }
}
