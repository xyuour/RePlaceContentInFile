package demo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class TestFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String dir1 = "./file/t1.txt";
		String dir2 = "./file/t2.txt";
		Path pt1 = Paths.get(dir1);
		Path pt2 = Paths.get(dir2);
//		System.out.println(Files.exists(pt1));
//		System.out.println(Files.exists(pt2));
		if(!Files.exists(pt1)) {
			Files.createFile(pt1);
		}
		if(!Files.exists(pt2)) {
			Files.createFile(pt2);
		}
		
		//Ð´³ö
		File f1 = new File(dir1);
		FileOutputStream fos = new FileOutputStream(f1);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
//		byte b[] = dir1.getBytes();
//		bos.write(b);
//		bos.flush();
		
//		OutputStreamWriter osw = new OutputStreamWriter(bos);
//		BufferedWriter bw = new BufferedWriter(osw);
//		bw.write(dir2);
//		bw.flush();
		
		FileWriter fw1 = new FileWriter(f1);
		fw1.write("hello world");
		fw1.flush();
		
//		PrintWriter pw1 = new PrintWriter(fos);
//		pw1.println(1232131);
//		pw1.flush();
		
		//Ð´Èë
		FileInputStream fis = new FileInputStream(f1);
		BufferedInputStream bis = new BufferedInputStream(fis);
//		InputStreamReader isr = new InputStreamReader(bis);
//		BufferedReader br = new BufferedReader(isr);
//		System.out.println(br.readLine());
		
//		Scanner sc = new Scanner(bis);
//		System.out.println(sc.nextLine());
		
//		BufferedInputStream biscon = new BufferedInputStream(System.in);
//		InputStreamReader isrcon = new InputStreamReader(biscon);
//		BufferedReader brcon = new BufferedReader(isrcon);
//		System.out.println(brcon.readLine());
	}

}
