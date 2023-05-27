import java.util.ArrayList;
public class Main
{
    public static void main(String[] args)
    {
        /*
         * Activity 3.7.2
         */
        ArrayList<String> animalList = new ArrayList<String>();
        animalList.add("Dog");
        animalList.add("Cat");
        animalList.add("Rabbit");
        animalList.add("Frog");
        animalList.add("Horse");
        animalList.add("Cow");
        // isplaying elements
        System.out.println(animalList);
        /* your code here */
        animalList.add("Bird");
        animalList.add(3, "Snake");
        animalList.remove(animalList.indexOf("Frog"));
        System.out.println(animalList.get(1) + animalList.get(2) + animalList.get(4));
        System.out.println(animalList.size());
        Freedom.loop();
        // display elements
        System.out.println(animalList);
    }
}