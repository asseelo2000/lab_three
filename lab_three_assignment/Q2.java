package lab_three.lab_three_exercises.src.lab_three_assignment;

/**
 * Created by Asseel Tarish on 2/7/2022.
 */
public class Q2 {
    ///////////assignment Q3.9//////////////
    public int size_not_as_instance(){
        Node<E>n=head;
        int size=0;
        if (head==null)return size;
        while (n!=null){
            n=n.getNext();
            size++;
        }
        return size;
    }
}
