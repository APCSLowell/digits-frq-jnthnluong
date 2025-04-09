import java.util.ArrayList;

public class Digits
{

	private ArrayList<Integer> digitList;

	public Digits(int num)
	{ /* to be implemented in part (a) */ 
		digitList = new ArrayList<Integer>();
		int temp = num;
		int len = 1;
		while(temp >= 10){
			len++;
			temp = temp/10;
		}
		
		for(int i = 0; i < len; i++){
			digitList.add(0,num%10);
		}
		
	    
	}

	public boolean isStrictlyIncreasing()
	{ /* to be implemented in part (b) */
		if(digitList.size() < 2) return true;
		for(int i = 0; i < digitList.size()-1; i++){
			if(digitList.get(i) >= digitList.get(i+1))
				return false;
		}
		return true;
	}
	
	public String toString()
	{
		return digitList.toString();
	}
}
