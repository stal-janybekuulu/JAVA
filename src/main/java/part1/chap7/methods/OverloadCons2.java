package part1.chap7.methods;
/*
Один объект допускается инициализировать другим
 */

class Box2 {
    double width;
    double height;
    double depth;

    //Обратите внимание на этот конструктор.
    //В качестве параметра в нем используется объект типа Box
    Box2(Box2 ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    //конструктор, используемый при указании всех размеров
    public Box2(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    //конструктор, используемый если ни один размер не задан
    public Box2() {
        width = -1;
        height = -1;
        depth = -1;
    }

    //конструктор, используемый для создания куба
    public Box2(double len) {
        width = height = depth = len;
    }

    //рассчитать и возвратить объем
    double volume() {
        return width * height * depth;
    }
}

public class OverloadCons2 {
    public static void main(String[] args) {
        Box2 mybox1 = new Box2(10, 20 ,15);
        Box2 mybox2 = new Box2();
        Box2 mycube = new Box2(7);

        Box2 myclone = new Box2(mybox1);

        double vol;

        //получить объем первого параллелепипеда
        vol = mybox1.volume();
        System.out.println(vol);
        //получить объем второго параллелепипеда
        System.out.println(mybox2.volume());
        //получить объем куба
        System.out.println(mycube.volume());
        //получить объем клона
        System.out.println(myclone.volume());
    }
}
