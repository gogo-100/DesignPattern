package BuilderPattern;

public class MyBuilder implements Builder{
    private StringBuffer buffer = new StringBuffer();
    boolean haveMakeTitle = false;
    public void makeTitle(String title){
        if (!haveMakeTitle){
            buffer.append("123\n");
            buffer.append("1"+ title +"1\n");
            haveMakeTitle = true;
        }

    }

    @Override
    public void makeString(String str) {
        if (haveMakeTitle){
            buffer.append(str + "\n");
        }

    }

    @Override
    public void makeItems(String[] items) {
        if(haveMakeTitle){
            for (int i = 0; i < items.length; i++) {
                buffer.append(" '"+items[i]+"\n");
            }
        }

    }

    @Override
    public void close() {
        if(haveMakeTitle){
            buffer.append("123\n");
        }
    }

    public String getResult(){
        return  buffer.toString();
    }
}
