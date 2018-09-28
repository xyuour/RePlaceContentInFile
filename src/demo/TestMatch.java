package demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestMatch {

	private static CharSequence str = "网站地址：http://www.baidu.com1212，啥收到货";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern p = Pattern.compile("http://www.baidu.com");
		Matcher m =p.matcher(str);
		System.out.println(m.find());
		String replaceAll = m.replaceAll("xxx");
		System.out.println(str);
		System.out.println(replaceAll);
	}
	

}
