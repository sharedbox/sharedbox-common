package com.sharedbox.common.phonetization;

import java.text.Normalizer;
import java.util.List;

import com.sharedbox.common.location.Languages;
import com.sharedbox.common.utils.StringUtils;

/**
 * This class phonetizer
 * 
 * @author Rafael Costi
 *
 */
public class Phonetizer {
	/**
	 * Execute Brazilian phoneticize by default
	 * @return
	 */
	public static String execute(String phrase) throws IllegalArgumentException {
		return execute(Languages.Pt, phrase);
	}

	/**
	 * 
	 * @param lang
	 * @param phrase
	 * @return
	 */
	public static String execute(Languages lang, String phrase) throws IllegalArgumentException {
		if (StringUtils.isEmpty(phrase)) {
			throw new IllegalArgumentException("Phoneticize error. The argument is null or empty");
		}
		
		if(lang == null) {
			lang = Languages.Pt;
		}

		phrase = phrase.toUpperCase();
		switch (lang) {
			case Pt: 
				phrase = phrase.replace("&", "E");
				break;
				
			default:
		}
		
		phrase = Normalizer.normalize(phrase, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
		phrase = StringUtils.removeSpecialCharacter(phrase).toUpperCase();

		if (lang == Languages.Pt) {
			return phoneticizePtBr(phrase);
		}

		return "";
	}

	/**
	 * 
	 * @param phrase
	 * @return
	 */
	private static String phoneticizePtBr(String phrase) {
		List<String> words = new PhonetizerReplacements().brWordsNumbers(phrase);

		char[] phonemeAux = new char[256];
		char[] phonemeWrk = new char[256];
		char[] phonemeCmp = new char[256];
		char[] phoneme = new char[256];

		int i, j, x, k = 0;
		int mutePhoneme, endPhoneme, copyPhoneme, copyMute = 0;

		for (int position = 0; position < words.size(); position++) {
			for (i = 0; i < 256; i++) {
				phonemeWrk[i] = ' ';
				phoneme[i] = ' ';
			}
			phonemeCmp = words.get(position).toCharArray();
			phonemeAux = phonemeCmp;
			j = 0;

			if (words.get(position).length() == 1) {
				phonemeWrk[0] = phonemeCmp[0];
			} else {
				for (i = 0; i < words.get(position).length(); i++) {
					if ((phonemeCmp[i] == 'E') || (phonemeCmp[i] == 'Y') ||
							(phonemeCmp[i] == 'I')) {
						phoneme[i] = 'i';
					} else if ((phonemeCmp[i] == 'O') || (phonemeCmp[i] == 'U')) {
						phoneme[i] = 'o';
					} else if (phonemeCmp[i] == 'A') {
						phoneme[i] = 'a';
					} else if (phonemeCmp[i] == 'S') {
						phoneme[i] = 's';
					} else {
						phoneme[i] = phonemeCmp[i];
					}
				}
				endPhoneme = 0;
				phonemeAux = phoneme;

				if (phonemeAux[3] == ' ') {
					if ((phonemeAux[0] == 'a') || (phonemeAux[0] == 'i') ||
							(phonemeAux[0] == 'o')) {
						endPhoneme = 0;
					} else if ((phonemeAux[1] == 'a') || (phonemeAux[1] == 'i') ||
							(phonemeAux[1] == 'o')) {
						endPhoneme = 0;
					} else if ((phonemeAux[2] == 'a') || (phonemeAux[2] == 'i') ||
							(phonemeAux[2] == 'o')) {
						endPhoneme = 0;
					} else {
						endPhoneme = 1;
						phonemeWrk[0] = phonemeAux[0];
						phonemeWrk[1] = phonemeAux[1];
						phonemeWrk[2] = phonemeAux[2];
					} 
				}

				if (endPhoneme != 1) { 
					for (i = 0; i < words.get(position).length(); i++) {
						copyPhoneme = 0;
						copyMute = 0;
						mutePhoneme = 0;
						switch (phonemeAux[i]) {
							case 'a': // se o caracter for a
								if ((phonemeAux[i + 1] == 's') || (phonemeAux[i + 1] == 'Z') ||
									(phonemeAux[i + 1] == 'M') || (phonemeAux[i + 1] == 'N')) {
									if (phonemeAux[i + 2] != ' ') {
										copyPhoneme = 1;
									} else {
										phonemeWrk[j] = 'a';
										phonemeWrk[j + 1] = ' ';
										j++;
										i++;
									} 
								} else {
									copyPhoneme = 1;
								}
								break;

							case 'B': 	
								copyMute = 1;
								break;

							case 'C': 
								x = 0;
								if (phonemeAux[i + 1] == 'i') {
									phonemeWrk[j] = 's';
									j++;
									break;
								} else if ((phonemeAux[i + 1] == 'o') && (phonemeAux[i + 2] == 'i') &&
									(phonemeAux[i + 3] == 's') && (phonemeAux[i + 4] == ' ')) {
									phonemeWrk[j] = 'K';
									phonemeWrk[j + 1] = 'a';
									phonemeWrk[j + 2] = 'o';
									i = i + 4;
									break;
								} else if (phonemeAux[i + 1] == 'T') {
									break;
								} else if (phonemeAux[i + 1] != 'H') {
									phonemeWrk[j] = 'K';
									mutePhoneme = 1;
									if (phonemeAux[i + 1] == 'K') {
										i++;
										break;
									} 
									else {
										break;
									}
								}  else if (phonemeAux[i + 1] == 'H') {
									if (phonemeAux[i + 2] == 'i') {
										if ((phonemeAux[i + 3] == 'a') || (phonemeAux[i + 3] == 'i') ||
												(phonemeAux[i + 3] == 'o')) {
											x = 1;
										} else if (phonemeAux[i + 3] == 'N') {
											if (phonemeAux[i + 4] == 'i') {
												if (phonemeAux[i + 5] == ' ') {
													x = 1;
												}
											}
										} else if (phonemeAux[i + 3] == 'T') {
											if (phonemeAux[i + 4] == 'i') {
												if (phonemeAux[i + 5] == ' ') {
													x = 1;
												}
											}
										}
									}
									
									if (x == 1) {
										phonemeWrk[j] = 'K';
										j++;
										i++;
										break;
									}  else if (j > 0) {
										if (phonemeWrk[j - 1] == 's') {
											j--;
										}
									}
								} 
								phonemeWrk[j] = 'X';
								mutePhoneme = 1;
								i++;
								break;

							case 'D': 
								x = 0;
								if (phonemeAux[i + 1] != 'o') {
									copyMute = 1;
									break;
								} else if (phonemeAux[i + 2] == 'R') {
									if (i != 0) {
										x = 1;
									} else {
										copyPhoneme = 1; 
									}
								} else {
									copyPhoneme = 1; 
								}

								if (x == 1) {
									if (phonemeAux[i + 3] == 'i') {
										if (phonemeAux[i + 4] == 's') {
											if (phonemeAux[i + 5] != ' ') {
												x = 0;
											} 
										} else {
											x = 0;
										}
									} else if (phonemeAux[i + 3] == 'a') {
										if (phonemeAux[i + 4] != ' ') {
											if (phonemeAux[i + 4] != 's') {
												x = 0;
											} else if (phonemeAux[i + 5] != ' ') {
												x = 0;
											} 
										} 
									} else {
										x = 0;
									}
								} else {
									x = 0;
								}

								if (x == 1) {
									phonemeWrk[j] = 'D';
									phonemeWrk[j + 1] = 'o';
									phonemeWrk[j + 2] = 'R';
									i = i + 5;
								}  else {
									copyPhoneme = 1;
								}
								break;

							case 'F': 
								copyMute = 1;
								break;

							case 'G': 
								if (phonemeAux[i + 1] == 'o') {
									if (phonemeAux[i + 2] == 'i') {
										phonemeWrk[j] = 'G';
										phonemeWrk[j + 1] = 'i';
										j += 2;
										i += 2;
									} else {
										copyMute = 1;
									}
								} else 	if (phonemeAux[i + 1] == 'L') {
									if (phonemeAux[i + 2] == 'i') {
										if ((phonemeAux[i + 3] == 'a') || (phonemeAux[i + 3] == 'i') ||
												(phonemeAux[i + 3] == 'o')) {
											phonemeWrk[j] = phonemeAux[i + 1];
											phonemeWrk[j + 1] = phonemeAux[i + 2];
											j += 2;
											i += 2;
										} else if (phonemeAux[i + 3] == 'N') {
											phonemeWrk[j] = phonemeAux[i + 1];
											phonemeWrk[j + 1] = phonemeAux[i + 2];
											j += 2;
											i += 2;
										} else {
											copyMute = 1;
										}
									} else {
										copyMute = 1;
									}
								} else if (phonemeAux[i + 1] == 'N') {
									if ((phonemeAux[i + 2] != 'a') && (phonemeAux[i + 2] != 'i') &&
											(phonemeAux[i + 2] != 'o')) {
										copyMute = 1;
									} else {
										phonemeWrk[j] = 'N';
										phonemeWrk[j + 1] = 'i';
										j += 2;
										i++;
									} 
								} else if (phonemeAux[i + 1] == 'H') {
									if (phonemeAux[i + 2] == 'i') {
										phonemeWrk[j] = 'G';
										phonemeWrk[j + 1] = 'i';
										j += 2;
										i += 2;
									} else {
										copyMute = 1;
									}
								} else {
									copyMute = 1;
								}
								break;

							case 'H':
								break;

							case 'i': 
								if (phonemeAux[i + 2] == ' ') {
									if (phonemeAux[i + 1] == 's') {
										phonemeWrk[j] = 'i';
										break;
									} else if (phonemeAux[i + 1] == 'Z') {
										phonemeWrk[j] = 'i';
										break;
									} 
								}

								if (phonemeAux[i + 1] != 'X') {
									copyPhoneme = 1;
								} else if (i != 0) {
									copyPhoneme = 1;
								} else if ((phonemeAux[i + 2] == 'a') || (phonemeAux[i + 2] == 'i') ||
										(phonemeAux[i + 2] == 'o')) {
									phonemeWrk[j] = 'i';
									phonemeWrk[j + 1] = 'Z';
									j += 2;
									i++;
									break;
								} else if ((phonemeAux[i + 2] == 'C') || (phonemeAux[i + 2] == 's')) {
									phonemeWrk[j] = 'i';
									j++;
									i++;
									break;
								} else {
									phonemeWrk[j] = 'i';
									phonemeWrk[j + 1] = 's';
									j += 2;
									i++;
									break;
								}
								break;
	
							case 'J': 
								phonemeWrk[j] = 'G';
								phonemeWrk[j + 1] = 'i';
								j += 2;
								break;
	
							case 'K': 
								if (phonemeAux[i + 1] != 'T') {
									copyMute = 1;
								}
								break;

							case 'L': 
								if ((phonemeAux[i + 1] == 'a') || (phonemeAux[i + 1] == 'i') ||
										(phonemeAux[i + 1] == 'o')) {
									copyPhoneme = 1;
								} else if (phonemeAux[i + 1] != 'H') {
									phonemeWrk[j] = 'o';
									j++;
									break;
								} else if ((phonemeAux[i + 2] != 'a') && (phonemeAux[i + 2] != 'i') &&
										(phonemeAux[i + 2] != 'o')) {
									copyPhoneme = 1;
								} else {
									phonemeWrk[j] = 'L';
									phonemeWrk[j + 1] = 'i';
									j += 2;
									i++;
									break;
								}
								break;

							case 'M':
								if (((phonemeAux[i + 1] != 'a') && (phonemeAux[i + 1] != 'i') &&
									(phonemeAux[i + 1] != 'o')) || (phonemeAux[i + 1] == ' ')) {
									phonemeWrk[j] = 'N';
									j++;
								} else {
									copyPhoneme = 1;
								}
								break;

							case 'N':
								if ((phonemeAux[i + 1] == 'G') && (phonemeAux[i + 2] == 'T')) {
									phonemeAux[i + 1] = 'N';
									copyPhoneme = 1;
								} else if (phonemeAux[i + 1] == 'H') {
									if ((phonemeAux[i + 2] != 'a') && (phonemeAux[i + 2] != 'i') &&
											(phonemeAux[i + 2] != 'o')) {
										copyPhoneme = 1;
									} else {
										phonemeWrk[j] = 'N';
										phonemeWrk[j + 1] = 'i';
										j += 2;
										i++;
									}
								} else {
									copyPhoneme = 1;
								}
								break;

							case 'o': 
								if ((phonemeAux[i + 1] == 's') || (phonemeAux[i + 1] == 'Z')) {
									if (phonemeAux[i + 2] == ' ') {
										phonemeWrk[j] = 'o';
										break;
									} else {
										copyPhoneme = 1;
									}
								} else {
									copyPhoneme = 1;
								}
								break;

							case 'P':
								if (phonemeAux[i + 1] == 'H') {
									phonemeWrk[j] = 'F';
									i++;
									mutePhoneme = 1;
								} else {
									copyMute = 1;
								}
								break;

							case 'Q': 
								if (phonemeAux[i + 1] == 'o') {
									if (phonemeAux[i + 2] == 'i') {
										phonemeWrk[j] = 'K';
										j++;
										i++;
										break;
									} 
								}
								phonemeWrk[j] = 'K';
								j++;
								break;

							case 'R': 
								copyPhoneme = 1;
								break;

							case 's':
								if (phonemeAux[i + 1] == ' ') {
									break;
								}

								if ((phonemeAux[i + 1] == 'a') || (phonemeAux[i + 1] == 'i') ||
										(phonemeAux[i + 1] == 'o')) {
									if (i == 0) {
										copyPhoneme = 1;
										break;
									} else if ((phonemeAux[i - 1] != 'a') && (phonemeAux[i - 1] != 'i') &&
											(phonemeAux[i - 1] != 'o')) {
										copyPhoneme = 1;
										break;
									} else if ((phonemeAux[i + 1] == 'o') && (phonemeAux[i + 2] == 'L') &&
											(phonemeAux[i + 3] == ' ')) {
										copyPhoneme = 1;
										break;
									} else {
										phonemeWrk[j] = 'Z';
										j++;
										break;
									} 
								}

								if (i == 0) {
									if (!((phonemeAux[i + 1] == 'C') && (phonemeAux[i + 2] == 'i'))) {
										if (phonemeAux[i + 1] != 'H') {
											if (!((phonemeAux[i + 1] == 'C') && (phonemeAux[i + 2] == 'H') &&
													((phonemeAux[i + 3] != 'a') && (phonemeAux[i + 3] != 'i') &&
															(phonemeAux[i + 3] != 'o')))) {
												phonemeWrk[j] = 'i';
												j++;
												copyPhoneme = 1;
												break;
											} 
										}
									}
								}

								if (phonemeAux[i + 1] == 'H') {
									phonemeWrk[j] = 'X';
									i++;
									mutePhoneme = 1;
									break;
								} 

								if (phonemeAux[i + 1] != 'C') {
									copyPhoneme = 1;
									break;
								} 
							
								if (phonemeAux[i + 2] == 'H') {
									phonemeWrk[j] = 'X';
									i += 2;
									mutePhoneme = 1;
									break;
								} 

								if (phonemeAux[i + 2] != 'i') {
									copyPhoneme = 1;
									break;
								}
							
								if (phonemeAux[i + 3] == ' ') {
									phonemeWrk[j] = 'X';
									phonemeWrk[j + 1] = 'i';
									i = i + 3;
									break;
								} 

								if ((phonemeAux[i + 3] == 'a') || (phonemeAux[i + 3] == 'i') ||
										(phonemeAux[i + 3] == 'o')) {
									phonemeWrk[j] = 'X';
									j++;
									i += 2;
									break;
								} 
								
								phonemeWrk[j] = 's';
								phonemeWrk[j + 1] = 'i';
								j += 2;
								i += 2;
								break;

							case 'T': 
								if (phonemeAux[i + 1] == 's') {
									break;
								} else if (phonemeAux[i + 1] == 'Z') {
									break;
								} else {
									copyMute = 1;
								}
								break;

							case 'V': 
							case 'W': 
								if ((phonemeAux[i + 1] == 'a') || (phonemeAux[i + 1] == 'i') ||
										(phonemeAux[i + 1] == 'o')) {
									if (i == 0) {
										phonemeWrk[j] = 'o';
										j++;
									} else {
										phonemeWrk[j] = 'V';
										mutePhoneme = 1;
									}
								} else {
									phonemeWrk[j] = 'V';
									mutePhoneme = 1;
								}
								break;

							case 'X': 
								copyMute = 1;
								break;

							case 'Y': 
								break;

							case 'Z': 
								if (phonemeAux[i + 1] == ' ') {
									break;
								} else if ((phonemeAux[i + 1] == 'a') || (phonemeAux[i + 1] == 'i') ||
										(phonemeAux[i + 1] == 'o')) {
									copyPhoneme = 1;
								} else {
									phonemeWrk[j] = 's';
									j++;
								} 
								break;

							default:
								phonemeWrk[j] = phonemeAux[i];
								j++;
								break;
						}

						if (copyPhoneme == 1) {
							phonemeWrk[j] = phonemeAux[i];
							j++;
						} 

						if (copyMute == 1) {
							phonemeWrk[j] = phonemeAux[i];
						}

						if ((copyMute == 1) || (mutePhoneme == 1)) {
							j++;
							k = 0;

							while (k == 0) {
								if (phonemeAux[i + 1] == ' ') {
									phonemeWrk[j] = 'i';
									k = 1;
								}  else if ((phonemeAux[i + 1] == 'a') || (phonemeAux[i + 1] == 'i') ||
										(phonemeAux[i + 1] == 'o')) {
									k = 1;
								} else if (phonemeWrk[j - 1] == 'X') {
									phonemeWrk[j] = 'i';
									j++;
									k = 1;
								} else if (phonemeAux[i + 1] == 'R') {
									k = 1;
								} else if (phonemeAux[i + 1] == 'L') {
									k = 1;
								} else if (phonemeAux[i + 1] != 'H') {
									phonemeWrk[j] = 'i';
									j++;
									k = 1;
								} else {
									i++;
								}
							}
						}
					}
				} 
			}

			for (i = 0; i < words.get(position).length() + 3; i++) {
				if (phonemeWrk[i] == 'i') {
					phonemeWrk[i] = 'I';
				} else if (phonemeWrk[i] == 'a') {
					phonemeWrk[i] = 'A';
				} else if (phonemeWrk[i] == 'o') {
					phonemeWrk[i] = 'U';
				} else if (phonemeWrk[i] == 's') {
					phonemeWrk[i] = 'S';
				} else if (phonemeWrk[i] == 'E') {
					phonemeWrk[i] = ' ';
				} else if (phonemeWrk[i] == 'Y') {
					phonemeWrk[i] = '_';
				}
			}
			words.set(position, String.copyValueOf(phonemeWrk));
			j = 0; // zera o contador
		}

		String response = StringUtils.EMPTY;
		for (i = 0; i < words.size(); i++) {
			if (i == 0) {
				response = words.get(i).trim();
			} else {
				response = response + " " + words.get(i).trim();
			}
		}

		return StringUtils.removeEqualChars(response.toUpperCase().trim());
	}
}
