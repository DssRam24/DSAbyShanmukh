import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Arrayspractice {
    public static void main(String[] args) {
    
    Scanner sc=new Scanner(System.in);
        //ARRAYS are non primitive data structures that are used to store homogenous data
    
    /*Arrays can be of two types 
     * 1)primiive arrays which contain primitive data types such as int,String,etc
     * 2)non primitive (object arrays) which store objects in the array--OOP */
    // All the elements in the array are of the same data type(COLLECTION)
    
    
    /*that data type is given by the syntax:
    data_type[] arr --- this declares the array in the stack(declaration of array)- this thing happens in compile time*/
    /*arr= new data_type[n]---this is the actual creation of array in the heap
    --new keyword is used to create objects in the excution time
    -- Runtime (dynamic memory allocation)*/
    
    // In JAVA array objects may need not to be continuosly allocated , it depends upon the JVM
    
    /*We can directly insert the values in an array in the beginning with the below syntax : */
  /*int[] arr1 ={1,2,3,4};
  System.out.println(arr1[3]);
   /* directly Declared integer array arr1 without the size */
    /* Arrays can be accessed via indexing*/
    /*indices start from 0,we can access the elments in the array using indices-useful to update,print,etc elements with the index */
    //System.out.println(arr1[0]);
    /*--- this prints the output '1; as it is the 0th element in the array */
    // By default the values(elements) in an reference array are null or 0s in java
  

 
     /*   int[] arr2= new int[5];
        for(int i=0;i<arr2.length;i++){
            arr2[i]=sc.nextInt();
        }
   
        for(int i=0;i<arr2.length;i++){
           System.out.print(arr2[i]+" ");
        }*/ 
   
/*Enhanced for loop without using the index */

//for(int arr : arr2)
//{
  //  System.out.print(arr);
//}
// using toString() method fromm Arrays class
/*lets create a string array(array of objects i.e non-primitives) */
String[] str1=new String[4];
for(int j=0;j<str1.length;j++)
{
    str1[j]=sc.nextLine();
}
System.out.println(Arrays.toString(str1));
    
 //Modify the elements
 //str1[1]="Shanmukh" ;     
//System.out.println(Arrays.toString(str1));
   
/*2d Array is array of arrays
While declaring an 2d array column size is not neccessary
int [][] arr2D= {
                 { a1 a2 a3   }
                { b1 b2  }
                             } */

//Input in 2d array
/*int[][] arr2D=new int[3][];
System.out.println(arr2D.length);
System.out.print("Enter no.of columns in each row");
for(int row =0;row<arr2D.length;row++)
{

/*Here it takes one input(cols) and 
arr2D[cols]=new int[cols] will create a row with the given input columns 
the the loop iterates again and takes another input*/
 //int cols = sc.nextInt();
/*  arr2D[row] = new int[cols]; 
}*/ 

/*for(int row =0;row<arr2D.length;row++)
{
    for(int col=0;col<arr2D[row].length;col++)
    {
        arr2D[row][col]=sc.nextInt();
    }
}

for(int row =0;row<arr2D.length;row++)
{
    for(int col=0;col<arr2D[row].length;col++)
    {
        System.out.print(arr2D[row][col]+" ");
    }


   // this prints each row line by line
   System.out.println();
}*/

//ARRAYLIST:
//ArrayList<Integer> list=new ArrayList<>();




}
}
