package com.sharedbox.common.phonetization;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sharedbox.common.utils.StringUtils;

/**
 * 
 * @author Rafael Costi [rafaelcosti@outlook.com]
 * @version 1.0.0
 * @since 07/05/2021
 */
class PhonetizerReplacements {
	/**
	 * 
	 * @param phrase
	 * @return
	 */
	public List<String> brWordsNumbers(String phrase) {
		List<String> words = new ArrayList<String>(Arrays.asList(phrase.split(" ")));
		Map<String, String> letterReplacements = getBrLetterReplacements();
		Map<String, String> numberReplacements = getBrNumberReplacements();
		
		replaces(words, letterReplacements);
		replaces(words, numberReplacements);
		
		int sum = 0;
		
		for (int i = 0; i < words.size(); i++) {
			if ("E".equals(words.get(i))) {
				words.remove(i);
				i--;
			} else {
				if ("MIL".equals(words.get(i))) {
					if (sum == 0) {
						sum = 1000;
					} else {
						sum = sum * 1000;
						words.remove(i);
						i--;
					}
				}  else {
					Integer value = null;
					
					try {
						value = Integer.parseInt(words.get(i).toString());
					} catch (NumberFormatException e) {
						
					}
					
					if (value != null) {
						if (sum != 0) {
							words.remove(i - 1);
							i--;
						}
						sum += value;
					}
					else {
						if (sum != 0) {
							words.set(i-1, "" + sum);
						}
						sum = 0;
					}
				}
			}
			words.set(i, StringUtils.removeEqualChars(words.get(i)));
		}
		
		if(sum != 0){
			words.set(words.size() - 1, "" + sum);
		}
		
		return words;
	}

	/**
	 * 
	 * @param words
	 * @param map
	 */
	public static void replaces(List<String> words, Map<String, String> map) {
		for(int i = 0; i < words.size(); i++){
			String rep = map.get(words.get(i));
			if(rep != null){
				words.set(i, rep);
			}
		}
	}
	
	/**
	 * 
	 */
	public static Map<String, String> getBrNumberReplacements() {
		Map<String, String> numberReplacements = new HashMap<String, String>();
		
		numberReplacements.put("ZERO","0000");
		numberReplacements.put("UM","0001"); 
		numberReplacements.put("HUM","0001");
		numberReplacements.put("DOIS","0002");
		numberReplacements.put("TRES","0003");
		numberReplacements.put("TREIS","0003");
		numberReplacements.put("TREZ","0003"); 
		numberReplacements.put("QUATRO","0004");
		numberReplacements.put("CINCO","0005");
		numberReplacements.put("SEIS","0006");
		numberReplacements.put("SETE","0007");
		numberReplacements.put("OITO","0008");
		numberReplacements.put("NOVE","0009");
		numberReplacements.put("DEZ","0010");
		numberReplacements.put("ONZE","0011");
		numberReplacements.put("DOZE","0012");
		numberReplacements.put("TREZE","0013"); 
		numberReplacements.put("CATORZE","0014");
		numberReplacements.put("QUATORZE","0014");
		numberReplacements.put("QUINZE","0015");
		numberReplacements.put("DEZESSEIS","0016");
		numberReplacements.put("DEZESSETE","0017"); 
		numberReplacements.put("DEZOITO","0018");
		numberReplacements.put("DEZENOVE","0019");
		numberReplacements.put("VINTE","0020");
		numberReplacements.put("TRINTA","0030");
		numberReplacements.put("QUARENTA","0040"); 
		numberReplacements.put("CINCOENTA","0050");
		numberReplacements.put("CINQUENTA","0050");
		numberReplacements.put("SESSENTA","0060");
		numberReplacements.put("SETENTA","0070");
		numberReplacements.put("OITENTA","0080");
		numberReplacements.put("NOVENTA","0090");
		numberReplacements.put("CEM","0100");
		numberReplacements.put("CENTO","0100");
		numberReplacements.put("DUZENTOS","0200");
		numberReplacements.put("TRESENTOS","0300");
		numberReplacements.put("TREZENTOS","0300"); 
		numberReplacements.put("QUATROCENTOS","0400");
		numberReplacements.put("QUINHENTOS","0500");
		numberReplacements.put("SEICENTOS","0600");
		numberReplacements.put("SEISENTOS","0600");
		numberReplacements.put("SEISCENTOS","0600");
		numberReplacements.put("SETECENTOS","0700");
		numberReplacements.put("OITOCENTOS","0800");
		numberReplacements.put("NOVECENTOS","0900");
		
		numberReplacements.put("I","0001"); 
		numberReplacements.put("II","0002");
		numberReplacements.put("III","0003");
		numberReplacements.put("IV","0004");
		numberReplacements.put("IX","0009"); 
		numberReplacements.put("V","0005"); 
		numberReplacements.put("VI","0006");
		numberReplacements.put("VII","0007"); 
		numberReplacements.put("VIII","0008");
		numberReplacements.put("X","0010"); 
		numberReplacements.put("XI","0011"); 
		numberReplacements.put("XII","0012"); 
		numberReplacements.put("XIII","0013"); 
		numberReplacements.put("XIV","0014");
		numberReplacements.put("XIX","0019");
		numberReplacements.put("XV","0015");
		numberReplacements.put("XVI","0016");
		numberReplacements.put("XVII","0017");
		numberReplacements.put("XVIII","0018");
		numberReplacements.put("XX","0020");
		numberReplacements.put("XXI","0021"); 
		numberReplacements.put("XXII","0022"); 
		numberReplacements.put("XXIII","0023"); 
		numberReplacements.put("XXIV","0024");
		numberReplacements.put("XXIX","0029"); 
		numberReplacements.put("XXV","0025");
		numberReplacements.put("XXVI","0026");
		numberReplacements.put("XXVII","0027");
		numberReplacements.put("XXVIII","0028");
		numberReplacements.put("XXX","0030"); 
		numberReplacements.put("XXXI","0031");
		
		return numberReplacements;
	}
	
	/**
	 * 
	 * @return
	 */
	private static Map<String, String> getBrLetterReplacements() {
		Map<String, String> letterReplacements = new HashMap<String, String>();
		letterReplacements.put("AGA","H");
		letterReplacements.put("BE","B");
		letterReplacements.put("CA","K");
		letterReplacements.put("CE","C");
		letterReplacements.put("DABLIU","W");
		letterReplacements.put("EFE","F");
		letterReplacements.put("ELE","L");
		letterReplacements.put("EME","M");
		letterReplacements.put("ENE","N");
		letterReplacements.put("ERRE","R");
		letterReplacements.put("ESSE","S");
		letterReplacements.put("GE","G");
		letterReplacements.put("IPSILOM","Y");
		letterReplacements.put("IPSILON","Y");
		letterReplacements.put("JOTA","J");
		letterReplacements.put("PE","P");
		letterReplacements.put("QUE","Q");
		letterReplacements.put("TE","T");
		letterReplacements.put("VE","V");
		letterReplacements.put("XIS","X");
		letterReplacements.put("ZE","Z");
		
		return letterReplacements;
		
	}
}
