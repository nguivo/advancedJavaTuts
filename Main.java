public class Main {

    @MarkerAnnotation(value = 10)
    public void sayHello() {
        System.out.println("The Marker annotation is being used here!");
    }

    public static void main(String[] args) {
        Color c1 = Color.GREEN;

        System.out.println(Color.RED);
        System.out.println(Color.RED.name());
        System.out.println(Color.BLUE.getValue());

        System.out.println(c1);
        System.out.println(Day.FRIDAY);

        //iterating over all the enum types in an enum
        System.out.println("All the enum types in the enum are:");
        for (Color color : Color.values()) {
            System.out.println(color.getValue());
        }

        Main mn = new Main();
        mn.sayHello();
    }


}
