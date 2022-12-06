USE travel_agency;

-- branch table
INSERT INTO branch(br_street, br_num, br_city) VALUES ('Πεσμαζόγλου', 5, 'Αθήνα');
INSERT INTO branch(br_street, br_num, br_city) VALUES ('Αγίου Κωνσταντίνου', 22, 'Αθήνα');
INSERT INTO branch(br_street, br_city)         VALUES ('C. Ramos Marín', 'Málaga');
INSERT INTO branch(br_street, br_num, br_city) VALUES ('Εθνικής Αμύνης', 2, 'Θεσσαλονίκη');
INSERT INTO branch(br_street, br_num, br_city) VALUES ('Βασιλίσσης Όλγας', 150, 'Θεσσαλονίκη');
INSERT INTO branch(br_street, br_num, br_city) VALUES ('Bahnhofstraße', 20, 'Münster');
INSERT INTO branch(br_street, br_num, br_city) VALUES ('Glockengasse', 11, 'Köln');
INSERT INTO branch(br_street, br_num, br_city) VALUES ('Fidicinstraße', 40, 'Berlin');
INSERT INTO branch(br_street, br_num, br_city) VALUES ('Rue de la Gaité', 14, 'Paris');
INSERT INTO branch(br_street, br_num, br_city) VALUES ('Rue Delille', 19, 'Nice');
INSERT INTO branch(br_street, br_num, br_city) VALUES ('Επτανήσου', 12, 'Αθήνα');
INSERT INTO branch(br_street, br_num, br_city) VALUES ('Ερμού',45, 'Αθήνα');
INSERT INTO branch(br_street, br_num, br_city) VALUES ('Αυστραλίας',19,'Πάτρα');
INSERT INTO branch(br_street, br_num, br_city) VALUES ('Γούναρη',76,'Πάτρα');
INSERT INTO branch(br_street, br_num, br_city) VALUES ('Γρεβενών',34, 'Πάτρα');
INSERT INTO branch(br_street, br_num, br_city) VALUES ('Έλλης', 21,'Πάτρα');
INSERT INTO branch(br_street, br_num, br_city) VALUES ('Ευδόξου',56,'Πάτρα');
INSERT INTO branch(br_street, br_num, br_city) VALUES ('Ζακύνθου',78,'Πάτρα');
INSERT INTO branch(br_street, br_num, br_city) VALUES ('Ιπποκράτη',90,'Πάτρα');
INSERT INTO branch(br_street, br_num, br_city) VALUES ('Καλαμάτας',67,'Πάτρα');

-- phones table
INSERT INTO phones VALUES (1, '2104595120');
INSERT INTO phones VALUES (1, '6945399742');
INSERT INTO phones VALUES (2, '2101257976');
INSERT INTO phones VALUES (3, '9521558238');
INSERT INTO phones VALUES (4, '2310744561');
INSERT INTO phones VALUES (4, '2310481257');
INSERT INTO phones VALUES (4, '6942154732');
INSERT INTO phones VALUES (5, '2310893135');
INSERT INTO phones VALUES (5, '2310574566');
INSERT INTO phones VALUES (6, '2512046846');
INSERT INTO phones VALUES (6, '1761548588');
INSERT INTO phones VALUES (7, '1738415648');
INSERT INTO phones VALUES (8, '1805448921');
INSERT INTO phones VALUES (8, '3015644564');
INSERT INTO phones VALUES (9, '1864154156');
INSERT INTO phones VALUES (10, '8929090821');
INSERT INTO phones VALUES (11, '2104648549');
INSERT INTO phones VALUES (12, '2101818486');
INSERT INTO phones VALUES (13, '2610548963');
INSERT INTO phones VALUES (14, '2611228966');
INSERT INTO phones VALUES (15, '6941231821');
INSERT INTO phones VALUES (15, '2104632121');
INSERT INTO phones VALUES (16, '2610468549');
INSERT INTO phones VALUES (17, '2610412084');
INSERT INTO phones VALUES (17, '2610021050');
INSERT INTO phones VALUES (18, '2108757908');
INSERT INTO phones VALUES (19, '2610051054');
INSERT INTO phones VALUES (20, '2104648346');

