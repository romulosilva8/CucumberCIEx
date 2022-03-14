package azulseguroscucumber;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.zip.GZIPOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import org.junit.runner.notification.RunListener;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;

public class ConvertZip {
	
//	@After
//	public void testRunFinished() {
//		String filePath = "jsonReport.json";
//		
//		try {
//			File file = new File(filePath);
//			//String zipFileName = file.getName().concat(".zip");
//			
//			FileOutputStream fos = new FileOutputStream("report.zip");
//			ZipOutputStream zos = new ZipOutputStream(fos);
//			
//			zos.putNextEntry(new ZipEntry(file.getName()));
//			
//			byte[] bytes = Files.readAllBytes(Paths.get(filePath));
//			zos.write(bytes, 0, bytes.length);
//			zos.closeEntry();
////			fos.flush();
////			fos.close();
////			zos.finish();
////			zos.flush();
//			zos.close();
//			fos.close();
//			
//		} catch (FileNotFoundException ex) {
//			System.err.format("O arquivo %s nao existe", filePath);
//		} catch (IOException e) {
//			System.err.println("I/O erro: " + e);
//		}
//	}

	

}

		
		
//	public static void ZipFile() throws IOException {
//	String sourceFile = "jsonReport.json";
//	try {
//    FileOutputStream fos = new FileOutputStream("report.zip");
//    GZIPOutputStream zipOut = new GZIPOutputStream(fos);
//    File fileToZip = new File(sourceFile);
//    FileInputStream fis = new FileInputStream(fileToZip);
//    ObjectOutputStream oos = new ObjectOutputStream(zipOut);
//    //ZipEntry zipEntry = new ZipEntry(fileToZip.getName());
//    //zipOut.(zipEntry);
//    byte[] bytes = new byte[1024];
//    int length;
//    while((length = fis.read(bytes)) >= 0) {
//        oos.write(bytes, 0, length);
//    }
//    
//    zipOut.close();
//    oos.flush();
//    oos.close();
//    fis.close();
//    fos.close();
//	} catch(Exception e) {
//		System.err.println("erro");
//	}
//	}
	
	


