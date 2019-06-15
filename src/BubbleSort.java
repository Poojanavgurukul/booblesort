import java.util.Arrays;
import java.util.List;

public class BubbleSort {
    public static void main(String[] args) {
       Integer elementList[]={1,3,5,2,9,8};
        sortTheList(elementList);
        for (int i = 0; i < elementList.length; i++) {
            System.out.print(" "+elementList[i]);
        }
    }

    public static <T extends Comparable<T>>T[]sortTheList(T[]elementList){
        for (int i = 0; i <elementList.length-1 ; i++) {
            for (int j = 0; j <elementList.length-1 ; j++) {
                if(elementList[j].compareTo(elementList[j+1])>0){
                    T sawp=elementList[j];
                    elementList[j]=elementList[j+1];
                    elementList[j+1]=sawp;
                }
            }
        }
        return elementList;
    }
}