-- worker table 
INSERT INTO worker VALUES ('ΑΤ546357', 'Τζέλα', 'Δελαφράγκα', 90000.43, 1);
INSERT INTO worker VALUES ('ΑΟ489713', 'Λιλίκα', 'Καλλίτση', 7825.70, 1);
INSERT INTO worker VALUES ('ΑΒ789750', 'Σμαρούλα', 'Κολιάτσoυ', 4505.00, 1);
INSERT INTO worker VALUES ('ΑΑ875155', 'Ελλάδα', 'Οικονόμου', 13243.45, 2);
INSERT INTO worker VALUES ('ΑΓ715638', 'Μήτσος', 'Παυλάτος', 4500.45, 2);
INSERT INTO worker VALUES ('ΑΞ785121', 'Χρόνης', 'Μπατσινίλας', 745.35, 2);
INSERT INTO worker VALUES ('ΑΓ777154', 'Στέλλα', 'Πριοβόλου', 5687.45, 3);
INSERT INTO worker VALUES ('ΑΤ574813', 'Αλέκα', 'Καλουδάκη', 8415.48, 3);
INSERT INTO worker VALUES ('ΑΤ154486', 'Πέτρος', 'Αθανασιάδης', 1569.16, 3);
INSERT INTO worker VALUES ('ΑΦ546847', 'Άννα', 'Ραγιά', 15889.12, 4);
INSERT INTO worker VALUES ('ΑΦ486513', 'Γιολάντα', 'Ραγιά', 2189.13, 4);
INSERT INTO worker VALUES ('ΑΞ748945', 'Γιάννης', 'Σωτηρόπουλος', 5469.16, 4);
INSERT INTO worker VALUES ('ΑΓ456483', 'Χριστίνα', 'Μαρκάτου', 1589.45, 5);
INSERT INTO worker VALUES ('ΑΡ154483', 'Σάσα', 'Παπαδήμα', 1566.45, 5);
INSERT INTO worker VALUES ('ΑΘ454855', 'Αντώνης', 'Καλουδάκης', 1548.45, 5);
INSERT INTO worker VALUES ('ΑΤ874122', 'Μπήλιω', 'Παπαδάκη', 2315.45, 6);
INSERT INTO worker VALUES ('AE012330','Κώστας','Bουτσάς',9100.98,6);
INSERT INTO worker VALUES ('AR097875','Ρένα','Γαλάνη',6000.89,6);
INSERT INTO worker VALUES ('ΑΕ231867', 'Χάινριχ', 'φον Σνίτσελ', 9121.45, 7);
INSERT INTO worker VALUES ('AH234511','Σοφία','Βέμπο',9000.00,7);
INSERT INTO worker VALUES ('ΑΣ180215','Λίτσα','Πατέρα', 6456.89,7);
INSERT INTO worker VALUES ('ΑΠ348900', 'Βασίλης', 'Αργυρόπουλος', 8000.45,8);
INSERT INTO worker VALUES ('ΑΗ484230', 'Παυλίνα', 'Κακουδάκη', 89612,8);
INSERT INTO worker VALUES ('ΑΞ474502', 'Δέσποινα', 'Βίσση', 78202.10,8);
INSERT INTO worker VALUES ('ΑΙ485610', 'Φώτο', 'Μπαρτζώκα', 89756, 9);
INSERT INTO worker VALUES ('ΑΛ448100', 'Μαίρη', 'Σκαρμούτσου', 1250, 9);
INSERT INTO worker VALUES ('ΑΔ458400', 'Μανωλία', 'Μπούρνοβα', 20014, 9);
INSERT INTO worker VALUES ('ΑΠ454875', 'Ντομινικ', 'Σεζάρ', 15815.45, 10);
INSERT INTO worker VALUES ('ΑΛ118355', 'Ανδρέας', 'Χαρίτος', 4812.45, 10);
INSERT INTO worker VALUES ('Α4154822', 'Μπία', 'Μπέκου', 1583.45, 10);
INSERT INTO worker VALUES ('ΑΚ548122', 'Μαρία', 'Χαρίτου', 1218.56, 11);
INSERT INTO worker VALUES ('ΑΤ512106', 'Καίτη', 'Τόνγκα', 1235.54, 11);
INSERT INTO worker VALUES ('ΑΤ459812', 'Σάββας', 'Κατσίκης', 7000.45, 11);
INSERT INTO worker VALUES ('ΑΤ459813', 'Αντώνης', 'Αντωνίου', 7100.45,12);
INSERT INTO worker VALUES ('ΑΔ150401', 'Άρης', 'Ζαφώλιας', 2186, 12);
INSERT INTO worker VALUES ('Φ5400521', 'Ρωξάνη', 'Ντάνου-Κουλουμπή', 89756, 12);
INSERT INTO worker VALUES ('Γ4800548', 'Ντίμης', 'Τσιμισκής-Χόφμαν', 99999, 13);
INSERT INTO worker VALUES ('Η5150412', 'Ρούλα', 'Κορομηλά', 89756, 13);
INSERT INTO worker VALUES ('Φ6234799', 'Καίτη', 'Κολεσίδου', 15015, 13);
INSERT INTO worker VALUES ('Π1580100', 'Μίλτος', 'Γιατζόγλου', 21588, 14);
INSERT INTO worker VALUES ('Γ4801089', 'Μάρω', 'Ανδρέου', 548.45, 14);
INSERT INTO worker VALUES ('Π5084000', 'Μαρτσέλο', 'Ανδρέου', 15015, 14);
INSERT INTO worker VALUES ('ΑΠ801088', 'Πόπη', 'Καμμένου', 1280.06, 15);
INSERT INTO worker VALUES ('ΑΚ188009', 'Γεράσιμος', 'Μαντάς', 2554.7, 15);
INSERT INTO worker VALUES ('ΞΗ148080', 'Ντίντα', 'Σερμπαντινα', 12500, 15);
INSERT INTO worker VALUES ('ΚΛ732429', 'Νίκος', 'Κελέσμιτος', 15040, 17);
INSERT INTO worker VALUES ('ΚΛ548805', 'Τάμυ', 'Τσανάκα', 7812.12, 16);
INSERT INTO worker VALUES ('ΠΞ480408', 'Ευδοκία ', 'Κουτσαγγελά', 2188.78, 16);
INSERT INTO worker VALUES ('ΓΗ480480', 'Μαρία', 'Μενούνος', 78520, 19);
INSERT INTO worker VALUES ('ΚΛ150805', 'Κορίνα', 'Μητροπούλου', 11080.78, 17);
INSERT INTO worker VALUES ('ΗΘ080440', 'Αλέκος', 'Παπαδήμας', 11045.78, 17);
INSERT INTO worker VALUES ('ΚΛ104085', 'Σωσώ', 'Παπαδήμα', 5085.78, 18);
INSERT INTO worker VALUES ('ΚΞ104200', 'Φώτης', 'Κουτσούμπας', 11508.48, 18);
INSERT INTO worker VALUES ('ΛΚ181829', 'Χαρούλα', 'Μπαρμπαγιαννακάκη', 1188.84, 18);
INSERT INTO worker VALUES ('ΗΓ158048', 'Βικτώρια', 'Γιακουματος', 11508.48, 16);
INSERT INTO worker VALUES ('ΗΞ840121', 'Θανάσης', 'Μπαλαφούτης', 15565, 19);
INSERT INTO worker VALUES ('ΗΞ744133', 'Ελένη', 'Βλαχάκη', 26901.45, 19);
INSERT INTO worker VALUES ('ΞΚ754258', 'Άννα', 'της 17η Νοέμβρη', 8489.33, 20);
INSERT INTO worker VALUES ('ΗΓ745515', 'Νώντας', 'Περιστερόπουλος', 7512.78, 20);
INSERT INTO worker VALUES ('ΚΗ787512', 'Πέγκυ', 'Καρρά', 71218.78, 20);

