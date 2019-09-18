package part1.chap7.methods;

/*
В данном примере конструкторы определяются в классе Box для инициализации
размеров параллелепипеда тремя разными способами
 */
public class Box {
    double widht;
    double height;
    double depth;

    //Это конструктор класса Box при указании всех размеров
    public Box(double w, double h, double d) {
        widht = w;
        height = h;
        depth = d;
    }

    //конструктор, когда ни один размер не указан
    public Box() {
        widht = -1;
        height = -1;
        depth = -1;
    }

    //конструктор, при создании куба
    public Box(double len) {
        widht = height = depth = len;
    }

    //Рассчитать и возвратить объем
    double volume() {
        return widht * height * depth;
    }
}

class OverloadCond {
    public static void main(String[] args) {
        //создать параллелепипеды, используя разные конструкторы
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box();
        Box mycube = new Box(7);

        double vol;

        //получить объем первого параллелепипеда
        vol = mybox1.volume();
        System.out.println("Объем mybox1 равен " + vol);

        //получить объем второго параллелепипеда
        vol = mybox2.volume();
        System.out.println("Объем mybox2 равен " + vol);

        //получить объем куба
        vol = mycube.volume();
        System.out.println("Объем mycube равен " + vol);
    }
}
