// import java.util.regex.Matcher;
// import java.util.regex.Pattern;

// public class Day4 {
//     public static void main(String[] args) {

//     Pattern pat = Pattern.compile("[A-Za-z]+");
//     // Matcher mat = pat.matcher("Like");
//     Matcher mat = pat.matcher("Subscribe");
//     // Matcher mat = pat.matcher("Follow");

//     boolean res = mat.matches();
//     System.out.println(res);

        
//     }
// }


// import java.util.regex.Matcher;
// import java.util.regex.Pattern;

// public class Day4 {
//     public static void main(String[] args) {
//         String s = "ShineVerse";

//         Pattern pat = Pattern.compile("([A-Z][a-z]+){2}");
//         Matcher mat = pat.matcher(s);

//         boolean res = mat.matches();
//         System.out.println(res);

//         // for(int i = 0; i < s.length(); i++) {
//         //     boolean res = mat.find();
//         //     System.out.println(res);
//         // }

            
//     }
// }




// // ! Recursion

// public class Day4 {

//     public static void printNum(int n) {
//         if (n == 0) 
//             return;
        
//         printNum(n-1);
//         System.out.println("Inside the Fn = " + n);
//         }
    
//     public static void main(String[] args) {
//         int n = 3;
//         System.out.println("Before the Fn = " + n);
        
//         printNum(n);
//         System.out.println("After the Fn = " + n);

//     }
// }


// ! Recursion

public class Day4 {

    public static void printNum(int i, int n) {
        if (i == n+1)
            return;
        
        System.out.println(i);
        printNum(i+1, n);
        }
    
    public static void main(String[] args) {
        int n = 10;
        
        printNum(1, n);

    }
}