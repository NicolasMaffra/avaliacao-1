
public class EstatisticasSimples {

	public static double calculaValorMinimo(double[] valoresDeEntrada) {
		double valor = valoresDeEntrada[0];
		for(int i=0; i < valoresDeEntrada.length; i++){
			if (valoresDeEntrada[i] < valor){
				valor = valoresDeEntrada[i];
			}	
		}
		
		return valor;
	}
	
	public static double calculaValorMaximo(double[] valoresDeEntrada) {
		double valor = valoresDeEntrada[0];
		for(int i=1; i < valoresDeEntrada.length; i++){
			if (valoresDeEntrada[i] > valor){
				valor = valoresDeEntrada[i];
			}
		}
		return valor;
	}

	public static int calculaQuantidade(double[] valoresDeEntrada) {
		int valor = 0;
		for(int i = 0; i<=valoresDeEntrada.length;i++){
			valor = i;
		}
			
		return valor;
	}

	public static double calculaMedia(double[] valoresDeEntrada) {
		double valor = 0;
		int qtd = 0;
		for(int i = 0; i < valoresDeEntrada.length; i++){
			valor = valor + valoresDeEntrada[i];
		}
		
		//verifica quantidade de números
		for(int x = 0; x <= valoresDeEntrada.length; x++){
			qtd = x;
		}	

		double result = valor / qtd;
 
		return result;
	}

	public static double[] calcula(double[] valoresDeEntrada) {
		double valor1 = calculaValorMinimo(valoresDeEntrada);
		double valor2 = calculaValorMaximo(valoresDeEntrada);
		double valor3 = calculaQuantidade(valoresDeEntrada);
		double valor4 = calculaMedia(valoresDeEntrada);
		
		double[] result = {valor1, valor2, valor3, valor4};
		
		return result;
	}

}
