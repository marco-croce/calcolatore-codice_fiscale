package it.calcolatorecodicefiscale.business;

public class ComuneService {

	private String codice;

	public ComuneService() {

	}

	public String getCodice() {
		return codice;
	}

	public String codiceComune(String comune) throws CodiceNotFoundException {

		switch (comune.charAt(0)) {

		case 'A':
			codiciComuniA(comune);
		case 'B':
			codiciComuniB(comune);
		case 'C':
			codiciComuniC(comune);
		case 'D':
			codiciComuniD(comune);
		case 'E':
			codiciComuniE(comune);
		case 'F':
			codiciComuniF(comune);
		case 'G':
			codiciComuniG(comune);
		case 'H':
			codiciComuniH(comune);
		case 'I':
			codiciComuniI(comune);
		case 'J':
			codiciComuniJ(comune);
		case 'L':
			codiciComuniL(comune);
		case 'M':
			codiciComuniM(comune);
		case 'N':
			codiciComuniN(comune);
		case 'O':
			codiciComuniO(comune);
		case 'P':
			codiciComuniP(comune);
		case 'Q':
			codiciComuniQ(comune);
		case 'R':
			codiciComuniR(comune);
		case 'S':
			codiciComuniS(comune);
		case 'T':
			codiciComuniT(comune);
		case 'U':
			codiciComuniU(comune);
		case 'V':
			codiciComuniV(comune);
		case 'Z':
			codiciComuniZ(comune);

		}

		if (codice == null)
			throw new CodiceNotFoundException();

		return getCodice();

	}

	private void codiciComuniA(String comune) {

		switch (comune) {

		case "Abano Terme":
			codice = "A001";
			break;
		case "Abbadia Cerreto":
			codice = "A004";
			break;
		case "Abbadia Lariana":
			codice = "A005";
			break;
		case "Abbadia San Salvatore":
			codice = "A006";
			break;
		case "Abbasanta":
			codice = "A007";
			break;
		case "Abbateggio":
			codice = "A008";
			break;
		case "Abbiategrasso":
			codice = "A010";
			break;
		case "Abetone":
			codice = "A012";
			break;
		case "Abetone Cutigliano":
			codice = "M376";
			break;
		case "Abriola":
			codice = "A013";
			break;
		case "Acate":
			codice = "A014";
			break;
		case "Accadia":
			codice = "A015";
			break;
		case "Acceglio":
			codice = "A016";
			break;
		case "Accettura":
			codice = "A017";
			break;
		case "Acciano":
			codice = "A018";
			break;
		case "Accumoli":
			codice = "A019";
			break;
		case "Acerenza":
			codice = "A020";
			break;
		case "Acerno":
			codice = "A023";
			break;
		case "Acerra":
			codice = "A024";
			break;
		case "Aci Bonaccorsi":
			codice = "A025";
			break;
		case "Aci Castello":
			codice = "A026";
			break;
		case "Aci Catena":
			codice = "A027";
			break;
		case "Acireale":
			codice = "A028";
			break;
		case "Aci Sant'Antonio":
			codice = "A029";
			break;
		case "Acquacanina":
			codice = "A031";
			break;
		case "Acquafondata":
			codice = "A032";
			break;
		case "Acquaformosa":
			codice = "A033";
			break;
		case "Acquafredda":
			codice = "A034";
			break;
		case "Acqualagna":
			codice = "A035";
			break;
		case "Acquanegra Sul Chiese":
			codice = "A038";
			break;
		case "Acquanegra Cremonese":
			codice = "A039";
			break;
		case "Acquapendente":
			codice = "A040";
			break;
		case "Acquappesa":
			codice = "A041";
			break;
		case "Acquarica Del Capo":
			codice = "A042";
			break;
		case "Acquaro":
			codice = "A043";
			break;
		case "Acquasanta Terme":
			codice = "A044";
			break;
		case "Acquasparta":
			codice = "A045";
			break;
		case "Acquaviva Picena":
			codice = "A047";
			break;
		case "Acquaviva Delle Fonti":
			codice = "A048";
			break;
		case "Acquaviva Platani":
			codice = "A049";
			break;
		case "Acquaviva Collecroce":
			codice = "A050";
			break;
		case "Acquaviva D'Isernia":
			codice = "A051";
			break;
		case "Acquedolci":
			codice = "M211";
			break;
		case "Acqui Terme":
			codice = "A052";
			break;
		case "Acri":
			codice = "A053";
			break;
		case "Acuto":
			codice = "A054";
			break;
		case "Adelfia":
			codice = "A055";
			break;
		case "Adrano":
			codice = "A056";
			break;
		case "Adrara San Martino":
			codice = "A057";
			break;
		case "Adrara San Rocco":
			codice = "A058";
			break;
		case "Adria":
			codice = "A059";
			break;
		case "Adro":
			codice = "A060";
			break;
		case "Affi":
			codice = "A061";
			break;
		case "Affile":
			codice = "A062";
			break;
		case "Afragola":
			codice = "A064";
			break;
		case "Africo":
			codice = "A065";
			break;
		case "Agazzano":
			codice = "A067";
			break;
		case "Agerola":
			codice = "A068";
			break;
		case "Aggius":
			codice = "A069";
			break;
		case "Agira":
			codice = "A070";
			break;
		case "Agliana":
			codice = "A071";
			break;
		case "Agliano Terme":
			codice = "A072";
			break;
		case "Aglié":
			codice = "A074";
			break;
		case "Aglientu":
			codice = "H848";
			break;
		case "Agna":
			codice = "A075";
			break;
		case "Agnadello":
			codice = "A076";
			break;
		case "Agnana Calabra":
			codice = "A077";
			break;
		case "Agnone":
			codice = "A080";
			break;
		case "Agnosine":
			codice = "A082";
			break;
		case "Agordo":
			codice = "A083";
			break;
		case "Agosta":
			codice = "A084";
			break;
		case "Agra":
			codice = "A085";
			break;
		case "Agrate Brianza":
			codice = "A087";
			break;
		case "Agrate Conturbia":
			codice = "A088";
			break;
		case "Agrigento":
			codice = "A089";
			break;
		case "Agropoli":
			codice = "A091";
			break;
		case "Agugliano":
			codice = "A092";
			break;
		case "Agugliaro":
			codice = "A093";
			break;
		case "Aicurzio":
			codice = "A096";
			break;
		case "Aidomaggiore":
			codice = "A097";
			break;
		case "Aidone":
			codice = "A098";
			break;
		case "Aielli":
			codice = "A100";
			break;
		case "Aiello Del Sabato":
			codice = "A101";
			break;
		case "Aiello Calabro":
			codice = "A102";
			break;
		case "Aiello Del Friuli":
			codice = "A103";
			break;
		case "Aieta":
			codice = "A105";
			break;
		case "Ailano":
			codice = "A106";
			break;
		case "Ailoche":
			codice = "A107";
			break;
		case "Airasca":
			codice = "A109";
			break;
		case "Airola":
			codice = "A110";
			break;
		case "Airole":
			codice = "A111";
			break;
		case "Airuno":
			codice = "A112";
			break;
		case "Aisone":
			codice = "A113";
			break;
		case "Ala":
			codice = "A116";
			break;
		case "Alà Dei Sardi":
			codice = "A115";
			break;
		case "Ala Di Stura":
			codice = "A117";
			break;
		case "Alagna":
			codice = "A118";
			break;
		case "Alagna Valsesia":
			codice = "A119";
			break;
		case "Alanno":
			codice = "A120";
			break;
		case "Alano Di Piave":
			codice = "A121";
			break;
		case "Alassio":
			codice = "A122";
			break;
		case "Alatri":
			codice = "A123";
			break;
		case "Alba":
			codice = "A124";
			break;
		case "Alba Adriatica":
			codice = "A125";
			break;
		case "Albagiara":
			codice = "A126";
			break;
		case "Albairate":
			codice = "A127";
			break;
		case "Albanella":
			codice = "A128";
			break;
		case "Albano Sant'Alessandro":
			codice = "A129";
			break;
		case "Albano Vercellese":
			codice = "A130";
			break;
		case "Albano Di Lucania":
			codice = "A131";
			break;
		case "Albano Laziale":
			codice = "A132";
			break;
		case "Albaredo Arnaboldi":
			codice = "A134";
			break;
		case "Albaredo Per San Marco":
			codice = "A135";
			break;
		case "Albaredo D'Adige":
			codice = "A137";
			break;
		case "Albareto":
			codice = "A138";
			break;
		case "Albaretto Della Torre":
			codice = "A139";
			break;
		case "Albavilla":
			codice = "A143";
			break;
		case "Albenga":
			codice = "A145";
			break;
		case "Albera Ligure":
			codice = "A146";
			break;
		case "Alberobello":
			codice = "A149";
			break;
		case "Alberona":
			codice = "A150";
			break;
		case "Albese Con Cassano":
			codice = "A153";
			break;
		case "Albettone":
			codice = "A154";
			break;
		case "Albi":
			codice = "A155";
			break;
		case "Albiano D'Ivrea":
			codice = "A157";
			break;
		case "Albiano":
			codice = "A158";
			break;
		case "Albiate":
			codice = "A159";
			break;
		case "Albidona":
			codice = "A160";
			break;
		case "Albignasego":
			codice = "A161";
			break;
		case "Albinea":
			codice = "A162";
			break;
		case "Albino":
			codice = "A163";
			break;
		case "Albiolo":
			codice = "A164";
			break;
		case "Albissola Marina":
			codice = "A165";
			break;
		case "Albisola Superiore":
			codice = "A166";
			break;
		case "Albizzate":
			codice = "A167";
			break;
		case "Albonese":
			codice = "A171";
			break;
		case "Albosaggia":
			codice = "A172";
			break;
		case "Albugnano":
			codice = "A173";
			break;
		case "Albuzzano":
			codice = "A175";
			break;
		case "Alcamo":
			codice = "A176";
			break;
		case "Alcara Li Fusi":
			codice = "A177";
			break;
		case "Aldeno":
			codice = "A178";
			break;
		case "Aldino":
			codice = "A179";
			break;
		case "Ales":
			codice = "A180";
			break;
		case "Alessandria Della Rocca":
			codice = "A181";
			break;
		case "Alessandria":
			codice = "A182";
			break;
		case "Alessandria Del Carretto":
			codice = "A183";
			break;
		case "Alessano":
			codice = "A184";
			break;
		case "Alezio":
			codice = "A185";
			break;
		case "Alfano":
			codice = "A186";
			break;
		case "Alfedena":
			codice = "A187";
			break;
		case "Alfianello":
			codice = "A188";
			break;
		case "Alfiano Natta":
			codice = "A189";
			break;
		case "Alfonsine":
			codice = "A191";
			break;
		case "Alghero":
			codice = "A192";
			break;
		case "Algua":
			codice = "A193";
			break;
		case "Alì":
			codice = "A194";
			break;
		case "Alia":
			codice = "A195";
			break;
		case "Aliano":
			codice = "A196";
			break;
		case "Alice Bel Colle":
			codice = "A197";
			break;
		case "Alice Castello":
			codice = "A198";
			break;
		case "Alice Superiore":
			codice = "A199";
			break;
		case "Alife":
			codice = "A200";
			break;
		case "Alì Terme":
			codice = "A201";
			break;
		case "Alimena":
			codice = "A202";
			break;
		case "Aliminusa":
			codice = "A203";
			break;
		case "Allai":
			codice = "A204";
			break;
		case "Allein":
			codice = "A205";
			break;
		case "Alleghe":
			codice = "A206";
			break;
		case "Allerona":
			codice = "A207";
			break;
		case "Alliste":
			codice = "A208";
			break;
		case "Allumiere":
			codice = "A210";
			break;
		case "Alluvioni Cambiò":
			codice = "A211";
			break;
		case "Alluvioni Piovera":
			codice = "M397";
			break;
		case "Almè":
			codice = "A214";
			break;
		case "Almenno San Bartolomeo":
			codice = "A216";
			break;
		case "Almenno San Salvatore":
			codice = "A217";
			break;
		case "Almese":
			codice = "A218";
			break;
		case "Alonte":
			codice = "A220";
			break;
		case "Alpago":
			codice = "M375";
			break;
		case "Alpette":
			codice = "A221";
			break;
		case "Alpignano":
			codice = "A222";
			break;
		case "Alseno":
			codice = "A223";
			break;
		case "Alserio":
			codice = "A224";
			break;
		case "Altamura":
			codice = "A225";
			break;
		case "Altare":
			codice = "A226";
			break;
		case "Altavilla Monferrato":
			codice = "A227";
			break;
		case "Altavilla Irpina":
			codice = "A228";
			break;
		case "Altavilla Milicia":
			codice = "A229";
			break;
		case "Altavilla Silentina":
			codice = "A230";
			break;
		case "Altavilla Vicentina":
			codice = "A231";
			break;
		case "Altidona":
			codice = "A233";
			break;
		case "Altilia":
			codice = "A234";
			break;
		case "Altino":
			codice = "A235";
			break;
		case "Altissimo":
			codice = "236";
			break;
		case "Altivole":
			codice = "A237";
			break;
		case "Alto":
			codice = "A238";
			break;
		case "Alto Reno Terme":
			codice = "M369";
			break;
		case "Alto Sermenza":
			codice = "M389";
			break;
		case "Altofonte":
			codice = "A239";
			break;
		case "Altomonte":
			codice = "A240";
			break;
		case "Altopascio":
			codice = "A241";
			break;
		case "Altopiano Della Vigolana":
			codice = "M350";
			break;
		case "Alviano":
			codice = "A242";
			break;
		case "Alvignano":
			codice = "A243";
			break;
		case "Alvito":
			codice = "A244";
			break;
		case "Alzano Scrivia":
			codice = "A245";
			break;
		case "Alzano Lombardo":
			codice = "A246";
			break;
		case "Alzate Brianza":
			codice = "A249";
			break;
		case "Amalfi":
			codice = "A251";
			break;
		case "Amandola":
			codice = "A252";
			break;
		case "Amantea":
			codice = "A253";
			break;
		case "Amaro":
			codice = "A254";
			break;
		case "Amaroni":
			codice = "A255";
			break;
		case "Amaseno":
			codice = "A256";
			break;
		case "Amato":
			codice = "A257";
			break;
		case "Amatrice":
			codice = "A258";
			break;
		case "Ambivere":
			codice = "A259";
			break;
		case "Amblar":
			codice = "A260";
			break;
		case "Amblar-Don":
			codice = "M351";
			break;
		case "Ameglia":
			codice = "A261";
			break;
		case "Amelia":
			codice = "A262";
			break;
		case "Amendolara":
			codice = "A263";
			break;
		case "Ameno":
			codice = "A264";
			break;
		case "Amorosi":
			codice = "A265";
			break;
		case "Cortina D'Ampezzo":
			codice = "A266";
			break;
		case "Ampezzo":
			codice = "A267";
			break;
		case "Anacapri":
			codice = "A268";
			break;
		case "Anagni":
			codice = "A269";
			break;
		case "Ancarano":
			codice = "A270";
			break;
		case "Ancona":
			codice = "A271";
			break;
		case "Andali":
			codice = "A272";
			break;
		case "Andalo Valtellino":
			codice = "A273";
			break;
		case "Andalo":
			codice = "A274";
			break;
		case "Andezeno":
			codice = "A275";
			break;
		case "Andora":
			codice = "A278";
			break;
		case "Andorno Micca":
			codice = "A280";
			break;
		case "Andrano":
			codice = "A281";
			break;
		case "Andrate":
			codice = "A282";
			break;
		case "Andreis":
			codice = "A283";
			break;
		case "Andretta":
			codice = "A284";
			break;
		case "Andria":
			codice = "A285";
			break;
		case "Andriano":
			codice = "A286";
			break;
		case "Anela":
			codice = "A287";
			break;
		case "Anfo":
			codice = "A288";
			break;
		case "Angera":
			codice = "A290";
			break;
		case "Anghiari":
			codice = "A291";
			break;
		case "Angiari":
			codice = "A292";
			break;
		case "Angolo Terme":
			codice = "A293";
			break;
		case "Angri":
			codice = "A294";
			break;
		case "Angrogna":
			codice = "A295";
			break;
		case "Anguillara Veneta":
			codice = "A296";
			break;
		case "Anguillara Sabazia":
			codice = "A297";
			break;
		case "Annicco":
			codice = "A299";
			break;
		case "Annone Di Brianza":
			codice = "A301";
			break;
		case "Annone Veneto":
			codice = "A302";
			break;
		case "Anoia":
			codice = "A303";
			break;
		case "Antegnate":
			codice = "A304";
			break;
		case "Antey-Saint-André":
			codice = "A305";
			break;
		case "Anterivo":
			codice = "A306";
			break;
		case "Anticoli Corrado":
			codice = "A309";
			break;
		case "Antignano":
			codice = "A312";
			break;
		case "Antillo":
			codice = "A313";
			break;
		case "Antonimina":
			codice = "A314";
			break;
		case "Antrodoco":
			codice = "A315";
			break;
		case "Antrona Schieranco":
			codice = "A317";
			break;
		case "Anversa Degli Abruzzi":
			codice = "A318";
			break;
		case "Anzano Del Parco":
			codice = "A319";
			break;
		case "Anzano Di Puglia":
			codice = "A320";
			break;
		case "Anzi":
			codice = "A321";
			break;
		case "Anzio":
			codice = "A323";
			break;
		case "Anzola Dell'Emilia":
			codice = "A324";
			break;
		case "Anzola D'Ossola":
			codice = "A325";
			break;
		case "Aosta":
			codice = "A326";
			break;
		case "Apecchio":
			codice = "A327";
			break;
		case "Apice":
			codice = "A328";
			break;
		case "Apiro":
			codice = "A329";
			break;
		case "Apollosa":
			codice = "A330";
			break;
		case "Appiano Sulla Strada Del Vino":
			codice = "A332";
			break;
		case "Appiano Gentile":
			codice = "A333";
			break;
		case "Appignano":
			codice = "A334";
			break;
		case "Appignano Del Tronto":
			codice = "A335";
			break;
		case "Aprica":
			codice = "A337";
			break;
		case "Apricale":
			codice = "A338";
			break;
		case "Apricena":
			codice = "A339";
			break;
		case "Aprigliano":
			codice = "A340";
			break;
		case "Aprilia":
			codice = "A341";
			break;
		case "Aquara":
			codice = "A343";
			break;
		case "Aquila D'Arroscia":
			codice = "A344";
			break;
		case "Aquileia":
			codice = "A346";
			break;
		case "Aquilonia":
			codice = "A347";
			break;
		case "Aquino":
			codice = "A348";
			break;
		case "Aradeo":
			codice = "A350";
			break;
		case "Aragona":
			codice = "A351";
			break;
		case "Aramengo":
			codice = "A352";
			break;
		case "Arba":
			codice = "A354";
			break;
		case "Arborea":
			codice = "A357";
			break;
		case "Arborio":
			codice = "A358";
			break;
		case "Arbus":
			codice = "A359";
			break;
		case "Arcade":
			codice = "A360";
			break;
		case "Arce":
			codice = "A363";
			break;
		case "Arcene":
			codice = "A365";
			break;
		case "Arcevia":
			codice = "A366";
			break;
		case "Archi":
			codice = "A367";
			break;
		case "Arcidosso":
			codice = "A369";
			break;
		case "Arcinazzo Romano":
			codice = "A370";
			break;
		case "Arcisate":
			codice = "A371";
			break;
		case "Arco":
			codice = "A372";
			break;
		case "Arcola":
			codice = "A373";
			break;
		case "Arcole":
			codice = "A374";
			break;
		case "Arconate":
			codice = "A375";
			break;
		case "Arcore":
			codice = "A376";
			break;
		case "Arcugnano":
			codice = "A377";
			break;
		case "Ardara":
			codice = "A379";
			break;
		case "Ardauli":
			codice = "A380";
			break;
		case "Ardea":
			codice = "M213";
			break;
		case "Ardenno":
			codice = "A382";
			break;
		case "Ardesio":
			codice = "A383";
			break;
		case "Ardore":
			codice = "A385";
			break;
		case "Arena":
			codice = "A386";
			break;
		case "Arena Po":
			codice = "A387";
			break;
		case "Arenzano":
			codice = "A388";
			break;
		case "Arese":
			codice = "A389";
			break;
		case "Arezzo":
			codice = "A390";
			break;
		case "Argegno":
			codice = "A391";
			break;
		case "Argelato":
			codice = "A392";
			break;
		case "Argenta":
			codice = "A393";
			break;
		case "Argentera":
			codice = "A394";
			break;
		case "Arguello":
			codice = "A396";
			break;
		case "Argusto":
			codice = "A397";
			break;
		case "Ari":
			codice = "A398";
			break;
		case "Ariano Irpino":
			codice = "A399";
			break;
		case "Ariano Nel Polesine":
			codice = "A400";
			break;
		case "Ariccia":
			codice = "A401";
			break;
		case "Arielli":
			codice = "A402";
			break;
		case "Arienzo":
			codice = "A403";
			break;
		case "Arignano":
			codice = "A405";
			break;
		case "Aritzo":
			codice = "A407";
			break;
		case "Arizzano":
			codice = "A409";
			break;
		case "Arlena Di Castro":
			codice = "A412";
			break;
		case "Arluno":
			codice = "A413";
			break;
		case "Armeno":
			codice = "A414";
			break;
		case "Armento":
			codice = "A415";
			break;
		case "Armo":
			codice = "A418";
			break;
		case "Armungia":
			codice = "A419";
			break;
		case "Arnara":
			codice = "A421";
			break;
		case "Arnasco":
			codice = "A422";
			break;
		case "Arnad":
			codice = "A424";
			break;
		case "Arnesano":
			codice = "A425";
			break;
		case "Arola":
			codice = "A427";
			break;
		case "Arona":
			codice = "A429";
			break;
		case "Arosio":
			codice = "A430";
			break;
		case "Arpaia":
			codice = "A431";
			break;
		case "Arpaise":
			codice = "A432";
			break;
		case "Arpino":
			codice = "A433";
			break;
		case "Arquà Petrarca":
			codice = "A434";
			break;
		case "Arquà Polesine":
			codice = "A435";
			break;
		case "Arquata Scrivia":
			codice = "A436";
			break;
		case "Arquata Del Tronto":
			codice = "A437";
			break;
		case "Arre":
			codice = "A438";
			break;
		case "Arrone":
			codice = "A439";
			break;
		case "Arzago D'Adda":
			codice = "A440";
			break;
		case "Arsago Seprio":
			codice = "A441";
			break;
		case "Arsiè":
			codice = "A443";
			break;
		case "Arsiero":
			codice = "A444";
			break;
		case "Arsita":
			codice = "A445";
			break;
		case "Arsoli":
			codice = "A446";
			break;
		case "Arta Terme":
			codice = "A447";
			break;
		case "Artegna":
			codice = "A448";
			break;
		case "Artena":
			codice = "A449";
			break;
		case "Artogne":
			codice = "A451";
			break;
		case "Arvier":
			codice = "A452";
			break;
		case "Arzachena":
			codice = "A453";
			break;
		case "Arzana":
			codice = "A454";
			break;
		case "Arzano":
			codice = "A455";
			break;
		case "Arzene":
			codice = "A456";
			break;
		case "Arzergrande":
			codice = "A458";
			break;
		case "Arzignano":
			codice = "A459";
			break;
		case "Ascea":
			codice = "A460";
			break;
		case "Asciano":
			codice = "A461";
			break;
		case "Ascoli Piceno":
			codice = "A462";
			break;
		case "Ascoli Satriano":
			codice = "A463";
			break;
		case "Ascrea":
			codice = "A464";
			break;
		case "Asiago":
			codice = "A465";
			break;
		case "Asigliano Vercellese":
			codice = "A466";
			break;
		case "Asigliano Veneto":
			codice = "A467";
			break;
		case "Asola":
			codice = "A470";
			break;
		case "Asolo":
			codice = "A471";
			break;
		case "Assago":
			codice = "A473";
			break;
		case "Assemini":
			codice = "A474";
			break;
		case "Assisi":
			codice = "A475";
			break;
		case "Asso":
			codice = "A476";
			break;
		case "Assolo":
			codice = "A477";
			break;
		case "Assoro":
			codice = "A478";
			break;
		case "Asti":
			codice = "A479";
			break;
		case "Asuni":
			codice = "A480";
			break;
		case "Ateleta":
			codice = "A481";
			break;
		case "Atella":
			codice = "A482";
			break;
		case "Atena Lucana":
			codice = "A484";
			break;
		case "Atessa":
			codice = "A485";
			break;
		case "Atina":
			codice = "A486";
			break;
		case "Atrani":
			codice = "A487";
			break;
		case "Atri":
			codice = "A488";
			break;
		case "Atripalda":
			codice = "A489";
			break;
		case "Attigliano":
			codice = "A490";
			break;
		case "Attimis":
			codice = "A491";
			break;
		case "Atzara":
			codice = "A492";
			break;
		case "Auditore":
			codice = "A493";
			break;
		case "Augusta":
			codice = "A494";
			break;
		case "Auletta":
			codice = "A495";
			break;
		case "Aulla":
			codice = "A496";
			break;
		case "Aurano":
			codice = "A497";
			break;
		case "Aurigo":
			codice = "A499";
			break;
		case "Auronzo Di Cadore":
			codice = "A501";
			break;
		case "Ausonia":
			codice = "A502";
			break;
		case "Austis":
			codice = "A503";
			break;
		case "Avegno":
			codice = "A506";
			break;
		case "Avelengo":
			codice = "A507";
			break;
		case "Avella":
			codice = "A508";
			break;
		case "Avellino":
			codice = "A509";
			break;
		case "Averara":
			codice = "A511";
			break;
		case "Aversa":
			codice = "A512";
			break;
		case "Avetrana":
			codice = "A514";
			break;
		case "Avezzano":
			codice = "A515";
			break;
		case "Aviano":
			codice = "A516";
			break;
		case "Aviatico":
			codice = "A517";
			break;
		case "Avigliana":
			codice = "A518";
			break;
		case "Avigliano":
			codice = "A519";
			break;
		case "Avigliano Umbro":
			codice = "M258";
			break;
		case "Avio":
			codice = "A520";
			break;
		case "Avise":
			codice = "A521";
			break;
		case "Avola":
			codice = "A522";
			break;
		case "Avolasca":
			codice = "A523";
			break;
		case "Azeglio":
			codice = "A525";
			break;
		case "Ayas":
			codice = "A094";
			break;
		case "Aymavilles":
			codice = "A108";
			break;
		case "Azzanello":
			codice = "A526";
			break;
		case "Azzano D'Asti":
			codice = "A527";
			break;
		case "Azzano San Paolo":
			codice = "A528";
			break;
		case "Azzano Mella":
			codice = "A529";
			break;
		case "Azzano Decimo":
			codice = "A530";
			break;
		case "Azzate":
			codice = "A531";
			break;
		case "Azzio":
			codice = "A532";
			break;
		case "Azzone":
			codice = "A533";
			break;
		}

	}

	private void codiciComuniB(String comune) {

		switch (comune) {
		case "Baceno":
			codice = "A534";
			break;
		case "Bacoli":
			codice = "A535";
			break;
		case "Badalucco":
			codice = "A536";
			break;
		case "Badesi":
			codice = "M214";
			break;
		case "Badia":
			codice = "A537";
			break;
		case "Badia Pavese":
			codice = "A538";
			break;
		case "Badia Polesine":
			codice = "A539";
			break;
		case "Badia Calavena":
			codice = "A540";
			break;
		case "Badia Tedalda":
			codice = "A541";
			break;
		case "Badolato":
			codice = "A542";
			break;
		case "Bagaladi":
			codice = "A544";
			break;
		case "Bagheria":
			codice = "A546";
			break;
		case "Bagnacavallo":
			codice = "A547";
			break;
		case "Bagnaria":
			codice = "A550";
			break;
		case "Bagnara Di Romagna":
			codice = "A551";
			break;
		case "Bagnara Calabra":
			codice = "A552";
			break;
		case "Bagnaria Arsa":
			codice = "A553";
			break;
		case "Bagnasco":
			codice = "A555";
			break;
		case "Bagnatica":
			codice = "A557";
			break;
		case "Bagni Di Lucca":
			codice = "A560";
			break;
		case "Bagno A Ripoli":
			codice = "A564";
			break;
		case "Bagno Di Romagna":
			codice = "A565";
			break;
		case "Bagnoli Irpino":
			codice = "A566";
			break;
		case "Bagnoli Del Trigno":
			codice = "A567";
			break;
		case "Bagnoli Di Sopra":
			codice = "A568";
			break;
		case "Bagnolo Mella":
			codice = "A569";
			break;
		case "Bagnolo Cremasco":
			codice = "A570";
			break;
		case "Bagnolo Piemonte":
			codice = "A571";
			break;
		case "Bagnolo Del Salento":
			codice = "A572";
			break;
		case "Bagnolo In Piano":
			codice = "A573";
			break;
		case "Bagnolo Di Po":
			codice = "A574";
			break;
		case "Bagnolo San Vito":
			codice = "A575";
			break;
		case "Bagnone":
			codice = "A576";
			break;
		case "Bagnoregio":
			codice = "A577";
			break;
		case "Bagolino":
			codice = "A578";
			break;
		case "Baia E Latina":
			codice = "A579";
			break;
		case "Baiano":
			codice = "A580";
			break;
		case "Baiardo":
			codice = "A581";
			break;
		case "Bairo":
			codice = "A584";
			break;
		case "Baiso":
			codice = "A586";
			break;
		case "Balangero":
			codice = "A587";
			break;
		case "Baldichieri D'Asti":
			codice = "A588";
			break;
		case "Baldissero D'Alba":
			codice = "A589";
			break;
		case "Baldissero Canavese":
			codice = "A590";
			break;
		case "Baldissero Torinese":
			codice = "A591";
			break;
		case "Balestrate":
			codice = "A592";
			break;
		case "Balestrino":
			codice = "A593";
			break;
		case "Ballabio":
			codice = "A594";
			break;
		case "Ballao":
			codice = "A597";
			break;
		case "Balme":
			codice = "A599";
			break;
		case "Balmuccia":
			codice = "A600";
			break;
		case "Balocco":
			codice = "A601";
			break;
		case "Balsorano":
			codice = "A603";
			break;
		case "Balvano":
			codice = "A604";
			break;
		case "Balzola":
			codice = "A605";
			break;
		case "Banari":
			codice = "A606";
			break;
		case "Banchette":
			codice = "A607";
			break;
		case "Bannio Anzino":
			codice = "A610";
			break;
		case "Banzi":
			codice = "A612";
			break;
		case "Baone":
			codice = "A613";
			break;
		case "Baradili":
			codice = "A614";
			break;
		case "Baragiano":
			codice = "A615";
			break;
		case "Baranello":
			codice = "A616";
			break;
		case "Barano D'Ischia":
			codice = "A617";
			break;
		case "Baranzate":
			codice = "A618";
			break;
		case "Barasso":
			codice = "A619";
			break;
		case "Baratili San Pietro":
			codice = "A621";
			break;
		case "Barbania":
			codice = "A625";
			break;
		case "Barbara":
			codice = "A626";
			break;
		case "Barbarano Mossano":
			codice = "M401";
			break;
		case "Barbarano Vicentino":
			codice = "A627";
			break;
		case "Barbarano Romano":
			codice = "A628";
			break;
		case "Barbaresco":
			codice = "A629";
			break;
		case "Barbariga":
			codice = "A630";
			break;
		case "Barbata":
			codice = "A631";
			break;
		case "Barberino Di Mugello":
			codice = "A632";
			break;
		case "Barberino Tavarnelle":
			codice = "M408";
			break;
		case "Barberino Val D'Elsa":
			codice = "A633";
			break;
		case "Barbianello":
			codice = "A634";
			break;
		case "Barbiano":
			codice = "A635";
			break;
		case "Barbona":
			codice = "A637";
			break;
		case "Barcellona Pozzo Di Gotto":
			codice = "A638";
			break;
		case "Barchi":
			codice = "A639";
			break;
		case "Barcis":
			codice = "A640";
			break;
		case "Bard":
			codice = "A643";
			break;
		case "Bardello":
			codice = "A645";
			break;
		case "Bardi":
			codice = "A646";
			break;
		case "Bardineto":
			codice = "A647";
			break;
		case "Bardolino":
			codice = "A650";
			break;
		case "Bardonecchia":
			codice = "A651";
			break;
		case "Bareggio":
			codice = "A652";
			break;
		case "Barengo":
			codice = "A653";
			break;
		case "Baressa":
			codice = "A655";
			break;
		case "Barete":
			codice = "A656";
			break;
		case "Barga":
			codice = "A657";
			break;
		case "Bargagli":
			codice = "A658";
			break;
		case "Barge":
			codice = "A660";
			break;
		case "Barghe":
			codice = "A661";
			break;
		case "Bari":
			codice = "A662";
			break;
		case "Bari Sardo":
			codice = "663";
			break;
		case "Bariano":
			codice = "A664";
			break;
		case "Baricella":
			codice = "A665";
			break;
		case "Barile":
			codice = "A666";
			break;
		case "Barisciano":
			codice = "A667";
			break;
		case "Barlassina":
			codice = "A668";
			break;
		case "Barletta":
			codice = "A669";
			break;
		case "Barni":
			codice = "A670";
			break;
		case "Barolo":
			codice = "A671";
			break;
		case "Barone Canavese":
			codice = "A673";
			break;
		case "Baronissi":
			codice = "A674";
			break;
		case "Barrafranca":
			codice = "A676";
			break;
		case "Barrali":
			codice = "A677";
			break;
		case "Barrea":
			codice = "A678";
			break;
		case "Barumini":
			codice = "A681";
			break;
		case "Barzago":
			codice = "A683";
			break;
		case "Barzana":
			codice = "A684";
			break;
		case "Barzanò":
			codice = "A686";
			break;
		case "Barzio":
			codice = "A687";
			break;
		case "Basaluzzo":
			codice = "A689";
			break;
		case "Bascapè":
			codice = "A690";
			break;
		case "Baschi":
			codice = "A691";
			break;
		case "Basciano":
			codice = "A692";
			break;
		case "Baselga Di Pinè":
			codice = "A694";
			break;
		case "Baselice":
			codice = "A696";
			break;
		case "Basiano":
			codice = "A697";
			break;
		case "Basicò":
			codice = "A698";
			break;
		case "Basiglio":
			codice = "A699";
			break;
		case "Basiliano":
			codice = "A700";
			break;
		case "Bassano Bresciano":
			codice = "A702";
			break;
		case "Bassano Del Grappa":
			codice = "A703";
			break;
		case "Bassano Romano":
			codice = "A704";
			break;
		case "Bassiano":
			codice = "A707";
			break;
		case "Bassignana":
			codice = "A708";
			break;
		case "Bastia Mondovì":
			codice = "A709";
			break;
		case "Bastia Umbra":
			codice = "A710";
			break;
		case "Bastida Dè Dossi":
			codice = "A711";
			break;
		case "Bastida Pancarana":
			codice = "A712";
			break;
		case "Bastiglia":
			codice = "A713";
			break;
		case "Battaglia Terme":
			codice = "A714";
			break;
		case "Battifollo":
			codice = "A716";
			break;
		case "Battipaglia":
			codice = "A717";
			break;
		case "Battuda":
			codice = "A718";
			break;
		case "Baucina":
			codice = "A719";
			break;
		case "Boville Ernica":
			codice = "A720";
			break;
		case "Bauladu":
			codice = "A721";
			break;
		case "Baunei":
			codice = "A722";
			break;
		case "Baveno":
			codice = "A725";
			break;
		case "Bazzano":
			codice = "A726";
			break;
		case "Bedero Valcuvia":
			codice = "A728";
			break;
		case "Bedizzole":
			codice = "A729";
			break;
		case "Bedollo":
			codice = "A730";
			break;
		case "Bedonia":
			codice = "A731";
			break;
		case "Bedulita":
			codice = "A732";
			break;
		case "Bee":
			codice = "A733";
			break;
		case "Beinasco":
			codice = "A734";
			break;
		case "Beinette":
			codice = "A735";
			break;
		case "Belcastro":
			codice = "A736";
			break;
		case "Belfiore":
			codice = "A737";
			break;
		case "Belforte Monferrato":
			codice = "A738";
			break;
		case "Belforte Del Chienti":
			codice = "A739";
			break;
		case "Belforte All'Isauro":
			codice = "A740";
			break;
		case "Belgioioso":
			codice = "A741";
			break;
		case "Belgirate":
			codice = "A742";
			break;
		case "Bella":
			codice = "A743";
			break;
		case "Bellagio":
			codice = "A744"; // M335
			break;
		case "Bellano":
			codice = "A745";
			break;
		case "Bellante":
			codice = "A746";
			break;
		case "Bellaria-Igea Marina":
			codice = "A747";
			break;
		case "Bellegra":
			codice = "A749";
			break;
		case "Bellino":
			codice = "A750";
			break;
		case "Bellinzago Lombardo":
			codice = "A751";
			break;
		case "Bellinzago Novarese":
			codice = "A752";
			break;
		case "Bellizzi":
			codice = "M294";
			break;
		case "Bellona":
			codice = "A755";
			break;
		case "Bellosguardo":
			codice = "A756";
			break;
		case "Belluno":
			codice = "A757";
			break;
		case "Bellusco":
			codice = "A759";
			break;
		case "Belmonte Piceno":
			codice = "A760";
			break;
		case "Belmonte Del Sannio":
			codice = "A761";
			break;
		case "Belmonte Calabro":
			codice = "A762";
			break;
		case "Belmonte Castello":
			codice = "A763";
			break;
		case "Belmonte Mezzagno":
			codice = "A764";
			break;
		case "Belmonte In Sabina":
			codice = "A765";
			break;
		case "Belpasso":
			codice = "A766";
			break;
		case "Belsito":
			codice = "A768";
			break;
		case "Belvedere Ostrense":
			codice = "A769";
			break;
		case "Belveglio":
			codice = "A770";
			break;
		case "Belvedere Di Spinello":
			codice = "A772";
			break;
		case "Belvedere Marittimo":
			codice = "A773";
			break;
		case "Belvedere Langhe":
			codice = "A774";
			break;
		case "Belvì":
			codice = "A776";
			break;
		case "Bema":
			codice = "A777";
			break;
		case "Bene Lario":
			codice = "A778";
			break;
		case "Bene Vagienna":
			codice = "A779";
			break;
		case "Benestare":
			codice = "A780";
			break;
		case "Benetutti":
			codice = "A781";
			break;
		case "Benevello":
			codice = "A782";
			break;
		case "Benevento":
			codice = "A783";
			break;
		case "Benna":
			codice = "A784";
			break;
		case "Bentivoglio":
			codice = "A785";
			break;
		case "Berbenno":
			codice = "A786";
			break;
		case "Berbenno Di Valtellina":
			codice = "A787";
			break;
		case "Berceto":
			codice = "A788";
			break;
		case "Berchidda":
			codice = "A789";
			break;
		case "Beregazzo Con Figliaro":
			codice = "A791";
			break;
		case "Bereguardo":
			codice = "A792";
			break;
		case "Bergamasco":
			codice = "A793";
			break;
		case "Bergamo":
			codice = "A794";
			break;
		case "Bergantino":
			codice = "A795";
			break;
		case "Bergeggi":
			codice = "A796";
			break;
		case "Bergolo":
			codice = "A798";
			break;
		case "Berlingo":
			codice = "A799";
			break;
		case "Bernalda":
			codice = "A801";
			break;
		case "Bernareggio":
			codice = "A802";
			break;
		case "Bernate Ticino":
			codice = "A804";
			break;
		case "Bernezzo":
			codice = "A805";
			break;
		case "Berra":
			codice = "A806";
			break;
		case "Bersone":
			codice = "A808";
			break;
		case "Bertinoro":
			codice = "A809";
			break;
		case "Bertiolo":
			codice = "A810";
			break;
		case "Bertonico":
			codice = "A811";
			break;
		case "Berzano Di San Pietro":
			codice = "A812";
			break;
		case "Berzano Di Tortona":
			codice = "A813";
			break;
		case "Berzo San Fermo":
			codice = "A815";
			break;
		case "Berzo Demo":
			codice = "A816";
			break;
		case "Berzo Inferiore":
			codice = "A817";
			break;
		case "Besana In Brianza":
			codice = "A818";
			break;
		case "Besano":
			codice = "A819";
			break;
		case "Besate":
			codice = "A820";
			break;
		case "Besenello":
			codice = "A821";
			break;
		case "Besenzone":
			codice = "A823";
			break;
		case "Besnate":
			codice = "A825";
			break;
		case "Besozzo":
			codice = "A826";
			break;
		case "Bessude":
			codice = "A827";
			break;
		case "Bettola":
			codice = "A831";
			break;
		case "Bettona":
			codice = "A832";
			break;
		case "Beura-Cardezza":
			codice = "A834";
			break;
		case "Bevagna":
			codice = "A835";
			break;
		case "Beverino":
			codice = "A836";
			break;
		case "Bevilacqua":
			codice = "A837";
			break;
		case "Bezzecca":
			codice = "A839";
			break;
		case "Biancavilla":
			codice = "A841";
			break;
		case "Bianchi":
			codice = "A842";
			break;
		case "Bianco":
			codice = "A843";
			break;
		case "Biandrate":
			codice = "A844";
			break;
		case "Biandronno":
			codice = "A845";
			break;
		case "Bianzano":
			codice = "A846";
			break;
		case "Bianzè":
			codice = "A847";
			break;
		case "Bianzone":
			codice = "A848";
			break;
		case "Biassono":
			codice = "A849";
			break;
		case "Bibbiano":
			codice = "A850";
			break;
		case "Bibbiena":
			codice = "A851";
			break;
		case "Bibbona":
			codice = "A852";
			break;
		case "Bibiana":
			codice = "A853";
			break;
		case "Biccari":
			codice = "A854";
			break;
		case "Bicinicco":
			codice = "A855";
			break;
		case "Bidonì":
			codice = "A856";
			break;
		case "Blera":
			codice = "A857";
			break;
		case "Biella":
			codice = "A859";
			break;
		case "Bienno":
			codice = "A861";
			break;
		case "Bieno":
			codice = "A863";
			break;
		case "Bientina":
			codice = "A864";
			break;
		case "Bigarello":
			codice = "A866";
			break;
		case "Binago":
			codice = "A870";
			break;
		case "Binasco":
			codice = "A872";
			break;
		case "Binetto":
			codice = "A874";
			break;
		case "Bioglio":
			codice = "A876";
			break;
		case "Bionaz":
			codice = "A877";
			break;
		case "Bione":
			codice = "A878";
			break;
		case "Birori":
			codice = "A880";
			break;
		case "Bisaccia":
			codice = "A881";
			break;
		case "Bisacquino":
			codice = "A882";
			break;
		case "Bisceglie":
			codice = "A883";
			break;
		case "Bisegna":
			codice = "A884";
			break;
		case "Bisenti":
			codice = "A885";
			break;
		case "Bisignano":
			codice = "A887";
			break;
		case "Bistagno":
			codice = "A889";
			break;
		case "Bisuschio":
			codice = "A891";
			break;
		case "Bitetto":
			codice = "A892";
			break;
		case "Bitonto":
			codice = "A893";
			break;
		case "Bitritto":
			codice = "A894";
			break;
		case "Bitti":
			codice = "A895";
			break;
		case "Bivona":
			codice = "A896";
			break;
		case "Bivongi":
			codice = "A897";
			break;
		case "Bizzarone":
			codice = "A898";
			break;
		case "Bleggio Inferiore":
			codice = "A901";
			break;
		case "Bleggio Superiore":
			codice = "A902";
			break;
		case "Blello":
			codice = "A903";
			break;
		case "Blessagno":
			codice = "A904";
			break;
		case "Blevio":
			codice = "A905";
			break;
		case "Blufi":
			codice = "M268";
			break;
		case "Boara Pisani":
			codice = "A906";
			break;
		case "Bobbio":
			codice = "A909";
			break;
		case "Bobbio Pellice":
			codice = "A910";
			break;
		case "Boca":
			codice = "A911";
			break;
		case "Bocchigliero":
			codice = "A912";
			break;
		case "Boccioleto":
			codice = "A914";
			break;
		case "Bocenago":
			codice = "A916";
			break;
		case "Bodio Lomnago":
			codice = "A918";
			break;
		case "Boffalora D'Adda":
			codice = "A919";
			break;
		case "Boffalora Sopra Ticino":
			codice = "A920";
			break;
		case "Bogliasco":
			codice = "A922";
			break;
		case "Bognanco":
			codice = "A925";
			break;
		case "Bogogno":
			codice = "A929";
			break;
		case "Bojano":
			codice = "A930";
			break;
		case "Boissano":
			codice = "A931";
			break;
		case "Bolano":
			codice = "A932";
			break;
		case "Bolbeno":
			codice = "A933";
			break;
		case "Bolgare":
			codice = "A937";
			break;
		case "Bollate":
			codice = "A940";
			break;
		case "Bollengo":
			codice = "A941";
			break;
		case "Bologna":
			codice = "A944";
			break;
		case "Bolognano":
			codice = "A945";
			break;
		case "Bolognetta":
			codice = "A946";
			break;
		case "Bolognola":
			codice = "A947";
			break;
		case "Bolotana":
			codice = "A948";
			break;
		case "Bolsena":
			codice = "A949";
			break;
		case "Boltiere":
			codice = "A950";
			break;
		case "Bolzano":
			codice = "A952";
			break;
		case "Bolzano Novarese":
			codice = "A953";
			break;
		case "Bolzano Vicentino":
			codice = "A954";
			break;
		case "Bomarzo":
			codice = "A955";
			break;
		case "Bomba":
			codice = "A956";
			break;
		case "Bompensiere":
			codice = "A957";
			break;
		case "Bompietro":
			codice = "A958";
			break;
		case "Bomporto":
			codice = "A959";
			break;
		case "Bonarcado":
			codice = "A960";
			break;
		case "Bonassola":
			codice = "A961";
			break;
		case "Bonate Sotto":
			codice = "A962";
			break;
		case "Bonate Sopra":
			codice = "A963";
			break;
		case "Bonavigo":
			codice = "A964";
			break;
		case "Bondeno":
			codice = "A965";
			break;
		case "Bondo":
			codice = "A967";
			break;
		case "Bondone":
			codice = "A968";
			break;
		case "Bonea":
			codice = "A970";
			break;
		case "Bonefro":
			codice = "A971";
			break;
		case "Bonemerse":
			codice = "A972";
			break;
		case "Bonifati":
			codice = "A973";
			break;
		case "Bonito":
			codice = "A975";
			break;
		case "Bonnavaro":
			codice = "A976";
			break;
		case "Bono":
			codice = "A977";
			break;
		case "Bonorva":
			codice = "A978";
			break;
		case "Bonvicino":
			codice = "A979";
			break;
		case "Borbona":
			codice = "A981";
			break;
		case "Borca Di Cadore":
			codice = "A982";
			break;
		case "Bordano":
			codice = "A983";
			break;
		case "Bordighera":
			codice = "A984";
			break;
		case "Bordolano":
			codice = "A986";
			break;
		case "Bore":
			codice = "A987";
			break;
		case "Boretto":
			codice = "A988";
			break;
		case "Borgarello":
			codice = "A989";
			break;
		case "Borgaro Torinese":
			codice = "A990";
			break;
		case "Borgetto":
			codice = "A991";
			break;
		case "Borghetto Di Vara":
			codice = "A992";
			break;
		case "Borghetto D'Arroscia":
			codice = "A993";
			break;
		case "Borghetto Lodigiano":
			codice = "A995";
			break;
		case "Borgo Velino":
			codice = "A996";
			break;
		case "Borghetto Di Borbera":
			codice = "A998";
			break;
		case "Borghetto Santo Spirito":
			codice = "A999";
			break;
		case "Borghi":
			codice = "B001";
			break;
		case "Borgia":
			codice = "B002";
			break;
		case "Borgiallo":
			codice = "B003";
			break;
		case "Borgio Verezzi":
			codice = "B005";
			break;
		case "Borgo Valsugana":
			codice = "B006";
			break;
		case "Borgo A Mozzano":
			codice = "B007";
			break;
		case "Borgo Chiese":
			codice = "M352";
			break;
		case "Borgorose":
			codice = "B008";
			break;
		case "Borgo D'Ale":
			codice = "B009";
			break;
		case "Borgo Di Terzo":
			codice = "B010";
			break;
		case "Borgoforte":
			codice = "B011";
			break;
		case "Borgofranco Sul Po":
			codice = "B013";
			break;
		case "Borgofranco D'Ivrea":
			codice = "B015";
			break;
		case "Borgolavezzaro":
			codice = "B016";
			break;
		case "Borgo San Giovanni":
			codice = "B017";
			break;
		case "Borgomale":
			codice = "B018";
			break;
		case "Borgomanero":
			codice = "B019";
			break;
		case "Borgomaro":
			codice = "B020";
			break;
		case "Borgomasino":
			codice = "B021";
			break;
		case "Borgone Susa":
			codice = "B024";
			break;
		case "Borgonovo Val Tidone":
			codice = "B025";
			break;
		case "Borgo Lares":
			codice = "M353";
			break;
		case "Borgo Mantovano":
			codice = "M396";
			break;
		case "Borgo Pace":
			codice = "B026";
			break;
		case "Borgo Priolo":
			codice = "B028";
			break;
		case "Borgoratto Alessandrino":
			codice = "B029";
			break;
		case "Borgoratto Mormorolo":
			codice = "B030";
			break;
		case "Borgoricco":
			codice = "B031";
			break;
		case "Borgo San Dalmazzo":
			codice = "B033";
			break;
		case "Borgo San Giacomo":
			codice = "B035";
			break;
		case "Borgo San Lorenzo":
			codice = "B036";
			break;
		case "Borgo San Martino":
			codice = "B037";
			break;
		case "Borgo San Siro":
			codice = "B038";
			break;
		case "Borgosatollo":
			codice = "B040";
			break;
		case "Borgosesia":
			codice = "B041";
			break;
		case "Borgo Val Di Taro":
			codice = "B042";
			break;
		case "Borgo Ticino":
			codice = "B043";
			break;
		case "Borgo Tossignano":
			codice = "B044";
			break;
		case "Borgo Valbelluna":
			codice = "M421";
			break;
		case "Borgo Veneto":
			codice = "M402";
			break;
		case "Borgo Vercelli":
			codice = "B046";
			break;
		case "Borgo Virgilio":
			codice = "M340";
			break;
		case "Borgocarbonara":
			codice = "M406";
			break;
		case "Borgomezzavalle":
			codice = "M370";
			break;
		case "Bormida":
			codice = "B048";
			break;
		case "Bormio":
			codice = "B049";
			break;
		case "Bornasco":
			codice = "B051";
			break;
		case "Borno":
			codice = "B054";
			break;
		case "Boroneddu":
			codice = "B055";
			break;
		case "Borore":
			codice = "B056";
			break;
		case "Borrello":
			codice = "B057";
			break;
		case "Borriana":
			codice = "B058";
			break;
		case "Borso Del Grappa":
			codice = "B061";
			break;
		case "Bortigali":
			codice = "B062";
			break;
		case "Bortigiadas":
			codice = "B063";
			break;
		case "Borutta":
			codice = "B064";
			break;
		case "Borzonasca":
			codice = "B067";
			break;
		case "Bosa":
			codice = "B068";
			break;
		case "Bosaro":
			codice = "B069";
			break;
		case "Boschi Sant'Anna":
			codice = "B070";
			break;
		case "Bosco Marengo":
			codice = "B071";
			break;
		case "Bosco Chiesanuova":
			codice = "B073";
			break;
		case "Bosconero":
			codice = "B075";
			break;
		case "Boscoreale":
			codice = "B076";
			break;
		case "Boscotrecase":
			codice = "B077";
			break;
		case "Bosentino":
			codice = "B078";
			break;
		case "Bosia":
			codice = "B079";
			break;
		case "Bosio":
			codice = "B080";
			break;
		case "Bosisio Parini":
			codice = "B081";
			break;
		case "Bosnasco":
			codice = "B082";
			break;
		case "Bossico":
			codice = "B083";
			break;
		case "Bossolasco":
			codice = "B084";
			break;
		case "Botricello":
			codice = "B085";
			break;
		case "Botrugno":
			codice = "B086";
			break;
		case "Bottanuco":
			codice = "B088";
			break;
		case "Botticino":
			codice = "B091";
			break;
		case "Bottidda":
			codice = "B094";
			break;
		case "Bova":
			codice = "B097";
			break;
		case "Bovalino":
			codice = "B098";
			break;
		case "Bova Marina":
			codice = "B099";
			break;
		case "Bovegno":
			codice = "B100";
			break;
		case "Boves":
			codice = "B101";
			break;
		case "Bovezzo":
			codice = "B102";
			break;
		case "Bovino":
			codice = "B104";
			break;
		case "Bovisio-Masciago":
			codice = "B105";
			break;
		case "Bovolenta":
			codice = "B106";
			break;
		case "Bovolone":
			codice = "B107";
			break;
		case "Bozzole":
			codice = "B109";
			break;
		case "Bozzolo":
			codice = "B110";
			break;
		case "Bra":
			codice = "B111";
			break;
		case "Bracca":
			codice = "B112";
			break;
		case "Bracciano":
			codice = "B114";
			break;
		case "Bracigliano":
			codice = "B115";
			break;
		case "Braies":
			codice = "B116";
			break;
		case "Brallo Di Pregola":
			codice = "B117";
			break;
		case "Brancaleone":
			codice = "B118";
			break;
		case "Brandico":
			codice = "B120";
			break;
		case "Brandizzo":
			codice = "B121";
			break;
		case "Branzi":
			codice = "B123";
			break;
		case "Braone":
			codice = "B124";
			break;
		case "Brebbia":
			codice = "B126";
			break;
		case "Breda Di Piave":
			codice = "B128";
			break;
		case "Bregano":
			codice = "B131";
			break;
		case "Breganze":
			codice = "B132";
			break;
		case "Bregnano":
			codice = "B134";
			break;
		case "Breguzzo":
			codice = "B135";
			break;
		case "Breia":
			codice = "B136";
			break;
		case "Brembate":
			codice = "B137";
			break;
		case "Brembate Di Sopra":
			codice = "B138";
			break;
		case "Brembilla":
			codice = "B140";
			break;
		case "Brembio":
			codice = "B141";
			break;
		case "Breme":
			codice = "B142";
			break;
		case "Brendola":
			codice = "B143";
			break;
		case "Brenna":
			codice = "B144";
			break;
		case "Brennero":
			codice = "B145";
			break;
		case "Breno":
			codice = "B149";
			break;
		case "Brenta":
			codice = "B150";
			break;
		case "Brentino Belluno":
			codice = "B152";
			break;
		case "Brentonico":
			codice = "B153";
			break;
		case "Brenzone Sul Garda":
			codice = "B154";
			break;
		case "Brescello":
			codice = "B156";
			break;
		case "Brescia":
			codice = "B157";
			break;
		case "Bresimo":
			codice = "B158";
			break;
		case "Bressana Bottarone":
			codice = "B159";
			break;
		case "Bressanone":
			codice = "B160";
			break;
		case "Bressanvido":
			codice = "B161";
			break;
		case "Bresso":
			codice = "B162";
			break;
		case "Brez":
			codice = "B165";
			break;
		case "Brezzo Di Bedero":
			codice = "B166";
			break;
		case "Briaglia":
			codice = "B167";
			break;
		case "Briatico":
			codice = "B169";
			break;
		case "Bricherasio":
			codice = "B171";
			break;
		case "Brienno":
			codice = "B172";
			break;
		case "Brienza":
			codice = "B173";
			break;
		case "Briga Alta":
			codice = "B175";
			break;
		case "Briga Novarese":
			codice = "B176";
			break;
		case "Brignano Gera D'Adda":
			codice = "B178";
			break;
		case "Brignano-Frascata":
			codice = "B179";
			break;
		case "Brindisi":
			codice = "B180";
			break;
		case "Brindisi Montagna":
			codice = "B181";
			break;
		case "Brinzio":
			codice = "B182";
			break;
		case "Briona":
			codice = "B183";
			break;
		case "Brione":
			codice = "B184";// B185
			break;
		case "Briosco":
			codice = "B187";
			break;
		case "Brisighella":
			codice = "B188";
			break;
		case "Brissago-Valtravaglia":
			codice = "B191";
			break;
		case "Brissogne":
			codice = "B192";
			break;
		case "Brittoli":
			codice = "B193";
			break;
		case "Brivio":
			codice = "B194";
			break;
		case "Broccostella":
			codice = "B195";
			break;
		case "Brogliano":
			codice = "B196";
			break;
		case "Brognaturo":
			codice = "B197";
			break;
		case "Brolo":
			codice = "B198";
			break;
		case "Brondello":
			codice = "B200";
			break;
		case "Broni":
			codice = "B201";
			break;
		case "Bronte":
			codice = "B202";
			break;
		case "Bronzolo":
			codice = "B203";
			break;
		case "Brossasco":
			codice = "B204";
			break;
		case "Brosso":
			codice = "B205";
			break;
		case "Brovello-Carpugnino":
			codice = "B207";
			break;
		case "Brozolo":
			codice = "B209";
			break;
		case "Brugherio":
			codice = "B212";
			break;
		case "Brugine":
			codice = "B213";
			break;
		case "Brugnato":
			codice = "B214";
			break;
		case "Brugnera":
			codice = "B215";
			break;
		case "Bruino":
			codice = "B216";
			break;
		case "Brumano":
			codice = "B217";
			break;
		case "Brunate":
			codice = "B218";
			break;
		case "Brunello":
			codice = "B219";
			break;
		case "Brunico":
			codice = "B220";
			break;
		case "Bruno":
			codice = "B221";
			break;
		case "Brusaporto":
			codice = "B223";
			break;
		case "Brusasco":
			codice = "B225";
			break;
		case "Brusciano":
			codice = "B227";
			break;
		case "Brusimpiano":
			codice = "B228";
			break;
		case "Brusnengo":
			codice = "B229";
			break;
		case "Brusson":
			codice = "B230";
			break;
		case "Bruzolo":
			codice = "B232";
			break;
		case "Bruzzano Zeffirio":
			codice = "B234";
			break;
		case "Bubbiano":
			codice = "B235";
			break;
		case "Bubbio":
			codice = "B236";
			break;
		case "Buccheri":
			codice = "B237";
			break;
		case "Bucchianico":
			codice = "B238";
			break;
		case "Bucciano":
			codice = "B239";
			break;
		case "Buccinasco":
			codice = "B240";
			break;
		case "Buccino":
			codice = "B242";
			break;
		case "Bucine":
			codice = "B243";
			break;
		case "Buddusò":
			codice = "B246";
			break;
		case "Budoia":
			codice = "B247";
			break;
		case "Budoni":
			codice = "B248";
			break;
		case "Budrio":
			codice = "B249";
			break;
		case "Buggerru":
			codice = "B250";
			break;
		case "Buggiano":
			codice = "B251";
			break;
		case "Buglio In Monte":
			codice = "B255";
			break;
		case "Bugnara":
			codice = "B256";
			break;
		case "Buguggiate":
			codice = "B258";
			break;
		case "Buja":
			codice = "B259";
			break;
		case "Bulciago":
			codice = "B261";
			break;
		case "Bulgarograsso":
			codice = "B262";
			break;
		case "Bultei":
			codice = "B264";
			break;
		case "Bulzi":
			codice = "B265";
			break;
		case "Buonabitacolo":
			codice = "B266";
			break;
		case "Buonalbergo":
			codice = "B267";
			break;
		case "Buonconvento":
			codice = "B269";
			break;
		case "Buonvicino":
			codice = "B270";
			break;
		case "Burago Di Molgora":
			codice = "B272";
			break;
		case "Burcei":
			codice = "B274";
			break;
		case "Burgio":
			codice = "B275";
			break;
		case "Burgos":
			codice = "B276";
			break;
		case "Buriasco":
			codice = "B278";
			break;
		case "Burolo":
			codice = "B279";
			break;
		case "Buronzo":
			codice = "B280";
			break;
		case "Busachi":
			codice = "B281";
			break;
		case "Busalla":
			codice = "B282";
			break;
		case "Busana":
			codice = "B283";
			break;
		case "Busano":
			codice = "B284";
			break;
		case "Busca":
			codice = "B285";
			break;
		case "Buscate":
			codice = "B286";
			break;
		case "Buscemi":
			codice = "B287";
			break;
		case "Buseto Palizzolo":
			codice = "B288";
			break;
		case "Busnago":
			codice = "B289";
			break;
		case "Bussero":
			codice = "B292";
			break;
		case "Busseto":
			codice = "B293";
			break;
		case "Bussi Sul Tirino":
			codice = "B294";
			break;
		case "Busso":
			codice = "B295";
			break;
		case "Bussolengo":
			codice = "B296";
			break;
		case "Bussoleno":
			codice = "B297";
			break;
		case "Busto Arsizio":
			codice = "B300";
			break;
		case "Busto Garolfo":
			codice = "B301";
			break;
		case "Butera":
			codice = "B302";
			break;
		case "Buti":
			codice = "B303";
			break;
		case "Buttapietra":
			codice = "B304";
			break;
		case "Buttigliera Alta":
			codice = "B305";
			break;
		case "Buttigliera D'Asti":
			codice = "B306";
			break;
		case "Buttrio":
			codice = "B309";
			break;
		}

	}

	private void codiciComuniC(String comune) {

		switch (comune) {

		case "Cermes":
			codice = "A022";
			break;
		case "Castello Di Annone":
			codice = "A300";
			break;
		case "Casperia":
			codice = "A472";
			break;
		case "Casciana Terme":
			codice = "A559";
			break;
		case "Casapesenna":
			codice = "M260";
			break;
		case "Cellole":
			codice = "M262";
			break;
		case "Ciampino":
			codice = "M272";
			break;
		case "Cardedu":
			codice = "M285";
			break;
		case "Castiadas":
			codice = "M288";
			break;
		case "Cavallino-Treporti":
			codice = "M308";
			break;
		case "Comano Terme":
			codice = "M314";
			break;
		case "Crespina Lorenzana":
			codice = "M328";
			break;
		case "Castelfranco Piandiscò":
			codice = "M322";
			break;
		case "Colverde":
			codice = "M336";
			break;
		case "Cornale E Bastida":
			codice = "M338";
			break;
		case "Castel Ivano":
			codice = "M354";
			break;
		case "Contà":
			codice = "M356";
			break;
		case "Corteolona E Genzone":
			codice = "M372";
			break;
		case "Colli Al Metauro":
			codice = "M380";
			break;
		case "Casali Del Manco":
			codice = "M385";
			break;
		case "Castelgerundo":
			codice = "M393";
			break;
		case "Centro Valle Intelvi":
			codice = "M394";
			break;
		case "Cellio Con Breia":
			codice = "M398";
			break;
		case "Corigliano-Rossano":
			codice = "M403";
			break;
		case "Colli Verdi":
			codice = "M419";
			break;
		case "Cadrezzate Con Osmate":
			codice = "M425";
			break;
		case "Colceresa":
			codice = "M426";
			break;
		case "Campolongo Tapogliano":
			codice = "M311";
			break;
		case "Casciana Terme Lari":
			codice = "M327";
			break;
		case "Cembra Lisignago":
			codice = "M355";
			break;
		case "Canossa":
			codice = "C669";
			break;
		case "Castelverde":
			codice = "B129";
			break;
		case "Cabella Ligure":
			codice = "B311";
			break;
		case "Castello Cabiaglio":
			codice = "B312";
			break;
		case "Cabiate":
			codice = "B313";
			break;
		case "Cabras":
			codice = "B314";
			break;
		case "Caccamo":
			codice = "B315";
			break;
		case "Caccuri":
			codice = "B319";
			break;
		case "Cà D'Andrea":
			codice = "B320";
			break;
		case "Cadegliano-Viconago":
			codice = "B326";
			break;
		case "Cadelbosco Di Sopra":
			codice = "B328";
			break;
		case "Cadeo":
			codice = "B332";
			break;
		case "Caderzone Terme":
			codice = "B335";
			break;
		case "Cadoneghe":
			codice = "B345";
			break;
		case "Cadorago":
			codice = "B346";
			break;
		case "Cadrezzate":
			codice = "B347";
			break;
		case "Caerano Di San Marco":
			codice = "B349";
			break;
		case "Cafasse":
			codice = "B350";
			break;
		case "Caggiano":
			codice = "B351";
			break;
		case "Cagli":
			codice = "B352";
			break;
		case "Cagliari":
			codice = "B354";
			break;
		case "Caglio":
			codice = "B355";
			break;
		case "Cagnano Varano":
			codice = "B357";
			break;
		case "Cagnano Amiterno":
			codice = "B358";
			break;
		case "Cagno":
			codice = "B359";
			break;
		case "Cagnò":
			codice = "B360";
			break;
		case "Caianello":
			codice = "B361";
			break;
		case "Caiazzo":
			codice = "B362";
			break;
		case "Caines":
			codice = "B364";
			break;
		case "Caino":
			codice = "B365";
			break;
		case "Caiolo":
			codice = "B366";
			break;
		case "Cairano":
			codice = "B367";
			break;
		case "Cairate":
			codice = "B368";
			break;
		case "Cairo Montenotte":
			codice = "B369";
			break;
		case "Caivano":
			codice = "B371";
			break;
		case "Calabritto":
			codice = "B374";
			break;
		case "Calalzo Di Cadore":
			codice = "B375";
			break;
		case "Calamandrana":
			codice = "B376";
			break;
		case "Calamonaci":
			codice = "B377";
			break;
		case "Calangianus":
			codice = "B378";
			break;
		case "Calanna":
			codice = "B379";
			break;
		case "Calasca-Castiglione":
			codice = "B380";
			break;
		case "Calascibetta":
			codice = "B381";
			break;
		case "Calascio":
			codice = "B382";
			break;
		case "Calasetta":
			codice = "B383";
			break;
		case "Calatabiano":
			codice = "B384";
			break;
		case "Calatafimi Segesta":
			codice = "B385";
			break;
		case "Calavino":
			codice = "B386";
			break;
		case "Calcata":
			codice = "B388";
			break;
		case "Calceranica Al Lago":
			codice = "B389";
			break;
		case "Calci":
			codice = "B390";
			break;
		case "Calciano":
			codice = "B391";
			break;
		case "Calcinaia":
			codice = "B392";
			break;
		case "Calcinate":
			codice = "B393";
			break;
		case "Calcinato":
			codice = "B394";
			break;
		case "Calcio":
			codice = "B395";
			break;
		case "Calco":
			codice = "B396";
			break;
		case "Caldaro Sulla Strada Del Vino":
			codice = "B397";
			break;
		case "Caldarola":
			codice = "B398";
			break;
		case "Calderara Di Reno":
			codice = "B399";
			break;
		case "Caldes":
			codice = "B400";
			break;
		case "Caldiero":
			codice = "B402";
			break;
		case "Caldogno":
			codice = "B403";
			break;
		case "Caldonazzo":
			codice = "B404";
			break;
		case "Calendasco":
			codice = "B405";
			break;
		case "Calenzano":
			codice = "B406";
			break;
		case "Calestano":
			codice = "B408";
			break;
		case "Calice Ligure":
			codice = "B409";
			break;
		case "Calice Al Cornovoglio":
			codice = "B410";
			break;
		case "Calimera":
			codice = "B413";
			break;
		case "Calitri":
			codice = "B415";
			break;
		case "Calizzano":
			codice = "B416";
			break;
		case "Callabiana":
			codice = "B417";
			break;
		case "Calliano":
			codice = "B418";// B419
			break;
		case "Calolziocorte":
			codice = "B423";
			break;
		case "Calopezzati":
			codice = "B424";
			break;
		case "Calosso":
			codice = "B425";
			break;
		case "Caloveto":
			codice = "B426";
			break;
		case "Caltabellotta":
			codice = "B427";
			break;
		case "Caltagirone":
			codice = "B428";
			break;
		case "Caltanissetta":
			codice = "B429";
			break;
		case "Caltavuturo":
			codice = "B430";
			break;
		case "Caltignaga":
			codice = "B431";
			break;
		case "Calto":
			codice = "B432";
			break;
		case "Caltrano":
			codice = "B433";
			break;
		case "Calusco D'Adda":
			codice = "B434";
			break;
		case "Caluso":
			codice = "B435";
			break;
		case "Calvagese Della Riviera":
			codice = "B436";
			break;
		case "Calvanico":
			codice = "B437";
			break;
		case "Calvatone":
			codice = "B439";
			break;
		case "Calvello":
			codice = "B440";
			break;
		case "Calvene":
			codice = "B441";
			break;
		case "Calvenzano":
			codice = "B442";
			break;
		case "Calvera":
			codice = "B443";
			break;
		case "Calvi":
			codice = "B444";
			break;
		case "Calvi Risorta":
			codice = "B445";
			break;
		case "Calvi Dell'Umbria":
			codice = "B446";
			break;
		case "Calvignano":
			codice = "B447";
			break;
		case "Calvignasco":
			codice = "B448";
			break;
		case "Calvisano":
			codice = "B450";
			break;
		case "Calvizzano":
			codice = "B452";
			break;
		case "Camagna Monferrato":
			codice = "B453";
			break;
		case "Camaiore":
			codice = "B455";
			break;
		case "Camairago":
			codice = "B456";
			break;
		case "Camandona":
			codice = "B457";
			break;
		case "Camastra":
			codice = "B460";
			break;
		case "Cambiago":
			codice = "B461";
			break;
		case "Cambiano":
			codice = "B462";
			break;
		case "Cambiasca":
			codice = "B463";
			break;
		case "Camburzano":
			codice = "B465";
			break;
		case "Camerana":
			codice = "B467";
			break;
		case "Camerano":
			codice = "B468";
			break;
		case "Camerano Casasco":
			codice = "B469";
			break;
		case "Camerata Picena":
			codice = "B470";
			break;
		case "Camerata Cornello":
			codice = "B471";
			break;
		case "Camerata Nuova":
			codice = "B472";
			break;
		case "Cameri":
			codice = "B473";
			break;
		case "Camerino":
			codice = "B474";
			break;
		case "Camerota":
			codice = "B476";
			break;
		case "Camigliano":
			codice = "B477";
			break;
		case "Caminata":
			codice = "B479";
			break;
		case "Camini":
			codice = "B481";
			break;
		case "Camino":
			codice = "B482";
			break;
		case "Camino Al Tagliamento":
			codice = "B483";
			break;
		case "Camisano":
			codice = "B484";
			break;
		case "Camisano Vicentino":
			codice = "B485";
			break;
		case "Cammarata":
			codice = "B486";
			break;
		case "Camo":
			codice = "B489";
			break;
		case "Camogli":
			codice = "B490";
			break;
		case "Chamois":
			codice = "B491";
			break;
		case "Campagna":
			codice = "B492";
			break;
		case "Campagna Lupia":
			codice = "B493";
			break;
		case "Castel Campagnano":
			codice = "B494";
			break;
		case "Campagnano Di Roma":
			codice = "B496";
			break;
		case "Campagnatico":
			codice = "B497";
			break;
		case "Campagnola Cremasca":
			codice = "B498";
			break;
		case "Campagnola Emilia":
			codice = "B499";
			break;
		case "Campana":
			codice = "B500";
			break;
		case "Camparada":
			codice = "B501";
			break;
		case "Campegine":
			codice = "B502";
			break;
		case "Campello Sul Clitunno":
			codice = "B504";
			break;
		case "Campertogno":
			codice = "B505";
			break;
		case "Campi Salentina":
			codice = "B506";
			break;
		case "Campi Bisenzio":
			codice = "B507";
			break;
		case "Campiglia Cervo":
			codice = "B508";// M373
			break;
		case "Campiglia Marittima":
			codice = "B509";
			break;
		case "Campiglia Dei Berici":
			codice = "B511";
			break;
		case "Campiglione Fenile":
			codice = "B512";
			break;
		case "Campione D'Italia":
			codice = "B513";
			break;
		case "Campitello Di Fassa":
			codice = "B514";
			break;
		case "Campli":
			codice = "B515";
			break;
		case "Campo Calabro":
			codice = "B516";
			break;
		case "Campobasso":
			codice = "B519";
			break;
		case "Campobello Di Licata":
			codice = "B520";
			break;
		case "Campobello Di Mazara":
			codice = "B521";
			break;
		case "Campochiaro":
			codice = "B522";
			break;
		case "Campodarsego":
			codice = "B524";
			break;
		case "Campodenno":
			codice = "B525";
			break;
		case "Campo Di Giove":
			codice = "B526";
			break;
		case "Campodimele":
			codice = "B527";
			break;
		case "Campodipietra":
			codice = "B528";
			break;
		case "Campo Di Trens":
			codice = "B529";
			break;
		case "Campodolcino":
			codice = "B530";
			break;
		case "Campodoro":
			codice = "B531";
			break;
		case "Campofelice Di Roccella":
			codice = "B532";
			break;
		case "Campofelice Di Fitalia":
			codice = "B533";
			break;
		case "Campofilone":
			codice = "B534";
			break;
		case "Campofiorito":
			codice = "B535";
			break;
		case "Campoformido":
			codice = "B536";
			break;
		case "Campofranco":
			codice = "B537";
			break;
		case "Campo Ligure":
			codice = "B538";
			break;
		case "Campogalliano":
			codice = "B539";
			break;
		case "Champorcher":
			codice = "B540";
			break;
		case "Campolattaro":
			codice = "B541";
			break;
		case "Campoli Del Monte Taburno":
			codice = "B542";
			break;
		case "Campoli Appennino":
			codice = "B543";
			break;
		case "Campolieto":
			codice = "B544";
			break;
		case "Campolongo Al Torre":
			codice = "B545";
			break;
		case "Campolongo Maggiore":
			codice = "B546";
			break;
		case "Campolongo Sul Brenta":
			codice = "B547";
			break;
		case "Campomaggiore":
			codice = "B549";
			break;
		case "Campomarino":
			codice = "B550";
			break;
		case "Campomorone":
			codice = "B551";
			break;
		case "Camponogara":
			codice = "B554";
			break;
		case "Campora":
			codice = "B555";
			break;
		case "Camporeale":
			codice = "B556";
			break;
		case "Camporgiano":
			codice = "B557";
			break;
		case "Camporosso":
			codice = "B559";
			break;
		case "Camporotondo Etneo":
			codice = "B561";
			break;
		case "Camporotondo Di Fiastrone":
			codice = "B562";
			break;
		case "Camposampiero":
			codice = "B563";
			break;
		case "Campo San Martino":
			codice = "B564";
			break;
		case "Camposano":
			codice = "B565";
			break;
		case "Camposanto":
			codice = "B566";
			break;
		case "Campospinoso":
			codice = "B567";
			break;
		case "Campotosto":
			codice = "B569";
			break;
		case "Campo Tures":
			codice = "B570";
			break;
		case "Camugnano":
			codice = "B572";
			break;
		case "Canale":
			codice = "B573";
			break;
		case "Canale D'Agordo":
			codice = "B574";
			break;
		case "Canale Monterano":
			codice = "B576";
			break;
		case "Canal San Bovo":
			codice = "B577";
			break;
		case "Canaro":
			codice = "B578";
			break;
		case "Canazei":
			codice = "B579";
			break;
		case "Cancellara":
			codice = "B580";
			break;
		case "Cancello Ed Arnone":
			codice = "B581";
			break;
		case "Canda":
			codice = "B582";
			break;
		case "Candela":
			codice = "B584";
			break;
		case "Candelo":
			codice = "B586";
			break;
		case "Candia Lomellina":
			codice = "B587";
			break;
		case "Candia Canavese":
			codice = "B588";
			break;
		case "Candiana":
			codice = "B589";
			break;
		case "Candida":
			codice = "B590";
			break;
		case "Candidoni":
			codice = "B591";
			break;
		case "Candiolo":
			codice = "B592";
			break;
		case "Canegrate":
			codice = "B593";
			break;
		case "Canelli":
			codice = "B594";
			break;
		case "Canepina":
			codice = "B597";
			break;
		case "Caneva":
			codice = "B598";
			break;
		case "Canevino":
			codice = "B599";
			break;
		case "Canicattì":
			codice = "B602";
			break;
		case "Canicattini Bagni":
			codice = "B603";
			break;
		case "Canino":
			codice = "B604";
			break;
		case "Canischio":
			codice = "B605";
			break;
		case "Canistro":
			codice = "B606";
			break;
		case "Canna":
			codice = "B607";
			break;
		case "Cannalonga":
			codice = "B608";
			break;
		case "Cannara":
			codice = "B609";
			break;
		case "Cannero Riviera":
			codice = "B610";
			break;
		case "Canneto Sull'Oglio":
			codice = "B612";
			break;
		case "Canneto Pavese":
			codice = "B613";
			break;
		case "Cannobio":
			codice = "B615";
			break;
		case "Cannole":
			codice = "B616";
			break;
		case "Canolo":
			codice = "B617";
			break;
		case "Canonica D'Adda":
			codice = "B618";
			break;
		case "Canosa Di Puglia":
			codice = "B619";
			break;
		case "Canosa Sannita":
			codice = "B620";
			break;
		case "Canosio":
			codice = "B621";
			break;
		case "Cansano":
			codice = "B624";
			break;
		case "Cantagallo":
			codice = "B626";
			break;
		case "Cantalice":
			codice = "B627";
			break;
		case "Cantalupa":
			codice = "B628";
			break;
		case "Cantalupo Ligure":
			codice = "B629";
			break;
		case "Cantalupo Nel Sannio":
			codice = "B630";
			break;
		case "Cantalupo In Sabina":
			codice = "B631";
			break;
		case "Cantarana":
			codice = "B633";
			break;
		case "Cantello":
			codice = "B634";
			break;
		case "Canterano":
			codice = "B635";
			break;
		case "Cantiano":
			codice = "B636";
			break;
		case "Cantoira":
			codice = "B637";
			break;
		case "Cantù":
			codice = "B639";
			break;
		case "Canzano":
			codice = "B640";
			break;
		case "Canzo":
			codice = "B641";
			break;
		case "Caorle":
			codice = "B642";
			break;
		case "Caorso":
			codice = "B643";
			break;
		case "Capaccio Paestum":
			codice = "B644";
			break;
		case "Capaci":
			codice = "B645";
			break;
		case "Capalbio":
			codice = "B646";
			break;
		case "Capannoli":
			codice = "B647";
			break;
		case "Capannori":
			codice = "B648";
			break;
		case "Capena":
			codice = "B649";
			break;
		case "Capergnanica":
			codice = "B650";
			break;
		case "Capestrano":
			codice = "B651";
			break;
		case "Capiago Intimiano":
			codice = "B653";
			break;
		case "Capistrano":
			codice = "B655";
			break;
		case "Capistrello":
			codice = "B656";
			break;
		case "Capitignano":
			codice = "B658";
			break;
		case "Capizzi":
			codice = "B660";
			break;
		case "Capizzone":
			codice = "B661";
			break;
		case "Capodimonte":
			codice = "B663";
			break;
		case "Capo Di Ponte":
			codice = "B664";
			break;
		case "Capo D'Orlando":
			codice = "B666";
			break;
		case "Capodrise":
			codice = "B667";
			break;
		case "Capolivieri":
			codice = "B669";
			break;
		case "Capolona":
			codice = "B670";
			break;
		case "Caponago":
			codice = "B671";
			break;
		case "Caporciano":
			codice = "B672";
			break;
		case "Caposele":
			codice = "B674";
			break;
		case "Capoterra":
			codice = "B675";
			break;
		case "Capovalle":
			codice = "B676";
			break;
		case "Cappadocia":
			codice = "B677";
			break;
		case "Cappella Maggiore":
			codice = "B678";
			break;
		case "Cappella Cantone":
			codice = "B679";
			break;
		case "Cappella Dè Picenardi":
			codice = "B680";
			break;
		case "Cappelle Sul Tavo":
			codice = "B681";
			break;
		case "Capracotta":
			codice = "B682";
			break;
		case "Capraia E Limite":
			codice = "B684";
			break;
		case "Capraia Isola":
			codice = "B685";
			break;
		case "Capralba":
			codice = "B686";
			break;
		case "Capranica Prenestina":
			codice = "B687";
			break;
		case "Capranica":
			codice = "B688";
			break;
		case "Caprarica Di Lecce":
			codice = "B690";
			break;
		case "Caprarola":
			codice = "B691";
			break;
		case "Caprauna":
			codice = "B692";
			break;
		case "Caprese Michelangelo":
			codice = "B693";
			break;
		case "Caprezzo":
			codice = "B694";
			break;
		case "Capri Leone":
			codice = "B695";
			break;
		case "Capri":
			codice = "B696";
			break;
		case "Capriana":
			codice = "B697";
			break;
		case "Capriano Del Colle":
			codice = "B698";
			break;
		case "Capriata D'Orba":
			codice = "B701";
			break;
		case "Capriate San Gervasio":
			codice = "B703";
			break;
		case "Capriati A Volturno":
			codice = "B704";
			break;
		case "Caprie":
			codice = "B705";
			break;
		case "Capriglia Irpina":
			codice = "B706";
			break;
		case "Capriglio":
			codice = "B707";
			break;
		case "Caprile":
			codice = "B708";
			break;
		case "Caprino Veronese":
			codice = "B709";
			break;
		case "Caprino Bergamasco":
			codice = "B710";
			break;
		case "Capriolo":
			codice = "B711";
			break;
		case "Capariva Del Friuli":
			codice = "B712";
			break;
		case "Capua":
			codice = "B715";
			break;
		case "Capurso":
			codice = "B716";
			break;
		case "Caraffa Di Catanzaro":
			codice = "B717";
			break;
		case "Caraffa Del Bianco":
			codice = "B718";
			break;
		case "Caraglio":
			codice = "B719";
			break;
		case "Caramagna Piemonte":
			codice = "B720";
			break;
		case "Caramanico Terme":
			codice = "B722";
			break;
		case "Carano":
			codice = "B723";
			break;
		case "Carapelle":
			codice = "B724";
			break;
		case "Carapelle Calvisio":
			codice = "B725";
			break;
		case "Carasco":
			codice = "B726";
			break;
		case "Carassai":
			codice = "B727";
			break;
		case "Carate Brianza":
			codice = "B729";
			break;
		case "Carate Urio":
			codice = "B730";
			break;
		case "Caravaggio":
			codice = "B731";
			break;
		case "Caravate":
			codice = "B732";
			break;
		case "Caravino":
			codice = "B733";
			break;
		case "Caravonica":
			codice = "B734";
			break;
		case "Carbognano":
			codice = "B735";
			break;
		case "Carbonara Scrivia":
			codice = "B736";
			break;
		case "Carbonara Di Po":
			codice = "B739";
			break;
		case "Carbonara Di Nola":
			codice = "B740";
			break;
		case "Carbonara Al Ticino":
			codice = "B741";
			break;
		case "Carbonate":
			codice = "B742";
			break;
		case "Carbone":
			codice = "B743";
			break;
		case "Carbonera":
			codice = "B744";
			break;
		case "Carbonia":
			codice = "B745";
			break;
		case "Carcare":
			codice = "B748";
			break;
		case "Carceri":
			codice = "B749";
			break;
		case "Carcoforo":
			codice = "B752";
			break;
		case "Cardano Al Campo":
			codice = "B754";
			break;
		case "Cardè":
			codice = "B755";
			break;
		case "Cardeto":
			codice = "B756";
			break;
		case "Cardinale":
			codice = "B758";
			break;
		case "Cardito":
			codice = "B759";
			break;
		case "Careggine":
			codice = "B760";
			break;
		case "Carema":
			codice = "B762";
			break;
		case "Carenno":
			codice = "B763";
			break;
		case "Carentino":
			codice = "B765";
			break;
		case "Careri":
			codice = "B766";
			break;
		case "Caresana":
			codice = "B767";
			break;
		case "Caresanablot":
			codice = "B768";
			break;
		case "Carezzano":
			codice = "B769";
			break;
		case "Carfizzi":
			codice = "B771";
			break;
		case "Cargeghe":
			codice = "B772";
			break;
		case "Cariati":
			codice = "B774";
			break;
		case "Carife":
			codice = "B776";
			break;
		case "Carignano":
			codice = "B777";
			break;
		case "Carimate":
			codice = "B778";
			break;
		case "Carinaro":
			codice = "B779";
			break;
		case "Carini":
			codice = "B780";
			break;
		case "Carinola":
			codice = "B781";
			break;
		case "Carisio":
			codice = "B782";
			break;
		case "Carisolo":
			codice = "B783";
			break;
		case "Carlantino":
			codice = "B784";
			break;
		case "Carlazzo":
			codice = "B785";
			break;
		case "Carlentini":
			codice = "B787";
			break;
		case "Carlino":
			codice = "B788";
			break;
		case "Carloforte":
			codice = "B789";
			break;
		case "Carlopoli":
			codice = "B790";
			break;
		case "Carmagnola":
			codice = "B791";
			break;
		case "Carmiano":
			codice = "B792";
			break;
		case "Carmignano":
			codice = "B794";
			break;
		case "Carmignano Di Brenta":
			codice = "B795";
			break;
		case "Carnago":
			codice = "B796";
			break;
		case "Carnate":
			codice = "B798";
			break;
		case "Cornedo All'Isarco":
			codice = "B799";
			break;
		case "Carobbio Degli Angeli":
			codice = "B801";
			break;
		case "Carolei":
			codice = "B802";
			break;
		case "Carona":
			codice = "B803";
			break;
		case "Caronia":
			codice = "B804";
			break;
		case "Caronno Pertusella":
			codice = "B805";
			break;
		case "Caronno Varesino":
			codice = "B807";
			break;
		case "Carosino":
			codice = "B808";
			break;
		case "Carovigno":
			codice = "B809";
			break;
		case "Carovilli":
			codice = "B810";
			break;
		case "Carpaneto Piacentino":
			codice = "B812";
			break;
		case "Carpanzano":
			codice = "B813";
			break;
		case "Carpasio":
			codice = "B814";
			break;
		case "Carpegna":
			codice = "B816";
			break;
		case "Carpenedolo":
			codice = "B817";
			break;
		case "Carpeneto":
			codice = "B818";
			break;
		case "Carpi":
			codice = "B819";
			break;
		case "Carpiano":
			codice = "B820";
			break;
		case "Carpignano Salentino":
			codice = "B822";
			break;
		case "Carpignano Sesia":
			codice = "B823";
			break;
		case "Cura Carpignano":
			codice = "B824";
			break;
		case "Carpineti":
			codice = "B825";
			break;
		case "Carpineto Sinello":
			codice = "B826";
			break;
		case "Carpineto Della Nora":
			codice = "B827";
			break;
		case "Carpineto Romano":
			codice = "B828";
			break;
		case "Carpino":
			codice = "B829";
			break;
		case "Carpinone":
			codice = "B830";
			break;
		case "Carrara":
			codice = "B832";
			break;
		case "Carrè":
			codice = "B835";
			break;
		case "Carrega Ligure":
			codice = "B836";
			break;
		case "Carro":
			codice = "B838";
			break;
		case "Carrodano":
			codice = "B839";
			break;
		case "Carrosio":
			codice = "B840";
			break;
		case "Carrù":
			codice = "B841";
			break;
		case "Carsoli":
			codice = "B842";
			break;
		case "Cartigliano":
			codice = "B844";
			break;
		case "Cartignano":
			codice = "B845";
			break;
		case "Cartoceto":
			codice = "B846";
			break;
		case "Cartosio":
			codice = "B847";
			break;
		case "Cartura":
			codice = "B848";
			break;
		case "Carugate":
			codice = "B850";
			break;
		case "Carugo":
			codice = "B851";
			break;
		case "Carunchio":
			codice = "B853";
			break;
		case "Carvico":
			codice = "B854";
			break;
		case "Carzano":
			codice = "B856";
			break;
		case "Casabona":
			codice = "B857";
			break;
		case "Casacalenda":
			codice = "B858";
			break;
		case "Casacanditella":
			codice = "B859";
			break;
		case "Casagiove":
			codice = "B860";
			break;
		case "Casalanguida":
			codice = "B861";
			break;
		case "Casalattico":
			codice = "B862";
			break;
		case "Casalbeltrame":
			codice = "B864";
			break;
		case "Casalbordino":
			codice = "B865";
			break;
		case "Casalbore":
			codice = "B866";
			break;
		case "Casalborgone":
			codice = "B867";
			break;
		case "Casalbuono":
			codice = "B868";
			break;
		case "Casalbuttano Ed Uniti":
			codice = "B869";
			break;
		case "Casal Cermelli":
			codice = "B870";
			break;
		case "Casalciprano":
			codice = "B871";
			break;
		case "Casal Di Principe":
			codice = "B872";
			break;
		case "Casalduni":
			codice = "B873";
			break;
		case "Casale Litta":
			codice = "B875";
			break;
		case "Casale Corte Cerro":
			codice = "B876";
			break;
		case "Casale Di Scodosia":
			codice = "B877";
			break;
		case "Casale Marittimo":
			codice = "B878";
			break;
		case "Casale Sul Sile":
			codice = "B879";
			break;
		case "Casalecchio Di Reno":
			codice = "B880";
			break;
		case "Casale Cremasco-Vidolasco":
			codice = "B881";
			break;
		case "Casaleggio Boiro":
			codice = "B882";
			break;
		case "Casaleggio Novara":
			codice = "B883";
			break;
		case "Casale Monferrato":
			codice = "B885";
			break;
		case "Casaleone":
			codice = "B886";
			break;
		case "Casaletto Lodigiano":
			codice = "B887";
			break;
		case "Casaletto Spartano":
			codice = "B888";
			break;
		case "Casaletto Ceredano":
			codice = "B889";
			break;
		case "Casaletto Di Sopra":
			codice = "B890";
			break;
		case "Casaletto Vaprio":
			codice = "B891";
			break;
		case "Casalfiumanese":
			codice = "B892";
			break;
		case "Casalgrande":
			codice = "B893";
			break;
		case "Casalgrasso":
			codice = "B894";
			break;
		case "Casal Velino":
			codice = "B895";
			break;
		case "Casalincontrada":
			codice = "B896";
			break;
		case "Casalino":
			codice = "B897";
			break;
		case "Casalmaggiore":
			codice = "B898";
			break;
		case "Casalmaiocco":
			codice = "B899";
			break;
		case "Casalmorano":
			codice = "B900";
			break;
		case "Casalmoro":
			codice = "B901";
			break;
		case "Casalnoceto":
			codice = "B902";
			break;
		case "Casalnuovo Monterotaro":
			codice = "B904";
			break;
		case "Casalnuovo Di Napoli":
			codice = "B905";
			break;
		case "Casaloldo":
			codice = "B907";
			break;
		case "Casalpusterlengo":
			codice = "B910";
			break;
		case "Casalromano":
			codice = "B911";
			break;
		case "Casalserugo":
			codice = "B912";
			break;
		case "Casaluce":
			codice = "B916";
			break;
		case "Casalvecchio Di Puglia":
			codice = "B917";
			break;
		case "Casalvecchio Siculo":
			codice = "B918";
			break;
		case "Casalvieri":
			codice = "B919";
			break;
		case "Casalvolone":
			codice = "B920";
			break;
		case "Casalzuigno":
			codice = "B921";
			break;
		case "Casamarciano":
			codice = "B922";
			break;
		case "Casamassima":
			codice = "B923";
			break;
		case "Casamicciola Terme":
			codice = "B924";
			break;
		case "Casandrino":
			codice = "B925";
			break;
		case "Casanova Lerrone":
			codice = "B927";
			break;
		case "Casanova Elvo":
			codice = "B928";
			break;
		case "Casanova Lonati":
			codice = "B929";
			break;
		case "Casape":
			codice = "B932";
			break;
		case "Casapinta":
			codice = "B933";
			break;
		case "Casaprota":
			codice = "B934";
			break;
		case "Casapulla":
			codice = "B935";
			break;
		case "Casarano":
			codice = "B936";
			break;
		case "Casargo":
			codice = "B937";
			break;
		case "Casarile":
			codice = "B938";
			break;
		case "Casarza Ligure":
			codice = "B939";
			break;
		case "Casarsa Della Delizia":
			codice = "B940";
			break;
		case "Casasco":
			codice = "B941";
			break;
		case "Casasco D'Intelvi":
			codice = "B942";
			break;
		case "Casatenovo":
			codice = "B943";
			break;
		case "Casatisma":
			codice = "B945";
			break;
		case "Casavatore":
			codice = "B946";
			break;
		case "Casazza":
			codice = "B947";
			break;
		case "Cascia":
			codice = "B948";
			break;
		case "Casciago":
			codice = "B949";
			break;
		case "Cascina":
			codice = "B950";
			break;
		case "Cascinette D'Ivrea":
			codice = "B953";
			break;
		case "Casei Gerola":
			codice = "B954";
			break;
		case "Caselette":
			codice = "B955";
			break;
		case "Casella":
			codice = "B956";
			break;
		case "Caselle Lurani":
			codice = "B958";
			break;
		case "Caselle In Pittari":
			codice = "B959";
			break;
		case "Caselle Torinese":
			codice = "B960";
			break;
		case "Caselle Landi":
			codice = "B961";
			break;
		case "Caserta":
			codice = "B963";
			break;
		case "Casier":
			codice = "B965";
			break;
		case "Casignana":
			codice = "B966";
			break;
		case "Casina":
			codice = "B967";
			break;
		case "Castelsilano":
			codice = "B968";
			break;
		case "Castel Di Casio":
			codice = "B969";
			break;
		case "Casirate D'Adda":
			codice = "B971";
			break;
		case "Caslino D'Erba":
			codice = "B974";
			break;
		case "Casnate Con Bernate":
			codice = "B977";
			break;
		case "Casnigo":
			codice = "B978";
			break;
		case "Casola In Lunigiana":
			codice = "B979";
			break;
		case "Casola Di Napoli":
			codice = "B980";
			break;
		case "Casola Valsenio":
			codice = "B982";
			break;
		case "Casole Bruzio":
			codice = "B983";
			break;
		case "Casole D'Elsa":
			codice = "B984";
			break;
		case "Casoli":
			codice = "B985";
			break;
		case "Casorate Sempione":
			codice = "B987";
			break;
		case "Casorate Primo":
			codice = "B988";
			break;
		case "Casorezzo":
			codice = "B989";
			break;
		case "Casoria":
			codice = "B990";
			break;
		case "Casorzo":
			codice = "B991";
			break;
		case "Caspoggio":
			codice = "B993";
			break;
		case "Cassacco":
			codice = "B994";
			break;
		case "Cassago Brianza":
			codice = "B996";
			break;
		case "Cassano Irpino":
			codice = "B997";
			break;
		case "Cassano Delle Murge":
			codice = "B998";
			break;
		case "Cassano Valcuvia":
			codice = "B999";
			break;
		case "Cassano All'Ionio":
			codice = "C002";
			break;
		case "Cassano D'Adda":
			codice = "C003";
			break;
		case "Cassano Magnago":
			codice = "C004";
			break;
		case "Cassano Spinola":
			codice = "C005";// M388
			break;
		case "Cassaro":
			codice = "C006";
			break;
		case "Cassiglio":
			codice = "C007";
			break;
		case "Cassina Dè Pecchi":
			codice = "C014";
			break;
		case "Cassina Rizzardi":
			codice = "C020";
			break;
		case "Cassinasco":
			codice = "C022";
			break;
		case "Cassina Valvassina":
			codice = "C024";
			break;
		case "Cassine":
			codice = "C027";
			break;
		case "Cassinelle":
			codice = "C030";
			break;
		case "Cassinetta Di Lugagnano":
			codice = "C033";
			break;
		case "Cassino":
			codice = "C034";
			break;
		case "Cassola":
			codice = "C037";
			break;
		case "Cassolnovo":
			codice = "C038";
			break;
		case "Castel Castagna":
			codice = "C040";
			break;
		case "Castagnaro":
			codice = "C041";
			break;
		case "Castagneto Carducci":
			codice = "C044";
			break;
		case "Castagneto Po":
			codice = "C045";
			break;
		case "Castagnito":
			codice = "C046";
			break;
		case "Castagnole Monferrato":
			codice = "C047";
			break;
		case "Castagnole Piemonte":
			codice = "C048";
			break;
		case "Castagnole Delle Lanze":
			codice = "C049";
			break;
		case "Castana":
			codice = "C050";
			break;
		case "Castell'Umberto":
			codice = "C051";
			break;
		case "Castano Primo":
			codice = "C052";
			break;
		case "Casteggio":
			codice = "C053";
			break;
		case "Castegnato":
			codice = "C055";
			break;
		case "Castegnero":
			codice = "C056";
			break;
		case "Castelbaldo":
			codice = "C057";
			break;
		case "Castel Baronia":
			codice = "C058";
			break;
		case "Castelbelforte":
			codice = "C059";
			break;
		case "Castelbellino":
			codice = "C060";
			break;
		case "Castelbello Ciardes":
			codice = "C062";
			break;
		case "Castelbianco":
			codice = "C063";
			break;
		case "Castel Boglione":
			codice = "C064";
			break;
		case "Castel Bolognese":
			codice = "C065";
			break;
		case "Castelbottaccio":
			codice = "C066";
			break;
		case "Castelbuono":
			codice = "C067";
			break;
		case "Castelcivita":
			codice = "C069";
			break;
		case "Castel Colonna":
			codice = "C071";
			break;
		case "Castelcovati":
			codice = "C072";
			break;
		case "Castelcucco":
			codice = "C073";
			break;
		case "Casteldaccia":
			codice = "C074";
			break;
		case "Castel D'Aiano":
			codice = "C075";
			break;
		case "Castel D'Ario":
			codice = "C076";
			break;
		case "Castel D'Azzano":
			codice = "C078";
			break;
		case "Castelli Calepio":
			codice = "C079";
			break;
		case "Casteldelci":
			codice = "C080";
			break;
		case "Casteldelfino":
			codice = "C081";
			break;
		case "Castel Del Giudice":
			codice = "C082";
			break;
		case "Castel Del Monte":
			codice = "C083";
			break;
		case "Castel Del Piano":
			codice = "C085";
			break;
		case "Castel Del Rio":
			codice = "C086";
			break;
		case "Casteldidone":
			codice = "C089";
			break;
		case "Castel Di Ieri":
			codice = "C090";
			break;
		case "Castel Di Iudica":
			codice = "C091";
			break;
		case "Castel Di Lama":
			codice = "C093";
			break;
		case "Castel Di Lucio":
			codice = "C094";
			break;
		case "Castel Di Sangro":
			codice = "C096";
			break;
		case "Castel Di Sasso":
			codice = "C097";
			break;
		case "Castel Di Tora":
			codice = "C098";
			break;
		case "Castelfidardo":
			codice = "C100";
			break;
		case "Castelfiorentino":
			codice = "C101";
			break;
		case "Castel Focognano":
			codice = "C102";
			break;
		case "Castelfondo":
			codice = "C103";
			break;
		case "Castelforte":
			codice = "C104";
			break;
		case "Castelfranci":
			codice = "C105";
			break;
		case "Castelfranco In Miscano":
			codice = "C106";
			break;
		case "Castelfranco Emilia":
			codice = "C107";
			break;
		case "Castrolibero":
			codice = "C108";
			break;
		case "Castel Vittorio":
			codice = "C110";
			break;
		case "Castelfranco Veneto":
			codice = "C111";
			break;
		case "Castelfranco Di Sopra":
			codice = "C112";
			break;
		case "Castelfranco Di Sotto":
			codice = "C113";
			break;
		case "Castel Frentano":
			codice = "C114";
			break;
		case "Castel Gabbiano":
			codice = "C115";
			break;
		case "Castel Gandolfo":
			codice = "C116";
			break;
		case "Castel Giorgio":
			codice = "C117";
			break;
		case "Castel Goffredo":
			codice = "C118";
			break;
		case "Castelgomberto":
			codice = "C119";
			break;
		case "Castelgrande":
			codice = "C120";
			break;
		case "Castel Guelfo Di Bologna":
			codice = "C121";
			break;
		case "Castelguglielmo":
			codice = "C122";
			break;
		case "Castelguidone":
			codice = "C123";
			break;
		case "Castellabate":
			codice = "C125";
			break;
		case "Castellafiume":
			codice = "C126";
			break;
		case "Castell'Alfero":
			codice = "C127";
			break;
		case "Castellalto":
			codice = "C128";
			break;
		case "Castellammare Di Stabia":
			codice = "C129";
			break;
		case "Castellammare Del Golfo":
			codice = "C130";
			break;
		case "Castellamonte":
			codice = "C133";
			break;
		case "Castellana Grotte":
			codice = "C134";
			break;
		case "Castellana Sicula":
			codice = "C135";
			break;
		case "Castellaneta":
			codice = "C136";
			break;
		case "Castellania":
			codice = "C137";
			break;
		case "Castellanza":
			codice = "C139";
			break;
		case "Castellar":
			codice = "C140";
			break;
		case "Castellarano":
			codice = "C141";
			break;
		case "Castellar Guidobono":
			codice = "C142";
			break;
		case "Castellaro":
			codice = "C143";
			break;
		case "Castell'Arquato":
			codice = "C145";
			break;
		case "Castellavazzo":
			codice = "C146";
			break;
		case "Castell'Azzara":
			codice = "C147";
			break;
		case "Castellazzo Bormida":
			codice = "C148";
			break;
		case "Castellazzo Novarese":
			codice = "C149";
			break;
		case "Castelleone Di Suasa":
			codice = "C152";
			break;
		case "Castelleone":
			codice = "C153";
			break;
		case "Castellero":
			codice = "C154";
			break;
		case "Castelletto Cervo":
			codice = "C155";
			break;
		case "Castelletto D'Erro":
			codice = "C156";
			break;
		case "Castelletto Di Branduzzo":
			codice = "C157";
			break;
		case "Castelletto D'Orba":
			codice = "C158";
			break;
		case "Castelletto Merli":
			codice = "C160";
			break;
		case "Castelletto Molina":
			codice = "C161";
			break;
		case "Castelletto Monferrato":
			codice = "C162";
			break;
		case "Castelletto Stura":
			codice = "C165";
			break;
		case "Castelletto Sopra Ticino":
			codice = "C166";
			break;
		case "Castelletto Uzzone":
			codice = "C167";
			break;
		case "Castelli":
			codice = "C169";
			break;
		case "Castellina In Chianti":
			codice = "C172";
			break;
		case "Castellinaldo D'Alba":
			codice = "C173";
			break;
		case "Castellina Marittima":
			codice = "C174";
			break;
		case "Castellino Del Biferno":
			codice = "C175";
			break;
		case "Castellino Tanaro":
			codice = "C176";
			break;
		case "Castelliri":
			codice = "C177";
			break;
		case "Castello Del Matese":
			codice = "C178";
			break;
		case "Castelveccana":
			codice = "C181";
			break;
		case "Castel Condino":
			codice = "C183";
			break;
		case "Castello D'Agogna":
			codice = "C184";
			break;
		case "Castello D'Argile":
			codice = "C185";
			break;
		case "Castello Dell'Acqua":
			codice = "C186";
			break;
		case "Castello Di Brianza":
			codice = "C187";
			break;
		case "Castello Di Cisterna":
			codice = "C188";
			break;
		case "Castello-Molina Di Fiemme":
			codice = "C189";
			break;
		case "Castello Di Godego":
			codice = "C190";
			break;
		case "Castello Di Serravalle":
			codice = "C191";
			break;
		case "Castello Tesino":
			codice = "C194";
			break;
		case "Castellucchio":
			codice = "C195";
			break;
		case "Castelmauro":
			codice = "C197";
			break;
		case "Castelluccio Dei Sauri":
			codice = "C198";
			break;
		case "Castelluccio Inferiore":
			codice = "C199";
			break;
		case "Castelverrino":
			codice = "C200";
			break;
		case "Castelluccio Superiore":
			codice = "C201";
			break;
		case "Castelluccio Valmaggiore":
			codice = "C202";
			break;
		case "Castel Madama":
			codice = "C203";
			break;
		case "Castel Maggiore":
			codice = "C204";
			break;
		case "Castelmagno":
			codice = "C205";
			break;
		case "Castelmarte":
			codice = "C206";
			break;
		case "Castelmassa":
			codice = "C207";
			break;
		case "Castel Mella":
			codice = "C208";
			break;
		case "Castelmezzano":
			codice = "C209";
			break;
		case "Castelmola":
			codice = "C210";
			break;
		case "Castel Morrone":
			codice = "C211";
			break;
		case "Castelnovetto":
			codice = "C213";
			break;
		case "Castelnuovo Di Ceva":
			codice = "C214";
			break;
		case "Castelnovo Bariano":
			codice = "C215";
			break;
		case "Castelnuovo":
			codice = "C216";
			break;
		case "Castelnovo Del Friuli":
			codice = "C217";
			break;
		case "Castelnovo Di Sotto":
			codice = "C218";
			break;
		case "Castelnovo Nè Monti":
			codice = "C219";
			break;
		case "Castelnuovo Bozzente":
			codice = "C220";
			break;
		case "Castelnuovo Della Daunia":
			codice = "C222";
			break;
		case "Castelnuovo Parano":
			codice = "C223";
			break;
		case "Castelnuovo Di Farfa":
			codice = "C224";
			break;
		case "Castelnuovo Del Garda":
			codice = "C225";
			break;
		case "Castelnuovo Belbo":
			codice = "C226";
			break;
		case "Castelnuovo Berardenga":
			codice = "C227";
			break;
		case "Castelnuovo Bocca D'Adda":
			codice = "C228";
			break;
		case "Castelnuovo Bormida":
			codice = "C229";
			break;
		case "Castelnuovo Calcea":
			codice = "C230";
			break;
		case "Castelnuovo Cilento":
			codice = "C231";
			break;
		case "Castelnuovo Don Bosco":
			codice = "C232";
			break;
		case "Castelnuovo Di Conza":
			codice = "C235";
			break;
		case "Castelnuovo Di Garfagnana":
			codice = "C236";
			break;
		case "Castelnuovo Di Porto":
			codice = "C237";
			break;
		case "Castelnuovo Magra":
			codice = "C240";
			break;
		case "Castelnuovo Nigra":
			codice = "C241";
			break;
		case "Castelnuovo Rangone":
			codice = "C242";
			break;
		case "Castelnuovo Scrivia":
			codice = "C243";
			break;
		case "Castelnuovo Val Di Cecina":
			codice = "C244";
			break;
		case "Castelpagano":
			codice = "C245";
			break;
		case "Castelpetroso":
			codice = "C246";
			break;
		case "Castelpizzuto":
			codice = "C247";
			break;
		case "Castelplanio":
			codice = "C248";
			break;
		case "Castelpoto":
			codice = "C250";
			break;
		case "Castelraimondo":
			codice = "C251";
			break;
		case "Castel Ritaldi":
			codice = "C252";
			break;
		case "Castel Rocchero":
			codice = "C253";
			break;
		case "Castelrotto":
			codice = "C254";
			break;
		case "Castel Rozzone":
			codice = "C255";
			break;
		case "Castel San Giorgio":
			codice = "C259";
			break;
		case "Castel San Giovanni":
			codice = "C261";
			break;
		case "Castel San Lorenzo":
			codice = "C262";
			break;
		case "Castel San Niccolò":
			codice = "C263";
			break;
		case "Castel San Pietro Terme":
			codice = "C265";
			break;
		case "Castel San Pietro Romano":
			codice = "C266";
			break;
		case "Castelsantangelo Sul Nera":
			codice = "C267";
			break;
		case "Castel Sant'Angelo":
			codice = "C268";
			break;
		case "Castel Sant'Elia":
			codice = "C269";
			break;
		case "Castel San Vincenzo":
			codice = "C270";
			break;
		case "Castelsaraceno":
			codice = "C271";
			break;
		case "Castelsardo":
			codice = "C272";
			break;
		case "Castelseprio":
			codice = "C273";
			break;
		case "Castelspina":
			codice = "C274";
			break;
		case "Casteltermini":
			codice = "C275";
			break;
		case "Castelvecchio Di Rocca Barbena":
			codice = "C276";
			break;
		case "Castelvecchio Calvisio":
			codice = "C278";
			break;
		case "Castelvecchio Subequo":
			codice = "C279";
			break;
		case "Castelvenere":
			codice = "C280";
			break;
		case "Castelvetere Sul Calore":
			codice = "C283";
			break;
		case "Castelvetere In Val Fortore":
			codice = "C284";
			break;
		case "Caulonia":
			codice = "C285";
			break;
		case "Castelvetrano":
			codice = "C286";
			break;
		case "Castelvetro Di Modena":
			codice = "C287";
			break;
		case "Castelvetro Piacentino":
			codice = "C288";
			break;
		case "Castel Viscardo":
			codice = "C289";
			break;
		case "Castelvisconti":
			codice = "C290";
			break;
		case "Castel Volturno":
			codice = "C291";
			break;
		case "Castenaso":
			codice = "C292";
			break;
		case "Castenedolo":
			codice = "C293";
			break;
		case "Chatillon":
			codice = "B294";
			break;
		case "Castiglione Dei Pepoli":
			codice = "C296";
			break;
		case "Castiglione Di Sicilia":
			codice = "C297";
			break;
		case "Castiglione Messer Marino":
			codice = "C298";
			break;
		case "Castiglione D'Intelvi":
			codice = "C299";
			break;
		case "Castiglione Olona":
			codice = "C300";
			break;
		case "Castiglione Cosentino":
			codice = "C301";
			break;
		case "Castiglione Chiavarese":
			codice = "C302";
			break;
		case "Castiglione Di Garfagnana":
			codice = "C303";
			break;
		case "Castiglione D'Adda":
			codice = "C304";
			break;
		case "Castiglione Del Genovesi":
			codice = "C306";
			break;
		case "Castiglione Torinese":
			codice = "C307";
			break;
		case "Castiglione A Casauria":
			codice = "C308";
			break;
		case "Castiglione Del Lago":
			codice = "C309";
			break;
		case "Castiglione Della Pescaia":
			codice = "C310";
			break;
		case "Colledara":
			codice = "C311";
			break;
		case "Castiglione Delle Stiviere":
			codice = "C312";
			break;
		case "Castiglione D'Orcia":
			codice = "C313";
			break;
		case "Castiglione Falletto":
			codice = "C314";
			break;
		case "Castiglione In Teverina":
			codice = "C315";
			break;
		case "Castiglione Messer Raimondo":
			codice = "C316";
			break;
		case "Castiglione Tinella":
			codice = "C317";
			break;
		case "Castiglion Fibocchi":
			codice = "C318";
			break;
		case "Castiglion Fiorentino":
			codice = "C319";
			break;
		case "Castignano":
			codice = "C321";
			break;
		case "Castilenti":
			codice = "C322";
			break;
		case "Castino":
			codice = "C323";
			break;
		case "Castione Della Presolana":
			codice = "C324";
			break;
		case "Castione Andevenno":
			codice = "C325";
			break;
		case "Castions Di Strada":
			codice = "C327";
			break;
		case "Castiraga Vidardo":
			codice = "C329";
			break;
		case "Casto":
			codice = "C330";
			break;
		case "Castorano":
			codice = "C331";
			break;
		case "Castrezzato":
			codice = "C332";
			break;
		case "Castri Di Lecce":
			codice = "C334";
			break;
		case "Castrignano Dè Greci":
			codice = "C335";
			break;
		case "Castrignano Del Capo":
			codice = "C336";
			break;
		case "Castro":
			codice = "C337";// M261
			break;
		case "Castro Dei Volsci":
			codice = "C338";
			break;
		case "Castrocaro Terme E Terra Del Sole":
			codice = "C339";
			break;
		case "Castrocielo":
			codice = "C340";
			break;
		case "Castrofilippo":
			codice = "C341";
			break;
		case "Castronno":
			codice = "C343";
			break;
		case "Castronovo Di Sicilia":
			codice = "C344";
			break;
		case "Castronuovo Di Sant'Andrea":
			codice = "C345";
			break;
		case "Castropignano":
			codice = "C346";
			break;
		case "Castroreale":
			codice = "C347";
			break;
		case "Castroregio":
			codice = "C348";
			break;
		case "Castrovillari":
			codice = "C349";
			break;
		case "Catania":
			codice = "C351";
			break;
		case "Catanzaro":
			codice = "C352";
			break;
		case "Catenanuova":
			codice = "C353";
			break;
		case "Catignano":
			codice = "C354";
			break;
		case "Cattolica Eraclea":
			codice = "C356";
			break;
		case "Cattolica":
			codice = "C357";
			break;
		case "Cautano":
			codice = "C359";
			break;
		case "Cava Manara":
			codice = "C360";
			break;
		case "Cava Dè Tirreni":
			codice = "C361";
			break;
		case "Cavacurta":
			codice = "C362";
			break;
		case "Cavaglià":
			codice = "C363";
			break;
		case "Cavaglietto":
			codice = "C364";
			break;
		case "Cavaglio D'Agogna":
			codice = "C365";
			break;
		case "Cavaglio-Spoccia":
			codice = "C367";
			break;
		case "Cavagnolo":
			codice = "C369";
			break;
		case "Cavaion Veronese":
			codice = "C370";
			break;
		case "Cavalese":
			codice = "C372";
			break;
		case "Cavallasca":
			codice = "C374";
			break;
		case "Cavallerleone":
			codice = "C375";
			break;
		case "Cavallermaggiore":
			codice = "C376";
			break;
		case "Cavallino":
			codice = "C377";
			break;
		case "Cavallirio":
			codice = "C378";
			break;
		case "Cavareno":
			codice = "C380";
			break;
		case "Cavargna":
			codice = "C381";
			break;
		case "Cavaria Con Premezzo":
			codice = "C382";
			break;
		case "Cavarzere":
			codice = "C383";
			break;
		case "Cavaso Del Tomba":
			codice = "C384";
			break;
		case "Cavasso Nuovo":
			codice = "C385";
			break;
		case "Cavatore":
			codice = "C387";
			break;
		case "Cavazzo Carnico":
			codice = "C389";
			break;
		case "Cave":
			codice = "C390";
			break;
		case "Cavedago":
			codice = "C392";
			break;
		case "Cavedine":
			codice = "C393";
			break;
		case "Cavenago D'Adda":
			codice = "C394";
			break;
		case "Cavenago Di Brianza":
			codice = "C395";
			break;
		case "Cavernago":
			codice = "C396";
			break;
		case "Cavezzo":
			codice = "C398";
			break;
		case "Cavizzana":
			codice = "C400";
			break;
		case "Cavour":
			codice = "C404";
			break;
		case "Cavriago":
			codice = "C405";
			break;
		case "Cavriana":
			codice = "C406";
			break;
		case "Cavriglia":
			codice = "C407";
			break;
		case "Cazzago San Martino":
			codice = "C408";
			break;
		case "Cazzago Brabbia":
			codice = "C409";
			break;
		case "Cazzano Sant'Andrea":
			codice = "C410";
			break;
		case "Cazzano Di Tramigna":
			codice = "C412";
			break;
		case "Ceccano":
			codice = "C413";
			break;
		case "Cecima":
			codice = "C414";
			break;
		case "Cecina":
			codice = "C415";
			break;
		case "Cedegolo":
			codice = "C417";
			break;
		case "Cedrasco":
			codice = "C418";
			break;
		case "Cefalà Diana":
			codice = "C420";
			break;
		case "Cefalù":
			codice = "C421";
			break;
		case "Ceggia":
			codice = "C422";
			break;
		case "Ceglie Messapica":
			codice = "C424";
			break;
		case "Celano":
			codice = "C426";
			break;
		case "Celenza Sul Trigno":
			codice = "C428";
			break;
		case "Celenza Valfortore":
			codice = "C429";
			break;
		case "Celico":
			codice = "C430";
			break;
		case "Cella Monte":
			codice = "C432";
			break;
		case "Cella Dati":
			codice = "C435";
			break;
		case "Cellamare":
			codice = "C436";
			break;
		case "Cellara":
			codice = "C437";
			break;
		case "Cellarengo":
			codice = "C438";
			break;
		case "Cellatica":
			codice = "C439";
			break;
		case "Celle Enomondo":
			codice = "C440";
			break;
		case "Celle Di Macra":
			codice = "C441";
			break;
		case "Celle Di San Vito":
			codice = "C442";
			break;
		case "Celle Ligure":
			codice = "C443";
			break;
		case "Celle Di Bulgheria":
			codice = "C444";
			break;
		case "Celleno":
			codice = "C446";
			break;
		case "Cellere":
			codice = "C447";
			break;
		case "Cellino San Marco":
			codice = "C448";
			break;
		case "Cellino Attanasio":
			codice = "C449";
			break;
		case "Cellio":
			codice = "C450";
			break;
		case "Cembra":
			codice = "C452";
			break;
		case "Cenadi":
			codice = "C453";
			break;
		case "Cenate Sopra":
			codice = "C456";
			break;
		case "Cenate Sotto":
			codice = "C457";
			break;
		case "Cencenighe Agordino":
			codice = "C458";
			break;
		case "Cene":
			codice = "C459";
			break;
		case "Ceneselli":
			codice = "C461";
			break;
		case "Cengio":
			codice = "C463";
			break;
		case "Centallo":
			codice = "C466";
			break;
		case "Centa San Nicolò":
			codice = "C467";
			break;
		case "Cento":
			codice = "C469";
			break;
		case "Centola":
			codice = "C470";
			break;
		case "Centuripe":
			codice = "C471";
			break;
		case "Centrache":
			codice = "C472";
			break;
		case "Cepagatti":
			codice = "C474";
			break;
		case "Ceppaloni":
			codice = "C476";
			break;
		case "Ceppo Morelli":
			codice = "C478";
			break;
		case "Ceprano":
			codice = "C479";
			break;
		case "Cerami":
			codice = "C480";
			break;
		case "Ceranesi":
			codice = "C481";
			break;
		case "Cerano D'Intelvi":
			codice = "C482";
			break;
		case "Cerano":
			codice = "C483";
			break;
		case "Ceranova":
			codice = "C484";
			break;
		case "Ceraso":
			codice = "C485";
			break;
		case "Cercemaggiore":
			codice = "C486";
			break;
		case "Cercenasco":
			codice = "C487";
			break;
		case "Cercepiccola":
			codice = "C488";
			break;
		case "Cerchiara Di Calabria":
			codice = "C489";
			break;
		case "Cerchio":
			codice = "C492";
			break;
		case "Cercino":
			codice = "C493";
			break;
		case "Cercivento":
			codice = "C494";
			break;
		case "Cercola":
			codice = "C495";
			break;
		case "Cerda":
			codice = "C496";
			break;
		case "Ceres":
			codice = "C497";
			break;
		case "Cerea":
			codice = "C498";
			break;
		case "Ceregnano":
			codice = "C500";
			break;
		case "Cerenzia":
			codice = "C501";
			break;
		case "Ceresara":
			codice = "C502";
			break;
		case "Cereseto":
			codice = "C503";
			break;
		case "Ceresole Alba":
			codice = "C504";
			break;
		case "Ceresole Reale":
			codice = "C505";
			break;
		case "Cerete":
			codice = "C506";
			break;
		case "Cerreto Grue":
			codice = "C507";
			break;
		case "Ceretto Lomellina":
			codice = "C508";
			break;
		case "Cergnago":
			codice = "C509";
			break;
		case "Ceriale":
			codice = "C510";
			break;
		case "Ceriana":
			codice = "C511";
			break;
		case "Ceriano Laghetto":
			codice = "C512";
			break;
		case "Cerignale":
			codice = "C513";
			break;
		case "Cerignola":
			codice = "C514";
			break;
		case "Cerisano":
			codice = "C515";
			break;
		case "Cermenate":
			codice = "C516";
			break;
		case "Cermignano":
			codice = "C517";
			break;
		case "Cerreto Laziale":
			codice = "C518";
			break;
		case "Cernobbio":
			codice = "C520";
			break;
		case "Cernusco Lombardone":
			codice = "C521";
			break;
		case "Cernusco Sul Naviglio":
			codice = "C523";
			break;
		case "Cerreto D'Esi":
			codice = "C524";
			break;
		case "Cerreto Sannita":
			codice = "C525";
			break;
		case "Cerreto Castello":
			codice = "C526";
			break;
		case "Cerreto Di Spoleto":
			codice = "C527";
			break;
		case "Cerreto D'Asti":
			codice = "C528";
			break;
		case "Cerreto Guidi":
			codice = "C529";
			break;
		case "Cerretto Langhe":
			codice = "C530";
			break;
		case "Cerrina Monferrato":
			codice = "C531";
			break;
		case "Cerrione":
			codice = "C532";
			break;
		case "Cerro Tanaro":
			codice = "C533";
			break;
		case "Cerro Al Volturno":
			codice = "C534";
			break;
		case "Cerro Al Lambro":
			codice = "C536";
			break;
		case "Cerro Maggiore":
			codice = "C537";
			break;
		case "Cerro Veronese":
			codice = "C538";
			break;
		case "Cersosimo":
			codice = "C539";
			break;
		case "Certaldo":
			codice = "C540";
			break;
		case "Certosa Di Pavia":
			codice = "C541";
			break;
		case "Cerva":
			codice = "C542";
			break;
		case "Cervara Di Roma":
			codice = "C543";
			break;
		case "Cervarese Santa Croce":
			codice = "C544";
			break;
		case "Cervaro":
			codice = "C545";
			break;
		case "Cervasca":
			codice = "C547";
			break;
		case "Cervatto":
			codice = "C548";
			break;
		case "Cerveno":
			codice = "C549";
			break;
		case "Cervere":
			codice = "C550";
			break;
		case "Cervesina":
			codice = "C551";
			break;
		case "Cerveteri":
			codice = "C552";
			break;
		case "Cervia":
			codice = "C553";
			break;
		case "Cervicati":
			codice = "C554";
			break;
		case "Cervignano D'Adda":
			codice = "C555";
			break;
		case "Cervignano Del Friuli":
			codice = "C556";
			break;
		case "Cervinara":
			codice = "C557";
			break;
		case "Cervino":
			codice = "C558";
			break;
		case "Cervo":
			codice = "C559";
			break;
		case "Cerzeto":
			codice = "C560";
			break;
		case "Cesa":
			codice = "C561";
			break;
		case "Cesana Brianza":
			codice = "C563";
			break;
		case "Cesana Torinese":
			codice = "C564";
			break;
		case "Cesano Boscone":
			codice = "C565";
			break;
		case "Cesano Maderno":
			codice = "C566";
			break;
		case "Cesara":
			codice = "C567";
			break;
		case "Cesarò":
			codice = "C568";
			break;
		case "Cesate":
			codice = "C569";
			break;
		case "Cesena":
			codice = "C573";
			break;
		case "Cesenatico":
			codice = "C574";
			break;
		case "Cesinali":
			codice = "C576";
			break;
		case "Cesiomaggiore":
			codice = "C577";
			break;
		case "Cesio":
			codice = "C578";
			break;
		case "Cessalto":
			codice = "C580";
			break;
		case "Cessaniti":
			codice = "C581";
			break;
		case "Cessapalombo":
			codice = "C582";
			break;
		case "Cessole":
			codice = "C583";
			break;
		case "Cetara":
			codice = "C584";
			break;
		case "Ceto":
			codice = "C585";
			break;
		case "Cetona":
			codice = "C587";
			break;
		case "Cetraro":
			codice = "C588";
			break;
		case "Ceva":
			codice = "C589";
			break;
		case "Cevo":
			codice = "C591";
			break;
		case "Challand-Saint-Anselme":
			codice = "C593";
			break;
		case "Challand-Saint-Victor":
			codice = "C594";
			break;
		case "Chambave":
			codice = "C595";
			break;
		case "Champdepraz":
			codice = "C596";
			break;
		case "Charvensod":
			codice = "C598";
			break;
		case "Cherasco":
			codice = "C599";
			break;
		case "Cheremule":
			codice = "C600";
			break;
		case "Chialamberto":
			codice = "C604";
			break;
		case "Chiampo":
			codice = "C605";
			break;
		case "Chianche":
			codice = "C606";
			break;
		case "Chianciano Terme":
			codice = "C608";
			break;
		case "Chianni":
			codice = "C609";
			break;
		case "Chianocco":
			codice = "C610";
			break;
		case "Chiaramonte Gulfi":
			codice = "C612";
			break;
		case "Chiaramonti":
			codice = "C613";
			break;
		case "Chiarano":
			codice = "C614";
			break;
		case "Chiaravalle":
			codice = "C615";
			break;
		case "Chiaravalle Centrale":
			codice = "C616";
			break;
		case "Chiari":
			codice = "C618";
			break;
		case "Chiaromonte":
			codice = "C619";
			break;
		case "Chiauci":
			codice = "C620";
			break;
		case "Chiavari":
			codice = "C621";
			break;
		case "Chiavenna":
			codice = "C623";
			break;
		case "Chiaverano":
			codice = "C624";
			break;
		case "Chienes":
			codice = "C625";
			break;
		case "Chieri":
			codice = "C627";
			break;
		case "Chiesa In Valmalenco":
			codice = "C628";
			break;
		case "Chiesanuova":
			codice = "C629";
			break;
		case "Chies D'Alpago":
			codice = "C630";
			break;
		case "Chiesina Uzzanese":
			codice = "C631";
			break;
		case "Chieti":
			codice = "C632";
			break;
		case "Chieuti":
			codice = "C633";
			break;
		case "Chieve":
			codice = "C634";
			break;
		case "Chignolo D'Isola":
			codice = "C635";
			break;
		case "Chignolo Po":
			codice = "C637";
			break;
		case "Chioggia":
			codice = "C638";
			break;
		case "Chiomonte":
			codice = "C639";
			break;
		case "Chions":
			codice = "C640";
			break;
		case "Chiopris Viscone":
			codice = "C641";
			break;
		case "Chitignano":
			codice = "C648";
			break;
		case "Chiuduno":
			codice = "C649";
			break;
		case "Chiuppano":
			codice = "C650";
			break;
		case "Chiuro":
			codice = "C651";
			break;
		case "Chiusa":
			codice = "C652";
			break;
		case "Chiusa Di Pesio":
			codice = "C653";
			break;
		case "Chiusa Sclafani":
			codice = "C654";
			break;
		case "Chiusa Di San Michele":
			codice = "C655";
			break;
		case "Chiusaforte":
			codice = "C656";
			break;
		case "Chiusanico":
			codice = "C657";
			break;
		case "Chiusano D'Asti":
			codice = "C658";
			break;
		case "Chiusano Di San Domenico":
			codice = "C659";
			break;
		case "Chiusavecchia":
			codice = "C660";
			break;
		case "Chiusdino":
			codice = "C661";
			break;
		case "Chiusi":
			codice = "C662";
			break;
		case "Chiusi Della Verna":
			codice = "C663";
			break;
		case "Chivasso":
			codice = "C665";
			break;
		case "Cianciana":
			codice = "C668";
			break;
		case "Crocetta Del Montello":
			codice = "C670";
			break;
		case "Cibiana Di Cadore":
			codice = "C672";
			break;
		case "Cicagna":
			codice = "C673";
			break;
		case "Cicala":
			codice = "C674";
			break;
		case "Cicciano":
			codice = "C675";
			break;
		case "Cicereale":
			codice = "C676";
			break;
		case "Ciciliano":
			codice = "C677";
			break;
		case "Cicognolo":
			codice = "C678";
			break;
		case "Ciconio":
			codice = "C679";
			break;
		case "Cigliano":
			codice = "C680";
			break;
		case "Cigliè":
			codice = "C681";
			break;
		case "Cigognola":
			codice = "C684";
			break;
		case "Cigole":
			codice = "C685";
			break;
		case "Cilavegna":
			codice = "C686";
			break;
		case "Cimadolmo":
			codice = "C689";
			break;
		case "Cimbergo":
			codice = "C691";
			break;
		case "Cimego":
			codice = "C694";
			break;
		case "Ciminà":
			codice = "C695";
			break;
		case "Ciminna":
			codice = "C696";
			break;
		case "Cimitile":
			codice = "C697";
			break;
		case "Cimolais":
			codice = "C699";
			break;
		case "Cimone":
			codice = "C700";
			break;
		case "Cinaglio":
			codice = "C701";
			break;
		case "Cineto Romano":
			codice = "C702";
			break;
		case "Cingia Dè Botti":
			codice = "C703";
			break;
		case "Cingoli":
			codice = "C704";
			break;
		case "Cinigiano":
			codice = "C705";
			break;
		case "Cinisello Balsamo":
			codice = "C707";
			break;
		case "Cinisi":
			codice = "C708";
			break;
		case "Cino":
			codice = "C709";
			break;
		case "Cinquefrondi":
			codice = "C710";
			break;
		case "Cintano":
			codice = "C711";
			break;
		case "Cinte Tesino":
			codice = "C712";
			break;
		case "Cinto Euganeo":
			codice = "C713";
			break;
		case "Cinto Caomaggiore":
			codice = "C714";
			break;
		case "Cinzano":
			codice = "C715";
			break;
		case "Ciorlano":
			codice = "C716";
			break;
		case "Cipressa":
			codice = "C718";
			break;
		case "Circello":
			codice = "C719";
			break;
		case "Ciriè":
			codice = "C722";
			break;
		case "Cirigliano":
			codice = "C723";
			break;
		case "Cirmido":
			codice = "C724";
			break;
		case "Cirò":
			codice = "C725";
			break;
		case "Cirò Marina":
			codice = "C726";
			break;
		case "Cis":
			codice = "C727";
			break;
		case "Cisano Bergamasco":
			codice = "C728";
			break;
		case "Cisano Sul Neva":
			codice = "C729";
			break;
		case "Ciserano":
			codice = "C730";
			break;
		case "Cislago":
			codice = "C732";
			break;
		case "Cisliano":
			codice = "C733";
			break;
		case "Cismon Del Grappa":
			codice = "C734";
			break;
		case "Cison Di Valmarino":
			codice = "C735";
			break;
		case "Cissone":
			codice = "C738";
			break;
		case "Cisterna D'Asti":
			codice = "C739";
			break;
		case "Cisterna Di Latina":
			codice = "C740";
			break;
		case "Cisternino":
			codice = "C741";
			break;
		case "Citerna":
			codice = "C742";
			break;
		case "Cittadella":
			codice = "C743";
			break;
		case "Città Della Pieve":
			codice = "C744";
			break;
		case "Città Di Castello":
			codice = "C745";
			break;
		case "Citttaducale":
			codice = "C746";
			break;
		case "Cittanova":
			codice = "C747";
			break;
		case "Cittareale":
			codice = "C749";
			break;
		case "Città Sant'Angelo":
			codice = "C750";
			break;
		case "Cittiglio":
			codice = "C751";
			break;
		case "Civate":
			codice = "C752";
			break;
		case "Civenna":
			codice = "C754";
			break;
		case "Civezza":
			codice = "C755";
			break;
		case "Civezzano":
			codice = "C756";
			break;
		case "Civiasco":
			codice = "C757";
			break;
		case "Cividale Del Friuli":
			codice = "C758";
			break;
		case "Cividate Al Piano":
			codice = "C759";
			break;
		case "Cividate Camuno":
			codice = "C760";
			break;
		case "Civita":
			codice = "C763";
			break;
		case "Civitacampomarano":
			codice = "C764";
			break;
		case "Civita Castellana":
			codice = "C765";
			break;
		case "Civita D'Antino":
			codice = "C766";
			break;
		case "Civitaluparella":
			codice = "C768";
			break;
		case "Civitanova Del Sannio":
			codice = "C769";
			break;
		case "Civitanova Marche":
			codice = "C770";
			break;
		case "Civitaquana":
			codice = "C771";
			break;
		case "Civitavecchia":
			codice = "C773";
			break;
		case "Civitella In Val Di Chiana":
			codice = "C774";
			break;
		case "Civitella Messer Raimondo":
			codice = "C776";
			break;
		case "Civitella Di Romagna":
			codice = "C777";
			break;
		case "Civitella Alfedena":
			codice = "C778";
			break;
		case "Civitella Casanova":
			codice = "C779";
			break;
		case "Civitella D'Agliano":
			codice = "C780";
			break;
		case "Civitella Del Tronto":
			codice = "C781";
			break;
		case "Civitella Paganico":
			codice = "C782";
			break;
		case "Civitella Roveto":
			codice = "C783";
			break;
		case "Civitella San Paolo":
			codice = "C784";
			break;
		case "Civo":
			codice = "C785";
			break;
		case "Claino Con Osteno":
			codice = "C787";
			break;
		case "Claut":
			codice = "C790";
			break;
		case "Clauzetto":
			codice = "C791";
			break;
		case "Clavesana":
			codice = "C792";
			break;
		case "Claviere":
			codice = "C793";
			break;
		case "Cles":
			codice = "C794";
			break;
		case "Cleto":
			codice = "C795";
			break;
		case "Clivio":
			codice = "C796";
			break;
		case "Cloz":
			codice = "C797";
			break;
		case "Clusone":
			codice = "C800";
			break;
		case "Coassolo Torinese":
			codice = "C801";
			break;
		case "Coazze":
			codice = "C803";
			break;
		case "Coazzolo":
			codice = "C804";
			break;
		case "Coccaglio":
			codice = "C806";
			break;
		case "Cocconato":
			codice = "C807";
			break;
		case "Cocquio-Trevisago":
			codice = "C810";
			break;
		case "Cocullo":
			codice = "C811";
			break;
		case "Codevigo":
			codice = "C812";
			break;
		case "Codevilla":
			codice = "C813";
			break;
		case "Codigoro":
			codice = "C814";
			break;
		case "Ciodognè":
			codice = "C815";
			break;
		case "Codogno":
			codice = "C816";
			break;
		case "Codroipo":
			codice = "C817";
			break;
		case "Codrongianos":
			codice = "C818";
			break;
		case "Coggiola":
			codice = "C819";
			break;
		case "Cogliate":
			codice = "C820";
			break;
		case "Cogne":
			codice = "C821";
			break;
		case "Cogoleto":
			codice = "C823";
			break;
		case "Cogollo Del Cengio":
			codice = "C824";
			break;
		case "Cogorno":
			codice = "C826";
			break;
		case "Colazza":
			codice = "C829";
			break;
		case "Colbordolo":
			codice = "C830";
			break;
		case "Colere":
			codice = "C835";
			break;
		case "Colfelice":
			codice = "C836";
			break;
		case "Coli":
			codice = "C838";
			break;
		case "Colico":
			codice = "C839";
			break;
		case "Collagna":
			codice = "C840";
			break;
		case "Collalto Sabino":
			codice = "C841";
			break;
		case "Collarmele":
			codice = "C844";
			break;
		case "Collazzone":
			codice = "C845";
			break;
		case "Colle Sannita":
			codice = "C846";
			break;
		case "Colle Di Val D'Elsa":
			codice = "C847";
			break;
		case "Colle Umberto":
			codice = "C848";
			break;
		case "Collebeato":
			codice = "C850";
			break;
		case "Colle Brianza":
			codice = "C851";
			break;
		case "Collecchio":
			codice = "C852";
			break;
		case "Collecorvino":
			codice = "C853";
			break;
		case "Colle D'Anchise":
			codice = "C854";
			break;
		case "Colledimacine":
			codice = "C855";
			break;
		case "Colledimezzo":
			codice = "C856";
			break;
		case "Colle Di Tora":
			codice = "C857";
			break;
		case "Colleferro":
			codice = "C858";
			break;
		case "Collegiove":
			codice = "C859";
			break;
		case "Collegno":
			codice = "C860";
			break;
		case "Collelongo":
			codice = "C862";
			break;
		case "Collepardo":
			codice = "C864";
			break;
		case "Collepasso":
			codice = "C865";
			break;
		case "Collepietro":
			codice = "C866";
			break;
		case "Colleretto Castelnuovo":
			codice = "C867";
			break;
		case "Colleretto Giacosa":
			codice = "C868";
			break;
		case "Collesalvetti":
			codice = "C869";
			break;
		case "Colle San Magno":
			codice = "C870";
			break;
		case "Collesano":
			codice = "C871";
			break;
		case "Colle Santa Lucia":
			codice = "C872";
			break;
		case "Colletorto":
			codice = "C875";
			break;
		case "Collevecchio":
			codice = "C876";
			break;
		case "Colli Del Tronto":
			codice = "C877";
			break;
		case "Colli A Volturno":
			codice = "C878";
			break;
		case "Colliano":
			codice = "C879";
			break;
		case "Colli Sul Velino":
			codice = "C880";
			break;
		case "Collinas":
			codice = "C882";
			break;
		case "Collio":
			codice = "C883";
			break;
		case "Collobiano":
			codice = "C884";
			break;
		case "Colloredo Di Monte Albano":
			codice = "C885";
			break;
		case "Colmurano":
			codice = "C886";
			break;
		case "Colobraro":
			codice = "C888";
			break;
		case "Cologna Veneta":
			codice = "C890";
			break;
		case "Cologne":
			codice = "C893";
			break;
		case "Cologno Al Serio":
			codice = "C894";
			break;
		case "Cologno Monzese":
			codice = "C895";
			break;
		case "Colognola Ai Colli":
			codice = "C897";
			break;
		case "Colonna":
			codice = "C900";
			break;
		case "Colonnella":
			codice = "C901";
			break;
		case "Colonno":
			codice = "C902";
			break;
		case "Colorina":
			codice = "C903";
			break;
		case "Colorno":
			codice = "C904";
			break;
		case "Colosimi":
			codice = "C905";
			break;
		case "Colturano":
			codice = "C908";
			break;
		case "Colzate":
			codice = "C910";
			break;
		case "Comabbio":
			codice = "C911";
			break;
		case "Comacchio":
			codice = "C912";
			break;
		case "Comano":
			codice = "C914";
			break;
		case "Comazzo":
			codice = "C917";
			break;
		case "Comeglians":
			codice = "C918";
			break;
		case "Comelico Superiore":
			codice = "C920";
			break;
		case "Comerio":
			codice = "C922";
			break;
		case "Comezzano-Cizzago":
			codice = "C925";
			break;
		case "Comignago":
			codice = "C926";
			break;
		case "Comiso":
			codice = "C927";
			break;
		case "Comitini":
			codice = "C928";
			break;
		case "Comiziano":
			codice = "C929";
			break;
		case "Commessaggio":
			codice = "C930";
			break;
		case "Commezzadura":
			codice = "C931";
			break;
		case "Como":
			codice = "C933";
			break;
		case "Compiano":
			codice = "C934";
			break;
		case "Comunanza":
			codice = "C935";
			break;
		case "Comun Nuovo":
			codice = "C937";
			break;
		case "Cona":
			codice = "C938";
			break;
		case "Conca Della Campania":
			codice = "C939";
			break;
		case "Conca Dei Marini":
			codice = "C940";
			break;
		case "Conca Casale":
			codice = "C941";
			break;
		case "Concamarise":
			codice = "C943";
			break;
		case "Concei":
			codice = "C944";
			break;
		case "Concerviano":
			codice = "C946";
			break;
		case "Concesio":
			codice = "C948";
			break;
		case "Conco":
			codice = "C949";
			break;
		case "Concordia Sagittaria":
			codice = "C950";
			break;
		case "Concordia Sulla Secchia":
			codice = "C951";
			break;
		case "Concorezzo":
			codice = "C952";
			break;
		case "Condino":
			codice = "C953";
			break;
		case "Condofuri":
			codice = "C954";
			break;
		case "Condove":
			codice = "C955";
			break;
		case "Condrò":
			codice = "C956";
			break;
		case "Conegliano":
			codice = "C957";
			break;
		case "Confienza":
			codice = "C958";
			break;
		case "Configni":
			codice = "C959";
			break;
		case "Conflenti":
			codice = "C960";
			break;
		case "Coniolo":
			codice = "C962";
			break;
		case "Conselice":
			codice = "C963";
			break;
		case "Conselve":
			codice = "C964";
			break;
		case "Consiglio Di Rumo":
			codice = "C965";
			break;
		case "Contessa Entelliana":
			codice = "C968";
			break;
		case "Contigliano":
			codice = "C969";
			break;
		case "Contrada":
			codice = "C971";
			break;
		case "Controguerra":
			codice = "C972";
			break;
		case "Controne":
			codice = "C973";
			break;
		case "Contursi Terme":
			codice = "C974";
			break;
		case "Conversano":
			codice = "C975";
			break;
		case "Conza Della Campania":
			codice = "C976";
			break;
		case "Conzano":
			codice = "C977";
			break;
		case "Copertino":
			codice = "C978";
			break;
		case "Copiano":
			codice = "C979";
			break;
		case "Copparo":
			codice = "C980";
			break;
		case "Corana":
			codice = "C982";
			break;
		case "Corato":
			codice = "C983";
			break;
		case "Corbara":
			codice = "C984";
			break;
		case "Corbetta":
			codice = "C986";
			break;
		case "Corbola":
			codice = "C987";
			break;
		case "Corchiano":
			codice = "C988";
			break;
		case "Corciano":
			codice = "C990";
			break;
		case "Cordenons":
			codice = "C991";
			break;
		case "Cordignano":
			codice = "C992";
			break;
		case "Cordovado":
			codice = "C993";
			break;
		case "Coredo":
			codice = "C994";
			break;
		case "Coreglia Ligure":
			codice = "C995";
			break;
		case "Coreno Ausonio":
			codice = "C998";
			break;
		case "Corfinio":
			codice = "C999";
			break;
		case "Cori":
			codice = "D003";
			break;
		case "Coriano":
			codice = "D004";
			break;
		case "Corigliano Calabro":
			codice = "D005";
			break;
		case "Corigliano D'Otranto":
			codice = "D006";
			break;
		case "Corinaldo":
			codice = "D007";
			break;
		case "Corio":
			codice = "D008";
			break;
		case "Corleone":
			codice = "D009";
			break;
		case "Corleto Perticara":
			codice = "D010";
			break;
		case "Corleto Monforte":
			codice = "D011";
			break;
		case "Courmayeur":
			codice = "D012";
			break;
		case "Cormano":
			codice = "D013";
			break;
		case "Cormons":
			codice = "D014";
			break;
		case "Corna Imagna":
			codice = "D015";
			break;
		case "Cornalba":
			codice = "D016";
			break;
		case "Cornale":
			codice = "D017";
			break;
		case "Cornaredo":
			codice = "D018";
			break;
		case "Cornate D'Adda":
			codice = "D019";
			break;
		case "Cornedo Vicentino":
			codice = "D020";
			break;
		case "Cornegliano Laudense":
			codice = "D021";
			break;
		case "Corneliano D'Alba":
			codice = "D022";
			break;
		case "Corniglio":
			codice = "D026";
			break;
		case "Corno Di Rosazzo":
			codice = "D027";
			break;
		case "Corno Giovine":
			codice = "D028";
			break;
		case "Cornovecchio":
			codice = "D029";
			break;
		case "Cornuda":
			codice = "D030";
			break;
		case "Correggio":
			codice = "D037";
			break;
		case "Correzzana":
			codice = "D038";
			break;
		case "Correzzola":
			codice = "D040";
			break;
		case "Corrido":
			codice = "D041";
			break;
		case "Corridonia":
			codice = "D042";
			break;
		case "Corropoli":
			codice = "D043";
			break;
		case "Corsano":
			codice = "D044";
			break;
		case "Corsico":
			codice = "D045";
			break;
		case "Corsione":
			codice = "D046";
			break;
		case "Cortaccia Sulla Strada Del Vino":
			codice = "D048";
			break;
		case "Cortale":
			codice = "D049";
			break;
		case "Cortandone":
			codice = "D050";
			break;
		case "Cortanze":
			codice = "D051";
			break;
		case "Cortazzone":
			codice = "D052";
			break;
		case "Corte Brugnatella":
			codice = "D054";
			break;
		case "Corte Dè Cortesi Con Cignone":
			codice = "D056";
			break;
		case "Corte Dè Frati":
			codice = "D057";
			break;
		case "Corte Franca":
			codice = "D058";
			break;
		case "Cortemaggiore":
			codice = "D061";
			break;
		case "Cortemilia":
			codice = "D062";
			break;
		case "Corteno Golgi":
			codice = "D064";
			break;
		case "Cortenova":
			codice = "D065";
			break;
		case "Cortenuova":
			codice = "D066";
			break;
		case "Corteolona":
			codice = "D067";
			break;
		case "Corte Palasio":
			codice = "D068";
			break;
		case "Cortiglione":
			codice = "D072";
			break;
		case "Cortina Sulla Strada Del Vino":
			codice = "D075";
			break;
		case "Cortino":
			codice = "D076";
			break;
		case "Cortona":
			codice = "D077";
			break;
		case "Corvara":
			codice = "D078";
			break;
		case "Corvara In Badia":
			codice = "D079";
			break;
		case "Corvino San Quirico":
			codice = "D081";
			break;
		case "Corzano":
			codice = "D082";
			break;
		case "Coseano":
			codice = "D085";
			break;
		case "Cosenza":
			codice = "D086";
			break;
		case "Cosio D'Arroscia":
			codice = "D087";
			break;
		case "Cosio Valtellino":
			codice = "D088";
			break;
		case "Cosoleto":
			codice = "D089";
			break;
		case "Cossano Canavese":
			codice = "D092";
			break;
		case "Cossano Belbo":
			codice = "D093";
			break;
		case "Cossato":
			codice = "D094";
			break;
		case "Cosseria":
			codice = "D095";
			break;
		case "Cossignano":
			codice = "D096";
			break;
		case "Cossogno":
			codice = "D099";
			break;
		case "Cossoine":
			codice = "D100";
			break;
		case "Cossombrato":
			codice = "D101";
			break;
		case "Costa Vescovato":
			codice = "D102";
			break;
		case "Costa Valle Imagna":
			codice = "D103";
			break;
		case "Costa Di Rovigo":
			codice = "D105";
			break;
		case "Costabissara":
			codice = "D107";
			break;
		case "Costacciaro":
			codice = "D108";
			break;
		case "Costa Dè Nobili":
			codice = "D109";
			break;
		case "Costa Di Mezzate":
			codice = "D110";
			break;
		case "Costa Serina":
			codice = "D111";
			break;
		case "Costa Masnaga":
			codice = "D112";
			break;
		case "Costanzana":
			codice = "D113";
			break;
		case "Costarainera":
			codice = "D114";
			break;
		case "Costa Volpino":
			codice = "D117";
			break;
		case "Costermano Sul Garda":
			codice = "D118";
			break;
		case "Costigliole D'Asti":
			codice = "D119";
			break;
		case "Costigliole Saluzzo":
			codice = "D120";
			break;
		case "Cotignola":
			codice = "D121";
			break;
		case "Crotone":
			codice = "D122";
			break;
		case "Cotronei":
			codice = "D123";
			break;
		case "Cottanello":
			codice = "D124";
			break;
		case "Covo":
			codice = "D126";
			break;
		case "Cozzo":
			codice = "D127";
			break;
		case "Craco":
			codice = "D128";
			break;
		case "Crandola Valsassina":
			codice = "D131";
			break;
		case "Cravagliana":
			codice = "D132";
			break;
		case "Cravanzana":
			codice = "D133";
			break;
		case "Craveggia":
			codice = "D134";
			break;
		case "Creazzo":
			codice = "D136";
			break;
		case "Crecchio":
			codice = "D137";
			break;
		case "Credaro":
			codice = "D139";
			break;
		case "Credera Rubbiano":
			codice = "D141";
			break;
		case "Crema":
			codice = "D142";
			break;
		case "Cremella":
			codice = "D143";
			break;
		case "Cremenaga":
			codice = "D144";
			break;
		case "Cremeno":
			codice = "D145";
			break;
		case "Cremia":
			codice = "D147";
			break;
		case "Cremolino":
			codice = "D149";
			break;
		case "Cremona":
			codice = "D150";
			break;
		case "Cremosano":
			codice = "D151";
			break;
		case "Crescentino":
			codice = "D154";
			break;
		case "Crespadoro":
			codice = "D156";
			break;
		case "Crespano Del Grappa":
			codice = "D157";
			break;
		case "Crespellano":
			codice = "D158";
			break;
		case "Crespiatica":
			codice = "D159";
			break;
		case "Crespina":
			codice = "D160";
			break;
		case "Crespino":
			codice = "D161";
			break;
		case "Cressa":
			codice = "D162";
			break;
		case "Crevacuore":
			codice = "D165";
			break;
		case "Crevalcore":
			codice = "D166";
			break;
		case "Crevoladossola":
			codice = "D168";
			break;
		case "Crispano":
			codice = "D170";
			break;
		case "Crispiano":
			codice = "D171";
			break;
		case "Crissolo":
			codice = "D172";
			break;
		case "Crocefieschi":
			codice = "D175";
			break;
		case "Crodo":
			codice = "D177";
			break;
		case "Crognaleto":
			codice = "D179";
			break;
		case "Cropalati":
			codice = "D180";
			break;
		case "Cropani":
			codice = "D181";
			break;
		case "Crosa":
			codice = "D182";
			break;
		case "Crosia":
			codice = "D184";
			break;
		case "Crosio Della Valle":
			codice = "D185";
			break;
		case "Crotta D'Adda":
			codice = "D186";
			break;
		case "Crova":
			codice = "D187";
			break;
		case "Croviana":
			codice = "D188";
			break;
		case "Crucoli":
			codice = "D189";
			break;
		case "Cuasso Al Monte":
			codice = "D192";
			break;
		case "Cuccaro Monferrato":
			codice = "D194";
			break;
		case "Cuccaro Vetere":
			codice = "D195";
			break;
		case "Cucciago":
			codice = "D196";
			break;
		case "Cuceglio":
			codice = "D197";
			break;
		case "Cuggiono":
			codice = "D198";
			break;
		case "Cugliate-Fabiasco":
			codice = "D199";
			break;
		case "Cuglieri":
			codice = "D200";
			break;
		case "Cugnoli":
			codice = "D201";
			break;
		case "Cumiana":
			codice = "D202";
			break;
		case "Cumignano Sul Naviglio":
			codice = "D203";
			break;
		case "Cunardo":
			codice = "D204";
			break;
		case "Cuneo":
			codice = "D205";
			break;
		case "Cunevo":
			codice = "D206";
			break;
		case "Cunico":
			codice = "D207";
			break;
		case "Cuorgnè":
			codice = "D208";
			break;
		case "Cupello":
			codice = "D209";
			break;
		case "Cupra Marittima":
			codice = "D210";
			break;
		case "Cupramontana":
			codice = "D211";
			break;
		case "Curcuris":
			codice = "D214";
			break;
		case "Cureggio":
			codice = "D216";
			break;
		case "Curiglia Con Monteviasco":
			codice = "D217";
			break;
		case "Curinga":
			codice = "D218";
			break;
		case "Curino":
			codice = "D219";
			break;
		case "Curno":
			codice = "D221";
			break;
		case "Curon Venosta":
			codice = "D222";
			break;
		case "Cursi":
			codice = "D223";
			break;
		case "Cursolo-Orasso":
			codice = "D225";
			break;
		case "Curtarolo":
			codice = "D226";
			break;
		case "Curtatone":
			codice = "D227";
			break;
		case "Curti":
			codice = "D228";
			break;
		case "Cusago":
			codice = "D229";
			break;
		case "Cusano Mutri":
			codice = "D230";
			break;
		case "Cusano Milanino":
			codice = "D231";
			break;
		case "Cusino":
			codice = "D232";
			break;
		case "Cusio":
			codice = "D233";
			break;
		case "Custonaci":
			codice = "D234";
			break;
		case "Cutigliano":
			codice = "D235";
			break;
		case "Cutro":
			codice = "D236";
			break;
		case "Cutrofiano":
			codice = "D237";
			break;
		case "Cuveglio":
			codice = "D238";
			break;
		case "Cuvio":
			codice = "D239";
			break;
		}

	}

	private void codiciComuniD(String comune) {

		switch (comune) {

		case "Duronia":
			codice = "C772";
			break;
		case "Due Carrare":
			codice = "M300";
			break;
		case "Dimaro Folgarida":
			codice = "M366";
			break;
		case "Daiano":
			codice = "D243";
			break;
		case "Dairago":
			codice = "D244";
			break;
		case "Dalmine":
			codice = "D245";
			break;
		case "Dambel":
			codice = "D246";
			break;
		case "Danta Di Cadore":
			codice = "D247";
			break;
		case "Daone":
			codice = "D248";
			break;
		case "Darè":
			codice = "D250";
			break;
		case "Darfo Boario Terme":
			codice = "D251";
			break;
		case "Dasà":
			codice = "D253";
			break;
		case "Davagna":
			codice = "D255";
			break;
		case "Daverio":
			codice = "D256";
			break;
		case "Davoli":
			codice = "D257";
			break;
		case "Dazio":
			codice = "D258";
			break;
		case "Decimomannu":
			codice = "D259";
			break;
		case "Decimoputzu":
			codice = "D260";
			break;
		case "Decollatura":
			codice = "D261";
			break;
		case "Dego":
			codice = "D264";
			break;
		case "Deiva Marina":
			codice = "D265";
			break;
		case "Delebio":
			codice = "D266";
			break;
		case "Delia":
			codice = "D267";
			break;
		case "Delianuova":
			codice = "D268";
			break;
		case "Deliceto":
			codice = "D269";
			break;
		case "Dello":
			codice = "D270";
			break;
		case "Demonte":
			codice = "D271";
			break;
		case "Denice":
			codice = "D272";
			break;
		case "Denno":
			codice = "D273";
			break;
		case "Dernice":
			codice = "D277";
			break;
		case "Derovere":
			codice = "D278";
			break;
		case "Deruta":
			codice = "D279";
			break;
		case "Dervio":
			codice = "D280";
			break;
		case "Desana":
			codice = "D281";
			break;
		case "Desenzano Del Garda":
			codice = "D284";
			break;
		case "Desio":
			codice = "D286";
			break;
		case "Desulo":
			codice = "D287";
			break;
		case "Diamante":
			codice = "D289";
			break;
		case "Diano D'Alba":
			codice = "D291";
			break;
		case "Diano Arentino":
			codice = "D293";
			break;
		case "Diano Castello":
			codice = "D296";
			break;
		case "Diano Marina":
			codice = "D297";
			break;
		case "Diano San Pietro":
			codice = "D298";
			break;
		case "Dicomano":
			codice = "D299";
			break;
		case "Dignano":
			codice = "D300";
			break;
		case "Dimaro":
			codice = "D302";
			break;
		case "Dinami":
			codice = "D303";
			break;
		case "Dipignano":
			codice = "D304";
			break;
		case "Diso":
			codice = "D305";
			break;
		case "Divignano":
			codice = "D309";
			break;
		case "Dizzasco":
			codice = "D310";
			break;
		case "Dobbiaco":
			codice = "D311";
			break;
		case "Doberdò Del Lago":
			codice = "D312";
			break;
		case "Dogliani":
			codice = "D314";
			break;
		case "Dogliola":
			codice = "D315";
			break;
		case "Dogna":
			codice = "D316";
			break;
		case "Dolcè":
			codice = "D317";
			break;
		case "Dolceacqua":
			codice = "D318";
			break;
		case "Dolcedo":
			codice = "D319";
			break;
		case "Dolegna Del Collio":
			codice = "D321";
			break;
		case "Dolianova":
			codice = "D323";
			break;
		case "Dolo":
			codice = "D325";
			break;
		case "Dolzago":
			codice = "D327";
			break;
		case "Domanico":
			codice = "D328";
			break;
		case "Domaso":
			codice = "D329";
			break;
		case "Domegge Di Cadore":
			codice = "D330";
			break;
		case "Domicella":
			codice = "D331";
			break;
		case "Domodossola":
			codice = "D332";
			break;
		case "Domus De Maria":
			codice = "D333";
			break;
		case "Domusnovas":
			codice = "D334";
			break;
		case "Don":
			codice = "D336";
			break;
		case "Donnas":
			codice = "D338";
			break;
		case "Donato":
			codice = "D339";
			break;
		case "Dongo":
			codice = "D341";
			break;
		case "Donori":
			codice = "D344";
			break;
		case "Dorgali":
			codice = "D345";
			break;
		case "Dorio":
			codice = "D346";
			break;
		case "Dormelletto":
			codice = "D347";
			break;
		case "Dorno":
			codice = "D348";
			break;
		case "Dorsino":
			codice = "D349";
			break;
		case "Dorzano":
			codice = "D350";
			break;
		case "Dosolo":
			codice = "D351";
			break;
		case "Dossena":
			codice = "D352";
			break;
		case "Dosso Del Liro":
			codice = "D355";
			break;
		case "Doues":
			codice = "D356";
			break;
		case "Dovadola":
			codice = "D357";
			break;
		case "Dovera":
			codice = "D358";
			break;
		case "Dozza":
			codice = "D360";
			break;
		case "Dragoni":
			codice = "D361";
			break;
		case "Drapia":
			codice = "D364";
			break;
		case "Drena":
			codice = "D365";
			break;
		case "Drenchia":
			codice = "D366";
			break;
		case "Dresano":
			codice = "D367";
			break;
		case "Drezzo":
			codice = "D369";
			break;
		case "Drizzona":
			codice = "D370";
			break;
		case "Dro":
			codice = "D371";
			break;
		case "Dronero":
			codice = "D372";
			break;
		case "Druento":
			codice = "D373";
			break;
		case "Druogno":
			codice = "D374";
			break;
		case "Dualchi":
			codice = "D376";
			break;
		case "Dubino":
			codice = "D377";
			break;
		case "Dueville":
			codice = "D379";
			break;
		case "Dugenta":
			codice = "D380";
			break;
		case "Duino-Aurisina":
			codice = "D383";
			break;
		case "Dumenza":
			codice = "D384";
			break;
		case "Duno":
			codice = "D385";
			break;
		case "Durazzano":
			codice = "D386";
			break;
		case "Dusino San Michele":
			codice = "D388";
			break;

		}

	}

	private void codiciComuniE(String comune) {

		switch (comune) {

		case "Ercolano":
			codice = "H243";
			break;
		case "Erula":
			codice = "M292";
			break;
		case "Enna":
			codice = "C342";
			break;
		case "Eboli":
			codice = "D390";
			break;
		case "Edolo":
			codice = "D391";
			break;
		case "Egna":
			codice = "D392";
			break;
		case "Elice":
			codice = "D394";
			break;
		case "Elini":
			codice = "D395";
			break;
		case "Ello":
			codice = "D398";
			break;
		case "Elmas":
			codice = "D399";
			break;
		case "Elva":
			codice = "D401";
			break;
		case "Emarese":
			codice = "D402";
			break;
		case "Empoli":
			codice = "D403";
			break;
		case "Endine Gaiano":
			codice = "D406";
			break;
		case "Enego":
			codice = "D407";
			break;
		case "Enemonzo":
			codice = "D408";
			break;
		case "Entracque":
			codice = "D410";
			break;
		case "Entratico":
			codice = "D411";
			break;
		case "Envie":
			codice = "D412";
			break;
		case "Episcopia":
			codice = "D414";
			break;
		case "Eraclea":
			codice = "D415";
			break;
		case "Erba":
			codice = "D416";
			break;
		case "Erbè":
			codice = "D419";
			break;
		case "Erbezzo":
			codice = "D420";
			break;
		case "Erbusco":
			codice = "D421";
			break;
		case "Erchie":
			codice = "D422";
			break;
		case "Erice":
			codice = "D423";
			break;
		case "Erli":
			codice = "D424";
			break;
		case "Erto E Casso":
			codice = "D426";
			break;
		case "Erve":
			codice = "D428";
			break;
		case "Esanatoglia":
			codice = "D429";
			break;
		case "Escalaplano":
			codice = "D430";
			break;
		case "Escolca":
			codice = "D431";
			break;
		case "Ecodiceilles":
			codice = "D433";
			break;
		case "Esine":
			codice = "D434";
			break;
		case "Esino Lario":
			codice = "D436";
			break;
		case "Esperia":
			codice = "D440";
			break;
		case "Esporlatu":
			codice = "D441";
			break;
		case "Este":
			codice = "D442";
			break;
		case "Esterzili":
			codice = "D443";
			break;
		case "Etroubles":
			codice = "D444";
			break;
		case "Eupilio":
			codice = "D445";
			break;

		}

	}

	private void codiciComuniF(String comune) {

		switch (comune) {

		case "Fiuggi":
			codice = "A310";
			break;
		case "Fidenza":
			codice = "B034";
			break;
		case "Fiumicino":
			codice = "M297";
			break;
		case "Fonte Nuova":
			codice = "M309";
			break;
		case "Fabbriche Di Vergemoli":
			codice = "M319";
			break;
		case "Figline E Incisa Valdarno":
			codice = "M321";
			break;
		case "Fiscaglia":
			codice = "M323";
			break;
		case "Fiumicello Villa Vicentina":
			codice = "M400";
			break;
		case "Fabbrica Curone":
			codice = "D447";
			break;
		case "Fabbriche Di Vallico":
			codice = "D449";
			break;
		case "Fabbrico":
			codice = "D450";
			break;
		case "Fabriano":
			codice = "D451";
			break;
		case "Fabrica Di Roma":
			codice = "D452";
			break;
		case "Fabrizia":
			codice = "D453";
			break;
		case "Fabro":
			codice = "D454";
			break;
		case "Faedis":
			codice = "D455";
			break;
		case "Faedo Valtellino":
			codice = "D456";
			break;
		case "Faedo":
			codice = "D457";
			break;
		case "Faenza":
			codice = "D458";
			break;
		case "Faeto":
			codice = "D459";
			break;
		case "Fagagna":
			codice = "D461";
			break;
		case "Faggeto Lario":
			codice = "D462";
			break;
		case "Faggiano":
			codice = "D463";
			break;
		case "Fagnano Castello":
			codice = "D464";
			break;
		case "Fagnano Alto":
			codice = "D465";
			break;
		case "Fagnano Olona":
			codice = "D467";
			break;
		case "Fai Della Paganella":
			codice = "D468";
			break;
		case "Faicchio":
			codice = "D469";
			break;
		case "Falcade":
			codice = "D470";
			break;
		case "Falciano Del Massico":
			codice = "D471";
			break;
		case "Falconara Marittima":
			codice = "D472";
			break;
		case "Falconara Albanese":
			codice = "D473";
			break;
		case "Falcone":
			codice = "D474";
			break;
		case "Faleria":
			codice = "D475";
			break;
		case "Falerna":
			codice = "D476";
			break;
		case "Falerone":
			codice = "D477";
			break;
		case "Fallo":
			codice = "D480";
			break;
		case "Falmenta":
			codice = "D481";
			break;
		case "Faloppio":
			codice = "D482";
			break;
		case "Falvaterra":
			codice = "D483";
			break;
		case "Falzes":
			codice = "D484";
			break;
		case "Fanano":
			codice = "D486";
			break;
		case "Fanna":
			codice = "D487";
			break;
		case "Fano":
			codice = "D488";
			break;
		case "Fano Adriano":
			codice = "D489";
			break;
		case "Fara Gera D'Adda":
			codice = "D490";
			break;
		case "Fara Olivana Con Sola":
			codice = "D491";
			break;
		case "Fara Novarese":
			codice = "D492";
			break;
		case "Fara In Sabina":
			codice = "D493";
			break;
		case "Fara Filiorum Petri":
			codice = "D494";
			break;
		case "Fara San Martino":
			codice = "D495";
			break;
		case "Fara Vicentino":
			codice = "D496";
			break;
		case "Fardella":
			codice = "D497";
			break;
		case "Farigliano":
			codice = "D499";
			break;
		case "Farindola":
			codice = "D501";
			break;
		case "Farini":
			codice = "D502";
			break;
		case "Farnese":
			codice = "D503";
			break;
		case "Farra D'Isonzo":
			codice = "D504";
			break;
		case "Farra Di Soligo":
			codice = "D505";
			break;
		case "Farra D'Alpago":
			codice = "D506";
			break;
		case "Fasano":
			codice = "D508";
			break;
		case "Fascia":
			codice = "D509";
			break;
		case "Fauglia":
			codice = "D510";
			break;
		case "Faule":
			codice = "D511";
			break;
		case "Favale Di Malvaro":
			codice = "D512";
			break;
		case "Favara":
			codice = "D514";
			break;
		case "Faver":
			codice = "D516";
			break;
		case "Favignana":
			codice = "D518";
			break;
		case "Favria":
			codice = "D520";
			break;
		case "Feisoglio":
			codice = "D523";
			break;
		case "Feletto":
			codice = "D524";
			break;
		case "Felino":
			codice = "D526";
			break;
		case "Felitto":
			codice = "D527";
			break;
		case "Felizzano":
			codice = "D528";
			break;
		case "Felonica":
			codice = "D529";
			break;
		case "Feltre":
			codice = "D530";
			break;
		case "Fenegrò":
			codice = "D531";
			break;
		case "Fenestrelle":
			codice = "D532";
			break;
		case "Fenis":
			codice = "D537";
			break;
		case "Ferentillo":
			codice = "D538";
			break;
		case "Ferentino":
			codice = "D539";
			break;
		case "Ferla":
			codice = "D540";
			break;
		case "Fermignano":
			codice = "D541";
			break;
		case "Fermo":
			codice = "D542";
			break;
		case "Ferno":
			codice = "D543";
			break;
		case "Feroleto Antico":
			codice = "D544";
			break;
		case "Feroleto Della Chiesa":
			codice = "D545";
			break;
		case "Ferrandina":
			codice = "D547";
			break;
		case "Ferrara":
			codice = "D548";
			break;
		case "Ferrara Di Monte Baldo":
			codice = "D549";
			break;
		case "Ferrazzano":
			codice = "D550";
			break;
		case "Ferrera Di Varese":
			codice = "D551";
			break;
		case "Ferrera Erbognone":
			codice = "D552";
			break;
		case "Ferrere":
			codice = "D554";
			break;
		case "Ferriere":
			codice = "D555";
			break;
		case "Ferruzzano":
			codice = "D557";
			break;
		case "Fraconalto":
			codice = "D559";
			break;
		case "Fiamignano":
			codice = "D560";
			break;
		case "Fiano Romano":
			codice = "D561";
			break;
		case "Fiano":
			codice = "D562";
			break;
		case "Fiastra":
			codice = "D564";
			break;
		case "Fiavè":
			codice = "D565";
			break;
		case "Ficarazzi":
			codice = "D567";
			break;
		case "Ficarolo":
			codice = "D568";
			break;
		case "Ficarra":
			codice = "D569";
			break;
		case "Ficulle":
			codice = "D570";
			break;
		case "Fiè Allo Sciliar":
			codice = "D571";
			break;
		case "Fiera Di Primiero":
			codice = "D572";
			break;
		case "Fierozzo":
			codice = "D573";
			break;
		case "Fiesco":
			codice = "D574";
			break;
		case "Fiesole":
			codice = "D575";
			break;
		case "Fiesse":
			codice = "D576";
			break;
		case "Fiesso Umbertiano":
			codice = "D577";
			break;
		case "Fiesso D'Artico":
			codice = "D578";
			break;
		case "Figino Serenza":
			codice = "D579";
			break;
		case "Figline Vegliaturo":
			codice = "D582";
			break;
		case "Figline Valdarno":
			codice = "D583";
			break;
		case "Filacciano":
			codice = "D586";
			break;
		case "Filadelfia":
			codice = "D587";
			break;
		case "Filago":
			codice = "D588";
			break;
		case "Filandari":
			codice = "D589";
			break;
		case "Filattiera":
			codice = "D590";
			break;
		case "Filettino":
			codice = "D591";
			break;
		case "Filetto":
			codice = "D592";
			break;
		case "Filiano":
			codice = "D593";
			break;
		case "Filighera":
			codice = "D594";
			break;
		case "Filignano":
			codice = "D595";
			break;
		case "Filogaso":
			codice = "D596";
			break;
		case "Filottrano":
			codice = "D597";
			break;
		case "Finale Emilia":
			codice = "D599";
			break;
		case "Finale Ligure":
			codice = "D600";
			break;
		case "Fino Del Monte":
			codice = "D604";
			break;
		case "Fino Mornasco":
			codice = "D605";
			break;
		case "Fiorano Al Serio":
			codice = "D606";
			break;
		case "Fiorano Modenese":
			codice = "D607";
			break;
		case "Fiorano Canavese":
			codice = "D608";
			break;
		case "Fiordimonte":
			codice = "D609";
			break;
		case "Fiorenzuola D'Arda":
			codice = "D611";
			break;
		case "Firenze":
			codice = "D612";
			break;
		case "Firenzuola":
			codice = "D613";
			break;
		case "Firmo":
			codice = "D614";
			break;
		case "Fisciano":
			codice = "D615";
			break;
		case "Fiumalbo":
			codice = "D617";
			break;
		case "Fiumara":
			codice = "D619";
			break;
		case "Fiume Veneto":
			codice = "D621";
			break;
		case "Fiumedinisi":
			codice = "D622";
			break;
		case "Fiumefreddo Di Sicilia":
			codice = "D623";
			break;
		case "Fiumefreddo Bruzio":
			codice = "D624";
			break;
		case "Fiumicello":
			codice = "D627";
			break;
		case "Fiuminata":
			codice = "D628";
			break;
		case "Fivizzano":
			codice = "D629";
			break;
		case "Flaibano":
			codice = "D630";
			break;
		case "Flavon":
			codice = "D631";
			break;
		case "Flero":
			codice = "D634";
			break;
		case "Floresta":
			codice = "D635";
			break;
		case "Floridia":
			codice = "D636";
			break;
		case "Florinas":
			codice = "D637";
			break;
		case "Flumeri":
			codice = "D638";
			break;
		case "Fluminimaggiore":
			codice = "D639";
			break;
		case "Flussio":
			codice = "D640";
			break;
		case "Fobello":
			codice = "D641";
			break;
		case "Foggia":
			codice = "D643";
			break;
		case "Foglianise":
			codice = "D644";
			break;
		case "Fogliano Redipuglia":
			codice = "D645";
			break;
		case "Foglizzo":
			codice = "D646";
			break;
		case "Foiano Della Chiana":
			codice = "D649";
			break;
		case "Foiano Di Val Fortore":
			codice = "D650";
			break;
		case "Folgaria":
			codice = "D651";
			break;
		case "Folignano":
			codice = "D652";
			break;
		case "Foligno":
			codice = "D653";
			break;
		case "Follina":
			codice = "D654";
			break;
		case "Follo":
			codice = "D655";
			break;
		case "Follonica":
			codice = "D656";
			break;
		case "Fombio":
			codice = "D660";
			break;
		case "Fondachelli-Fantina":
			codice = "D661";
			break;
		case "Fondi":
			codice = "D662";
			break;
		case "Fondo":
			codice = "D663";
			break;
		case "Fonni":
			codice = "D665";
			break;
		case "Fontainemore":
			codice = "D666";
			break;
		case "Fontana Liri":
			codice = "D667";
			break;
		case "Fontanelice":
			codice = "D668";
			break;
		case "Fontanafredda":
			codice = "D670";
			break;
		case "Fontanarosa":
			codice = "D671";
			break;
		case "Fontanella":
			codice = "D672";
			break;
		case "Fontanellato":
			codice = "D673";
			break;
		case "Fontanelle":
			codice = "D674";
			break;
		case "Fontaneto D'Agogna":
			codice = "D675";
			break;
		case "Fontanetto Po":
			codice = "D676";
			break;
		case "Fontanigorda":
			codice = "D677";
			break;
		case "Fontanile":
			codice = "D678";
			break;
		case "Fontaniva":
			codice = "D679";
			break;
		case "Fonte":
			codice = "D680";
			break;
		case "Fontecchio":
			codice = "D681";
			break;
		case "Fontechiari":
			codice = "D682";
			break;
		case "Fontegreca":
			codice = "D683";
			break;
		case "Fonteno":
			codice = "D684";
			break;
		case "Fontevivo":
			codice = "D685";
			break;
		case "Fonzaso":
			codice = "D686";
			break;
		case "Foppolo":
			codice = "D688";
			break;
		case "Forano":
			codice = "D689";
			break;
		case "Force":
			codice = "D691";
			break;
		case "Forchia":
			codice = "D693";
			break;
		case "Forcola":
			codice = "D694";
			break;
		case "Fordongianus":
			codice = "D695";
			break;
		case "Forenza":
			codice = "D696";
			break;
		case "Foresto Sparso":
			codice = "D697";
			break;
		case "Forgaria Nel Friuli":
			codice = "D700";
			break;
		case "Forino":
			codice = "D701";
			break;
		case "Forio":
			codice = "D702";
			break;
		case "Forlì Del Sannio":
			codice = "D703";
			break;
		case "Forlì":
			codice = "D704";
			break;
		case "Forlimpopoli":
			codice = "D705";
			break;
		case "Formazza":
			codice = "D706";
			break;
		case "Formello":
			codice = "D707";
			break;
		case "Formia":
			codice = "D708";
			break;
		case "Formicola":
			codice = "D709";
			break;
		case "Formigara":
			codice = "D710";
			break;
		case "Formigine":
			codice = "D711";
			break;
		case "Formigliana":
			codice = "D712";
			break;
		case "Formignana":
			codice = "D713";
			break;
		case "Fornace":
			codice = "D714";
			break;
		case "Fornelli":
			codice = "D715";
			break;
		case "Forni Avoltri":
			codice = "D718";
			break;
		case "Forni Di Sopra":
			codice = "D719";
			break;
		case "Forni Di Sotto":
			codice = "D720";
			break;
		case "Forno Canavese":
			codice = "D725";
			break;
		case "Forno Di Zoldo":
			codice = "D726";
			break;
		case "Fornovo San Giovanni":
			codice = "D727";
			break;
		case "Fornovo Di Taro":
			codice = "D728";
			break;
		case "Forte Dei Marmi":
			codice = "D730";
			break;
		case "Fortezza":
			codice = "D731";
			break;
		case "Fortunago":
			codice = "D732";
			break;
		case "Forza D'Agrò":
			codice = "D733";
			break;
		case "Fosciandora":
			codice = "D734";
			break;
		case "Fosdinovo":
			codice = "D735";
			break;
		case "Fossa":
			codice = "D736";
			break;
		case "Fossalto":
			codice = "D737";
			break;
		case "Fossacesia":
			codice = "D738";
			break;
		case "Fossalta Di Piave":
			codice = "D740";
			break;
		case "Fossalta Di Portogruaro":
			codice = "D741";
			break;
		case "Fossano":
			codice = "D742";
			break;
		case "Fossato Serralta":
			codice = "D744";
			break;
		case "Fossato Di Vico":
			codice = "D745";
			break;
		case "Fossò":
			codice = "D748";
			break;
		case "Fossombrone":
			codice = "D749";
			break;
		case "Foza":
			codice = "D750";
			break;
		case "Frabosa Soprana":
			codice = "D751";
			break;
		case "Frabosa Sottana":
			codice = "D752";
			break;
		case "Fragagnano":
			codice = "D754";
			break;
		case "Fragneto L'Abate":
			codice = "D755";
			break;
		case "Fragneto Monforte":
			codice = "D756";
			break;
		case "Fraine":
			codice = "D757";
			break;
		case "Framura":
			codice = "D758";
			break;
		case "Francavilla Bisio":
			codice = "D759";
			break;
		case "Francavilla D'Ete":
			codice = "D760";
			break;
		case "Francavilla Fontana":
			codice = "D761";
			break;
		case "Francavilla Angitola":
			codice = "D762";
			break;
		case "Francavilla Al Mare":
			codice = "D763";
			break;
		case "Francavilla Marittima":
			codice = "D764";
			break;
		case "Francavilla Di Sicilia":
			codice = "D765";
			break;
		case "Francavilla In Sinni":
			codice = "D766";
			break;
		case "Francica":
			codice = "D767";
			break;
		case "Francofonte":
			codice = "D768";
			break;
		case "Francolise":
			codice = "D769";
			break;
		case "Frascaro":
			codice = "D770";
			break;
		case "Frascarolo":
			codice = "D771";
			break;
		case "Frascati":
			codice = "D773";
			break;
		case "Frascineto":
			codice = "D774";
			break;
		case "Frassilongo":
			codice = "D775";
			break;
		case "Frassinelle Polesine":
			codice = "D776";
			break;
		case "Frassinello Monferrato":
			codice = "D777";
			break;
		case "Frassineto Po":
			codice = "D780";
			break;
		case "Frassinetto":
			codice = "D781";
			break;
		case "Frassino":
			codice = "D782";
			break;
		case "Frassinoro":
			codice = "D783";
			break;
		case "Frasso Telesino":
			codice = "D784";
			break;
		case "Frasso Sabino":
			codice = "D785";
			break;
		case "Fratta Todina":
			codice = "D787";
			break;
		case "Fratta Polesine":
			codice = "D788";
			break;
		case "Frattamaggiore":
			codice = "D789";
			break;
		case "Frattaminore":
			codice = "D790";
			break;
		case "Fratte Rosa":
			codice = "D791";
			break;
		case "Frazzanò":
			codice = "D793";
			break;
		case "Fregona":
			codice = "D794";
			break;
		case "Fresagrandinaria":
			codice = "D796";
			break;
		case "Fresonara":
			codice = "D797";
			break;
		case "Frigento":
			codice = "D798";
			break;
		case "Frignano":
			codice = "D799";
			break;
		case "Frinco":
			codice = "D802";
			break;
		case "Frisa":
			codice = "D803";
			break;
		case "Frisanco":
			codice = "D804";
			break;
		case "Front":
			codice = "D805";
			break;
		case "Frontino":
			codice = "D807";
			break;
		case "Frontone":
			codice = "D808";
			break;
		case "Frosinone":
			codice = "D810";
			break;
		case "Frosolone":
			codice = "D811";
			break;
		case "Frossasco":
			codice = "D812";
			break;
		case "Frugarolo":
			codice = "D813";
			break;
		case "Fubine Monferrato":
			codice = "D814";
			break;
		case "Fucecchio":
			codice = "D815";
			break;
		case "Fuipiano Valle Imagna":
			codice = "D817";
			break;
		case "Fumane":
			codice = "D818";
			break;
		case "Fumone":
			codice = "D819";
			break;
		case "Funes":
			codice = "D821";
			break;
		case "Furci":
			codice = "D823";
			break;
		case "Furci Siculo":
			codice = "D824";
			break;
		case "Furnari":
			codice = "D825";
			break;
		case "Furore":
			codice = "D826";
			break;
		case "Furtei":
			codice = "D827";
			break;
		case "Fuscaldo":
			codice = "D828";
			break;
		case "Fusignano":
			codice = "D829";
			break;
		case "Fusine":
			codice = "D830";
			break;
		case "Futani":
			codice = "D832";
			break;

		}

	}

	private void codiciComuniG(String comune) {

		switch (comune) {

		case "Golfo Aranci":
			codice = "M274";
			break;
		case "Gravedona Ed Uniti":
			codice = "M315";
			break;
		case "Gattico-Veruno":
			codice = "M416";
			break;
		case "Gonnosnò":
			codice = "D585";
			break;
		case "Gabbioneta Binanuova":
			codice = "D834";
			break;
		case "Gabiano":
			codice = "D835";
			break;
		case "Gabicce Mare":
			codice = "D836";
			break;
		case "Gaby":
			codice = "D839";
			break;
		case "Gadesco Pieve Delmona":
			codice = "D841";
			break;
		case "Gadoni":
			codice = "D842";
			break;
		case "Gaeta":
			codice = "D843";
			break;
		case "Gaggi":
			codice = "D844";
			break;
		case "Gaggiano":
			codice = "D845";
			break;
		case "Gaggio Montano":
			codice = "D847";
			break;
		case "Gaglianico":
			codice = "D848";
			break;
		case "Gagliano Castelferrato":
			codice = "D849";
			break;
		case "Gagliano Aterno":
			codice = "D850";
			break;
		case "Gagliano Del Capo":
			codice = "D851";
			break;
		case "Gagliato":
			codice = "D852";
			break;
		case "Gagliole":
			codice = "D853";
			break;
		case "Gaiarine":
			codice = "D854";
			break;
		case "Gaiba":
			codice = "D855";
			break;
		case "Gaiola":
			codice = "D856";
			break;
		case "Gaiole In Chianti":
			codice = "D858";
			break;
		case "Gairo":
			codice = "D859";
			break;
		case "Gais":
			codice = "D860";
			break;
		case "Galati Mamertino":
			codice = "D861";
			break;
		case "Galatina":
			codice = "D862";
			break;
		case "Galatone":
			codice = "D863";
			break;
		case "Galatro":
			codice = "D864";
			break;
		case "Galbiate":
			codice = "D865";
			break;
		case "Galeata":
			codice = "D867";
			break;
		case "Galgagnano":
			codice = "D868";
			break;
		case "Gallarate":
			codice = "D869";
			break;
		case "Gallese":
			codice = "D870";
			break;
		case "Galliate Lombardo":
			codice = "D871";
			break;
		case "Galliate":
			codice = "D872";
			break;
		case "Galliavola":
			codice = "D873";
			break;
		case "Gallicano":
			codice = "D874";
			break;
		case "Gallicano Nel Lazio":
			codice = "D875";
			break;
		case "Gallicchio":
			codice = "D876";
			break;
		case "Galliera":
			codice = "D878";
			break;
		case "Galliera Veneta":
			codice = "D879";
			break;
		case "Gallinaro":
			codice = "D881";
			break;
		case "Gallio":
			codice = "D882";
			break;
		case "Gallipoli":
			codice = "D883";
			break;
		case "Gallo Matese":
			codice = "D884";
			break;
		case "Gallodoro":
			codice = "D885";
			break;
		case "Galluccio":
			codice = "D886";
			break;
		case "Galtellì":
			codice = "D888";
			break;
		case "Galzignano Terme":
			codice = "D889";
			break;
		case "Gamalero":
			codice = "D890";
			break;
		case "Gambara":
			codice = "D891";
			break;
		case "Gambarana":
			codice = "D892";
			break;
		case "Gambasca":
			codice = "D894";
			break;
		case "Gambassi Terme":
			codice = "D895";
			break;
		case "Gambatesa":
			codice = "D896";
			break;
		case "Gambellara":
			codice = "D897";
			break;
		case "Gamberale":
			codice = "D898";
			break;
		case "Gambettola":
			codice = "D899";
			break;
		case "Gambolò":
			codice = "D901";
			break;
		case "Gambugliano":
			codice = "D902";
			break;
		case "Gandellino":
			codice = "D903";
			break;
		case "Gandino":
			codice = "D905";
			break;
		case "Gandosso":
			codice = "D906";
			break;
		case "Gangi":
			codice = "D907";
			break;
		case "Garaguso":
			codice = "D909";
			break;
		case "Garbagna":
			codice = "D910";
			break;
		case "Garbagna Novarese":
			codice = "D911";
			break;
		case "Garbagnate Milanese":
			codice = "D912";
			break;
		case "Garbagnate Monastero":
			codice = "D913";
			break;
		case "Garda":
			codice = "D915";
			break;
		case "Gardone Riviera":
			codice = "D917";
			break;
		case "Gardone Val Trompia":
			codice = "D918";
			break;
		case "Garessio":
			codice = "D920";
			break;
		case "Gargallo":
			codice = "D921";
			break;
		case "Gargazzone":
			codice = "D923";
			break;
		case "Gargnano":
			codice = "D924";
			break;
		case "Garlasco":
			codice = "D925";
			break;
		case "Garlate":
			codice = "D926";
			break;
		case "Garlenda":
			codice = "D927";
			break;
		case "Garniga Terme":
			codice = "D928";
			break;
		case "Garzeno":
			codice = "D930";
			break;
		case "Garzigliana":
			codice = "D931";
			break;
		case "Gasperina":
			codice = "D932";
			break;
		case "Gassino Torinese":
			codice = "D933";
			break;
		case "Gattatico":
			codice = "D934";
			break;
		case "Gatteo":
			codice = "D935";
			break;
		case "Gattico":
			codice = "D937";
			break;
		case "Gattinara":
			codice = "D938";
			break;
		case "Gavardo":
			codice = "D940";
			break;
		case "Gavazzana":
			codice = "D941";
			break;
		case "Gavello":
			codice = "D942";
			break;
		case "Gaverina Terme":
			codice = "D943";
			break;
		case "Gavi":
			codice = "D944";
			break;
		case "Gavignano":
			codice = "D945";
			break;
		case "Gavirate":
			codice = "D946";
			break;
		case "Gavoi":
			codice = "D947";
			break;
		case "Gavorrano":
			codice = "D948";
			break;
		case "Gazoldo Degli Ippoliti":
			codice = "D949";
			break;
		case "Gazzada Schianno":
			codice = "D951";
			break;
		case "Gazzaniga":
			codice = "D952";
			break;
		case "Gazzo":
			codice = "D956";
			break;
		case "Gazzo Veronese":
			codice = "D957";
			break;
		case "Gazzola":
			codice = "D958";
			break;
		case "Gazzuolo":
			codice = "D959";
			break;
		case "Gela":
			codice = "D960";
			break;
		case "Gemmano":
			codice = "D961";
			break;
		case "Gemona Del Friuli":
			codice = "D962";
			break;
		case "Gemonio":
			codice = "D963";
			break;
		case "Genazzano":
			codice = "D964";
			break;
		case "Genga":
			codice = "D965";
			break;
		case "Genivolta":
			codice = "D966";
			break;
		case "Genola":
			codice = "D967";
			break;
		case "Genoni":
			codice = "D968";
			break;
		case "Genova":
			codice = "D969";
			break;
		case "Genuri":
			codice = "D970";
			break;
		case "Genzano Di Lucania":
			codice = "D971";
			break;
		case "Genzano Di Roma":
			codice = "972";
			break;
		case "Genzone":
			codice = "D973";
			break;
		case "Gera Lario":
			codice = "D974";
			break;
		case "Gerace":
			codice = "D975";
			break;
		case "Geraci Siculo":
			codice = "D977";
			break;
		case "Gerano":
			codice = "D978";
			break;
		case "Gerenzago":
			codice = "D980";
			break;
		case "Gerenzano":
			codice = "D981";
			break;
		case "Gergei":
			codice = "D982";
			break;
		case "Germagnano":
			codice = "D983";
			break;
		case "Germagno":
			codice = "D984";
			break;
		case "Germasino":
			codice = "D986";
			break;
		case "Germignaga":
			codice = "D987";
			break;
		case "Gerocarne":
			codice = "D988";
			break;
		case "Gerola Alta":
			codice = "D990";
			break;
		case "Gerosa":
			codice = "D991";
			break;
		case "Gerre Dè Caprioli":
			codice = "D993";
			break;
		case "Gesico":
			codice = "D994";
			break;
		case "Gessate":
			codice = "D995";
			break;
		case "Gessopalena":
			codice = "D996";
			break;
		case "Gesturi":
			codice = "D997";
			break;
		case "Gesualdo":
			codice = "D998";
			break;
		case "Ghedi":
			codice = "D999";
			break;
		case "Ghemme":
			codice = "E001";
			break;
		case "Ghiffa":
			codice = "E003";
			break;
		case "Ghilarza":
			codice = "E004";
			break;
		case "Ghisalba":
			codice = "E006";
			break;
		case "Ghislarengo":
			codice = "E007";
			break;
		case "Giacciano Con Baruchella":
			codice = "E008";
			break;
		case "Giaglione":
			codice = "E009";
			break;
		case "Gianico":
			codice = "E010";
			break;
		case "Giano Vetusto":
			codice = "E011";
			break;
		case "Giano Dell'Umbria":
			codice = "E012";
			break;
		case "Giardinello":
			codice = "E013";
			break;
		case "Giardini-Nacodiceos":
			codice = "E014";
			break;
		case "Giarole":
			codice = "E015";
			break;
		case "Giarratana":
			codice = "E016";
			break;
		case "Giarre":
			codice = "E017";
			break;
		case "Giave":
			codice = "E019";
			break;
		case "Giaveno":
			codice = "E020";
			break;
		case "Giavera Del Montello":
			codice = "E021";
			break;
		case "Giba":
			codice = "E022";
			break;
		case "Gibellina":
			codice = "E023";
			break;
		case "Gifflenga":
			codice = "E024";
			break;
		case "Giffone":
			codice = "E025";
			break;
		case "Giffoni Sei Casali":
			codice = "E026";
			break;
		case "Giffoni Valle Piana":
			codice = "E027";
			break;
		case "Gignese":
			codice = "E028";
			break;
		case "Gignod":
			codice = "E029";
			break;
		case "Gildone":
			codice = "E030";
			break;
		case "Gimigliano":
			codice = "E031";
			break;
		case "Ginestra":
			codice = "E033";
			break;
		case "Ginestra Degli Schiavoni":
			codice = "E034";
			break;
		case "Ginosa":
			codice = "E036";
			break;
		case "Gioi":
			codice = "E037";
			break;
		case "Gioia Del Colle":
			codice = "E038";
			break;
		case "Gioia Sannitica":
			codice = "E039";
			break;
		case "Gioia Dei Marsi":
			codice = "E040";
			break;
		case "Gioia Tauro":
			codice = "E041";
			break;
		case "Gioiosa Marea":
			codice = "E043";
			break;
		case "Gioiosa Ionica":
			codice = "E044";
			break;
		case "Giove":
			codice = "E045";
			break;
		case "Giovinazzo":
			codice = "E047";
			break;
		case "Giovo":
			codice = "E048";
			break;
		case "Girasole":
			codice = "E049";
			break;
		case "Girifalco":
			codice = "E050";
			break;
		case "Gironico":
			codice = "E051";
			break;
		case "Gissi":
			codice = "E052";
			break;
		case "Giuggianello":
			codice = "E053";
			break;
		case "Giugliano In Campania":
			codice = "E054";
			break;
		case "Giuliana":
			codice = "E055";
			break;
		case "Giuliano Teatino":
			codice = "E056";
			break;
		case "Giuliano Di Roma":
			codice = "E057";
			break;
		case "Giulianova":
			codice = "E058";
			break;
		case "Giuncugnano":
			codice = "E059";
			break;
		case "Giungano":
			codice = "E060";
			break;
		case "Giurdignano":
			codice = "E061";
			break;
		case "Giussago":
			codice = "E062";
			break;
		case "Giussano":
			codice = "E063";
			break;
		case "Giustenice":
			codice = "E064";
			break;
		case "Giustino":
			codice = "E065";
			break;
		case "Giusvalla":
			codice = "E066";
			break;
		case "Givoletto":
			codice = "E067";
			break;
		case "Gizzeria":
			codice = "E068";
			break;
		case "Glorenza":
			codice = "E069";
			break;
		case "Godega Di Sant'Urbano":
			codice = "E071";
			break;
		case "Godiasco Salice Terme":
			codice = "E072";
			break;
		case "Godrano":
			codice = "E074";
			break;
		case "Goito":
			codice = "E078";
			break;
		case "Golasecca":
			codice = "E079";
			break;
		case "Golferenzo":
			codice = "E081";
			break;
		case "Gombito":
			codice = "E082";
			break;
		case "Gonars":
			codice = "E083";
			break;
		case "Goni":
			codice = "E084";
			break;
		case "Gonnosfanadiga":
			codice = "E085";
			break;
		case "Gonnesa":
			codice = "E086";
			break;
		case "Gonnoscodina":
			codice = "E087";
			break;
		case "Gonnostramatza":
			codice = "E088";
			break;
		case "Gonzaga":
			codice = "E089";
			break;
		case "Gordona":
			codice = "E090";
			break;
		case "Gorga":
			codice = "E091";
			break;
		case "Gorgo Al Monticano":
			codice = "E092";
			break;
		case "Gorgoglione":
			codice = "E093";
			break;
		case "Gorgonzola":
			codice = "E094";
			break;
		case "Goriano Sicoli":
			codice = "E096";
			break;
		case "Gorizia":
			codice = "E098";
			break;
		case "Gorlago":
			codice = "E100";
			break;
		case "Gorla Maggiore":
			codice = "E101";
			break;
		case "Gorla Minore":
			codice = "E102";
			break;
		case "Gorle":
			codice = "E103";
			break;
		case "Gornate-Olona":
			codice = "E104";
			break;
		case "Gorno":
			codice = "E106";
			break;
		case "Goro":
			codice = "E107";
			break;
		case "Gorreto":
			codice = "E109";
			break;
		case "Gorzegno":
			codice = "E111";
			break;
		case "Gosaldo":
			codice = "E113";
			break;
		case "Gossolengo":
			codice = "E114";
			break;
		case "Gottasecca":
			codice = "E115";
			break;
		case "Gottolengo":
			codice = "E116";
			break;
		case "Govone":
			codice = "E118";
			break;
		case "Gozzano":
			codice = "E120";
			break;
		case "Gradara":
			codice = "E122";
			break;
		case "Gradisca D'Isonzo":
			codice = "E124";
			break;
		case "Grado":
			codice = "E125";
			break;
		case "Gradoli":
			codice = "E126";
			break;
		case "Graffignana":
			codice = "E127";
			break;
		case "Graffignano":
			codice = "E128";
			break;
		case "Graglia":
			codice = "E130";
			break;
		case "Gragnano":
			codice = "E131";
			break;
		case "Gragnano Trebbiense":
			codice = "E132";
			break;
		case "Grammichele":
			codice = "E133";
			break;
		case "Grana":
			codice = "E134";
			break;
		case "Granaglione":
			codice = "E135";
			break;
		case "Granarolo Dell'Emilia":
			codice = "E136";
			break;
		case "Grancona":
			codice = "E138";
			break;
		case "Grandate":
			codice = "E139";
			break;
		case "Grandola Ed Uniti":
			codice = "E141";
			break;
		case "Graniti":
			codice = "E142";
			break;
		case "Granozzo Con Monticello":
			codice = "E143";
			break;
		case "Grantola":
			codice = "E144";
			break;
		case "Grantorto":
			codice = "E145";
			break;
		case "Granze":
			codice = "E146";
			break;
		case "Grassano":
			codice = "E147";
			break;
		case "Grassobbio":
			codice = "E148";
			break;
		case "Gratteri":
			codice = "E149";
			break;
		case "Grauno":
			codice = "E150";
			break;
		case "Gravedona":
			codice = "E151";
			break;
		case "Gravellona Lomellina":
			codice = "E152";
			break;
		case "Gravellona Toce":
			codice = "E153";
			break;
		case "Gravere":
			codice = "E154";
			break;
		case "Gravina In Puglia":
			codice = "E155";
			break;
		case "Gravina Di Catania":
			codice = "E156";
			break;
		case "Grazzanise":
			codice = "E158";
			break;
		case "Grazzano Badoglio":
			codice = "E159";
			break;
		case "Greccio":
			codice = "E160";
			break;
		case "Greci":
			codice = "E161";
			break;
		case "Greggio":
			codice = "E163";
			break;
		case "Gremiasco":
			codice = "E164";
			break;
		case "Gressan":
			codice = "E165";
			break;
		case "Gressoney-La-Trinitè":
			codice = "E167";
			break;
		case "Gressoney-Saint-Jean":
			codice = "E168";
			break;
		case "Greve In Chianti":
			codice = "E169";
			break;
		case "Grezzago":
			codice = "E170";
			break;
		case "Grezzana":
			codice = "E171";
			break;
		case "Griante":
			codice = "E172";
			break;
		case "Gricignano Di Aversa":
			codice = "E173";
			break;
		case "Grignasco":
			codice = "E177";
			break;
		case "Grigno":
			codice = "E178";
			break;
		case "Grimacco":
			codice = "E179";
			break;
		case "Grimaldi":
			codice = "E180";
			break;
		case "Grinzane Cavour":
			codice = "E182";
			break;
		case "Grisignano Di Zocco":
			codice = "E184";
			break;
		case "Grisolia":
			codice = "E185";
			break;
		case "Grizzana Morandi":
			codice = "E187";
			break;
		case "Grognardo":
			codice = "E188";
			break;
		case "Gromo":
			codice = "E189";
			break;
		case "Grondona":
			codice = "E191";
			break;
		case "Grone":
			codice = "E192";
			break;
		case "Grontardo":
			codice = "E193";
			break;
		case "Gropello Cairoli":
			codice = "E195";
			break;
		case "Gropparello":
			codice = "E196";
			break;
		case "Groscavallo":
			codice = "E199";
			break;
		case "Grosio":
			codice = "E200";
			break;
		case "Grosotto":
			codice = "E201";
			break;
		case "Grosseto":
			codice = "E202";
			break;
		case "Grosso":
			codice = "E203";
			break;
		case "Grottaferrata":
			codice = "E204";
			break;
		case "Grottaglie":
			codice = "E205";
			break;
		case "Grottaminarda":
			codice = "E206";
			break;
		case "Grottammare":
			codice = "E207";
			break;
		case "Grottazzolina":
			codice = "E208";
			break;
		case "Grotte":
			codice = "E209";
			break;
		case "Grotte Di Castro":
			codice = "E210";
			break;
		case "Grotteria":
			codice = "E212";
			break;
		case "Grottole":
			codice = "E213";
			break;
		case "Grottolella":
			codice = "E214";
			break;
		case "Gruaro":
			codice = "E215";
			break;
		case "Grugliasco":
			codice = "E216";
			break;
		case "Grumello Cremonese Ed Uniti":
			codice = "E217";
			break;
		case "Grumello Del Monte":
			codice = "E219";
			break;
		case "Grumento Nova":
			codice = "E221";
			break;
		case "Grumes":
			codice = "E222";
			break;
		case "Grumo Appula":
			codice = "E223";
			break;
		case "Grumo Nevano":
			codice = "E224";
			break;
		case "Grumolo Delle Abbadesse":
			codice = "E226";
			break;
		case "Guagnano":
			codice = "E227";
			break;
		case "Gualdo":
			codice = "E228";
			break;
		case "Gualdo Cattaneo":
			codice = "E229";
			break;
		case "Gualdo Tadino":
			codice = "E230";
			break;
		case "Gualtieri":
			codice = "E232";
			break;
		case "Gualtieri Sicaminò":
			codice = "E233";
			break;
		case "Guamaggiore":
			codice = "E234";
			break;
		case "Guanzate":
			codice = "E235";
			break;
		case "Guarcino":
			codice = "E236";
			break;
		case "Guardabosone":
			codice = "E237";
			break;
		case "Guardamiglio":
			codice = "E238";
			break;
		case "Guardavalle":
			codice = "E239";
			break;
		case "Guarda Veneta":
			codice = "E240";
			break;
		case "Guardea":
			codice = "E241";
			break;
		case "Guardia Piemontese":
			codice = "E242";
			break;
		case "Guardiagrele":
			codice = "E243";
			break;
		case "Guardialfiera":
			codice = "E244";
			break;
		case "Guardia Lombardi":
			codice = "E245";
			break;
		case "Guardia Perticara":
			codice = "E246";
			break;
		case "Guardiaregia":
			codice = "E248";
			break;
		case "Guardia Sanframondi":
			codice = "E249";
			break;
		case "Guardistallo":
			codice = "E250";
			break;
		case "Guarene":
			codice = "E251";
			break;
		case "Guasila":
			codice = "E252";
			break;
		case "Guastalla":
			codice = "E253";
			break;
		case "Guazzora":
			codice = "E255";
			break;
		case "Gubbio":
			codice = "E256";
			break;
		case "Gudo Visconti":
			codice = "E258";
			break;
		case "Guglionesi":
			codice = "E259";
			break;
		case "Guidizzolo":
			codice = "E261";
			break;
		case "Guidonia Montecelio":
			codice = "E263";
			break;
		case "Guiglia":
			codice = "E264";
			break;
		case "Guilmi":
			codice = "E266";
			break;
		case "Gurro":
			codice = "E269";
			break;
		case "Guspini":
			codice = "E270";
			break;
		case "Gussago":
			codice = "E271";
			break;
		case "Gussola":
			codice = "E272";
			break;

		}

	}

	private void codiciComuniH(String comune) {

		switch (comune) {

		case "Hone":
			codice = "E273";
			break;

		}

	}

	private void codiciComuniI(String comune) {

		switch (comune) {

		case "Idro":
			codice = "E280";
			break;
		case "Iglesias":
			codice = "E281";
			break;
		case "Igliano":
			codice = "E282";
			break;
		case "Ilbono":
			codice = "E283";
			break;
		case "Illasi":
			codice = "E284";
			break;
		case "Illorai":
			codice = "E285";
			break;
		case "Imbersago":
			codice = "E287";
			break;
		case "Imer":
			codice = "E288";
			break;
		case "Imola":
			codice = "E289";
			break;
		case "Imperia":
			codice = "E290";
			break;
		case "Impruneta":
			codice = "E291";
			break;
		case "Inarzo":
			codice = "E292";
			break;
		case "Incisa Scapaccino":
			codice = "E295";
			break;
		case "Incisa In Val D'Arno":
			codice = "E296";
			break;
		case "Incudine":
			codice = "E297";
			break;
		case "Induno Olona":
			codice = "E299";
			break;
		case "Ingria":
			codice = "E301";
			break;
		case "Intragna":
			codice = "E304";
			break;
		case "Introbio":
			codice = "E305";
			break;
		case "Introd":
			codice = "E306";
			break;
		case "Introdacqua":
			codice = "E307";
			break;
		case "Introzzo":
			codice = "E308";
			break;
		case "Inverigo":
			codice = "E309";
			break;
		case "Inverno E Monteleone":
			codice = "E310";
			break;
		case "Inverso Pinasca":
			codice = "E311";
			break;
		case "Inveruno":
			codice = "E313";
			break;
		case "Invorio":
			codice = "E314";
			break;
		case "Inzago":
			codice = "E317";
			break;
		case "Ionadi":
			codice = "E321";
			break;
		case "Irgoli":
			codice = "E323";
			break;
		case "Irma":
			codice = "E325";
			break;
		case "Irsina":
			codice = "E326";
			break;
		case "Isasca":
			codice = "E327";
			break;
		case "Isca Sullo Ionio":
			codice = "E328";
			break;
		case "Ischia":
			codice = "E329";
			break;
		case "Ischia Di Castro":
			codice = "E330";
			break;
		case "Ischitella":
			codice = "E332";
			break;
		case "Iseo":
			codice = "E333";
			break;
		case "Isera":
			codice = "E334";
			break;
		case "Isernia":
			codice = "E335";
			break;
		case "Isili":
			codice = "E336";
			break;
		case "Isnello":
			codice = "E337";
			break;
		case "Isola D'Asti":
			codice = "E338";
			break;
		case "Isola Di Capo Rizzuto":
			codice = "E339";
			break;
		case "Isola Del Liri":
			codice = "E340";
			break;
		case "Isola Del Cantone":
			codice = "E341";
			break;
		case "Isola Del Gran Sasso D'Italia":
			codice = "E343";
			break;
		case "Isolabella":
			codice = "E345";
			break;
		case "Isolabona":
			codice = "E346";
			break;
		case "Isola Del Giglio":
			codice = "E348";
			break;
		case "Isola Della Scala":
			codice = "E349";
			break;
		case "Isola Delle Femmine":
			codice = "E350";
			break;
		case "Isola Del Piano":
			codice = "E351";
			break;
		case "Isola Di Fondra":
			codice = "E353";
			break;
		case "Isola Vicentina":
			codice = "E354";
			break;
		case "Isola Dovarese":
			codice = "E356";
			break;
		case "Isola Rizza":
			codice = "E358";
			break;
		case "Isola Sant'Antonio":
			codice = "E360";
			break;
		case "Isole Tremiti":
			codice = "E363";
			break;
		case "Isorella":
			codice = "E364";
			break;
		case "Ispani":
			codice = "E365";
			break;
		case "Ispica":
			codice = "E366";
			break;
		case "Ispra":
			codice = "E367";
			break;
		case "Issiglio":
			codice = "E368";
			break;
		case "Issime":
			codice = "E369";
			break;
		case "Isso":
			codice = "E370";
			break;
		case "Issogne":
			codice = "E371";
			break;
		case "Istrana":
			codice = "E373";
			break;
		case "Itala":
			codice = "E374";
			break;
		case "Itri":
			codice = "E375";
			break;
		case "Ittireddu":
			codice = "E376";
			break;
		case "Ittiri":
			codice = "E377";
			break;
		case "Ivano Fracena":
			codice = "E378";
			break;
		case "Ivrea":
			codice = "E379";
			break;
		case "Izano":
			codice = "E380";
			break;

		}

	}

	private void codiciComuniJ(String comune) {

		switch (comune) {
		case "Jacurso":
			codice = "E274";
			break;
		case "Jolanda Di Savoia":
			codice = "E320";
			break;
		case "Jelsi":
			codice = "E381";
			break;
		case "Jenne":
			codice = "E382";
			break;
		case "Jerago Con Orago":
			codice = "E386";
			break;
		case "Jerzu":
			codice = "E387";
			break;
		case "Jesi":
			codice = "E388";
			break;
		case "Joppolo":
			codice = "E389";
			break;
		case "Joppolo Giancacodiceio":
			codice = "E390";
			break;
		case "Jovencan":
			codice = "E391";
			break;
		case "Jesolo":
			codice = "C388";
			break;
		}

	}

	private void codiciComuniL(String comune) {

		switch (comune) {

		case "Lariano":
			codice = "M207";
			break;
		case "Lamezia Terme":
			codice = "M208";
			break;
		case "Ladispoli":
			codice = "M212";
			break;
		case "Loiri Porto San Paolo":
			codice = "M275";
			break;
		case "Lonato Del Garda":
			codice = "M312";
			break;
		case "Ledro":
			codice = "M313";
			break;
		case "Longarone":
			codice = "M342";// E672
			break;
		case "La Valletta Brianza":
			codice = "M348";
			break;
		case "Lessona":
			codice = "M371";
			break;
		case "Laterina Pergine Valdarno":
			codice = "M392";
			break;
		case "Lu E Cuccaro Monferrato":
			codice = "M420";
			break;
		case "Lusiana Conco":
			codice = "M427";
			break;
		case "La Magdeleine":
			codice = "A308";
			break;
		case "L'Aquila":
			codice = "A345";
			break;
		case "Lizzano In Belvedere":
			codice = "A771";
			break;
		case "Lungavilla":
			codice = "B387";
			break;
		case "Lentiai":
			codice = "C562";
			break;
		case "Lanuvio":
			codice = "C767";
			break;
		case "Locri":
			codice = "D976";
			break;
		case "Luni":
			codice = "G143";
			break;
		case "Labico":
			codice = "E392";
			break;
		case "Labro":
			codice = "E393";
			break;
		case "La Cassa":
			codice = "E394";
			break;
		case "Lacchiarella":
			codice = "E395";
			break;
		case "Lacco Ameno":
			codice = "E396";
			break;
		case "Lacedonia":
			codice = "E397";
			break;
		case "Laces":
			codice = "E398";
			break;
		case "Laconi":
			codice = "E400";
			break;
		case "Laerru":
			codice = "E401";
			break;
		case "Laganadi":
			codice = "E402";
			break;
		case "Laghi":
			codice = "E403";
			break;
		case "Laglio":
			codice = "E405";
			break;
		case "Lagnasco":
			codice = "E406";
			break;
		case "Lago":
			codice = "E407";
			break;
		case "Lagonegro":
			codice = "E409";
			break;
		case "Lagosanto":
			codice = "E410";
			break;
		case "Lagundo":
			codice = "E412";
			break;
		case "Lajatico":
			codice = "E413";
			break;
		case "Laigueglia":
			codice = "E414";
			break;
		case "Lainate":
			codice = "E415";
			break;
		case "Laino":
			codice = "E416";
			break;
		case "Laino Borgo":
			codice = "E417";
			break;
		case "Laino Castello":
			codice = "E419";
			break;
		case "Laion":
			codice = "E420";
			break;
		case "Laives":
			codice = "E421";
			break;
		case "Lallio":
			codice = "E422";
			break;
		case "La Loggia":
			codice = "E423";
			break;
		case "Lama Dei Peligni":
			codice = "E424";
			break;
		case "La Maddalena":
			codice = "E425";
			break;
		case "Lama Mocogno":
			codice = "E426";
			break;
		case "Lambrugo":
			codice = "E428";
			break;
		case "Lamon":
			codice = "E429";
			break;
		case "La Morra":
			codice = "E430";
			break;
		case "Lampedusa E Linosa":
			codice = "E431";
			break;
		case "Lamporecchio":
			codice = "E432";
			break;
		case "Lamporo":
			codice = "E433";
			break;
		case "Lana":
			codice = "E434";
			break;
		case "Lanciano":
			codice = "E435";
			break;
		case "Landiona":
			codice = "E436";
			break;
		case "Landriano":
			codice = "E437";
			break;
		case "Langhirano":
			codice = "E438";
			break;
		case "Langosco":
			codice = "E439";
			break;
		case "Lanusei":
			codice = "E441";
			break;
		case "Lanzada":
			codice = "E443";
			break;
		case "Lanzo D'Intelvi":
			codice = "E444";
			break;
		case "Lanzo Torinese":
			codice = "E445";
			break;
		case "Lapedona":
			codice = "E447";
			break;
		case "Lapio":
			codice = "E448";
			break;
		case "Lappano":
			codice = "E450";
			break;
		case "Larciano":
			codice = "E451";
			break;
		case "Lardaro":
			codice = "E452";
			break;
		case "Lardirago":
			codice = "E454";
			break;
		case "Lari":
			codice = "E455";
			break;
		case "Larino":
			codice = "E456";
			break;
		case "Lasa":
			codice = "E457";
			break;
		case "La Salle":
			codice = "E458";
			break;
		case "Lascari":
			codice = "E459";
			break;
		case "Lasino":
			codice = "E461";
			break;
		case "Lasnigo":
			codice = "E462";
			break;
		case "La Spezia":
			codice = "E463";
			break;
		case "Las Plassas":
			codice = "E464";
			break;
		case "Lastebasse":
			codice = "E465";
			break;
		case "Lastra A Signa":
			codice = "E466";
			break;
		case "Latera":
			codice = "E467";
			break;
		case "Laterina":
			codice = "E468";
			break;
		case "Laterza":
			codice = "E469";
			break;
		case "La Thuile":
			codice = "E470";
			break;
		case "Latiano":
			codice = "E471";
			break;
		case "Latina":
			codice = "E472";
			break;
		case "Latisana":
			codice = "E473";
			break;
		case "Latronico":
			codice = "E474";
			break;
		case "Lattarico":
			codice = "E475";
			break;
		case "Lauco":
			codice = "E476";
			break;
		case "Laureana Di Borrello":
			codice = "E479";
			break;
		case "Laureana Cilento":
			codice = "E480";
			break;
		case "Lauregno":
			codice = "E481";
			break;
		case "Laurenzana":
			codice = "E482";
			break;
		case "Lauria":
			codice = "E483";
			break;
		case "Lauriano":
			codice = "E484";
			break;
		case "Laurino":
			codice = "E485";
			break;
		case "Laurito":
			codice = "E486";
			break;
		case "Lauro":
			codice = "E487";
			break;
		case "Lavagna":
			codice = "E488";
			break;
		case "Lavagno":
			codice = "E489";
			break;
		case "La Valle Agordina":
			codice = "E490";
			break;
		case "La Valle":
			codice = "E491";
			break;
		case "Lavarone":
			codice = "E492";
			break;
		case "Lavello":
			codice = "E493";
			break;
		case "Lavena Ponte Tresa":
			codice = "E494";
			break;
		case "Laveno-Mombello":
			codice = "E496";
			break;
		case "Lavenone":
			codice = "E497";
			break;
		case "Laviano":
			codice = "E498";
			break;
		case "Lavis":
			codice = "E500";
			break;
		case "Lazise":
			codice = "E502";
			break;
		case "Lazzate":
			codice = "E504";
			break;
		case "Lecce Nei Marsi":
			codice = "E505";
			break;
		case "Lecce":
			codice = "E506";
			break;
		case "Lecco":
			codice = "E507";
			break;
		case "Leffe":
			codice = "E509";
			break;
		case "Leggiuno":
			codice = "E510";
			break;
		case "Legnago":
			codice = "E512";
			break;
		case "Legnano":
			codice = "E514";
			break;
		case "Legnaro":
			codice = "E515";
			break;
		case "Lei":
			codice = "E517";
			break;
		case "Leini":
			codice = "E518";
			break;
		case "Leivi":
			codice = "E519";
			break;
		case "Lemie":
			codice = "E520";
			break;
		case "Lendinara":
			codice = "E522";
			break;
		case "Leni":
			codice = "E523";
			break;
		case "Lenna":
			codice = "E524";
			break;
		case "Lenno":
			codice = "E525";
			break;
		case "Leno":
			codice = "E526";
			break;
		case "Lenola":
			codice = "E527";
			break;
		case "Lenta":
			codice = "E528";
			break;
		case "Lentate Sul Seveso":
			codice = "E530";
			break;
		case "Lentella":
			codice = "E531";
			break;
		case "Lentini":
			codice = "E532";
			break;
		case "Leonessa":
			codice = "E535";
			break;
		case "Leonforte":
			codice = "E536";
			break;
		case "Leporano":
			codice = "E537";
			break;
		case "Lequile":
			codice = "E538";
			break;
		case "Lequio Tanaro":
			codice = "E539";
			break;
		case "Lequio Berria":
			codice = "E540";
			break;
		case "Lercara Friddi":
			codice = "E541";
			break;
		case "Lerici":
			codice = "E542";
			break;
		case "Lerma":
			codice = "E543";
			break;
		case "Lesa":
			codice = "E544";
			break;
		case "Lesegno":
			codice = "E546";
			break;
		case "Lesignano Dè Bagni":
			codice = "E547";
			break;
		case "Lesina":
			codice = "E549";
			break;
		case "Lesmo":
			codice = "E550";
			break;
		case "Lessolo":
			codice = "E551";
			break;
		/*
		 * case "Lessona": codice = "E552"; break;
		 */
		case "Lestizza":
			codice = "E553";
			break;
		case "Letino":
			codice = "E554";
			break;
		case "Letojanni":
			codice = "E555";
			break;
		case "Lettere":
			codice = "E557";
			break;
		case "Lettomanoppello":
			codice = "E558";
			break;
		case "Lettopalena":
			codice = "E559";
			break;
		case "Levanto":
			codice = "E560";
			break;
		case "Levate":
			codice = "E562";
			break;
		case "Leverano":
			codice = "E563";
			break;
		case "Levice":
			codice = "E564";
			break;
		case "Levico Terme":
			codice = "E565";
			break;
		case "Levone":
			codice = "E566";
			break;
		case "Lezzeno":
			codice = "E569";
			break;
		case "Liberi":
			codice = "E570";
			break;
		case "Librizzi":
			codice = "E571";
			break;
		case "Licata":
			codice = "E573";
			break;
		case "Licciana Nardi":
			codice = "E574";
			break;
		case "Licenza":
			codice = "E576";
			break;
		case "Licodia Eubea":
			codice = "E578";
			break;
		case "Lierna":
			codice = "E581";
			break;
		case "Lignana":
			codice = "E583";
			break;
		case "Lignano Sabbiadoro":
			codice = "E584";
			break;
		case "Ligonchio":
			codice = "E585";
			break;
		case "Ligosullo":
			codice = "E586";
			break;
		case "Lillianes":
			codice = "E587";
			break;
		case "Limana":
			codice = "E588";
			break;
		case "Limatola":
			codice = "E589";
			break;
		case "Limbadi":
			codice = "E590";
			break;
		case "Limbiate":
			codice = "E591";
			break;
		case "Limena":
			codice = "E592";
			break;
		case "Limido Comasco":
			codice = "E593";
			break;
		case "Limina":
			codice = "E594";
			break;
		case "Limone Sul Garda":
			codice = "E596";
			break;
		case "Limone Piemonte":
			codice = "E597";
			break;
		case "Limosano":
			codice = "E599";
			break;
		case "Linarolo":
			codice = "E600";
			break;
		case "Linguaglossa":
			codice = "E602";
			break;
		case "Lioni":
			codice = "E605";
			break;
		case "Lipari":
			codice = "E606";
			break;
		case "Lipomo":
			codice = "E607";
			break;
		case "Lirio":
			codice = "E608";
			break;
		case "Liscate":
			codice = "E610";
			break;
		case "Liscia":
			codice = "E611";
			break;
		case "Lisciano Niccone":
			codice = "E613";
			break;
		case "Lisignago":
			codice = "E614";
			break;
		case "Lisio":
			codice = "E615";
			break;
		case "Lissone":
			codice = "E617";
			break;
		case "Liveri":
			codice = "E620";
			break;
		case "Livigno":
			codice = "E621";
			break;
		case "Livinallongo Del Col Di Lana":
			codice = "E622";
			break;
		case "Livo":
			codice = "E623";// E624
			break;
		case "Livorno":
			codice = "E625";
			break;
		case "Livorno Ferraris":
			codice = "E626";
			break;
		case "Livraga":
			codice = "E627";
			break;
		case "Lizzanello":
			codice = "E629";
			break;
		case "Lizzano":
			codice = "E630";
			break;
		case "Loano":
			codice = "E632";
			break;
		case "Loazzolo":
			codice = "E633";
			break;
		case "Locana":
			codice = "E635";
			break;
		case "Locate Varesino":
			codice = "E638";
			break;
		case "Locate Di Triulzi":
			codice = "E639";
			break;
		case "Locatello":
			codice = "E640";
			break;
		case "Loceri":
			codice = "E644";
			break;
		case "Locorotondo":
			codice = "E645";
			break;
		case "Loculi":
			codice = "E646";
			break;
		case "Lodè":
			codice = "E647";
			break;
		case "Lodi":
			codice = "E648";
			break;
		case "Lodine":
			codice = "E649";
			break;
		case "Lodi Vecchio":
			codice = "E651";
			break;
		case "Lodrino":
			codice = "E652";
			break;
		case "Lograto":
			codice = "E654";
			break;
		case "Loiano":
			codice = "E655";
			break;
		case "Lomagna":
			codice = "E656";
			break;
		case "Lomaso":
			codice = "E658";
			break;
		case "Lomazzo":
			codice = "E659";
			break;
		case "Lombardore":
			codice = "E660";
			break;
		case "Lombriasco":
			codice = "E661";
			break;
		case "Lomello":
			codice = "E662";
			break;
		case "Lona Lases":
			codice = "E664";
			break;
		case "Lonate Ceppino":
			codice = "E665";
			break;
		case "Lonate Pozzolo":
			codice = "E666";
			break;
		case "Lonato":
			codice = "E667";
			break;
		case "Londa":
			codice = "E668";
			break;
		case "Longano":
			codice = "E669";
			break;
		case "Longare":
			codice = "E671";
			break;
		case "Longhena":
			codice = "E673";
			break;
		case "Longi":
			codice = "E674";
			break;
		case "Longiano":
			codice = "E675";
			break;
		case "Longobardi":
			codice = "E677";
			break;
		case "Longobucco":
			codice = "E678";
			break;
		case "Longone Al Segrino":
			codice = "E679";
			break;
		case "Longone Sabino":
			codice = "E681";
			break;
		case "Lonigo":
			codice = "E682";
			break;
		case "Loranzè":
			codice = "E683";
			break;
		case "Loreggia":
			codice = "E684";
			break;
		case "Loreglia":
			codice = "E685";
			break;
		case "Lorenzago Di Cadore":
			codice = "E687";
			break;
		case "Lorenzana":
			codice = "E688";
			break;
		case "Loreo":
			codice = "E689";
			break;
		case "Loreto":
			codice = "E690";
			break;
		case "Loreto Aprutino":
			codice = "E691";
			break;
		case "Loria":
			codice = "E692";
			break;
		case "Loro Ciuffenna":
			codice = "E693";
			break;
		case "Loro Piceno":
			codice = "E694";
			break;
		case "Lorsica":
			codice = "E695";
			break;
		case "Losine":
			codice = "E698";
			break;
		case "Lotzorai":
			codice = "E700";
			break;
		case "Lovere":
			codice = "E704";
			break;
		case "Lovero":
			codice = "E705";
			break;
		case "Lozio":
			codice = "E706";
			break;
		case "Lozza":
			codice = "E707";
			break;
		case "Lozzo Di Cadore":
			codice = "E708";
			break;
		case "Lozzo Atestino":
			codice = "E709";
			break;
		case "Lozzolo":
			codice = "E711";
			break;
		case "Lu":
			codice = "E712";
			break;
		case "Lubriano":
			codice = "E713";
			break;
		case "Lucca Sicula":
			codice = "E714";
			break;
		case "Lucca":
			codice = "E715";
			break;
		case "Lucera":
			codice = "E716";
			break;
		case "Lucignano":
			codice = "E718";
			break;
		case "Lucinasco":
			codice = "E719";
			break;
		case "Lucito":
			codice = "E722";
			break;
		case "Luco Dei Marsi":
			codice = "E723";
			break;
		case "Lucoli":
			codice = "E724";
			break;
		case "Lugagnano Val D'Arda":
			codice = "E726";
			break;
		case "Lugnacco":
			codice = "E727";
			break;
		case "Lugnano In Teverina":
			codice = "E729";
			break;
		case "Lugo":
			codice = "E730";
			break;
		case "Lugo Di Vicenza":
			codice = "E731";
			break;
		case "Luino":
			codice = "E734";
			break;
		case "Louisago":
			codice = "E735";
			break;
		case "Lula":
			codice = "E736";
			break;
		case "Lumarzo":
			codice = "E737";
			break;
		case "Lumezzane":
			codice = "E738";
			break;
		case "Lunamatrona":
			codice = "E742";
			break;
		case "Lunano":
			codice = "E743";
			break;
		case "Lungro":
			codice = "E745";
			break;
		case "Luogosano":
			codice = "E746";
			break;
		case "Luogosanto":
			codice = "E747";
			break;
		case "Lupara":
			codice = "E748";
			break;
		case "Lurago D'Erba":
			codice = "E749";
			break;
		case "Lurago Marinone":
			codice = "E750";
			break;
		case "Lurano":
			codice = "E751";
			break;
		case "Luras":
			codice = "E752";
			break;
		case "Lurate Caccivio":
			codice = "E753";
			break;
		case "Lusciano":
			codice = "E754";
			break;
		case "Luserna":
			codice = "E757";
			break;
		case "Luserna San Giovanni":
			codice = "E758";
			break;
		case "Lusernetta":
			codice = "E759";
			break;
		case "Lusevera":
			codice = "E760";
			break;
		case "Lusia":
			codice = "E761";
			break;
		case "Lusiana":
			codice = "E762";
			break;
		case "Lusigliè":
			codice = "E763";
			break;
		case "Luson":
			codice = "E764";
			break;
		case "Lustra":
			codice = "E767";
			break;
		case "Luvinate":
			codice = "E769";
			break;
		case "Luzzana":
			codice = "E770";
			break;
		case "Luzzara":
			codice = "E772";
			break;
		case "Luzzi":
			codice = "E773";
			break;

		}

	}

	private void codiciComuniM(String comune) {

		switch (comune) {

		case "Montecatini Terme":
			codice = "A561";
			break;
		case "Motteggiana":
			codice = "B012";
			break;
		case "Montebello Sul Sangro":
			codice = "B268";
			break;
		case "Mandela":
			codice = "B632";
			break;
		case "Marzabotto":
			codice = "B689";
			break;
		case "Montebello Ionico":
			codice = "D746";
			break;
		case "Molina Aterno":
			codice = "M255";
			break;
		case "Masainas":
			codice = "M270";
			break;
		case "Mazzarrone":
			codice = "M271";
			break;
		case "Maniace":
			codice = "M283";
			break;
		case "Massa Di Somma":
			codice = "M289";
			break;
		case "Montiglio Monferrato":
			codice = "M302";
			break;
		case "Mosso":
			codice = "M304";
			break;
		case "Mappano":
			codice = "M316";
			break;
		case "Montoro":
			codice = "M330";
			break;
		case "Maccagno Con Pino E Veddasca":
			codice = "M339";
			break;
		case "Madruzzo":
			codice = "M357";
			break;
		case "Montescudo-Monte Colombo":
			codice = "M368";
			break;
		case "Montalto Carpasio":
			codice = "M387";
			break;
		case "Morimondo":
			codice = "D033";
			break;
		case "Moncenisio":
			codice = "D553";
			break;
		case "Madesimo":
			codice = "E342";
			break;
		case "Milena":
			codice = "E618";
			break;
		case "Maccagno":
			codice = "E775";
			break;
		case "Maccastorna":
			codice = "E777";
			break;
		case "Macchia D'Isernia":
			codice = "E778";
			break;
		case "Macchiagodena":
			codice = "E779";
			break;
		case "Macchia Valfortore":
			codice = "E780";
			break;
		case "Macello":
			codice = "E782";
			break;
		case "Macerata":
			codice = "E783";
			break;
		case "Macerata Campania":
			codice = "E784";
			break;
		case "Macerata Feltria":
			codice = "E785";
			break;
		case "Macherio":
			codice = "E786";
			break;
		case "Maclodio":
			codice = "E787";
			break;
		case "Macomer":
			codice = "E788";
			break;
		case "Macra":
			codice = "E789";
			break;
		case "Macugnaga":
			codice = "E790";
			break;
		case "Maddaloni":
			codice = "E791";
			break;
		case "Madignano":
			codice = "E793";
			break;
		case "Madone":
			codice = "E794";
			break;
		case "Madonna Del Sasso":
			codice = "E795";
			break;
		case "Maenza":
			codice = "E798";
			break;
		case "Mafalda":
			codice = "E799";
			break;
		case "Magasa":
			codice = "E800";
			break;
		case "Magenta":
			codice = "E801";
			break;
		case "Maggiora":
			codice = "E803";
			break;
		case "Magherno":
			codice = "E804";
			break;
		case "Magione":
			codice = "E805";
			break;
		case "Magisano":
			codice = "E806";
			break;
		case "Magliano Di Tenna":
			codice = "E807";
			break;
		case "Magliano Alpi":
			codice = "E808";
			break;
		case "Magliano Alfieri":
			codice = "E809";
			break;
		case "Magliano In Toscana":
			codice = "E810";
			break;
		case "Magliano Dè Marsi":
			codice = "E811";
			break;
		case "Magliano Sabina":
			codice = "E812";
			break;
		case "Magliano Romano":
			codice = "E813";
			break;
		case "Magliano Vetere":
			codice = "E814";
			break;
		case "Maglie":
			codice = "E815";
			break;
		case "Magliolo":
			codice = "E816";
			break;
		case "Maglione":
			codice = "E817";
			break;
		case "Magnacavallo":
			codice = "E818";
			break;
		case "Magnago":
			codice = "E819";
			break;
		case "Magnano In Riviera":
			codice = "E820";
			break;
		case "Magnano":
			codice = "E821";
			break;
		case "Magomadas":
			codice = "E825";
			break;
		case "Magrè Sulla Strada Del Vino":
			codice = "E829";
			break;
		case "Magreglio":
			codice = "E830";
			break;
		case "Majano":
			codice = "E833";
			break;
		case "Maida":
			codice = "E834";
			break;
		case "Maierà":
			codice = "E835";
			break;
		case "Maierato":
			codice = "E836";
			break;
		case "Maiolati Spontini":
			codice = "E837";
			break;
		case "Maiolo":
			codice = "E838";
			break;
		case "Maiori":
			codice = "E839";
			break;
		case "Mairago":
			codice = "E840";
			break;
		case "Mairano":
			codice = "E841";
			break;
		case "Maissana":
			codice = "E842";
			break;
		case "Malagnino":
			codice = "E843";
			break;
		case "Malalbergo":
			codice = "E844";
			break;
		case "Malborghetto-Valbruna":
			codice = "E847";
			break;
		case "Malcesine":
			codice = "E848";
			break;
		case "Malè":
			codice = "E850";
			break;
		case "Malegno":
			codice = "E851";
			break;
		case "Maleo":
			codice = "E852";
			break;
		case "Malesco":
			codice = "E853";
			break;
		case "Maletto":
			codice = "E854";
			break;
		case "Malfa":
			codice = "E855";
			break;
		case "Malgesso":
			codice = "E856";
			break;
		case "Malgrate":
			codice = "E858";
			break;
		case "Malito":
			codice = "E859";
			break;
		case "Mallare":
			codice = "E860";
			break;
		case "Malles Venosta":
			codice = "E862";
			break;
		case "Malnate":
			codice = "E863";
			break;
		case "Malo":
			codice = "E864";
			break;
		case "Malonno":
			codice = "E865";
			break;
		case "Malosco":
			codice = "E866";
			break;
		case "Maltignano":
			codice = "E868";
			break;
		case "Malvagna":
			codice = "E869";
			break;
		case "Malvicino":
			codice = "E870";
			break;
		case "Malvito":
			codice = "E872";
			break;
		case "Mammola":
			codice = "E873";
			break;
		case "Mamoiada":
			codice = "E874";
			break;
		case "Manciano":
			codice = "E875";
			break;
		case "Mandanici":
			codice = "E876";
			break;
		case "Mandas":
			codice = "E877";
			break;
		case "Mandatoriccio":
			codice = "E878";
			break;
		case "Mandello Del Lario":
			codice = "E879";
			break;
		case "Mandello Vitta":
			codice = "E880";
			break;
		case "Manduria":
			codice = "E882";
			break;
		case "Manerba Del Garda":
			codice = "E883";
			break;
		case "Manerbio":
			codice = "E884";
			break;
		case "Manfredonia":
			codice = "E885";
			break;
		case "Mango":
			codice = "E887";
			break;
		case "Mangone":
			codice = "E888";
			break;
		case "Maniago":
			codice = "E889";
			break;
		case "Manocalzati":
			codice = "E891";
			break;
		case "Manoppello":
			codice = "E892";
			break;
		case "Mansuè":
			codice = "E893";
			break;
		case "Manta":
			codice = "E894";
			break;
		case "Mantello":
			codice = "E896";
			break;
		case "Mantova":
			codice = "E897";
			break;
		case "Manzano":
			codice = "E899";
			break;
		case "Manziana":
			codice = "E900";
			break;
		case "Mapello":
			codice = "E901";
			break;
		case "Mara":
			codice = "E902";
			break;
		case "Maracalagonis":
			codice = "E903";
			break;
		case "Maranello":
			codice = "E904";
			break;
		case "Marano Sul Panaro":
			codice = "E905";
			break;
		case "Marano Di Napoli":
			codice = "E906";
			break;
		case "Marano Ticino":
			codice = "E907";
			break;
		case "Marano Equo":
			codice = "E908";
			break;
		case "Marano Lagunare":
			codice = "E910";
			break;
		case "Marano Di Valpolicella":
			codice = "E911";
			break;
		case "Marano Vicentino":
			codice = "E912";
			break;
		case "Marano Marchesato":
			codice = "E914";
			break;
		case "Marano Principato":
			codice = "E915";
			break;
		case "Maranzana":
			codice = "E917";
			break;
		case "Maratea":
			codice = "E919";
			break;
		case "Marcallo Con Casone":
			codice = "E921";
			break;
		case "Marcaria":
			codice = "E922";
			break;
		case "Marcedusa":
			codice = "E923";
			break;
		case "Marcellina":
			codice = "E924";
			break;
		case "Marcellinara":
			codice = "E925";
			break;
		case "Marcetelli":
			codice = "E927";
			break;
		case "Marcheno":
			codice = "E928";
			break;
		case "Marchirolo":
			codice = "E929";
			break;
		case "Marciana":
			codice = "E930";
			break;
		case "Marciana Marina":
			codice = "E931";
			break;
		case "Marcianise":
			codice = "E932";
			break;
		case "Marciano Della Chiana":
			codice = "E933";
			break;
		case "Marcignago":
			codice = "E934";
			break;
		case "Marcon":
			codice = "E936";
			break;
		case "Marebbe":
			codice = "E938";
			break;
		case "Marene":
			codice = "E939";
			break;
		case "Mareno Di Piave":
			codice = "E940";
			break;
		case "Marentino":
			codice = "E941";
			break;
		case "Maretto":
			codice = "E944";
			break;
		case "Margarita":
			codice = "E945";
			break;
		case "Margherita Di Savoia":
			codice = "E946";
			break;
		case "Margno":
			codice = "E947";
			break;
		case "Mariana Mantovana":
			codice = "E949";
			break;
		case "Mariano Comense":
			codice = "E951";
			break;
		case "Mariano Del Friuli":
			codice = "E952";
			break;
		case "Marianopoli":
			codice = "E953";
			break;
		case "Mariglianella":
			codice = "E954";
			break;
		case "Marigliano":
			codice = "E955";
			break;
		case "Marina Di Gioiosa Ionica":
			codice = "E956";
			break;
		case "Marineo":
			codice = "E957";
			break;
		case "Marino":
			codice = "E958";
			break;
		case "Marlengo":
			codice = "E959";
			break;
		case "Marliana":
			codice = "E960";
			break;
		case "Marmentino":
			codice = "E961";
			break;
		case "Marmirolo":
			codice = "E962";
			break;
		case "Marmora":
			codice = "E963";
			break;
		case "Marnate":
			codice = "E965";
			break;
		case "Marone":
			codice = "E967";
			break;
		case "Maropati":
			codice = "E968";
			break;
		case "Marostica":
			codice = "E970";
			break;
		case "Marradi":
			codice = "E971";
			break;
		case "Marrubiu":
			codice = "E972";
			break;
		case "Marsaglia":
			codice = "E973";
			break;
		case "Marsala":
			codice = "E974";
			break;
		case "Marsciano":
			codice = "E975";
			break;
		case "Marsico Nuovo":
			codice = "E976";
			break;
		case "Marsicovetere":
			codice = "E977";
			break;
		case "Marta":
			codice = "E978";
			break;
		case "Martano":
			codice = "E979";
			break;
		case "Martellago":
			codice = "E980";
			break;
		case "Martello":
			codice = "E981";
			break;
		case "Martignacco":
			codice = "E982";
			break;
		case "Martignana Di Po":
			codice = "E983";
			break;
		case "Martignano":
			codice = "E984";
			break;
		case "Martina Franca":
			codice = "E986";
			break;
		case "Martinengo":
			codice = "E987";
			break;
		case "Martiniana Po":
			codice = "E988";
			break;
		case "Martinsicuro":
			codice = "E989";
			break;
		case "Martirano":
			codice = "E990";
			break;
		case "Martirano Lombardo":
			codice = "E991";
			break;
		case "Martis":
			codice = "E992";
			break;
		case "Martone":
			codice = "E993";
			break;
		case "Marudo":
			codice = "E994";
			break;
		case "Maruggio":
			codice = "E995";
			break;
		case "Marzano Di Nola":
			codice = "E997";
			break;
		case "Marzano Appio":
			codice = "E998";
			break;
		case "Marzano":
			codice = "E999";
			break;
		case "Marzi":
			codice = "F001";
			break;
		case "Marzio":
			codice = "F002";
			break;
		case "Masate":
			codice = "F003";
			break;
		case "Mascali":
			codice = "F004";
			break;
		case "Mascalucia":
			codice = "F005";
			break;
		case "Maschito":
			codice = "F006";
			break;
		case "Masciago Primo":
			codice = "F007";
			break;
		case "Maser":
			codice = "F009";
			break;
		case "Masera":
			codice = "F010";
			break;
		case "Maserà Di Padova":
			codice = "F011";
			break;
		case "Maserada Sul Piave":
			codice = "F012";
			break;
		case "Masi":
			codice = "F013";
			break;
		case "Masio":
			codice = "F015";
			break;
		case "Masi Torello":
			codice = "F016";
			break;
		case "Maslianico":
			codice = "F017";
			break;
		case "Mason Vicentino":
			codice = "F019";
			break;
		case "Masone":
			codice = "F020";
			break;
		case "Massa Fermana":
			codice = "F021";
			break;
		case "Massa D'Albe":
			codice = "F022";
			break;
		case "Massa":
			codice = "F023";
			break;
		case "Massa Martana":
			codice = "F024";
			break;
		case "Massa E Cozzile":
			codice = "F025";
			break;
		case "Massa Fiscaglia":
			codice = "F026";
			break;
		case "Massafra":
			codice = "F027";
			break;
		case "Massalengo":
			codice = "F028";
			break;
		case "Massa Lombarda":
			codice = "F029";
			break;
		case "Massa Lubrense":
			codice = "F030";
			break;
		case "Massa Marittima":
			codice = "F032";
			break;
		case "Massanzago":
			codice = "F033";
			break;
		case "Massarosa":
			codice = "F035";
			break;
		case "Massazza":
			codice = "F037";
			break;
		case "Massello":
			codice = "F041";
			break;
		case "Masserano":
			codice = "F042";
			break;
		case "Massignano":
			codice = "F044";
			break;
		case "Massimeno":
			codice = "F045";
			break;
		case "Massimino":
			codice = "F046";
			break;
		case "Massino Visconti":
			codice = "F047";
			break;
		case "Massiola":
			codice = "F048";
			break;
		case "Masullas":
			codice = "F050";
			break;
		case "Matelica":
			codice = "F051";
			break;
		case "Matera":
			codice = "F052";
			break;
		case "Mathi":
			codice = "F053";
			break;
		case "Matino":
			codice = "F054";
			break;
		case "Matrice":
			codice = "F055";
			break;
		case "Mattie":
			codice = "F058";
			break;
		case "Mattinata":
			codice = "F059";
			break;
		case "Mazara Del Vallo":
			codice = "F061";
			break;
		case "Mazzano":
			codice = "F063";
			break;
		case "Mazzano Romano":
			codice = "F064";
			break;
		case "Mazzarino":
			codice = "F065";
			break;
		case "Mazzarrà Sant'Andrea":
			codice = "F066";
			break;
		case "Mazzè":
			codice = "F067";
			break;
		case "Mazzin":
			codice = "F068";
			break;
		case "Mazzo Di Valtellina":
			codice = "F070";
			break;
		case "Meana Sardo":
			codice = "F073";
			break;
		case "Meana Di Susa":
			codice = "F074";
			break;
		case "Meda":
			codice = "F078";
			break;
		case "Mede":
			codice = "F080";
			break;
		case "Medea":
			codice = "F081";
			break;
		case "Medesano":
			codice = "F082";
			break;
		case "Medicina":
			codice = "F083";
			break;
		case "Mediglia":
			codice = "F084";
			break;
		case "Medolago":
			codice = "F085";
			break;
		case "Medole":
			codice = "F086";
			break;
		case "Medolla":
			codice = "F087";
			break;
		case "Meduna Di Livenza":
			codice = "F088";
			break;
		case "Meduno":
			codice = "F089";
			break;
		case "Megliadino San Fidenzio":
			codice = "F091";
			break;
		case "Megliadino San Vitale":
			codice = "F092";
			break;
		case "Meina":
			codice = "F093";
			break;
		case "Mel":
			codice = "F094";
			break;
		case "Melara":
			codice = "F095";
			break;
		case "Melazzo":
			codice = "F096";
			break;
		case "Meldola":
			codice = "F097";
			break;
		case "Mele":
			codice = "F098";
			break;
		case "Melegnano":
			codice = "F100";
			break;
		case "Melendugno":
			codice = "F101";
			break;
		case "Meleti":
			codice = "F102";
			break;
		case "Melfi":
			codice = "F104";
			break;
		case "Melicuccà":
			codice = "F105";
			break;
		case "Melicucco":
			codice = "F106";
			break;
		case "Melilli":
			codice = "F107";
			break;
		case "Melissa":
			codice = "F108";
			break;
		case "Melissano":
			codice = "F109";
			break;
		case "Melito Irpino":
			codice = "F110";
			break;
		case "Melito Di Napoli":
			codice = "F111";
			break;
		case "Melito Di Porto Salvo":
			codice = "F112";
			break;
		case "Melizzano":
			codice = "F113";
			break;
		case "Melle":
			codice = "F114";
			break;
		case "Mello":
			codice = "F115";
			break;
		case "Melpignano":
			codice = "F117";
			break;
		case "Meltina":
			codice = "F118";
			break;
		case "Melzo":
			codice = "F119";
			break;
		case "Menaggio":
			codice = "F120";
			break;
		case "Menarola":
			codice = "F121";
			break;
		case "Menconico":
			codice = "F122";
			break;
		case "Mendatica":
			codice = "F123";
			break;
		case "Mendicino":
			codice = "F125";
			break;
		case "Menfi":
			codice = "F126";
			break;
		case "Mentana":
			codice = "F127";
			break;
		case "Meolo":
			codice = "F130";
			break;
		case "Merana":
			codice = "F131";
			break;
		case "Merano":
			codice = "F132";
			break;
		case "Merate":
			codice = "F133";
			break;
		case "Mercallo":
			codice = "F134";
			break;
		case "Mercatello Sul Metauro":
			codice = "F135";
			break;
		case "Mercatino Conca":
			codice = "F136";
			break;
		case "Mercato San Severino":
			codice = "F138";
			break;
		case "Mercato Saraceno":
			codice = "F139";
			break;
		case "Mercenasco":
			codice = "F140";
			break;
		case "Mercogliano":
			codice = "F141";
			break;
		case "Mereto Di Tomba":
			codice = "F144";
			break;
		case "Mergo":
			codice = "F145";
			break;
		case "Mergozzo":
			codice = "F146";
			break;
		case "Merì":
			codice = "F147";
			break;
		case "Merlara":
			codice = "F148";
			break;
		case "Merlino":
			codice = "F149";
			break;
		case "Merone":
			codice = "F151";
			break;
		case "Mesagne":
			codice = "F152";
			break;
		case "Mese":
			codice = "F153";
			break;
		case "Mesenzana":
			codice = "F154";
			break;
		case "Mesero":
			codice = "F155";
			break;
		case "Mesola":
			codice = "F156";
			break;
		case "Mesoraca":
			codice = "F157";
			break;
		case "Messina":
			codice = "F158";
			break;
		case "Mestrino":
			codice = "F161";
			break;
		case "Meta":
			codice = "F162";
			break;
		case "Meugliano":
			codice = "F164";
			break;
		case "Mezzago":
			codice = "F165";
			break;
		case "Mezzana Mortigliengo":
			codice = "F167";
			break;
		case "Mezzana":
			codice = "F168";
			break;
		case "Mezzana Bigli":
			codice = "F170";
			break;
		case "Mezzana Rabattone":
			codice = "F171";
			break;
		case "Mezzane Di Sotto":
			codice = "F172";
			break;
		case "Mezzanego":
			codice = "F173";
			break;
		case "Mezzani":
			codice = "F174";
			break;
		case "Mezzanino":
			codice = "F175";
			break;
		case "Mezzano":
			codice = "F176";
			break;
		case "Mezzegra":
			codice = "F181";
			break;
		case "Mezzenile":
			codice = "F182";
			break;
		case "Mezzocorona":
			codice = "F183";
			break;
		case "Mezzojuso":
			codice = "F184";
			break;
		case "Mezzoldo":
			codice = "F186";
			break;
		case "Mezzolombardo":
			codice = "F187";
			break;
		case "Mezzomerico":
			codice = "F188";
			break;
		case "Miagliano":
			codice = "F189";
			break;
		case "Miane":
			codice = "F190";
			break;
		case "Miasino":
			codice = "F191";
			break;
		case "Miazzina":
			codice = "F192";
			break;
		case "Micigliano":
			codice = "F193";
			break;
		case "Miggiano":
			codice = "F194";
			break;
		case "Miglianico":
			codice = "F196";
			break;
		case "Migliarino":
			codice = "F198";
			break;
		case "Migliaro":
			codice = "F199";
			break;
		case "Miglierina":
			codice = "F200";
			break;
		case "Miglionico":
			codice = "F201";
			break;
		case "Mignanego":
			codice = "F202";
			break;
		case "Mignano Monte Lungo":
			codice = "F203";
			break;
		case "Milano":
			codice = "F205";
			break;
		case "Milazzo":
			codice = "F206";
			break;
		case "Mileto":
			codice = "F207";
			break;
		case "Milis":
			codice = "F208";
			break;
		case "Militello In Val Di Catania":
			codice = "F209";
			break;
		case "Militello Rosmarino":
			codice = "F210";
			break;
		case "Millesimo":
			codice = "F213";
			break;
		case "Milo":
			codice = "F214";
			break;
		case "Milzano":
			codice = "F216";
			break;
		case "Mineo":
			codice = "F217";
			break;
		case "Minerbe":
			codice = "F218";
			break;
		case "Minerbio":
			codice = "F219";
			break;
		case "Minervino Murge":
			codice = "F220";
			break;
		case "Minervino Di Lecce":
			codice = "F221";
			break;
		case "Minori":
			codice = "F223";
			break;
		case "Minturno":
			codice = "F224";
			break;
		case "Minucciano":
			codice = "F225";
			break;
		case "Mioglia":
			codice = "F226";
			break;
		case "Mira":
			codice = "F229";
			break;
		case "Mirabella Eclano":
			codice = "F230";
			break;
		case "Mirabella Imbaccari":
			codice = "F231";
			break;
		case "Mirabello Monferrato":
			codice = "F232";
			break;
		case "Mirabello Sannitico":
			codice = "F233";
			break;
		case "Mirabello":
			codice = "F235";
			break;
		case "Miradolo Terme":
			codice = "F238";
			break;
		case "Miranda":
			codice = "F239";
			break;
		case "Mirandola":
			codice = "F240";
			break;
		case "Mirano":
			codice = "F241";
			break;
		case "Mirto":
			codice = "F242";
			break;
		case "Misano Di Gera D'Adda":
			codice = "F243";
			break;
		case "Misano Adriatico":
			codice = "F244";
			break;
		case "Misilmeri":
			codice = "F246";
			break;
		case "Misinto":
			codice = "F247";
			break;
		case "Missaglia":
			codice = "F248";
			break;
		case "Missanello":
			codice = "F249";
			break;
		case "Misterbianco":
			codice = "F250";
			break;
		case "Mistretta":
			codice = "F251";
			break;
		case "Moasca":
			codice = "F254";
			break;
		case "Moconesi":
			codice = "F256";
			break;
		case "Modena":
			codice = "F257";
			break;
		case "Modica":
			codice = "F258";
			break;
		case "Modigliana":
			codice = "F259";
			break;
		case "Modolo":
			codice = "F261";
			break;
		case "Modugno":
			codice = "F262";
			break;
		case "Moena":
			codice = "F263";
			break;
		case "Moggio":
			codice = "F265";
			break;
		case "Moggio Udinese":
			codice = "F266";
			break;
		case "Moglia":
			codice = "F267";
			break;
		case "Mogliano":
			codice = "F268";
			break;
		case "Mogliano Veneto":
			codice = "F269";
			break;
		case "Mogorella":
			codice = "F270";
			break;
		case "Mogoro":
			codice = "F272";
			break;
		case "Moiano":
			codice = "F274";
			break;
		case "Moimacco":
			codice = "F275";
			break;
		case "Moio Dè Calvi":
			codice = "F276";
			break;
		case "Moio Alcantara":
			codice = "F277";
			break;
		case "Moio Della Civitella":
			codice = "F278";
			break;
		case "Moiola":
			codice = "F279";
			break;
		case "Mola Di Bari":
			codice = "F280";
			break;
		case "Molare":
			codice = "F281";
			break;
		case "Molazzana":
			codice = "F283";
			break;
		case "Molfetta":
			codice = "F284";
			break;
		case "Molina Di Ledro":
			codice = "F286";
			break;
		case "Molinara":
			codice = "F287";
			break;
		case "Molinella":
			codice = "F288";
			break;
		case "Molini Di Triora":
			codice = "F290";
			break;
		case "Molino Dei Torti":
			codice = "F293";
			break;
		case "Molise":
			codice = "F294";
			break;
		case "Moliterno":
			codice = "F295";
			break;
		case "Mollia":
			codice = "F297";
			break;
		case "Molochio":
			codice = "F301";
			break;
		case "Molteno":
			codice = "F304";
			break;
		case "Moltrasio":
			codice = "F305";
			break;
		case "Molvena":
			codice = "F306";
			break;
		case "Molveno":
			codice = "F307";
			break;
		case "Mombaldone":
			codice = "F308";
			break;
		case "Mombarcaro":
			codice = "F309";
			break;
		case "Mombaroccio":
			codice = "F310";
			break;
		case "Mombaruzzo":
			codice = "F311";
			break;
		case "Mombasiglio":
			codice = "F312";
			break;
		case "Mombello Monferrato":
			codice = "F313";
			break;
		case "Mombello Di Torino":
			codice = "F315";
			break;
		case "Mombercelli":
			codice = "F316";
			break;
		case "Momo":
			codice = "F317";
			break;
		case "Mompantero":
			codice = "F318";
			break;
		case "Mompeo":
			codice = "F319";
			break;
		case "Momperone":
			codice = "F320";
			break;
		case "Monacilioni":
			codice = "F322";
			break;
		case "Monale":
			codice = "F323";
			break;
		case "Monasterace":
			codice = "F324";
			break;
		case "Monastero Bormida":
			codice = "F325";
			break;
		case "Monastero Di Vasco":
			codice = "F326";
			break;
		case "Monastero Di Lanzo":
			codice = "F327";
			break;
		case "Monasterolo Del Castello":
			codice = "F328";
			break;
		case "Monasterolo Casotto":
			codice = "F329";
			break;
		case "Monasterolo Di Savigliano":
			codice = "F330";
			break;
		case "Monastier Di Treviso":
			codice = "F332";
			break;
		case "Monastir":
			codice = "F333";
			break;
		case "Moncalieri":
			codice = "F335";
			break;
		case "Moncalvo":
			codice = "F336";
			break;
		case "Moncestino":
			codice = "F337";
			break;
		case "Monchiero":
			codice = "F338";
			break;
		case "Monchio Delle Corti":
			codice = "F340";
			break;
		case "Monclassico":
			codice = "F341";
			break;
		case "Moncrivello":
			codice = "F342";
			break;
		case "Moncucco Torinese":
			codice = "F343";
			break;
		case "Mondaino":
			codice = "F346";
			break;
		case "Mondavio":
			codice = "F347";
			break;
		case "Mondolfo":
			codice = "F348";
			break;
		case "Mondovì":
			codice = "F351";
			break;
		case "Mondragone":
			codice = "F352";
			break;
		case "Moneglia":
			codice = "F354";
			break;
		case "Monesiglio":
			codice = "F355";
			break;
		case "Monfalcone":
			codice = "F356";
			break;
		case "Monforte D'Alba":
			codice = "F358";
			break;
		case "Monforte San Giorgio":
			codice = "F359";
			break;
		case "Monfumo":
			codice = "F360";
			break;
		case "Mongardino":
			codice = "F361";
			break;
		case "Monghidoro":
			codice = "F363";
			break;
		case "Mongiana":
			codice = "F364";
			break;
		case "Mongiardino Ligure":
			codice = "F365";
			break;
		case "Montjovet":
			codice = "F367";
			break;
		case "Mongiuffi Melia":
			codice = "F368";
			break;
		case "Mongrando":
			codice = "F369";
			break;
		case "Mongrassano":
			codice = "F370";
			break;
		case "Monguelfo-Tesido":
			codice = "F371";
			break;
		case "Monguzzo":
			codice = "F372";
			break;
		case "Moniga Del Garda":
			codice = "F373";
			break;
		case "Monleale":
			codice = "F374";
			break;
		case "Monno":
			codice = "F375";
			break;
		case "Monopoli":
			codice = "F376";
			break;
		case "Monreale":
			codice = "F377";
			break;
		case "Monrupino":
			codice = "F378";
			break;
		case "Monsampietro Morico":
			codice = "F379";
			break;
		case "Monsampolo Del Tronto":
			codice = "F380";
			break;
		case "Monsano":
			codice = "F381";
			break;
		case "Monselice":
			codice = "F382";
			break;
		case "Monserrato":
			codice = "F383";
			break;
		case "Monsummano Terme":
			codice = "F384";
			break;
		case "Montà":
			codice = "F385";
			break;
		case "Montabone":
			codice = "F386";
			break;
		case "Montacuto":
			codice = "F387";
			break;
		case "Montafia":
			codice = "F390";
			break;
		case "Montagano":
			codice = "F391";
			break;
		case "Montagna":
			codice = "F392";
			break;
		case "Montagna In Valtellina":
			codice = "F393";
			break;
		case "Montagnana":
			codice = "F394";
			break;
		case "Montagnareale":
			codice = "F395";
			break;
		case "Montagne":
			codice = "F396";
			break;
		case "Montaguto":
			codice = "F397";
			break;
		case "Montaione":
			codice = "F398";
			break;
		case "Montalbano Jonico":
			codice = "F399";
			break;
		case "Montalbano Elicona":
			codice = "F400";
			break;
		case "Montalcino":
			codice = "F402";// M378
			break;
		case "Montaldeo":
			codice = "F403";
			break;
		case "Montaldo Bormida":
			codice = "F404";
			break;
		case "Montaldo Di Mondovì":
			codice = "F405";
			break;
		case "Montalto Ligure":
			codice = "F406";
			break;
		case "Montaldo Torinese":
			codice = "F407";
			break;
		case "Montaldo Roero":
			codice = "F408";
			break;
		case "Montaldo Scarampi":
			codice = "F409";
			break;
		case "Montale":
			codice = "F410";
			break;
		case "Montalenghe":
			codice = "F411";
			break;
		case "Montallegro":
			codice = "F414";
			break;
		case "Montalto Delle Marche":
			codice = "F415";
			break;
		case "Montalto Uffugo":
			codice = "F416";
			break;
		case "Montalto Pavese":
			codice = "F417";
			break;
		case "Montalto Di Castro":
			codice = "F419";
			break;
		case "Montalto Dora":
			codice = "F420";
			break;
		case "Montanaro":
			codice = "F422";
			break;
		case "Montanaso Lombardo":
			codice = "F423";
			break;
		case "Montanera":
			codice = "F424";
			break;
		case "Montano Antilia":
			codice = "F426";
			break;
		case "Montano Lucino":
			codice = "F427";
			break;
		case "Montappone":
			codice = "F428";
			break;
		case "Montaquila":
			codice = "F429";
			break;
		case "Montasola":
			codice = "F430";
			break;
		case "Montauro":
			codice = "F432";
			break;
		case "Montazzoli":
			codice = "F433";
			break;
		case "Monte Cremasco":
			codice = "F434";
			break;
		case "Monte Argentario":
			codice = "F437";
			break;
		case "Montebello Della Battaglia":
			codice = "F440";
			break;
		case "Montebello Di Bertona":
			codice = "F441";
			break;
		case "Montebello Vicentino":
			codice = "F442";
			break;
		case "Montebelluna":
			codice = "F443";
			break;
		case "Montebruno":
			codice = "F445";
			break;
		case "Montebuono":
			codice = "F446";
			break;
		case "Montecalvo Irpino":
			codice = "F448";
			break;
		case "Montecalvo Versiggia":
			codice = "F449";
			break;
		case "Montecalvo In Foglia":
			codice = "F450";
			break;
		case "Montecarlo":
			codice = "F452";
			break;
		case "Montecarotto":
			codice = "F453";
			break;
		case "Montecassiano":
			codice = "F454";
			break;
		case "Montecastello":
			codice = "F455";
			break;
		case "Monte Castello Di Vibio":
			codice = "F456";
			break;
		case "Montecastrilli":
			codice = "F457";
			break;
		case "Montecatini Val Di Cecina":
			codice = "F458";
			break;
		case "Monte Cavallo":
			codice = "F460";
			break;
		case "Montecchia Di Crosara":
			codice = "F461";
			break;
		case "Montecchio":
			codice = "F462";
			break;
		case "Montecchio Emilia":
			codice = "F463";
			break;
		case "Montecchio Maggiore":
			codice = "F464";
			break;
		case "Montecchio Precalcino":
			codice = "F465";
			break;
		case "Monte Cerignone":
			codice = "F467";
			break;
		case "Montechiaro D'Asti":
			codice = "F468";
			break;
		case "Montechiaro D'Acqui":
			codice = "F469";
			break;
		case "Montichiari":
			codice = "F471";
			break;
		case "Montechiarugolo":
			codice = "F473";
			break;
		case "Monteciccardo":
			codice = "F474";
			break;
		case "Montecilfone":
			codice = "F475";
			break;
		case "Monte Colombo":
			codice = "F476";
			break;
		case "Monte Compatri":
			codice = "F477";
			break;
		case "Montecopiolo":
			codice = "F478";
			break;
		case "Montecorice":
			codice = "F479";
			break;
		case "Montecorvino Pugliano":
			codice = "F480";
			break;
		case "Montecorvino Rovella":
			codice = "F481";
			break;
		case "Montecosaro":
			codice = "F482";
			break;
		case "Montecrestese":
			codice = "F483";
			break;
		case "Montecreto":
			codice = "F484";
			break;
		case "Monte Di Malo":
			codice = "F486";
			break;
		case "Montedinove":
			codice = "F487";
			break;
		case "Monte Di Procida":
			codice = "F488";
			break;
		case "Montedoro":
			codice = "F489";
			break;
		case "Montefalcione":
			codice = "F491";
			break;
		case "Montefalco":
			codice = "F492";
			break;
		case "Montefalcone Appennino":
			codice = "F493";
			break;
		case "Montefalcone Di Val Fortore":
			codice = "F494";
			break;
		case "Montefalcone Nel Sannio":
			codice = "F495";
			break;
		case "Montefano":
			codice = "F496";
			break;
		case "Montefelcino":
			codice = "F497";
			break;
		case "Monteferrante":
			codice = "F498";
			break;
		case "Montefiascone":
			codice = "F499";
			break;
		case "Montefino":
			codice = "F500";
			break;
		case "Montefiore Dell'Aso":
			codice = "F501";
			break;
		case "Montefiore Conca":
			codice = "F502";
			break;
		case "Montefiorino":
			codice = "F503";
			break;
		case "Monteflavio":
			codice = "F504";
			break;
		case "Monteforte Irpino":
			codice = "F506";
			break;
		case "Monteforte Cilento":
			codice = "F507";
			break;
		case "Monteforte D'Alpone":
			codice = "F508";
			break;
		case "Montefortino":
			codice = "F509";
			break;
		case "Montefranco":
			codice = "F510";
			break;
		case "Montefredane":
			codice = "F511";
			break;
		case "Montefusco":
			codice = "F512";
			break;
		case "Montegabbione":
			codice = "F513";
			break;
		case "Montegalda":
			codice = "F514";
			break;
		case "Montegaldella":
			codice = "F515";
			break;
		case "Montegallo":
			codice = "F516";
			break;
		case "Monte Giberto":
			codice = "F517";
			break;
		case "Montegioco":
			codice = "F518";
			break;
		case "Montegiordano":
			codice = "F519";
			break;
		case "Montegiorgio":
			codice = "F520";
			break;
		case "Montegranaro":
			codice = "F522";
			break;
		case "Montegridolfo":
			codice = "F523";
			break;
		case "Monte Grimano Terme":
			codice = "F524";
			break;
		case "Montegrino Valtravaglia":
			codice = "F526";
			break;
		case "Montegrosso D'Asti":
			codice = "F527";
			break;
		case "Montegrosso Pian Latte":
			codice = "F528";
			break;
		case "Montegrotto Terme":
			codice = "F529";
			break;
		case "Monteiasi":
			codice = "F531";
			break;
		case "Monte Isola":
			codice = "F532";
			break;
		case "Montelabbate":
			codice = "F533";
			break;
		case "Montelanico":
			codice = "F534";
			break;
		case "Montelapiano":
			codice = "F535";
			break;
		case "Monteleone Di Fermo":
			codice = "F536";
			break;
		case "Monteleone Di Puglia":
			codice = "F538";
			break;
		case "Monteleone Di Spoleto":
			codice = "F540";
			break;
		case "Monteleone Sabino":
			codice = "F541";
			break;
		case "Monteleone Rocca Doria":
			codice = "F542";
			break;
		case "Monteleone D'Orvieto":
			codice = "F543";
			break;
		case "Montelepre":
			codice = "F544";
			break;
		case "Montelibretti":
			codice = "F545";
			break;
		case "Montella":
			codice = "F546";
			break;
		case "Montello":
			codice = "F547";
			break;
		case "Montelongo":
			codice = "F548";
			break;
		case "Montelparo":
			codice = "F549";
			break;
		case "Montelupo Albese":
			codice = "F550";
			break;
		case "Montelupo Fiorentino":
			codice = "F551";
			break;
		case "Montelupone":
			codice = "F552";
			break;
		case "Montemaggiore Belsito":
			codice = "F553";
			break;
		case "Montemaggiore Al Metauro":
			codice = "F555";
			break;
		case "Montemagno":
			codice = "F556";
			break;
		case "Montemale Di Cuneo":
			codice = "F558";
			break;
		case "Montemarano":
			codice = "F559";
			break;
		case "Montemarciano":
			codice = "F560";
			break;
		case "Monte Marenzo":
			codice = "F561";
			break;
		case "Montemarzino":
			codice = "F562";
			break;
		case "Montemesola":
			codice = "F563";
			break;
		case "Montemezzo":
			codice = "F564";
			break;
		case "Montemignaio":
			codice = "F565";
			break;
		case "Montemiletto":
			codice = "F566";
			break;
		case "Montemilone":
			codice = "F568";
			break;
		case "Montemitro":
			codice = "F569";
			break;
		case "Montemonaco":
			codice = "F570";
			break;
		case "Montemurlo":
			codice = "F572";
			break;
		case "Montemurro":
			codice = "F573";
			break;
		case "Montenars":
			codice = "F574";
			break;
		case "Montenero Di Bisaccia":
			codice = "F576";
			break;
		case "Montenerodomo":
			codice = "F578";
			break;
		case "Montenero Sabino":
			codice = "F579";
			break;
		case "Montenero Val Cocchiara":
			codice = "F580";
			break;
		case "Monteodorisio":
			codice = "F582";
			break;
		case "Montepaone":
			codice = "F586";
			break;
		case "Monteparano":
			codice = "F587";
			break;
		case "Monte Porzio":
			codice = "F589";
			break;
		case "Monte Porzio Catone":
			codice = "F590";
			break;
		case "Monteprandone":
			codice = "F591";
			break;
		case "Montepulciano":
			codice = "F592";
			break;
		case "Monterado":
			codice = "F593";
			break;
		case "Monterchi":
			codice = "F594";
			break;
		case "Montereale":
			codice = "F595";
			break;
		case "Montereale Valcellina":
			codice = "F596";
			break;
		case "Monterenzio":
			codice = "F597";
			break;
		case "Monteriggioni":
			codice = "F598";
			break;
		case "Monte Rinaldo":
			codice = "F599";
			break;
		case "Monte Roberto":
			codice = "F600";
			break;
		case "Monteroduni":
			codice = "F601";
			break;
		case "Monte Romano":
			codice = "F603";
			break;
		case "Monteroni Di Lecce":
			codice = "F604";
			break;
		case "Monteroni D'Arbia":
			codice = "F605";
			break;
		case "Monterosi":
			codice = "F606";
			break;
		case "Monterosso Calabro":
			codice = "F607";
			break;
		case "Monterosso Grana":
			codice = "F608";
			break;
		case "Monterosso Al Mare":
			codice = "F609";
			break;
		case "Monterosso Almo":
			codice = "F610";
			break;
		case "Monterotondo":
			codice = "F611";
			break;
		case "Monterotondo Marittimo":
			codice = "F612";
			break;
		case "Monterubbiano":
			codice = "F614";
			break;
		case "Monte San Biagio":
			codice = "F616";
			break;
		case "Monte San Giacomo":
			codice = "F618";
			break;
		case "Monte San Giovanni In Sabina":
			codice = "F619";
			break;
		case "Monte San Giovanni Campano":
			codice = "F620";
			break;
		case "Monte San Giusto":
			codice = "F621";
			break;
		case "Monte San Martino":
			codice = "F622";
			break;
		case "Montesano Salentino":
			codice = "F623";
			break;
		case "Montesano Sulla Marcellana":
			codice = "F625";
			break;
		case "Monte San Pietrangeli":
			codice = "F626";
			break;
		case "Monte San Pietro":
			codice = "F627";
			break;
		case "Monte San Savino":
			codice = "F628";
			break;
		case "Monte Santa Maria Tiberina":
			codice = "F629";
			break;
		case "Monte Sant'Angelo":
			codice = "F631";
			break;
		case "Monte San Vito":
			codice = "F634";
			break;
		case "Montesarchio":
			codice = "F636";
			break;
		case "Montescaglioso":
			codice = "F637";
			break;
		case "Montescano":
			codice = "F638";
			break;
		case "Montescheno":
			codice = "F639";
			break;
		case "Montescudaio":
			codice = "F640";
			break;
		case "Montescudo":
			codice = "F641";
			break;
		case "Montese":
			codice = "F642";
			break;
		case "Montesegale":
			codice = "F644";
			break;
		case "Montesilvano":
			codice = "F646";
			break;
		case "Montespertoli":
			codice = "F648";
			break;
		case "Monteu Da Po":
			codice = "F651";
			break;
		case "Monte Urano":
			codice = "F653";
			break;
		case "Monteu Roero":
			codice = "F654";
			break;
		case "Montevago":
			codice = "F655";
			break;
		case "Montevarchi":
			codice = "F656";
			break;
		case "Montevecchia":
			codice = "F657";
			break;
		case "Monteveglio":
			codice = "F659";
			break;
		case "Monteverde":
			codice = "F660";
			break;
		case "Monteverdi Marittimo":
			codice = "F661";
			break;
		case "Monteviale":
			codice = "F662";
			break;
		case "Monte Vidon Combatte":
			codice = "F664";
			break;
		case "Monte Vidon Corrado":
			codice = "F665";
			break;
		case "Montezemolo":
			codice = "F666";
			break;
		case "Monti":
			codice = "F667";
			break;
		case "Montiano":
			codice = "F668";
			break;
		case "Monticello D'Alba":
			codice = "F669";
			break;
		case "Monticelli Pavese":
			codice = "F670";
			break;
		case "Monticelli D'Ongina":
			codice = "F671";
			break;
		case "Monticelli Brusati":
			codice = "F672";
			break;
		case "Monticello Brianza":
			codice = "F674";
			break;
		case "Monticello Conte Otto":
			codice = "F675";
			break;
		case "Monticiano":
			codice = "F676";
			break;
		case "Montieri":
			codice = "F677";
			break;
		case "Montignoso":
			codice = "F679";
			break;
		case "Montirone":
			codice = "F680";
			break;
		case "Montodine":
			codice = "F681";
			break;
		case "Montoggio":
			codice = "F682";
			break;
		case "Montone":
			codice = "F685";
			break;
		case "Montopoli In Val D'Arno":
			codice = "F686";
			break;
		case "Montopoli Di Sabina":
			codice = "F687";
			break;
		case "Montorfano":
			codice = "F688";
			break;
		case "Montorio Nei Frentani":
			codice = "F689";
			break;
		case "Montorio Al Vomano":
			codice = "F690";
			break;
		case "Montorio Romano":
			codice = "F692";
			break;
		case "Montoro Inferiore":
			codice = "F693";
			break;
		case "Montoro Superiore":
			codice = "F694";
			break;
		case "Montorso Vicentino":
			codice = "F696";
			break;
		case "Montottone":
			codice = "F697";
			break;
		case "Montresta":
			codice = "F698";
			break;
		case "Montù Beccaria":
			codice = "F701";
			break;
		case "Monvalle":
			codice = "F703";
			break;
		case "Monza":
			codice = "F704";
			break;
		case "Monzambano":
			codice = "F705";
			break;
		case "Monzuno":
			codice = "F706";
			break;
		case "Morano Sul Po":
			codice = "F707";
			break;
		case "Morano Calabro":
			codice = "F708";
			break;
		case "Moransengo":
			codice = "F709";
			break;
		case "Moraro":
			codice = "F710";
			break;
		case "Morazzone":
			codice = "F711";
			break;
		case "Morbegno":
			codice = "F712";
			break;
		case "Morbello":
			codice = "F713";
			break;
		case "Morciano Di Romagna":
			codice = "F715";
			break;
		case "Morciano Di Leuca":
			codice = "F716";
			break;
		case "Morcone":
			codice = "F717";
			break;
		case "Mordano":
			codice = "F718";
			break;
		case "Morengo":
			codice = "F720";
			break;
		case "Mores":
			codice = "F721";
			break;
		case "Moresco":
			codice = "F722";
			break;
		case "Moretta":
			codice = "F723";
			break;
		case "Morfasso":
			codice = "F724";
			break;
		case "Morgano":
			codice = "F725";
			break;
		case "Morgecodice":
			codice = "F726";
			break;
		case "Morgongiori":
			codice = "F727";
			break;
		case "Mori":
			codice = "F728";
			break;
		case "Moriago Della Battaglia":
			codice = "F729";
			break;
		case "Moricone":
			codice = "F730";
			break;
		case "Morigerati":
			codice = "F731";
			break;
		case "Morino":
			codice = "F732";
			break;
		case "Moriondo Torinese":
			codice = "F733";
			break;
		case "Morlupo":
			codice = "F734";
			break;
		case "Mormanno":
			codice = "F735";
			break;
		case "Mornago":
			codice = "F736";
			break;
		case "Mornese":
			codice = "F737";
			break;
		case "Mornico Al Serio":
			codice = "F738";
			break;
		case "Mornico Losana":
			codice = "F739";
			break;
		case "Morolo":
			codice = "F740";
			break;
		case "Morozzo":
			codice = "F743";
			break;
		case "Morra De Sanctis":
			codice = "F744";
			break;
		case "Morro D'Alba":
			codice = "F745";
			break;
		case "Morro Reatino":
			codice = "F746";
			break;
		case "Morro D'Oro":
			codice = "F747";
			break;
		case "Morrone Del Sannio":
			codice = "F748";
			break;
		case "Morrovalle":
			codice = "F749";
			break;
		case "Morsano Al Tagliamento":
			codice = "F750";
			break;
		case "Morsasco":
			codice = "F751";
			break;
		case "Mortara":
			codice = "F754";
			break;
		case "Mortegliano":
			codice = "F756";
			break;
		case "Morterone":
			codice = "F758";
			break;
		case "Moruzzo":
			codice = "F760";
			break;
		case "Moscazzano":
			codice = "F761";
			break;
		case "Moschiano":
			codice = "F762";
			break;
		case "Mosciano Sant'Angelo":
			codice = "F764";
			break;
		case "Moscufo":
			codice = "F765";
			break;
		case "Moso In Passiria":
			codice = "F766";
			break;
		case "Mossa":
			codice = "F767";
			break;
		case "Mossano":
			codice = "F768";
			break;
		case "Motta Di Livenza":
			codice = "F770";
			break;
		case "Motta Baluffi":
			codice = "F771";
			break;
		case "Motta Camastra":
			codice = "F772";
			break;
		case "Motta D'Affermo":
			codice = "F773";
			break;
		case "Motta Dè Conti":
			codice = "F774";
			break;
		case "Mottafollone":
			codice = "F775";
			break;
		case "Mottalciata":
			codice = "F776";
			break;
		case "Motta Montecorvino":
			codice = "F777";
			break;
		case "Motta San Giovanni":
			codice = "F779";
			break;
		case "Motta Santa Lucia":
			codice = "F780";
			break;
		case "Motta Sant'Anastasia":
			codice = "F781";
			break;
		case "Motta Visconti":
			codice = "F783";
			break;
		case "Mottola":
			codice = "F784";
			break;
		case "Mozzagrogna":
			codice = "F785";
			break;
		case "Mozzanica":
			codice = "F786";
			break;
		case "Mozzate":
			codice = "F788";
			break;
		case "Mozzecane":
			codice = "F789";
			break;
		case "Mozzo":
			codice = "F791";
			break;
		case "Muccia":
			codice = "F793";
			break;
		case "Muggia":
			codice = "F795";
			break;
		case "Muggiò":
			codice = "F797";
			break;
		case "Mugnano Del Cardinale":
			codice = "F798";
			break;
		case "Mugnano Di Napoli":
			codice = "F799";
			break;
		case "Mulazzano":
			codice = "F801";
			break;
		case "Mulazzo":
			codice = "F802";
			break;
		case "Mura":
			codice = "F806";
			break;
		case "Muravera":
			codice = "F808";
			break;
		case "Murazzano":
			codice = "F809";
			break;
		case "Murello":
			codice = "F811";
			break;
		case "Murialdo":
			codice = "F813";
			break;
		case "Murisengo":
			codice = "F814";
			break;
		case "Murlo":
			codice = "F815";
			break;
		case "Muro Leccese":
			codice = "F816";
			break;
		case "Muro Lucano":
			codice = "F817";
			break;
		case "Muros":
			codice = "F818";
			break;
		case "Muscoline":
			codice = "F820";
			break;
		case "Musei":
			codice = "F822";
			break;
		case "Musile Di Piave":
			codice = "F826";
			break;
		case "Musso":
			codice = "F828";
			break;
		case "Mussolente":
			codice = "F829";
			break;
		case "Mussomeli":
			codice = "F830";
			break;
		case "Muzzana Del Turgnano":
			codice = "F832";
			break;
		case "Muzzano":
			codice = "F833";
			break;

		}

	}

	private void codiciComuniN(String comune) {

		switch (comune) {

		case "Nova Siri":
			codice = "A942";
			break;
		case "Novafeltria":
			codice = "F137";
			break;
		case "Nago-Torbole":
			codice = "F835";
			break;
		case "Nalles":
			codice = "F836";
			break;
		case "Nanno":
			codice = "F837";
			break;
		case "Nanto":
			codice = "F838";
			break;
		case "Napoli":
			codice = "F839";
			break;
		case "Narbolia":
			codice = "F840";
			break;
		case "Narcao":
			codice = "F841";
			break;
		case "Nardò":
			codice = "F842";
			break;
		case "Nardodipace":
			codice = "F843";
			break;
		case "Narni":
			codice = "F844";
			break;
		case "Naro":
			codice = "F845";
			break;
		case "Narzole":
			codice = "F846";
			break;
		case "Nasino":
			codice = "F847";
			break;
		case "Naso":
			codice = "F848";
			break;
		case "Naturno":
			codice = "F849";
			break;
		case "Nave":
			codice = "F851";
			break;
		case "Navelli":
			codice = "F852";
			break;
		case "Nave San Rocco":
			codice = "F853";
			break;
		case "Naz-Sciaves":
			codice = "F856";
			break;
		case "Nazzano":
			codice = "F857";
			break;
		case "Ne":
			codice = "F858";
			break;
		case "Nebbiuno":
			codice = "F859";
			break;
		case "Negrar Di Valpolicella":
			codice = "F861";
			break;
		case "Neirone":
			codice = "F862";
			break;
		case "Neive":
			codice = "F863";
			break;
		case "Nembro":
			codice = "F864";
			break;
		case "Nemi":
			codice = "F865";
			break;
		case "Nemoli":
			codice = "F866";
			break;
		case "Neoneli":
			codice = "F867";
			break;
		case "Nepi":
			codice = "F868";
			break;
		case "Nereto":
			codice = "F870";
			break;
		case "Nerola":
			codice = "F871";
			break;
		case "Nervesa Della Battaglia":
			codice = "F872";
			break;
		case "Nerviano":
			codice = "F874";
			break;
		case "Nespolo":
			codice = "F876";
			break;
		case "Nesso":
			codice = "F877";
			break;
		case "Netro":
			codice = "F878";
			break;
		case "Nettuno":
			codice = "F880";
			break;
		case "Neviano":
			codice = "F881";
			break;
		case "Neviano Degli Arduini":
			codice = "F882";
			break;
		case "Neviglie":
			codice = "F883";
			break;
		case "Niardo":
			codice = "F884";
			break;
		case "Nibbiano":
			codice = "F885";
			break;
		case "Nibbiola":
			codice = "F886";
			break;
		case "Nibionno":
			codice = "F887";
			break;
		case "Nichelino":
			codice = "F889";
			break;
		case "Nicolosi":
			codice = "F890";
			break;
		case "Nicorvo":
			codice = "F891";
			break;
		case "Nicosia":
			codice = "F892";
			break;
		case "Nicotera":
			codice = "F893";
			break;
		case "Niella Belbo":
			codice = "F894";
			break;
		case "Niella Tanaro":
			codice = "F895";
			break;
		case "Nimis":
			codice = "F898";
			break;
		case "Niscemi":
			codice = "F899";
			break;
		case "Nissoria":
			codice = "F900";
			break;
		case "Nizza Di Sicilia":
			codice = "F901";
			break;
		case "Nizza Monferrato":
			codice = "F902";
			break;
		case "Noale":
			codice = "F904";
			break;
		case "Noasca":
			codice = "F906";
			break;
		case "Nocara":
			codice = "F907";
			break;
		case "Nocciano":
			codice = "F908";
			break;
		case "Nocera Terinese":
			codice = "F910";
			break;
		case "Nocera Umbra":
			codice = "F911";
			break;
		case "Nocera Inferiore":
			codice = "F912";
			break;
		case "Nocera Superiore":
			codice = "F913";
			break;
		case "Noceto":
			codice = "F914";
			break;
		case "Noci":
			codice = "F915";
			break;
		case "Nociglia":
			codice = "F916";
			break;
		case "Noepoli":
			codice = "F917";
			break;
		case "Nogara":
			codice = "F918";
			break;
		case "Nogaredo":
			codice = "F920";
			break;
		case "Nogarole Rocca":
			codice = "F921";
			break;
		case "Nogarole Vicentino":
			codice = "F922";
			break;
		case "Noicattaro":
			codice = "F923";
			break;
		case "Nola":
			codice = "F924";
			break;
		case "Nole":
			codice = "F925";
			break;
		case "Noli":
			codice = "F926";
			break;
		case "Nomaglio":
			codice = "F927";
			break;
		case "Nomi":
			codice = "F929";
			break;
		case "Nonantola":
			codice = "F930";
			break;
		case "None":
			codice = "F931";
			break;
		case "Nonio":
			codice = "F932";
			break;
		case "Noragugume":
			codice = "F933";
			break;
		case "Norbello":
			codice = "F934";
			break;
		case "Norcia":
			codice = "F935";
			break;
		case "Norma":
			codice = "F937";
			break;
		case "Nosate":
			codice = "F939";
			break;
		case "Notaresco":
			codice = "F942";
			break;
		case "Noto":
			codice = "F943";
			break;
		case "Nova Milanese":
			codice = "F944";
			break;
		case "Novaledo":
			codice = "F947";
			break;
		case "Novalesa":
			codice = "F948";
			break;
		case "Nova Levante":
			codice = "F949";
			break;
		case "Nova Ponente":
			codice = "F950";
			break;
		case "Novara Di Sicilia":
			codice = "F951";
			break;
		case "Novara":
			codice = "F952";
			break;
		case "Novate Milanese":
			codice = "F955";
			break;
		case "Novate Mezzola":
			codice = "F956";
			break;
		case "Nove":
			codice = "F957";
			break;
		case "Novedrate":
			codice = "F958";
			break;
		case "Novellara":
			codice = "F960";
			break;
		case "Novello":
			codice = "F961";
			break;
		case "Noventa Padovana":
			codice = "F962";
			break;
		case "Noventa Di Piave":
			codice = "F963";
			break;
		case "Noventa Vicentina":
			codice = "F964";
			break;
		case "Novi Ligure":
			codice = "F965";
			break;
		case "Novi Di Modena":
			codice = "F966";
			break;
		case "Novi Velia":
			codice = "F967";
			break;
		case "Noviglio":
			codice = "F968";
			break;
		case "Novoli":
			codice = "F970";
			break;
		case "Nucetto":
			codice = "F972";
			break;
		case "Nughedu Santa Vittoria":
			codice = "F974";
			break;
		case "Nughedu San Nicolò":
			codice = "F975";
			break;
		case "Nule":
			codice = "F976";
			break;
		case "Nulvi":
			codice = "F977";
			break;
		case "Numana":
			codice = "F978";
			break;
		case "Nuoro":
			codice = "F979";
			break;
		case "Nurachi":
			codice = "F980";
			break;
		case "Nuragus":
			codice = "F981";
			break;
		case "Nurallao":
			codice = "F982";
			break;
		case "Nuraminis":
			codice = "F983";
			break;
		case "Nureci":
			codice = "F985";
			break;
		case "Nurri":
			codice = "F986";
			break;
		case "Nus":
			codice = "F987";
			break;
		case "Nusco":
			codice = "F988";
			break;
		case "Nuvolento":
			codice = "F989";
			break;
		case "Nuvolera":
			codice = "F990";
			break;
		case "Nucodiceis":
			codice = "F991";
			break;

		}

	}

	private void codiciComuniO(String comune) {

		switch (comune) {

		case "Orvinio":
			codice = "B595";
			break;
		case "Orco Feglino":
			codice = "D522";
			break;
		case "Osmate":
			codice = "E529";
			break;
		case "Ordona":
			codice = "M266";
			break;
		case "Ostra":
			codice = "F401";
			break;
		case "Ostra Vetere":
			codice = "E581";
			break;
		case "Occhieppo Inferiore":
			codice = "F992";
			break;
		case "Occhieppo Superiore":
			codice = "F993";
			break;
		case "Occhiobello":
			codice = "F994";
			break;
		case "Occimiano":
			codice = "F995";
			break;
		case "Ocre":
			codice = "F996";
			break;
		case "Odalengo Grande":
			codice = "F997";
			break;
		case "Odalengo Piccolo":
			codice = "F998";
			break;
		case "Oderzo":
			codice = "F999";
			break;
		case "Odolo":
			codice = "G001";
			break;
		case "Ofena":
			codice = "G002";
			break;
		case "Offagna":
			codice = "G003";
			break;
		case "Offanengo":
			codice = "G004";
			break;
		case "Offida":
			codice = "G005";
			break;
		case "Offlaga":
			codice = "G006";
			break;
		case "Oggebbio":
			codice = "G007";
			break;
		case "Oggiona Con Santo Stefano":
			codice = "G008";
			break;
		case "Oggiono":
			codice = "G009";
			break;
		case "Oglianico":
			codice = "G010";
			break;
		case "Ogliastro Cilento":
			codice = "G011";
			break;
		case "Oyace":
			codice = "G012";
			break;
		case "Olbia":
			codice = "G015";
			break;
		case "Olcenengo":
			codice = "G016";
			break;
		case "Oldenico":
			codice = "G018";
			break;
		case "Oleggio":
			codice = "G019";
			break;
		case "Oleggio Castello":
			codice = "G020";
			break;
		case "Olevano Di Lomellina":
			codice = "G021";
			break;
		case "Olevano Romano":
			codice = "G022";
			break;
		case "Olevano Sul Tusciano":
			codice = "G023";
			break;
		case "Olgiate Comasco":
			codice = "G025";
			break;
		case "Olgiate Molgora":
			codice = "G026";
			break;
		case "Olgiate Olona":
			codice = "G028";
			break;
		case "Olginate":
			codice = "G030";
			break;
		case "Oliena":
			codice = "G031";
			break;
		case "Oliva Gessi":
			codice = "G032";
			break;
		case "Olivadi":
			codice = "G034";
			break;
		case "Oliveri":
			codice = "G036";
			break;
		case "Oliveto Lucano":
			codice = "G037";
			break;
		case "Oliveto Citra":
			codice = "G039";
			break;
		case "Oliveto Lario":
			codice = "G040";
			break;
		case "Olivetta San Michele":
			codice = "G041";
			break;
		case "Olivola":
			codice = "G042";
			break;
		case "Ollastra":
			codice = "G043";
			break;
		case "Ollolai":
			codice = "G044";
			break;
		case "Ollomont":
			codice = "G045";
			break;
		case "Olmedo":
			codice = "G046";
			break;
		case "Olmeneta":
			codice = "G047";
			break;
		case "Olmo Gentile":
			codice = "G048";
			break;
		case "Olmo Al Brembo":
			codice = "G049";
			break;
		case "Oltre Il Colle":
			codice = "G050";
			break;
		case "Oltressenda Alta":
			codice = "G054";
			break;
		case "Oltrona Di San Mamette":
			codice = "G056";
			break;
		case "Olzai":
			codice = "G058";
			break;
		case "Ome":
			codice = "G061";
			break;
		case "Omegna":
			codice = "G062";
			break;
		case "Omignano":
			codice = "G063";
			break;
		case "Onanì":
			codice = "G064";
			break;
		case "Onano":
			codice = "G065";
			break;
		case "Oncino":
			codice = "G066";
			break;
		case "Oneta":
			codice = "G068";
			break;
		case "Onifai":
			codice = "G070";
			break;
		case "Oniferi":
			codice = "G071";
			break;
		case "Ono San Pietro":
			codice = "G074";
			break;
		case "Onore":
			codice = "G075";
			break;
		case "Onzo":
			codice = "G076";
			break;
		case "Opera":
			codice = "G078";
			break;
		case "Opi":
			codice = "G079";
			break;
		case "Oppeano":
			codice = "G080";
			break;
		case "Oppido Lucano":
			codice = "G081";
			break;
		case "Oppido Mamertina":
			codice = "G082";
			break;
		case "Ora":
			codice = "G083";
			break;
		case "Orani":
			codice = "G084";
			break;
		case "Oratino":
			codice = "G086";
			break;
		case "Orbassano":
			codice = "G087";
			break;
		case "Orbetello":
			codice = "G088";
			break;
		case "Orciano Di Pesaro":
			codice = "G089";
			break;
		case "Orciano Pisano":
			codice = "G090";
			break;
		case "Orero":
			codice = "G093";
			break;
		case "Orgiano":
			codice = "G095";
			break;
		case "Orgosolo":
			codice = "G097";
			break;
		case "Oria":
			codice = "G098";
			break;
		case "Oricola":
			codice = "G102";
			break;
		case "Origgio":
			codice = "G103";
			break;
		case "Orino":
			codice = "G105";
			break;
		case "Orio Litta":
			codice = "G107";
			break;
		case "Orio Al Serio":
			codice = "G108";
			break;
		case "Orio Canavese":
			codice = "G109";
			break;
		case "Oriolo":
			codice = "G110";
			break;
		case "Oriolo Romano":
			codice = "G111";
			break;
		case "Oristano":
			codice = "G113";
			break;
		case "Ormea":
			codice = "G114";
			break;
		case "Ormelle":
			codice = "G115";
			break;
		case "Ornago":
			codice = "G116";
			break;
		case "Ornavasso":
			codice = "G117";
			break;
		case "Ornica":
			codice = "G118";
			break;
		case "Orosei":
			codice = "G119";
			break;
		case "Orotelli":
			codice = "G120";
			break;
		case "Orria":
			codice = "G121";
			break;
		case "Orroli":
			codice = "G122";
			break;
		case "Orsago":
			codice = "G123";
			break;
		case "Orsara Bormida":
			codice = "G124";
			break;
		case "Orsara Di Puglia":
			codice = "G125";
			break;
		case "Orsenigo":
			codice = "G126";
			break;
		case "Orsogna":
			codice = "G128";
			break;
		case "Orsomarso":
			codice = "G129";
			break;
		case "Orta Di Atella":
			codice = "G130";
			break;
		case "Orta Nova":
			codice = "G131";
			break;
		case "Ortacesus":
			codice = "G133";
			break;
		case "Orta San Giulio":
			codice = "G134";
			break;
		case "Orte":
			codice = "G135";
			break;
		case "Ortelle":
			codice = "G136";
			break;
		case "Ortezzano":
			codice = "G137";
			break;
		case "Ortignano Raggiolo":
			codice = "G139";
			break;
		case "Ortisei":
			codice = "G140";
			break;
		case "Ortona":
			codice = "G141";
			break;
		case "Ortona Dei Marsi":
			codice = "G142";
			break;
		case "Ortovero":
			codice = "G144";
			break;
		case "Ortucchio":
			codice = "G145";
			break;
		case "Ortueri":
			codice = "G146";
			break;
		case "Orune":
			codice = "G147";
			break;
		case "Orvieto":
			codice = "G148";
			break;
		case "Orzinuovi":
			codice = "G149";
			break;
		case "Orzivecchi":
			codice = "G150";
			break;
		case "Osasco":
			codice = "G151";
			break;
		case "Osasio":
			codice = "G152";
			break;
		case "Oschiri":
			codice = "G153";
			break;
		case "Osidda":
			codice = "G154";
			break;
		case "Osiglia":
			codice = "G155";
			break;
		case "Osilo":
			codice = "G156";
			break;
		case "Osimo":
			codice = "G157";
			break;
		case "Osini":
			codice = "G158";
			break;
		case "Osio Sopra":
			codice = "G159";
			break;
		case "Osio Sotto":
			codice = "G160";
			break;
		case "Osnago":
			codice = "G161";
			break;
		case "Osoppo":
			codice = "G163";
			break;
		case "Ospedaletti":
			codice = "G164";
			break;
		case "Ospedaletto D'Alpinolo":
			codice = "G165";
			break;
		case "Ospedaletto Lodigiano":
			codice = "G166";
			break;
		case "Ospedaletto Euganeo":
			codice = "G167";
			break;
		case "Ospedaletto":
			codice = "G168";
			break;
		case "Ospitale Di Cadore":
			codice = "G169";
			break;
		case "Ospitaletto":
			codice = "G170";
			break;
		case "Ossago Lodigiano":
			codice = "G171";
			break;
		case "Ossana":
			codice = "G173";
			break;
		case "Ossi":
			codice = "G178";
			break;
		case "Ossimo":
			codice = "G179";
			break;
		case "Ossona":
			codice = "G181";
			break;
		case "Ossuccio":
			codice = "G182";
			break;
		case "Ostana":
			codice = "G183";
			break;
		case "Ostellato":
			codice = "G184";
			break;
		case "Ostiano":
			codice = "G185";
			break;
		case "Ostiglia":
			codice = "G186";
			break;
		case "Ostuni":
			codice = "G187";
			break;
		case "Otranto":
			codice = "G188";
			break;
		case "Otricoli":
			codice = "G189";
			break;
		case "Ottaviano":
			codice = "G190";
			break;
		case "Ottana":
			codice = "G191";
			break;
		case "Ottati":
			codice = "G192";
			break;
		case "Ottiglio":
			codice = "G193";
			break;
		case "Ottobiano":
			codice = "G194";
			break;
		case "Ottone":
			codice = "G195";
			break;
		case "Oulcodice":
			codice = "G196";
			break;
		case "Ovada":
			codice = "G197";
			break;
		case "Ovaro":
			codice = "G198";
			break;
		case "Oviglio":
			codice = "G199";
			break;
		case "Ovindoli":
			codice = "G200";
			break;
		case "Ovodda":
			codice = "G201";
			break;
		case "Ozegna":
			codice = "G202";
			break;
		case "Ozieri":
			codice = "G203";
			break;
		case "Ozzano Monferrato":
			codice = "G204";
			break;
		case "Ozzano Dell'Emilia":
			codice = "G205";
			break;
		case "Ozzero":
			codice = "G206";
			break;

		}

	}

	private void codiciComuniP(String comune) {

		switch (comune) {

		case "Porretta Terme":
			codice = "A558";
			break;
		case "Poggio Sannita":
			codice = "B317";
			break;
		case "Ponte Nelle Alpi":
			codice = "B662";
			break;
		case "Pozzaglio Ed Uniti":
			codice = "B914";
			break;
		case "Pero":
			codice = "C013";
			break;
		case "Pianopoli":
			codice = "D546";
			break;
		case "Poggio San Vicino":
			codice = "D566";
			break;
		case "Porto Azzurro":
			codice = "E680";
			break;
		case "Porto Empedocle":
			codice = "F299";
			break;
		case "Pollenza":
			codice = "F567";
			break;
		case "Potenza Picena":
			codice = "F632";
			break;
		case "Pineto":
			codice = "F831";
			break;
		case "Ponte Nossa":
			codice = "F941";
			break;
		case "Portopalo Di Capo Passero":
			codice = "M257";
			break;
		case "Porto Cesareo":
			codice = "M263";
			break;
		case "Paterno":
			codice = "M269";
			break;
		case "Priolo Gargallo":
			codice = "M279";
			break;
		case "Petrosino":
			codice = "M281";
			break;
		case "Piscinas":
			codice = "M291";
			break;
		case "Padru":
			codice = "M301";
			break;
		case "Poggio Torriana":
			codice = "M324";
			break;
		case "Pratovecchio Stia":
			codice = "M329";
			break;
		case "Predaia":
			codice = "M344";
			break;
		case "Porte Di Rendena":
			codice = "M358";
			break;
		case "Primiero San Martino Di Castrozza":
			codice = "M359";
			break;
		case "Pieve Di Bono-Prezzo":
			codice = "M365";
			break;
		case "Polesine Zibello":
			codice = "M367";
			break;
		case "Piadena Drizzona":
			codice = "M418";
			break;
		case "Pieve Del Grappa":
			codice = "M422";
			break;
		case "Pieve Fissiraga":
			codice = "G096";
			break;
		case "Pabillonis":
			codice = "G207";
			break;
		case "Paceco":
			codice = "G208";
			break;
		case "Pace Del Mela":
			codice = "G209";
			break;
		case "Pacentro":
			codice = "G210";
			break;
		case "Pachino":
			codice = "G211";
			break;
		case "Paciano":
			codice = "G212";
			break;
		case "Padenghe Sul Garda":
			codice = "G213";
			break;
		case "Padergnone":
			codice = "G214";
			break;
		case "Paderna":
			codice = "G215";
			break;
		case "Paderno Franciacorta":
			codice = "G217";
			break;
		case "Paderno D'Adda":
			codice = "G218";
			break;
		case "Paderno Dugnano":
			codice = "G220";
			break;
		case "Paderno Del Grappa":
			codice = "G221";
			break;
		case "Paderno Ponchielli":
			codice = "G222";
			break;
		case "Padova":
			codice = "G224";
			break;
		case "Padria":
			codice = "G225";
			break;
		case "Padula":
			codice = "G226";
			break;
		case "Paduli":
			codice = "G227";
			break;
		case "Paesana":
			codice = "G228";
			break;
		case "Paese":
			codice = "G229";
			break;
		case "Pagani":
			codice = "G230";
			break;
		case "Paganico Sabino":
			codice = "G232";
			break;
		case "Pagazzano":
			codice = "G233";
			break;
		case "Pagliara":
			codice = "G234";
			break;
		case "Paglieta":
			codice = "G237";
			break;
		case "Pagnacco":
			codice = "G238";
			break;
		case "Pagno":
			codice = "G240";
			break;
		case "Pagnona":
			codice = "G241";
			break;
		case "Pago Del Vallo Di Lauro":
			codice = "G242";
			break;
		case "Pago Veiano":
			codice = "G243";
			break;
		case "Paisco Loveno":
			codice = "G247";
			break;
		case "Paitone":
			codice = "G248";
			break;
		case "Paladina":
			codice = "G249";
			break;
		case "Palagano":
			codice = "G250";
			break;
		case "Palagianello":
			codice = "G251";
			break;
		case "Palagiano":
			codice = "G252";
			break;
		case "Palagonia":
			codice = "G253";
			break;
		case "Palaia":
			codice = "G254";
			break;
		case "Palanzano":
			codice = "G255";
			break;
		case "Palata":
			codice = "G257";
			break;
		case "Palau":
			codice = "G258";
			break;
		case "Palazzago":
			codice = "G259";
			break;
		case "Palazzo Pignano":
			codice = "G260";
			break;
		case "Palazzo San Gervasio":
			codice = "G261";
			break;
		case "Palazzo Canavese":
			codice = "G262";
			break;
		case "Palazzo Adriano":
			codice = "G263";
			break;
		case "Palazzolo Sull'Oglio":
			codice = "G264";
			break;
		case "Palazzolo Vercellese":
			codice = "G266";
			break;
		case "Palazzolo Acreide":
			codice = "G267";
			break;
		case "Palazzolo Dello Stella":
			codice = "G268";
			break;
		case "Palazzuolo Sul Senio":
			codice = "G270";
			break;
		case "Palena":
			codice = "G271";
			break;
		case "Palermiti":
			codice = "G272";
			break;
		case "Palermo":
			codice = "G273";
			break;
		case "Palestrina":
			codice = "G274";
			break;
		case "Palestro":
			codice = "G275";
			break;
		case "Paliano":
			codice = "G276";
			break;
		case "Palizzi":
			codice = "G277";
			break;
		case "Pallagorio":
			codice = "G278";
			break;
		case "Pallanzeno":
			codice = "G280";
			break;
		case "Pallare":
			codice = "G281";
			break;
		case "Palma Di Montechiaro":
			codice = "G282";
			break;
		case "Palma Campania":
			codice = "G283";
			break;
		case "Palmanova":
			codice = "G284";
			break;
		case "Palmariggi":
			codice = "G285";
			break;
		case "Palmas Arborea":
			codice = "G286";
			break;
		case "Palmi":
			codice = "G288";
			break;
		case "Palmiano":
			codice = "G289";
			break;
		case "Palmoli":
			codice = "G290";
			break;
		case "Palo Del Colle":
			codice = "G291";
			break;
		case "Palomonte":
			codice = "G292";
			break;
		case "Palombara Sabina":
			codice = "G293";
			break;
		case "Palombaro":
			codice = "G294";
			break;
		case "Palosco":
			codice = "G295";
			break;
		case "Palù Del Fersina":
			codice = "G296";
			break;
		case "Palù":
			codice = "G297";
			break;
		case "Paludi":
			codice = "G298";
			break;
		case "Plaus":
			codice = "G299";
			break;
		case "Paluzza":
			codice = "G300";
			break;
		case "Pamparato":
			codice = "G302";
			break;
		case "Pancalieri":
			codice = "G303";
			break;
		case "Pancarana":
			codice = "G304";
			break;
		case "Panchià":
			codice = "G305";
			break;
		case "Pandino":
			codice = "G306";
			break;
		case "Panettieri":
			codice = "G307";
			break;
		case "Panicale":
			codice = "G308";
			break;
		case "Pannarano":
			codice = "G311";
			break;
		case "Panni":
			codice = "G312";
			break;
		case "Pantelleria":
			codice = "G315";
			break;
		case "Pantigliate":
			codice = "G316";
			break;
		case "Paola":
			codice = "G317";
			break;
		case "Paolisi":
			codice = "G318";
			break;
		case "Papasidero":
			codice = "G320";
			break;
		case "Papozze":
			codice = "G323";
			break;
		case "Parabiago":
			codice = "G324";
			break;
		case "Parabita":
			codice = "G325";
			break;
		case "Paratico":
			codice = "G327";
			break;
		case "Parcines":
			codice = "G328";
			break;
		case "Parè":
			codice = "G329";
			break;
		case "Parella":
			codice = "G330";
			break;
		case "Parenti":
			codice = "G331";
			break;
		case "Parete":
			codice = "G333";
			break;
		case "Pareto":
			codice = "G334";
			break;
		case "Parghelia":
			codice = "G335";
			break;
		case "Parlasco":
			codice = "G336";
			break;
		case "Parma":
			codice = "G337";
			break;
		case "Parodi Ligure":
			codice = "G338";
			break;
		case "Paroldo":
			codice = "G339";
			break;
		case "Parolise":
			codice = "G340";
			break;
		case "Parona":
			codice = "G342";
			break;
		case "Parrano":
			codice = "G344";
			break;
		case "Parre":
			codice = "G346";
			break;
		case "Partanna":
			codice = "G247";
			break;
		case "Partinico":
			codice = "G348";
			break;
		case "Paruzzaro":
			codice = "G349";
			break;
		case "Parzanica":
			codice = "G350";
			break;
		case "Pasian Di Prato":
			codice = "G352";
			break;
		case "Pasiano Di Pordenone":
			codice = "G353";
			break;
		case "Paspardo":
			codice = "G354";
			break;
		case "Passerano Marmorito":
			codice = "G358";
			break;
		case "Passignano Sul Trasimeno":
			codice = "G359";
			break;
		case "Passirano":
			codice = "G361";
			break;
		case "Pastena":
			codice = "G362";
			break;
		case "Pastorano":
			codice = "G364";
			break;
		case "Pastrengo":
			codice = "G365";
			break;
		case "Pasturana":
			codice = "G367";
			break;
		case "Pasturo":
			codice = "G368";
			break;
		case "Paternopoli":
			codice = "G370";
			break;
		case "Paternò":
			codice = "G371";
			break;
		case "Paterno Calabro":
			codice = "G372";
			break;
		case "Patrica":
			codice = "G374";
			break;
		case "Pattada":
			codice = "G376";
			break;
		case "Patti":
			codice = "G377";
			break;
		case "Patù":
			codice = "G378";
			break;
		case "Pau":
			codice = "G379";
			break;
		case "Paularo":
			codice = "G381";
			break;
		case "Pauli Arbarei":
			codice = "G382";
			break;
		case "Paulilatino":
			codice = "G384";
			break;
		case "Paullo":
			codice = "G385";
			break;
		case "Paupisi":
			codice = "G386";
			break;
		case "Pavarolo":
			codice = "G387";
			break;
		case "Pavia":
			codice = "G388";
			break;
		case "Pavia Di Udine":
			codice = "G389";
			break;
		case "Pavone Del Mella":
			codice = "G391";
			break;
		case "Pavone Canavese":
			codice = "G392";
			break;
		case "Pavullo Nel Frignano":
			codice = "G393";
			break;
		case "Pazzano":
			codice = "G394";
			break;
		case "Peccioli":
			codice = "G395";
			break;
		case "Pecco":
			codice = "G396";
			break;
		case "Pecetto Di Valenza":
			codice = "G397";
			break;
		case "Pecetto Torinese":
			codice = "G398";
			break;
		case "Pecorara":
			codice = "G399";
			break;
		case "Pedace":
			codice = "G400";
			break;
		case "Pedara":
			codice = "G402";
			break;
		case "Pedaso":
			codice = "G403";
			break;
		case "Pedavena":
			codice = "G404";
			break;
		case "Pedemonte":
			codice = "G406";
			break;
		case "Pederobba":
			codice = "G408";
			break;
		case "Pedesina":
			codice = "G410";
			break;
		case "Pedivigliano":
			codice = "G411";
			break;
		case "Pedrengo":
			codice = "G412";
			break;
		case "Peglio":
			codice = "G415";// G416
			break;
		case "Pegognaga":
			codice = "G417";
			break;
		case "Peia":
			codice = "G418";
			break;
		case "Peio":
			codice = "G419";
			break;
		case "Pelago":
			codice = "G420";
			break;
		case "Pella":
			codice = "G421";
			break;
		case "Pellegrino Parmense":
			codice = "G424";
			break;
		case "Pellezzano":
			codice = "G426";
			break;
		case "Pellio Intelvi":
			codice = "G427";
			break;
		case "Pellizzano":
			codice = "G428";
			break;
		case "Pelugo":
			codice = "G429";
			break;
		case "Penango":
			codice = "G430";
			break;
		case "Poggiridenti":
			codice = "G431";
			break;
		case "Penna In Teverina":
			codice = "G432";
			break;
		case "Pennabilli":
			codice = "G433";
			break;
		case "Pennadomo":
			codice = "G434";
			break;
		case "Pennapiedimonte":
			codice = "G435";
			break;
		case "Penna San Giovanni":
			codice = "G436";
			break;
		case "Penna Sant'Andrea":
			codice = "G437";
			break;
		case "Penne":
			codice = "G438";
			break;
		case "Pentone":
			codice = "G439";
			break;
		case "Perano":
			codice = "G441";
			break;
		case "Perarolo Di Cadore":
			codice = "G442";
			break;
		case "Perca":
			codice = "G443";
			break;
		case "Percile":
			codice = "G444";
			break;
		case "Perdasdefogu":
			codice = "G445";
			break;
		case "Perdacodiceius":
			codice = "G446";
			break;
		case "Perdifumo":
			codice = "G447";
			break;
		case "Perego":
			codice = "G448";
			break;
		case "Pereto":
			codice = "G449";
			break;
		case "Perfugas":
			codice = "G450";
			break;
		case "Pergine Valdarno":
			codice = "G451";
			break;
		case "Pergine Valsugana":
			codice = "G452";
			break;
		case "Pergola":
			codice = "G453";
			break;
		case "Perinaldo":
			codice = "G454";
			break;
		case "Perito":
			codice = "G455";
			break;
		case "Perledo":
			codice = "G456";
			break;
		case "Perletto":
			codice = "G457";
			break;
		case "Perlo":
			codice = "G458";
			break;
		case "Perloz":
			codice = "G459";
			break;
		case "Pernumia":
			codice = "G461";
			break;
		case "Perosa Canavese":
			codice = "G462";
			break;
		case "Perosa Argentina":
			codice = "G463";
			break;
		case "Perrero":
			codice = "G465";
			break;
		case "Persico Dosimo":
			codice = "G469";
			break;
		case "Pertengo":
			codice = "G471";
			break;
		case "Pertica Alta":
			codice = "G474";
			break;
		case "Pertica Bassa":
			codice = "G475";
			break;
		case "Pertosa":
			codice = "G476";
			break;
		case "Pertusio":
			codice = "G477";
			break;
		case "Perugia":
			codice = "G478";
			break;
		case "Pesaro":
			codice = "G479";
			break;
		case "Pescaglia":
			codice = "G480";
			break;
		case "Pescantina":
			codice = "G481";
			break;
		case "Pescara":
			codice = "G482";
			break;
		case "Pescarolo Ed Uniti":
			codice = "G483";
			break;
		case "Pescasseroli":
			codice = "G484";
			break;
		case "Pescate":
			codice = "G485";
			break;
		case "Pesche":
			codice = "G486";
			break;
		case "Peschici":
			codice = "G487";
			break;
		case "Peschiera Borromeo":
			codice = "G488";
			break;
		case "Peschiera Del Garda":
			codice = "G489";
			break;
		case "Pescia":
			codice = "G491";
			break;
		case "Pescina":
			codice = "G492";
			break;
		case "Pescocostanzo":
			codice = "G493";
			break;
		case "Pesco Sannita":
			codice = "G494";
			break;
		case "Pescolanciano":
			codice = "G495";
			break;
		case "Pescopagano":
			codice = "G496";
			break;
		case "Pescopennataro":
			codice = "G497";
			break;
		case "Pescorocchiano":
			codice = "G498";
			break;
		case "Pescosansonesco":
			codice = "G499";
			break;
		case "Pescosolido":
			codice = "G500";
			break;
		case "Pessano Con Bornago":
			codice = "G502";
			break;
		case "Pessina Cremonese":
			codice = "G504";
			break;
		case "Pessinetto":
			codice = "G505";
			break;
		case "Petacciato":
			codice = "G506";
			break;
		case "Petilia Policastro":
			codice = "G508";
			break;
		case "Petina":
			codice = "G509";
			break;
		case "Petralia Soprana":
			codice = "G510";
			break;
		case "Petralia Sottana":
			codice = "G511";
			break;
		case "Petrella Tifernina":
			codice = "G512";
			break;
		case "Petrella Salto":
			codice = "G513";
			break;
		case "Petriano":
			codice = "G514";
			break;
		case "Petriolo":
			codice = "G515";
			break;
		case "Petritoli":
			codice = "G516";
			break;
		case "Petrizzi":
			codice = "G517";
			break;
		case "Petronà":
			codice = "G518";
			break;
		case "Petruro Irpino":
			codice = "G519";
			break;
		case "Pettenasco":
			codice = "G520";
			break;
		case "Pettinengo":
			codice = "G521";
			break;
		case "Pettineo":
			codice = "G522";
			break;
		case "Pettoranello Del Molise":
			codice = "G523";
			break;
		case "Pettorano Sul Gizio":
			codice = "G524";
			break;
		case "Pettorazza Grimani":
			codice = "G525";
			break;
		case "Peveragno":
			codice = "G526";
			break;
		case "Pezzana":
			codice = "G528";
			break;
		case "Pezzaze":
			codice = "G529";
			break;
		case "Pezzolo Valle Uzzone":
			codice = "G532";
			break;
		case "Piacenza D'Adige":
			codice = "G534";
			break;
		case "Piacenza":
			codice = "G535";
			break;
		case "Piadena":
			codice = "G536";
			break;
		case "Piagge":
			codice = "G537";
			break;
		case "Piaggine":
			codice = "G538";
			break;
		case "Piana Di Monte Verna":
			codice = "G541";
			break;
		case "Piana Cricodiceia":
			codice = "G542";
			break;
		case "Piana Degli Albanesi":
			codice = "G543";
			break;
		case "Pontboset":
			codice = "G545";
			break;
		case "Pian Camuno":
			codice = "G546";
			break;
		case "Piancastagnaio":
			codice = "G547";
			break;
		case "Piancogno":
			codice = "G549";
			break;
		case "Piandimeleto":
			codice = "G551";
			break;
		case "Pian Di Sco":
			codice = "G552";
			break;
		case "Piane Crati":
			codice = "G553";
			break;
		case "Pianella":
			codice = "G555";
			break;
		case "Pianello Del Lario":
			codice = "G556";
			break;
		case "Pianello Val Tidone":
			codice = "G557";
			break;
		case "Pianengo":
			codice = "G558";
			break;
		case "Pianezza":
			codice = "G559";
			break;
		case "Pianezze":
			codice = "G560";
			break;
		case "Pianfei":
			codice = "G561";
			break;
		case "Pianico":
			codice = "G564";
			break;
		case "Pianiga":
			codice = "G565";
			break;
		case "Piano Di Sorrento":
			codice = "G568";
			break;
		case "Pianoro":
			codice = "G570";
			break;
		case "Piansano":
			codice = "G571";
			break;
		case "Piantedo":
			codice = "G572";
			break;
		case "Piario":
			codice = "G574";
			break;
		case "Piasco":
			codice = "G575";
			break;
		case "Piateda":
			codice = "G576";
			break;
		case "Piatto":
			codice = "G577";
			break;
		case "Piazza Brembana":
			codice = "G579";
			break;
		case "Piazza Armerina":
			codice = "G580";
			break;
		case "Piazza Al Serchio":
			codice = "G582";
			break;
		case "Piazzatorre":
			codice = "G583";
			break;
		case "Piazzola Sul Brenta":
			codice = "G587";
			break;
		case "Piazzolo":
			codice = "G588";
			break;
		case "Picciano":
			codice = "G589";
			break;
		case "Picerno":
			codice = "G590";
			break;
		case "Picinisco":
			codice = "G591";
			break;
		case "Pico":
			codice = "G592";
			break;
		case "Piea":
			codice = "G593";
			break;
		case "Piedicavallo":
			codice = "G594";
			break;
		case "Piedimonte Matese":
			codice = "G596";
			break;
		case "Piedimonte Etneo":
			codice = "G597";
			break;
		case "Piedimonte San Germano":
			codice = "G598";
			break;
		case "Piedimulera":
			codice = "G600";
			break;
		case "Piegaro":
			codice = "G601";
			break;
		case "Pienza":
			codice = "G602";
			break;
		case "Pieranica":
			codice = "G603";
			break;
		case "Pietramontecorvino":
			codice = "G604";
			break;
		case "Pietra Ligure":
			codice = "G605";
			break;
		case "Pietrabbondante":
			codice = "G606";
			break;
		case "Pietrabruna":
			codice = "G607";
			break;
		case "Pietracamela":
			codice = "G608";
			break;
		case "Pietracatella":
			codice = "G609";
			break;
		case "Pietracupa":
			codice = "G610";
			break;
		case "Pietradefusi":
			codice = "G611";
			break;
		case "Pietra Dè Giorgi":
			codice = "G612";
			break;
		case "Pietraferrazzana":
			codice = "G613";
			break;
		case "Pietrafitta":
			codice = "G615";
			break;
		case "Pietragalla":
			codice = "G616";
			break;
		case "Pietralunga":
			codice = "G618";
			break;
		case "Pietra Marazzi":
			codice = "G619";
			break;
		case "Pietramelara":
			codice = "G620";
			break;
		case "Pietranico":
			codice = "G621";
			break;
		case "Pietrapaola":
			codice = "G622";
			break;
		case "Pietrapertosa":
			codice = "G623";
			break;
		case "Pietraperzia":
			codice = "G624";
			break;
		case "Pietraporzio":
			codice = "G625";
			break;
		case "Pietraroja":
			codice = "G626";
			break;
		case "Pietrarubbia":
			codice = "G627";
			break;
		case "Pietrasanta":
			codice = "G628";
			break;
		case "Pietrastornina":
			codice = "G629";
			break;
		case "Pietravairano":
			codice = "G630";
			break;
		case "Pietrelcina":
			codice = "G631";
			break;
		case "Pieve Di Teco":
			codice = "G632";
			break;
		case "Pieve Di Coriano":
			codice = "G633";
			break;
		case "Pieve Emanuele":
			codice = "G634";
			break;
		case "Pieve Albignola":
			codice = "G635";
			break;
		case "Pieve A Nievole":
			codice = "G636";
			break;
		case "Pievebovigliana":
			codice = "G637";
			break;
		case "Pieve D'Alpago":
			codice = "G638";
			break;
		case "Pieve Del Cairo":
			codice = "G639";
			break;
		case "Pieve Di Bono":
			codice = "G641";
			break;
		case "Pieve Di Cadore":
			codice = "G642";
			break;
		case "Pieve Di Cento":
			codice = "G643";
			break;
		case "Pieve Di Ledro":
			codice = "G644";
			break;
		case "Pieve Di Soligo":
			codice = "G645";
			break;
		case "Pieve Ligure":
			codice = "G646";
			break;
		case "Pieve D'Olmi":
			codice = "G647";
			break;
		case "Pieve Fosciana":
			codice = "G648";
			break;
		case "Pievepelago":
			codice = "G649";
			break;
		case "Pieve Porto Morone":
			codice = "G650";
			break;
		case "Pieve San Giacomo":
			codice = "G651";
			break;
		case "Pieve Santo Stefano":
			codice = "G653";
			break;
		case "Pieve Tesino":
			codice = "G656";
			break;
		case "Pieve Torina":
			codice = "G657";
			break;
		case "Pieve Vergonte":
			codice = "G658";
			break;
		case "Piglio":
			codice = "G659";
			break;
		case "Pigna":
			codice = "G660";
			break;
		case "Pignataro Maggiore":
			codice = "G661";
			break;
		case "Pignataro Interamna":
			codice = "G662";
			break;
		case "Pignola":
			codice = "G663";
			break;
		case "Pignone":
			codice = "G664";
			break;
		case "Pigra":
			codice = "G665";
			break;
		case "Pila":
			codice = "G666";
			break;
		case "Pimentel":
			codice = "G669";
			break;
		case "Pimonte":
			codice = "G670";
			break;
		case "Pinarolo Po":
			codice = "G671";
			break;
		case "Pinasca":
			codice = "G672";
			break;
		case "Pincara":
			codice = "G673";
			break;
		case "Pinerolo":
			codice = "G674";
			break;
		case "Pino D'Asti":
			codice = "G676";
			break;
		case "Pino Sulla Sponda Del Lago Maggiore":
			codice = "G677";
			break;
		case "Pino Torinese":
			codice = "G678";
			break;
		case "Pinzano Al Tagliamento":
			codice = "G680";
			break;
		case "Pinzolo":
			codice = "G681";
			break;
		case "Piobbico":
			codice = "G682";
			break;
		case "Piobesi D'Alba":
			codice = "G683";
			break;
		case "Piobesi Torinese":
			codice = "G684";
			break;
		case "Piode":
			codice = "G685";
			break;
		case "Pioltello":
			codice = "G686";
			break;
		case "Piombino":
			codice = "G687";
			break;
		case "Piombino Dese":
			codice = "G688";
			break;
		case "Pioraco":
			codice = "G690";
			break;
		case "Piossasco":
			codice = "G691";
			break;
		case "Piovà Massaia":
			codice = "G692";
			break;
		case "Piove Di Sacco":
			codice = "G693";
			break;
		case "Piovene Rocchette":
			codice = "G694";
			break;
		case "Piovera":
			codice = "G695";
			break;
		case "Piozzano":
			codice = "G696";
			break;
		case "Piozzo":
			codice = "G697";
			break;
		case "Priverno":
			codice = "G698";
			break;
		case "Piraino":
			codice = "G699";
			break;
		case "Pisa":
			codice = "G702";
			break;
		case "Pisano":
			codice = "G703";
			break;
		case "Pisoniano":
			codice = "G704";
			break;
		case "Piscina":
			codice = "G705";
			break;
		case "Pisciotta":
			codice = "G707";
			break;
		case "Pisogne":
			codice = "G710";
			break;
		case "Pisticci":
			codice = "G712";
			break;
		case "Pistoia":
			codice = "G713";
			break;
		case "Piteglio":
			codice = "G715";
			break;
		case "Pitigliano":
			codice = "G716";
			break;
		case "Piubega":
			codice = "G717";
			break;
		case "Piuro":
			codice = "G718";
			break;
		case "Piverone":
			codice = "G719";
			break;
		case "Pizzale":
			codice = "G720";
			break;
		case "Pizzighettone":
			codice = "G721";
			break;
		case "Pizzo":
			codice = "G722";
			break;
		case "Pizzoferrato":
			codice = "G724";
			break;
		case "Pizzoli":
			codice = "G726";
			break;
		case "Pizzone":
			codice = "G727";
			break;
		case "Pizzoni":
			codice = "G728";
			break;
		case "Placanica":
			codice = "G729";
			break;
		case "Plataci":
			codice = "G733";
			break;
		case "Platania":
			codice = "G734";
			break;
		case "Platì":
			codice = "G735";
			break;
		case "Plesio":
			codice = "G737";
			break;
		case "Ploaghe":
			codice = "G740";
			break;
		case "Plodio":
			codice = "G741";
			break;
		case "Pocapaglia":
			codice = "G742";
			break;
		case "Pocenia":
			codice = "G743";
			break;
		case "Podenzana":
			codice = "G746";
			break;
		case "Podenzano":
			codice = "G747";
			break;
		case "Pofi":
			codice = "G749";
			break;
		case "Poggiardo":
			codice = "G751";
			break;
		case "Poggibonsi":
			codice = "G752";
			break;
		case "Poggio Rusco":
			codice = "G753";
			break;
		case "Poggio A Caiano":
			codice = "G754";
			break;
		case "Poggio Berni":
			codice = "G755";
			break;
		case "Poggio Bustone":
			codice = "G756";
			break;
		case "Poggio Catino":
			codice = "G757";
			break;
		case "Poggiodomo":
			codice = "G758";
			break;
		case "Poggiofiorito":
			codice = "G760";
			break;
		case "Poggio Imperiale":
			codice = "G761";
			break;
		case "Poggiomarino":
			codice = "G762";
			break;
		case "Poggio Mirteto":
			codice = "G763";
			break;
		case "Poggio Moiano":
			codice = "G764";
			break;
		case "Poggio Nativo":
			codice = "G765";
			break;
		case "Poggio Picenze":
			codice = "G766";
			break;
		case "Poggioreale":
			codice = "G767";
			break;
		case "Poggio Renatico":
			codice = "G768";
			break;
		case "Poggiorsini":
			codice = "G769";
			break;
		case "Poggio San Lorenzo":
			codice = "G770";
			break;
		case "Poggio San Marcello":
			codice = "G771";
			break;
		case "Pogliano Milanese":
			codice = "G772";
			break;
		case "Pognana Lario":
			codice = "G773";
			break;
		case "Pognano":
			codice = "G774";
			break;
		case "Pogno":
			codice = "G775";
			break;
		case "Pojana Maggiore":
			codice = "G776";
			break;
		case "Poirino":
			codice = "G777";
			break;
		case "Polaveno":
			codice = "G779";
			break;
		case "Polcenigo":
			codice = "G780";
			break;
		case "Polesella":
			codice = "G782";
			break;
		case "Polesine Parmense":
			codice = "G783";
			break;
		case "Poli":
			codice = "G784";
			break;
		case "Polia":
			codice = "G785";
			break;
		case "Policoro":
			codice = "G786";
			break;
		case "Polignano A Mare":
			codice = "G787";
			break;
		case "Polinago":
			codice = "G789";
			break;
		case "Polino":
			codice = "G790";
			break;
		case "Polistena":
			codice = "G791";
			break;
		case "Polizzi Generosa":
			codice = "G792";
			break;
		case "Polla":
			codice = "G793";
			break;
		case "Pollein":
			codice = "G794";
			break;
		case "Pollena Trocchia":
			codice = "G795";
			break;
		case "Pollica":
			codice = "G796";
			break;
		case "Pollina":
			codice = "G797";
			break;
		case "Pollone":
			codice = "G798";
			break;
		case "Pollutri":
			codice = "G799";
			break;
		case "Polonghera":
			codice = "G800";
			break;
		case "Polpenazze Del Garda":
			codice = "G801";
			break;
		case "Polverara":
			codice = "G802";
			break;
		case "Polverigi":
			codice = "G803";
			break;
		case "Pomarance":
			codice = "G804";
			break;
		case "Pomaretto":
			codice = "G805";
			break;
		case "Pomarico":
			codice = "G806";
			break;
		case "Pomaro Monferrato":
			codice = "G807";
			break;
		case "Pomarolo":
			codice = "G808";
			break;
		case "Pombia":
			codice = "G809";
			break;
		case "Pomezia":
			codice = "G811";
			break;
		case "Pomigliano D'Arco":
			codice = "G812";
			break;
		case "Pompei":
			codice = "G813";
			break;
		case "Pompeiana":
			codice = "G814";
			break;
		case "Pompiano":
			codice = "G815";
			break;
		case "Pomponesco":
			codice = "G816";
			break;
		case "Pompu":
			codice = "G817";
			break;
		case "Poncarale":
			codice = "G818";
			break;
		case "Ponderano":
			codice = "G820";
			break;
		case "Ponna":
			codice = "G821";
			break;
		case "Ponsacco":
			codice = "G822";
			break;
		case "Ponso":
			codice = "G823";
			break;
		case "Pontassieve":
			codice = "G825";
			break;
		case "Pont Canavese":
			codice = "G826";
			break;
		case "Ponte":
			codice = "G827";
			break;
		case "Ponte In Valtellina":
			codice = "G829";
			break;
		case "Ponte Gardena":
			codice = "G830";
			break;
		case "Pontebba":
			codice = "G831";
			break;
		case "Ponte Buggianese":
			codice = "G833";
			break;
		case "Pontecagnano Faiano":
			codice = "G834";
			break;
		case "Pontecchio Polesine":
			codice = "G836";
			break;
		case "Pontechianale":
			codice = "G837";
			break;
		case "Pontecorvo":
			codice = "G838";
			break;
		case "Pontecurone":
			codice = "G839";
			break;
		case "Pontedassio":
			codice = "G840";
			break;
		case "Ponte Dell'Olio":
			codice = "G842";
			break;
		case "Pontedera":
			codice = "G843";
			break;
		case "Ponte Di Legno":
			codice = "G844";
			break;
		case "Ponte Di Piave":
			codice = "G846";
			break;
		case "Ponte Lambro":
			codice = "G847";
			break;
		case "Pontelandolfo":
			codice = "G848";
			break;
		case "Pontelatone":
			codice = "G849";
			break;
		case "Pontelongo":
			codice = "G850";
			break;
		case "Ponte Nizza":
			codice = "G851";
			break;
		case "Pontenure":
			codice = "G852";
			break;
		case "Ponteranica":
			codice = "G853";
			break;
		case "Pont-Saint-Martin":
			codice = "G854";
			break;
		case "Ponte San Nicolò":
			codice = "G855";
			break;
		case "Ponte San Pietro":
			codice = "G856";
			break;
		case "Pontestura":
			codice = "G858";
			break;
		case "Pontevico":
			codice = "G859";
			break;
		case "Pontey":
			codice = "G860";
			break;
		case "Ponti":
			codice = "G861";
			break;
		case "Ponti Sul Mincio":
			codice = "G862";
			break;
		case "Pontida":
			codice = "G864";
			break;
		case "Pontinia":
			codice = "G865";
			break;
		case "Pontinvrea":
			codice = "G866";
			break;
		case "Pontirolo Nuovo":
			codice = "G867";
			break;
		case "Pontoglio":
			codice = "G869";
			break;
		case "Pontremoli":
			codice = "G870";
			break;
		case "Ponza":
			codice = "G871";
			break;
		case "Ponzano Monferrato":
			codice = "G872";
			break;
		case "Ponzano Di Fermo":
			codice = "G873";
			break;
		case "Ponzano Romano":
			codice = "G874";
			break;
		case "Ponzano Veneto":
			codice = "G875";
			break;
		case "Ponzone":
			codice = "G877";
			break;
		case "Popoli":
			codice = "G878";
			break;
		case "Poppi":
			codice = "G879";
			break;
		case "Porano":
			codice = "G881";
			break;
		case "Porcari":
			codice = "G882";
			break;
		case "Porcia":
			codice = "G886";
			break;
		case "Pordenone":
			codice = "G888";
			break;
		case "Porlezza":
			codice = "G889";
			break;
		case "Pornassio":
			codice = "G890";
			break;
		case "Porpetto":
			codice = "G891";
			break;
		case "Portacomaro":
			codice = "G894";
			break;
		case "Portalbera":
			codice = "G895";
			break;
		case "Porte":
			codice = "G900";
			break;
		case "Portici":
			codice = "G902";
			break;
		case "Portico Di Caserta":
			codice = "G903";
			break;
		case "Portico E San Benedetto":
			codice = "G904";
			break;
		case "Portigliola":
			codice = "G905";
			break;
		case "Porto Ceresio":
			codice = "G906";
			break;
		case "Porto Valtravaglia":
			codice = "G907";
			break;
		case "Portobuffolè":
			codice = "G909";
			break;
		case "Portocannone":
			codice = "G910";
			break;
		case "Portoferraio":
			codice = "G912";
			break;
		case "Portofino":
			codice = "G913";
			break;
		case "Portogruaro":
			codice = "G914";
			break;
		case "Portomaggiore":
			codice = "G916";
			break;
		case "Porto Mantovano":
			codice = "G917";
			break;
		case "Porto Recanati":
			codice = "G919";
			break;
		case "Porto San Giorgio":
			codice = "G920";
			break;
		case "Porto Sant'Elpidio":
			codice = "G921";
			break;
		case "Portoscuso":
			codice = "G922";
			break;
		case "Porto Tolle":
			codice = "G923";
			break;
		case "Porto Torres":
			codice = "G924";
			break;
		case "Portovenere":
			codice = "G925";
			break;
		case "Porto Viro":
			codice = "G926";
			break;
		case "Portula":
			codice = "G927";
			break;
		case "Posada":
			codice = "G929";
			break;
		case "Posina":
			codice = "G931";
			break;
		case "Positano":
			codice = "G932";
			break;
		case "Possagno":
			codice = "G933";
			break;
		case "Posta":
			codice = "G934";
			break;
		case "Posta Fibreno":
			codice = "G935";
			break;
		case "Postal":
			codice = "G936";
			break;
		case "Postalesio":
			codice = "G937";
			break;
		case "Postiglione":
			codice = "G939";
			break;
		case "Postua":
			codice = "G940";
			break;
		case "Potenza":
			codice = "G942";
			break;
		case "Pove Del Grappa":
			codice = "G943";
			break;
		case "Povegliano":
			codice = "G944";
			break;
		case "Povegliano Veronese":
			codice = "G945";
			break;
		case "Poviglio":
			codice = "G947";
			break;
		case "Povoletto":
			codice = "G949";
			break;
		case "Pozza Di Fassa":
			codice = "G950";
			break;
		case "Pozzaglia Sabina":
			codice = "G951";
			break;
		case "Pozzallo":
			codice = "G953";
			break;
		case "Pozzilli":
			codice = "G954";
			break;
		case "Pozzo D'Adda":
			codice = "G955";
			break;
		case "Pozzoleone":
			codice = "G957";
			break;
		case "Pozzolengo":
			codice = "G959";
			break;
		case "Pozzol Groppo":
			codice = "G960";
			break;
		case "Pozzolo Formigaro":
			codice = "G961";
			break;
		case "Pozzomaggiore":
			codice = "G962";
			break;
		case "Pozzonovo":
			codice = "G963";
			break;
		case "Pozzuoli":
			codice = "G964";
			break;
		case "Pozzuolo Martesana":
			codice = "G965";
			break;
		case "Pozzuolo Del Friuli":
			codice = "G966";
			break;
		case "Pradalunga":
			codice = "G968";
			break;
		case "Pradamano":
			codice = "G969";
			break;
		case "Pradleves":
			codice = "G970";
			break;
		case "Pragelato":
			codice = "G973";
			break;
		case "Pray":
			codice = "G974";
			break;
		case "Praia A Mare":
			codice = "G975";
			break;
		case "Praiano":
			codice = "G976";
			break;
		case "Pralboino":
			codice = "G977";
			break;
		case "Prali":
			codice = "G978";
			break;
		case "Pralormo":
			codice = "G979";
			break;
		case "Pralungo":
			codice = "G980";
			break;
		case "Pramaggiore":
			codice = "G981";
			break;
		case "Pramollo":
			codice = "G982";
			break;
		case "Prarolo":
			codice = "G985";
			break;
		case "Prarostino":
			codice = "G986";
			break;
		case "Prasco":
			codice = "G987";
			break;
		case "Prascorsano":
			codice = "G988";
			break;
		case "Praso":
			codice = "G989";
			break;
		case "Prata Di Principato Ultra":
			codice = "G990";
			break;
		case "Prata Sannita":
			codice = "G991";
			break;
		case "Prata D'Ansidonia":
			codice = "G992";
			break;
		case "Prata Camportaccio":
			codice = "G993";
			break;
		case "Prata Di Pordenone":
			codice = "G994";
			break;
		case "Pratella":
			codice = "G995";
			break;
		case "Pratiglione":
			codice = "G997";
			break;
		case "Prato":
			codice = "G999";
			break;
		case "Prato Sesia":
			codice = "H001";
			break;
		case "Prato Carnico":
			codice = "H002";
			break;
		case "Pratola Serra":
			codice = "H006";
			break;
		case "Pratola Peligna":
			codice = "H007";
			break;
		case "Pratovecchio":
			codice = "H008";
			break;
		case "Pravisdomini":
			codice = "H010";
			break;
		case "Prazzo":
			codice = "H011";
			break;
		case "Precenicco":
			codice = "H014";
			break;
		case "Preci":
			codice = "H015";
			break;
		case "Predappio":
			codice = "H017";
			break;
		case "Predazzo":
			codice = "H018";
			break;
		case "Predoi":
			codice = "H019";
			break;
		case "Predore":
			codice = "H020";
			break;
		case "Predosa":
			codice = "H021";
			break;
		case "Preganziol":
			codice = "H022";
			break;
		case "Pregnana Milanese":
			codice = "H026";
			break;
		case "Prelà":
			codice = "H027";
			break;
		case "Premana":
			codice = "H028";
			break;
		case "Premariacco":
			codice = "H029";
			break;
		case "Premeno":
			codice = "H030";
			break;
		case "Premia":
			codice = "H033";
			break;
		case "Premilcuore":
			codice = "H034";
			break;
		case "Premolo":
			codice = "H036";
			break;
		case "Premosello-Chiovenda":
			codice = "H037";
			break;
		case "Preone":
			codice = "H038";
			break;
		case "Preore":
			codice = "H039";
			break;
		case "Prepotto":
			codice = "H040";
			break;
		case "Prè-Saint-Didier":
			codice = "H042";
			break;
		case "Preseglie":
			codice = "H043";
			break;
		case "Presenzano":
			codice = "H045";
			break;
		case "Presezzo":
			codice = "H046";
			break;
		case "Presicce":
			codice = "H047";
			break;
		case "Pressana":
			codice = "H048";
			break;
		case "Prestine":
			codice = "H050";
			break;
		case "Pretoro":
			codice = "H052";
			break;
		case "Prevalle":
			codice = "H055";
			break;
		case "Prezza":
			codice = "H056";
			break;
		case "Prezzo":
			codice = "H057";
			break;
		case "Priero":
			codice = "H059";
			break;
		case "Prignano Sulla Secchia":
			codice = "H061";
			break;
		case "Prignano Cilento":
			codice = "H062";
			break;
		case "Primaluna":
			codice = "H063";
			break;
		case "Priocca":
			codice = "H068";
			break;
		case "Priola":
			codice = "H069";
			break;
		case "Prizzi":
			codice = "H070";
			break;
		case "Proceno":
			codice = "H071";
			break;
		case "Procida":
			codice = "H072";
			break;
		case "Propata":
			codice = "H073";
			break;
		case "Proserpio":
			codice = "H074";
			break;
		case "Prossedi":
			codice = "H076";
			break;
		case "Provaglio Val Sabbia":
			codice = "H077";
			break;
		case "Provaglio D'Iseo":
			codice = "H078";
			break;
		case "Proves":
			codice = "H081";
			break;
		case "Provvidenti":
			codice = "H083";
			break;
		case "Prunetto":
			codice = "H085";
			break;
		case "Puegnago Del Garda":
			codice = "H086";
			break;
		case "Puglianello":
			codice = "H087";
			break;
		case "Pula":
			codice = "H088";
			break;
		case "Pulfero":
			codice = "H089";
			break;
		case "Pulsano":
			codice = "H090";
			break;
		case "Pumenengo":
			codice = "H091";
			break;
		case "Puos D'Alpago":
			codice = "H092";
			break;
		case "Pusiano":
			codice = "H094";
			break;
		case "Putifigari":
			codice = "H095";
			break;
		case "Putignano":
			codice = "H096";
			break;

		}

	}

	private void codiciComuniQ(String comune) {

		switch (comune) {

		case "Quaregna Cerreto":
			codice = "M414";
			break;
		case "Quero Vas":
			codice = "M332";
			break;
		case "Quadrelle":
			codice = "H097";
			break;
		case "Quadri":
			codice = "H098";
			break;
		case "Quagliuzzo":
			codice = "H100";
			break;
		case "Qualiano":
			codice = "H101";
			break;
		case "Quaranti":
			codice = "H102";
			break;
		case "Quaregna":
			codice = "H103";
			break;
		case "Quargnento":
			codice = "H104";
			break;
		case "Quarna Sopra":
			codice = "H106";
			break;
		case "Quarna Sotto":
			codice = "H107";
			break;
		case "Quarona":
			codice = "H108";
			break;
		case "Quarrata":
			codice = "H109";
			break;
		case "Quart":
			codice = "H110";
			break;
		case "Quarto":
			codice = "H114";
			break;
		case "Quarto D'Altino":
			codice = "H117";
			break;
		case "Quartu Sant'Elena":
			codice = "H118";
			break;
		case "Quartucciu":
			codice = "H119";
			break;
		case "Quassolo":
			codice = "H120";
			break;
		case "Quattordio":
			codice = "H121";
			break;
		case "Quattro Castella":
			codice = "H122";
			break;
		case "Quero":
			codice = "H124";
			break;
		case "Quiliano":
			codice = "H126";
			break;
		case "Quincinetto":
			codice = "H127";
			break;
		case "Quindici":
			codice = "H128";
			break;
		case "Quingentole":
			codice = "H129";
			break;
		case "Quintano":
			codice = "H130";
			break;
		case "Quinto Di Treviso":
			codice = "H131";
			break;
		case "Quinto Vercellese":
			codice = "H132";
			break;
		case "Quinto Vicentino":
			codice = "H134";
			break;
		case "Quinzano D'Oglio":
			codice = "H140";
			break;
		case "Quistello":
			codice = "H143";
			break;
		case "Quittengo":
			codice = "H145";
			break;

		}

	}

	private void codiciComuniR(String comune) {

		switch (comune) {

		case "Ruinas":
			codice = "F271";
			break;
		case "Roseto Degli Abruzzi":
			codice = "F585";
			break;
		case "Ragalna":
			codice = "M287";
			break;
		case "Ronzo-Chienis":
			codice = "M303";
			break;
		case "Rivignano Teor":
			codice = "M317";
			break;
		case "Rio":
			codice = "M391";
			break;
		case "Riva Del Po":
			codice = "M410";
			break;
		case "Robbiate":
			codice = "G223";
			break;
		case "Ramiseto":
			codice = "G654";
			break;
		case "Rabbi":
			codice = "H146";
			break;
		case "Racale":
			codice = "H147";
			break;
		case "Racalmuto":
			codice = "H148";
			break;
		case "Racconigi":
			codice = "H150";
			break;
		case "Raccuja":
			codice = "H151";
			break;
		case "Racines":
			codice = "H152";
			break;
		case "Radda In Chianti":
			codice = "H153";
			break;
		case "Raddusa":
			codice = "H154";
			break;
		case "Radicofani":
			codice = "H156";
			break;
		case "Radicondoli":
			codice = "H157";
			break;
		case "Raffadali":
			codice = "H159";
			break;
		case "Ragogna":
			codice = "H161";
			break;
		case "Ragoli":
			codice = "H162";
			break;
		case "Ragusa":
			codice = "H163";
			break;
		case "Ruviano":
			codice = "H165";
			break;
		case "Raiano":
			codice = "H166";
			break;
		case "Ramacca":
			codice = "H168";
			break;
		case "Ramponio Verna":
			codice = "H171";
			break;
		case "Rancio Valcuvia":
			codice = "H173";
			break;
		case "Ranco":
			codice = "H174";
			break;
		case "Randazzo":
			codice = "H175";
			break;
		case "Ranica":
			codice = "H176";
			break;
		case "Ranzanico":
			codice = "H177";
			break;
		case "Ranzo":
			codice = "H180";
			break;
		case "Rapagnano":
			codice = "H182";
			break;
		case "Rapallo":
			codice = "H183";
			break;
		case "Rapino":
			codice = "H184";
			break;
		case "Rapolano Terme":
			codice = "H185";
			break;
		case "Rapolla":
			codice = "H186";
			break;
		case "Rapone":
			codice = "H187";
			break;
		case "Rassa":
			codice = "H188";
			break;
		case "Rasun Anterselva":
			codice = "H189";
			break;
		case "Rasura":
			codice = "H192";
			break;
		case "Ravanusa":
			codice = "H194";
			break;
		case "Ravarino":
			codice = "H195";
			break;
		case "Ravascletto":
			codice = "H196";
			break;
		case "Ravello":
			codice = "H198";
			break;
		case "Ravenna":
			codice = "H199";
			break;
		case "Raveo":
			codice = "H200";
			break;
		case "Raviscanina":
			codice = "H202";
			break;
		case "Re":
			codice = "H203";
			break;
		case "Rea":
			codice = "H204";
			break;
		case "Realmonte":
			codice = "H205";
			break;
		case "Reana Del Rojale":
			codice = "H206";
			break;
		case "Reano":
			codice = "H207";
			break;
		case "Recale":
			codice = "H210";
			break;
		case "Recanati":
			codice = "H211";
			break;
		case "Recco":
			codice = "H212";
			break;
		case "Recetto":
			codice = "H213";
			break;
		case "Recoaro Terme":
			codice = "H214";
			break;
		case "Redavalle":
			codice = "H216";
			break;
		case "Redondesco":
			codice = "H218";
			break;
		case "Refrancore":
			codice = "H219";
			break;
		case "Refrontolo":
			codice = "H220";
			break;
		case "Regalbuto":
			codice = "H221";
			break;
		case "Reggello":
			codice = "H222";
			break;
		case "Reggio Nell'Emilia":
			codice = "H223";
			break;
		case "Reggio Di Calabria":
			codice = "H224";
			break;
		case "Reggiolo":
			codice = "H225";
			break;
		case "Reino":
			codice = "H227";
			break;
		case "Reitano":
			codice = "H228";
			break;
		case "Remanzacco":
			codice = "H229";
			break;
		case "Remedello":
			codice = "H230";
			break;
		case "Renate":
			codice = "H233";
			break;
		case "Rende":
			codice = "H235";
			break;
		case "Renon":
			codice = "H236";
			break;
		case "Resana":
			codice = "H238";
			break;
		case "Rescaldina":
			codice = "H240";
			break;
		case "Resia":
			codice = "H242";
			break;
		case "Resiutta":
			codice = "H244";
			break;
		case "Resuttano":
			codice = "H245";
			break;
		case "Retorbido":
			codice = "H246";
			break;
		case "Revello":
			codice = "H247";
			break;
		case "Revere":
			codice = "H248";
			break;
		case "Revigliasco D'Asti":
			codice = "H250";
			break;
		case "Revine Lago":
			codice = "H253";
			break;
		case "Revò":
			codice = "H254";
			break;
		case "Rezzago":
			codice = "H255";
			break;
		case "Rezzato":
			codice = "H256";
			break;
		case "Rezzo":
			codice = "H257";
			break;
		case "Rezzoaglio":
			codice = "H258";
			break;
		case "Rhemes-Notre-Dame":
			codice = "H262";
			break;
		case "Rhemes-Saint-Georges":
			codice = "H263";
			break;
		case "Rho":
			codice = "H264";
			break;
		case "Riace":
			codice = "H265";
			break;
		case "Rialto":
			codice = "H266";
			break;
		case "Riano":
			codice = "H267";
			break;
		case "Riardo":
			codice = "H268";
			break;
		case "Ribera":
			codice = "H269";
			break;
		case "Ribordone":
			codice = "H270";
			break;
		case "Ricadi":
			codice = "H271";
			break;
		case "Ricaldone":
			codice = "H272";
			break;
		case "Riccia":
			codice = "H273";
			break;
		case "Riccione":
			codice = "H274";
			break;
		case "Riccò Del Golfo Di Spezia":
			codice = "H275";
			break;
		case "Ricengo":
			codice = "H276";
			break;
		case "Ricigliano":
			codice = "H277";
			break;
		case "Riese Pio codice":
			codice = "H280";
			break;
		case "Riesi":
			codice = "H281";
			break;
		case "Rieti":
			codice = "H282";
			break;
		case "Rifiano":
			codice = "H284";
			break;
		case "Rifreddo":
			codice = "H285";
			break;
		case "Rignano Sull'Arno":
			codice = "H286";
			break;
		case "Rignano Garganico":
			codice = "H287";
			break;
		case "Rignano Flaminio":
			codice = "H288";
			break;
		case "Rigolato":
			codice = "H289";
			break;
		case "Rima San Giuseppe":
			codice = "H291";
			break;
		case "Rimasco":
			codice = "H292";
			break;
		case "Rimella":
			codice = "H293";
			break;
		case "Rimini":
			codice = "H294";
			break;
		case "Rio Nell'Elba":
			codice = "H297";
			break;
		case "Rio Saliceto":
			codice = "H298";
			break;
		case "Rio Di Pusteria":
			codice = "H299";
			break;
		case "Riofreddo":
			codice = "H300";
			break;
		case "Riola Sardo":
			codice = "H301";
			break;
		case "Riolo Terme":
			codice = "H302";
			break;
		case "Riolunato":
			codice = "H303";
			break;
		case "Riomaggiore":
			codice = "H304";
			break;
		case "Rio Marina":
			codice = "H305";
			break;
		case "Rionero In Vulture":
			codice = "H307";
			break;
		case "Rionero Sannitico":
			codice = "H308";
			break;
		case "Ripabottoni":
			codice = "H311";
			break;
		case "Ripacandida":
			codice = "H312";
			break;
		case "Ripalimosani":
			codice = "H313";
			break;
		case "Ripalta Arpina":
			codice = "H314";
			break;
		case "Ripalta Cremasca":
			codice = "H315";
			break;
		case "Ripalta Guerina":
			codice = "H316";
			break;
		case "Riparbella":
			codice = "H319";
			break;
		case "Ripa Teatina":
			codice = "H320";
			break;
		case "Ripatransone":
			codice = "H321";
			break;
		case "Ripe":
			codice = "H322";
			break;
		case "Ripe San Ginesio":
			codice = "H323";
			break;
		case "Ripi":
			codice = "H324";
			break;
		case "Riposto":
			codice = "H325";
			break;
		case "Rittana":
			codice = "H326";
			break;
		case "Rivamonte Agordino":
			codice = "H327";
			break;
		case "Riva Ligure":
			codice = "H328";
			break;
		case "Riva Valdobbia":
			codice = "H329";
			break;
		case "Riva Del Garda":
			codice = "H330";
			break;
		case "Riva Di Solto":
			codice = "H331";
			break;
		case "Rivalba":
			codice = "H333";
			break;
		case "Rivalta Bormida":
			codice = "H334";
			break;
		case "Rivalta Di Torino":
			codice = "H335";
			break;
		case "Rivanazzano Terme":
			codice = "H336";
			break;
		case "Riva Presso Chieri":
			codice = "H337";
			break;
		case "Rivara":
			codice = "H338";
			break;
		case "Rivarolo Canavese":
			codice = "H340";
			break;
		case "Rivarolo Del Re Ed Uniti":
			codice = "H341";
			break;
		case "Rivarolo Mantovano":
			codice = "H342";
			break;
		case "Rivarone":
			codice = "H343";
			break;
		case "Rivarossa":
			codice = "H344";
			break;
		case "Rive":
			codice = "H346";
			break;
		case "Rive D'Arcano":
			codice = "H347";
			break;
		case "Rivello":
			codice = "H348";
			break;
		case "Rivergaro":
			codice = "H350";
			break;
		case "Rivignano":
			codice = "H352";
			break;
		case "Rivisondoli":
			codice = "H353";
			break;
		case "Rivodutri":
			codice = "H354";
			break;
		case "Rivoli":
			codice = "H355";
			break;
		case "Rivoli Veronese":
			codice = "H356";
			break;
		case "Rivolta D'Adda":
			codice = "H357";
			break;
		case "Rizziconi":
			codice = "H359";
			break;
		case "Ro":
			codice = "H360";
			break;
		case "Roana":
			codice = "H361";
			break;
		case "Roaschia":
			codice = "H362";
			break;
		case "Roascio":
			codice = "H363";
			break;
		case "Rovasenda":
			codice = "H364";
			break;
		case "Roasio":
			codice = "H365";
			break;
		case "Roatto":
			codice = "H366";
			break;
		case "Robassomero":
			codice = "H367";
			break;
		case "Robbio":
			codice = "H369";
			break;
		case "Robecchetto Con Induno":
			codice = "H371";
			break;
		case "Robecco D'Oglio":
			codice = "H372";
			break;
		case "Robecco Sul Naviglio":
			codice = "H373";
			break;
		case "Robecco Pavese":
			codice = "H375";
			break;
		case "Robella":
			codice = "H376";
			break;
		case "Robilante":
			codice = "H377";
			break;
		case "Roburent":
			codice = "H378";
			break;
		case "Rocca Pietore":
			codice = "H379";
			break;
		case "Roccavaldina":
			codice = "H380";
			break;
		case "Roccabascerana":
			codice = "H382";
			break;
		case "Roccabernarda":
			codice = "H383";
			break;
		case "Roccabianca":
			codice = "H384";
			break;
		case "Roccabruna":
			codice = "H385";
			break;
		case "Rocca Canavese":
			codice = "H386";
			break;
		case "Rocca Canterano":
			codice = "H387";
			break;
		case "Roccacasale":
			codice = "H389";
			break;
		case "Roccafluvione":
			codice = "H390";
			break;
		case "Rocca Cigliè":
			codice = "H391";
			break;
		case "Rocca D'Arazzo":
			codice = "H392";
			break;
		case "Roccadarce":
			codice = "H393";
			break;
		case "Roccadaspide":
			codice = "H394";
			break;
		case "Rocca Dè Baldi":
			codice = "H395";
			break;
		case "Rocca Dè Giorgi":
			codice = "H396";
			break;
		case "Rocca D'Evandro":
			codice = "H398";
			break;
		case "Rocca Di Botte":
			codice = "H399";
			break;
		case "Rocca Di Cambio":
			codice = "H400";
			break;
		case "Rocca Di Cave":
			codice = "H401";
			break;
		case "Rocca Di Mezzo":
			codice = "H402";
			break;
		case "Rocca Di Neto":
			codice = "H403";
			break;
		case "Rocca Di Papa":
			codice = "H404";
			break;
		case "Roccafiorita":
			codice = "H405";
			break;
		case "Roccaforte Ligure":
			codice = "H406";
			break;
		case "Roccaforte Mondovì":
			codice = "H407";
			break;
		case "Roccaforte Del Greco":
			codice = "H408";
			break;
		case "Roccaforzata":
			codice = "H409";
			break;
		case "Roccafranca":
			codice = "H410";
			break;
		case "Roccagiovine":
			codice = "H411";
			break;
		case "Roccagloriosa":
			codice = "H412";
			break;
		case "Roccagorga":
			codice = "H413";
			break;
		case "Rocca Grimalda":
			codice = "H414";
			break;
		case "Rocca Imperiale":
			codice = "H416";
			break;
		case "Roccalbegna":
			codice = "H417";
			break;
		case "Roccalumera":
			codice = "H418";
			break;
		case "Roccamandolfi":
			codice = "H420";
			break;
		case "Rocca Massima":
			codice = "H421";
			break;
		case "Roccamena":
			codice = "H422";
			break;
		case "Roccamonfina":
			codice = "H423";
			break;
		case "Roccamontepiano":
			codice = "H424";
			break;
		case "Roccamorice":
			codice = "H425";
			break;
		case "Roccanova":
			codice = "H426";
			break;
		case "Roccantica":
			codice = "H427";
			break;
		case "Roccapalumba":
			codice = "H428";
			break;
		case "Rocca Pia":
			codice = "H429";
			break;
		case "Roccapiemonte":
			codice = "H431";
			break;
		case "Rocca Priora":
			codice = "H432";
			break;
		case "Roccarainola":
			codice = "H433";
			break;
		case "Roccaraso":
			codice = "H434";
			break;
		case "Roccaromana":
			codice = "H436";
			break;
		case "Rocca San Casciano":
			codice = "H437";
			break;
		case "Rocca San Felice":
			codice = "H438";
			break;
		case "Rocca San Giovanni":
			codice = "H439";
			break;
		case "Rocca Santa Maria":
			codice = "H440";
			break;
		case "Rocca Santo Stefano":
			codice = "H441";
			break;
		case "Roccascalegna":
			codice = "H442";
			break;
		case "Roccasecca":
			codice = "H443";
			break;
		case "Roccasecca Dei Volsci":
			codice = "H444";
			break;
		case "Roccasicura":
			codice = "H445";
			break;
		case "Rocca Sinibalda":
			codice = "H446";
			break;
		case "Roccasparvera":
			codice = "H447";
			break;
		case "Roccaspinalveti":
			codice = "H448";
			break;
		case "Roccastrada":
			codice = "H449";
			break;
		case "Rocca Susella":
			codice = "H450";
			break;
		case "Roccaverano":
			codice = "H451";
			break;
		case "Roccavignale":
			codice = "H452";
			break;
		case "Roccavione":
			codice = "H453";
			break;
		case "Roccavivara":
			codice = "H454";
			break;
		case "Roccella Valdemone":
			codice = "H455";
			break;
		case "Roccella Ionica":
			codice = "H456";
			break;
		case "Rocchetta A Volturno":
			codice = "H458";
			break;
		case "Rocchetta E Croce":
			codice = "H459";
			break;
		case "Rocchetta Nervina":
			codice = "H460";
			break;
		case "Rocchetta Di Vara":
			codice = "H461";
			break;
		case "Rocchetta Belbo":
			codice = "H462";
			break;
		case "Rocchetta Ligure":
			codice = "H465";
			break;
		case "Rocchetta Palafea":
			codice = "H466";
			break;
		case "Rocchetta Sant'Antonio":
			codice = "H467";
			break;
		case "Rocchetta Tanaro":
			codice = "H468";
			break;
		case "Rodano":
			codice = "H470";
			break;
		case "Roddi":
			codice = "H472";
			break;
		case "Roddino":
			codice = "H473";
			break;
		case "Rodello":
			codice = "H474";
			break;
		case "Rodengo":
			codice = "H475";
			break;
		case "Rodengo Saiano":
			codice = "H477";
			break;
		case "Rodero":
			codice = "H478";
			break;
		case "Rodì Milici":
			codice = "H479";
			break;
		case "Rodi Garganico":
			codice = "H480";
			break;
		case "Rodigo":
			codice = "H481";
			break;
		case "Roè Volciano":
			codice = "H484";
			break;
		case "Rofrano":
			codice = "H485";
			break;
		case "Rogeno":
			codice = "H486";
			break;
		case "Roggiano Gravina":
			codice = "H488";
			break;
		case "Roghudi":
			codice = "H489";
			break;
		case "Rogliano":
			codice = "H490";
			break;
		case "Rognano":
			codice = "H491";
			break;
		case "Rogno":
			codice = "H492";
			break;
		case "Rogolo":
			codice = "H493";
			break;
		case "Roiate":
			codice = "H494";
			break;
		case "Roio Del Sangro":
			codice = "H495";
			break;
		case "Roisan":
			codice = "H497";
			break;
		case "Roletto":
			codice = "H498";
			break;
		case "Rolo":
			codice = "H500";
			break;
		case "Roma":
			codice = "H501";
			break;
		case "Romagnano Sesia":
			codice = "H502";
			break;
		case "Romagnano Al Monte":
			codice = "H503";
			break;
		case "Romagnese":
			codice = "H505";
			break;
		case "Romallo":
			codice = "H506";
			break;
		case "Romana":
			codice = "H507";
			break;
		case "Romanengo":
			codice = "H508";
			break;
		case "Romano Di Lombardia":
			codice = "H509";
			break;
		case "Romano Canavese":
			codice = "H511";
			break;
		case "Romano D'Ezzelino":
			codice = "H512";
			break;
		case "Romans D'Isonzo":
			codice = "H514";
			break;
		case "Rombiolo":
			codice = "H516";
			break;
		case "Romeno":
			codice = "H517";
			break;
		case "Romentino":
			codice = "H518";
			break;
		case "Rometta":
			codice = "H519";
			break;
		case "Ronago":
			codice = "H521";
			break;
		case "Roncà":
			codice = "H522";
			break;
		case "Roncade":
			codice = "H523";
			break;
		case "Roncadelle":
			codice = "H525";
			break;
		case "Roncaro":
			codice = "H527";
			break;
		case "Roncegno Terme":
			codice = "H528";
			break;
		case "Roncello":
			codice = "H529";
			break;
		case "Ronchi Dei Legionari":
			codice = "H531";
			break;
		case "Ronchi Valsugana":
			codice = "H532";
			break;
		case "Ronchis":
			codice = "H533";
			break;
		case "Ronciglione":
			codice = "H534";
			break;
		case "Roncobello":
			codice = "H535";
			break;
		case "Ronco Scrivia":
			codice = "H536";
			break;
		case "Ronco Briantino":
			codice = "H537";
			break;
		case "Ronco Biellese":
			codice = "H538";
			break;
		case "Ronco Canavese":
			codice = "H539";
			break;
		case "Ronco All'Adige":
			codice = "H540";
			break;
		case "Roncoferraro":
			codice = "H541";
			break;
		case "Roncofreddo":
			codice = "H542";
			break;
		case "Roncola":
			codice = "H544";
			break;
		case "Roncone":
			codice = "H545";
			break;
		case "Rondanina":
			codice = "H546";
			break;
		case "Rondissone":
			codice = "H547";
			break;
		case "Ronsecco":
			codice = "H549";
			break;
		case "Ronzone":
			codice = "H552";
			break;
		case "Roppolo":
			codice = "H553";
			break;
		case "Rorà":
			codice = "H554";
			break;
		case "Roure":
			codice = "H555";
			break;
		case "Rosà":
			codice = "H556";
			break;
		case "Rosarno":
			codice = "H558";
			break;
		case "Rosasco":
			codice = "H559";
			break;
		case "Rosate":
			codice = "H560";
			break;
		case "Rosazza":
			codice = "H561";
			break;
		case "Rosciano":
			codice = "H562";
			break;
		case "Roscigno":
			codice = "H564";
			break;
		case "Rose":
			codice = "H565";
			break;
		case "Rosello":
			codice = "H566";
			break;
		case "Roseto Valfortore":
			codice = "H568";
			break;
		case "Rosignano Monferrato":
			codice = "H569";
			break;
		case "Rosignano Marittimo":
			codice = "H570";
			break;
		case "Roseto Capo Spulico":
			codice = "H572";
			break;
		case "Rosolina":
			codice = "H573";
			break;
		case "Rosolini":
			codice = "H574";
			break;
		case "Rosora":
			codice = "H575";
			break;
		case "Rossa":
			codice = "H577";
			break;
		case "Rossana":
			codice = "H578";
			break;
		case "Rossano":
			codice = "H579";
			break;
		case "Rossano Veneto":
			codice = "H580";
			break;
		case "Rossiglione":
			codice = "H581";
			break;
		case "Rosta":
			codice = "H583";
			break;
		case "Rota D'Imagna":
			codice = "H584";
			break;
		case "Rota Greca":
			codice = "H585";
			break;
		case "Rotella":
			codice = "H588";
			break;
		case "Rotello":
			codice = "H589";
			break;
		case "Rotonda":
			codice = "H590";
			break;
		case "Rotondella":
			codice = "H591";
			break;
		case "Rotondi":
			codice = "H592";
			break;
		case "Rottofreno":
			codice = "H593";
			break;
		case "Rotzo":
			codice = "H594";
			break;
		case "Rovagnate":
			codice = "H596";
			break;
		case "Rovato":
			codice = "H598";
			break;
		case "Rovegno":
			codice = "H599";
			break;
		case "Rovellasca":
			codice = "H601";
			break;
		case "Rovello Porro":
			codice = "H602";
			break;
		case "Roverbella":
			codice = "H604";
			break;
		case "Roverchiara":
			codice = "H606";
			break;
		case "Roverè Della Luna":
			codice = "H607";
			break;
		case "Roverè Veronese":
			codice = "H608";
			break;
		case "Roveredo In Piano":
			codice = "H609";
			break;
		case "Roveredo Di Guà":
			codice = "H610";
			break;
		case "Rovereto":
			codice = "H612";
			break;
		case "Rovescala":
			codice = "H614";
			break;
		case "Rovetta":
			codice = "H615";
			break;
		case "Roviano":
			codice = "H618";
			break;
		case "Rovigo":
			codice = "H620";
			break;
		case "Rovito":
			codice = "H621";
			break;
		case "Rovolon":
			codice = "H622";
			break;
		case "Rozzano":
			codice = "H623";
			break;
		case "Rubano":
			codice = "H625";
			break;
		case "Rubiana":
			codice = "H627";
			break;
		case "Rubiera":
			codice = "H628";
			break;
		case "Ruda":
			codice = "H629";
			break;
		case "Rudiano":
			codice = "H630";
			break;
		case "Rueglio":
			codice = "H631";
			break;
		case "Ruffano":
			codice = "H632";
			break;
		case "Ruffia":
			codice = "H633";
			break;
		case "Ruffrè-Mendola":
			codice = "H634";
			break;
		case "Rufina":
			codice = "H635";
			break;
		case "Ruino":
			codice = "H637";
			break;
		case "Rumo":
			codice = "H639";
			break;
		case "Ruoti":
			codice = "H641";
			break;
		case "Russi":
			codice = "H642";
			break;
		case "Rutigliano":
			codice = "H643";
			break;
		case "Rutino":
			codice = "H644";
			break;
		case "Ruvo Di Puglia":
			codice = "H645";
			break;
		case "Ruvo Del Monte":
			codice = "H646";
			break;

		}

	}

	private void codiciComuniS(String comune) {

		switch (comune) {

		case "San Nicolò D'Arcidano":
			codice = "A368";
			break;
		case "Sinalunga":
			codice = "A468";
			break;
		case "San Giuliano Terme":
			codice = "A562";
			break;
		case "Suardi":
			codice = "B014";
			break;
		case "San Paolo D'Argon":
			codice = "B310";
			break;
		case "Sant'Elena Sannita":
			codice = "B466";
			break;
		case "San Paolo Albanese":
			codice = "B906";
			break;
		case "San Giacomo Vercellese":
			codice = "B952";
			break;
		case "Scandicci":
			codice = "B962";
			break;
		case "Servigliano":
			codice = "C070";
			break;
		case "Santa Maria Del Cedro":
			codice = "C717";
			break;
		case "Santa Stefano Di Cadore":
			codice = "C919";
			break;
		case "Scigliano":
			codice = "D290";
			break;
		case "San Dorligo Della Valle":
			codice = "D324";
			break;
		case "San Giovanni Teatino":
			codice = "D690";
			break;
		case "Sesta Godano":
			codice = "E070";
			break;
		case "Siziano":
			codice = "E265";
			break;
		case "San Marco Evangelista":
			codice = "F043";
			break;
		case "Silea":
			codice = "F116";
			break;
		case "Serramazzoni":
			codice = "F357";
			break;
		case "Sant'Arcangelo Trimonte":
			codice = "F557";
			break;
		case "Salcedo":
			codice = "F810";
			break;
		case "San Giovanni Suergiu":
			codice = "G287";
			break;
		case "San Nicolò Gerrei":
			codice = "G383";
			break;
		case "San Paolo":
			codice = "G407";
			break;
		case "San Giovanni In Persiceto":
			codice = "G467";
			break;
		case "San Benedetto Val Di Sambro":
			codice = "G566";
			break;
		case "Satriano Di Lucania":
			codice = "G614";
			break;
		case "San Pietro In Cerro":
			codice = "G788";
			break;
		case "Stella Cilento":
			codice = "G887";
			break;
		case "Sasso Marconi":
			codice = "G972";
			break;
		case "Sant'Anna Arresi":
			codice = "M209";
			break;
		case "Sicignano Degli Alburni":
			codice = "M253";
			break;
		case "Scanzano Jonico":
			codice = "M256";
			break;
		case "San Cassiano":
			codice = "M264";
			break;
		case "Santa Maria La Carità":
			codice = "M273";
			break;
		case "Sant'Antonio Di Gallura":
			codice = "M276";
			break;
		case "San Ferdinando":
			codice = "M277";
			break;
		case "Santa Maria Coghinas":
			codice = "M284";
			break;
		case "Stintino":
			codice = "M290";
			break;
		case "San Cesareo":
			codice = "M295";
			break;
		case "Statte":
			codice = "M298";
			break;
		case "Sissa Trecasali":
			codice = "M325";
			break;
		case "Scarperia E San Piero":
			codice = "M326";
			break;
		case "Sant'Omobono Terme":
			codice = "M333";// I349
			break;
		case "San Lorenzo Dorsino":
			codice = "M345";
			break;
		case "Sillano Giuncugnano":
			codice = "M347";
			break;
		case "Sella Giudicarie":
			codice = "M360";
			break;
		case "San Marcello Piteglio":
			codice = "M377";
			break;
		case "San Giovanni Di Fassa":
			codice = "M390";
			break;
		case "Sorbolo Mezzani":
			codice = "M411";
			break;
		case "Solbiate Con Cagno":
			codice = "M412";
			break;
		case "Sassocorvaro Auditore":
			codice = "M413";
			break;
		case "Samo":
			codice = "H013";
			break;
		case "Sabaudia":
			codice = "H647";
			break;
		case "Sabbia":
			codice = "H648";
			break;
		case "Sabbio Chiese":
			codice = "H650";
			break;
		case "Sabbioneta":
			codice = "H652";
			break;
		case "Sacco":
			codice = "H654";
			break;
		case "Saccolongo":
			codice = "H655";
			break;
		case "Sacile":
			codice = "H657";
			break;
		case "Sacrofano":
			codice = "H658";
			break;
		case "Sadali":
			codice = "H659";
			break;
		case "Sagama":
			codice = "H661";
			break;
		case "Sagliano Micca":
			codice = "H662";
			break;
		case "Sagrado":
			codice = "H665";
			break;
		case "Sagron Mis":
			codice = "H666";
			break;
		case "Saint-Christophe":
			codice = "H669";
			break;
		case "Saint-Denis":
			codice = "H670";
			break;
		case "Saint-Marcel":
			codice = "H671";
			break;
		case "Saint-Nicolas":
			codice = "H672";
			break;
		case "Saint-Oyen":
			codice = "H673";
			break;
		case "Saint-Pierre":
			codice = "H674";
			break;
		case "Saint-Rhemy-En-Bosses":
			codice = "H675";
			break;
		case "Saint-Vincent":
			codice = "H676";
			break;
		case "Sala Monferrato":
			codice = "H677";
			break;
		case "Sala Bolognese":
			codice = "H678";
			break;
		case "Sala Comacina":
			codice = "H679";
			break;
		case "Sala Biellese":
			codice = "H681";
			break;
		case "Sala Baganza":
			codice = "H682";
			break;
		case "Sala Consilina":
			codice = "H683";
			break;
		case "Salbertrand":
			codice = "H684";
			break;
		case "Salento":
			codice = "H686";
			break;
		case "Salandra":
			codice = "H687";
			break;
		case "Salaparuta":
			codice = "H688";
			break;
		case "Salara":
			codice = "H689";
			break;
		case "Salasco":
			codice = "H690";
			break;
		case "Salassa":
			codice = "H691";
			break;
		case "Salcito":
			codice = "H693";
			break;
		case "Sale":
			codice = "H694";
			break;
		case "Sale Delle Langhe":
			codice = "H695";
			break;
		case "Sale Marasino":
			codice = "H699";
			break;
		case "Salemi":
			codice = "H700";
			break;
		case "Salerano Sul Lambro":
			codice = "H701";
			break;
		case "Salerano Canavese":
			codice = "H702";
			break;
		case "Salerno":
			codice = "H703";
			break;
		case "Sale San Giovanni":
			codice = "H704";
			break;
		case "Saletto":
			codice = "H705";
			break;
		case "Salgareda":
			codice = "H706";
			break;
		case "Sali Vercellese":
			codice = "H707";
			break;
		case "Salice Salentino":
			codice = "H708";
			break;
		case "Saliceto":
			codice = "H710";
			break;
		case "San Mauro Di Saline":
			codice = "H712";
			break;
		case "Salisano":
			codice = "H713";
			break;
		case "Salizzole":
			codice = "H714";
			break;
		case "Salle":
			codice = "H715";
			break;
		case "Salmour":
			codice = "H716";
			break;
		case "Salò":
			codice = "H717";
			break;
		case "Salorno":
			codice = "H719";
			break;
		case "Salsomaggiore Terme":
			codice = "H720";
			break;
		case "Saltara":
			codice = "H721";
			break;
		case "Saltrio":
			codice = "H723";
			break;
		case "Saludecio":
			codice = "H724";
			break;
		case "Saluggia":
			codice = "H725";
			break;
		case "Salussola":
			codice = "H726";
			break;
		case "Saluzzo":
			codice = "H727";
			break;
		case "Salve":
			codice = "H729";
			break;
		case "Savoia Di Lucania":
			codice = "H730";
			break;
		case "Salvirola":
			codice = "H731";
			break;
		case "Salvitelle":
			codice = "H732";
			break;
		case "Salza Irpina":
			codice = "H733";
			break;
		case "Salza Di Pinerolo":
			codice = "H734";
			break;
		case "Salzano":
			codice = "H735";
			break;
		case "Samarate":
			codice = "H736";
			break;
		case "Samassi":
			codice = "H738";
			break;
		case "Samatzai":
			codice = "H739";
			break;
		case "Sambuca Di Sicilia":
			codice = "H743";
			break;
		case "Sambuca Pistoiese":
			codice = "H744";
			break;
		case "Sambuci":
			codice = "H745";
			break;
		case "Sambuco":
			codice = "H746";
			break;
		case "Sammichele Di Bari":
			codice = "H749";
			break;
		case "Samolaco":
			codice = "H752";
			break;
		case "Samone":
			codice = "H753";// H754
			break;
		case "Sampeyre":
			codice = "H755";
			break;
		case "Samugheo":
			codice = "H756";
			break;
		case "Sanarica":
			codice = "H757";
			break;
		case "San Bartolomeo Val Cavargna":
			codice = "H760";
			break;
		case "San Bartolomeo Al Mare":
			codice = "H763";
			break;
		case "San Bartolomeo In Galdo":
			codice = "H764";
			break;
		case "San Basile":
			codice = "H765";
			break;
		case "San Basilio":
			codice = "H766";
			break;
		case "San Bassano":
			codice = "H767";
			break;
		case "San Bellino":
			codice = "H768";
			break;
		case "San Benedetto Del Tronto":
			codice = "H769";
			break;
		case "San Benedetto Belbo":
			codice = "H770";
			break;
		case "San Benedetto Po":
			codice = "H771";
			break;
		case "San Benedetto Dei Marsi":
			codice = "H772";
			break;
		case "San Benedetto In Perillis":
			codice = "H773";
			break;
		case "San Benedetto Ullano":
			codice = "H774";
			break;
		case "San Benigno Canavese":
			codice = "H775";
			break;
		case "San Bernardino Verbano":
			codice = "H777";
			break;
		case "San Biagio Platani":
			codice = "H778";
			break;
		case "San Biagio Saracinisco":
			codice = "H779";
			break;
		case "San Biagio Della Cima":
			codice = "H780";
			break;
		case "San Biagio Di Callalta":
			codice = "H781";
			break;
		case "San Biase":
			codice = "H782";
			break;
		case "San Bonifacio":
			codice = "H783";
			break;
		case "San Buono":
			codice = "H784";
			break;
		case "San Calogero":
			codice = "H785";
			break;
		case "San Candido":
			codice = "H786";
			break;
		case "San Canzian D'Isonzo":
			codice = "H787";
			break;
		case "San Carlo Canavese":
			codice = "H789";
			break;
		case "San Casciano Dei Bagni":
			codice = "H790";
			break;
		case "San Casciano In Val Di Pesa":
			codice = "H791";
			break;
		case "San Cataldo":
			codice = "H792";
			break;
		case "San Cesario Di Lecce":
			codice = "H793";
			break;
		case "San Cesario Sul Panaro":
			codice = "H794";
			break;
		case "San Chirico Nuovo":
			codice = "H795";
			break;
		case "San Chirico Raparo":
			codice = "H796";
			break;
		case "San Cipirello":
			codice = "H797";
			break;
		case "San Cipriano D'Aversa":
			codice = "H798";
			break;
		case "San Cipriano Po":
			codice = "H799";
			break;
		case "San Cipriano Picentino":
			codice = "H800";
			break;
		case "San Clemente":
			codice = "H801";
			break;
		case "San Colombano Certenoli":
			codice = "H802";
			break;
		case "San Colombano Al Lambro":
			codice = "H803";
			break;
		case "San Colombano Belmonte":
			codice = "H804";
			break;
		case "San Cono":
			codice = "H805";
			break;
		case "San Cosmo Albanese":
			codice = "H806";
			break;
		case "San Costantino Calabro":
			codice = "H807";
			break;
		case "San Costantino Albanese":
			codice = "H808";
			break;
		case "San Costanzo":
			codice = "H809";
			break;
		case "San Cristoforo":
			codice = "H810";
			break;
		case "San Damiano D'Asti":
			codice = "H811";
			break;
		case "San Damiano Macra":
			codice = "H812";
			break;
		case "San Damiano Al Colle":
			codice = "H814";
			break;
		case "San Daniele Po":
			codice = "H815";
			break;
		case "San Daniele Del Friuli":
			codice = "H816";
			break;
		case "San Demetrio Corone":
			codice = "H818";
			break;
		case "San Demetrio Nè Vestini":
			codice = "H819";
			break;
		case "San Didero":
			codice = "H820";
			break;
		case "Sandigliano":
			codice = "H821";
			break;
		case "San Donaci":
			codice = "H822";
			break;
		case "San Donà Di Piave":
			codice = "H823";
			break;
		case "San Donato Val Di Comino":
			codice = "H824";
			break;
		case "San Donato Di Ninea":
			codice = "H825";
			break;
		case "San Donato Di Lecce":
			codice = "H826";
			break;
		case "San Donato Milanese":
			codice = "H827";
			break;
		case "Sandrigo":
			codice = "H829";
			break;
		case "San Fedele Intelvi":
			codice = "H830";
			break;
		case "San Fele":
			codice = "H831";
			break;
		case "San Felice Del Molise":
			codice = "H833";
			break;
		case "San Felice A Cancello":
			codice = "H834";
			break;
		case "San Felice Sul Panaro":
			codice = "H835";
			break;
		case "San Felice Circeo":
			codice = "H836";
			break;
		case "San Felice Del Benaco":
			codice = "H838";
			break;
		case "San Ferdinando Di Puglia":
			codice = "H839";
			break;
		case "San Fermo Della Battaglia":
			codice = "H840";
			break;
		case "San Fili":
			codice = "H841";
			break;
		case "San Filippo Del Mela":
			codice = "H842";
			break;
		case "San Fior":
			codice = "H843";
			break;
		case "San Fiorano":
			codice = "H844";
			break;
		case "San Floriano Del Collio":
			codice = "H845";
			break;
		case "San Floro":
			codice = "H846";
			break;
		case "San Francesco Al Campo":
			codice = "H847";
			break;
		case "San Fratello":
			codice = "H850";
			break;
		case "Sanfrè":
			codice = "H851";
			break;
		case "Sanfront":
			codice = "H852";
			break;
		case "Sangano":
			codice = "H855";
			break;
		case "San Gavino Monreale":
			codice = "H856";
			break;
		case "San Gemini":
			codice = "H857";
			break;
		case "San Genesio Atesino":
			codice = "H858";
			break;
		case "San Genesio Ed Uniti":
			codice = "H859";
			break;
		case "San Gennaro Vesuviano":
			codice = "H860";
			break;
		case "San Germano Vercellese":
			codice = "H861";
			break;
		case "San Germano Chisone":
			codice = "H862";
			break;
		case "San Germano Dei Berici":
			codice = "H863";
			break;
		case "San Gervasio Bresciano":
			codice = "H865";
			break;
		case "San Giacomo Degli Schiavoni":
			codice = "H867";
			break;
		case "San Giacomo Filippo":
			codice = "H868";
			break;
		case "San Giacomo Delle Segnate":
			codice = "H870";
			break;
		case "Sangiano":
			codice = "H872";
			break;
		case "San Gillio":
			codice = "H873";
			break;
		case "San Gimignano":
			codice = "H875";
			break;
		case "San Ginesio":
			codice = "H876";
			break;
		case "Sangineto":
			codice = "H877";
			break;
		case "San Giorgio Monferrato":
			codice = "H878";
			break;
		case "San Giorgio A Liri":
			codice = "H880";
			break;
		case "San Giorgio Albanese":
			codice = "H881";
			break;
		case "San Giorgio Ionico":
			codice = "H882";
			break;
		case "San Giorgio Bigarello":
			codice = "H883";
			break;
		case "San Giorgio Su Legnano":
			codice = "H884";
			break;
		case "San Giorgio Di Lomellina":
			codice = "H885";
			break;
		case "San Giorgio Di Pesaro":
			codice = "H886";
			break;
		case "San Giorgio Piacentino":
			codice = "H887";
			break;
		case "San Giorgio Lucano":
			codice = "H888";
			break;
		case "San Giorgio Morgeto":
			codice = "H889";
			break;
		case "San Giorgio Della Richinvelda":
			codice = "H891";
			break;
		case "San Giorgio Delle Pertiche":
			codice = "H893";
			break;
		case "San Giorgio Del Sannio":
			codice = "H894";
			break;
		case "San Giorgio Di Nogaro":
			codice = "H895";
			break;
		case "San Giorgio Di Piano":
			codice = "H896";
			break;
		case "San Giorgio In Bosco":
			codice = "H897";
			break;
		case "San Giorgio La Molara":
			codice = "H898";
			break;
		case "San Giorgio Scarampi":
			codice = "H899";
			break;
		case "San Giorio Di Susa":
			codice = "H900";
			break;
		case "San Giovanni Valdarno":
			codice = "H901";
			break;
		case "San Giovanni Di Gerace":
			codice = "H903";
			break;
		case "San Giovanni Al Natisone":
			codice = "H906";
			break;
		case "San Giovanni A Piro":
			codice = "H907";
			break;
		case "San Giovanni Bianco":
			codice = "H910";
			break;
		case "San Giovanni D'Asso":
			codice = "H911";
			break;
		case "San Giovanni Del Dosso":
			codice = "H912";
			break;
		case "San Giovanni Gemini":
			codice = "H914";
			break;
		case "San Giovanni Ilarione":
			codice = "H916";
			break;
		case "San Giovanni Incarico":
			codice = "H917";
			break;
		case "San Giovanni In Croce":
			codice = "H918";
			break;
		case "San Giovanni In Fiore":
			codice = "H919";
			break;
		case "San Giovanni In Galdo":
			codice = "H920";
			break;
		case "San Giovanni In Marignano":
			codice = "H921";
			break;
		case "San Giovanni La Punta":
			codice = "H922";
			break;
		case "San Giovanni Lipioni":
			codice = "H923";
			break;
		case "San Giovanni Lupatoto":
			codice = "H924";
			break;
		case "San Giovanni Rotondo":
			codice = "H926";
			break;
		case "San Giuliano Del Sannio":
			codice = "H928";
			break;
		case "San Giuliano Di Puglia":
			codice = "H929";
			break;
		case "San Giuliano Milanese":
			codice = "H930";
			break;
		case "San Giuseppe Vesuviano":
			codice = "H931";
			break;
		case "San Giuseppe Jato":
			codice = "H933";
			break;
		case "San Giustino":
			codice = "H935";
			break;
		case "San Giusto Canavese":
			codice = "H936";
			break;
		case "San Godenzo":
			codice = "H937";
			break;
		case "San Gregorio Nelle Alpi":
			codice = "H938";
			break;
		case "San Gregorio Matese":
			codice = "H939";
			break;
		case "San Gregorio Di Catania":
			codice = "H940";
			break;
		case "San Gregorio D'Ippona":
			codice = "H941";
			break;
		case "San Gregorio Da Sassola":
			codice = "H942";
			break;
		case "San Gregorio Magno":
			codice = "H943";
			break;
		case "Sanguinetto":
			codice = "H944";
			break;
		case "San Lazzaro Di Savena":
			codice = "H945";
			break;
		case "San Leo":
			codice = "H949";
			break;
		case "San Leonardo":
			codice = "H951";
			break;
		case "San Leonardo In Passiria":
			codice = "H952";
			break;
		case "San Leucio Del Sannio":
			codice = "H953";
			break;
		case "San Lorenzello":
			codice = "H955";
			break;
		case "San Lorenzo Di Sebato":
			codice = "H956";
			break;
		case "San Lorenzo Al Mare":
			codice = "H957";
			break;
		case "San Lorenzo In Campo":
			codice = "H958";
			break;
		case "San Lorenzo":
			codice = "H959";
			break;
		case "San Lorenzo Bellizzi":
			codice = "H961";
			break;
		case "San Lorenzo Del Vallo":
			codice = "H962";
			break;
		case "San Lorenzo Isontino":
			codice = "H964";
			break;
		case "San Lorenzo In Banale":
			codice = "H966";
			break;
		case "San Lorenzo Maggiore":
			codice = "H967";
			break;
		case "San Lorenzo Nuovo":
			codice = "H969";
			break;
		case "San Luca":
			codice = "H970";
			break;
		case "San Lucido":
			codice = "H971";
			break;
		case "San Lupo":
			codice = "H973";
			break;
		case "Sanluri":
			codice = "H974";
			break;
		case "San Mango Sul Calore":
			codice = "H975";
			break;
		case "San Mango D'Aquino":
			codice = "H976";
			break;
		case "San Mango Piemonte":
			codice = "H977";
			break;
		case "San Marcellino":
			codice = "H978";
			break;
		case "San Marcello":
			codice = "H979";
			break;
		case "San Marcello Pistoiese":
			codice = "H980";
			break;
		case "San Marco Argentano":
			codice = "H981";
			break;
		case "San Marco D'Alunzio":
			codice = "H982";
			break;
		case "San Marco Dei Cavoti":
			codice = "H984";
			break;
		case "San Marco In Lamis":
			codice = "H985";
			break;
		case "San Marco La Catola":
			codice = "H986";
			break;
		case "San Martino Alfieri":
			codice = "H987";
			break;
		case "San Martino In Badia":
			codice = "H988";
			break;
		case "San Martino In Passiria":
			codice = "H989";
			break;
		case "San Martino In Pensilis":
			codice = "H990";
			break;
		case "San Martino Sulla Marruccina":
			codice = "H991";
			break;
		case "San Martino Di Finita":
			codice = "H992";
			break;
		case "San Martino D'Agri":
			codice = "H994";
			break;
		case "San Martino Di Venezze":
			codice = "H996";
			break;
		case "San Martino Canavese":
			codice = "H997";
			break;
		case "San Martino Al Tagliamento":
			codice = "H999";
			break;
		case "San Martino Sannita":
			codice = "I002";
			break;
		case "San Martino Buon Albergo":
			codice = "I003";
			break;
		case "San Martino Dall'Argine":
			codice = "I005";
			break;
		case "San Martino Del Lago":
			codice = "I007";
			break;
		case "San Martino Di Lupari":
			codice = "I008";
			break;
		case "San Martino In Rio":
			codice = "I011";
			break;
		case "San Martino In Strada":
			codice = "I012";
			break;
		case "San Martino Siccomario":
			codice = "I014";
			break;
		case "San Martino Valle Caudina":
			codice = "I016";
			break;
		case "San Marzano Oliveto":
			codice = "I017";
			break;
		case "San Marzano Di San Giuseppe":
			codice = "I018";
			break;
		case "San Marzano Sul Sarno":
			codice = "I019";
			break;
		case "San Massimo":
			codice = "I023";
			break;
		case "San Maurizio Canavese":
			codice = "I024";
			break;
		case "San Maurizio D'Opaglio":
			codice = "I025";
			break;
		case "San Mauro Marchesato":
			codice = "I026";
			break;
		case "San Mauro Pascoli":
			codice = "I027";
			break;
		case "San Mauro Castelverde":
			codice = "I028";
			break;
		case "San Mauro Forte":
			codice = "I029";
			break;
		case "San Mauro Torinese":
			codice = "I030";
			break;
		case "San Mauro Cilento":
			codice = "I031";
			break;
		case "San Mauro La Bruca":
			codice = "I032";
			break;
		case "San Michele Di Serino":
			codice = "I034";
			break;
		case "San Michele Di Ganzaria":
			codice = "I035";
			break;
		case "San Michele Mondovì":
			codice = "I037";
			break;
		case "San Michele Al Tagliamento":
			codice = "I040";
			break;
		case "San Michele All'Adige":
			codice = "I042";
			break;
		case "San Michele Salentino":
			codice = "I045";
			break;
		case "San Miniato":
			codice = "I046";
			break;
		case "San Nazario":
			codice = "I047";
			break;
		case "Sannazzaro Dè Burgondi":
			codice = "I048";
			break;
		case "San Nazzaro":
			codice = "I049";
			break;
		case "San Nazzaro Val Cavargna":
			codice = "I051";
			break;
		case "San Nazzaro Sesia":
			codice = "I052";
			break;
		case "Sannicandro Di Bari":
			codice = "I053";
			break;
		case "San Nicandro Garganico":
			codice = "I054";
			break;
		case "San Nicola La Strada":
			codice = "I056";
			break;
		case "San Nicola Dell'Alto":
			codice = "I057";
			break;
		case "San Nicola Da Crissa":
			codice = "I058";
			break;
		case "Sannicola":
			codice = "I059";
			break;
		case "San Nicola Arcella":
			codice = "I060";
			break;
		case "San Nicola Baronia":
			codice = "I061";
			break;
		case "San Nicola Manfredi":
			codice = "I062";
			break;
		case "San Nicolò Di Comelico":
			codice = "I063";
			break;
		case "San Pancrazio":
			codice = "I065";
			break;
		case "San Pancrazio Salentino":
			codice = "I066";
			break;
		case "San Paolo Di Jesi":
			codice = "I071";
			break;
		case "San Paolo Di Civitate":
			codice = "I072";
			break;
		case "San Paolo Bel Sito":
			codice = "I073";
			break;
		case "San Paolo Cervo":
			codice = "I074";
			break;
		case "San Paolo Solbrito":
			codice = "I076";
			break;
		case "San Pellegrino Terme":
			codice = "I079";
			break;
		case "San Pier D'Isonzo":
			codice = "I082";
			break;
		case "San Pier Niceto":
			codice = "I084";
			break;
		case "San Piero A Sieve":
			codice = "I085";
			break;
		case "San Piero Patti":
			codice = "I086";
			break;
		case "San Pietro Di Cadore":
			codice = "I088";
			break;
		case "San Pietro Al Tanagro":
			codice = "I089";
			break;
		case "San Pietro Val Lemina":
			codice = "I090";
			break;
		case "San Pietro Al Natisone":
			codice = "I092";
			break;
		case "San Pietro A Maida":
			codice = "I093";
			break;
		case "San Pietro Apostolo":
			codice = "I095";
			break;
		case "San Pietro Avellana":
			codice = "I096";
			break;
		case "San Pietro Clarenza":
			codice = "I098";
			break;
		case "San Pietro Di Caridà":
			codice = "I102";
			break;
		case "San Pietro Di Feletto":
			codice = "I103";
			break;
		case "San Pietro Di Morubio":
			codice = "I105";
			break;
		case "San Pietro In Gu":
			codice = "I107";
			break;
		case "San Pietro In Amantea":
			codice = "I108";
			break;
		case "San Pietro In Cariano":
			codice = "I109";
			break;
		case "San Pietro In Casale":
			codice = "I110";
			break;
		case "San Pietro Infine":
			codice = "I113";
			break;
		case "San Pietro In Guarano":
			codice = "I114";
			break;
		case "San Pietro In Lama":
			codice = "I115";
			break;
		case "San Pietro Mosezzo":
			codice = "I116";
			break;
		case "San Pietro Mussolino":
			codice = "I117";
			break;
		case "San Pietro Vernotico":
			codice = "I119";
			break;
		case "San Pietro Viminario":
			codice = "I120";
			break;
		case "San Pio Delle Camere":
			codice = "I121";
			break;
		case "San Polo Matese":
			codice = "I122";
			break;
		case "San Polo D'Enza":
			codice = "I123";
			break;
		case "San Polo Di Piave":
			codice = "I124";
			break;
		case "San Polo Dei Cavalieri":
			codice = "I125";
			break;
		case "San Ponso":
			codice = "I126";
			break;
		case "San Possidonio":
			codice = "I128";
			break;
		case "San Potito Ultra":
			codice = "I129";
			break;
		case "San Potito Sannitico":
			codice = "I130";
			break;
		case "San Prisco":
			codice = "I131";
			break;
		case "San Procopio":
			codice = "I132";
			break;
		case "San Prospero":
			codice = "I133";
			break;
		case "San Quirico D'Orcia":
			codice = "I135";
			break;
		case "San Quirino":
			codice = "I136";
			break;
		case "San Raffaele Cimena":
			codice = "I137";
			break;
		case "Sanremo":
			codice = "I138";
			break;
		case "San Roberto":
			codice = "I139";
			break;
		case "San Rocco Al Porto":
			codice = "I140";
			break;
		case "San Romano In Garfagnana":
			codice = "I142";
			break;
		case "San Rufo":
			codice = "I143";
			break;
		case "San Salvatore Monferrato":
			codice = "I144";
			break;
		case "San Salvatore Telesino":
			codice = "I145";
			break;
		case "San Salvatore Di Fitalia":
			codice = "I147";
			break;
		case "San Salvo":
			codice = "I148";
			break;
		case "San Sebastiano Curone":
			codice = "I150";
			break;
		case "San Sebastiano Al Vesuvio":
			codice = "I151";
			break;
		case "San Sebastiano Da Po":
			codice = "I152";
			break;
		case "San Secondo Parmense":
			codice = "I153";
			break;
		case "San Secondo Di Pinerolo":
			codice = "I154";
			break;
		case "Sansepolcro":
			codice = "I155";
			break;
		case "San Severino Marche":
			codice = "I156";
			break;
		case "San Severino Lucano":
			codice = "I157";
			break;
		case "San Severo":
			codice = "I158";
			break;
		case "San Siro":
			codice = "I162";
			break;
		case "San Sossio Baronia":
			codice = "I163";
			break;
		case "San Sostene":
			codice = "I164";
			break;
		case "San Sosti":
			codice = "I165";
			break;
		case "San Sperate":
			codice = "I166";
			break;
		case "Santa Brigida":
			codice = "I168";
			break;
		case "Santa Caterina Villarmosa":
			codice = "I169";
			break;
		case "Santa Caterina Dello Ionio":
			codice = "I170";
			break;
		case "Santa Caterina Albanese":
			codice = "I171";
			break;
		case "Santa Cesarea Terme":
			codice = "I172";
			break;
		case "Santa Cristina Valgardena":
			codice = "I173";
			break;
		case "Santa Cristina Gela":
			codice = "I174";
			break;
		case "Santa Cristina E Bissone":
			codice = "I175";
			break;
		case "Santa Cristina D'Aspromonte":
			codice = "I176";
			break;
		case "Santa Croce Sull'Arno":
			codice = "I177";
			break;
		case "Santa Croce Camerina":
			codice = "I178";
			break;
		case "Santa Croce Del Sannio":
			codice = "I179";
			break;
		case "Santa Croce Di Magliano":
			codice = "I181";
			break;
		case "Santadi":
			codice = "I182";
			break;
		case "Santa Domenica Talao":
			codice = "I183";
			break;
		case "Santa Domenica Vittoria":
			codice = "I184";
			break;
		case "Santa Elisabetta":
			codice = "I185";
			break;
		case "Santa Fiora":
			codice = "I187";
			break;
		case "Santa Flavia":
			codice = "I188";
			break;
		case "Sant'Agapito":
			codice = "I189";
			break;
		case "Sant'Agata Fossili":
			codice = "I190";
			break;
		case "Sant'Agata Bolognese":
			codice = "I191";
			break;
		case "Sant'Agata Di Esaro":
			codice = "I192";
			break;
		case "Sant'Agata Di Puglia":
			codice = "I193";
			break;
		case "Sant'Agata Sul Santerno":
			codice = "I196";
			break;
		case "Sant'Agata Dè Goti":
			codice = "I197";
			break;
		case "Sant'Agata Del Bianco":
			codice = "I198";
			break;
		case "Sant'Agata Di Militello":
			codice = "I199";
			break;
		case "Sant'Agata Feltria":
			codice = "I201";
			break;
		case "Sant'Agata Li Battiati":
			codice = "I202";
			break;
		case "Santa Giulietta":
			codice = "I203";
			break;
		case "Santa Giusta":
			codice = "I205";
			break;
		case "Santa Giustina":
			codice = "I206";
			break;
		case "Santa Giustina In Colle":
			codice = "I207";
			break;
		case "Sant'Agnello":
			codice = "I208";
			break;
		case "Sant'Agostino":
			codice = "I209";
			break;
		case "Sant'Albano Stura":
			codice = "I210";
			break;
		case "Sant'Alessio Con Vialone":
			codice = "I213";
			break;
		case "Sant'Alessio In Aspromonte":
			codice = "I214";
			break;
		case "Sant'Alessio Siculo":
			codice = "I215";
			break;
		case "Sant'Alfio":
			codice = "I216";
			break;
		case "Santa Luce":
			codice = "I217";
			break;
		case "Santa Lucia Di Serino":
			codice = "I219";
			break;
		case "Santa Lucia Del Mela":
			codice = "I220";
			break;
		case "Santa Lucia Di Piave":
			codice = "I221";
			break;
		case "Santa Margherita Di Belice":
			codice = "I224";
			break;
		case "Santa Margherita Ligure":
			codice = "I225";
			break;
		case "Santa Margherita D'Adige":
			codice = "I226";
			break;
		case "Santa Margherita Di Staffora":
			codice = "I230";
			break;
		case "Santa Maria A Monte":
			codice = "I232";
			break;
		case "Santa Maria A Vico":
			codice = "I233";
			break;
		case "Santa Maria Capua Vetere":
			codice = "I234";
			break;
		case "Santa Maria Della Versa":
			codice = "I237";
			break;
		case "Santa Maria Del Molise":
			codice = "I238";
			break;
		case "Santa Maria Di Licodia":
			codice = "I240";
			break;
		case "Santa Maria Di Sala":
			codice = "I242";
			break;
		case "Santa Maria Hoè":
			codice = "I243";
			break;
		case "Santa Maria Imbaro":
			codice = "I244";
			break;
		case "Santa Maria La Fossa":
			codice = "I247";
			break;
		case "Santa Maria La Longa":
			codice = "I248";
			break;
		case "Santa Maria Maggiore":
			codice = "I249";
			break;
		case "Santa Maria Nuova":
			codice = "I251";
			break;
		case "Santa Marina":
			codice = "I253";
			break;
		case "Santa Marina Salina":
			codice = "I254";
			break;
		case "Santa Marinella":
			codice = "I255";
			break;
		case "Sant'Ambrogio Sul Garigliano":
			codice = "I256";
			break;
		case "Sant'Ambrogio Di Torino":
			codice = "I258";
			break;
		case "Sant'Ambrogio Di Valpolicella":
			codice = "I259";
			break;
		case "Santomenna":
			codice = "I26o";
			break;
		case "San Tammaro":
			codice = "I261";
			break;
		case "Sant'Anastasia":
			codice = "I262";
			break;
		case "Sant'Anatolia Di Narco":
			codice = "I263";
			break;
		case "Sant'Andrea Di Conza":
			codice = "I264";
			break;
		case "Sant'Andrea Del Garigliano":
			codice = "I265";
			break;
		case "Sant'Andrea Apostolo Dello Ionio":
			codice = "I266";
			break;
		case "Sant'Andrea Frius":
			codice = "I271";
			break;
		case "Sant'Angelo D'Alife":
			codice = "I273";
			break;
		case "Sant'Angelo Lodigiano":
			codice = "I274";
			break;
		case "Sant'Angelo Di Piove Di Sacco":
			codice = "I275";
			break;
		case "Sant'Angelo Lomellina":
			codice = "I276";
			break;
		case "Sant'Angelo A Cupolo":
			codice = "I277";
			break;
		case "Sant'Angelo A Fasanella":
			codice = "I278";
			break;
		case "Sant'Angelo All'Esca":
			codice = "I279";
			break;
		case "Sant'Angelo A Scala":
			codice = "I280";
			break;
		case "Sant'Angelo Dei Lombardi":
			codice = "I281";
			break;
		case "Sant'Angelo Del Pesco":
			codice = "I282";
			break;
		case "Sant'Angelo Di Brolo":
			codice = "I283";
			break;
		case "Sant'Angelo Romano":
			codice = "I284";
			break;
		case "Sant'Angelo In Lizzola":
			codice = "I285";
			break;
		case "Sant'Angelo In Pontano":
			codice = "I286";
			break;
		case "Sant'Angelo In Vado":
			codice = "I287";
			break;
		case "Sant'Angelo Le Fratte":
			codice = "I288";
			break;
		case "Sant'Angelo Limosano":
			codice = "I289";
			break;
		case "Sant'Angelo Mucodicearo":
			codice = "I290";
			break;
		case "Santa Ninfa":
			codice = "I291";
			break;
		case "Sant'Anna D'Alfaedo":
			codice = "I292";
			break;
		case "Sant'Antimo":
			codice = "I293";
			break;
		case "Sant'Antioco":
			codice = "I294";
			break;
		case "Sant'Antonino Di Susa":
			codice = "I296";
			break;
		case "Sant'Antonio Abate":
			codice = "I300";
			break;
		case "Santa Paolina":
			codice = "I301";
			break;
		case "Santarcangelo Di Romagna":
			codice = "I304";
			break;
		case "Sant'Arcangelo":
			codice = "I305";
			break;
		case "Sant'Arpino":
			codice = "I306";
			break;
		case "Sant'Arsenio":
			codice = "I307";
			break;
		case "Santa Severina":
			codice = "I308";
			break;
		case "Santa Sofia D'Epiro":
			codice = "I309";
			break;
		case "Santa Sofia":
			codice = "I310";
			break;
		case "Santa Teresa Di Riva":
			codice = "I311";
			break;
		case "Santa Teresa Gallura":
			codice = "I312";
			break;
		case "Santa Venerina":
			codice = "I314";
			break;
		case "Santa Vittoria In Matenano":
			codice = "I315";
			break;
		case "Santa Vittoria D'Alba":
			codice = "I316";
			break;
		case "Sant'Egidio Del Monte Albino":
			codice = "I317";
			break;
		case "Sant'Egidio Alla Vibrata":
			codice = "I318";
			break;
		case "Sant'Elena":
			codice = "I319";
			break;
		case "Sant'Elia A Pianisi":
			codice = "I320";
			break;
		case "Sant'Elia Fiumerapido":
			codice = "I321";
			break;
		case "Sant'Elpidio A Mare":
			codice = "I324";
			break;
		case "Sante Marie":
			codice = "I326";
			break;
		case "Santena":
			codice = "I327";
			break;
		case "San Teodoro":
			codice = "I328";// I329
			break;
		case "Santeramo In Colle":
			codice = "I330";
			break;
		case "Sant'Eufemia A Maiella":
			codice = "I332";
			break;
		case "Sant'Eufemia D'Aspromonte":
			codice = "I333";
			break;
		case "Sant'Eusanio Del Sangro":
			codice = "I335";
			break;
		case "Sant'Eusanio Forconese":
			codice = "I336";
			break;
		case "Santhià":
			codice = "I337";
			break;
		case "Santi Cosma E Damiano":
			codice = "I339";
			break;
		case "Sant'Ilario Dello Ionio":
			codice = "I341";
			break;
		case "Sant'Ilario D'Enza":
			codice = "I342";
			break;
		case "Sant'Ippolito":
			codice = "I344";
			break;
		case "Sant'Olcese":
			codice = "I346";
			break;
		case "San Tomaso Agordino":
			codice = "I347";
			break;
		case "Sant'Omero":
			codice = "I348";
			break;
		case "Sant'Onofrio":
			codice = "I350";
			break;
		case "Santopadre":
			codice = "I351";
			break;
		case "Sant'Oreste":
			codice = "I352";
			break;
		case "Santorso":
			codice = "I353";
			break;
		case "Sant'Orsola Terme":
			codice = "I354";
			break;
		case "Santo Stefano Quisquina":
			codice = "I356";
			break;
		case "Santo Stefano Del Sole":
			codice = "I357";
			break;
		case "Santo Stefano Di Rogliano":
			codice = "I359";
			break;
		case "Santo Stefano Di Sessanio":
			codice = "I360";
			break;
		case "Santo Stefano Ticino":
			codice = "I361";
			break;
		case "Santo Stefano Lodigiano":
			codice = "I362";
			break;
		case "Santo Stefano Di Magra":
			codice = "I363";
			break;
		case "Santo Stefano Al Mare":
			codice = "I365";
			break;
		case "Santo Stefano Belbo":
			codice = "I367";
			break;
		case "Santo Stefano D'Aveto":
			codice = "I368";
			break;
		case "Santo Stefano Di Camastra":
			codice = "I370";
			break;
		case "Santo Stefano In Aspromonte":
			codice = "I371";
			break;
		case "Santo Stefano Roero":
			codice = "I372";
			break;
		case "San Stino Di Livenza":
			codice = "I373";
			break;
		case "Santu Lussurgiu":
			codice = "I374";
			break;
		case "Sant'Urbano":
			codice = "I375";
			break;
		case "San Valentino In Abruzzo Citeriore":
			codice = "I376";
			break;
		case "San Valentino Torio":
			codice = "I377";
			break;
		case "San Venanzo":
			codice = "I381";
			break;
		case "San Vendemiano":
			codice = "I382";
			break;
		case "San Vero Milis":
			codice = "I384";
			break;
		case "San Vincenzo La Costa":
			codice = "I388";
			break;
		case "San Vincenzo Valle Roveto":
			codice = "I389";
			break;
		case "San Vincenzo":
			codice = "I390";
			break;
		case "San Vitaliano":
			codice = "I391";
			break;
		case "San Vito Di Cadore":
			codice = "I392";
			break;
		case "San Vito Sullo Ionio":
			codice = "I393";
			break;
		case "San Vito Chietino":
			codice = "I394";
			break;
		case "San Vito Dei Normanni":
			codice = "I396";
			break;
		case "San Vito Romano":
			codice = "I400";
			break;
		case "San Vito Di Leguzzano":
			codice = "I401";
			break;
		case "San Vito":
			codice = "I402";
			break;
		case "San Vito Al Tagliamento":
			codice = "I403";
			break;
		case "San Vito Al Torre":
			codice = "I404";
			break;
		case "San Vito Di Fagagna":
			codice = "I405";
			break;
		case "San Vito Lo Capo":
			codice = "I407";
			break;
		case "San Vittore Del Lazio":
			codice = "I408";
			break;
		case "San Vittore Olona":
			codice = "I409";
			break;
		case "Sanza":
			codice = "I410";
			break;
		case "Sanzeno":
			codice = "I411";
			break;
		case "San Zeno Naviglio":
			codice = "I412";
			break;
		case "San Zeno Di Montagna":
			codice = "I414";
			break;
		case "San Zenone Al Lambro":
			codice = "I415";
			break;
		case "San Zenone Al Po":
			codice = "I416";
			break;
		case "San Zenone Degli Ezzelini":
			codice = "I417";
			break;
		case "Saonara":
			codice = "I418";
			break;
		case "Saponara":
			codice = "I420";
			break;
		case "Sappada":
			codice = "I421";
			break;
		case "Sapri":
			codice = "I422";
			break;
		case "Saracena":
			codice = "I423";
			break;
		case "Saracinesco":
			codice = "I424";
			break;
		case "Sarcedo":
			codice = "I425";
			break;
		case "Sarconi":
			codice = "I426";
			break;
		case "Sardara":
			codice = "I428";
			break;
		case "Sardigliano":
			codice = "I429";
			break;
		case "Sarego":
			codice = "I430";
			break;
		case "Sarentino":
			codice = "I431";
			break;
		case "Sarezzano":
			codice = "I432";
			break;
		case "Sarezzo":
			codice = "I433";
			break;
		case "Sarmato":
			codice = "I434";
			break;
		case "Sarmede":
			codice = "I435";
			break;
		case "Sarnano":
			codice = "I436";
			break;
		case "Sarnico":
			codice = "I437";
			break;
		case "Sarno":
			codice = "I438";
			break;
		case "Sarnonico":
			codice = "I439";
			break;
		case "Saronno":
			codice = "I441";
			break;
		case "Sarre":
			codice = "I442";
			break;
		case "Sarroch":
			codice = "I443";
			break;
		case "Sarsina":
			codice = "I444";
			break;
		case "Sarteano":
			codice = "I445";
			break;
		case "Sartirana Lomellina":
			codice = "I447";
			break;
		case "Sarule":
			codice = "I448";
			break;
		case "Sarzana":
			codice = "I449";
			break;
		case "Sassano":
			codice = "I451";
			break;
		case "Sassari":
			codice = "I452";
			break;
		case "Sassello":
			codice = "I453";
			break;
		case "Sassetta":
			codice = "I454";
			break;
		case "Sassinoro":
			codice = "I455";
			break;
		case "Sasso Di Castalda":
			codice = "I457";
			break;
		case "Sassocorvaro":
			codice = "I459";
			break;
		case "Sassofeltrio":
			codice = "I460";
			break;
		case "Sassoferrato":
			codice = "I461";
			break;
		case "Sassuolo":
			codice = "I462";
			break;
		case "Satriano":
			codice = "I463";
			break;
		case "Sauris":
			codice = "I464";
			break;
		case "Sauze Di Cesana":
			codice = "I465";
			break;
		case "Sauze D'Oulcodice":
			codice = "I466";
			break;
		case "Sava":
			codice = "I467";
			break;
		case "Savelli":
			codice = "I468";
			break;
		case "Saviano":
			codice = "I469";
			break;
		case "Savigliano":
			codice = "I470";
			break;
		case "Savignano Irpino":
			codice = "I471";
			break;
		case "Savignano Sul Rubicone":
			codice = "I472";
			break;
		case "Savignano Sul Panaro":
			codice = "I473";
			break;
		case "Savigno":
			codice = "I474";
			break;
		case "Savignone":
			codice = "I475";
			break;
		case "Saviore Dell'Adamello":
			codice = "I476";
			break;
		case "Savoca":
			codice = "I477";
			break;
		case "Savogna":
			codice = "I478";
			break;
		case "Savogna D'Isonzo":
			codice = "I479";
			break;
		case "Savona":
			codice = "I480";
			break;
		case "Scafa":
			codice = "I482";
			break;
		case "Scafati":
			codice = "I483";
			break;
		case "Scagnello":
			codice = "I484";
			break;
		case "Scala Coeli":
			codice = "I485";
			break;
		case "Scala":
			codice = "I486";
			break;
		case "Scaldasole":
			codice = "I487";
			break;
		case "Scalea":
			codice = "I489";
			break;
		case "Scalenghe":
			codice = "I490";
			break;
		case "Scaletta Zanclea":
			codice = "I492";
			break;
		case "Scampitella":
			codice = "I493";
			break;
		case "Scandale":
			codice = "I494";
			break;
		case "Scandiano":
			codice = "I496";
			break;
		case "Scandolara Ravara":
			codice = "I497";
			break;
		case "Scandolara Ripa D'Oglio":
			codice = "I498";
			break;
		case "Scandriglia":
			codice = "I499";
			break;
		case "Scanno":
			codice = "I501";
			break;
		case "Scano Di Montiferro":
			codice = "I503";
			break;
		case "Scansano":
			codice = "I504";
			break;
		case "Scanzorosciate":
			codice = "I506";
			break;
		case "Scapoli":
			codice = "I507";
			break;
		case "Scarlino":
			codice = "I510";
			break;
		case "Scarmagno":
			codice = "I511";
			break;
		case "Scarnafigi":
			codice = "I512";
			break;
		case "Scarperia":
			codice = "I514";
			break;
		case "Scena":
			codice = "I519";
			break;
		case "Scerni":
			codice = "I520";
			break;
		case "Scheggia E Pascelupo":
			codice = "I522";
			break;
		case "Scheggino":
			codice = "I523";
			break;
		case "Schiavi Di Abruzzo":
			codice = "I526";
			break;
		case "Schiavon":
			codice = "I527";
			break;
		case "Schignano":
			codice = "I529";
			break;
		case "Schilpario":
			codice = "I530";
			break;
		case "Schio":
			codice = "I531";
			break;
		case "Schivenoglia":
			codice = "I532";
			break;
		case "Sciacca":
			codice = "I533";
			break;
		case "Sciara":
			codice = "I534";
			break;
		case "Scicli":
			codice = "I535";
			break;
		case "Scido":
			codice = "I536";
			break;
		case "Scilla":
			codice = "I537";
			break;
		case "Scillato":
			codice = "I538";
			break;
		case "Sciolze":
			codice = "I539";
			break;
		case "Scisciano":
			codice = "I540";
			break;
		case "Sclafani Bagni":
			codice = "I541";
			break;
		case "Scontrone":
			codice = "I543";
			break;
		case "Scopa":
			codice = "I544";
			break;
		case "Scopello":
			codice = "I545";
			break;
		case "Scoppito":
			codice = "I546";
			break;
		case "Scordia":
			codice = "I548";
			break;
		case "Scorrano":
			codice = "I549";
			break;
		case "Scorzè":
			codice = "I551";
			break;
		case "Scurcola Marsicana":
			codice = "I553";
			break;
		case "Scurelle":
			codice = "I554";
			break;
		case "Scurzolengo":
			codice = "I555";
			break;
		case "Seborga":
			codice = "I556";
			break;
		case "Secinaro":
			codice = "I558";
			break;
		case "Seclì":
			codice = "I559";
			break;
		case "Secugnago":
			codice = "I561";
			break;
		case "Sedegliano":
			codice = "I562";
			break;
		case "Sedico":
			codice = "I563";
			break;
		case "Sedilo":
			codice = "I564";
			break;
		case "Sedini":
			codice = "I565";
			break;
		case "Sedriano":
			codice = "I566";
			break;
		case "Sedrina":
			codice = "I567";
			break;
		case "Sefro":
			codice = "I569";
			break;
		case "Segariu":
			codice = "I570";
			break;
		case "Seggiano":
			codice = "I571";
			break;
		case "Segni":
			codice = "I573";
			break;
		case "Segonzano":
			codice = "I576";
			break;
		case "Segrate":
			codice = "I577";
			break;
		case "Segusino":
			codice = "I578";
			break;
		case "Selargius":
			codice = "I580";
			break;
		case "Selci":
			codice = "I581";
			break;
		case "Selegas":
			codice = "I582";
			break;
		case "Sellano":
			codice = "I585";
			break;
		case "Sellero":
			codice = "I588";
			break;
		case "Sellia":
			codice = "I589";
			break;
		case "Sellia Marina":
			codice = "I590";
			break;
		case "Selva Di Val Gardena":
			codice = "I591";
			break;
		case "Selva Di Cadore":
			codice = "I592";
			break;
		case "Selva Dei Molini":
			codice = "I593";
			break;
		case "Selva Di Progno":
			codice = "I594";
			break;
		case "Selvazzano Dentro":
			codice = "I595";
			break;
		case "Selve Marcone":
			codice = "I596";
			break;
		case "Selvino":
			codice = "I597";
			break;
		case "Semestene":
			codice = "I598";
			break;
		case "Semiana":
			codice = "I599";
			break;
		case "Seminara":
			codice = "I600";
			break;
		case "Semproniano":
			codice = "I601";
			break;
		case "Senago":
			codice = "I602";
			break;
		case "Senale-San Felice":
			codice = "I603";
			break;
		case "Senales":
			codice = "I604";
			break;
		case "Seneghe":
			codice = "I605";
			break;
		case "Senerchia":
			codice = "I606";
			break;
		case "Seniga":
			codice = "I607";
			break;
		case "Senigallia":
			codice = "I608";
			break;
		case "Senis":
			codice = "I609";
			break;
		case "Senise":
			codice = "I610";
			break;
		case "Senna Comasco":
			codice = "I611";
			break;
		case "Senna Lodigiana":
			codice = "I612";
			break;
		case "Sennariolo":
			codice = "I613";
			break;
		case "Sennori":
			codice = "I614";
			break;
		case "Senorbì":
			codice = "I615";
			break;
		case "Sepino":
			codice = "I618";
			break;
		case "Seppiana":
			codice = "I619";
			break;
		case "Sequals":
			codice = "I621";
			break;
		case "Seravezza":
			codice = "I622";
			break;
		case "Serdiana":
			codice = "I624";
			break;
		case "Seregno":
			codice = "I625";
			break;
		case "Seren Del Grappa":
			codice = "I626";
			break;
		case "Sergnano":
			codice = "I627";
			break;
		case "Seriate":
			codice = "I628";
			break;
		case "Serina":
			codice = "I629";
			break;
		case "Serino":
			codice = "I630";
			break;
		case "Serle":
			codice = "I631";
			break;
		case "Sermide E Felonica":
			codice = "I632";
			break;
		case "Sirmione":
			codice = "I633";
			break;
		case "Sermoneta":
			codice = "I634";
			break;
		case "Sernaglia Della Battaglia":
			codice = "I635";
			break;
		case "Sernio":
			codice = "I636";
			break;
		case "Serole":
			codice = "I637";
			break;
		case "Serra San Bruno":
			codice = "I639";
			break;
		case "Serra Riccò":
			codice = "I640";
			break;
		case "Serracapriola":
			codice = "I641";
			break;
		case "Serra D'Aiello":
			codice = "I642";
			break;
		case "Serra Dè Conti":
			codice = "I643";
			break;
		case "Serradifalco":
			codice = "I644";
			break;
		case "Serralunga Di Crea":
			codice = "I645";
			break;
		case "Serralunga D'Alba":
			codice = "I646";
			break;
		case "Serramanna":
			codice = "I647";
			break;
		case "Serramezzana":
			codice = "I648";
			break;
		case "Serramonacesca":
			codice = "I649";
			break;
		case "Serra Pedace":
			codice = "I650";
			break;
		case "Serrapetrona":
			codice = "I651";
			break;
		case "Serrara Fontana":
			codice = "I652";
			break;
		case "Serra San Quirico":
			codice = "I653";
			break;
		case "Serra Sant'Abbondio":
			codice = "I654";
			break;
		case "Serrastretta":
			codice = "I655";
			break;
		case "Serrata":
			codice = "I656";
			break;
		case "Serravalle Scrivia":
			codice = "I657";
			break;
		case "Serravalle Langhe":
			codice = "I659";
			break;
		case "Serravalle Pistoiese":
			codice = "I660";
			break;
		case "Serravalle Di Chienti":
			codice = "I661";
			break;
		case "Serravalle A Po":
			codice = "I662";
			break;
		case "Serravalle Sesia":
			codice = "I663";
			break;
		case "Serre":
			codice = "I666";
			break;
		case "Serrenti":
			codice = "I667";
			break;
		case "Serri":
			codice = "I668";
			break;
		case "Serrone":
			codice = "I669";
			break;
		case "Serrungarina":
			codice = "I670";
			break;
		case "Sersale":
			codice = "I671";
			break;
		case "Sovramonte":
			codice = "I673";
			break;
		case "Sessa Aurunca":
			codice = "I676";
			break;
		case "Sessa Cilento":
			codice = "I677";
			break;
		case "Sessame":
			codice = "I678";
			break;
		case "Sessano Del Molise":
			codice = "I679";
			break;
		case "Sestino":
			codice = "I681";
			break;
		case "Sesto Campano":
			codice = "I682";
			break;
		case "Sesto Ed Uniti":
			codice = "I683";
			break;
		case "Sesto Fiorentino":
			codice = "I684";
			break;
		case "Sesto Al Reghena":
			codice = "I686";
			break;
		case "Sesto":
			codice = "I687";
			break;
		case "Sesto Calende":
			codice = "I688";
			break;
		case "Sestola":
			codice = "I689";
			break;
		case "Sesto San Giovanni":
			codice = "I690";
			break;
		case "Sestriere":
			codice = "I692";
			break;
		case "Sestri Levante":
			codice = "I693";
			break;
		case "Sestu":
			codice = "I695";
			break;
		case "Settala":
			codice = "I696";
			break;
		case "Settefrati":
			codice = "I697";
			break;
		case "Settime":
			codice = "I698";
			break;
		case "Settimo San Pietro":
			codice = "I699";
			break;
		case "Settimo Milanese":
			codice = "I700";
			break;
		case "Settimo Rottaro":
			codice = "I701";
			break;
		case "Settimo Vittone":
			codice = "I702";
			break;
		case "Settimo Torinese":
			codice = "I703";
			break;
		case "Settingiano":
			codice = "I704";
			break;
		case "Setzu":
			codice = "I705";
			break;
		case "Seui":
			codice = "I706";
			break;
		case "Seulo":
			codice = "I707";
			break;
		case "Seveso":
			codice = "I709";
			break;
		case "Sezzadio":
			codice = "I711";
			break;
		case "Sezze":
			codice = "I712";
			break;
		case "Sfruz":
			codice = "I714";
			break;
		case "Sgonico":
			codice = "I715";
			break;
		case "Sgurgola":
			codice = "I716";
			break;
		case "Siamaggiore":
			codice = "I717";
			break;
		case "Siamanna":
			codice = "I718";
			break;
		case "Siano":
			codice = "I720";
			break;
		case "Siapiccia":
			codice = "I721";
			break;
		case "Siculiana":
			codice = "I723";
			break;
		case "Siddi":
			codice = "I724";
			break;
		case "Siderno":
			codice = "I725";
			break;
		case "Siena":
			codice = "I726";
			break;
		case "Sigillo":
			codice = "I727";
			break;
		case "Signa":
			codice = "I728";
			break;
		case "Silandro":
			codice = "I729";
			break;
		case "Silanus":
			codice = "I730";
			break;
		case "Siligo":
			codice = "I732";
			break;
		case "Siliqua":
			codice = "I734";
			break;
		case "Silius":
			codice = "I735";
			break;
		case "Sillavengo":
			codice = "I736";
			break;
		case "Sillano":
			codice = "I737";
			break;
		case "Silvano D'Orba":
			codice = "I738";
			break;
		case "Silvano Pietra":
			codice = "I739";
			break;
		case "Silvi":
			codice = "I741";
			break;
		case "Simala":
			codice = "I742";
			break;
		case "Simacodiceis":
			codice = "I743";
			break;
		case "Simbario":
			codice = "I744";
			break;
		case "Simeri Crichi":
			codice = "I745";
			break;
		case "Sinagra":
			codice = "I747";
			break;
		case "Sindia":
			codice = "I748";
			break;
		case "Sini":
			codice = "I749";
			break;
		case "Sinio":
			codice = "I750";
			break;
		case "Siniscola":
			codice = "I751";
			break;
		case "Sinnai":
			codice = "I752";
			break;
		case "Sinopoli":
			codice = "I753";
			break;
		case "Siracusa":
			codice = "I754";
			break;
		case "Sirignano":
			codice = "I756";
			break;
		case "Siris":
			codice = "I757";
			break;
		case "Sirolo":
			codice = "I758";
			break;
		case "Sirone":
			codice = "I759";
			break;
		case "Siror":
			codice = "I760";
			break;
		case "Sirtori":
			codice = "I761";
			break;
		case "Sissa":
			codice = "I763";
			break;
		case "Siurgus Donigala":
			codice = "I765";
			break;
		case "Sizzano":
			codice = "I767";
			break;
		case "Sluderno":
			codice = "I771";
			break;
		case "Smarano":
			codice = "I772";
			break;
		case "Smerillo":
			codice = "I774";
			break;
		case "Soave":
			codice = "I775";
			break;
		case "Socchieve":
			codice = "I777";
			break;
		case "Soddì":
			codice = "I778";
			break;
		case "Sogliano Al Rubicone":
			codice = "I779";
			break;
		case "Sogliano Cavour":
			codice = "I780";
			break;
		case "Soglio":
			codice = "I781";
			break;
		case "Soiano Del Lago":
			codice = "I782";
			break;
		case "Solagna":
			codice = "I783";
			break;
		case "Solarino":
			codice = "I785";
			break;
		case "Solaro":
			codice = "I786";
			break;
		case "Solarolo":
			codice = "I787";
			break;
		case "Solarolo Rainerio":
			codice = "I790";
			break;
		case "Solarussa":
			codice = "I791";
			break;
		case "Solbiate":
			codice = "I792";
			break;
		case "Solbiate Arno":
			codice = "I793";
			break;
		case "Solbiate Olona":
			codice = "I794";
			break;
		case "Soldano":
			codice = "I796";
			break;
		case "Soleminis":
			codice = "I797";
			break;
		case "Solero":
			codice = "I798";
			break;
		case "Solesino":
			codice = "I799";
			break;
		case "Soleto":
			codice = "I800";
			break;
		case "Solferino":
			codice = "I801";
			break;
		case "Soliera":
			codice = "I802";
			break;
		case "Solignano":
			codice = "I803";
			break;
		case "Sulmona":
			codice = "I804";
			break;
		case "Solofra":
			codice = "I805";
			break;
		case "Solonghello":
			codice = "I808";
			break;
		case "Solopaca":
			codice = "I809";
			break;
		case "Solto Collina":
			codice = "I812";
			break;
		case "Solza":
			codice = "I813";
			break;
		case "Somaglia":
			codice = "I815";
			break;
		case "Somano":
			codice = "I817";
			break;
		case "Somma Lombardo":
			codice = "I819";
			break;
		case "Somma Vesuviana":
			codice = "I820";
			break;
		case "Sommacampagna":
			codice = "I821";
			break;
		case "Sommariva Del Bosco":
			codice = "I822";
			break;
		case "Sommariva Perno":
			codice = "I823";
			break;
		case "Sommatino":
			codice = "I824";
			break;
		case "Sommo":
			codice = "I825";
			break;
		case "Sona":
			codice = "I826";
			break;
		case "Soncino":
			codice = "I827";
			break;
		case "Sondalo":
			codice = "I828";
			break;
		case "Sondrio":
			codice = "I829";
			break;
		case "Songavazzo":
			codice = "I830";
			break;
		case "Sonico":
			codice = "I831";
			break;
		case "Sonnino":
			codice = "I832";
			break;
		case "Soprana":
			codice = "I835";
			break;
		case "Sora":
			codice = "I838";
			break;
		case "Soraga Di Fassa":
			codice = "I839";
			break;
		case "Soragna":
			codice = "I840";
			break;
		case "Sorano":
			codice = "I841";
			break;
		case "Sorbo Serpico":
			codice = "I843";
			break;
		case "Sorbo San Basile":
			codice = "I844";
			break;
		case "Sorbolo":
			codice = "I845";
			break;
		case "Sordevolo":
			codice = "I847";
			break;
		case "Sordio":
			codice = "I848";
			break;
		case "Soresina":
			codice = "I849";
			break;
		case "Sorgà":
			codice = "I850";
			break;
		case "Sorgono":
			codice = "I851";
			break;
		case "Sori":
			codice = "I852";
			break;
		case "Sorianello":
			codice = "I853";
			break;
		case "Soriano Calabro":
			codice = "I854";
			break;
		case "Soriano Nel Cimino":
			codice = "I855";
			break;
		case "Sorico":
			codice = "I856";
			break;
		case "Soriso":
			codice = "I857";
			break;
		case "Sorisole":
			codice = "I858";
			break;
		case "Sormano":
			codice = "I860";
			break;
		case "Sorradile":
			codice = "I861";
			break;
		case "Sorrento":
			codice = "I862";
			break;
		case "Sorso":
			codice = "I863";
			break;
		case "Sortino":
			codice = "I864";
			break;
		case "Sospiro":
			codice = "I865";
			break;
		case "Sospirolo":
			codice = "I866";
			break;
		case "Sossano":
			codice = "I867";
			break;
		case "Sostegno":
			codice = "I868";
			break;
		case "Sotto Il Monte Giovanni codicecodiceiii":
			codice = "I869";
			break;
		case "Sover":
			codice = "I871";
			break;
		case "Soverato":
			codice = "I872";
			break;
		case "Sovere":
			codice = "I873";
			break;
		case "Soveria Mannelli":
			codice = "I874";
			break;
		case "Soveria Simeri":
			codice = "I875";
			break;
		case "Soverzene":
			codice = "I876";
			break;
		case "Sovicille":
			codice = "I877";
			break;
		case "Sovico":
			codice = "I878";
			break;
		case "Sovizzo":
			codice = "I879";
			break;
		case "Sozzago":
			codice = "I880";
			break;
		case "Spadafora":
			codice = "I881";
			break;
		case "Spadola":
			codice = "I884";
			break;
		case "Sparanise":
			codice = "I885";
			break;
		case "Sparone":
			codice = "I886";
			break;
		case "Specchia":
			codice = "I887";
			break;
		case "Spello":
			codice = "I888";
			break;
		case "Spera":
			codice = "I889";
			break;
		case "Sperlinga":
			codice = "I891";
			break;
		case "Sperlonga":
			codice = "I892";
			break;
		case "Sperone":
			codice = "I893";
			break;
		case "Spessa":
			codice = "I894";
			break;
		case "Spezzano Albanese":
			codice = "I895";
			break;
		case "Spezzano Della Sila":
			codice = "I896";
			break;
		case "Spezzano Piccolo":
			codice = "I898";
			break;
		case "Spiazzo":
			codice = "I899";
			break;
		case "Spigno Monferrato":
			codice = "I901";
			break;
		case "Spigno Saturnia":
			codice = "I902";
			break;
		case "Spilamberto":
			codice = "I903";
			break;
		case "Spilimbergo":
			codice = "I904";
			break;
		case "Spilinga":
			codice = "I905";
			break;
		case "Spinadesco":
			codice = "I906";
			break;
		case "Spinazzola":
			codice = "I907";
			break;
		case "Spinea":
			codice = "I908";
			break;
		case "Spineda":
			codice = "I909";
			break;
		case "Spinete":
			codice = "I910";
			break;
		case "Spineto Scrivia":
			codice = "I911";
			break;
		case "Spinetoli":
			codice = "I912";
			break;
		case "Spino D'Adda":
			codice = "I914";
			break;
		case "Spinone Al Lago":
			codice = "I916";
			break;
		case "Spinoso":
			codice = "I917";
			break;
		case "Spirano":
			codice = "I919";
			break;
		case "Spoleto":
			codice = "I921";
			break;
		case "Spoltore":
			codice = "I922";
			break;
		case "Spongano":
			codice = "I923";
			break;
		case "Spormaggiore":
			codice = "I924";
			break;
		case "Sporminore":
			codice = "I925";
			break;
		case "Spotorno":
			codice = "I926";
			break;
		case "Spresiano":
			codice = "I927";
			break;
		case "Spriana":
			codice = "I928";
			break;
		case "Squillace":
			codice = "I929";
			break;
		case "Squinzano":
			codice = "I930";
			break;
		case "Staffolo":
			codice = "I932";
			break;
		case "Stagno Lombardo":
			codice = "I935";
			break;
		case "Staiti":
			codice = "I936";
			break;
		case "Stalettì":
			codice = "I937";
			break;
		case "Stanghella":
			codice = "I938";
			break;
		case "Staranzano":
			codice = "I939";
			break;
		case "Stazzano":
			codice = "I941";
			break;
		case "Stazzema":
			codice = "I942";
			break;
		case "Stazzona":
			codice = "I943";
			break;
		case "Stefanaconi":
			codice = "I945";
			break;
		case "Stella":
			codice = "I946";
			break;
		case "Stellanello":
			codice = "I947";
			break;
		case "Stelvio":
			codice = "I948";
			break;
		case "Stenico":
			codice = "I949";
			break;
		case "Sternatia":
			codice = "I950";
			break;
		case "Stezzano":
			codice = "I951";
			break;
		case "Stia":
			codice = "I952";
			break;
		case "Stienta":
			codice = "I953";
			break;
		case "Stigliano":
			codice = "I954";
			break;
		case "Stignano":
			codice = "I955";
			break;
		case "Stilo":
			codice = "I956";
			break;
		case "Stimigliano":
			codice = "I959";
			break;
		case "Stio":
			codice = "I960";
			break;
		case "Stornara":
			codice = "I962";
			break;
		case "Stornarella":
			codice = "I963";
			break;
		case "Storo":
			codice = "I964";
			break;
		case "Stra":
			codice = "I965";
			break;
		case "Stradella":
			codice = "I968";
			break;
		case "Strambinello":
			codice = "I969";
			break;
		case "Strambino":
			codice = "I970";
			break;
		case "Strangolagalli":
			codice = "I973";
			break;
		case "Stregna":
			codice = "I974";
			break;
		case "Strembo":
			codice = "I975";
			break;
		case "Stresa":
			codice = "I976";
			break;
		case "Strevi":
			codice = "I977";
			break;
		case "Striano":
			codice = "I978";
			break;
		case "Strigno":
			codice = "I979";
			break;
		case "Strona":
			codice = "I980";
			break;
		case "Stroncone":
			codice = "I981";
			break;
		case "Strongoli":
			codice = "I982";
			break;
		case "Stroppiana":
			codice = "I984";
			break;
		case "Stroppo":
			codice = "I985";
			break;
		case "Strozza":
			codice = "I986";
			break;
		case "Sturno":
			codice = "I990";
			break;
		case "Subbiano":
			codice = "I991";
			break;
		case "Subiaco":
			codice = "I992";
			break;
		case "Succivo":
			codice = "I993";
			break;
		case "Sueglio":
			codice = "I994";
			break;
		case "Suelli":
			codice = "I995";
			break;
		case "Suello":
			codice = "I996";
			break;
		case "Suisio":
			codice = "I997";
			break;
		case "Sulbiate":
			codice = "I998";
			break;
		case "Sulzano":
			codice = "L002";
			break;
		case "Sumirago":
			codice = "L003";
			break;
		case "Summonte":
			codice = "L004";
			break;
		case "Suni":
			codice = "L006";
			break;
		case "Suno":
			codice = "L007";
			break;
		case "Supersano":
			codice = "L008";
			break;
		case "Supino":
			codice = "L009";
			break;
		case "Surano":
			codice = "L010";
			break;
		case "Surbo":
			codice = "L011";
			break;
		case "Susa":
			codice = "L013";
			break;
		case "Susegana":
			codice = "L014";
			break;
		case "Sustinente":
			codice = "L015";
			break;
		case "Sutera":
			codice = "L016";
			break;
		case "Sutri":
			codice = "L017";
			break;
		case "Sutrio":
			codice = "L018";
			break;
		case "Suvereto":
			codice = "L019";
			break;
		case "Suzzara":
			codice = "L020";
			break;

		}

	}

	private void codiciComuniT(String comune) {

		switch (comune) {

		case "Tortolì":
			codice = "A355";
			break;
		case "Tronzano Lago Maggiore":
			codice = "A705";
			break;
		case "Trinitapoli":
			codice = "B915";
			break;
		case "Tavernole Sul Mella":
			codice = "C698";
			break;
		case "Tarquinia":
			codice = "D024";
			break;
		case "Teggiano":
			codice = "D292";
			break;
		case "Tonezza Del Cimone":
			codice = "D717";
			break;
		case "Terenzo":
			codice = "E548";
			break;
		case "Tavazzano Con Villavesco":
			codice = "F260";
			break;
		case "Turania":
			codice = "G507";
			break;
		case "Taipana":
			codice = "G736";
			break;
		case "Terme Vigliatore":
			codice = "M210";
			break;
		case "Trecase":
			codice = "M280";
			break;
		case "Tergu":
			codice = "M282";
			break;
		case "Torrenova":
			codice = "M286";
			break;
		case "Trecastelli":
			codice = "M318";
			break;
		case "Tremezzina":
			codice = "M341";
			break;
		case "Tre Ville":
			codice = "M361";
			break;
		case "Terre Roveresche":
			codice = "M379";
			break;
		case "Terre Del Reno":
			codice = "M381";
			break;
		case "Treppo Ligosullo":
			codice = "M399";
			break;
		case "Terre D'Adige":
			codice = "M407";
			break;
		case "Tresignana":
			codice = "M409";
			break;
		case "Travacò Siccomario":
			codice = "I236";
			break;
		case "Torriana":
			codice = "I550";
			break;
		case "Taceno":
			codice = "L022";
			break;
		case "Tadasuni":
			codice = "L023";
			break;
		case "Taggia":
			codice = "L024";
			break;
		case "Tagliacozzo":
			codice = "L025";
			break;
		case "Taglio Di Po":
			codice = "L026";
			break;
		case "Tagliolo Monferrato":
			codice = "L027";
			break;
		case "Taibon Agordino":
			codice = "L030";
			break;
		case "Taino":
			codice = "L032";
			break;
		case "Taio":
			codice = "L033";
			break;
		case "Talamello":
			codice = "L034";
			break;
		case "Talamona":
			codice = "L035";
			break;
		case "Talana":
			codice = "L036";
			break;
		case "Taleggio":
			codice = "L037";
			break;
		case "Talla":
			codice = "L038";
			break;
		case "Talmassons":
			codice = "L039";
			break;
		case "Tambre":
			codice = "L040";
			break;
		case "Taormina":
			codice = "L042";
			break;
		case "Tapogliano":
			codice = "L044";
			break;
		case "Tarano":
			codice = "L046";
			break;
		case "Taranta Peligna":
			codice = "L047";
			break;
		case "Tarantasca":
			codice = "L048";
			break;
		case "Taranto":
			codice = "L049";
			break;
		case "Tarcento":
			codice = "L050";
			break;
		case "Tarsia":
			codice = "L055";
			break;
		case "Tartano":
			codice = "L056";
			break;
		case "Tarvisio":
			codice = "L057";
			break;
		case "Tarzo":
			codice = "L058";
			break;
		case "Tassarolo":
			codice = "L059";
			break;
		case "Tassullo":
			codice = "L060";
			break;
		case "Taurano":
			codice = "L061";
			break;
		case "Taurasi":
			codice = "L062";
			break;
		case "Taurianova":
			codice = "L063";
			break;
		case "Taurisano":
			codice = "L064";
			break;
		case "Tavagnacco":
			codice = "L065";
			break;
		case "Tavagnasco":
			codice = "L066";
			break;
		case "Tavarnelle Val Di Pesa":
			codice = "L067";
			break;
		case "Tavenna":
			codice = "L069";
			break;
		case "Taverna":
			codice = "L070";
			break;
		case "Tavernerio":
			codice = "L071";
			break;
		case "Tavernola Bergamasca":
			codice = "L073";
			break;
		case "Taviano":
			codice = "L074";
			break;
		case "Tavigliano":
			codice = "L075";
			break;
		case "Tavoleto":
			codice = "L078";
			break;
		case "Tavullia":
			codice = "L081";
			break;
		case "Teana":
			codice = "L082";
			break;
		case "Teano":
			codice = "L083";
			break;
		case "Teglio":
			codice = "L084";
			break;
		case "Teglio Veneto":
			codice = "L085";
			break;
		case "Telese Terme":
			codice = "L086";
			break;
		case "Telgate":
			codice = "L087";
			break;
		case "Telti":
			codice = "L088";
			break;
		case "Telve":
			codice = "L089";
			break;
		case "Telve Di Sopra":
			codice = "L090";
			break;
		case "Tempio Pausania":
			codice = "L093";
			break;
		case "Temù":
			codice = "L094";
			break;
		case "Tenna":
			codice = "L096";
			break;
		case "Tenno":
			codice = "L097";
			break;
		case "Teolo":
			codice = "L100";
			break;
		case "Teor":
			codice = "L101";
			break;
		case "Teora":
			codice = "L102";
			break;
		case "Teramo":
			codice = "L103";
			break;
		case "Terdobbiate":
			codice = "L104";
			break;
		case "Terelle":
			codice = "L105";
			break;
		case "Terento":
			codice = "L106";
			break;
		case "Terlago":
			codice = "L107";
			break;
		case "Terlano":
			codice = "L108";
			break;
		case "Terlizzi":
			codice = "L109";
			break;
		case "Termeno Sulla Strada Del Vino":
			codice = "L111";
			break;
		case "Termini Imerese":
			codice = "L112";
			break;
		case "Termoli":
			codice = "L113";
			break;
		case "Ternate":
			codice = "L115";
			break;
		case "Ternengo":
			codice = "L116";
			break;
		case "Terni":
			codice = "L117";
			break;
		case "Terno D'Isola":
			codice = "L118";
			break;
		case "Terracina":
			codice = "L120";
			break;
		case "Terragnolo":
			codice = "L121";
			break;
		case "Terralba":
			codice = "L122";
			break;
		case "Terranuova Bracciolini":
			codice = "L123";
			break;
		case "Terranova Da Sibari":
			codice = "L124";
			break;
		case "Terranova Dei Passerini":
			codice = "L125";
			break;
		case "Terranova Di Pollino":
			codice = "L126";
			break;
		case "Terranova Sappo Minulio":
			codice = "L127";
			break;
		case "Terrasini":
			codice = "L131";
			break;
		case "Terrassa Padovana":
			codice = "L132";
			break;
		case "Terravecchia":
			codice = "L134";
			break;
		case "Terrazzo":
			codice = "L136";
			break;
		case "Terres":
			codice = "L137";
			break;
		case "Terricciola":
			codice = "L138";
			break;
		case "Terruggia":
			codice = "L139";
			break;
		case "Tertenia":
			codice = "L140";
			break;
		case "Terzigno":
			codice = "L142";
			break;
		case "Terzo":
			codice = "L143";
			break;
		case "Terzo Di Aquileia":
			codice = "L144";
			break;
		case "Terzolas":
			codice = "L145";
			break;
		case "Terzorio":
			codice = "L146";
			break;
		case "Tesero":
			codice = "L147";
			break;
		case "Tesimo":
			codice = "L149";
			break;
		case "Tessennano":
			codice = "L150";
			break;
		case "Testico":
			codice = "L152";
			break;
		case "Teti":
			codice = "L153";
			break;
		case "Teulada":
			codice = "L154";
			break;
		case "Teverola":
			codice = "L155";
			break;
		case "Tezze Sul Brenta":
			codice = "L156";
			break;
		case "Thiene":
			codice = "L157";
			break;
		case "Thiesi":
			codice = "L158";
			break;
		case "Tiana":
			codice = "L160";
			break;
		case "Tiarno Di Sopra":
			codice = "L162";
			break;
		case "Tiarno Di Sotto":
			codice = "L163";
			break;
		case "Ticengo":
			codice = "L164";
			break;
		case "Ticineto":
			codice = "L165";
			break;
		case "Tiggiano":
			codice = "L166";
			break;
		case "Tiglieto":
			codice = "L167";
			break;
		case "Tigliole":
			codice = "L168";
			break;
		case "Tignale":
			codice = "L169";
			break;
		case "Tinnura":
			codice = "L172";
			break;
		case "Tione Degli Abruzzi":
			codice = "L173";
			break;
		case "Tione Di Trento":
			codice = "L174";
			break;
		case "Tirano":
			codice = "L175";
			break;
		case "Tires":
			codice = "L176";
			break;
		case "Tiriolo":
			codice = "L177";
			break;
		case "Tirolo":
			codice = "L178";
			break;
		case "Tissi":
			codice = "L180";
			break;
		case "Tito":
			codice = "L181";
			break;
		case "Tivoli":
			codice = "L182";
			break;
		case "Tizzano Val Parma":
			codice = "L183";
			break;
		case "Toano":
			codice = "L184";
			break;
		case "Tocco Caudio":
			codice = "L185";
			break;
		case "Tocco Da Casauria":
			codice = "L186";
			break;
		case "Toceno":
			codice = "L187";
			break;
		case "Todi":
			codice = "L188";
			break;
		case "Toffia":
			codice = "L189";
			break;
		case "Toirano":
			codice = "L190";
			break;
		case "Tolentino":
			codice = "L191";
			break;
		case "Tolfa":
			codice = "L192";
			break;
		case "Tollegno":
			codice = "L193";
			break;
		case "Tollo":
			codice = "L194";
			break;
		case "Tolmezzo":
			codice = "L195";
			break;
		case "Tolve":
			codice = "L197";
			break;
		case "Tombolo":
			codice = "L199";
			break;
		case "Ton":
			codice = "L200";
			break;
		case "Tonadico":
			codice = "L201";
			break;
		case "Tonara":
			codice = "L202";
			break;
		case "Tonco":
			codice = "L203";
			break;
		case "Tonengo":
			codice = "L204";
			break;
		case "Tora E Piccilli":
			codice = "L205";
			break;
		case "Torano Castello":
			codice = "L206";
			break;
		case "Torano Nuovo":
			codice = "L207";
			break;
		case "Torbole Casaglia":
			codice = "L210";
			break;
		case "Torcegno":
			codice = "L211";
			break;
		case "Torchiara":
			codice = "L212";
			break;
		case "Torchiarolo":
			codice = "L213";
			break;
		case "Torella Dei Lombardi":
			codice = "L214";
			break;
		case "Torella Del Sannio":
			codice = "L215";
			break;
		case "Torgiano":
			codice = "L216";
			break;
		case "Torgnon":
			codice = "L217";
			break;
		case "Torino Di Sangro":
			codice = "L218";
			break;
		case "Torino":
			codice = "L219";
			break;
		case "Toritto":
			codice = "L220";
			break;
		case "Torlino Vimercati":
			codice = "L221";
			break;
		case "Tornaco":
			codice = "L223";
			break;
		case "Tornareccio":
			codice = "L224";
			break;
		case "Tornata":
			codice = "L225";
			break;
		case "Tornimparte":
			codice = "L227";
			break;
		case "Torno":
			codice = "L228";
			break;
		case "Tornolo":
			codice = "L229";
			break;
		case "Toro":
			codice = "L230";
			break;
		case "Torpè":
			codice = "L231";
			break;
		case "Torraca":
			codice = "L233";
			break;
		case "Torralba":
			codice = "L235";
			break;
		case "Torrazza Coste":
			codice = "L237";
			break;
		case "Torrazza Piemonte":
			codice = "L238";
			break;
		case "Torrazzo":
			codice = "L239";
			break;
		case "Torre Di Ruggiero":
			codice = "L240";
			break;
		case "Torre Mondovì":
			codice = "L241";
			break;
		case "Torre Cajetani":
			codice = "L243";
			break;
		case "Torre Di Santa Maria":
			codice = "L244";
			break;
		case "Torre Annunziata":
			codice = "L245";
			break;
		case "Torreano":
			codice = "L246";
			break;
		case "Torre Canavese":
			codice = "L247";
			break;
		case "Torrebelvicino":
			codice = "L248";
			break;
		case "Torre Beretti E Castellaro":
			codice = "L250";
			break;
		case "Torre Boldone":
			codice = "L251";
			break;
		case "Torre Bormida":
			codice = "L252";
			break;
		case "Torrebruna":
			codice = "L253";
			break;
		case "Torrecuso":
			codice = "L254";
			break;
		case "Torre D'Arese":
			codice = "L256";
			break;
		case "Torre Dè Busi":
			codice = "L257";
			break;
		case "Torre Dè Picenardi":
			codice = "L258";
			break;
		case "Torre Del Greco":
			codice = "L259";
			break;
		case "Torre Dè Negri":
			codice = "L262";
			break;
		case "Torre Dè Passeri":
			codice = "L263";
			break;
		case "Torre Dè Roveri":
			codice = "L265";
			break;
		case "Torre Di Mosto":
			codice = "L267";
			break;
		case "Torre D'Isola":
			codice = "L269";
			break;
		case "Torreglia":
			codice = "L270";
			break;
		case "Torregrotta":
			codice = "L271";
			break;
		case "Torre Le Nocelle":
			codice = "L272";
			break;
		case "Torremaggiore":
			codice = "L273";
			break;
		case "Torre Orsaia":
			codice = "L274";
			break;
		case "Torre Pallavicina":
			codice = "L276";
			break;
		case "Torre Pellice":
			codice = "L277";
			break;
		case "Torre San Giorgio":
			codice = "L278";
			break;
		case "Torre San Patrizio":
			codice = "L279";
			break;
		case "Torre Santa Susanna":
			codice = "L280";
			break;
		case "Torresina":
			codice = "L281";
			break;
		case "Torretta":
			codice = "L282";
			break;
		case "Torrevecchia Teatina":
			codice = "L284";
			break;
		case "Torrevecchia Pia":
			codice = "L285";
			break;
		case "Torri In Sabina":
			codice = "L286";
			break;
		case "Torri Del Benaco":
			codice = "L287";
			break;
		case "Torrice":
			codice = "L290";
			break;
		case "Torricella Peligna":
			codice = "L291";
			break;
		case "Torricella Verzate":
			codice = "L292";
			break;
		case "Torricella In Sabina":
			codice = "L293";
			break;
		case "Torricella":
			codice = "L294";
			break;
		case "Torricella Sicura":
			codice = "L295";
			break;
		case "Torricella Del Pizzo":
			codice = "L296";
			break;
		case "Torri Di Quartesolo":
			codice = "L297";
			break;
		case "Torriglia":
			codice = "L298";
			break;
		case "Torrile":
			codice = "L299";
			break;
		case "Torrioni":
			codice = "L301";
			break;
		case "Torrita Tiberina":
			codice = "L302";
			break;
		case "Torrita Di Siena":
			codice = "L303";
			break;
		case "Tortona":
			codice = "L304";
			break;
		case "Tortora":
			codice = "L305";
			break;
		case "Tortorella":
			codice = "L306";
			break;
		case "Tortoreto":
			codice = "L307";
			break;
		case "Tortorici":
			codice = "L308";
			break;
		case "Torviscosa":
			codice = "L309";
			break;
		case "Tuscania":
			codice = "L310";
			break;
		case "Toscolano Maderno":
			codice = "L312";
			break;
		case "Tossicia":
			codice = "L314";
			break;
		case "Tovo San Giacomo":
			codice = "L315";
			break;
		case "Tovo Di Sant'Agata":
			codice = "L316";
			break;
		case "Trabia":
			codice = "L317";
			break;
		case "Tradate":
			codice = "L319";
			break;
		case "Tramatza":
			codice = "L321";
			break;
		case "Trambileno":
			codice = "L322";
			break;
		case "Tramonti":
			codice = "L323";
			break;
		case "Tramonti Di Sopra":
			codice = "L324";
			break;
		case "Tramonti Di Sotto":
			codice = "L325";
			break;
		case "Tramutola":
			codice = "L326";
			break;
		case "Trana":
			codice = "L327";
			break;
		case "Trani":
			codice = "L328";
			break;
		case "Transacqua":
			codice = "L329";
			break;
		case "Traona":
			codice = "L330";
			break;
		case "Trapani":
			codice = "L331";
			break;
		case "Trappeto":
			codice = "L332";
			break;
		case "Trarego Viggiona":
			codice = "L333";
			break;
		case "Trasacco":
			codice = "L334";
			break;
		case "Trasaghis":
			codice = "L335";
			break;
		case "Trasquera":
			codice = "L336";
			break;
		case "Tratalias":
			codice = "L337";
			break;
		case "Trausella":
			codice = "L338";
			break;
		case "Travagliato":
			codice = "L339";
			break;
		case "Traves":
			codice = "L340";
			break;
		case "Travedona-Monate":
			codice = "L342";
			break;
		case "Traversella":
			codice = "L345";
			break;
		case "Traversetolo":
			codice = "L346";
			break;
		case "Travesio":
			codice = "L347";
			break;
		case "Travo":
			codice = "L348";
			break;
		case "Trebaseleghe":
			codice = "L349";
			break;
		case "Trebisacce":
			codice = "L353";
			break;
		case "Trecasali":
			codice = "L354";
			break;
		case "Trecastagni":
			codice = "L355";
			break;
		case "Trecate":
			codice = "L356";
			break;
		case "Trecchina":
			codice = "L357";
			break;
		case "Trecenta":
			codice = "L359";
			break;
		case "Tredozio":
			codice = "L361";
			break;
		case "Treglio":
			codice = "L363";
			break;
		case "Tregnago":
			codice = "L364";
			break;
		case "Treia":
			codice = "L366";
			break;
		case "Treiso":
			codice = "L367";
			break;
		case "Tremenico":
			codice = "L368";
			break;
		case "Tremestieri Etneo":
			codice = "L369";
			break;
		case "Tremezzo":
			codice = "L371";
			break;
		case "Tremosine Sul Garda":
			codice = "L372";
			break;
		case "Trenta":
			codice = "L375";
			break;
		case "Trentinara":
			codice = "L377";
			break;
		case "Trento":
			codice = "L378";
			break;
		case "Trentola Ducenta":
			codice = "L379";
			break;
		case "Trenzano":
			codice = "L380";
			break;
		case "Treppo Carnico":
			codice = "L381";
			break;
		case "Treppo Grande":
			codice = "L382";
			break;
		case "Trepuzzi":
			codice = "L383";
			break;
		case "Trequanda":
			codice = "L384";
			break;
		case "Tres":
			codice = "L385";
			break;
		case "Tresana":
			codice = "L386";
			break;
		case "Trescore Balneario":
			codice = "L388";
			break;
		case "Trescore Cremasco":
			codice = "L389";
			break;
		case "Tresigallo":
			codice = "L390";
			break;
		case "Tresivio":
			codice = "L392";
			break;
		case "Tresnuraghes":
			codice = "L393";
			break;
		case "Trevenzuolo":
			codice = "L396";
			break;
		case "Trevi":
			codice = "L397";
			break;
		case "Trevi Nel Lazio":
			codice = "L398";
			break;
		case "Trevico":
			codice = "L399";
			break;
		case "Treviglio":
			codice = "L400";
			break;
		case "Trevignano Romano":
			codice = "L401";
			break;
		case "Trevignano":
			codice = "L402";
			break;
		case "Treville":
			codice = "L403";
			break;
		case "Treviolo":
			codice = "L404";
			break;
		case "Treviso Bresciano":
			codice = "L406";
			break;
		case "Treviso":
			codice = "L407";
			break;
		case "Trezzano Rosa":
			codice = "L408";
			break;
		case "Trezzano Sul Naviglio":
			codice = "L409";
			break;
		case "Trezzo Tinella":
			codice = "L410";
			break;
		case "Trezzo Sull'Adda":
			codice = "L411";
			break;
		case "Trezzone":
			codice = "L413";
			break;
		case "Tribano":
			codice = "L414";
			break;
		case "Tribiano":
			codice = "L415";
			break;
		case "Tribogna":
			codice = "L416";
			break;
		case "Tricarico":
			codice = "L418";
			break;
		case "Tricase":
			codice = "L419";
			break;
		case "Tricerro":
			codice = "L420";
			break;
		case "Tricesimo":
			codice = "L421";
			break;
		case "Trichiana":
			codice = "L422";
			break;
		case "Triei":
			codice = "L423";
			break;
		case "Trieste":
			codice = "L424";
			break;
		case "Triggiano":
			codice = "L425";
			break;
		case "Trigolo":
			codice = "L426";
			break;
		case "Trinità":
			codice = "L427";
			break;
		case "Trinità D'Agultu E Vignola":
			codice = "L428";
			break;
		case "Trino":
			codice = "L429";
			break;
		case "Triora":
			codice = "L430";
			break;
		case "Tripi":
			codice = "L431";
			break;
		case "Trisobbio":
			codice = "L432";
			break;
		case "Trissino":
			codice = "L433";
			break;
		case "Triuggio":
			codice = "L434";
			break;
		case "Trivento":
			codice = "L435";
			break;
		case "Trivero":
			codice = "L436";
			break;
		case "Trivigliano":
			codice = "L437";
			break;
		case "Trivignano Udinese":
			codice = "L438";
			break;
		case "Trivigno":
			codice = "L439";
			break;
		case "Trivolzio":
			codice = "L440";
			break;
		case "Trodena Nel Parco Naturale":
			codice = "L444";
			break;
		case "Trofarello":
			codice = "L445";
			break;
		case "Troia":
			codice = "L447";
			break;
		case "Troina":
			codice = "L448";
			break;
		case "Tromello":
			codice = "L449";
			break;
		case "Trontano":
			codice = "L450";
			break;
		case "Tronzano Vercellese":
			codice = "L451";
			break;
		case "Tropea":
			codice = "L452";
			break;
		case "Trovo":
			codice = "L453";
			break;
		case "Truccazzano":
			codice = "L454";
			break;
		case "Tubre":
			codice = "L455";
			break;
		case "Tuenno":
			codice = "L457";
			break;
		case "Tufara":
			codice = "L458";
			break;
		case "Tufillo":
			codice = "L459";
			break;
		case "Tufino":
			codice = "L460";
			break;
		case "Tufo":
			codice = "L461";
			break;
		case "Tuglie":
			codice = "L462";
			break;
		case "Tuili":
			codice = "L463";
			break;
		case "Tula":
			codice = "L464";
			break;
		case "Tuoro Sul Trasimeno":
			codice = "L466";
			break;
		case "Turano Lodigiano":
			codice = "L469";
			break;
		case "Turate":
			codice = "L470";
			break;
		case "Turbigo":
			codice = "L471";
			break;
		case "Turi":
			codice = "L472";
			break;
		case "Turri":
			codice = "L473";
			break;
		case "Turriaco":
			codice = "L474";
			break;
		case "Turrivalignani":
			codice = "L475";
			break;
		case "Tursi":
			codice = "L477";
			break;
		case "Tusa":
			codice = "L478";
			break;

		}

	}

	private void codiciComuniU(String comune) {

		switch (comune) {

		case "Ubiale Clanezzo":
			codice = "C789";
			break;
		case "Umbertide":
			codice = "D786";
			break;
		case "Uboldo":
			codice = "L480";
			break;
		case "Ucria":
			codice = "L482";
			break;
		case "Udine":
			codice = "L483";
			break;
		case "Ugento":
			codice = "L484";
			break;
		case "Uggiano La Chiesa":
			codice = "L485";
			break;
		case "Uggiate-Trevano":
			codice = "L487";
			break;
		case "Ulà Tirso":
			codice = "L488";
			break;
		case "Ulassai":
			codice = "L489";
			break;
		case "Ultimo":
			codice = "L490";
			break;
		case "Umbriatico":
			codice = "L492";
			break;
		case "Urago D'Oglio":
			codice = "L494";
			break;
		case "Uras":
			codice = "L496";
			break;
		case "Urbana":
			codice = "L497";
			break;
		case "Urbania":
			codice = "L498";
			break;
		case "Urbe":
			codice = "L499";
			break;
		case "Urbino":
			codice = "L500";
			break;
		case "Urbisaglia":
			codice = "L501";
			break;
		case "Urgnano":
			codice = "L502";
			break;
		case "Uri":
			codice = "L503";
			break;
		case "Ururi":
			codice = "L505";
			break;
		case "Urzulei":
			codice = "L506";
			break;
		case "Uscio":
			codice = "L507";
			break;
		case "Usellus":
			codice = "L508";
			break;
		case "Usini":
			codice = "L509";
			break;
		case "Usmate Velate":
			codice = "L511";
			break;
		case "Ussana":
			codice = "L512";
			break;
		case "Ussaramanna":
			codice = "L513";
			break;
		case "Ussassai":
			codice = "L514";
			break;
		case "Usseaux":
			codice = "L515";
			break;
		case "Usseglio":
			codice = "L516";
			break;
		case "Ussita":
			codice = "L517";
			break;
		case "Ustica":
			codice = "L519";
			break;
		case "Uta":
			codice = "L521";
			break;
		case "Uzzano":
			codice = "L522";
			break;

		}

	}

	private void codiciComuniV(String comune) {

		switch (comune) {

		case "Villa Latina":
			codice = "A081";
			break;
		case "Villa D'Almè":
			codice = "A215";
			break;
		case "Villa Verde":
			codice = "A609";
			break;
		case "Vasanello":
			codice = "A701";
			break;
		case "Valprato Soana":
			codice = "B510";
			break;
		case "Villasimius":
			codice = "B738";
			break;
		case "Villapiana":
			codice = "B903";
			break;
		case "Veronella":
			codice = "D193";
			break;
		case "Valsinni":
			codice = "D513";
			break;
		case "Villa Di Briano":
			codice = "D801";
			break;
		case "Verres":
			codice = "C282";
			break;
		case "Valsolda":
			codice = "C936";
			break;
		case "Vasto":
			codice = "E372";
			break;
		case "Vibo Valentia":
			codice = "F537";
			break;
		case "Villa Poma":
			codice = "F804";
			break;
		case "Villaricca":
			codice = "G309";
			break;
		case "Virgilio":
			codice = "H123";
			break;
		case "Villa San Giovanni In Tuscia":
			codice = "H913";
			break;
		case "Villa San Pietro":
			codice = "I118";
			break;
		case "Villa Sant'Antonio":
			codice = "I298";
			break;
		case "Villa Santo Stefano":
			codice = "I364";
			break;
		case "Villarbasse":
			codice = "M002";
			break;
		case "Villarboit":
			codice = "M003";
			break;
		case "Villareggia":
			codice = "M004";
			break;
		case "Villa Rendena":
			codice = "M006";
			break;
		case "Villar Focchiardo":
			codice = "M007";
			break;
		case "Villaromagnano":
			codice = "M009";
			break;
		case "Villarosa":
			codice = "M011";
			break;
		case "Villar Pellice":
			codice = "M013";
			break;
		case "Villar Perosa":
			codice = "M014";
			break;
		case "Villar San Costanzo":
			codice = "M015";
			break;
		case "Villasalto":
			codice = "M016";
			break;
		case "Villasanta":
			codice = "M017";
			break;
		case "Villa San Giovanni":
			codice = "M018";
			break;
		case "Villa San Secondo":
			codice = "M019";
			break;
		case "Villa Santa Lucia Degli Abruzzi":
			codice = "M021";
			break;
		case "Villa Santa Maria":
			codice = "M022";
			break;
		case "Villa Sant'Angelo":
			codice = "M023";
			break;
		case "Villasor":
			codice = "M025";
			break;
		case "Villaspeciosa":
			codice = "M026";
			break;
		case "Villastellone":
			codice = "M027";
			break;
		case "Villata":
			codice = "M028";
			break;
		case "Villaurbana":
			codice = "M030";
			break;
		case "Villavallelonga":
			codice = "M031";
			break;
		case "Villaverla":
			codice = "M032";
			break;
		case "Villa Vicentina":
			codice = "M034";
			break;
		case "Villetta Barrea":
			codice = "M041";
			break;
		case "Villette":
			codice = "M042";
			break;
		case "Villesse":
			codice = "M043";
			break;
		case "Villimpenta":
			codice = "M044";
			break;
		case "Villongo":
			codice = "M045";
			break;
		case "Villorba":
			codice = "M048";
			break;
		case "Vilminore Di Scalve":
			codice = "M050";
			break;
		case "Vimercate":
			codice = "M052";
			break;
		case "Vimodrone":
			codice = "M053";
			break;
		case "Vinadio":
			codice = "M055";
			break;
		case "Vinchiaturo":
			codice = "M057";
			break;
		case "Vinchio":
			codice = "M058";
			break;
		case "Vinci":
			codice = "M059";
			break;
		case "Vinovo":
			codice = "M060";
			break;
		case "Vinzaglio":
			codice = "M062";
			break;
		case "Viola":
			codice = "M063";
			break;
		case "Vione":
			codice = "M065";
			break;
		case "Vipiteno":
			codice = "M067";
			break;
		case "Virle Piemonte":
			codice = "M069";
			break;
		case "Visano":
			codice = "M070";
			break;
		case "Vische":
			codice = "M071";
			break;
		case "Visciano":
			codice = "M072";
			break;
		case "Visco":
			codice = "M073";
			break;
		case "Visone":
			codice = "M077";
			break;
		case "Visso":
			codice = "M078";
			break;
		case "Vistarino":
			codice = "M079";
			break;
		case "Vistrorio":
			codice = "M080";
			break;
		case "Vita":
			codice = "M081";
			break;
		case "Viterbo":
			codice = "M082";
			break;
		case "Viticuso":
			codice = "M083";
			break;
		case "Vito D'Asio":
			codice = "M085";
			break;
		case "Vitorchiano":
			codice = "M086";
			break;
		case "Vittoria":
			codice = "M088";
			break;
		case "Vittorio Veneto":
			codice = "M089";
			break;
		case "Vittorito":
			codice = "M090";
			break;
		case "Vittuone":
			codice = "M091";
			break;
		case "Vitulazio":
			codice = "M092";
			break;
		case "Vitulano":
			codice = "M093";
			break;
		case "Viù":
			codice = "M094";
			break;
		case "Vivaro Romano":
			codice = "M095";
			break;
		case "Vivaro":
			codice = "M096";
			break;
		case "Viverone":
			codice = "M098";
			break;
		case "Vizzini":
			codice = "M100";
			break;
		case "Vizzola Ticino":
			codice = "M101";
			break;
		case "Vizzolo Predabissi":
			codice = "M102";
			break;
		case "Vò":
			codice = "M103";
			break;
		case "Vobarno":
			codice = "M104";
			break;
		case "Vobbia":
			codice = "M105";
			break;
		case "Vocca":
			codice = "M106";
			break;
		case "Vodo Cadore":
			codice = "M108";
			break;
		case "Voghera":
			codice = "M109";
			break;
		case "Voghiera":
			codice = "M110";
			break;
		case "Vogogna":
			codice = "M111";
			break;
		case "Volano":
			codice = "M113";
			break;
		case "Volla":
			codice = "M115";
			break;
		case "Volongo":
			codice = "M116";
			break;
		case "Volpago Del Montello":
			codice = "M118";
			break;
		case "Volpara":
			codice = "M119";
			break;
		case "Volpedo":
			codice = "M120";
			break;
		case "Volpeglino":
			codice = "M121";
			break;
		case "Volpiano":
			codice = "M122";
			break;
		case "Voltaggio":
			codice = "M123";
			break;
		case "Voltago Agordino":
			codice = "M124";
			break;
		case "Volta Mantovana":
			codice = "M125";
			break;
		case "Volterra":
			codice = "M126";
			break;
		case "Voltido":
			codice = "M127";
			break;
		case "Volturara Irpina":
			codice = "M130";
			break;
		case "Volturara Appula":
			codice = "M131";
			break;
		case "Volturino":
			codice = "M132";
			break;
		case "Volvera":
			codice = "M133";
			break;
		case "Vottignasco":
			codice = "M136";
			break;
		case "Viddalba":
			codice = "M259";
			break;
		case "Vajont":
			codice = "M265";
			break;
		case "Villaperuccio":
			codice = "M278";
			break;
		case "Valsamoggia":
			codice = "M320";
			break;
		case "Vallefoglia":
			codice = "M331";
			break;
		case "Val Brembilla":
			codice = "M334";
			break;
		case "Verderio":
			codice = "M337";
			break;
		case "Valdaone":
			codice = "M343";
			break;
		case "Valvasone Arzene":
			codice = "M346";
			break;
		case "Vallelaghi":
			codice = "M362";
			break;
		case "Ville D'Anaunia":
			codice = "M363";
			break;
		case "Ventasso":
			codice = "M364";
			break;
		case "Val Di Chy":
			codice = "M405";
			break;
		case "Val Di Zoldo":
			codice = "M374";
			break;
		case "Valfornace":
			codice = "M382";
			break;
		case "Val Liona":
			codice = "M384";
			break;
		case "Valvarrone":
			codice = "M395";
			break;
		case "Valle Cannobina":
			codice = "M404";
			break;
		case "Valchiusa":
			codice = "M415";
			break;
		case "Valdilana":
			codice = "M417";
			break;
		case "Valbrenta":
			codice = "M423";
			break;
		case "Vermezzo Con Zelo":
			codice = "M424";
			break;
		case "Val Rezzo":
			codice = "H259";
			break;
		case "Valderice":
			codice = "G319";
			break;
		case "Valle Dell'Angelo":
			codice = "G540";
			break;
		case "Vallefiorita":
			codice = "I322";
			break;
		case "Valvestino":
			codice = "L468";
			break;
		case "Vaccarizzo Albanese":
			codice = "L524";
			break;
		case "Vacone":
			codice = "L525";
			break;
		case "Vacri":
			codice = "L526";
			break;
		case "Vadena":
			codice = "L527";
			break;
		case "Vado Ligure":
			codice = "L528";
			break;
		case "Vaglia":
			codice = "L529";
			break;
		case "Vaglio Serra":
			codice = "L531";
			break;
		case "Vaglio Basilicata":
			codice = "L532";
			break;
		case "Vagli Sotto":
			codice = "L533";
			break;
		case "Vaiano Cremasco":
			codice = "L535";
			break;
		case "Vaiano":
			codice = "L537";
			break;
		case "Vaie":
			codice = "L538";
			break;
		case "Vailate":
			codice = "L539";
			break;
		case "Vairano Patenora":
			codice = "L540";
			break;
		case "Valbondione":
			codice = "L544";
			break;
		case "Valbrembo":
			codice = "L545";
			break;
		case "Valbrevenna":
			codice = "L546";
			break;
		case "Valbrona":
			codice = "L547";
			break;
		case "Vico Canavese":
			codice = "L548";
			break;
		case "Valda":
			codice = "L550";
			break;
		case "Valdagno":
			codice = "L551";
			break;
		case "Valdaora":
			codice = "L552";
			break;
		case "Valdastico":
			codice = "L554";
			break;
		case "Val Della Torre":
			codice = "L555";
			break;
		case "Valdengo":
			codice = "L556";
			break;
		case "Valdidentro":
			codice = "L557";
			break;
		case "Valdieri":
			codice = "L558";
			break;
		case "Valdina":
			codice = "L561";
			break;
		case "Val Di Nizza":
			codice = "L562";
			break;
		case "Valdisotto":
			codice = "L563";
			break;
		case "Val Di Vizze":
			codice = "L564";
			break;
		case "Valdobbiadene":
			codice = "L565";
			break;
		case "Valduggia":
			codice = "L566";
			break;
		case "Valeggio Sul Mincio":
			codice = "L567";
			break;
		case "Valeggio":
			codice = "L568";
			break;
		case "Valentano":
			codice = "L569";
			break;
		case "Valenza":
			codice = "L570";
			break;
		case "Valenzano":
			codice = "L571";
			break;
		case "Valera Fratta":
			codice = "L572";
			break;
		case "Valfabbrica":
			codice = "L573";
			break;
		case "Valfenera":
			codice = "L574";
			break;
		case "Valfloriana":
			codice = "L575";
			break;
		case "Valfurva":
			codice = "L576";
			break;
		case "Valganna":
			codice = "L577";
			break;
		case "Valgioie":
			codice = "L578";
			break;
		case "Valgoglio":
			codice = "L579";
			break;
		case "Valgrana":
			codice = "L580";
			break;
		case "Valgreghentino":
			codice = "L581";
			break;
		case "Valgrisenche":
			codice = "L582";
			break;
		case "Valguernera Caropepe":
			codice = "L583";
			break;
		case "Vallada Agordina":
			codice = "L584";
			break;
		case "Vallanzengo":
			codice = "L586";
			break;
		case "Vallarsa":
			codice = "L588";
			break;
		case "Vallata":
			codice = "L589";
			break;
		case "Valle Di Cadore":
			codice = "L590";
			break;
		case "Valle Di Maddaloni":
			codice = "L591";
			break;
		case "Valle Lomellina":
			codice = "L593";
			break;
		case "Valle Agricola":
			codice = "L594";
			break;
		case "Valle Aurina":
			codice = "L595";
			break;
		case "Vallebona":
			codice = "L596";
			break;
		case "Valle Castellana":
			codice = "L597";
			break;
		case "Vallecorsa":
			codice = "L598";
			break;
		case "Vallecrosia":
			codice = "L599";
			break;
		case "Valle di Casies":
			codice = "L601";
			break;
		case "Valledolmo":
			codice = "L603";
			break;
		case "Valledoria":
			codice = "L604";
			break;
		case "Vallemaio":
			codice = "L605";
			break;
		case "Valle Mosso":
			codice = "L606";
			break;
		case "Vallelonga":
			codice = "L607";
			break;
		case "Vallelunga Pratameno":
			codice = "L609";
			break;
		case "Vallepietra":
			codice = "L611";
			break;
		case "Vallerano":
			codice = "L612";
			break;
		case "Vallermosa":
			codice = "L613";
			break;
		case "Vallerotonda":
			codice = "L614";
			break;
		case "Vallesaccarda":
			codice = "L616";
			break;
		case "Valle Salimbene":
			codice = "L617";
			break;
		case "Valle San Nicolao":
			codice = "L620";
			break;
		case "Valleve":
			codice = "L623";
			break;
		case "Valli Del Pasubio":
			codice = "L624";
			break;
		case "Vallinfreda":
			codice = "L625";
			break;
		case "Vallio Terme":
			codice = "L626";
			break;
		case "Vallo Di Nera":
			codice = "L627";
			break;
		case "Vallo Della Lucania":
			codice = "L628";
			break;
		case "Vallo Torinese":
			codice = "L629";
			break;
		case "Valloriate":
			codice = "L631";
			break;
		case "Valmacca":
			codice = "L633";
			break;
		case "Valmadrera":
			codice = "L634";
			break;
		case "Valmala":
			codice = "L636";
			break;
		case "Val Masino":
			codice = "L638";
			break;
		case "Valmontone":
			codice = "L639";
			break;
		case "Valmorea":
			codice = "L640";
			break;
		case "Valmozzola":
			codice = "L641";
			break;
		case "Valnegra":
			codice = "L642";
			break;
		case "Valpelline":
			codice = "L643";
			break;
		case "Valperga":
			codice = "L644";
			break;
		case "Valsavarenche":
			codice = "L647";
			break;
		case "Valsecca":
			codice = "L649";
			break;
		case "Valstagna":
			codice = "L650";
			break;
		case "Valstrona":
			codice = "L651";
			break;
		case "Valtopina":
			codice = "L653";
			break;
		case "Valtournenche":
			codice = "L654";
			break;
		case "Valtorta":
			codice = "L655";
			break;
		case "Valva":
			codice = "L656";
			break;
		case "Valvasone":
			codice = "L657";
			break;
		case "Valverde":
			codice = "L658";// L659
			break;
		case "Vandoies":
			codice = "L660";
			break;
		case "Vanzaghello":
			codice = "L664";
			break;
		case "Vanzago":
			codice = "L665";
			break;
		case "Vanzone Con San Carlo":
			codice = "L666";
			break;
		case "Vaprio D'Adda":
			codice = "L667";
			break;
		case "Vaprio D'Agogna":
			codice = "L668";
			break;
		case "Varallo":
			codice = "L669";
			break;
		case "Varallo Pombia":
			codice = "L670";
			break;
		case "Varano Borghi":
			codice = "L671";
			break;
		case "Varano Dè Melegari":
			codice = "L672";
			break;
		case "Varapodio":
			codice = "L673";
			break;
		case "Varazze":
			codice = "L675";
			break;
		case "Varco Sabino":
			codice = "L676";
			break;
		case "Varedo":
			codice = "L677";
			break;
		case "Varena":
			codice = "L678";
			break;
		case "Varenna":
			codice = "L680";
			break;
		case "Varese Ligure":
			codice = "L681";
			break;
		case "Varese":
			codice = "L682";
			break;
		case "Varisella":
			codice = "L685";
			break;
		case "Varmo":
			codice = "L686";
			break;
		case "Varna":
			codice = "L687";
			break;
		case "Varsi":
			codice = "L689";
			break;
		case "Varzi":
			codice = "L690";
			break;
		case "Varzo":
			codice = "L691";
			break;
		case "Vas":
			codice = "L692";
			break;
		case "Vasia":
			codice = "L693";
			break;
		case "Vastogirardi":
			codice = "L696";
			break;
		case "Vattaro":
			codice = "L697";
			break;
		case "Vauda Canavese":
			codice = "L698";
			break;
		case "Vazzano":
			codice = "L699";
			break;
		case "Vazzola":
			codice = "L700";
			break;
		case "Vecchiano":
			codice = "L702";
			break;
		case "Vedano Olona":
			codice = "L703";
			break;
		case "Vedano Al Lambro":
			codice = "L704";
			break;
		case "Veddasca":
			codice = "L705";
			break;
		case "Vedelago":
			codice = "L706";
			break;
		case "Vedeseta":
			codice = "L707";
			break;
		case "Veduggio con Colzano":
			codice = "L709";
			break;
		case "Veggiano":
			codice = "L710";
			break;
		case "Veglie":
			codice = "L711";
			break;
		case "Veglio":
			codice = "L712";
			break;
		case "Vejano":
			codice = "L713";
			break;
		case "Veleso":
			codice = "L715";
			break;
		case "Velezzo Lomellina":
			codice = "L716";
			break;
		case "Velletri":
			codice = "L719";
			break;
		case "Vellezzo Bellini":
			codice = "L720";
			break;
		case "Velo Veronese":
			codice = "L722";
			break;
		case "Velo D'Astico":
			codice = "L723";
			break;
		case "Velturno":
			codice = "L724";
			break;
		case "Venafro":
			codice = "L725";
			break;
		case "Venaus":
			codice = "L726";
			break;
		case "Venaria Reale":
			codice = "L727";
			break;
		case "Venarotta":
			codice = "L728";
			break;
		case "Venasca":
			codice = "L729";
			break;
		case "Vendone":
			codice = "L730";
			break;
		case "Vendrogno":
			codice = "L731";
			break;
		case "Venegono Inferiore":
			codice = "L733";
			break;
		case "Venegono Superiore":
			codice = "L734";
			break;
		case "Venetico":
			codice = "L735";
			break;
		case "Venezia":
			codice = "L736";
			break;
		case "Veniano":
			codice = "L737";
			break;
		case "Venosa":
			codice = "L738";
			break;
		case "Venticano":
			codice = "L739";
			break;
		case "Ventimiglia Di Sicilia":
			codice = "L740";
			break;
		case "Ventimiglia":
			codice = "L741";
			break;
		case "Ventotene":
			codice = "L742";
			break;
		case "Venzone":
			codice = "L743";
			break;
		case "Verano Brianza":
			codice = "L744";
			break;
		case "Verano":
			codice = "L745";
			break;
		case "Verbania":
			codice = "L746";
			break;
		case "Verbicaro":
			codice = "L747";
			break;
		case "Vercana":
			codice = "L748";
			break;
		case "Verceia":
			codice = "L749";
			break;
		case "Vercelli":
			codice = "L750";
			break;
		case "Vercurago":
			codice = "L751";
			break;
		case "Verdellino":
			codice = "L752";
			break;
		case "Verdello":
			codice = "L753";
			break;
		case "Verderio Inferiore":
			codice = "L755";
			break;
		case "Verderio Superiore":
			codice = "L756";
			break;
		case "Verduno":
			codice = "L758";
			break;
		case "Vergato":
			codice = "L762";
			break;
		case "Vergemoli":
			codice = "L763";
			break;
		case "Verghereto":
			codice = "L764";
			break;
		case "Vergiate":
			codice = "L765";
			break;
		case "Vermezzo":
			codice = "L768";
			break;
		case "Vermiglio":
			codice = "L769";
			break;
		case "Vernante":
			codice = "L771";
			break;
		case "Vernasca":
			codice = "L772";
			break;
		case "Vernate":
			codice = "L773";
			break;
		case "Vernazza":
			codice = "L774";
			break;
		case "Vernio":
			codice = "L775";
			break;
		case "Vernole":
			codice = "L776";
			break;
		case "Verolanuova":
			codice = "L777";
			break;
		case "Verolavecchia":
			codice = "L778";
			break;
		case "Verolengo":
			codice = "L779";
			break;
		case "Veroli":
			codice = "L780";
			break;
		case "Verona":
			codice = "L781";
			break;
		case "Verrayes":
			codice = "L783";
			break;
		case "Verretto":
			codice = "L784";
			break;
		case "Verrone":
			codice = "L785";
			break;
		case "Verrua Savoia":
			codice = "L787";
			break;
		case "Verrua Po":
			codice = "L788";
			break;
		case "Vertemate Con Minoprio":
			codice = "L792";
			break;
		case "Vertova":
			codice = "L795";
			break;
		case "Verucchio":
			codice = "L797";
			break;
		case "Veruno":
			codice = "L798";
			break;
		case "Vervio":
			codice = "L799";
			break;
		case "Vervò":
			codice = "L800";
			break;
		case "Verzegnis":
			codice = "L801";
			break;
		case "Verzino":
			codice = "L802";
			break;
		case "Verzuolo":
			codice = "L804";
			break;
		case "Vescovana":
			codice = "L805";
			break;
		case "Vescovato":
			codice = "L806";
			break;
		case "Vesime":
			codice = "L807";
			break;
		case "Vespolate":
			codice = "L808";
			break;
		case "Vessalico":
			codice = "L809";
			break;
		case "Vestenanova":
			codice = "L810";
			break;
		case "Vestignè":
			codice = "L811";
			break;
		case "Vestone":
			codice = "L812";
			break;
		case "Vestreno":
			codice = "L813";
			break;
		case "Vetralla":
			codice = "L814";
			break;
		case "Vetto":
			codice = "L815";
			break;
		case "Vezza D'Oglio":
			codice = "L816";
			break;
		case "Vezza D'Alba":
			codice = "L817";
			break;
		case "Vezzano Ligure":
			codice = "L819";
			break;
		case "Vezzano Sul Crostolo":
			codice = "L820";
			break;
		case "Vezzano":
			codice = "L821";
			break;
		case "Vezzi Portio":
			codice = "L823";
			break;
		case "Viadana":
			codice = "L826";
			break;
		case "Viadanica":
			codice = "L827";
			break;
		case "Viagrande":
			codice = "L828";
			break;
		case "Viale":
			codice = "L829";
			break;
		case "Vialfrè":
			codice = "L830";
			break;
		case "Viano":
			codice = "L831";
			break;
		case "Viareggio":
			codice = "L833";
			break;
		case "Viarigi":
			codice = "L834";
			break;
		case "Vibonati":
			codice = "L835";
			break;
		case "Vicalvi":
			codice = "L836";
			break;
		case "Vicari":
			codice = "L837";
			break;
		case "Vicchio":
			codice = "L838";
			break;
		case "Vicenza":
			codice = "L840";
			break;
		case "Vicoforte":
			codice = "L841";
			break;
		case "Vico Del Gargano":
			codice = "L842";
			break;
		case "Vico Nel Lazio":
			codice = "L843";
			break;
		case "Villa Literno":
			codice = "L844";
			break;
		case "Vico Equense":
			codice = "L845";
			break;
		case "Vicoli":
			codice = "L846";
			break;
		case "Vicolungo":
			codice = "L847";
			break;
		case "Vicopisano":
			codice = "L850";
			break;
		case "Vicovaro":
			codice = "L851";
			break;
		case "Vidigulfo":
			codice = "L854";
			break;
		case "Vidor":
			codice = "L856";
			break;
		case "Vidracco":
			codice = "L857";
			break;
		case "Vieste":
			codice = "L858";
			break;
		case "Vietri Di Potenza":
			codice = "L859";
			break;
		case "Vietri Sul Mare":
			codice = "L860";
			break;
		case "Viganella":
			codice = "L864";
			break;
		case "Vigano San Martino":
			codice = "L865";
			break;
		case "Viganò":
			codice = "L866";
			break;
		case "Vigarano Mainarda":
			codice = "L868";
			break;
		case "Vigasio":
			codice = "L869";
			break;
		case "Vigevano":
			codice = "L872";
			break;
		case "Viggianello":
			codice = "L873";
			break;
		case "Viggiano":
			codice = "L874";
			break;
		case "Viggiù":
			codice = "L876";
			break;
		case "Vighizzolo D'Este":
			codice = "L878";
			break;
		case "Vigliano D'Asti":
			codice = "L879";
			break;
		case "Vigliano Biellese":
			codice = "L880";
			break;
		case "Vignale Monferrato":
			codice = "L881";
			break;
		case "Vignanello":
			codice = "L882";
			break;
		case "Vignate":
			codice = "L883";
			break;
		case "Vignola":
			codice = "L885";
			break;
		case "Vignola Falesina":
			codice = "L886";
			break;
		case "Vignole Borbera":
			codice = "L887";
			break;
		case "Vignolo":
			codice = "L888";
			break;
		case "Vignone":
			codice = "L889";
			break;
		case "Vigo Di Cadore":
			codice = "L890";
			break;
		case "Vigodarzere":
			codice = "L892";
			break;
		case "Vigo Di Fassa":
			codice = "L893";
			break;
		case "Vigolo":
			codice = "L894";
			break;
		case "Vigolo Vattaro":
			codice = "L896";
			break;
		case "Vigolzone":
			codice = "L897";
			break;
		case "Vigone":
			codice = "L898";
			break;
		case "Vigonovo":
			codice = "L899";
			break;
		case "Vigonza":
			codice = "L900";
			break;
		case "Vigo Rendena":
			codice = "L903";
			break;
		case "Viguzzolo":
			codice = "L904";
			break;
		case "Villa Santa Lucia":
			codice = "L905";
			break;
		case "Villadossola":
			codice = "L906";
			break;
		case "Villa Di Chiavenna":
			codice = "L907";
			break;
		case "Villa Di Tirano":
			codice = "L908";
			break;
		case "Villa Santina":
			codice = "L909";
			break;
		case "Villa Agnedo":
			codice = "L910";
			break;
		case "Villa Bartolomea":
			codice = "L912";
			break;
		case "Villa Basilica":
			codice = "L913";
			break;
		case "Villabassa":
			codice = "L915";
			break;
		case "Villabate":
			codice = "L916";
			break;
		case "Villa Biscossi":
			codice = "L917";
			break;
		case "Villa Carcina":
			codice = "L919";
			break;
		case "Villa Castelli":
			codice = "L920";
			break;
		case "Villa Celiera":
			codice = "L922";
			break;
		case "Villachiara":
			codice = "L923";
			break;
		case "Villacidro":
			codice = "L924";
			break;
		case "Villa Collemandina":
			codice = "L926";
			break;
		case "Villa Cortese":
			codice = "L928";
			break;
		case "Villa D'Adda":
			codice = "L929";
			break;
		case "Villadeati":
			codice = "L931";
			break;
		case "Villa Del Bosco":
			codice = "L933";
			break;
		case "Villa Del Conte":
			codice = "L934";
			break;
		case "Villa Di Serio":
			codice = "L936";
			break;
		case "Villa Estense":
			codice = "L937";
			break;
		case "Villa D'Ogna":
			codice = "L938";
			break;
		case "Villadose":
			codice = "L939";
			break;
		case "Villafalletto":
			codice = "L942";
			break;
		case "Villa Faraldi":
			codice = "L943";
			break;
		case "Villafranca Sicula":
			codice = "L944";
			break;
		case "Villafranca D'Asti":
			codice = "L945";
			break;
		case "Villafranca In Lunigiana":
			codice = "L946";
			break;
		case "Villafranca Padovana":
			codice = "L947";
			break;
		case "Villafranca Piemonte":
			codice = "L948";
			break;
		case "Villafranca Di Verona":
			codice = "L949";
			break;
		case "Villafranca Tirrena":
			codice = "L950";
			break;
		case "Villafrati":
			codice = "L951";
			break;
		case "Villaga":
			codice = "L952";
			break;
		case "Villagrande Strisaili":
			codice = "L953";
			break;
		case "Villa Guardia":
			codice = "L956";
			break;
		case "Villa Lagarina":
			codice = "L957";
			break;
		case "Villalago":
			codice = "L958";
			break;
		case "Villalba":
			codice = "L959";
			break;
		case "Villalfonsina":
			codice = "L961";
			break;
		case "Villalvernia":
			codice = "L963";
			break;
		case "Villamagna":
			codice = "L964";
			break;
		case "Villamaina":
			codice = "L965";
			break;
		case "Villamar":
			codice = "L966";
			break;
		case "Villamarzana":
			codice = "L967";
			break;
		case "Villamassargia":
			codice = "L968";
			break;
		case "Villa Minozzo":
			codice = "L969";
			break;
		case "Villamiroglio":
			codice = "L970";
			break;
		case "Villandro":
			codice = "L971";
			break;
		case "Villanova Monferrato":
			codice = "L972";
			break;
		case "Villanova Del Battista":
			codice = "L973";
			break;
		case "Villanova Mondovì":
			codice = "L974";
			break;
		case "Villanova D'Albenga":
			codice = "L975";
			break;
		case "Villanova Del Sillaro":
			codice = "L977";
			break;
		case "Villanova Biellese":
			codice = "L978";
			break;
		case "Villanova Di Camposampiero":
			codice = "L979";
			break;
		case "Villanova Sull'Arda":
			codice = "L980";
			break;
		case "Villeneuve":
			codice = "L981";
			break;
		case "Villanova Canavese":
			codice = "L982";
			break;
		case "Villanova D'Ardenghi":
			codice = "L983";
			break;
		case "Villanova D'Asti":
			codice = "L984";
			break;
		case "Villanova Del Ghebbo":
			codice = "L985";
			break;
		case "Villanovaforru":
			codice = "L986";
			break;
		case "Villanovafranca":
			codice = "L987";
			break;
		case "Villanova Marchesana":
			codice = "L988";
			break;
		case "Villanova Monteleone":
			codice = "L989";
			break;
		case "Villanova Solaro":
			codice = "L990";
			break;
		case "Villanova Truschedu":
			codice = "L991";
			break;
		case "Villanova Tulo":
			codice = "L992";
			break;
		case "Villanterio":
			codice = "L994";
			break;
		case "Villanuova Sul Clisi":
			codice = "L995";
			break;
		case "Villaputzu":
			codice = "L998";
			break;
		case "Villar Dora":
			codice = "L999";
			break;

		}

	}

	private void codiciComuniZ(String comune) {

		switch (comune) {

		case "Zaccanopoli":
			codice = "M138";
			break;
		case "Zafferana Etnea":
			codice = "M139";
			break;
		case "Zagarise":
			codice = "M140";
			break;
		case "Zagarolo":
			codice = "M141";
			break;
		case "Zambana":
			codice = "M142";
			break;
		case "Zambrone":
			codice = "M143";
			break;
		case "Zandobbio":
			codice = "M144";
			break;
		case "Zanè":
			codice = "M145";
			break;
		case "Zanica":
			codice = "M147";
			break;
		case "Zapponeta":
			codice = "M267";
			break;
		case "Zavattarello":
			codice = "M150";
			break;
		case "Zeccone":
			codice = "M152";
			break;
		case "Zeddiani":
			codice = "M153";
			break;
		case "Zelbio":
			codice = "M156";
			break;
		case "Zelo Buon Persico":
			codice = "M158";
			break;
		case "Zelo Surrigone":
			codice = "M160";
			break;
		case "Zeme":
			codice = "M161";
			break;
		case "Zenevredo":
			codice = "M162";
			break;
		case "Zenson Di Piave":
			codice = "M163";
			break;
		case "Zerba":
			codice = "M165";
			break;
		case "Zerbo":
			codice = "M166";
			break;
		case "Zerbolò":
			codice = "M167";
			break;
		case "Zerfaliu":
			codice = "M168";
			break;
		case "Zeri":
			codice = "M169";
			break;
		case "Zermeghedo":
			codice = "M170";
			break;
		case "Zero Branco":
			codice = "M171";
			break;
		case "Zevio":
			codice = "M172";
			break;
		case "Ziano Di Fiemme":
			codice = "M173";
			break;
		case "Ziano Piacentino":
			codice = "L848";
			break;
		case "Zibello":
			codice = "M174";
			break;
		case "Zibido San Giacomo":
			codice = "M176";
			break;
		case "Zignago":
			codice = "M177";
			break;
		case "Zimella":
			codice = "M178";
			break;
		case "Zimone":
			codice = "M179";
			break;
		case "Zinasco":
			codice = "M180";
			break;
		case "Zoagli":
			codice = "M182";
			break;
		case "Zocca":
			codice = "M183";
			break;
		case "Zogno":
			codice = "M184";
			break;
		case "Zola Predosa":
			codice = "M185";
			break;
		case "Zoldo Alto":
			codice = "I345";
			break;
		case "Zollino":
			codice = "M187";
			break;
		case "Zone":
			codice = "M188";
			break;
		case "Zoppè Di Cadore":
			codice = "M189";
			break;
		case "Zoppola":
			codice = "M190";
			break;
		case "Zovencedo":
			codice = "M194";
			break;
		case "Zubiena":
			codice = "M196";
			break;
		case "Zuccarello":
			codice = "M197";
			break;
		case "Zuclo":
			codice = "M198";
			break;
		case "Zugliano":
			codice = "M199";
			break;
		case "Zuglio":
			codice = "M200";
			break;
		case "Zumaglia":
			codice = "M201";
			break;
		case "Zumpano":
			codice = "M202";
			break;
		case "Zungoli":
			codice = "M203";
			break;
		case "Zungri":
			codice = "M204";
			break;

		}

	}

}
