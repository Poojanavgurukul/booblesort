import java.util.Arrays;
import java.util.List;

public class BubbleSort {
    public static void main(String[] args) {
       int numberList[]={1,3,5,2,9,8};
        sortTheList(numberList);
        for (int i = 0; i < numberList.length; i++) {
            System.out.print(" "+numberList[i]);
        }
    }

    public static void sortTheList(int []numberList){
        for (int i = 0; i <numberList.length-1 ; i++) {
            for (int j = 0; j <numberList.length-1 ; j++) {
                if(numberList[j]>numberList[j+1]){
                    int sawp=numberList[j];
                    numberList[j]=numberList[j+1];
                    numberList[j+1]=sawp;
                }
            }
        }
    }
}
