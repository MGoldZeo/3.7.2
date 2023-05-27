import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
public class Freedom
{
    static int ind = 0;
    static String word;
    static ArrayList<String> nums = new ArrayList<>(Arrays.asList("one", "two", "three"));
    public static void loop()
    {
        while (true)
        {
            System.out.println(nums);
            Scanner sc = new Scanner(System.in);
            System.out.println("Add, Remove, or Replace?");
            String in = sc.nextLine();
            in.toLowerCase();
            switch (in)
            {
                case "add", "a" -> add();
                case "remove", "r" -> remove();
                case "replace", "p" -> replace();
            }

        }
    }

    private static void add()
    {
        Scanner sca = new Scanner(System.in);
        System.out.println("What would you like to add?");
        word = sca.nextLine();
        System.out.println("Where would you like to add it?");
        try
        {
            ind = Integer.parseInt(sca.nextLine());
        }
        catch (Exception e)
        {
            System.out.println("Try again");
            add();
        }
        if (ind < nums.size())
        {
            nums.add(ind, word);
        }
        else
        {
            System.out.println("Try again");
            add();
        }
    }
    private static void remove()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("What index would you like to remove?");
        try
        {
            ind = scan.nextInt();
        }
        catch(Exception e)
        {
            System.out.println("Try again");
            remove();
        }
        if (ind < nums.size())
        {
            nums.remove(ind);
        }
    }
    private static void replace()
    {
        Scanner scann = new Scanner(System.in);
        System.out.println("What index do you want to replace?");
        try
        {
            ind = scann.nextInt();
        }
        catch(Exception e)
        {
            System.out.println("Try again");
            remove();
        }
        if (ind < nums.size())
        {
            System.out.println("What do you want to change it to?");
            word = scann.nextLine();
            nums.set(ind, word);
        }
    }
}
