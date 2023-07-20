package sec02;

import java.util.List;

public class Ex2 {
    public static void main(String[] args) {
        // ChildGen<ParentCls> c1 = new ChildGen<ParentCls>(); 오류
        ChildGen<RestrictCls> c2 = new ChildGen<>(); // 1.7이상은 뒤에 꺼 생략 가능
        ChildGen<Season> c3 = new ChildGen<>(); // 상속에 제한을 걸 수 있다. 이를 제네릭의 제한이라고 한다.

        MultiGen4 m4 = new MultiGen4();

    }
}
