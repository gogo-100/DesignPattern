package Decorator;

import java.util.ArrayList;

public class MultiStringDisplay extends Display {
    private ArrayList<String> strings; // 要显示的字符串
    private int maxlen = 0;
    public MultiStringDisplay() {           // 通过参数传入要显示的字符串
        strings = new ArrayList<String>();
    }
    public void add(String str){
        strings.add(str);
        if(str.length() > maxlen)
            maxlen = str.length();
    }
    public int getColumns() {
        return maxlen;
    }
    public int getRows() {                          // 行数是size
        return strings.size();
    }
    public String getRowText(int row) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < maxlen - strings.get(row).length(); i++) {
            sb.append(' ');
        }
        return strings.get(row) + sb.toString();
    }
}
