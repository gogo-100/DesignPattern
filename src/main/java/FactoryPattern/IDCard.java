package FactoryPattern;

public class IDCard extends Product{
    private String owner;
    private String ID;
    IDCard(String owner,String ID){
        System.out.println("制作" + owner + "的ID卡。ID号为"+ID);
        this.owner = owner;
        this.ID = ID;
    }

    public void use(){
        System.out.println("使用" + owner + "的ID卡");
        System.out.println("卡号" + ID);
    }

    public String getOwner(){
        return owner;
    }

    public String getID() {
        return ID;
    }
}
