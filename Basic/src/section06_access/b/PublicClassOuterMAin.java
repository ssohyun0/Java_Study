package section06_access.b;

import section06_access.a.PublicClass;
// import section06_access.a.DefaultClass1;
public class PublicClassOuterMAin {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();

        //다른 패키지 접근 불가
//        DefaultClass1 class1 = new DefaultClass1();
//        DefaultClass2 class2 = new DefaultClass2();
    }
}
