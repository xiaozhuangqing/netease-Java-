package ÄîÕûÊı;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner in=new Scanner(System.in);
		num=in.nextInt();
		String str=String.valueOf(num);
//		System.out.println(str);
		String []res=new String[10];
		int count=0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)=='-')
				res[i]="fu";
			else{
				int temp=str.charAt(i)-'0';
				switch(temp){
				case 0:
					res[i]="ling";
					break;
				case 1:
					res[i]="yi";
					break;
				case 2:
					res[i]="er";
					break;
				case 3:
					res[i]="san";
					break;
				case 4:
					res[i]="si";
					break;
				case 5:
					res[i]="wu";
					break;
				case 6:
					res[i]="liu";
					break;
				case 7:
					res[i]="qi";
					break;
				case 8:
					res[i]="ba";
					break;
				case 9:
					res[i]="jiu";
					break;	
			}
			}
			count=i;
		}
		for(int i=0;i<count;i++){
				System.out.print(res[i]+' ');
		}
		System.out.print(res[count]);
	}

}
