import javax.script.*;
import java.io.IOException;

public class Main{
  public static void main(String args[]) throws Exception {
    ScriptEngine engine = new ScriptEngineManager().getEngineByExtension("kts");
    Bindings bindings = new SimpleBindings();
    bindings.put("extra",5);
    engine.setBindings(bindings, ScriptContext.GLOBAL_SCOPE);

    System.out.println(engine.eval("2 + 3 + extra"));
  }
}
