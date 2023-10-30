package Visitor;
import java.util.ArrayList;
import java.util.Iterator;

public class FileFindVisitor extends Visitor {
    private String endWith;                         // 当前访问的文件夹的名字
    ArrayList<File> FileList = new ArrayList<Visitor.File>();
    public FileFindVisitor(String endWith){
        this.endWith = endWith;
    }
    public void visit(File file) {                  // 在访问文件时被调用
        if (file.getName().endsWith(".html")){
            FileList.add(file);
        }
    }
    public void visit(Directory directory) {   // 在访问文件夹时被调用
        Iterator it = directory.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry)it.next();
            entry.accept(this);
        }

    }
    public Iterator getFoundFiles(){
        return FileList.iterator();
    }
}
