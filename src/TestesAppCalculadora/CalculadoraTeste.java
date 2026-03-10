package TestesAppCalculadora;

import static org.junit.Assert.*;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import FontesAppCalculadora.CalculadoraAritmetica;



public class CalculadoraTeste {
	
		//atributos de controle do teste
		//cada teste executado é um objeto novo
		private static int numeroTeste = 0;
		private String nomeTeste = "";
		private double resultadoReal = 0;
		
		//Atributos de comparação de resultado
		private double resultadoEsperado;	
		
		//preparação do teste
		@Before
		
		public void preparaTeste() {
			numeroTeste += 1;
			System.out.print("Iniciando o teste: ");
			System.out.println(numeroTeste);
		}
		
		@After
		public void encerraTeste() {
			System.out.println(nomeTeste);
			System.out.print(" - resultado = ");
			System.out.println(resultadoReal);
		}
		
		@Test
		public void testeSomar2com3() {
			nomeTeste = "Teste de soma de 2 com 3";
			resultadoEsperado = 5;
			CalculadoraAritmetica calc = new CalculadoraAritmetica();
			resultadoReal = calc.somar(2, 3);
			assertEquals(resultadoEsperado, resultadoReal, 0);
		}
		
		@Test
		public void testeSomar3com3() {
			nomeTeste = "Teste de soma de 3 com 3";
			resultadoEsperado = 6;
			CalculadoraAritmetica calc = new CalculadoraAritmetica();
			resultadoReal = calc.somar(3, 3);
			assertEquals(resultadoEsperado, resultadoReal, 0);
		}
		
		@Test
		public void testeSomar5com3() {
			nomeTeste = "Teste de soma de 5 com 3";
			resultadoEsperado = 8;
			CalculadoraAritmetica calc = new CalculadoraAritmetica();
			resultadoReal = calc.somar(5, 3);
			assertEquals(resultadoEsperado, resultadoReal, 0);
		}
		
			@Test
		public void testeDividir3com2() {
			nomeTeste = "Teste de divisão de 3 com 2";
			resultadoEsperado = 0.4285;
			CalculadoraAritmetica calc = new CalculadoraAritmetica();
			resultadoReal = calc.dividir(3, 7);
			assertEquals(resultadoEsperado, resultadoReal, 0.1);
		}
			
		@Test
		public void testeDividir3com7() {
			nomeTeste = "Teste de divisão de 3 com 7";
			resultadoEsperado = 0.42857;
			CalculadoraAritmetica calc = new CalculadoraAritmetica();
			resultadoReal = calc.dividir(3, 7);
			//esses 0.0001 na mascara deve igualar ao que foi colocado no resultadoEsperado
			assertEquals(resultadoEsperado, resultadoReal, 0.0001);
		}
  
}

