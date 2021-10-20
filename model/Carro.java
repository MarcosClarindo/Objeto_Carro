package model;

public class Carro {
	
	// atributos da classe Carro
	
	private String fabricante;
	private String modelo;
	private int ano;
	private boolean motorLigado;
	private int velocidade;
	
	public String frear (int valor ) {
		// Se o motor do carro estiver DESLIGADO (false)
		if (!this.motorLigado) {
			return this.modelo + "ATEN��O: O motor do carro est� desligado! O carro est� parado!";
		}
		
		//Daqui em diante j� � garantido que o motor est� LIGADO.
		
		//Verificando se a velocidade � zero
		if (this.velocidade == 0) {
			return this.modelo + " ATEN��O: O carro j� est� parado!";
		}
		
		// Daqui em diante � garantido que o motor est� LIGADO e a velocidade � DIFERENTE DE ZERO.
		
		// Verificando se a redu��o de velocidade daria valor negativo.
		if ( (this.velocidade - valor) < 0 ) {
			// Atribuir valor a velocidade do carro 
			this.velocidade = 0;
			
			return this.modelo = " ---- FREOU!! O carro est� PARADO!";
		}
		
		// Al�m das observa��es anteriores, daqui em diante � garantido que 
		//a frenagem aplicada ainda deixa a velocidade positiva
		
		// Aplicando o decr�scimo de velocidade:
		this.velocidade -= valor; // � o mesmo que velocidade = velocidade - valor;
		
		return this.modelo + " FREOU!! Velocidade atual: " + this.velocidade + "km/h. ";
	}
	
	public String acelerar ( int valor ) {
		if (this.motorLigado) {
			this.velocidade += valor; // Incrementar o valor na vari�vel velocidade. (this.velicudade = this.valocidade + valor
			return this.modelo + " ----> ACELEROU!!! Velocidade atual: " + this.velocidade + " km/h. ";
		}
		return this.modelo + "ATEN��O!!! N�o � poss�vel acelarar com o motor desligado. ";
	}
	
	public String desLigarMotor() {
		//Se o motor do carro est� DESLIGADO (false)
		if(!this.motorLigado) {
			return "O motor do " + this.modelo + " j� estava desligado. ";
		}
		
		//Verificando se a velocidade do carro � zero
		if (this.velocidade == 0) {
			//desligar motor
			this.motorLigado = false;
			
			return "O motor do " + this.modelo + " foi desligado agora.";
		}
		//Executa aqui quando o carro est� LIGADO e com velocidade diferente de zero
		return "ATEN��O: O motor do " + this.modelo + " n�o foi desligado pois o carro est� em movimento. ";
	}
	
	// Implementar o o m�todo ligarMotor(), que ao ser acionado deve verificar se o motor do carro est�
	//ligado, RETORNANDO uma das seguintes Strings conforme a situa��o do motor:
	
	public String ligarMotor() {
		if(this.motorLigado) {
			return "O motor do " + this.modelo + " j� estava ligado. ";
		}
		this.motorLigado = true; // Estou ligando o motor
		return "O motor do " + this.modelo + " foi ligado agora. ";
	}
	public String situacaoMotor() {
		// � poss�vel fazer s� a cham
		if (this.motorLigado) {
			return this.modelo + " ---> Motor Ligado. "; 
		}
			return this.modelo + " ----> Motor Desligado. ";
		
	}
	
	// M�todo sem retorno para exibir o nome do fabricante, modelo e ano do objeto "Carro"
	public void detalhes() {
		System.out.println("------ Carro ------");
		System.out.println("Fabricante: " + this.fabricante);
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Ano: " + this.ano + "\n"); //"\n" para pular uma linha 
	}
	
	
	// m�todo construtor simples
	public Carro() {
		super();
	}

	// m�tod0 construtor completo
	public Carro(String fabricante, String modelo, int ano, boolean motorLigado, int velocidade) {
		super();
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.ano = ano;
		this.motorLigado = motorLigado;
		this.velocidade = velocidade;
	}

	// terceiro m�todo construtor. Definindo o valor da variavel diretamente na classe.
	public Carro(String fabricante, String modelo, int ano) {
		super();
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.ano = ano;
		this.motorLigado = false; // Definindo o paramentro da vari�vel
		this.velocidade = 0; // Definindo o paramentro da vari�vel
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public boolean isMototLigado() {
		return motorLigado;
	}

	public void setMototLigado(boolean mototLigado) {
		this.motorLigado = mototLigado;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	
	
	
	
	
}
