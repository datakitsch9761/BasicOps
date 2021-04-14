package finalclass;

enum Season{봄,여름,가을,겨울}

public class People{
    public String name;
    public Season favorite_session;

    public static void main(String[] args) {
        People people = new People();
        people.name = "홍길동";
        people.favorite_session = Season.봄;

        System.out.println("이름 : " + people.name);
        System.out.println("좋아하는 계절 : " + people.favorite_session);

    }
}