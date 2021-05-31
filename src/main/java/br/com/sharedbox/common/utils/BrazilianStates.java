package br.com.sharedbox.common.utils;

/**
 * Contain all Brazilian states
 * 
 * @author Rafael Costi [rafaelcosti@outlook.com]
 * @version 1.0.0
 * @since 05/31/2021
 */
public enum BrazilianStates {
	Acre("AC", "Acre"),
	Alagoas("AL", "Alagoas"),
	Amapa("AP", "Amapá"),
	Amazonas("AM", "Amazonas"),
	Bahia("BA", "Bahia"),
	Ceara("CE", "Ceará"),
	DistritoFederal("DF", "Distrito Federal"),
	EspiritoSanto("ES", "Espírito Santo"),
	Goias("GO", "Goiás"),
	Maranhao("MA", "Maranhão"),
	MatoGrosso("MT", "Mato Grosso"),
	MatoGrossoDoSul("MS", "Mato Grosso do Sul"),
	MinasGerais("MG", "Minas Gerais"),
	Para("PA", "Pará"),
	Paraiba("PB", "Paraíba"),
	Paran("PR", "Paraná"),
	Pernambuco("PE", "Pernambuco"),
	Piaui("PI", "Piauí"),
	Roraima("RR", "Roraima"),
	Rondonia("RO", "Rondônia"),
	RioDeJaneiro("RJ", "Rio de Janeiro"),
	RioGrandeDoNorte("RN", "Rio Grande do Norte"),
	RioGrandeDoSul("RS", "Rio Grande do Sul"),
	SantaCatarina("SC", "Santa Catarina"),
	SaoPaulo("SP", "São Paulo"),
	Sergipe("SE", "Sergipe"),
	Tocantins("TO", "Tocantins");

	/**
	 * Constructor
	 * @param acronyms
	 * @param name
	 */
	private BrazilianStates(String acronyms, String name) {
		this.name = name;
		this.acronyms = acronyms;
	}
	
	/**
	 * 
	 */
	private String acronyms;
	
	/**
	 * 
	 */
	private String name;

	/**
	 * 
	 * @return
	 */
	public String getAcronyms() {
		return this.acronyms;
	}

	/**
	 * 
	 * @return
	 */
	public String getName() {
		return this.name;
	}
}
