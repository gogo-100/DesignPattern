package BuilderPattern;

public class TextBuilder implements Builder{
    private StringBuffer buffer = new StringBuffer();

    boolean haveMakeTitle = false;
    public void makeTitle(String title){
        if (!haveMakeTitle){
            buffer.append("====\n");
            buffer.append("["+ title +"]\n");
            buffer.append("\n");
            haveMakeTitle = true;
        }
    }

    @Override
    public void makeString(String str) {
        if(haveMakeTitle){
            buffer.append("口"+ str + "\n");
            buffer.append("\n");
        }

    }

    @Override
    public void makeItems(String[] items) {
        if(haveMakeTitle){
            for (int i = 0; i < items.length; i++) {
                buffer.append(" '"+items[i]+"\n");
            }
            buffer.append("\n");
        }
    }

    @Override
    public void close() {
        if(haveMakeTitle){
            buffer.append("====\n");
        }
    }

    public String getResult(){
        return  buffer.toString();
    }
}
