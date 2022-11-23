package com.test;



import java.util.function.BiFunction;

@FunctionalInterface
interface TestInterface
{
    void hello();
}

 class ReferenceToInstanceMethod
{
    public void test()
    {
        System.out.println("This is a non static method" );
    }
}
 
 
public class MethodReferencesExample {
    
    public static int addition(int a,int b)
    {
        return a+b;
    }
    
    
    
    
    public static void main(String args[])
    {
        BiFunction<Integer, Integer, Integer> function=MethodReferencesExample::addition;
        System.out.println(function.apply(10, 20));
        
        BiFunction<Integer, Integer, Integer> functionLambda=(a,b) -> MethodReferencesExample.addition(a, b);
        System.out.println(functionLambda.apply(30, 40));
        
        
        ReferenceToInstanceMethod ob=new ReferenceToInstanceMethod();
        
        TestInterface  testinterface=ob::test;
        testinterface.hello();
        
    }

}

