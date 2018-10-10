package Packege;

public class Person {
	int alter;
	private static Person instance = null;
	private Person(int alter) {
		this.alter = alter;
	}
	public static Person getInstance(int alter) {
		if(instance ==null) {
			instance = new Person(alter);
		}
		return instance;
	}
	public double getAlterInSekunden() {
		int jahr = 365;
		int Stunden = 24;
		int Minuten = 60;
		int Sekunden = 60;
		return this.alter*jahr*Stunden*Minuten*Sekunden;
	}
}
