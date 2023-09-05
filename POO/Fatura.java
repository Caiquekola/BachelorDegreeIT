class Fatura{
	String numero, descricao;
	int quant;
	float preco,total;
	void getTotalFatura()
	{
		if(preco<0){preco=0;}
		total = preco*quant;
		if(total<0){System.out.println("0.0");}
		else{System.out.println(total);}
	}
	
}

public class Main{
	public static void main(String[] args)
	{
			Fatura loja1;
			loja1 = new Fatura();
			loja1.numero = "1";
			loja1.descricao = "Placa De Video";
			loja1.quant = 5;
			loja1.preco = 25.0f;
			loja1.getTotalFatura();
	}

}
