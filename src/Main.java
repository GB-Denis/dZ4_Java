import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        zadacha1();
        zadacha2();
        zadacha3();
    }
    static void zadacha1(){
        /*
        Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
         */
        System.out.println("Задача №1");
        LinkedList<Integer> linkedList = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            linkedList.add(random.nextInt(100));
        }
        ListIterator<Integer> iterator = linkedList.listIterator();
        System.out.println("Начальный список: ");
        while(iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
        System.out.println("\nПеревернутый список: ");
        while (iterator.hasPrevious()){
            System.out.print(iterator.previous() + " ");
        }
        System.out.println();
    }

    static void zadacha2() {
        System.out.println();
        System.out.println("Задача №2");
        MyList myList = new MyList();
        myList.enqueue(10);
        myList.enqueue(4);
        System.out.println("Первый элемент в листе: " + myList.first());
        myList.dequeue();
        myList.enqueue(7);
        System.out.println("Первый элемент в листе: " + myList.first());
        myList.enqueue(93);
        myList.dequeue();
        myList.enqueue(8);
        System.out.println("Первый элемент в листе: " + myList.first());
        myList.dequeue();
        System.out.println("Первый элемент в листе: " + myList.first());

    }

    static void zadacha3(){
        /*
        Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. Используйте итератор
         */
        System.out.println();
        System.out.println("Задача №3");

        LinkedList<Integer> linkedList = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            linkedList.add(random.nextInt(100));
        }
        int sum = 0;
        for (Integer integer : linkedList) {
            sum += integer;
        }
        System.out.println("Список: " + linkedList);
        System.out.println("Сумма всех элементов: " + sum );

    }


}


