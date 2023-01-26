package com.sharedbox.common.location.regions.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import com.sharedbox.common.location.regions.AntiguaAndBarbudaRegions;
import com.sharedbox.common.location.regions.BahamasRegions;
import com.sharedbox.common.location.regions.BarbadosRegions;
import com.sharedbox.common.location.regions.BelizeRegions;
import com.sharedbox.common.location.regions.BoliviaRegions;
import com.sharedbox.common.location.regions.BrazilRegions;
import com.sharedbox.common.location.regions.CanadaRegions;
import com.sharedbox.common.location.regions.ChileRegions;
import com.sharedbox.common.location.regions.ColombiaRegions;
import com.sharedbox.common.location.regions.CostaRicaRegions;
import com.sharedbox.common.location.regions.CubaRegions;
import com.sharedbox.common.location.regions.DominicaRegions;
import com.sharedbox.common.location.regions.DominicanRepublicRegions;
import com.sharedbox.common.location.regions.EcuadorRegions;
import com.sharedbox.common.location.regions.ElSalvadorRegions;
import com.sharedbox.common.location.regions.GrenadaRegions;
import com.sharedbox.common.location.regions.GuatemalaRegions;
import com.sharedbox.common.location.regions.GuyanaRegions;
import com.sharedbox.common.location.regions.HaitiRegions;
import com.sharedbox.common.location.regions.HondurasRegions;
import com.sharedbox.common.location.regions.JamaicaRegions;
import com.sharedbox.common.location.regions.MexicoRegions;
import com.sharedbox.common.location.regions.NicaraguaRegions;
import com.sharedbox.common.location.regions.PanamaRegions;
import com.sharedbox.common.location.regions.ParaguayRegions;
import com.sharedbox.common.location.regions.PeruRegions;
import com.sharedbox.common.location.regions.SaintKittsAndNevisRegions;
import com.sharedbox.common.location.regions.SaintLuciaRegions;
import com.sharedbox.common.location.regions.SaintVincentAndTheGrenadinesRegions;
import com.sharedbox.common.location.regions.SurinameRegions;
import com.sharedbox.common.location.regions.TrinidadAndTobagoRegions;
import com.sharedbox.common.location.regions.UnitedStatesOfAmericaRegions;
import com.sharedbox.common.location.regions.UruguayRegions;
import com.sharedbox.common.location.regions.VenezuelaRegions;

/**
 * Call test of RegionsBr enum
 * 
 * @author Rafael Costi [rafaelcosti@outlook.com]
 * @version 1.0.0
 * @since 03/08/2022 - Version 1.0.0
 */
