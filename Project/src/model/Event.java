package model;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * A class that stores information about an event
 *
 * @author Dominika Krullova && Mihai Mihaila
 * @version 1.0
 */
public class Event implements Serializable
{
  private String name;
  private String description;
  private Date date;
  private ArrayList<Member> members;
  private Game game;

  /**
   * Three-argument constructor initializing information for Event object
   *
   * @param name        name to initialize
   * @param description description to initialize
   * @param date        date as a Date object to initialize
   */
  public Event(String name, String description, Date date)
  {
    this.name = name;
    this.description = description;
    this.date = date;
    this.game = null;
    this.members = new ArrayList<Member>();
  }

  /**
   * Adds a Member to the members list for the Event object
   *
   * @param member the Member to add
   */
  public void addParticipant(Member member)
  {
    members.add(member);
  }

  /**
   * Retrieves the first and last name of the member that attends the Event
   * @return first and last name of the member as a String
   */
  public String getMembers()
  {
    String aux = "";
    if (members != null)
    {
      for (int i = 0; i < members.size(); i++)
      {
        aux +=
            members.get(i).getFirstName() + " " + members.get(i).getLastName()
                + "\n";
      }
    }
    return aux;
  }

  /**
   * Retrieves all members that attends the Event
   * @return all the members as an ArrayList of Member object
   */
  public ArrayList<Member> getMembersArray()
  {
    return members;
  }

  /**
   * Removes a Member from the members list for the Event object
   *
   * @param member the Member to remove
   * @return true if the Member is removed, false if the Member is not found
   */
  public boolean removeParticipant(Member member)
  {
    for (int i = 0; i < members.size(); i++)
    {
      if (members.get(i).equals(member))
      {
        members.remove(i);
        return true;
      }
    }

    return false;
  }

  /**
   * Sets a Game for the Event object
   *
   * @param game the Game to add
   */
  public void setGame(Game game)
  {
    this.game = game;
  }

  /**
   * Gets the game of the Event object
   *
   * @return game as a Game object
   */
  public Game getGame()
  {
    return game;
  }

  /**
   * Sets the name for the Event object
   *
   * @param name name to set
   */
  public void setName(String name)
  {
    this.name = name;
  }

  /**
   * Gets the name of the Event object
   *
   * @return name as a string
   */
  public String getName()
  {
    return name;
  }

  /**
   * Sets the description for the Event object
   *
   * @param description description to set
   */
  public void setDescription(String description)
  {
    this.description = description;
  }

  /**
   * Gets the description of the Event object
   *
   * @return description as a string
   */
  public String getDescription()
  {
    return description;
  }

  /**
   * Sets the date for the Event object
   *
   * @param date date to set
   */
  public void setDate(Date date)
  {
    this.date = date;
  }

  /**
   * Gets the date of the Event object
   *
   * @return date as a Date object
   */
  public Date getDate()
  {
    return date;
  }

  /**
   * Checks if the Event is the same as the other Object
   *
   * @param obj the Object to check with
   * @return true if the Object obj is the same as the Event, else false
   */
  public boolean equals(Object obj)
  {
    if (obj == null || getClass() != obj.getClass())
    {
      return false;
    }

    Event other = (Event) obj;
    if (game != null && other.game != null)
    {
      return name.equals(other.name) && description.equals(other.description)
          && date.equals(other.date) && members.equals(other.members)
          && game.equals(other.game);
    }
    else
    {
      return name.equals(other.name) && description.equals(other.description)
          && date.equals(other.date) && members.equals(other.members);
    }
  }

  /**
   * Gets the information about the Event object
   *
   * @return information as a String
   */
  public String toString()
  {
    return name;
  }
}
