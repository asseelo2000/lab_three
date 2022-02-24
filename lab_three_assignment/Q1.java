package lab_three.lab_three_exercises.src.lab_three_assignment;

/**
 * Created by SCC on 2/7/2022.
 */
public class Q1 {
    public E find_second_node(Node<E> n){
        Node<E> t=n;
        if (t==null||t.getNext()==null)return null;
        while (t.getNext().getNext()!=null)
        {
            t=t.getNext();
        }
        return t.getElement();
    }
}
