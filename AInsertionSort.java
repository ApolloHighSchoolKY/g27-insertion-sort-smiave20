import java.utils.Arrays;

public class AInsertionSort
{

    public static void main(String[] args)
    {
    	Integer myNumbers[] = {0, 15, 6, 8, 2, 37};
        int temp = 0; 

        //(i) is going through the Array.
        for(int i = 0; i < myNumbers.length; i++)
        {
            //Postion of (x) must be less then the position of the Array.
            //So it stays in the Array. 
            for(int x = 0; x < i; x++)
            {
                //If the postion at (i) in the Array, is greater then the position of (x) in the Array.
                if(myNumbers[i] < myNumbers[x])
                {
                    //Temp is becoming the postion of (i) in the Array.
                    temp = myNumbers[i];

                    //(y) equals the position of (i) in the Array.
                    //But (y) must be greater then the position of (x) in the Array.
                    for(int y = i; y > x; y--)
                    {
                        //Position of (y) in the Array will become the next position in the Array.
                        myNumbers[y] = myNumbers[y - 1];
                    }
                    //Position of (x) will equal the variable (temp) which is the original term/position (i).
                    myNumbers[x] = temp;
                }
            }
        }
        
        //Print out the Array.
        System.out.println(Arrays.toString(myNumbers));
    }
}
