package section05_pack;
import section05_pack.a.User;

public class PackageMain3 {
    public static void main(String[] args) {
        User userA = new User();
        section05_pack.b.User userB = new section05_pack.b.User();
    }
}