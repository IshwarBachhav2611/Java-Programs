public class IfElseLadder {
    public static void main(String[] args){
      int marks = 72;

        if (marks >= 75) {
            System.out.println("Distinction");
        } else if (marks >= 60) {
            System.out.println("First Class");
        } else if (marks >= 50) {
            System.out.println("Second Class");
        } else if (marks >= 35) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
  
    } 
}