public class RegionsTest {
	/**
	 * Continents test
	 */
	@Test
	public void test() {
		// Antigua And Barbuda
		assertEquals(AntiguaAndBarbudaRegions.Barbuda.getCode(), "10");
		assertEquals(AntiguaAndBarbudaRegions.Barbuda.getName(), "Barbuda");
		assertEquals(AntiguaAndBarbudaRegions.getByCode(AntiguaAndBarbudaRegions.Barbuda.getCode()),
				AntiguaAndBarbudaRegions.Barbuda);
		assertEquals(AntiguaAndBarbudaRegions.getByCode("ZZ"), AntiguaAndBarbudaRegions.NotFound);
		assertEquals(AntiguaAndBarbudaRegions.getByCode(null), AntiguaAndBarbudaRegions.NotFound);
		assertEquals(AntiguaAndBarbudaRegions.getByCode("AA"), AntiguaAndBarbudaRegions.NotFound);
		assertEquals(AntiguaAndBarbudaRegions.getByCode("-1"), AntiguaAndBarbudaRegions.NotFound);

		String json = AntiguaAndBarbudaRegions.Barbuda.toJson();
		assertNotNull(json);

		json = AntiguaAndBarbudaRegions.toJsonList();
		assertNotNull(json);
		
		// Bahamas
		assertEquals(BahamasRegions.CentralAbaco.getCode(), "CO");
		assertEquals(BahamasRegions.CentralAbaco.getName(), "Central Abaco");
		assertEquals(BahamasRegions.getByCode(BahamasRegions.CentralAbaco.getCode()),
				BahamasRegions.CentralAbaco);
		assertEquals(BahamasRegions.getByCode("ZZ"), BahamasRegions.NotFound);
		assertEquals(BahamasRegions.getByCode(null), BahamasRegions.NotFound);
		assertEquals(BahamasRegions.getByCode("AA"), BahamasRegions.NotFound);
		assertEquals(BahamasRegions.getByCode("-1"), BahamasRegions.NotFound);

		json = BahamasRegions.CentralAbaco.toJson();
		assertNotNull(json);

		json = BahamasRegions.toJsonList();
		assertNotNull(json);
		
		// Barbados
		assertEquals(BarbadosRegions.ChristChurch.getCode(), "01");
		assertEquals(BarbadosRegions.ChristChurch.getName(), "Christ Church");
		assertEquals(BarbadosRegions.getByCode(BarbadosRegions.ChristChurch.getCode()),
				BarbadosRegions.ChristChurch);
		assertEquals(BarbadosRegions.getByCode("ZZ"), BarbadosRegions.NotFound);
		assertEquals(BarbadosRegions.getByCode(null), BarbadosRegions.NotFound);
		assertEquals(BarbadosRegions.getByCode("AA"), BarbadosRegions.NotFound);
		assertEquals(BarbadosRegions.getByCode("-1"), BarbadosRegions.NotFound);

		json = BarbadosRegions.ChristChurch.toJson();
		assertNotNull(json);

		json = BarbadosRegions.toJsonList();
		assertNotNull(json);
		
		// Belize
		assertEquals(BelizeRegions.BelizeDistrict.getCode(), "BZ");
		assertEquals(BelizeRegions.BelizeDistrict.getName(), "Belize District");
		assertEquals(BelizeRegions.getByCode(BelizeRegions.BelizeDistrict.getCode()),
				BelizeRegions.BelizeDistrict);
		assertEquals(BelizeRegions.getByCode("ZZ"), BelizeRegions.NotFound);
		assertEquals(BelizeRegions.getByCode(null), BelizeRegions.NotFound);
		assertEquals(BelizeRegions.getByCode("AA"), BelizeRegions.NotFound);
		assertEquals(BelizeRegions.getByCode("-1"), BelizeRegions.NotFound);

		json = BelizeRegions.BelizeDistrict.toJson();
		assertNotNull(json);

		json = BelizeRegions.toJsonList();
		assertNotNull(json);
		
		// Brazil
		assertEquals(BrazilRegions.SaoPaulo.getCode(), "SP");
		assertEquals(BrazilRegions.SaoPaulo.getName(), "São Paulo");
		assertEquals(BrazilRegions.getByCode(BrazilRegions.SaoPaulo.getCode()), BrazilRegions.SaoPaulo);
		assertEquals(BrazilRegions.getByCode("ZZ"), BrazilRegions.NotFound);
		assertEquals(BrazilRegions.getByCode(null), BrazilRegions.NotFound);
		assertEquals(BrazilRegions.getByCode("AA"), BrazilRegions.NotFound);
		assertEquals(BrazilRegions.getByCode("-1"), BrazilRegions.NotFound);

		json = BrazilRegions.SaoPaulo.toJson();
		assertNotNull(json);

		json = BrazilRegions.toJsonList();
		assertNotNull(json);

		// Bolivia
		assertEquals(BoliviaRegions.DepartamentoDeLaPaz.getCode(), "L");
		assertEquals(BoliviaRegions.DepartamentoDeLaPaz.getName(), "Departamento de La Paz");
		assertEquals(BoliviaRegions.getByCode(BoliviaRegions.DepartamentoDeLaPaz.getCode()),
				BoliviaRegions.DepartamentoDeLaPaz);
		assertEquals(BoliviaRegions.getByCode("ZZ"), BoliviaRegions.NotFound);
		assertEquals(BoliviaRegions.getByCode(null), BoliviaRegions.NotFound);
		assertEquals(BoliviaRegions.getByCode("AA"), BoliviaRegions.NotFound);
		assertEquals(BoliviaRegions.getByCode("-1"), BoliviaRegions.NotFound);

		json = BoliviaRegions.DepartamentoDeLaPaz.toJson();
		assertNotNull(json);

		json = BrazilRegions.toJsonList();
		assertNotNull(json);

		// Canada
		assertEquals(CanadaRegions.Quebec.getCode(), "QC");
		assertEquals(CanadaRegions.Quebec.getName(), "Quebec");
		assertEquals(CanadaRegions.getByCode(CanadaRegions.Quebec.getCode()), CanadaRegions.Quebec);
		assertEquals(CanadaRegions.getByCode("ZZ"), CanadaRegions.NotFound);
		assertEquals(CanadaRegions.getByCode(null), CanadaRegions.NotFound);
		assertEquals(CanadaRegions.getByCode("AA"), CanadaRegions.NotFound);
		assertEquals(CanadaRegions.getByCode("-1"), CanadaRegions.NotFound);

		json = CanadaRegions.Quebec.toJson();
		assertNotNull(json);

		json = CanadaRegions.toJsonList();
		assertNotNull(json);

		// Chile
		assertEquals(ChileRegions.RegionMetropolitanaDeSantiago.getCode(), "RM");
		assertEquals(ChileRegions.RegionMetropolitanaDeSantiago.getName(), "Región Metropolitana de Santiago");
		assertEquals(ChileRegions.getByCode(ChileRegions.RegionMetropolitanaDeSantiago.getCode()),
				ChileRegions.RegionMetropolitanaDeSantiago);
		assertEquals(ChileRegions.getByCode("ZZ"), ChileRegions.NotFound);
		assertEquals(ChileRegions.getByCode(null), ChileRegions.NotFound);
		assertEquals(ChileRegions.getByCode("AA"), ChileRegions.NotFound);
		assertEquals(ChileRegions.getByCode("-1"), ChileRegions.NotFound);

		json = ChileRegions.RegionMetropolitanaDeSantiago.toJson();
		assertNotNull(json);

		json = ChileRegions.toJsonList();
		assertNotNull(json);

		// Colombia
		assertEquals(ColombiaRegions.DepartamentoDeLaGuajira.getCode(), "LAG");
		assertEquals(ColombiaRegions.DepartamentoDeLaGuajira.getName(), "Departamento de La Guajira");
		assertEquals(ColombiaRegions.getByCode(ColombiaRegions.DepartamentoDeLaGuajira.getCode()),
				ColombiaRegions.DepartamentoDeLaGuajira);
		assertEquals(ColombiaRegions.getByCode("ZZ"), ColombiaRegions.NotFound);
		assertEquals(ColombiaRegions.getByCode(null), ColombiaRegions.NotFound);
		assertEquals(ColombiaRegions.getByCode("AA"), ColombiaRegions.NotFound);
		assertEquals(ColombiaRegions.getByCode("-1"), ColombiaRegions.NotFound);

		json = ColombiaRegions.DepartamentoDeLaGuajira.toJson();
		assertNotNull(json);

		json = ColombiaRegions.toJsonList();
		assertNotNull(json);

		// Costa Rica
		assertEquals(CostaRicaRegions.SanJose.getCode(), "SJ");
		assertEquals(CostaRicaRegions.SanJose.getName(), "San Jose");
		assertEquals(CostaRicaRegions.getByCode(CostaRicaRegions.SanJose.getCode()), CostaRicaRegions.SanJose);
		assertEquals(CostaRicaRegions.getByCode("ZZ"), CostaRicaRegions.NotFound);
		assertEquals(CostaRicaRegions.getByCode(null), CostaRicaRegions.NotFound);
		assertEquals(CostaRicaRegions.getByCode("AA"), CostaRicaRegions.NotFound);
		assertEquals(CostaRicaRegions.getByCode("-1"), CostaRicaRegions.NotFound);

		json = CostaRicaRegions.SanJose.toJson();
		assertNotNull(json);

		json = CostaRicaRegions.toJsonList();
		assertNotNull(json);

		// Cuba
		assertEquals(CubaRegions.LaHabana.getCode(), "03");
		assertEquals(CubaRegions.LaHabana.getName(), "la Habana");
		assertEquals(CubaRegions.getByCode(CubaRegions.LaHabana.getCode()), CubaRegions.LaHabana);
		assertEquals(CubaRegions.getByCode("ZZ"), CubaRegions.NotFound);
		assertEquals(CubaRegions.getByCode(null), CubaRegions.NotFound);
		assertEquals(CubaRegions.getByCode("AA"), CubaRegions.NotFound);
		assertEquals(CubaRegions.getByCode("-1"), CubaRegions.NotFound);

		json = CubaRegions.LaHabana.toJson();
		assertNotNull(json);

		json = CubaRegions.toJsonList();
		assertNotNull(json);
		
		// Dominican Republic
		assertEquals(DominicanRepublicRegions.DistritoNacional.getCode(), "01");
		assertEquals(DominicanRepublicRegions.DistritoNacional.getName(), "Distrito Nacional");
		assertEquals(DominicanRepublicRegions.getByCode(DominicanRepublicRegions.DistritoNacional.getCode())
				, DominicanRepublicRegions.DistritoNacional);
		assertEquals(DominicanRepublicRegions.getByCode("ZZ"), DominicanRepublicRegions.NotFound);
		assertEquals(DominicanRepublicRegions.getByCode(null), DominicanRepublicRegions.NotFound);
		assertEquals(DominicanRepublicRegions.getByCode("AA"), DominicanRepublicRegions.NotFound);
		assertEquals(DominicanRepublicRegions.getByCode("-1"), DominicanRepublicRegions.NotFound);

		json = DominicanRepublicRegions.DistritoNacional.toJson();
		assertNotNull(json);

		json = DominicanRepublicRegions.toJsonList();
		assertNotNull(json);
		
		// Dominica
		assertEquals(DominicaRegions.SaintAndrewParish.getCode(), "02");
		assertEquals(DominicaRegions.SaintAndrewParish.getName(), "Saint Andrew Parish");
		assertEquals(DominicaRegions.getByCode(DominicaRegions.SaintAndrewParish.getCode()), DominicaRegions.SaintAndrewParish);
		assertEquals(DominicaRegions.getByCode("ZZ"), DominicaRegions.NotFound);
		assertEquals(DominicaRegions.getByCode(null), DominicaRegions.NotFound);
		assertEquals(DominicaRegions.getByCode("AA"), DominicaRegions.NotFound);
		assertEquals(DominicaRegions.getByCode("-1"), DominicaRegions.NotFound);

		json = DominicaRegions.SaintAndrewParish.toJson();
		assertNotNull(json);

		json = DominicaRegions.toJsonList();
		assertNotNull(json);

		// Ecuador
		assertEquals(EcuadorRegions.Bolivar.getCode(), "B");
		assertEquals(EcuadorRegions.Bolivar.getName(), "Bolívar");
		assertEquals(EcuadorRegions.getByCode(EcuadorRegions.Bolivar.getCode()), EcuadorRegions.Bolivar);
		assertEquals(EcuadorRegions.getByCode("ZZ"), EcuadorRegions.NotFound);
		assertEquals(EcuadorRegions.getByCode(null), EcuadorRegions.NotFound);
		assertEquals(EcuadorRegions.getByCode("AA"), EcuadorRegions.NotFound);
		assertEquals(EcuadorRegions.getByCode("-1"), EcuadorRegions.NotFound);

		json = EcuadorRegions.Bolivar.toJson();
		assertNotNull(json);

		json = EcuadorRegions.toJsonList();
		assertNotNull(json);

		// El Salvador
		assertEquals(ElSalvadorRegions.DepartamentoDeLaPaz.getCode(), "PA");
		assertEquals(ElSalvadorRegions.DepartamentoDeLaPaz.getName(), "Departamento de La Paz");
		assertEquals(ElSalvadorRegions.getByCode(ElSalvadorRegions.DepartamentoDeLaPaz.getCode())
				, ElSalvadorRegions.DepartamentoDeLaPaz);
		assertEquals(ElSalvadorRegions.getByCode("ZZ"), ElSalvadorRegions.NotFound);
		assertEquals(ElSalvadorRegions.getByCode(null), ElSalvadorRegions.NotFound);
		assertEquals(ElSalvadorRegions.getByCode("AA"), ElSalvadorRegions.NotFound);
		assertEquals(ElSalvadorRegions.getByCode("-1"), ElSalvadorRegions.NotFound);

		json = ElSalvadorRegions.DepartamentoDeLaPaz.toJson();
		assertNotNull(json);

		json = ElSalvadorRegions.toJsonList();
		assertNotNull(json);

		// Grenada
		assertEquals(GrenadaRegions.CarriacouAndPetiteMartinique.getCode(), "10");
		assertEquals(GrenadaRegions.CarriacouAndPetiteMartinique.getName(), "Carriacou and Petite Martinique");
		assertEquals(GrenadaRegions.getByCode(GrenadaRegions.CarriacouAndPetiteMartinique.getCode())
				, GrenadaRegions.CarriacouAndPetiteMartinique);
		assertEquals(GrenadaRegions.getByCode("ZZ"), GrenadaRegions.NotFound);
		assertEquals(GrenadaRegions.getByCode(null), GrenadaRegions.NotFound);
		assertEquals(GrenadaRegions.getByCode("AA"), GrenadaRegions.NotFound);
		assertEquals(GrenadaRegions.getByCode("-1"), GrenadaRegions.NotFound);

		json = GrenadaRegions.CarriacouAndPetiteMartinique.toJson();
		assertNotNull(json);

		json = GrenadaRegions.toJsonList();
		assertNotNull(json);

		// Guatemala
		assertEquals(GuatemalaRegions.DepartamentoDeGuatemala.getCode(), "GU");
		assertEquals(GuatemalaRegions.DepartamentoDeGuatemala.getName(), "Departamento de Guatemala");
		assertEquals(GuatemalaRegions.getByCode(GuatemalaRegions.DepartamentoDeGuatemala.getCode()), GuatemalaRegions.DepartamentoDeGuatemala);
		assertEquals(GuatemalaRegions.getByCode("ZZ"), GuatemalaRegions.NotFound);
		assertEquals(GuatemalaRegions.getByCode(null), GuatemalaRegions.NotFound);
		assertEquals(GuatemalaRegions.getByCode("AA"), GuatemalaRegions.NotFound);
		assertEquals(GuatemalaRegions.getByCode("-1"), GuatemalaRegions.NotFound);

		json = GuatemalaRegions.DepartamentoDeGuatemala.toJson();
		assertNotNull(json);

		json = GuatemalaRegions.toJsonList();
		assertNotNull(json);

		// Guyana
		assertEquals(GuyanaRegions.BarimaWaini.getCode(), "BA");
		assertEquals(GuyanaRegions.BarimaWaini.getName(), "Barima-Waini");
		assertEquals(GuyanaRegions.getByCode(GuyanaRegions.BarimaWaini.getCode()), GuyanaRegions.BarimaWaini);
		assertEquals(GuyanaRegions.getByCode("ZZ"), GuyanaRegions.NotFound);
		assertEquals(GuyanaRegions.getByCode(null), GuyanaRegions.NotFound);
		assertEquals(GuyanaRegions.getByCode("AA"), GuyanaRegions.NotFound);
		assertEquals(GuyanaRegions.getByCode("-1"), GuyanaRegions.NotFound);

		json = GuyanaRegions.BarimaWaini.toJson();
		assertNotNull(json);

		json = GuyanaRegions.toJsonList();
		assertNotNull(json);

		// Haiti
		assertEquals(HaitiRegions.Sant.getCode(), "CE");
		assertEquals(HaitiRegions.Sant.getName(), "Sant");
		assertEquals(HaitiRegions.getByCode(HaitiRegions.Sant.getCode()), HaitiRegions.Sant);
		assertEquals(HaitiRegions.getByCode("ZZ"), HaitiRegions.NotFound);
		assertEquals(HaitiRegions.getByCode(null), HaitiRegions.NotFound);
		assertEquals(HaitiRegions.getByCode("AA"), HaitiRegions.NotFound);
		assertEquals(HaitiRegions.getByCode("-1"), HaitiRegions.NotFound);

		json = HaitiRegions.Sant.toJson();
		assertNotNull(json);

		json = HaitiRegions.toJsonList();
		assertNotNull(json);

		// Honduras
		assertEquals(HondurasRegions.DepartamentoDeLaPaz.getCode(), "LP");
		assertEquals(HondurasRegions.DepartamentoDeLaPaz.getName(), "Departamento de La Paz");
		assertEquals(HondurasRegions.getByCode(HondurasRegions.DepartamentoDeLaPaz.getCode()), HondurasRegions.DepartamentoDeLaPaz);
		assertEquals(HondurasRegions.getByCode("ZZ"), HondurasRegions.NotFound);
		assertEquals(HondurasRegions.getByCode(null), HondurasRegions.NotFound);
		assertEquals(HondurasRegions.getByCode("AA"), HondurasRegions.NotFound);
		assertEquals(HondurasRegions.getByCode("-1"), HondurasRegions.NotFound);

		json = HondurasRegions.DepartamentoDeLaPaz.toJson();
		assertNotNull(json);

		json = HondurasRegions.toJsonList();
		assertNotNull(json);

		// Jamaica
		assertEquals(JamaicaRegions.PortlandParish.getCode(), "04");
		assertEquals(JamaicaRegions.PortlandParish.getName(), "Portland Parish");
		assertEquals(JamaicaRegions.getByCode(JamaicaRegions.PortlandParish.getCode()), JamaicaRegions.PortlandParish);
		assertEquals(JamaicaRegions.getByCode("ZZ"), JamaicaRegions.NotFound);
		assertEquals(JamaicaRegions.getByCode(null), JamaicaRegions.NotFound);
		assertEquals(JamaicaRegions.getByCode("AA"), JamaicaRegions.NotFound);
		assertEquals(JamaicaRegions.getByCode("-1"), JamaicaRegions.NotFound);

		json = JamaicaRegions.PortlandParish.toJson();
		assertNotNull(json);

		json = JamaicaRegions.toJsonList();
		assertNotNull(json);
		
		// Mexico
		assertEquals(MexicoRegions.CiudadDeMexico.getCode(), "CMX");
		assertEquals(MexicoRegions.CiudadDeMexico.getName(), "Ciudad de México");
		assertEquals(MexicoRegions.getByCode(MexicoRegions.CiudadDeMexico.getCode()), MexicoRegions.CiudadDeMexico);
		assertEquals(MexicoRegions.getByCode("ZZ"), MexicoRegions.NotFound);
		assertEquals(MexicoRegions.getByCode(null), MexicoRegions.NotFound);
		assertEquals(MexicoRegions.getByCode("AA"), MexicoRegions.NotFound);
		assertEquals(MexicoRegions.getByCode("-1"), MexicoRegions.NotFound);

		json = MexicoRegions.CiudadDeMexico.toJson();
		assertNotNull(json);

		json = MexicoRegions.toJsonList();
		assertNotNull(json);

		// Nicaragua
		assertEquals(NicaraguaRegions.DepartamentoDeBoaco.getCode(), "BO");
		assertEquals(NicaraguaRegions.DepartamentoDeBoaco.getName(), "Departamento de Boaco");
		assertEquals(NicaraguaRegions.getByCode(NicaraguaRegions.DepartamentoDeBoaco.getCode()), NicaraguaRegions.DepartamentoDeBoaco);
		assertEquals(NicaraguaRegions.getByCode("ZZ"), NicaraguaRegions.NotFound);
		assertEquals(NicaraguaRegions.getByCode(null), NicaraguaRegions.NotFound);
		assertEquals(NicaraguaRegions.getByCode("AA"), NicaraguaRegions.NotFound);
		assertEquals(NicaraguaRegions.getByCode("-1"), NicaraguaRegions.NotFound);

		json = NicaraguaRegions.DepartamentoDeBoaco.toJson();
		assertNotNull(json);

		json = NicaraguaRegions.toJsonList();
		assertNotNull(json);

		// Panama
		assertEquals(PanamaRegions.Panama.getCode(), "8");
		assertEquals(PanamaRegions.Panama.getName(), "Panamá");
		assertEquals(PanamaRegions.getByCode(PanamaRegions.Panama.getCode()), PanamaRegions.Panama);
		assertEquals(PanamaRegions.getByCode("ZZ"), PanamaRegions.NotFound);
		assertEquals(PanamaRegions.getByCode(null), PanamaRegions.NotFound);
		assertEquals(PanamaRegions.getByCode("AA"), PanamaRegions.NotFound);
		assertEquals(PanamaRegions.getByCode("-1"), PanamaRegions.NotFound);

		json = PanamaRegions.Panama.toJson();
		assertNotNull(json);

		json = PanamaRegions.toJsonList();
		assertNotNull(json);

		// Paraguay
		assertEquals(ParaguayRegions.DistritoCapital.getCode(), "ASU");
		assertEquals(ParaguayRegions.DistritoCapital.getName(), "Distrito Capital");
		assertEquals(ParaguayRegions.getByCode(ParaguayRegions.DistritoCapital.getCode()), ParaguayRegions.DistritoCapital);
		assertEquals(ParaguayRegions.getByCode("ZZ"), ParaguayRegions.NotFound);
		assertEquals(ParaguayRegions.getByCode(null), ParaguayRegions.NotFound);
		assertEquals(ParaguayRegions.getByCode("AA"), ParaguayRegions.NotFound);
		assertEquals(ParaguayRegions.getByCode("-1"), ParaguayRegions.NotFound);

		json = ParaguayRegions.DistritoCapital.toJson();
		assertNotNull(json);

		json = ParaguayRegions.toJsonList();
		assertNotNull(json);

		// Peru
		assertEquals(PeruRegions.Lima.getCode(), "LIM");
		assertEquals(PeruRegions.Lima.getName(), "Lima");
		assertEquals(PeruRegions.getByCode(PeruRegions.Lima.getCode()), PeruRegions.Lima);
		assertEquals(PeruRegions.getByCode("ZZ"), PeruRegions.NotFound);
		assertEquals(PeruRegions.getByCode(null), PeruRegions.NotFound);
		assertEquals(PeruRegions.getByCode("AA"), PeruRegions.NotFound);
		assertEquals(PeruRegions.getByCode("-1"), PeruRegions.NotFound);

		json = PeruRegions.Lima.toJson();
		assertNotNull(json);

		json = PeruRegions.toJsonList();
		assertNotNull(json);

		// Saint Kitts And Nevis
		assertEquals(SaintKittsAndNevisRegions.Nevis.getCode(), "N");
		assertEquals(SaintKittsAndNevisRegions.Nevis.getName(), "Nevis");
		assertEquals(SaintKittsAndNevisRegions.getByCode(SaintKittsAndNevisRegions.Nevis.getCode())
				, SaintKittsAndNevisRegions.Nevis);
		assertEquals(SaintKittsAndNevisRegions.getByCode("ZZ"), SaintKittsAndNevisRegions.NotFound);
		assertEquals(SaintKittsAndNevisRegions.getByCode(null), SaintKittsAndNevisRegions.NotFound);
		assertEquals(SaintKittsAndNevisRegions.getByCode("AA"), SaintKittsAndNevisRegions.NotFound);
		assertEquals(SaintKittsAndNevisRegions.getByCode("-1"), SaintKittsAndNevisRegions.NotFound);

		json = SaintKittsAndNevisRegions.Nevis.toJson();
		assertNotNull(json);

		json = SaintKittsAndNevisRegions.toJsonList();
		assertNotNull(json);

		// Saint Lucia
		assertEquals(SaintLuciaRegions.AnseLaRayeQuarter.getCode(), "01");
		assertEquals(SaintLuciaRegions.AnseLaRayeQuarter.getName(), "Anse la Raye Quarter");
		assertEquals(SaintLuciaRegions.getByCode(SaintLuciaRegions.AnseLaRayeQuarter.getCode()), SaintLuciaRegions.AnseLaRayeQuarter);
		assertEquals(SaintLuciaRegions.getByCode("ZZ"), SaintLuciaRegions.NotFound);
		assertEquals(SaintLuciaRegions.getByCode(null), SaintLuciaRegions.NotFound);
		assertEquals(SaintLuciaRegions.getByCode("AA"), SaintLuciaRegions.NotFound);
		assertEquals(SaintLuciaRegions.getByCode("-1"), SaintLuciaRegions.NotFound);

		json = SaintLuciaRegions.AnseLaRayeQuarter.toJson();
		assertNotNull(json);

		json = SaintLuciaRegions.toJsonList();
		assertNotNull(json);

		// Saint Vincent And The Grenadines 
		assertEquals(SaintVincentAndTheGrenadinesRegions.ParroquiaDeCharlotte.getCode(), "01");
		assertEquals(SaintVincentAndTheGrenadinesRegions.ParroquiaDeCharlotte.getName(), "Parroquia de Charlotte");
		assertEquals(SaintVincentAndTheGrenadinesRegions.getByCode(SaintVincentAndTheGrenadinesRegions.ParroquiaDeCharlotte.getCode())
				, SaintVincentAndTheGrenadinesRegions.ParroquiaDeCharlotte);
		assertEquals(SaintVincentAndTheGrenadinesRegions.getByCode("ZZ"), SaintVincentAndTheGrenadinesRegions.NotFound);
		assertEquals(SaintVincentAndTheGrenadinesRegions.getByCode(null), SaintVincentAndTheGrenadinesRegions.NotFound);
		assertEquals(SaintVincentAndTheGrenadinesRegions.getByCode("AA"), SaintVincentAndTheGrenadinesRegions.NotFound);
		assertEquals(SaintVincentAndTheGrenadinesRegions.getByCode("-1"), SaintVincentAndTheGrenadinesRegions.NotFound);

		json = SaintVincentAndTheGrenadinesRegions.ParroquiaDeCharlotte.toJson();
		assertNotNull(json);

		json = SaintVincentAndTheGrenadinesRegions.toJsonList();
		assertNotNull(json);

		// Suriname
		assertEquals(SurinameRegions.BrokopondoDistrict.getCode(), "BR");
		assertEquals(SurinameRegions.BrokopondoDistrict.getName(), "Brokopondo District");
		assertEquals(SurinameRegions.getByCode(SurinameRegions.BrokopondoDistrict.getCode())
				, SurinameRegions.BrokopondoDistrict);
		assertEquals(SurinameRegions.getByCode("ZZ"), SurinameRegions.NotFound);
		assertEquals(SurinameRegions.getByCode(null), SurinameRegions.NotFound);
		assertEquals(SurinameRegions.getByCode("AA"), SurinameRegions.NotFound);
		assertEquals(SurinameRegions.getByCode("-1"), SurinameRegions.NotFound);

		json = SurinameRegions.BrokopondoDistrict.toJson();
		assertNotNull(json);

		json = SurinameRegions.toJsonList();
		assertNotNull(json);

		// Trinidad and Tobago
		assertEquals(TrinidadAndTobagoRegions.Tobago.getCode(), "TOB");
		assertEquals(TrinidadAndTobagoRegions.Tobago.getName(), "Tobago");
		assertEquals(TrinidadAndTobagoRegions.getByCode(TrinidadAndTobagoRegions.Tobago.getCode())
				, TrinidadAndTobagoRegions.Tobago);
		assertEquals(TrinidadAndTobagoRegions.getByCode("ZZ"), TrinidadAndTobagoRegions.NotFound);
		assertEquals(TrinidadAndTobagoRegions.getByCode(null), TrinidadAndTobagoRegions.NotFound);
		assertEquals(TrinidadAndTobagoRegions.getByCode("AA"), TrinidadAndTobagoRegions.NotFound);
		assertEquals(TrinidadAndTobagoRegions.getByCode("-1"), TrinidadAndTobagoRegions.NotFound);

		json = TrinidadAndTobagoRegions.Tobago.toJson();
		assertNotNull(json);

		json = TrinidadAndTobagoRegions.toJsonList();
		assertNotNull(json);

		// United States of America
		assertEquals(UnitedStatesOfAmericaRegions.Washington.getCode(), "WA");
		assertEquals(UnitedStatesOfAmericaRegions.Washington.getName(), "Washington");
		assertEquals(UnitedStatesOfAmericaRegions.getByCode(UnitedStatesOfAmericaRegions.Washington.getCode()), UnitedStatesOfAmericaRegions.Washington);
		assertEquals(UnitedStatesOfAmericaRegions.getByCode("ZZ"), UnitedStatesOfAmericaRegions.NotFound);
		assertEquals(UnitedStatesOfAmericaRegions.getByCode(null), UnitedStatesOfAmericaRegions.NotFound);
		assertEquals(UnitedStatesOfAmericaRegions.getByCode("AA"), UnitedStatesOfAmericaRegions.NotFound);
		assertEquals(UnitedStatesOfAmericaRegions.getByCode("-1"), UnitedStatesOfAmericaRegions.NotFound);

		json = UnitedStatesOfAmericaRegions.Washington.toJson();
		assertNotNull(json);

		json = UnitedStatesOfAmericaRegions.toJsonList();
		assertNotNull(json);

		// Uruguay
		assertEquals(UruguayRegions.DepartamentoDeMontevideo.getCode(), "MO");
		assertEquals(UruguayRegions.DepartamentoDeMontevideo.getName(), "Departamento de Montevideo");
		assertEquals(UruguayRegions.getByCode(UruguayRegions.DepartamentoDeMontevideo.getCode()), UruguayRegions.DepartamentoDeMontevideo);
		assertEquals(UruguayRegions.getByCode("ZZ"), UruguayRegions.NotFound);
		assertEquals(UruguayRegions.getByCode(null), UruguayRegions.NotFound);
		assertEquals(UruguayRegions.getByCode("AA"), UruguayRegions.NotFound);
		assertEquals(UruguayRegions.getByCode("-1"), UruguayRegions.NotFound);

		json = UruguayRegions.DepartamentoDeMontevideo.toJson();
		assertNotNull(json);

		json = UruguayRegions.toJsonList();
		assertNotNull(json);

		// Venezuela
		assertEquals(VenezuelaRegions.DistritoCapital.getCode(), "A");
		assertEquals(VenezuelaRegions.DistritoCapital.getName(), "Distrito Capital");
		assertEquals(VenezuelaRegions.getByCode(VenezuelaRegions.DistritoCapital.getCode()), VenezuelaRegions.DistritoCapital);
		assertEquals(VenezuelaRegions.getByCode("ZZ"), VenezuelaRegions.NotFound);
		assertEquals(VenezuelaRegions.getByCode(null), VenezuelaRegions.NotFound);
		assertEquals(VenezuelaRegions.getByCode("AA"), VenezuelaRegions.NotFound);
		assertEquals(VenezuelaRegions.getByCode("-1"), VenezuelaRegions.NotFound);

		json = VenezuelaRegions.DistritoCapital.toJson();
		assertNotNull(json);

		json = VenezuelaRegions.toJsonList();
		assertNotNull(json);
	}
}