-- driver table
INSERT INTO driver VALUES ('ΑΤ459812','A','LOCAL',3);
INSERT INTO driver VALUES ('ΑΤ512106','B','ABROAD',4);
INSERT INTO driver VALUES ('ΑΠ454875','C','LOCAL',2);
INSERT INTO driver VALUES ('ΑΛ118355','D','ABROAD',3);
INSERT INTO driver VALUES ('ΑΤ546357','A','LOCAL',5);
INSERT INTO driver VALUES ('AE012330','C','LOCAL',6);
INSERT INTO driver VALUES ('ΑΠ348900','A','ABROAD',3);
INSERT INTO driver VALUES ('ΑΦ486513','C','LOCAL',7);
INSERT INTO driver VALUES ('ΑΤ154486','D','ABROAD',9);
INSERT INTO driver VALUES ('ΑΓ777154','A','LOCAL',6);
INSERT INTO driver VALUES ('ΑΗ484230','B','ABROAD',7);
INSERT INTO driver VALUES ('ΚΛ104085','A','ABROAD',4);
INSERT INTO driver VALUES ('AH234511','B','LOCAL',7);
INSERT INTO driver VALUES ('ΑΘ454855','C','ABROAD',2);
INSERT INTO driver VALUES ('ΑΞ785121','D','LOCAL',10);
INSERT INTO driver VALUES ('Π1580100','A','ABROAD',4);
INSERT INTO driver VALUES ('Γ4800548','B','LOCAL',3);
INSERT INTO driver VALUES ('ΛΚ181829','C','ABROAD',9);
INSERT INTO driver VALUES ('ΚΛ150805','D','LOCAL',4);
INSERT INTO driver VALUES ('ΚΗ787512','A','ABROAD',8);
INSERT INTO driver VALUES ('ΑΡ154483','C','LOCAL',4);

