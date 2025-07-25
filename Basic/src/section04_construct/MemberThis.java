package section04_construct;

public class MemberThis {
    String nameField;

    void initMember(String nameParameter) {
        nameField = nameParameter; // (this 생략)nameField = nameParameter;
        // this.nameField = nameParameter; -> 권장은 안함. 최근에는 잘 안쓰는 스타일
    }
}
