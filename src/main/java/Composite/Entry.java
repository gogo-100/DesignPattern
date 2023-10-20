package Composite;

public abstract class Entry {
    private Entry parent;
    public abstract String getName();                               // 获取名字
    public abstract int getSize();                                  // 获取大小
    public Entry add(Entry entry) throws FileTreatmentException {   // 加入目录条目
        throw new FileTreatmentException();
    }
    public String printFullAddress(){
        StringBuffer sb = new StringBuffer();
        Entry now = this;
        do{
            sb.insert(0,'/'+now.getName());
            now = now.parent;
        }while (now!=null);
        return sb.toString();
    }
    public void setParent(Entry entry){
        this.parent = entry;
    }
    public void printList() {                                       // 为一览加上前缀并显示目录条目一览
        printList("");
    }
    protected abstract void printList(String prefix);               // 为一览加上前缀
    public String toString() {                                      // 显示代表类的文字
        return getName() + " (" + getSize() + ")";
    }
}
