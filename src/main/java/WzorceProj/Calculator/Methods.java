package WzorceProj.Calculator;

import org.apache.commons.math3.util.ArithmeticUtils;
import org.apache.commons.math3.util.CombinatoricsUtils;

public class Methods {
    public int add(int a, int b){
        return a+b;
    }
    public int subtract(int a, int b){
        return a-b;
    }
    public int multiple(int a, int b){
        return a*b;
    }
    public int divide(int a, int b){
        return a/b;
    }

    public long factorial(int n){
        return CombinatoricsUtils.factorial(n);
    }


    public long powerOf(int a, int b){
        return ArithmeticUtils.pow(a,b);
    }

    public Methods throwException() throws Exception {
        throw new Exception();
    }

}
