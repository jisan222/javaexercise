import java.util.Arrays;
public class Exercise28{
    public static void main(String[]args){
        int [] numbers ={1,2,3,4,5};
        int num =3;
        search(numbers,num);
    }
    public static int search(int[]numbers,int num){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==num){
                System.out.println("Found value is "+numbers[i]);
                return 1;
            }
        }
        return -1;
    }
}