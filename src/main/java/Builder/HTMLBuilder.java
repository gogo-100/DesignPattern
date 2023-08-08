package BuilderPattern;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class HTMLBuilder implements Builder{
    private String filename;
    private PrintWriter writer;
    boolean haveMakeTitle = false;
    public void makeTitle(String title){
        if(!haveMakeTitle){
            filename = title + ".html";
            try {
                writer = new PrintWriter(new FileWriter(filename)); //生成printwriter
            }catch (IOException e){
                e.printStackTrace();
            }
            writer.println("<html><head><title>"+title+"</title></head><body>");
            //输出标题
            writer.println("<h1>"+ title + "</h1>");
            haveMakeTitle = true;
        }
    }

    @Override
    public void makeString(String str) {
        if(haveMakeTitle){
            writer.println("<p>" + str + "</p>");
        }
    }

    @Override
    public void makeItems(String[] items) {
        if (haveMakeTitle){
            writer.println("<ul>");
            for (int i = 0; i < items.length; i++) {
                writer.println("<li>"+items[i]+"</li>");
            }
            writer.println("</ul>");
        }
    }

    @Override
    public void close() {
        if (haveMakeTitle){
            writer.println("</body></html>");
            writer.close();
        }

    }

    public String getResult(){
        return  filename;
    }
}
