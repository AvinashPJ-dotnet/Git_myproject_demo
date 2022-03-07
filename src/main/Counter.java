package main;
//Java Program to demonstrate the use of an instance variable
//which get memory each time when we create an object of the class.
class Counter{
//    int count=0;//will get memory each time when the instance is created
    static int count=0;//will get memory only once and retain its value

    Counter(){
        count++;//incrementing value
        System.out.println(count);
    }
}
