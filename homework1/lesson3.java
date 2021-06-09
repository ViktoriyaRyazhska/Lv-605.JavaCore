import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class lesson3 {
  public static void main(String[] args) throws IOException {
      BufferedReader hope =  new BufferedReader(new InputStreamReader(System.in));
      System.out.println("як твої справи?");
      String text =  hope.readLine();
      System.out.println("а якщо пригостити ще кавою буде " + text);
      String tex1 =  hope.readLine();
      System.out.println("пішли на каву " + tex1);
    }
}
