package forloopdemo;

import com.sun.java.swing.plaf.windows.WindowsDesktopIconUI;

public class ForDemo {

    public static void main(String[] args) {
        int array[]={3,4,1,5};

//        for (int count=1;count<=100 ;count++){
//            System.out.println("Count is "+count);
//        }

        for (int i=0;i<array.length;i++){

            for(int j=i+1; j<array.length  ;j++){

                if(array[i]>array[j]){
                    int temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }

            System.out.println(array[i]);
        }







    }






}
