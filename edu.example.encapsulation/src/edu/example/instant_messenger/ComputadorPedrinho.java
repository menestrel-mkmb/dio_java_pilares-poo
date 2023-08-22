package edu.example.instant_messenger;

public class ComputadorPedrinho {
	public static void main(String[] args) {
		MSNMessenger msn = new MSNMessenger();
		FacebookMessenger fb = new FacebookMessenger();
		fb.coletarDados();
		Telegram tel = new Telegram();
		
		fb.coletarDados();
		msn.enviarMensagem();
		fb.coletarDados();
		msn.receberMensagem();
		msn.tremerTela();
		
		fb.coletarDados();
		fb.enviarMensagem();
		fb.coletarDados();
		fb.receberMensagem();
		fb.coletarDados();
		
		fb.coletarDados();
		tel.enviarMensagem();
		fb.coletarDados();
		tel.receberMensagem();
		fb.coletarDados();
		tel.criarSuperGrupo();
		fb.coletarDados();
		
		fb.coletarDados();
		fb.coletarDados();
		fb.coletarDados();
		fb.coletarDados();
		fb.coletarDados();
		fb.coletarDados();
	}
}
