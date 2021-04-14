package com.company;

//Java is object oriented program
//When you open the project there is file "src" -> Source
//class : blue print of objects for instance like "Ball"
//유지보수가 쉽다 !!!!

public class Ball { //blueprint
    //public - anyone can access
    //private - only access within the class
    //Children classes
    //properties or instance variables
        private String color;
        private String name;
        private int capacity;
        private int bouncerate;

        public String color2;
        public String name2;
        public int bouncerate2;

    //Constructor - creating proper objcet / another name is "method"
    //Constructor overloading -> 똑같은 constructor 중복생성 금지 대신 다르게반 변수를 주면 된다!!

        public Ball(String mColor, String mName, int mCapacity, int mBouncerate) {
            this.color = mColor;
            this.name = mName;
            this.capacity = mCapacity;
            this.bouncerate = mBouncerate;
        }

        public Ball() { } //defult constructor

    //Behaviours - method
        public void showColor(){
            System.out.println("My color is " + color);
        }

        public void showName(){
            System.out.println("My name is " + name);
        }

        public void showCapacity(){
            System.out.println("My capacity is " + capacity);
        }

        public void showBouncerate(){
            System.out.println("My bouncerate is " + bouncerate);
        }

        public void showcolor2(){
            System.out.println("My name is " + color2);
        }

    //Get and Set -> 변수를 지정 안해줘도 된다 예시) Ball rugby = new Ball;
        public String getColor() {
        return color;
        }

        public void setColor(String color) {
        this.color = color;
        }

        public String getName() {
        return name;
        }

        public void setName(String name) {
        this.name = name;
        }

        public int getCapacity() {
        return capacity;
        }

        public void setCapacity(int capacity) {
        this.capacity = capacity;
        }

        public int getBouncerate() {
        return bouncerate;
        }

        public void setBouncerate(int bouncerate) {
        this.bouncerate = bouncerate;
        }

}//class


