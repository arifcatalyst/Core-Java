//import ;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public class Ex4
{
	public static void main(String[] args) 
	{

	/*
		HashSet<String> gatePassSwipe=new HashSet<String>();
		gatePassSwipe.add("Surbhi");
		gatePassSwipe.add("Rohan");
		gatePassSwipe.add("Sakshi");
		gatePassSwipe.add("Rohit");
		gatePassSwipe.add("Sakshi Sharma");
		gatePassSwipe.add("Rohan");
		gatePassSwipe.add("Tushar");

		int len=gatePassSwipe.size();
		System.out.println(gatePassSwipe);

		//char [] arr={'c','o','l'};
		String str="chocolate";
		String newstr="";
		Set<Character> mySet=new HashSet<Character>();
		mySet.add('c');
		mySet.add('o');
		mySet.add('l');
		mySet.add('a');

		for (int i=0;i<str.length();i++ ) 
		{
			char ch=str.charAt(i);
			if (mySet.contains(ch))
			{
				newstr=newstr+ch;	
			}
			else
				newstr=newstr+"#";
		}
		System.out.print(newstr);

		ArrayList<Integer> anonymousUsers=new ArrayList<>(Arrays.asList(1,2,3,5,2,3,7,1));

		HashSet<Integer> uniqueUsers=new HashSet<>();
		len=anonymousUsers.size();

		for (int i=0;i<len ;i++ )
		{
			int userId=anonymousUsers.get(i);
			uniqueUsers.add(userId);
		}
		int total=uniqueUsers.size();
		System.out.println(total);

		System.out.println(uniqueUsers);
				String str="abracadaara";
		HashSet<Character> mySet=new HashSet<>();
		for (int i=0;i<str.length() ;i++ )
		{
			char ch=str.charAt(i);

			if (mySet.contains(ch)) 
			{
				System.out.println("$ : "+ch);
			}
			mySet.add(ch);
		}
		System.out.print(mySet);
		*/		
		int []arr={7,8,2,5,7,3,9,3,4,2,23};
		uniqueOdds(arr);


	}
	public static void uniqueOdds(int [] arr)
	{
		HashSet<Integer> mySet=new HashSet<>();
		Boolean [] bool=new Boolean[arr.length];

		for (int i=0;i<arr.length ;i++ )
		{
			for (int j = i+1;j<arr.length; j++)
			{
				if (arr[i]==arr[j])
				{
					bool[i] = false;
					bool[j]=false;
					break;
				}
			}

			if (bool[i]==null && arr[i]%2==1)
			{
				bool[i] = true;
				mySet.add(arr[i]);
			}
		}

		/*
		for (int i=0;i<bool.length;i++)
		{
			if (bool[i] && arr[i]%2==1)
			{
				mySet.add(arr[i]);
			}
		}
		*/
		System.out.println(mySet);

		}
	}	