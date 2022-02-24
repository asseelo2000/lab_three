package lab_three.lab_three_exercises.src.lab_three_assignment;

/**
 * Created by Asseel Tarish on 2/7/2022.
 */
public class Q3 {
    ///////////assignment Q3.25//////////////
    public Singly_Linked_List<E>Concatenating_tow_lists(Singly_Linked_List<E>list1,Singly_Linked_List<E>list2){
        list1.tail.setNext(list2.head);
        list1.size=list1.size+list2.size;
        return list1;
    }
}
