package stream.others;

import java.io.Console;

public class ConsoleTest {
	public static void main(String[] args) {
		Console cs = System.console();
		
		System.out.print("이름 : ");
		String name = cs.readLine();
		System.out.print("직업 : ");
		String job = cs.readLine();
		System.out.print("비밀번호 : ");
		char[] pass = cs.readPassword();
		String strPass = new String(pass);
		
		System.out.println(name);
		System.out.println(job);
		System.out.println(strPass);
	}
}
