/**
 * @Auther: eftales
 * @Date: 2021/1/24 17:29
 * @Description: 学习 java
 * @Version: 0.0.1
 **/
import org.lean.VarType;
import org.lean.Arithmetic;
import org.lean.CharWithString;
import org.lean.MakeArray;
import org.lean.ProcessControl;
import org.lean.Input;
import org.lean.UseArray;
import org.lean.javaclass.ClassDemo;

public class Main {
    /*
     *@Auther: eftales
     *@Date: 2021/1/24 17:30
     *@Description: 
     *@Version: 0.0.1
     *@Param: [argv]
     *@return: void
    **/
    public static void main(String[] args){
        new VarType().show();
        new Arithmetic().show();
        new CharWithString().show();
        new MakeArray().show();
        new ProcessControl().show();
        new UseArray().show();
        new ClassDemo().show();

        //new Input().show();
    }

}
