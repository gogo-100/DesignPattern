package SingletonPattern;

import java.util.Random;

public class Triple {
    static Triple[] triples = new Triple[3];

    private Triple(int id){
        System.out.println("No."+id+" is created");
    }

    public static Triple getInstance(int id){
        if(id<0 || id>2) return null;
        if(triples[id]==null){
            synchronized (Triple.class){
                if(triples[id]==null){
                    triples[id] = new Triple(id);
                }
            }
        }
        return triples[id];
    }

    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int id = random.nextInt(0,3);
            System.out.println(id);
            System.out.println(getInstance(id));
        }
    }


}
