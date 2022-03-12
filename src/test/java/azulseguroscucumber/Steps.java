package azulseguroscucumber;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class Steps {
	
	
	@Dado("A comunicacao do aviso de emissao")
	public void a_comunicacao_do_aviso_de_emissao() {
	    System.out.println("passou");
	}

	@Quando("Houver Recusa \\(avisoEmissaoApolice)")
	public void houver_recusa_aviso_emissao_apolice() {
		System.out.println("passou");
	}

	@Entao("Proceder com recusa da oferta do Cartao Porto")
	public void proceder_com_recusa_da_oferta_do_cartao_porto() {
		System.out.println("passou");
	}

	public static void zipFile() {
		String filePath = System.getProperty("user.dir") + "/target/cucumber.json";
		
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
			System.err.format("The file %s does not exist", filePath);
		} catch (IOException ex) {
			System.err.println("I/O error: " + ex);
		}
	}
	
	public Steps() {
		zipFile();
	}
}
