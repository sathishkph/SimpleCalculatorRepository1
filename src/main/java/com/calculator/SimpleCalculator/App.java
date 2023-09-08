package com.calculator.SimpleCalculator;

/**
 * Hello world!
 *
 */
public class App 
{
public int add(int m,int n)
{
return m+n
}
public int sub(int m,int n)
{
return m-n;	
}

    public static void main( String[] args )
    {
        App obj=new App();
       System.out.println(obj.add(2, 3));
       System.out.println( obj.sub(20,10));
    }
}
