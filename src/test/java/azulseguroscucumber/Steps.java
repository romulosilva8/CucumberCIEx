package azulseguroscucumber;

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

}
