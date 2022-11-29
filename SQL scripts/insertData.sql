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
INSERT INTO worker VALUES ('ΑΠ454875', 'Ντομινικ', 'Σεζάρ', 15815.45, 10);
INSERT INTO worker VALUES ('Α4154822', 'Μπία', 'Μπέκου', 1583.45, 10);
INSERT INTO worker VALUES ('ΑΤ512106', 'Καίτη', 'Τόνγκα', 1235.54, 11);
INSERT INTO worker VALUES ('ΑΤ459812', 'Σάββας', 'Κατσίκης', 7000.45, 11);