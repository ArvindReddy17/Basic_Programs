
public class MirrorInverse {
	
	static boolean isMirrorInverse(int arr[])
	{
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[arr[i]] != i)
				return false;
		}

		return true;
	}

	public static void main(String[] args){
		int arr[] = { 1, 2, 3, 3,2,1 };
		if (isMirrorInverse(arr))
			System.out.println("Yes the Array is mirror inverse");
		else
			System.out.println("No the Array is not mirror inverse");
	}
}
