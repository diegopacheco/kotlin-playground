import java.io.IOException;

public class Main{
  public static void main(String args[]) throws Exception {
    String cmd = " println(42) > script.kts | kotlinc -script ";
    Runtime.getRuntime().exec(cmd);
  }
}
