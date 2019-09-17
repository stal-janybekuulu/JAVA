package part1.chap6.classes;

public class TestStack {
    public static void main(String[] args) {
        StackExample mystack1 = new StackExample();
        StackExample mystack2 = new StackExample();

        //Разместить числа в стеке
        for (int i = 0; i < 10; i++) {
            mystack1.push(i);
        }
        for (int i = 10; i < 20; i++) {
           mystack2.push(i);
        }

        //Извлечь эти числа из стека
        System.out.println("Содержимое стека mystack1: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(mystack1.pop());
        }

        System.out.println("Содержимое стека mystack2: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(mystack2.pop());
        }
    }
}
