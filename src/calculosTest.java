
import static org.junit.Assert.*;

import org.junit.Test;

public class calculosTest {
	@Test
	public void deveCalcularValorMinimoEntreDoisValores() {
		double valoresDeEntrada[] =  {9,5};
		double valorMinimoCalculado = EstatisticasSimples.calculaValorMinimo(valoresDeEntrada);
		assertEquals(5, valorMinimoCalculado, 0);
	}

	@Test
	public void deveCalcularValorMaximoEntreDoisValores() {
		double valoresDeEntrada[] =  {9,5};
		double valorMinimoCalculado = EstatisticasSimples.calculaValorMaximo(valoresDeEntrada);
		assertEquals(9, valorMinimoCalculado, 0);
	}

	@Test
	public void deveCalcularQuantidadeDeValores() {
		double valoresDeEntrada[] =  {9,5};
		int quantidadeDeValores = EstatisticasSimples.calculaQuantidade(valoresDeEntrada);
		assertEquals(2, quantidadeDeValores);
	}

	@Test
	public void deveCalcularMediaDeDoisValores() {
		double valoresDeEntrada[] =  {9,5};
		double mediaDeValores = EstatisticasSimples.calculaMedia(valoresDeEntrada);
		assertEquals(7, mediaDeValores, 0);
	}

	@Test
	public void deveEfetuarTodosCalculosParaDoisValores() {
		double valoresDeEntrada[] =  {9,5};
		double valoresDeSaida[] = EstatisticasSimples.calcula(valoresDeEntrada);
		assertArrayEquals(new double[] {5,9,2,7}, valoresDeSaida, 0);		
	}
	
	//novos testes
	@Test
	public void deveCalcularValorMinimoEntreDoisValores2() {
		double valoresDeEntrada[] =  {12.82,65,33,89};
		double valorMinimoCalculado = EstatisticasSimples.calculaValorMinimo(valoresDeEntrada);
		assertEquals(12.82, valorMinimoCalculado, 0);
	}

	@Test
	public void deveCalcularValorMaximoEntreDoisValores2() {
		double valoresDeEntrada[] =  {25,76,99.2,72};
		double valorMinimoCalculado = EstatisticasSimples.calculaValorMaximo(valoresDeEntrada);
		assertEquals(99.2, valorMinimoCalculado, 0);
	}

	@Test
	public void deveCalcularQuantidadeDeValores2() {
		double valoresDeEntrada[] =  {67,81,67.3,3.9};
		int quantidadeDeValores = EstatisticasSimples.calculaQuantidade(valoresDeEntrada);
		assertEquals(4, quantidadeDeValores);
	}

	@Test
	public void deveCalcularMediaDeDoisValores2() {
		double valoresDeEntrada[] =  {34,7.9,8.2};
		double mediaDeValores = EstatisticasSimples.calculaMedia(valoresDeEntrada);
		assertEquals(16.7, mediaDeValores, 0);
	}

	
}
