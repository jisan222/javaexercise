public class ThinkjavaEx8{
    public static void main(String[]args){
     int[]numbers={99};
     int count = 78;
     histogram(numbers,count);
        
}
public static int [] histogram(int[]numbers,int count){
    int[]counter=new int[count];
    for(int element:numbers){
        counter[element]++;
    }
    return counter;
   }
}
