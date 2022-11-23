package com.test;

import java.util.ArrayList;

@FunctionalInterface
interface Addition //Functional interface
{
    public void add(int a,int b);
}

@FunctionalInterface
interface Average
{
    
    double average(int[] array);
    
    default void sum(int[] array)
    {
        int length=array.length;
        double sum=0;
        for(int i=0;i<length;i++)
        {
            sum=sum+array[i];
        }
        System.out.println(sum);
        
    }
}


public class LambdaExpression {

    public static void main(String[] args) {
        
        //Syntax - (arguments-list) -> {body}
        
        ArrayList<Integer> list=new ArrayList<>();
        list.add(12);
        list.add(22);
        list.add(32);
        list.add(43);
        list.add(556);
        list.add(87);
        
        list.forEach((e)->             //Java 8
            {
            System.out.println(e);
            }
        );
    
        Addition result=(a,b)->                 
        {
            System.out.println("Sum="+(a+b));
        };
        
        
        result.add(23, 56);
        
        
        int array[]= {1,7,8,5,3,44,33,22};
        
        Average avg=(arr) ->
        {
            int length=arr.length;
            double sum=0;
            for(int i=0;i<length;i++)
            {
                sum=sum+arr[i];
            }
            
            return sum/length;
        };
        
        
        System.out.println(avg.average(array));
        
        
        list.forEach((Integer x)->{
            int y=x*x; 
            System.out.print(y+",");
            });
        
        
        avg.sum(array);
        
    }
        

}


