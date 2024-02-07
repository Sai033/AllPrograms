package Practice;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class BasicPrograms {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	//System.out.println("Enter Number");
	
	//palindrome program
/*	int no=sc.nextInt();
	int temp=no;
	int sum=0;
	while(temp>0) {
		int rem=temp%10;
		sum=sum*10+rem;
		temp=temp/10;
		
	}
	if(no==sum)
	System.out.println(sum+"It is Palindrome number");
	
	else
		System.out.println(sum+"It is not a palindrome number");  */
	
	
	
	//Amstrong number
	/*
	int no=sc.nextInt();
	int temp=no;  //153
	int sum=0;
	while(temp>0) {
		int rem=temp%10;
		sum=sum+rem*rem*rem;
		temp=temp/10;
	}
	System.out.println(sum);
	*/
	
	//Prime no bw 2 given no.
	/*
	System.out.println("Enter First no");
	int firstNo=sc.nextInt();
	System.out.println("Enter Last no");
	int lastNo=sc.nextInt();
	
	for(int i=firstNo;i<=lastNo;i++) {
		int count=0;
		for(int j=1;j<=i;j++) {
			if(i%j==0) {
				count++;
			}
		}
		
		if(count==2) {
			System.out.println(i);
		}
		
	}
	*/
	
	//checking the no is prime or not
	/*
	int no=sc.nextInt();
	int count=0;
	for(int i=1;i<=no;i++) {
		if(no%i==0) {
			count++;
		}
	}
	if(count==2) {
		System.out.println(no+" is prime no");
	}
	else System.out.println(no+" is not a prime no");
	
	*/
	
	//reverse string
/*	
	String word=sc.nextLine();
	char a[]=word.toCharArray();
	String rev="";
	for(int i=a.length-1;i>=0;i--) {
		rev=rev+a[i];
	}
	System.out.println(rev);
	*/
	
	//print only duplicates
/*
	String word=sc.nextLine();
	char a[]=word.toCharArray();
	for(int i=0;i<a.length;i++) {
		
		for(int j=i+1;j<a.length;j++) {
			if(a[i]==a[j]) {
				System.out.println(a[i]);
			}
		}
	}
	
	*/
	//Remove duplicates
	/*
	String word=sc.nextLine();
	char a[]=word.toCharArray();
	for(int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++) {
			if(a[i]==a[j]) {
				a[j]='=';
			}
		}
	}
	for(int i=0;i<a.length;i++) {
		if(a[i]!='=') {
			System.out.println(a[i]);
		}
	}
	
	*/
	
	//List,Map,HashMap,ArrayList
/*	
	List l=new ArrayList();
	l.add("sai");
	l.add(32);
	l.add('e');
	l.add(12.43);
	
	Iterator it=l.iterator();
	if(it.hasNext()) {
		System.out.println(l);
	}
	
	Map m=new HashMap();
	m.put("name", "Sai");
	m.put("age","26");
	m.put("Experience","2.4");
	
	
	Iterator<Map.Entry> itr=m.entrySet().iterator();
	while(itr.hasNext()) {
		Map.Entry e=itr.next();
		System.out.println(e.getKey()+" : "+e.getValue());
				
	}
	*/
	
	//String methods
	
	StringBuilder a=new StringBuilder("Work is worship");
	System.out.println("reverse string:"+a.reverse().toString());
	
	
	
}

}
