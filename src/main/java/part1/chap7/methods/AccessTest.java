package part1.chap7.methods;

/*
Отличие модификаторов public и private
 */

class Test5 {
    int a;          //доступ по умолчанию
    public int b;   //открытый доступ
    private int c;  //закрытый доступ

    //Методы геттер и сеттер для переменной c
    public int getC() {
        return c;
    }

    public void setC(int i) {
        c = i;
    }
}

public class AccessTest {
    public static void main(String[] args) {
        Test5 ob = new Test5();

        //a и b доступны, один по умолчанию, другой public
        ob.a = 10;
        ob.b = 20;

        //с неверно будет ошибка
        //ob.c = 100;

        ob.setC(100); //так верно
        System.out.printf("a,b и c: " + ob.a + " " + ob.b + " " + ob.getC());
    }
}
