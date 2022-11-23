package com.test;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPIExample {

    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(12);
        list.add(22);
        list.add(31);
        list.add(42);
        list.add(57);
        list.add(62);
    
        int count=(int) list.stream().count();
        System.out.println(count);
        
        
        List<Integer> number=Arrays.asList(1,12,3,24,5);
        
        List<Integer> square=(List<Integer>) number.stream()
                .map((x) -> x * x)
                .collect(Collectors.toList());
        
        List<Integer> sorted=(List<Integer>) number.stream()
                .sorted()
                .collect(Collectors.toList());
        
        
        
        System.out.println(square);
        System.out.println(sorted);
        
        List<Integer> evenNumbers=list.stream()
                .filter( (x) -> x%2==0)
                .collect(Collectors.toList());
        
        System.out.println(evenNumbers);
        
        List<String> names=Arrays.asList("C","C++","Java","Python");
        List<String> filteredNames=names.stream()
                .filter(s -> s.startsWith("P"))
                .collect(Collectors.toList());
        
        System.out.println(filteredNames);
        
        List<String> sortedNames=names.stream()
                .sorted()
                .collect(Collectors.toList());
        
        System.out.println(sortedNames);
        
        
        
        //foreach operation
        List<Integer> values=Arrays.asList(66,77,44,32,22);
        values.stream().map(x->x).forEach(x->System.out.println(x));
                
        
        
    }

}

