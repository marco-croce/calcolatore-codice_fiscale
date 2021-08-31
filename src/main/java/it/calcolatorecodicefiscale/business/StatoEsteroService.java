package it.calcolatorecodicefiscale.business;

public class StatoEsteroService {

	private String codice;

	public StatoEsteroService() {

	}

	public String getCodice() {
		return this.codice;
	}

	public String codiceStatoEstero(String statoEstero) throws CodiceNotFoundException {

		switch (statoEstero) {

		case "Albania":
			codice = "Z100";
			break;
		case "Andorra":
			codice = "Z101";
			break;
		case "Austria":
			codice = "Z102";
			break;
		case "Belgio":
			codice = "Z103";
			break;
		case "Bulgaria":
			codice = "Z104";
			break;
		case "Città del Vaticano":
			codice = "Z106";
			break;
		case "Danimarca":
			codice = "Z107";
			break;
		case "Isole Faer Oer":
			codice = "Z108";
			break;
		case "Finlandia":
			codice = "Z109";
			break;
		case "Francia":
			codice = "Z110";
			break;
		case "Germania":
			codice = "Z112";
			break;
		case "Gibilterra":
			codice = "Z113";
			break;
		case "Regno Unito":
			codice = "Z114";
			break;
		case "Grecia":
			codice = "Z115";
			break;
		case "Irlanda":
			codice = "Z116";
			break;
		case "Islanda":
			codice = "Z117";
			break;
		case "Liechtenstein":
			codice = "Z119";
			break;
		case "Lussemburgo":
			codice = "Z120";
			break;
		case "Malta":
			codice = "Z121";
			break;
		case "Isola Di Man":
			codice = "Z122";
			break;
		case "Monaco":
			codice = "Z123";
			break;
		case "Isole Normanne":
			codice = "Z124";
			break;
		case "Isole Del Canale":
			codice = "Z124";
			break;
		case "Norvegia":
			codice = "Z125";
			break;
		case "Paesi Bassi":
			codice = "Z126";
			break;
		case "Polonia":
			codice = "Z127";
			break;
		case "Portogallo":
			codice = "Z128";
			break;
		case "Romania":
			codice = "Z129";
			break;
		case "San Marino":
			codice = "Z130";
			break;
		case "Spagna":
			codice = "Z131";
			break;
		case "Svezia":
			codice = "Z132";
			break;
		case "Svizzera":
			codice = "Z133";
			break;
		case "Ungheria":
			codice = "Z134";
			break;
		case "Ucraina":
			codice = "Z138";
			break;
		case "Bielorussia":
			codice = "Z139";
			break;
		case "Moldova":
			codice = "Z140";
			break;
		case "Estonia":
			codice = "Z144";
			break;
		case "Lettonia":
			codice = "Z145";
			break;
		case "Lituania":
			codice = "Z146";
			break;
		case "Macedonia Del Nord":
			codice = "Z148";
			break;
		case "Croazia":
			codice = "Z149";
			break;
		case "Slovenia":
			codice = "Z150";
			break;
		case "Bosnia-Erzegovina":
			codice = "Z153";
			break;
		case "Russia":
			codice = "Z154";
			break;
		case "Slovacchia":
			codice = "Z155";
			break;
		case "Repubblica Ceca":
			codice = "Z156";
			break;
		case "Serbia":
			codice = "Z158";
			break;
		case "Montenegro":
			codice = "Z159";
			break;
		case "Kosovo":
			codice = "Z160";
			break;
		case "Territori Dell'Autonomia Palestinese":
			codice = "Z161";
			break;
		case "Afghanistan":
			codice = "Z200";
			break;
		case "Arabia Saudita":
			codice = "Z203";
			break;
		case "Bahrein":
			codice = "Z204";
			break;
		case "Bhutan":
			codice = "Z205";
			break;
		case "Myanmar":
			codice = "Z206";
			break;
		case "Brunei":
			codice = "Z207";
			break;
		case "Cambogia":
			codice = "Z208";
			break;
		case "Sri":
			codice = "Z209";
			break;
		case "Cina":
			codice = "Z210";
			break;
		case "Cipro":
			codice = "Z211";
			break;
		case "Isole Cocos":
			codice = "Z212";
			break;
		case "Repubblica Di Corea":
			codice = "Z213";
			break;
		case "Repubblica Popolare Democratica Di Corea":
			codice = "Z214";
			break;
		case "Emirati Arabi Uniti":
			codice = "Z215";
			break;
		case "Filippine":
			codice = "Z216";
			break;
		case "Taiwan":
			codice = "Z217";
			break;
		case "Gaza":
			codice = "Z218";
			break;
		case "Giappone":
			codice = "Z219";
			break;
		case "Giordania":
			codice = "Z220";
			break;
		case "India":
			codice = "Z222";
			break;
		case "Indonesia":
			codice = "Z223";
			break;
		case "Iran":
			codice = "Z224";
			break;
		case "Iraq":
			codice = "Z225";
			break;
		case "Israele":
			codice = "Z226";
			break;
		case "Kuwait":
			codice = "Z227";
			break;
		case "Laos":
			codice = "Z228";
			break;
		case "Libano":
			codice = "Z229";
			break;
		case "Macao":
			codice = "Z231";
			break;
		case "Maldive":
			codice = "Z232";
			break;
		case "Mongolia":
			codice = "Z233";
			break;
		case "Nepal":
			codice = "Z234";
			break;
		case "Oman":
			codice = "Z235";
			break;
		case "Pakistan":
			codice = "Z236";
			break;
		case "Qatar":
			codice = "Z237";
			break;
		case "Siria":
			codice = "Z240";
			break;
		case "Thailandia":
			codice = "Z241";
			break;
		case "Timor Orientale":
			codice = "Z242";
			break;
		case "Turchia":
			codice = "Z243";
			break;
		case "Yemen":
			codice = "Z246";
			break;
		case "Malaysia":
			codice = "Z247";
			break;
		case "Singapore":
			codice = "Z248";
			break;
		case "Bangladesh":
			codice = "Z249";
			break;
		case "Vietnam":
			codice = "Z251";
			break;
		case "Armenia":
			codice = "Z252";
			break;
		case "Azerbaigian":
			codice = "Z253";
			break;
		case "Georgia":
			codice = "Z254";
			break;
		case "Kazakistan":
			codice = "Z255";
			break;
		case "Kirghizistan":
			codice = "Z256";
			break;
		case "Tagikistan":
			codice = "Z257";
			break;
		case "Turkmenistan":
			codice = "Z258";
			break;
		case "Uzbekistan":
			codice = "Z259";
			break;
		case "Namibia":
			codice = "Z300";
			break;
		case "Algeria":
			codice = "Z301";
			break;
		case "Angola":
			codice = "Z302";
			break;
		case "Burundi":
			codice = "Z305";
			break;
		case "Camerun":
			codice = "Z306";
			break;
		case "Capo Verde":
			codice = "Z307";
			break;
		case "Repubblica Centrafricana":
			codice = "Z308";
			break;
		case "Ciad":
			codice = "Z309";
			break;
		case "Comore":
			codice = "Z310";
			break;
		case "Congo":
			codice = "Z311";
			break;
		case "Repubblica Democratica Del Congo":
			codice = "Z312";
			break;
		case "Costa":
			codice = "Z313";
			break;
		case "Benin":
			codice = "Z314";
			break;
		case "Etiopia":
			codice = "Z315";
			break;
		case "Gabon":
			codice = "Z316";
			break;
		case "Gambia":
			codice = "Z317";
			break;
		case "Ghana":
			codice = "Z318";
			break;
		case "Guinea":
			codice = "Z319";
			break;
		case "Guinea Bissau":
			codice = "Z320";
			break;
		case "Guinea Equatoriale":
			codice = "Z321";
			break;
		case "Kenya":
			codice = "Z322";
			break;
		case "Riunione":
			codice = "Z324";
			break;
		case "Liberia":
			codice = "Z325";
			break;
		case "Libia":
			codice = "Z326";
			break;
		case "Madagascar":
			codice = "Z327";
			break;
		case "Malawi":
			codice = "Z328";
			break;
		case "Mali":
			codice = "Z329";
			break;
		case "Marocco":
			codice = "Z330";
			break;
		case "Mauritania":
			codice = "Z331";
			break;
		case "Mauritius":
			codice = "Z332";
			break;
		case "Mozambico":
			codice = "Z333";
			break;
		case "Niger":
			codice = "Z334";
			break;
		case "Nigeria":
			codice = "Z335";
			break;
		case "Egitto":
			codice = "Z336";
			break;
		case "Zimbabwe":
			codice = "Z337";
			break;
		case "Ruanda":
			codice = "Z338";
			break;
		case "Sant'Elena":
			codice = "Z340";
			break;
		case "Sao Tomè E Principe":
			codice = "Z341";
			break;
		case "Seychelles":
			codice = "Z342";
			break;
		case "Senegal":
			codice = "Z343";
			break;
		case "Sierra Leone":
			codice = "Z344";
			break;
		case "Somalia":
			codice = "Z345";
			break;
		case "Sudafrica":
			codice = "Z347";
			break;
		case "Sudan":
			codice = "Z348";
			break;
		case "Eswatini":
			codice = "Z349";
			break;
		case "Togo":
			codice = "Z351";
			break;
		case "Tunisia":
			codice = "Z352";
			break;
		case "Uganda":
			codice = "Z353";
			break;
		case "Burkina Faso":
			codice = "Z354";
			break;
		case "Zambia":
			codice = "Z355";
			break;
		case "Tanzania":
			codice = "Z357";
			break;
		case "Botswana":
			codice = "Z358";
			break;
		case "Lesotho":
			codice = "Z359";
			break;
		case "Mayotte":
			codice = "Z360";
			break;
		case "Gibuti":
			codice = "Z361";
			break;
		case "Eritrea":
			codice = "Z368";
			break;
		case "Bermuda":
			codice = "Z400";
			break;
		case "Canada":
			codice = "Z401";
			break;
		case "Groenlandia":
			codice = "Z402";
			break;
		case "Saint-Pierre E Miquelon":
			codice = "Z403";
			break;
		case "Stati Uniti D'America":
			codice = "Z404";
			break;
		case "Antille Olandesi":
			codice = "Z501";
			break;
		case "Bahamas":
			codice = "Z502";
			break;
		case "Costa Rica":
			codice = "Z503";
			break;
		case "Cuba":
			codice = "Z504";
			break;
		case "Repubblica Dominicana":
			codice = "Z505";
			break;
		case "El Salvador":
			codice = "Z506";
			break;
		case "Giamaica":
			codice = "Z507";
			break;
		case "Guadalupa":
			codice = "Z508";
			break;
		case "Guatemala":
			codice = "Z509";
			break;
		case "Haiti":
			codice = "Z510";
			break;
		case "Honduras":
			codice = "Z511";
			break;
		case "Belize":
			codice = "Z512";
			break;
		case "Martinica":
			codice = "Z513";
			break;
		case "Messico":
			codice = "Z514";
			break;
		case "Nicaragua":
			codice = "Z515";
			break;
		case "Panama":
			codice = "Z516";
			break;
		case "Zona Del Canale Di Panama":
			codice = "Z517";
			break;
		case "Puerto Rico":
			codice = "Z518";
			break;
		case "Isole Turks E Caicos":
			codice = "Z519";
			break;
		case "Isole Vergini Americane":
			codice = "Z520";
			break;
		case "Barbados":
			codice = "Z522";
			break;
		case "Grenada":
			codice = "Z524";
			break;
		case "Isole Vergini Britanniche":
			codice = "Z525";
			break;
		case "Dominica":
			codice = "Z526";
			break;
		case "Saint Lucia":
			codice = "Z527";
			break;
		case "Saint Vincent E Grenadine":
			codice = "Z528";
			break;
		case "Anguilla":
			codice = "Z529";
			break;
		case "Isole Cayman":
			codice = "Z530";
			break;
		case "Montserrat":
			codice = "Z531";
			break;
		case "Antigua E Barbuda":
			codice = "Z532";
			break;
		case "Saint Kitts E Nevis":
			codice = "Z533";
			break;
		case "Argentina":
			codice = "Z600";
			break;
		case "Bolivia":
			codice = "Z601";
			break;
		case "Brasile":
			codice = "Z602";
			break;
		case "Cile":
			codice = "Z603";
			break;
		case "Colombia":
			codice = "Z604";
			break;
		case "Ecuador":
			codice = "Z605";
			break;
		case "Guyana":
			codice = "Z606";
			break;
		case "Guyana Francese":
			codice = "Z607";
			break;
		case "Suriname":
			codice = "Z608";
			break;
		case "Isole Malvine":
			codice = "Z609";
			break;
		case "Isole Falkland":
			codice = "Z609";
			break;
		case "Paraguay":
			codice = "Z610";
			break;
		case "Perù":
			codice = "Z611";
			break;
		case "Trinidad E Tobago":
			codice = "Z612";
			break;
		case "Uruguay":
			codice = "Z613";
			break;
		case "Venezuela":
			codice = "Z614";
			break;
		case "Australia":
			codice = "Z700";
			break;
		case "Isola Christmas":
			codice = "Z702";
			break;
		case "Isole Cook":
			codice = "Z703";
			break;
		case "Figi":
			codice = "Z704";
			break;
		case "Isola Guam":
			codice = "Z706";
			break;
		case "Irian Occidentale":
			codice = "Z707";
			break;
		case "Isole Macquarie":
			codice = "Z708";
			break;
		case "Isole Marianne":
			codice = "Z710";
			break;
		case "Isole Marshall":
			codice = "Z711";
			break;
		case "Isole Midway":
			codice = "Z712";
			break;
		case "Nauru":
			codice = "Z713";
			break;
		case "Niue":
			codice = "Z714";
			break;
		case "Isole Norfolk":
			codice = "Z715";
			break;
		case "Nuova Caledonia":
			codice = "Z716";
			break;
		case "Nuova Zelanda":
			codice = "Z719";
			break;
		case "Isole Cilene":
			codice = "Z721";
			break;
		case "Isola Di Pasqua":
			codice = "Z721";
			break;
		case "Isola Sala Y Gomez":
			codice = "Z721";
			break;
		case "Isole Pitcairn":
			codice = "Z722";
			break;
		case "Polinesia Francese":
			codice = "Z723";
			break;
		case "Isole Salomone":
			codice = "Z724";
			break;
		case "Samoa Americane":
			codice = "Z725";
			break;
		case "Samoa":
			codice = "Z726";
			break;
		case "Tokelau":
			codice = "Z727";
			break;
		case "Tonga":
			codice = "Z728";
			break;
		case "Isole Wallis E Futuna":
			codice = "Z729";
			break;
		case "Papua Nuova Guinea":
			codice = "Z730";
			break;
		case "Kiribati":
			codice = "Z731";
			break;
		case "Tuvalu":
			codice = "Z732";
			break;
		case "Vanuatu":
			codice = "Z733";
			break;
		case "Palau":
			codice = "Z734";
			break;
		case "Stati Federati Di Micronesia":
			codice = "Z735";
			break;
		case "Dipendenze Canadesi":
			codice = "Z800";
			break;
		case "Dipendenze Norvegesi Artiche":
			codice = "Z801";
			break;
		case "Dipendenze Russe":
			codice = "Z802";
			break;
		case "Dipendenze Australiane":
			codice = "Z900";
			break;
		case "Dipendenze Britanniche":
			codice = "Z901";
			break;
		case "Dipendenze Francesi":
			codice = "Z902";
			break;
		case "Dipendenze Neozelandesi":
			codice = "Z903";
			break;
		case "Dipendenze Norvegesi Antartiche":
			codice = "Z904";
			break;
		case "Dipendenze Statunitensi":
			codice = "Z905";
			break;
		case "Dipendenze Sudafricane":
			codice = "Z906";
			break;
		case "Sud Sudan":
			codice = "Z907";
			break;

		}

		if (codice == null)
			throw new CodiceNotFoundException();

		return getCodice();

	}

}
