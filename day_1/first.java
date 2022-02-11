import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class first {
  public static void main(String[]args){
  
    System.out.println("hello");

       /* primitives Datatypes
       main tyoes of data 
       1. Int-  2,1,3,4 etc..
       2. float- 12.6, 12.4 ..etc.. 
       3. char- a,d,b,etc..
       4. double-23.34827598,657.4782689423..etc 
       5. long-3478221
       6. bool-true/false 
       7. byte- 256 (value in a byte)

       difference b/w float and double 
       float only stores definate no. after point and double gives a more specific value in terms of decimal..

       difference b/w int and long
       int only has 1 integer stored whereas long has a large no. stored. 
       */
       Scanner in = new Scanner(System.in);
       int a = in.nextInt();
       int b = in.nextInt();
       // Identifier - a referance variable that we give to represent a primitive datatype is known as a identifier. in below case 'c'  will represent the int that we get from a + b.
       
       // Literal - vale of the datatype that is referenced by a identifer is a literal.

       int c = a + b ;
       System.out.println(c);

       // BEST PRACTICE - make sure to check indentation of code while writting line by line to reduce the risk of bug while testing code hjv
      
       //JAVA IS FOLLOWING UNICODE
       
       

      }
}