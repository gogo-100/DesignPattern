package AdaptorPattern;

import java.io.*;
import java.util.Properties;

public class FileProperties implements FileIO{
    Properties pr = new Properties();

    @Override
    public void readFromFile(String filename) throws IOException {
        File file = new File(filename);
        InputStream inputStream = new FileInputStream(file);
        pr.load(inputStream);
        inputStream.close();
    }

    @Override
    public void writeToFile(String filename) throws IOException {
        File file = new File(filename);
        OutputStream outputStream = new FileOutputStream(file);
        pr.store(outputStream,"written by FileProperties");
        outputStream.close();
    }

    @Override
    public void setValue(String key, String value) {
        pr.setProperty(key,value);
    }

    @Override
    public String getValue(String key) {
        return pr.getProperty(key);
    }
}
