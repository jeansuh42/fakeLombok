import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.TYPE)
public @interface FakeGetter {
    // 여기에 변수를 추가하면, RequestParam처럼 Key - Value 할당이 가능하다.
}
