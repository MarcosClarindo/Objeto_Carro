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
			return this.modelo + "ATENÇÃO: O motor do carro está desligado! O carro está parado!";
		}
		
		//Daqui em diante já é garantido que o motor está LIGADO.
		
		//Verificando se a velocidade é zero
		if (this.velocidade == 0) {
			return this.modelo + " ATENÇÂO: O carro já está parado!";
		}
		
		// Daqui em diante é garantido que o motor está LIGADO e a velocidade é DIFERENTE DE ZERO.
		
		// Verificando se a redução de velocidade daria valor negativo.
		if ( (this.velocidade - valor) < 0 ) {
			// Atribuir valor a velocidade do carro 
			this.velocidade = 0;
			
			return this.modelo = " ---- FREOU!! O carro está PARADO!";
		}
		
		// Além das observações anteriores, daqui em diante é garantido que 
		//a frenagem aplicada ainda deixa a velocidade positiva
		
		// Aplicando o decréscimo de velocidade:
		this.velocidade -= valor; // é o mesmo que velocidade = velocidade - valor;
		
		return this.modelo + " FREOU!! Velocidade atual: " + this.velocidade + "km/h. ";
	}
	
	public String acelerar ( int valor ) {
		if (this.motorLigado) {
			this.velocidade += valor; // Incrementar o valor na variével velocidade. (this.velicudade = this.valocidade + valor
			return this.modelo + " ----> ACELEROU!!! Velocidade atual: " + this.velocidade + " km/h. ";
		}
		return this.modelo + "ATENÇÃO!!! Não é possível acelarar com o motor desligado. ";
	}
	
	public String desLigarMotor() {
		//Se o motor do carro está DESLIGADO (false)
		if(!this.motorLigado) {
			return "O motor do " + this.modelo + " já estava desligado. ";
		}
		
		//Verificando se a velocidade do carro é zero
		if (this.velocidade == 0) {
			//desligar motor
			this.motorLigado = false;
			
			return "O motor do " + this.modelo + " foi desligado agora.";
		}
		//Executa aqui quando o carro está LIGADO e com velocidade diferente de zero
		return "ATENÇÃO: O motor do " + this.modelo + " não foi desligado pois o carro está em movimento. ";
	}
	
	// Implementar o o método ligarMotor(), que ao ser acionado deve verificar se o motor do carro está
	//ligado, RETORNANDO uma das seguintes Strings conforme a situação do motor:
	
	public String ligarMotor() {
		if(this.motorLigado) {
			return "O motor do " + this.modelo + " já estava ligado. ";
		}
		this.motorLigado = true; // Estou ligando o motor
		return "O motor do " + this.modelo + " foi ligado agora. ";
	}
	public String situacaoMotor() {
		// é possível fazer só a cham
		if (this.motorLigado) {
			return this.modelo + " ---> Motor Ligado. "; 
		}
			return this.modelo + " ----> Motor Desligado. ";
		
	}
	
	// Método sem retorno para exibir o nome do fabricante, modelo e ano do objeto "Carro"
	public void detalhes() {
		System.out.println("------ Carro ------");
		System.out.println("Fabricante: " + this.fabricante);
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Ano: " + this.ano + "\n"); //"\n" para pular uma linha 
	}
	
	
	// método construtor simples
	public Carro() {
		super();
	}

	// métod0 construtor completo
	public Carro(String fabricante, String modelo, int ano, boolean motorLigado, int velocidade) {
		super();
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.ano = ano;
		this.motorLigado = motorLigado;
		this.velocidade = velocidade;
	}

	// terceiro método construtor. Definindo o valor da variavel diretamente na classe.
	public Carro(String fabricante, String modelo, int ano) {
		super();
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.ano = ano;
		this.motorLigado = false; // Definindo o paramentro da variável
		this.velocidade = 0; // Definindo o paramentro da variável
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
