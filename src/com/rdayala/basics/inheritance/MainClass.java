package com.rdayala.basics.inheritance;

/*
 * Constructors and initializers(Static initializers and instance initializers) are not inherited to sub classes. 
 * But, they are executed while instantiating a sub class.
 *  
 */

class A
{
    int i;
 
    static
    {
        System.out.println("Class A SIB");
    }
 
    {
        System.out.println("Class A IIB");
    }
 
    A()
    {
        System.out.println("Class A Constructor");
    }
}
 
class B extends A
{
    int j;
}
 
class MainClass
{
    public static void main(String[] args)
    {
        B b = new B();
    }
}