-- guide table
INSERT INTO guide VALUES ('ΑΡ154483','Friendly');
INSERT INTO guide VALUES ('ΑΤ459812','Kind');
INSERT INTO guide VALUES ('ΑΑ875155','Helpful');
INSERT INTO guide VALUES ('ΑΚ548122','Hardworking');
INSERT INTO guide VALUES ('ΑΤ874122','Smart');
INSERT INTO guide VALUES ('ΑΞ748945','Devoted');
INSERT INTO guide VALUES ('ΑΒ789750','Multilingual');
INSERT INTO guide VALUES ('AR097875','Experienced');
INSERT INTO guide VALUES ('AH234511','Kind');
INSERT INTO guide VALUES ('ΑΓ456483','Polite');
INSERT INTO guide VALUES ('Φ6234799','Multilingual');
INSERT INTO guide VALUES ('ΑΓ777154','Devoted');
INSERT INTO guide VALUES ('ΞΚ754258','Kind');
INSERT INTO guide VALUES ('ΑΚ188009','Polite');
INSERT INTO guide VALUES ('ΚΞ104200','Smart');
INSERT INTO guide VALUES ('ΗΞ744133','Helpful');
INSERT INTO guide VALUES ('ΚΛ548805','Experienced');
INSERT INTO guide VALUES ('ΑΣ180215','Master in Astrology');
INSERT INTO guide VALUES ('ΓΗ480480','Friendly');
INSERT INTO guide VALUES ('Φ6234799','Smart');

