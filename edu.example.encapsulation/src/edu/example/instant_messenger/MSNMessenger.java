package edu.example.instant_messenger;

public class MSNMessenger extends ServicoMensagemInstantanea {
	@Override
	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Recebendo mensagem do MSN");
		salvarHistoricoMensagem();
	}

	@Override
	public void receberMensagem() {
		System.out.println("Recebendo mensagem do MSN");
		salvarHistoricoMensagem();		
	}
	
	public void enviarWink() {
		System.out.println("O sentimento de vergonha alheia preenche sua existência");
	}
	
	public void tremerTela() {
		System.out.println("BUAN-AN-AN");
	}
}
