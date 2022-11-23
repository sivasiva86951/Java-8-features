package com.test;

import java.util.Optional;

public class OptionalClassExample {

    private static void isPresentOptional()
    {
        Optional<String> st=Optional.of("Java");//non-empty optional object
        System.out.println(st.isPresent());//true
        
    }
    
    private static void createEmptyOptionalObject()
    {
        Optional<String> st=Optional.empty();//empty optional object
        System.out.println(st.isPresent());//false
    }
    
    private static void createEmptyOptionalWithStaticAPI()
    {
        String st="Java 8"; 
        System.out.println(Optional.of(st));
        System.out.println(Optional.of(st).get());
    }
    
    
    private static void ifPresentOptionalAPI()
    {
        //before optional class we would do something like this
        String st="Optional class";
        if(st!=null)
        {
            System.out.println(st.length());
        }
        
        
        //Using optional class
        Optional<String> s=Optional.of(st);
        s.ifPresent(x->System.out.println(x.length()));
    }
    public static void main(String[] args) {
        
        isPresentOptional();
        createEmptyOptionalObject();
        createEmptyOptionalWithStaticAPI();
        ifPresentOptionalAPI();
    }

}
