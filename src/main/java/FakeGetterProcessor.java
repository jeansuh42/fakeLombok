import com.google.auto.service.AutoService;
import javax.annotation.processing.ProcessingEnvironment;

import javax.annotation.processing.*;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.TypeElement;
import java.util.Set;

@SupportedAnnotationTypes("org.test.fakeLombok.fakeGetter")
@SupportedSourceVersion(SourceVersion.RELEASE_0)
@AutoService(Processor.class)
public class FakeGetterProcessor extends AbstractProcessor {

    @Override
    public boolean process(Set<? extends TypeElement> set, RoundEnvironment roundEnvironment) {
        System.out.println("애노테이션 프로세스 나와라 오바");
        return false;
    }

    @Override
    public synchronized void init(ProcessingEnvironment processingEnv) {
        System.out.println("processingEnv" + processingEnv);
        super.init(processingEnv);
        //프로세싱에 필요한 기본적인 정보들을 processingEnvironment 부터 가져올 수 있습니다.
    }
}
