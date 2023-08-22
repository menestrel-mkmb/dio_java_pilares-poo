package edu.example.instant_messenger;

public abstract class ServicoMensagemInstantanea {
	abstract public void enviarMensagem();
	
	abstract public void receberMensagem();
	
	protected void validarConectadoInternet() {
		System.out.println("Validando se está conectado a internet");
	}
	
	protected void salvarHistoricoMensagem() {
		System.out.println("Salvando o histórico da mensagem");
	}
}