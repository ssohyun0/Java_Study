package section05_pack;
import section05_pack.a.User;
// import section05_pack.a.*; // pack.a의 모든 클래스 사용
public class PackageMain2 {
    public static void main(String[] args) {
        Data data = new Data();
        User user = new User(); //import 사용으로 패키지 명 생략 가능
    }
}
