import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String in = s.nextLine();
    String[] st = in.split(" ");
    int[] a= new int[st.length];
    for (int i=0;i<st.length;i++) {
      a[i] = Integer.parseInt(st[i]);
    }
    int r= 0;
    for (int i=0;i<a.length;i++) {
      r+=a[i];
    }
    System.out.println(r);
  }
}