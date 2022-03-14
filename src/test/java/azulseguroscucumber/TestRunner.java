package azulseguroscucumber;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import org.junit.AssumptionViolatedException;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.model.Statement;

import io.cucumber.java.AfterAll;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features", glue = {"azulseguroscucumber"}, monochrome = true,
plugin = {"pretty", "json:jsonReport.json"}
)
public class TestRunner {
	@ClassRule
    public static TestRule testWatcher = new TestWatcher() {

        @Override
        protected void finished(Description description) {
            super.finished(description);
            String filePath = "jsonReport.json";
    		
    		try {
    			File file = new File(filePath);
    			//String zipFileName = file.getName().concat(".zip");
    			
    			FileOutputStream fos = new FileOutputStream("report.zip");
    			ZipOutputStream zos = new ZipOutputStream(fos);
    			
    			zos.putNextEntry(new ZipEntry(file.getName()));
    			
    			byte[] bytes = Files.readAllBytes(Paths.get(filePath));
    			zos.write(bytes, 0, bytes.length);
    			zos.closeEntry();
//    			fos.flush();
//    			fos.close();
//    			zos.finish();
//    			zos.flush();
    			zos.close();
    			fos.close();
    			
    		} catch (FileNotFoundException ex) {
    			System.err.format("O arquivo %s nao existe", filePath);
    		} catch (IOException e) {
    			System.err.println("I/O erro: " + e);
    		}
        }
    };
	
	
}
