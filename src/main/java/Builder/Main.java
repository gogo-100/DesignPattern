package BuilderPattern;

public class Main {
    public static void main(String[] args) {
        TextBuilder textBuilder = new TextBuilder();
        Director director1 = new Director(textBuilder);
        director1.construct();
        String result = textBuilder.getResult();
        System.out.println(result);

        HTMLBuilder htmlBuilder = new HTMLBuilder();
        Director director2 = new Director(htmlBuilder);
        director2.construct();
        String filename = htmlBuilder.getResult();
        System.out.println(filename + "文件编写完成");

        MyBuilder myBuilder = new MyBuilder();
        Director director3 = new Director(myBuilder);
        director3.construct();
        String result2 = myBuilder.getResult();
        System.out.println(result2);
    }

}
