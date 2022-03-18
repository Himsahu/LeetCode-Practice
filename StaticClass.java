
class StaticClass{   
	public static void main(String [] args)
	{				
		int a[]= {1,2,3,5,10,6,7,11};
		
		for(int i =0;i<a.length;i++)
		{
			for(int j =1;j<a.length;j++)
			{
				int mul = a[i]*a[j];
				
				for(int k=0;k<a.length;k++)
				{
					if(a[k] == mul)
					{
						System.out.print(a[i]+","+a[j] +"  ");
					}
				}
			}
		}
	}
}