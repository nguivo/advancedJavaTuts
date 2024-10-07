import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)  //annotation can be applied to methods
@Retention(RetentionPolicy.RUNTIME)  // the annotation should run at runtime
public @interface MarkerAnnotation {
    //custom annotation
    int value();
}
