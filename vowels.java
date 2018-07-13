import java.util.Scanner;
public class vowels {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		char in,in1;
		in=sc.next().charAt(0);
		if((in=='a'||in=='e'||in=='i'||in=='o'||in=='u')||(in=='A'||in=='E'||in=='I'||in=='O'||in=='U')){
			System.out.println("vowel");
		}
		else{
			System.out.println("consonent");
		}
		
	}

}
