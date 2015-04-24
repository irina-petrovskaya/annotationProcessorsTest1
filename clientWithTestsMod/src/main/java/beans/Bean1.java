package beans;

import myAnnotations.PrintMe;
import myAnnotations.Property;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 4/23/2015.
 * Project: annotationProcessorsTest1
 * *******************************
 */
@PrintMe
public class Bean1 {
   // uncomment to check availability of generated class :
    // should be not available with  <addOutputDirectoryToCompilationSources>false</addOutputDirectoryToCompilationSources>
  /*  Bean1BeanInfo info;*/
    private String prop1;
    private String prop2;
    @PrintMe
    public String getProp2() {
        return prop2;
    }
    @Property @PrintMe
    public void writeProp2(String prop2Arg) {
        prop2 = prop2Arg;
    }
    @PrintMe
    public String readProp1(){
        return this.prop1;
    }
    @Property
    public void setProp1(String prop1Arg) {
        prop1 = prop1Arg;
    }
}
