import java.util.ArrayList;

public class ALInsertionSort
{

    public static void main(String[] args)
    {
    	Integer myNumbers[] = {0, 15, 6, 8, 2, 37};

    	ArrayList<Integer> sorted = new ArrayList<Integer>();
    	
		boolean inserted = false;

		//Add the first number from the Array to the array list
		sorted.add(myNumbers[0]);

		//Loop once for all of the remaining numbers in the unsorted list
		for(int i = 1; i < muNumbers.length; i++)
		{
			inserted = false;

			//Check with each of the numbers in the sorted list
			//size() for an ArrayList is the whole length.
			for(int x = 0; x < sorted.size() && !inserted; x++)
			{
				//If this number is less than one in the sorted list, insert it there
				if(myNumbers[i] < sorted.get(x))
				{
					//Add, at the postion of x, the term at position in the Array.
					sorted.add(x, myNumbers[i]);
					inserted = true;
				}
			}

			//If it was not inserted, stick it on the end.
			if(!inserted)
			{
				//add() inserts the term at the end of the Array.
				sorted.add(myNumbers[i]);
			}
		}
		//End Loop for unsorted list

		//Move the data back to the array
		for(int i = 0; i < sorted.size(); i++)
		{
			//Within the Array, it will become the postion of (i). 
			myNumber[i] = sorted.get(i);
		}

		//Print the contents of the array
		System.out.println(sorted);
    }


}
