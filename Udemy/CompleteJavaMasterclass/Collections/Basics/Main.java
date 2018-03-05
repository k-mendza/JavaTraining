package udemy.completeJavaMasterclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    Theatre theatre = new Theatre("Och", 8, 12);

        if (theatre.reserveSeat("D12")){
            System.out.println("Please pay for D12");
        } else {
            System.out.println("Seat is already reserved");
        }
        if (theatre.reserveSeat("A12")){
            System.out.println("Please pay for A12");
        } else {
            System.out.println("Seat is already reserved");
        }

    // end of main()
    }

    public static void printList(List<Theatre.Seat> list){
        for (Theatre.Seat seat : list){
            System.out.println(" " + seat.getSeatNumber() + seat.getPrice());
        }
        System.out.println();
        System.out.println("===============================================================");
    }

//    /**
//     * Method for sorting the list of seats. It is important to note that it is possible
//     * thanks to @Override of compare method.
//     * @param list
//     */
//
//    public static void sortList(List<? extends Theatre.Seat> list) {
//        for (int i=0; i<list.size()-1; i++){
//            for (int j=i+1; j<list.size();j++){
//                if (list.get(i).compareTo(list.get(j)) > 0) {
//                    Collections.swap(list, i, j);
//                }
//            }
//        }
//    }
}
