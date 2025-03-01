import java.util.*;
public class ArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        // ArrayList<Integer> list = new ArrayList<>(10);
        
        // // adding values to list:
        // System.out.print("Enter the values: ");
        // for (int i=0; i<5; i++){
        //     list.add(sc.nextInt());
        // }

        // // output:
        // for (int j=0; j<list.size(); j++){
        //     System.out.print(list.get(j) + " ");
        // }

        // MultiDimensional ArrayList:

        // Creating/Declaring multidimensional arraylist:
        ArrayList<ArrayList<Integer>> mdlist = new ArrayList<>();

        // Initializing 2-d ArrayList (An arraylist with 3 arraylists):
        for (int i=0; i<3; i++){
            mdlist.add(new ArrayList<>());
        }

        // Adding elements:
        System.out.print("Enter the elements of the ArrayList: ");
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                mdlist.get(i).add(sc.nextInt());
            }
        }

        // Printing the elements:
        System.out.println(mdlist);

        sc.close();
    }
}
