package model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * A class that stores all the Rental objects into a list
 *
 * @author Cristian Josan && Mihai Mihaila && Dominika Krullova
 * @version 1.0
 */
public class RentalList implements Serializable
{
  private ArrayList<Rental> rentals;

  /**
   * No-argument constructor initializing the list
   */
  public RentalList()
  {
    rentals = new ArrayList<Rental>();
  }

  /**
   * Adds the Rent to the list
   *
   * @param rent the Rent to add
   */
  public void addRent(Rental rent)
  {
    rentals.add(rent);
  }

  /**
   * Removes the Rental from the list
   *
   * @param rental the Rental to remove
   * @return true if the Rental is removed, false if the Rental is not found
   */
  public boolean removeRental(Rental rental)
  {
    return rentals.remove(rental);
  }

  

  /**
   * Gets all the Rental objects from the list
   *
   * @return all the Rental objects into a list
   */
  public ArrayList<Rental> getRentals()
  {
    return rentals;
  }
}
