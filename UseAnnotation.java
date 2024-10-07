import java.lang.reflect.Method;

public class UseAnnotation {

    @MarkerAnnotation(value = 12)
    public void giveThanks() {
        System.out.println("Thank God for Everything!");
    }

    public static void main(String[] args) throws Exception {
        // this isn't best practice
        // but we can do this to see what the annotation is doing.

        UseAnnotation user = new UseAnnotation();
        Method methodVal = user.getClass().getMethod("giveThanks");
        MarkerAnnotation myAnnotat = methodVal.getAnnotation(MarkerAnnotation.class);
        System.out.println("Annotation Value: "+ myAnnotat.value());
    }
}
