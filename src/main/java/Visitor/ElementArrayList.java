package Visitor;

import java.util.ArrayList;
import java.util.Iterator;

public class ElementArrayList extends ArrayList implements Element {
    public void accept(Visitor v) {         // 接受访问者的访问
        Iterator it = iterator();
        while(it.hasNext()){
            Element e = (Element) it.next();
            e.accept(v);
        }
    }
}
