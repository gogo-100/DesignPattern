package AdaptorPattern;

import java.io.*;
import java.util.Date;
import java.util.Properties;

public class FileProperties implements FileIO{
    Properties pr = new Properties();

    @Override
    public void readFromFile(String filename) throws IOException {
        try {
            File file = new File(filename);
            InputStream inputStream = new FileInputStream(file);
            pr.load(inputStream);
            inputStream.close(); // 关闭输入流
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void writeToFile(String filename) throws IOException {
        Date date = new Date();

        try {
            File file = new File(filename);
            OutputStream outputStream = new FileOutputStream(file);
            pr.store(outputStream,"written by FileProperties\n");
            outputStream.close(); // 关闭输入流
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void setValue(String key, String value) {
        pr.setProperty(key,value);
        System.out.println();
    }

    @Override
    public String getValue(String key) {
        return pr.getProperty(key);
    }
}
