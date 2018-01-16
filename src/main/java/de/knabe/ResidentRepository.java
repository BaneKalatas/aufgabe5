package de.knabe;

import java.util.List;

import de.knabe.Resident;

/**
 * @author Stefan Betermieux
 */
public interface ResidentRepository {

  List<Resident> getResidents();

}