package Decorator;

public class Main {
    public static void main(String[] args) {
        Display b1 = new StringDisplay("Hello, world.");
        Display b2 = new UpDownBorder(b1, '-');
        Display b3 = new FullBorder(b2);
        b1.show();
        b2.show();
        b3.show();
        Display b4 =
                        new FullBorder(
                            new UpDownBorder(
                                new SideBorder(
                                    new UpDownBorder(
                                            new SideBorder(
                                                new StringDisplay("Hello,world"),'*'
                                            ),
                                            '='
                                    ),
                                    '|'
                                ),
                                    '/'
                            )
                        );
        b4.show();

        MultiStringDisplay md = new MultiStringDisplay();
        md.add("good morning");
        md.add("good afternoon");
        md.add("good night, see u tomorrow");
        md.show();

        Display dd1 = new SideBorder(md,'#');
        dd1.show();
        Display dd2 = new FullBorder(md);
        dd2.show();
    }
}
