package Bridge;

public class FileDisplayImpl extends DisplayImpl{
    String fileName;
    public FileDisplayImpl(String fileName) {           // 地址
        this.fileName = fileName;                           // 将它保存在字段中
    }
    public void rawOpen() {
        //打开文件
    }
    public void rawPrint() {
        //打印
    }
    public void rawClose() {
        //关闭文件
    }

}