-- languages table
INSERT INTO languages VALUES ('ΑΡ154483', 'Ελληνικά');
INSERT INTO languages VALUES ('ΑΡ154483', 'Αγγλικά');
INSERT INTO languages VALUES ('ΑΤ459812', 'Ελληνικά');
INSERT INTO languages VALUES ('ΑΤ459812', 'Γαλλικά');
INSERT INTO languages VALUES ('ΑΑ875155', 'Ελληνικά');
INSERT INTO languages VALUES ('ΑΑ875155', 'Γερμανικά');
INSERT INTO languages VALUES ('ΑΑ875155', 'Ιταλικά');
INSERT INTO languages VALUES ('ΑΚ548122', 'Ελληνικά');
INSERT INTO languages VALUES ('ΑΚ548122', 'Αγγλικά');
INSERT INTO languages VALUES ('ΑΚ548122', 'Γερμανικά');
INSERT INTO languages VALUES ('ΑΚ548122', 'Ρώσικα');
INSERT INTO languages VALUES ('ΑΤ874122', 'Αγγλικά');
INSERT INTO languages VALUES ('ΑΞ748945', 'Ελληνικά');
INSERT INTO languages VALUES ('ΑΞ748945', 'Αγγλικά');
INSERT INTO languages VALUES ('ΑΞ748945', 'Ισπανικά');
INSERT INTO languages VALUES ('ΑΒ789750', 'Ελληνικά');
INSERT INTO languages VALUES ('ΑΒ789750', 'Αγγλικά');
INSERT INTO languages VALUES ('ΑΒ789750', 'Ιαπωνικά');
INSERT INTO languages VALUES ('AR097875', 'Ελληνικά');
INSERT INTO languages VALUES ('AR097875', 'Αγγλικά');
INSERT INTO languages VALUES ('AR097875', 'Σουηδικά');
INSERT INTO languages VALUES ('AR097875', 'Ιταλικά');
INSERT INTO languages VALUES ('AH234511', 'Τούρκικα');
INSERT INTO languages VALUES ('AH234511', 'Βουλγάρικα');
INSERT INTO languages VALUES ('AH234511', 'Αγγλικά');
INSERT INTO languages VALUES ('ΑΓ456483', 'Ελληνικά');
INSERT INTO languages VALUES ('ΑΓ456483', 'Αγγλικά');
INSERT INTO languages VALUES ('ΑΓ456483', 'Αλβανικά');
INSERT INTO languages VALUES ('Φ6234799', 'Αλβανικά');
INSERT INTO languages VALUES ('Φ6234799', 'Ελληνικά');
INSERT INTO languages VALUES ('Φ6234799', 'Αγγλικά');
INSERT INTO languages VALUES ('Φ6234799', 'Γερμανικά');
INSERT INTO languages VALUES ('Φ6234799', 'Γαλλικά');
INSERT INTO languages VALUES ('ΑΓ777154', 'Σουηδικά');
INSERT INTO languages VALUES ('ΑΓ777154', 'Αγγλικά');
INSERT INTO languages VALUES ('ΞΚ754258', 'Δανικά');
INSERT INTO languages VALUES ('ΞΚ754258', 'Πολωνικά');
INSERT INTO languages VALUES ('ΑΚ188009', 'Αγγλικά');
INSERT INTO languages VALUES ('ΑΚ188009', 'Ελληνικά');
INSERT INTO languages VALUES ('ΑΚ188009', 'Ιταλικά');
INSERT INTO languages VALUES ('ΚΞ104200', 'Ιταλικά');
INSERT INTO languages VALUES ('ΚΞ104200', 'Ισπανικά');
INSERT INTO languages VALUES ('ΚΞ104200', 'Αγγλικά');
INSERT INTO languages VALUES ('ΚΛ548805', 'Αγγλικά');
INSERT INTO languages VALUES ('ΚΛ548805', 'Κορεάτικα');
INSERT INTO languages VALUES ('ΚΛ548805', 'Ελληνικά');
INSERT INTO languages VALUES ('ΑΣ180215', 'Ελληνικά');
INSERT INTO languages VALUES ('ΑΣ180215', 'Αγγλικά');
INSERT INTO languages VALUES ('ΑΣ180215', 'Τούρκικα');
INSERT INTO languages VALUES ('ΓΗ480480', 'Τούρκικα');
INSERT INTO languages VALUES ('ΓΗ480480', 'Ελληνικά');
INSERT INTO languages VALUES ('ΓΗ480480', 'Αγγλικά');
INSERT INTO languages VALUES ('ΗΞ744133', 'Ελληνικά');
INSERT INTO languages VALUES ('ΗΞ744133', 'Ιταλικά');

-- admin table
INSERT INTO admin VALUES ('ΑΔ150401','ACCOUNTING','Master in Economics');
INSERT INTO admin VALUES ('ΑΙ485610','ACCOUNTING','Accountant');
INSERT INTO admin VALUES ('ΑΛ448100','ACCOUNTING','Accountant');
INSERT INTO admin VALUES ('AR097875','ACCOUNTING','PhD in Economics');
INSERT INTO admin VALUES ('ΑΓ715638','LOGISTICS','Master in Economics');
INSERT INTO admin VALUES ('Η5150412','LOGISTICS','Master in Logistics');
INSERT INTO admin VALUES ('Π1580100','LOGISTICS','Logistics & Supply Chain Management');
INSERT INTO admin VALUES ('Π5084000','LOGISTICS','INTERNATIONAL DIPLOMA IN LOGISTICS AND TRANSPORT');
INSERT INTO admin VALUES ('ΗΓ745515','ADMINISTRATIVE','Master in business administration');
INSERT INTO admin VALUES ('Γ4800548','ADMINISTRATIVE','Master in business administration');
INSERT INTO admin VALUES ('ΑΞ474502','ADMINISTRATIVE','Master in business administration');
INSERT INTO admin VALUES ('ΚΛ150805','ADMINISTRATIVE','Business administration');

