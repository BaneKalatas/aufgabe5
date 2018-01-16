package de.knabe;

import java.sql.Date;
import java.util.List;

import org.junit.Test;

import de.knabe.Resident;
import de.knabe.residentReposotorryStub;
import junit.framework.TestCase;

public class BaseResidentServiceTest extends TestCase {

	@Test
	public void testGetFilteredResidentsList() {
		BaseResidentService service = new BaseResidentService();
		Resident reTest = new Resident("Ma*", null, null, null, null);
		Resident reTest2 = new Resident();
		Resident reUnique = new Resident("David", null, null, null, null);
		Resident reUniqueThisTime = new Resident("David", "Wichmann", "Carl-Diem-Straße", "Furtwangen",
				new Date(98, 04, 28));

		residentReposotorryStub stubRR = new residentReposotorryStub();
		service.setResidentRepository(stubRR);

		List<Resident> filteredList = service.getFilteredResidentsList(reTest);
		for (Resident r : filteredList)
			System.out.println(r.getGivenName() + " " + r.getFamilyName() + ", " + r.getStreet() + " (" + r.getCity()
					+ ") [" + r.getDateOfBirth() + "]");
		System.out.println();
		filteredList = service.getFilteredResidentsList(reTest2);
		for (Resident r : filteredList)
			System.out.println(r.getGivenName() + " " + r.getFamilyName() + ", " + r.getStreet() + " (" + r.getCity()
					+ ") [" + r.getDateOfBirth() + "]");

		try {
			service.getUniqueResident(reTest);
		} catch (Exception e) {
			System.out.println(e);
		}
		try {
			System.out.println(service.getUniqueResident(reUniqueThisTime).getGivenName() + " "
					+ service.getUniqueResident(reUniqueThisTime).getFamilyName());
		} catch (Exception e) {
			System.out.println(e);
		}
		try {
			System.out.println(service.getUniqueResident(reUniqueThisTime).getGivenName() + " "
					+ service.getUniqueResident(reUniqueThisTime).getFamilyName());
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}