package edu.example.instant_messenger;

public abstract class ServicoMensagemInstantanea {
	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando mensagem");
		salvarHistoricoMensagem();
	}
	
	public void receberMensagem() {
		System.out.println("Recebendo mensagem");
		salvarHistoricoMensagem();
	}
	
	private void validarConectadoInternet() {
		System.out.println("Validando se está conectado a internet");
	}
	
	private void salvarHistoricoMensagem() {
		System.out.println("Salvando o histórico da mensagem");
	}
}