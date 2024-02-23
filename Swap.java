//Colton Dean
//this is my 4th project
//this is for my software program class
public class Swap {




  
public static int[] swapTwoArrayElements(int[] arrayToSwap, int lowerIndex){

    int temp;

    temp=arrayToSwap[lowerIndex];

    arrayToSwap[lowerIndex]=arrayToSwap[lowerIndex+1];

    arrayToSwap[lowerIndex+1]=temp;

    return arrayToSwap;

    }
public static void main(String[] args){
    int[] arrayToSort={1,3,4,5,1,23,57,126,4,543,345,23,12,45,67,97};// this creates the array
   System.out.println("The unsorted array");//tells to put the text unsorted array above the unsorted numbers in the first group
    for (int  x=0; x<arrayToSort.length;x++){
        System.out.print(arrayToSort[x]+" ");
    }
   boolean swapped=true;
    for (int  x=0; x<arrayToSort.length-1;x++){
        swapped=false;
        for (int y=0; y<arrayToSort.length-1-x;y++){

          if(arrayToSort[y]>arrayToSort[y+1]){
            swapped=true;
            arrayToSort=swapTwoArrayElements(arrayToSort, y);//tells it to sort the numbers out
            }

        }
    if(swapped==false){
        x=arrayToSort.length;


        }

    }
   System.out.println();
   System.out.println("the sorted array");//tells to put sorted array over the sorted numbers int eh sconded group
    for (int  x=0; x<arrayToSort.length;x++){
        System.out.print(arrayToSort[x]+" ") ;
         }

    }

}