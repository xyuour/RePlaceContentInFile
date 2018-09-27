package demo;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReplaceInFile {
	
	static String con_str = "<P style=\"TEXT-ALIGN: center; LINE-HEIGHT: 2; MARGIN-TOP: 0px; TEXT-INDENT: 2em; FONT-FAMILY: ����; MARGIN-BOTTOM: 0px; FONT-SIZE: 12pt\"><IMG border=0 src=\"http://218.89.64.78/ybimages/uploadfiles/20170105112058953.jpg\"></P>\r\n" + 
			"<P style=\"TEXT-JUSTIFY: inter-ideograph; TEXT-ALIGN: justify; LINE-HEIGHT: 2; MARGIN-TOP: 0px; TEXT-INDENT: 2em; FONT-FAMILY: ����; MARGIN-BOTTOM: 0px; FONT-SIZE: 12pt\">���գ����軷���Ƽ��������ι�˾�����ڣ�������Ա���ڶԳ������м�ء��ù�˾λ�ڸ��ظ�Ϫ����������˾������̥�������ϵȺڰ���Ⱦ��ͨ������������ҵ�������߿��Խ��ڰ���Ⱦ��ת��Ϊ���͡�̿�ڵ�����������ϣ�������ʵ�ֱ��Ϊ��������Ⱦ���ŷš�</P>\r\n" + 
			"<P style=\"TEXT-JUSTIFY: inter-ideograph; TEXT-ALIGN: justify; LINE-HEIGHT: 2; MARGIN-TOP: 0px; TEXT-INDENT: 2em; FONT-FAMILY: ����; MARGIN-BOTTOM: 0px; FONT-SIZE: 12pt\">2016�����������л����Ƽ����²��ϡ�����Դ��ս�������˲�ҵ�������ָ��������������նˡ������ͨ������Դ��������Ŀ�����ؿ������裬ս�������˲�ҵ��ȫ�в�ҵת�ͱ�����Ч�ƶ���<BR></P>"; 

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String dir1 = "./file/t1.txt";
		String dir2 = "./file/t2.txt";
		Path pt1 = Paths.get(dir1);
		Path pt2 = Paths.get(dir2);
		if(!Files.exists(pt1)) {
			Files.createFile(pt1);
		}
		if(!Files.exists(pt2)) {
			Files.createFile(pt2);
		}
		
		File f1 = new File(dir1);
		File f2 = new File(dir2);
//		PrintWriter pw1 = new PrintWriter(f1);
//		pw1.print(con_str);
//		pw1.flush();
		
		InputStreamReader isr = new InputStreamReader(new BufferedInputStream(new FileInputStream(f1)));
		BufferedReader br = new BufferedReader(isr);
		PrintWriter pw2 = new PrintWriter(f2);
		StringBuffer sb1 = new StringBuffer();
		String str;
		while((str = br.readLine()) != null) {
//			sb1.append(str);
			pw2.println(str);
			pw2.flush();			
		}
		System.out.println(sb1);
		
		
		
		
		pw2.close();
		br.close();
		isr.close();
		
	}

}
