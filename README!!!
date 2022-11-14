Για να εκτελέσεις κώδικα σε JavaFX όταν κάνεις το compile πρέπει να συμπεριλάβεις το path όπου βρίσκονται 
τα module της JavaFX και τα modules που θες να χρησιμοποιήσεις. Τα modules βρίσκονται στον φάκελο libraries. 
Η ίδια διαδικασία πρέπει να ακολουθηθεί και για το\ην εκτέλεση.


MAC -> macOS (SDK aarch64)
WIN -> Windows (SDK x64)
LIN -> LINUX (SDK x64)


Π.χ. (Windows)

Όντως στον φάκελο DB-JAVAFX-JVDB και θέλοντας να κάνουμε compile το αρχείο Main.java , 
χρησιμοποιώντας το module javafx.controls (πάντα αυτό, αν χρησιμοποιήσεις και fxml αρχεία βάλε και το javafx.fxml
χωρισμένα με κόμμα *χωρίς* κενό) γράφουμε:

javac --module-path libraries/WIN_javafx-sdk-19/lib --add-modules javafx.controls Main.java

Έπειτα το εκτελούμε γράφοντας: 

java --module-path libraries/WIN_javafx-sdk-19/lib --add-modules javafx.controls Main
