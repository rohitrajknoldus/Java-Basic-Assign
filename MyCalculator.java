// Question no-18
package javaCore;
@FunctionalInterface
interface Calculator 
{
    public int calculate(int num1, int num2);
}
class MyCalculato0 implements Calculator 
{
    @Override
    public int calculate(int num1, int num2)
    {
        return num1 + num2;
    }
}
class MyCalculator1
{
            public int calculate(int num1, int num2) 
            {
                return num1 + num2;
            }
}
class MyCalculator
{
    public static void main(String[] args) 
    {
        Calculator calc = (num1, num2) -> { return num1 + num2; };
        System.out.println(calc.calculate(4, 5));
    }
}