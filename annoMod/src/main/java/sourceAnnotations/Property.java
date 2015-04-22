package sourceAnnotations;
/**
 * *******************************
 * Created by Irina.Petrovskaya on 4/22/2015.
 * Project: annotationProcessorsTest1
 * *******************************
 */

import java.lang.annotation.*;

@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.SOURCE)
public @interface Property {
    String editor() default "";
}