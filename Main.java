 import java.util.*;

public class Main
{
	static final int MAX = 1005;
	public static void main(String[] args){
		Scanner cin = new Scanner(System.in);
		int n,k,m = 0; 
		n = cin.nextInt();
		k = cin.nextInt();
		
		int equal[] = new int[MAX];
		int Nequal[] = new int[MAX];
		int num[] = new int[MAX];
		
		for(int i = 0;i < n;i++){
			equal[i] = 0;
			Nequal[i] = 0;
		}
		int pi;
		char s;
		for(int j = 0;j < k;j++){
			pi = cin.nextInt();
			for(int l = 0;l < 2*pi;l++){
				num[l] = cin.nextInt(); 
			}
			s = cin.next().charAt(0);
			if(s == '='){
			
				for(int l = 0;l < 2*pi;l++){
					equal[num[l]] = 1; 
				}
			}
			else if(s == '<'){
				for(int l = 0;l < pi;l++){ 
					Nequal[num[l]]--; 	
				}
				for(int l = pi;l < 2*pi;l++){
					Nequal[num[l]]++;
				}
				m++;
			}
			else if(s == '>'){
				for(int l = 0;l < pi;l++){ 
					Nequal[num[l]]++; 	
				}
				for(int l = pi;l < pi*2;l++){
					Nequal[num[l]]--; 
				}
				m++;
			}
		}
		int sum = 0,flag = 0; 
		System.out.println("merge B3 & C4");
		for(int i= 1;i <= n;i++){ 
			if(equal[i] == 0){
				if(Nequal[i] == m || Nequal[i] == -m){ 
				 	flag = i;
				 	sum++;
				}
					
			} 	
		}
		if(sum == 1)
			System.out.println(flag);
		else
			System.out.println(0);
	 }
}
