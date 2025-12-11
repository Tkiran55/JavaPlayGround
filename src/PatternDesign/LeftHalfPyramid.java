package PatternDesign;

public class LeftHalfPyramid {
    public static void main(String[] args) {

        System.out.println("Right Half Pyramid Triangle");
        int rows= 5;

        for(int i=0; i<=rows; i++){
            for(int j=0; j<2*(rows-i)+1 ; j++){
                System.out.print(" ");
            }
            for(int k=0; k<=i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
