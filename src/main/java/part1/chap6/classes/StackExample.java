package part1.chap6.classes;

/*
В этом классе определяется целочисленный стек,
в котором можно хранить до 10 челочисленных значений
 */
public class StackExample {
    int stck[] = new int[10];
    int tos;

    //Инициализировать вершину стека
    StackExample() {
        tos = -1;
    }

    //Разместить элемент в стеке
    void push(int item) {
        if (tos == 9) {
            System.out.println("Стек заполнен.");
        }
        else {
            stck[++tos] = item;
        }
    }

    //Извлечь элемент из стека
    int pop() {
        if (tos < 0) {
            System.out.println("Стек не загружен.");
            return 0;
        }
        else {
            return stck[tos--];
        }
    }
}
