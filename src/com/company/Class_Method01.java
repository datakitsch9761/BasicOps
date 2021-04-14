package com.company;

public class Class_Method01 {
    public static void main(String[] args) {
    myName("Paulo");
    anotherMethod();
    addnums(4,5);
    getArea(10,10);

    int area = getArea(10,10) + 23 - 4;
        System.out.println(area);

    System.out.println("The area is : " + getArea(10,10));

        System.out.println("Full name is :" + fullname( "Paulo","Dichone") + " Hello");

        System.out.println("My Truth : " + isTrue(true,true));
    } //main method



    //method
    public static boolean isTrue(boolean a, boolean b){
        if(a != b){
            return a;
        }else{
            return b;
        }
    }

    public static String fullname(String firstName, String lastName){
        return firstName +  " " + lastName;
    }

    public static void myName(String mName){
        //method needs to have a name
        //to call the method you need to call it on main
        //Having independent entity
        //"void" -> doesn't return anything
        //passing parameters ()괄호에 들어가는 정보
        System.out.println(mName);
    }
    public static int getArea(int width, int height){
        return width * height;
    }

    public static void addnums(int a, int b){
        System.out.println("Sum " + (a + b));
    }
    public static void anotherMethod(){
        System.out.println("Another Method");
    }

} //class

