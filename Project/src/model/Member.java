package model;

import java.io.Serializable;

/**
 * A class that store information about a member
 *
 * @author Tomas Masiar, Mihai Mihaila
 * @version 1.0
 */
public class Member implements Serializable
{
  private String first_name;
  private String last_name;
  private String ID;
  private boolean status;

  /**
   * Two-argument constructor initializing information for Member object
   *
   * @param first_name first name to initialize
   * @param last_name  last name to initialize
   */
  public Member(String first_name, String last_name)
  {
    this.first_name = first_name;
    this.last_name = last_name;
    this.ID = "";
    this.status = false;
  }

  /**
   * Three-argument constructor initializing information including status for Member object
   *
   * @param first_name first name to initialize
   * @param last_name  last name to initialize
   * @param status     status to initialize (false-guest, true-member)
   */
  public Member(String first_name, String last_name, boolean status)
  {
    this.first_name = first_name;
    this.last_name = last_name;
    this.status = status;
    this.ID = "";
  }

  /**
   * Sets the first name for Member object
   *
   * @param first_name first name to set
   */
  public void setFirstName(String first_name)
  {
    this.first_name = first_name;
  }

  /**
   * Gets the first name of the Member object
   *
   * @return first name as a String
   */
  public String getFirstName()
  {
    return first_name;
  }

  /**
   * Sets the last name for Member object
   *
   * @param last_name last name to set
   */
  public void setLastName(String last_name)
  {
    this.last_name = last_name;
  }

  /**
   * Gets the last name of the Member object
   *
   * @return last name as a String
   */
  public String getLastName()
  {
    return last_name;
  }

  /**
   * Sets the ID for Member object
   *
   * @param ID id to set
   */
  public void setID(String ID)
  {
    this.ID = ID;
  }

  /**
   * Gets the ID of the Member object
   *
   * @return id as a String
   */
  public String getID()
  {
    return ID;
  }

  /**
   * Sets the status for Member object
   *
   * @param status status to set (false-guest, true-member)
   */
  public void setStatus(boolean status)
  {
    this.status = status;
  }

  /**
   * Gets the status of the Member object
   *
   * @return status as a integer (false-guest, true-member)
   */
  public boolean getStatus()
  {
    return status;
  }

  /**
   * Checks if the Member is the same as the other Object
   *
   * @param obj the Object to check with
   * @return true if the Object obj is the same as the Member, else false
   */
  public boolean equals(Object obj)
  {
    if (obj == null || getClass() != obj.getClass())
    {
      return false;
    }

    Member other = (Member) obj;

    return first_name.equals(other.first_name) && last_name.equals(
        other.last_name) && ID.equals(other.ID) && status == other.status;
  }

  /**
   * Gets the information about Member object
   *
   * @return first and last name of the Member as a String
   */
  public String toString()
  {
    return first_name + " " + last_name;
  }
}
