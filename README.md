**Version: 2.0**
**Writer: Lazaros Topalis**
**Date: 17.12.2022**

# Execute Instructions

Οδηγίες εκτέλεσης JavaFX στο τερματικό και στο VScode με όλες τις βιβλιοθήκες (JavaFX, JDBC, fontawesome).

## Terminal

### Makefile (*Δουλεύει σε Windows και Linux.*)

Εφόσον έχεις ακολουθήσει τις οδηγίες για την εγκατάσταση του make στα Windows (στο Linux υπάρχει by default), απλά γράφεις στην κονσόλα
```bash
make
```
και λειτουργεί. Στο τέλος διαγράφει και τα περιττά αρχεία .class. *Δουλεύει σε Windows και Linux.*

### Windows

```java
javac --module-path ./libraries/WIN_javafx-sdk-19/lib --add-modules javafx.fxml,javafx.controls *.java

java --module-path ./libraries/WIN_javafx-sdk-19/lib --add-modules javafx.fxml,javafx.controls -cp "$(pwd);./libraries/WIN_javafx-sdk-19/lib/mysql-connector-java-8.0.23.jar;./libraries/WIN_javafx-sdk-19/lib/javafx.graphics.jar;./libraries/WIN_javafx-sdk-19/lib/javafx-swt.jar;./libraries/WIN_javafx-sdk-19/lib/fontawesomefx-commons-9.1.2.jar;./libraries/WIN_javafx-sdk-19/lib/javafx.web.jar;./libraries/WIN_javafx-sdk-19/lib/javafx.fxml.jar;./libraries/WIN_javafx-sdk-19/lib/javafx.media.jar;./libraries/WIN_javafx-sdk-19/lib/javafx.swing.jar;./libraries/WIN_javafx-sdk-19/lib/fontawesomefx-fontawesome-4.7.0-9.1.2.jar;./libraries/WIN_javafx-sdk-19/lib/javafx.controls.jar;./libraries/WIN_javafx-sdk-19/lib/javafx.base.jar" Main
```

### Linux

```java
javac --module-path ./libraries/LIN_javafx-sdk-19/lib --add-modules javafx.fxml,javafx.controls *.java

java --module-path libraries/LIN_javafx-sdk-19/lib --add-modules javafx.fxml,javafx.controls -cp "$(pwd):./libraries/LIN_javafx-sdk-19/lib/javafx.graphics.jar:./libraries/LIN_javafx-sdk-19/lib/javafx.controls.jar:./libraries/LIN_javafx-sdk-19/lib/javafx.web.jar:./libraries/LIN_javafx-sdk-19/lib/fontawesomefx-commons-9.1.2.jar:./libraries/LIN_javafx-sdk-19/lib/mysql-connector-java-8.0.23.jar:./libraries/LIN_javafx-sdk-19/lib/javafx.base.jar:./libraries/LIN_javafx-sdk-19/lib/fontawesomefx-fontawesome-4.7.0-9.1.2.jar:./libraries/LIN_javafx-sdk-19/lib/javafx-swt.jar:./libraries/LIN_javafx-sdk-19/lib/javafx.swing.jar:./libraries/LIN_javafx-sdk-19/lib/javafx.fxml.jar:./libraries/LIN_javafx-sdk-19/lib/javafx.media.jar" Main
```

### Mac

*Under Constraction*

## VScode

Στην αριστερή πλευρά του VScode, εκεί που είναι τα αρχεία σου τέρμα κάτω φυσιολογικά θα βλέπεις ένα tab με όνομα JAVA PROJECTS. Πατώντας εκεί πάνω εμφανίζεται ένα άλλο μενού με το όνομα του Project (λογικά αν το κατέβασες από το github θα γράφει DB-JavaFX-JDBC). Πατώντας εκεί πάνω, τέρμα κάτω βλέπεις ένα μενού με όνομα Referenced Libraries. Δίπλα του αν πας το ποντίκι σου έχει έναν σταυρό. Πατάς εκεί πάνω και πηγαίνεις στον φάκελο *libraries\WIN_javafx-sdk-19\lib* που υπάρχει στο Project. Από εκεί επιλέγεις όλα τα αρχεία και πατάς "*Select JAR libraries*". Τέλος, επιστρέφεις στο VScode και στην αριστερή πλευρά (πιο αριστερά από εκεί που είναι τα αρχεία του Project) επέλεξε το τέταρτο εικονίδιο που δείχνει ένα βελάκι (το play) με ένα σκαθάρι και πάτα πάνω στο *create a launch.json file* και μετά Java. Στο αρχείο που δημιουργήθηκε, μέσα στο "*configurations*", μέσα στο δεύτερο άγκιστρο και κάτω από το "*projectName*" προσθέτεις την εξής γραμμή 
```bash 
"vmArgs": "--module-path ./libraries/WIN_javafx-sdk-19/lib --add-modules javafx.fxml,javafx.controls" 
```
Μην ξεχάσεις να βάλεις κόμμα στο τέλος της προηγούμενης γραμμής. Έπειτα μπορείς να τρέχεις το πρόγραμμα από το κουμπάκι.