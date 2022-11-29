package model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * A class that stores all the Rental objects into a list
 * @author Cristian Josan
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
   * @param rent the Rent to add
   */
  public void addRent(Rental rent)
  {
    rentals.add(rent);
  }

  /**
   * Removes the Rental from the list
   * @param rental the Rental to remove
   * @return true if the Rental is removed, false if the Rental is not found
   */
  public boolean removeRental(Rental rental)
  {
    return  rentals.remove(rental);
  }

  /**
   * Gets the specified Rental from the list
   * @param rental the Rental to check with
   * @return the Rental if it is found, else null
   */
  public Rental getRental(Rental rental)
  {
    for (int i = 0; i < rentals.size(); i++)
    {
      if( rentals.get(i).equals(rental) )
        return rentals.get(i);
    }

    return null;
  }

  /**
   * Gets the Rental by Game from the list
   * @param game the Game to check with
   * @return the Rental if it is found by specified Game, else null
   */
  public Rental getRentalByGame(Game game)
  {
    for (int i = 0; i < rentals.size(); i++)
    {
      if( rentals.get(i).getGame().equals(game) )
        return rentals.get(i);
    }

    return null;
  }

  /**
   * Gets all the Rental objects by start period and end period from the list
   * @param start_period start period as a Date to check with
   * @param end_period end period as a Date to check with
   * @return all the Rental objects with the specified Date into a list
   */
  public ArrayList<Rental> getRentalsByDate(Date start_period, Date end_period)
  {
    ArrayList<Rental> rentalsByDate = new ArrayList<Rental>();

    for (int i = 0; i < rentals.size(); i++)
    {
      if( rentals.get(i).getStart_period().equals(start_period) && rentals.get(i).getEnd_period().equals(end_period) )
        rentalsByDate.add(rentals.get(i));
    }

    return rentalsByDate;
  }

  /**
   * Gets all the Rental objects by Member from the list
   * @param member the Member to check with
   * @return all the Rental objects with the specified Member into a list
   */
  public ArrayList<Rental> getRentalsByMember(Member member)
  {
    ArrayList<Rental> rentalsByMember = new ArrayList<Rental>();

    for (int i = 0; i < rentals.size(); i++)
    {
      if( rentals.get(i).getMember().equals(member) )
        rentalsByMember.add(rentals.get(i));
    }

    return rentalsByMember;
  }

  /**
   * Gets all the Rental objects from the list
   * @return all the Rental objects into a list
   */
  public ArrayList<Rental> getRentals()
  {
    return rentals;
  }
}
