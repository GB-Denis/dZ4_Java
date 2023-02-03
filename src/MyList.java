import java.util.LinkedList;

/*
Реализуйте очередь с помощью LinkedList со следующими методами:
enqueue() - помещает элемент в конец очереди,
dequeue() - возвращает первый элемент из очереди и удаляет его,
first() - возвращает первый элемент из очереди, не удаляя.
 */
public class MyList {
    private LinkedList<Integer> myList;

    public MyList () {
        this.myList = new LinkedList<>();
    }

    public void enqueue(int num) {
        this.myList.add(num);
    }

    public int dequeue() {
        int num =  this.myList.getFirst();
        this.myList.remove(0);
        return num;
    }

    public int first() {
        return this.myList.getFirst();
    }
}