-- manages table
INSERT INTO manages VALUES ('Η5150412', 1);
INSERT INTO manages VALUES ('ΑΙ485610', 1);
INSERT INTO manages VALUES ('ΚΛ150805', 1);
INSERT INTO manages VALUES ('ΑΓ715638', 2);
INSERT INTO manages VALUES ('ΑΔ150401', 2);
INSERT INTO manages VALUES ('ΑΞ474502', 2);
INSERT INTO manages VALUES ('Π5084000', 3);
INSERT INTO manages VALUES ('ΑΔ150401', 3);
INSERT INTO manages VALUES ('ΑΞ474502', 3);
INSERT INTO manages VALUES ('Η5150412', 4);
INSERT INTO manages VALUES ('ΑΛ448100', 4);
INSERT INTO manages VALUES ('ΗΓ745515', 4);
INSERT INTO manages VALUES ('Π1580100', 5);
INSERT INTO manages VALUES ('AR097875', 5);
INSERT INTO manages VALUES ('ΚΛ150805', 5);
INSERT INTO manages VALUES ('Π1580100', 6);
INSERT INTO manages VALUES ('ΑΙ485610', 6);
INSERT INTO manages VALUES ('ΑΞ474502', 6);
INSERT INTO manages VALUES ('Η5150412', 7);
INSERT INTO manages VALUES ('ΑΔ150401', 7);
INSERT INTO manages VALUES ('ΚΛ150805', 7);
INSERT INTO manages VALUES ('Π1580100', 8);
INSERT INTO manages VALUES ('ΑΔ150401', 8);
INSERT INTO manages VALUES ('Γ4800548', 8);
INSERT INTO manages VALUES ('Π5084000', 9);
INSERT INTO manages VALUES ('AR097875', 9);
INSERT INTO manages VALUES ('ΑΞ474502', 9);
INSERT INTO manages VALUES ('Π1580100', 10);
INSERT INTO manages VALUES ('ΑΙ485610', 10);
INSERT INTO manages VALUES ('Γ4800548', 10);
INSERT INTO manages VALUES ('Η5150412', 11);
INSERT INTO manages VALUES ('AR097875', 11);
INSERT INTO manages VALUES ('ΗΓ745515', 11);
INSERT INTO manages VALUES ('Η5150412', 12);
INSERT INTO manages VALUES ('ΑΙ485610', 12);
INSERT INTO manages VALUES ('ΚΛ150805', 12);
INSERT INTO manages VALUES ('Η5150412', 13);
INSERT INTO manages VALUES ('ΑΙ485610', 13);
INSERT INTO manages VALUES ('Γ4800548', 13);
INSERT INTO manages VALUES ('ΑΓ715638', 14);
INSERT INTO manages VALUES ('ΑΔ150401', 14);
INSERT INTO manages VALUES ('ΚΛ150805', 14);
INSERT INTO manages VALUES ('Π5084000', 15);
INSERT INTO manages VALUES ('ΑΛ448100', 15);
INSERT INTO manages VALUES ('ΗΓ745515', 15);
INSERT INTO manages VALUES ('ΑΓ715638', 16);
INSERT INTO manages VALUES ('ΑΔ150401', 16);
INSERT INTO manages VALUES ('ΚΛ150805', 16);
INSERT INTO manages VALUES ('Π5084000', 17);
INSERT INTO manages VALUES ('ΑΔ150401', 17);
INSERT INTO manages VALUES ('ΗΓ745515', 17);
INSERT INTO manages VALUES ('Π5084000', 18);
INSERT INTO manages VALUES ('ΑΛ448100', 18);
INSERT INTO manages VALUES ('ΑΞ474502', 18);
INSERT INTO manages VALUES ('Π1580100', 19);
INSERT INTO manages VALUES ('AR097875', 19);
INSERT INTO manages VALUES ('ΚΛ150805', 19);
INSERT INTO manages VALUES ('Η5150412', 20);
INSERT INTO manages VALUES ('ΑΛ448100', 20);
INSERT INTO manages VALUES ('Γ4800548', 20);

