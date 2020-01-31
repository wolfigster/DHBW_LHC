- Jede Komponente ist in einem separatem Unterverzeichnis
- Im Falle des MemorySticks sind dies die beiden Unterverzeichnisse exchange_component_01 & exchange_component_02
- Eine Komponente besteht aus dem Interface und der korrespondierenden Realisierung. Im Falle des MemorySticks sind diese IMemoryStick und MemorySticks
- Die Realisierung der Komponente beinhaltet einen Ort, welche die Service der Komponente entsprechenden Nutzern anbietet
- Der Port ist ein sogenannter "Distinct Interaction Point". Der Port implementiert das Interface.
- Der Port ist eine public Inner-Class in der Realisierung der Komponente. In dem Falle Port in MemoryStick
- Der Port deligiert eine Serviceanfrage an eine innere Methode der Komponente
- Die inneren Methoden einer Komponente haben die Sichtbarkeit private und sind folglich von Außen nicht aufrufbar. Durch diese Definition der Sichtbarkeit, wird das Prinzip der Kapselung einer Komponente realisiert
- Die Nichtinstanziierbarkeit einer Komponente wird durch folgende Technologie realisiert:
	* Sie definieren ein Attribut instancemit der Sichtbarkeit private und dem Schlüsselwort static -> private static CLASSNAME instance
	* Diesem Attribut instance weißt man eine Instanz unmittelbar in der Komponente zu. -> = new CLASSNAME
	// private static MemoryStick instance = new MemoryStick();
	
	* Eine Komponente wird nicht von Außen instanziiert (wie bei Klassen), sondern eine Komponente instanziiert sich per Definition selbst
	* Es wird eine statische Methode getInstance definitert, welche Reflection einen Zugriff auf dieses Attribut ermöglicht -> public static CLASSNAME getInstance()
	// public static MemoryStick getInstance() {
	//	return instance;
	// }
	* Es wird ein Attribut Port vom Typ Port mit der Sichtbarkeit public definiert
	// public Port port;
	* Da es sich bei dem Port um ein Komunikationskanal um die Außenwelt handelt ist die Sichtbarkeit des Attribut public (Öffentlich)
	* Da eine Komponente nicht instanziierbar ist wird der Constructor mit der Sichtbarkeit private definiert
	// private MemoryStick() {
	//	port = new Port();
	// }
	* Innerhalb des Constructors wird der Port instanziiert
	* Über diese Instanziierung des Ports ist es möglich, das Nutzer (von Außen) über den Port auf die in der Schnittstelle spezifizierten Services der Komponente von Außen zugreifen können
	* Um eine Komponente in einer Applikation zu nutzen brauche ich drei Attribute 
	// private Class clazz;
	// private Object instance;
	// private Object port;
	* Im ersten Schritt wird über den URLClassLoader und Class.forName die Klasse dynamisch aus dem Java-Archive geladen
	* Im zweiten Schritt wird die Methode getInstance aus der Komponente dynymisch aufgerufen und die statische Instanz der Komponente geladen
	* Im dritten Schritt lade ich die Referenz auf den Port
	
IntelliJ:
- Für die Automatisierung der Erstellung einer Komponente befindet sich in dem Ordner der Komponente eine Datei build.xml
- Diese build.xml wird in das IntelliJ Project über View -> Tool Windows -> Ant integriert
- Durch Doppelklick auf den Ant-Task wird die korrespondierende Aktion im Ant-Skript (build.xml) ausgeführt

Wichtig zum Training:
3 Komponente, 3 Verzeichnisse mit Komponente
> Native
> BoyerMoore
> KnuthMorrisPratt
SOLID beachten
2. Prinzip EMP

1. dynamisches laden der Komponente
2. Service über Experimentliste anwenden


- Zielsetzung einer leistungsfähigen Softwarearchitektur sind hohe Kohäsionen und minimale Kopplungen durch die Anwendung / Nutzung eines EventBus können dynamisch sogenannte Subscriber diesem hinzugefügt werden
- In der Service Orientierten Architetktur existiert eine Klasse, welche für die Verwaltung des EventBus verantwortlich ist. In dem vorliegenden Beispiel ist EmergencyCallBox die zentrale Instanz, welche den EventBus verwaltet
- Diese zentrale Instanz für die Verwaltung des EventBus besitzt einen Mechanismus (Methode) um neue Subscriber für den EventBus zu registrieren
- Die Klasse Subscriber ist abstrakt. Um einen konkreten Subscriber (wie im vorliegenden Beispiel FireBrigade und Police) zu instanziieren müssen diese eine spezielle Klasse der abstrakten Klasse Subscriber sein
- Ein konkreter Subscriber besitzt einen Mechanismus (Methode) um auf ein über den EvenBus gesandtes Event zu reagieren 