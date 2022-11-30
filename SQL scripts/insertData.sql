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
INSERT INTO phones VALUES (19, '2104648346');
INSERT INTO phones VALUES (17, '2108757908');
INSERT INTO phones VALUES (15, '2104632121');

-- worker table 
INSERT INTO worker VALUES ('ΑΤ546357', 'Τζέλα', 'Δελαφράγκα', 90000.43, 1);
INSERT INTO worker VALUES ('ΑΟ489713', 'Λιλίκα', 'Καλλίτση', 7825.70, 1);
INSERT INTO worker VALUES ('ΑΒ789750', 'Σμαρούλα', 'Κολιάτσιυ', 4505.00, 1);
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
INSERT INTO worker VALUES ('ΑΕ231867', 'Χάινριχ', 'φον Σνίτσελ', 9121.45, 7);
INSERT INTO worker VALUES ('ΑΠ454875', 'Ντομινικ', 'Σεζάρ', 15815.45, 10);
INSERT INTO worker VALUES ('ΑΛ118355', 'Ανδρέας', 'Χαρίτος', 4812.45, 10);
INSERT INTO worker VALUES ('Α4154822', 'Μπία', 'Μπέκου', 1583.45, 10);
INSERT INTO worker VALUES ('ΑΚ548122', 'Μαρία', 'Χαρίτου', 1218.56, 11);
INSERT INTO worker VALUES ('ΑΤ512106', 'Καίτη', 'Τόνγκα', 1235.54, 11);
INSERT INTO worker VALUES ('ΑΤ459812', 'Σάββας', 'Κατσίκης', 7000.45, 11);
INSERT INTO worker VALUES ('ΑΤ459813', 'Αντώνης', 'Αντωνίου', 7100.45,10);
INSERT INTO worker VALUES ('ΑΠ348900', 'Βασίλης', 'Αργυρόπουλος', 8000.45,8);
INSERT INTO worker VALUES ('AH234511','Σοφία','Βέμπο',9000.00,7);
INSERT INTO worker VALUES ('AE012330','Κώστας','Bουτσάς',9100.98,6);
INSERT INTO worker VALUES ('AR097875','Ρένα','Γαλάνη',6000.89,6);


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
INSERT INTO driver VALUES ('ΑΟ489713','B','ABROAD',7);

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
