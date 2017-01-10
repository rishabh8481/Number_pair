package number_pair;
import java.io.*;
public class Main {
	public static void main(String args[]){
		try {
			File file = new File("C:\\Users\\A\\Desktop\\MS\\csci174\\assignments\\CodeEval_Data_Files\\Number_Pair.txt");
	        FileReader fr = new FileReader(file);
			BufferedReader buffer = new BufferedReader(fr);
	        String line,ans = "";
	        int sum=0,count=0,i,j,n;
	        while ((line = buffer.readLine()) != null) {
	        	String[] all = line.split(";");
	        	sum=Integer.parseInt(all[1]);
	        	String lef= all[0];
	        	String[] s1 = lef.split(",");
	        	count=s1.length;
	        	n=count;
        		j=0;
	        	for(i=0;i<count-1;i++){
	        		j=i+1;
	        		while(j<=count-1){
	        			if((Integer.parseInt(s1[i])+Integer.parseInt(s1[j]))==sum){
	        				ans=ans+ s1[i]+","+s1[j]+";";
	        				//System.out.print(ans);
	        				n=n-1;
	        			}
	        			j++;
	        		}
	        	}
	        	if(n==count){
	        		System.out.println("NULL");
	        	}
	        	else{
		        	ans = ans.substring(0,ans.length()-1);
		        	System.out.print(ans);
		        	ans="";
		        	System.out.println();
	        	}
	        }
	        buffer.close();	
		} catch (Exception e) {
			e.printStackTrace();
		}
        
	}
}