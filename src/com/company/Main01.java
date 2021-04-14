package com.company;

public class Main01 {
    public static void main(String[] args) {
      //해당 방법은 Get - Set method드를 적용하기 이전 방법
        Ball ball = new Ball("Yellow","Tennis",1,2);
        Ball rugby = new Ball("white","Rugby",4,5);

        //After applying get set method
        ball.setName("Football");
        ball.setColor("White");
        ball.setBouncerate(4);
        ball.setCapacity(3);

        System.out.println(ball.getName());

        ball.setName("Golf");
        ball.setColor("White");
        ball.setBouncerate(4);
        ball.setCapacity(3);

        System.out.println(ball.getName());
        System.out.println(ball);

        ball.showColor();
       ball.showName();
       ball.showCapacity();
       ball.showBouncerate();
        System.out.println();
       rugby.showColor();
       rugby.showName();
       rugby.showCapacity();
       rugby.showBouncerate();

//       Basketball basketball = new Basketball();
//       basketball.color2 = "Blue";
//       basketball.name2 = "Wilson";
//        System.out.println(basketball.name2);
//        System.out.println(basketball.color2);
    }
}
