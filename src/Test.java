import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
	
	public static void main(String [] args) throws IOException
	{
		String str = new String();
		InputStreamReader inp = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(inp);
		
		str=br.readLine();
		Integer len = str.length();
		char[] ch = str.toCharArray();
		for(int i = 0;i<len/2;i++)
		{
			char t = ch[i];
			ch[i]=ch[len-i-1];
			ch[len-i-1]=t;
			
		}
		
		int temp =0;
		for(int i = 0;i<len;i++)
		{			
			if(ch[i]==' ' || i==len-1)
			{
				int tt=0;				
				if(ch[i]==' ')
					tt = i-1;
				else
					tt=i;				
				for(int j = temp;j<(i+temp)/2;j++)
				{
					char t = ch[j];
					ch[j]=ch[tt];
					ch[tt]=t;	
					tt--;
				}
				temp=i+1;
			}
		}
		
		for(int i = 0;i<len;i++)
		 System.out.print(ch[i]);
		
	}

}
