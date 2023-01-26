package com.sharedbox.common.phonetization;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.sharedbox.common.location.Languages;

/**
 * 
 * @author Rafael Costi
 *
 */
class PhonetizerTest {
	
	private final String PHRASE_TEST = "Mil nome e sobrenome fonetico para teste glii _ umi glaa . E muito mais. dois mil reais. "
			+ "Uma CPU com velocidade de clock de 3,2 GHz executa 3,2 bilhões de ciclos por segundo. (As velocidades de CPUs mais "
			+ "antigas são medidas em MegaHertz ou milhões de ciclos por segundo.). O Instituto Metodista Izabela Hendrix foi "
			+ "criado em 1904, pela missionária norte-americana Martha Watts. No início, era um colégio destinado à educação de "
			+ "mulheres, o primeiro de Minas Gerais a reconhecer seus direitos e compreender a importância da atuação feminina na "
			+ "sociedade. Xadrez é um esporte, também considerado uma arte e uma ciência. Pode ser classificado como um jogo de "
			+ "tabuleiro de natureza recreativa ou competitiva para dois jogadores, sendo também conhecido como Xadrez Ocidental "
			+ "ou Xadrez Internacional para distingui-lo dos seus antecessores e de outras variantes atuais. katia fez festa com "
			+ "o cachorro. O leite de coco é feito apenas da combinação da polpa do coco maduro e água. Uma receita simples "
			+ "desenvolvida pelos africanos, ao que tudo indica. Isso porque, o primeiro registro de uso do leite de coco, "
			+ "segundo o historiador potiguar Câmara Cascudo, vem das observações do português Frei João dos Santos, na África. "
			+ "Uma mulher (do latim muliere) é um ser humano adulto do gênero feminino. Na infância, normalmente é denominada em "
			+ "português como menina. Uma cultura é uma planta ou produto animal que pode ser cultivada e colhida extensivamente "
			+ "para lucro ou subsistência. As safras podem se referir às partes colhidas ou à colheita em um estado mais refinado. "
			+ "A maioria das colheitas é cultivada na agricultura ou aquicultura. Colher malha calha. Entre os diversos ritmos de "
			+ "matriz Africana estão a Gnawa, a Kizomba e o Semba. O continente Africano tem uma cultura riquíssima, e entre as "
			+ "manifestações culturais de maior expressividade estão as danças, que são extremamente importantes para o seu povo "
			+ "pois os conecta com seus antepassados trazendo poderosa carga espiritual, emocional e artística, além de entreter "
			+ "e divertir. As danças Africanas estão diretamente ligadas a religião, onde o corpo atua como instrumento de conexão "
			+ "com o mundo espiritual. gnagnegnignognughagheghighoghu gnegnu ghagheghighoghugna Ktamsa. Isca de peixe. isso não se "
			+ "faz. Marisco com objetos. NGT. massaroca. massa. Y. zebra. palavra cruzada. prefeito prefeitura mauzoleu arquiteto "
			+ "arquitetura barata. estimação ati olé até caos cois chapeu. chia e macadamia chie chii chio CHIni china chines "
			+ "chinas chati chiti chitis chitisGDf chitasGDf chita casa zebra cczdas axai sola do pé, solo, solado, mas assassino. "
			+ " "
			+ "Um gnomo é uma criatura mitológica, incluída entre os seres elementais da terra. São costumeiramente representados "
			+ "como pequenos humanoides que vivem sob a terra, em minas ou em ocos de troncos. cirulo glacial artico. "
			+ " gliadina, solúvel em solução alcoólica (etanol 70%), é uma proteína monomérica responsável pela extensibilidade "
			+ "de glúten, ficando dispersa entre a glutenina, desenvolvendo um filme elástico forte envolvendo os grânulos de "
			+ "amido. mas aynda falta algumas cond_ições. o ano é dois mil e vinte y um. ninguém vai cair no buraco. uma mais um "
			+ "é dois. eese parece sem um bom teste. es_e é um teste pt br brasil. a kelly gostou do teste de glicemia. outros "
			+ "medicamentos considerados como secretagogos de insulina são as meglitinidas ou simplesmente glinidas. O "
			+ "glioblastoma multiforme é um tipo de câncer cerebral, do grupo dos gliomas, pois atinge um grupo específico de "
			+ "células chamadas de “células da glia”, que auxiliam na composição do cérebro e nas funções dos neurônios";
	/**
	 * 
	 */
	@Test
	public void executeTest() {
		assertNotNull(new Phonetizer());
		
		IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> Phonetizer.execute(null));
		assertTrue(thrown.getMessage().contains("Phoneticize error"));

		assertNotNull(Phonetizer.execute(PHRASE_TEST));
		assertNotNull(Phonetizer.execute(null, PHRASE_TEST));
		assertNotNull(Phonetizer.execute(Languages.En, PHRASE_TEST));
	}
}
