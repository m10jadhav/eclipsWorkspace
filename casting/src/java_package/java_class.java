//type casting (implicit explicit/explicit casting)

package java_package;

public class java_class
{ static int a=70;          //implicit casting
   static double b=a;
   static long c=a;
   static float d=c;
  // static short e=a;
   
   static double i= 56.98;  //explicit casting
   static int j=(int)i;    
   static float k=(float)j;
   static long l=(long)k;
   static float m=(byte)i;
   public static void main(String[]arg)
   {                                               //implicit casting
	   System.out.println("Before casting"+" "+a);            //before casting int
	   System.out.println("  After casting in double"+" "+b);   // casting in double
	   System.out.println("  After casting in long"+" "+c);     //casting in long
	   System.out.println("  After casting in float"+" "+a);    //casting in float

                                                   // explicit casting
       System.out.println("Before casting"+" "+i);            //before casting double
	   System.out.println("  After casting in int"+" "+j);      //casting in int
	   System.out.println("  After casting in float"+" "+k);    //casting in float
	   System.out.println("  After casting in long"+" "+l);     //casting in long
   }
}
