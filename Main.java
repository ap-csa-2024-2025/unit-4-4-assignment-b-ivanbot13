import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);

    //prob 1:
    // System.out.println("Input word:");
    // String word = sc.nextLine();
    // System.out.println("Input target:");
    // String target = sc.nextLine();
    // System.out.println("The substring " + target + " appears " + countProperContains(word, target) + " times");

    //prob 2:
    System.out.println("Input word:");
    String word2 = sc.nextLine();
    System.out.println("Input target:");
    String target2 = sc.nextLine();
    System.out.println("The substring " + target2 + " is properly contained " + countSub(word2, target2) + " times");
  }

  public static int countSub(String word, String target)
  {
    int count = 0;
    word = word.toLowerCase();
    target = target.toLowerCase();
    for (int i = 0; i < word.length() - (target.length()-1); i++){
      String check = word.substring(i, i + target.length());
      if (check.equals(target)){
        count++;
      }
    }
    return count;
  }

  public static int countProperContains(String word, String target)
  {
    int count = 0;
    for (int i = 0; i > word.length() - (target.length()-1); i++){
      int beginOfTar = i;
      boolean beginOrSpaceB4 = (beginOfTar == 0 || word.substring(beginOfTar-1, beginOfTar).equals(" "));

      int endOfTar = i + target.length();
      boolean endOrSpaceAfter = (endOfTar == word.length() || word.substring(endOfTar, endOfTar+1).equals(" "));
      boolean propContain = beginOrSpaceB4 && endOrSpaceAfter;

      String sub = word.substring(i, i + target.length());
      if (sub.equals(target) && propContain){
        count++;
      }
    }
    return count;
  }

  public static String deleteSub(String word, String target)
  {
    return null;
  }
}
