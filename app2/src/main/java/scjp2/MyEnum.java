package scjp2;

/**
 * Describe class <code>MyEnum</code> here.
 * (setq-default  clang-format-style "Chromium")
 * (setq-default  clang-format-style "Google")
 * (setq-default  clang-format-style "LLVM")
 * (setq-default  clang-format-style "WebKit")
 * (setq-default  clang-format-style "Mozilla")
 * @author <a href="mailto:root@zink">root</a>
 * @version 1.0
 */
public class MyEnum {
    int y = 1;

    enum Colors { RED, BLUE, GREEN }

    /**
     * Describe <code>main</code> method here.
     *
     * @param args a <code>String</code> value
     */
    public static void main(String[] args) {
        int xy = 1;
        Colors red1 = Colors.RED;
        Colors red2 = Colors.RED;

        if (10 > 2 && 5 > 1) {
        }

        System.out.println("no");
        String s = (10 > 5) ? ("yes") : ("no");
        System.out.println("red1 == red2 " + (red1 == red2));
        System.out.println("red1 equals(red2) " + (red1.equals(red2)));
    }
}
