import java.io.IOException;

public class Main{
  public static void main(String args[]) throws Exception {
    String cmd = " echo 'println(42)' > script.kts | sh ";
    Runtime.getRuntime().exec(cmd);
  }
}
