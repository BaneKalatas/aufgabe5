package de.knabe;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class residentReposotorryStub implements ResidentRepository {
	List<Resident> residentso = new ArrayList<Resident>();
	public residentReposotorryStub() {
		Resident jonas = new Resident("jonas", "humble", "straße", "Ort", new Date(23, 6, 17));
		Resident karl = new Resident("karl", "bla", "straße3", "OrtA", new Date(17, 9, 23));
		Resident phillip = new Resident("phillip", "daThing", "straße6", "Ortblob", new Date(18, 4, 11));
		Resident peter = new Resident("peter", "foo", "straße2", "Ortasdf", new Date(3, 4, 15));
		residentso.add(jonas);
		residentso.add(peter);
		residentso.add(phillip);
		residentso.add(karl);
	}
	
	public List<Resident>getResidents() {
		return residentso;
	}
	
}
