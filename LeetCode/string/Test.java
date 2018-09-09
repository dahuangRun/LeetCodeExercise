package string;

public class Test {
	public static void main(String[] args) {
		StringLCS lcs = new StringLCS();
		String s1 = "acdfg";
		String s2 = "adcf";
		String result = lcs.lsc(s1, s2);
		System.out.println(result);
	}
}
