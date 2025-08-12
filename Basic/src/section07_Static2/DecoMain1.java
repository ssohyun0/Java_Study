package section07_Static2;

public class DecoMain1 {
    public static void main(String[] args) {
        String s = "hello java";
        DecoUtill1 utils = new DecoUtill1();
        String deco = utils.deco(s);

        System.out.println("before: " + s);
        System.out.println("after: " + deco);

    }

}
