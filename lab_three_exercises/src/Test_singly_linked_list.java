package lab_three.lab_three_exercises.src;

import java.util.Scanner;

/**
 * Created by SCC on 2/1/2022.
 */
public class Test_singly_linked_list {  public static void main(String[] args) {
    Scanner in = new  Scanner(System.in);
    Singly_Linked_List<String> numList = new Singly_Linked_List<String>();
    System.out.println("Enter four names:\n");
    for (int i = 0; i < 4; i++) {
        numList.addLast(in.nextLine());
    }
    for (int i = 0; i < 4; i++) {
        System.out.println(numList.removFirst());
    }

//        numList.addLast(2);
//        numList.addFirst(0);

    System.out.println("size of list: "+numList.size());
    System.out.println("First of list: "+numList.first());

}

}
