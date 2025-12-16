package PatternDesign;

public class RightHalfPyramid {
    public static void main(String[] args) {
        System.out.println("Right Half Pyramid Triangle");
        int rows= 5;

        for(int i=1; i<=rows; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
