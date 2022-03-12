package azulseguroscucumber;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import org.junit.runner.RunWith;

import io.cucumber.java.AfterAll;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features", glue = {"azulseguroscucumber"}, monochrome = true,
plugin = {"junit:target/cucumber.xml", "json:target/cucumber.json"}
)
public class TestRunner {
	public static void zipFile() {
		String filePath = System.getProperty("user.dir") + "/target/cucumber.xml";
		
		try {
			File file = new File(filePath);
			String zipFileName = file.getName().concat(".zip");
			
			FileOutputStream fos = new FileOutputStream(zipFileName);
			ZipOutputStream zos = new ZipOutputStream(fos);
			
			zos.putNextEntry(new ZipEntry(file.getName()));
			
			byte[] bytes = Files.readAllBytes(Paths.get(filePath));
			zos.write(bytes, 0, bytes.length);
			zos.closeEntry();
			zos.close();
			
		} catch (FileNotFoundException ex) {
			System.err.format("O arquivo %s nao existe", filePath);
		} catch (IOException ex) {
			System.err.println("I/O erro: " + ex);
		}
	}
	
	public static void chamarZip() {
		zipFile();
	}
}
