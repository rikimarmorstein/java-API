package f.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo1ByteStream {

	public static void main(String[] args) {


		File srcFile = new File("files/IMG_0049.jpg");//existing file
		File dstFile = new File("files/IMG_0049Coppy.jpg");//will be

		try(
				BufferedInputStream in = new BufferedInputStream(new FileInputStream(srcFile));
				BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(dstFile));
				) {
					int b = in.read();
					while(b!=-1) {
						out.write(b);
						b=in.read();
					}
			System.out.println("data was copied from");
			System.out.println(srcFile);
			System.out.println("to");
			System.out.println(dstFile);
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
