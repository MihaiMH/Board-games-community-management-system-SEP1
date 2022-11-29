package model;

import java.io.Serializable;

/**
 * A class that stores information about game
 * @author Cristian Josan
 * @version 1.0
 */
public class Game implements Serializable
{
  private String name;
  private String description;
  private int maxPlayers;
  private int status;

  /**
   * Three-argument constructor initializing information for Game object
   * @param name name to initialize
   * @param description description to initialize
   * @param maxPlayers maximum number of players to initialize
   */
  public Game(String name, String description, int maxPlayers)
  {
    this.name = name;
    this.description = description;
    this.maxPlayers = maxPlayers;
    status = 0;
  }

  /**
   * Four-argument constructor initializing information including status for Game object
   * @param name name to initialize
   * @param description description to initialize
   * @param maxPlayers maximum number of players to initialize
   * @param status status to initialize (unavailable/available/reserved/rented)
   */
  public Game(String name, String description, int maxPlayers, int status)
  {
    this.name = name;
    this.description = description;
    this.maxPlayers = maxPlayers;
    this.status = status;
  }

  /**
   * Sets the name for Game object
   * @param name name to set
   */
  public void setName(String name)
  {
    this.name = name;
  }

  /**
   * Gets the name of the Game object
   * @return name as a String
   */
  public String getName()
  {
    return name;
  }

  /**
   * Sets the description for Game object
   * @param description description to set
   */
  public void setDescription(String description)
  {
    this.description = description;
  }

  /**
   * Gets the description of the Game object
   * @return description as a String
   */
  public String getDescription()
  {
    return description;
  }

  /**
   * Sets the maximum number of players for Game object
   * @param maxPlayers maximum players to set
   */
  public void setMaxPlayers(int maxPlayers)
  {
    this.maxPlayers = maxPlayers;
  }

  /**
   * Gets the maximum number of players of the Game object
   * @return maximum number of players as an integer
   */
  public int getMaxPlayers()
  {
    return maxPlayers;
  }

  /**
   * Sets the status for Game object
   * @param status status to set as an integer (-1--unavailable/0--available/1--reserved/2--rented)
   */
  public void setStatus(int status)
  {
      this.status = status;
  }

  /**
   * Gets the status of the Game object
   * @return status as an integer (-1--unavailable/0--available/1--reserved/2--rented)
   */
  public int getStatus()
  {
    return status;
  }

  /**
   * Checks if the Game is the same as the other Object
   * @param obj the Object to check with
   * @return true if the Object obj is the same as the Game, else false
   */
  public boolean equals(Object obj)
  {
    if( obj == null || getClass() != obj.getClass() )
    {
      return false;
    }

    Game other = (Game)obj;

    return name.equals(other.name) && description.equals(other.description) &&
           maxPlayers == other.maxPlayers && status == other.status;
  }

  /**
   * Gets the information about the Game object
   * @return information as a String
   */
  public String toString()
  {
    if( status == -1 )
      return "Name: " + name + ", Description: " + description +
             ", Maximum players: " + maxPlayers + "Status: Unavailable";
    else if( status == 0 )
      return "Name: " + name + ", Description: " + description +
          ", Maximum players: " + maxPlayers + "Status: Available";
    else if( status == 1 )
      return "Name: " + name + ", Description: " + description +
          ", Maximum players: " + maxPlayers + "Status: Reserved";
    else
      return "Name: " + name + ", Description: " + description +
          ", Maximum players: " + maxPlayers + "Status: Rented";
  }
}
