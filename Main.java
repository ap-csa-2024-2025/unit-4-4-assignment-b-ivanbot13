import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);

    //prob 1:
    System.out.println("Input word:");
    String word = sc.nextLine();
    System.out.println("Input target:");
    String target = sc.nextLine();
    System.out.println("The substring " + target + " appears " + countSub(word, target) + " times");

    //prob 2:
    
  }

  public static int countSub(String word, String target)
  {
    int count = 0;
    word = word.toLowerCase();
    target = target.toLowerCase();
    for (int i = 0; i < word.length()-(target.length()-1); i++){
      String check = word.substring(i, i + target.length());
      if (check.equals(target)){
        count++;
      }
    }
    return count;
  }

  public static int countProperContains(String word, String target)
  {
    return 0;
  }

  public static String deleteSub(String word, String target)
  {
    return null;
  }
}
