


//     public static void main(String[] args) {
//         // Scanner sc = new Scanner(System.in);

//         // int[] arr = new int[5];
//         // for(int i = 0; i < arr.length; i++) {
//         //     int n = sc.nextInt();
//         //     arr[i] = n;
//         // }
//         // for(int val: arr) {
//         //     System.out.println(val);
//         // }
//         int[] arr = {0, 4, 0, 9};

//         int j = 0;

//         for (int i = 0; i < arr.length; i++) {

//             if (arr[i] != 0) {
//                 int temp = arr[i];
//                 arr[i] = arr[j];
//                 arr[j] = temp;

//                 j++;
//             }
//         }

//         for (int val : arr) {
//             System.out.print(val + " ");
//         }

//     }
// }




// class Day1 {
//     public static void main(String[] args) {

//         ArrayList<Integer> arrList = new ArrayList<>();

//         arrList.add(2);
//         arrList.add(1);
//         arrList.add(3);
        
//         System.out.println(arrList);
        
//         arrList.add(4);

//         System.out.println(arrList);

//         System.out.println(arrList.get(2));

//         arrList.add(4, 54);

//         System.out.println(arrList);

//         arrList.set(0, 5);

//         System.out.println(arrList);

//         arrList.remove(2);

//         System.out.println(arrList);


//         System.out.println(arrList.size());


//     }
// }


import java.util.LinkedList;
import java.util.List;

class Day1 {
    public static void main(String[] args) {
        List<Integer> arrList = new LinkedList<>();

        int[] arr = {1, 4, 1, 1, 1, 1, 1, 4, 3, 133, 345, 13, 13};

        for (int val: arr)
            arrList.add(val);

        for (int i = 0; i < arrList.size(); i++) {
            for (int j = i + 1; j < arrList.size(); j++) {

                if(arrList.get(i).equals(arrList.get(j))){
                    arrList.remove(j);
                    j--;
                }

            }
        }

        System.out.println(arrList);
        


    }
}