-- trip table
INSERT INTO trip VALUES(NULL, "2023-01-15 06:00:00", "2023-01-22 20:30:00", 50, 150.67, 13, "ΑΓ456483", "ΑΓ777154");
INSERT INTO trip VALUES(NULL, "2022-12-24 09:00:00", "2023-01-03 20:30:00", 100, 670.69, 2, "ΑΤ459812", "Π1580100");

-- event table
INSERT INTO event VALUES(2, "2022-12-31 22:30:00", "2023-01-01 05:00:00", "Η γαλλική πρακτική να πυρπολούν αυτοκίνητα στις αρχές του νέου έτους ξεκίνησε τη δεκαετία του 1990 στην περιοχή γύρω από το Στρασβούργο, σε γειτονιές με χαμηλό εισόδημα. Στη συνέχεια το «έθιμο» εξαπλώθηκε στην υπόλοιπη χώρα ως ένδειξη διαμαρτυρίας. Κατά τη διάρκεια των διαδηλώσεωντο φθινόπωρο του 2005, η αστυνομία ανακοίνωσε ότι σχεδόν 9.000 οχήματα πυρπολήθηκαν κατά τη διάρκεια των αναταραχών.");

-- destination table
INSERT INTO destination VALUES(NULL, "Αθήνα", "Διάσημη για τους παγκοσμίου φήμης αρχαιολογικούς θησαυρούς της, η Αθήνα αποτελεί μια από τις πιο συναρπαστικές πόλεις της Ευρώπης, με πολλές και διαφορετικές πλευρές, μια συναρπαστική γαστρονομική σκηνή και νέες γειτονιές που θα λατρέψεις να ανακαλύπτεις.", "LOCAL", "Ελληνικά", NULL);
INSERT INTO destination VALUES(NULL, "Θεσσαλονίκη", "Στη Βόρεια Ελλάδα, με έδρα της τη Μακεδονία, υπάρχει μια πόλη που όμοιά της δεν υπάρχει σε ολόκληρη την Ελλάδα. Μια τεράστια πολιτισμική «μαρμίτα» είναι η Θεσσαλονίκη, όπου όνειρα, ιδέες, οράματα και τάσεις κοχλάζουν υπόγεια σε μία εναλλακτική σκηνή. Μες στο πλήθος και στους δρόμους, θα διαβάσετε την ιστορία της: Θερμαϊκός κόλπος, Λευκός Πύργος, λεωφόρος Νίκης, πλατεία Αριστοτέλους, οδός Μητροπόλεως, οδός Τσιμισκή, Λαδάδικα, Αγορά Μοδιάνο, Μπιτ Παζάρ, Άνω Πόλη.", "LOCAL", "Ελληνικά", 1);
INSERT INTO destination VALUES(NULL, "Παρίσι", "Η Γαλλία είναι μια χώρα με την οποία σχεδόν κάθε ταξιδιώτης έχει μια σχέση. Υπάρχουν αμέτρητα καφέ, γραφικά χωριά και η παγκοσμίου φήμης γαστρονομία. Μερικοί έρχονται για τους μεγάλους φιλοσόφους της Γαλλίας, τους συγγραφείς και τους καλλιτέχνες, ή για να βυθιστούν σε μια από τις ομορφότερες γλώσσες του κόσμου. Και άλλοι έρχονται για την γεωγραφική ποικιλομορφία της χώρας, με τις μεγάλες ακτές, τις τεράστιες οροσειρές και τις εκπληκτικές εκτάσεις γεωργικής γης.", "ABROAD", "Γαλλικά", NULL);

-- travel_to table
INSERT INTO travel_to VALUES(1, 1, "2023-01-18 15:30:00", "2023-01-15 08:00:00");
INSERT INTO travel_to VALUES(1, 2, "2023-01-22 17:00:00", "2023-01-18 15:30:00");
INSERT INTO travel_to VALUES(2, 3, "2023-01-03 21:30:00", "2022-12-24 07:00:00");