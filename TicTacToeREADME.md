# SWP
TicTacToe

Verwendete Patterns: Singleton, Factory, Command und MVC

Die Patterns Singleton und Factory sind miteinander verbunden weil ich eine Singleton Factory für die Erzeugung meiner Symbole im TicTacToe
verwendet habe. Das Command Pattern wurde verwendet um die Züge Rückgängig zu machen. Jedoch habe ich es nicht integriert dass man einen
rückgängig gemachten Zut wieder herstellen kann. Die Methoden die benötigt wären sind integriert aber nicht die Abfrage an den Benutzer
Ebenso ist in der Verwendung des Spiels nicht möglich mehr als einen Zug rückgängig zu machen. Des könnte durch eine weitere eingabe 
gelöst werden fand ich jedoch nicht sinnvoll.
Das MVC Pattern ist integriert jedoch ist mir im Laufe des Programmierens passiert, dass im View einige Controller Funktionen integriert sind
