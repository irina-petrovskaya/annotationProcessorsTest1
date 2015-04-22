package mybeans;


import myAnnotations.Property;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 4/22/2015.
 * Project: annotationProcessorsTest1
 * *******************************
 */
public class B1 {
    int myAgeProperty;
    String myNameProperty;
    String myFooProperty;

    @Property()
    public String getName() {
        return myNameProperty;
    }

    @Property()
    public int getAge() {
        return myAgeProperty;
    }

    @Property()
    public String readFoo() {
        return myFooProperty;
    }

    public void setAge(int ageArg) {

        myAgeProperty = ageArg;
    }

    public void setName(String nameArg) {
        myNameProperty = nameArg;
    }
}
