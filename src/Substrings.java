import java.util.Scanner;
public class Substrings
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.next();
        System.out.println("Substrings of " + str + " are : ");
        int i, j;
        for (i = 0; i < str.length(); i++)
        {
            for (j = i + 1; j <= str.length(); j++)
            {
                System.out.println(str.substring(i, j));
            }
        }
    }
}
