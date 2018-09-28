package demo;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class F2f {
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
