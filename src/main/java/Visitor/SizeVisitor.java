package Visitor;
import java.util.Iterator;

public class SizeVisitor extends Visitor {
    private String currentdir = "";                         // 当前访问的文件夹的名字
    private int size = 0;
    public int getSize(){
        return size;
    }
    public void visit(File file) {                  // 在访问文件时被调用
        size += file.getSize();
    }
    public void visit(Directory directory) {   // 在访问文件夹时被调用
        Iterator it = directory.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry)it.next();
            entry.accept(this);
        }

    }
}
