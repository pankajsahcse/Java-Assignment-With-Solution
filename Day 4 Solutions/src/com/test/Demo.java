package com.test;
public class Demo {

    public static void main(String[] args) {

        System.out.println("Boxing");

        int a = 10;

        Integer obj = Integer.valueOf(a);

        System.out.println("Primitive int : " + a);
        System.out.println("Integer object: " + obj);


        System.out.println("Unboxing");

        Integer num = Integer.valueOf(20);

        int b = num.intValue();

        System.out.println("Integer object: " + num);
        System.out.println("Primitive int : " + b);


        System.out.println("Autoboxing");

        int x = 30;

        Integer xObj = x;

        System.out.println("Primitive int : " + x);
        System.out.println("Integer object: " + xObj);


        System.out.println("Auto-unboxing");

        Integer yObj = 40;

        int y = yObj;

        System.out.println("Integer object: " + yObj);
        System.out.println("Primitive int : " + y);


        System.out.println(" Wrapper  Methods");

        String s1 = "100";
        int n1 = Integer.parseInt(s1);

        System.out.println("parseInt() = " + n1);

        String s2 = "25.50";
        double n2 = Double.parseDouble(s2);

        System.out.println("parseDouble() = " + n2);

        Integer n3 = Integer.valueOf("200");

        System.out.println("valueOf() = " + n3);

        int n4 = 500;
        String str = Integer.toString(n4);

        System.out.println("toString() = " + str);

        Integer p = 50;
        Integer q = 100;

        System.out.println("compareTo() = " + p.compareTo(q));


        System.out.println(" String Objects ");

        String name1 = "Java";

        String name2 = new String("Java");

        System.out.println("String literal : " + name1);
        System.out.println("new String()   : " + name2);


        System.out.println("String Comparison ");

        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");

        System.out.println("str1 == str2 : " + (str1 == str2));
        System.out.println("str1 == str3 : " + (str1 == str3));

        System.out.println("str1.equals(str2) : " + str1.equals(str2));
        System.out.println("str1.equals(str3) : " + str1.equals(str3));

        System.out.println("String Pool ");

        String sA = "Java";
        String sB = "Java";
        String sC = new String("Java");

        System.out.println("sA == sB : " + (sA == sB));
        System.out.println("sA == sC : " + (sA == sC));
        System.out.println("sA.equals(sC) : " + sA.equals(sC));


        System.out.println("String Operations ");

        String text = "Hello Java World";

        System.out.println("length() = " + text.length());

        System.out.println("charAt(1) = " + text.charAt(1));

        System.out.println("substring(6) = " + text.substring(6));

        System.out.println("indexOf(\"Java\") = " + text.indexOf("Java"));

        System.out.println("contains(\"Java\") = " + text.contains("Java"));

        System.out.println("replace() = " + text.replace("Java", "Python"));

        String[] words = text.split(" ");

        System.out.println("split():");

        for (String word : words) {
            System.out.println(word);
        }

        System.out.println("toUpperCase() = " + text.toUpperCase());

        System.out.println("toLowerCase() = " + text.toLowerCase());

        String spaceText = "   Hello Java   ";

        System.out.println("Before trim() = '" + spaceText + "'");
        System.out.println("After trim()  = '" + spaceText.trim() + "'");


        System.out.println("StringBuilder Operations");

        StringBuilder sb = new StringBuilder("Hello");

        sb.append(" Java");

        System.out.println("append() = " + sb);

        sb.insert(6, "World ");

        System.out.println("insert() = " + sb);

        sb.delete(6, 12);

        System.out.println("delete() = " + sb);

        sb.replace(6, 10, "Java");

        System.out.println("replace() = " + sb);

        sb.reverse();

        System.out.println("reverse() = " + sb);


        System.out.println(" String vs StringBuilder");

        String strObj = "Hello";

        strObj.concat(" Java");

        System.out.println("String = " + strObj);

        StringBuilder builder = new StringBuilder("Hello");

        builder.append(" Java");

        System.out.println("StringBuilder = " + builder);
    }
}