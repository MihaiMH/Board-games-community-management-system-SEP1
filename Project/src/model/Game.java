package model;

import java.io.Serializable;
import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 * A class that stores information about game
 *
 * @author Cristian Josan && Mihai Mihaila && Dominika Krullova
 * @version 1.0
 */
public class Game implements Serializable
{
  private String name;
  private String description;
  private int maxPlayers;
  private int status;
  private String urlImage;

  private ArrayList<Integer> rating;

  /**
   * Three-argument constructor initializing information for Game object
   *
   * @param name        name to initialize
   * @param description description to initialize
   * @param maxPlayers  maximum number of players to initialize
   */
  public Game(String name, String description, int maxPlayers)
  {
    this.name = name;
    this.description = description;
    this.maxPlayers = maxPlayers;
    status = 0;
    urlImage = "";
    rating = new ArrayList<Integer>();
  }

  /**
   * Four-argument constructor initializing information including status for Game object
   *
   * @param name        name to initialize
   * @param description description to initialize
   * @param maxPlayers  maximum number of players to initialize
   * @param status      status to initialize (unavailable/available/reserved/rented)
   */
  public Game(String name, String description, int maxPlayers, int status)
  {
    this.name = name;
    this.description = description;
    this.maxPlayers = maxPlayers;
    this.status = status;
    rating = new ArrayList<Integer>();
    urlImage = "";
  }

  /**
   * Sets the url for an image for Game object
   *
   * @param urlImage url for the image of the game to set
   */
  public void setUrlImage(String urlImage)
  {
    this.urlImage = urlImage;
  }

  /**
   * Gets the url for an image for Game object
   *
   * @return url as a String
   */
  public String getUrlImage()
  {
    return urlImage;
  }

  /**
   * Sets the name for Game object
   *
   * @param name name to set
   */
  public void setName(String name)
  {
    this.name = name;
  }

  /**
   * Adds rating to a game after ending borrowing
   * @param rating the rating to add
   */
  public void addRating(int rating)
  {
    this.rating.add(rating);
  }

  /**
   * Gets the average rating for a Game object
   * @return the average rating as a String
   */
  public String getRating()
  {
    if (rating == null)
      return "0";

    int sum = 0;
    for (int i = 0; i < rating.size(); i++)
    {
      sum += rating.get(i);
    }
    double m = (double) sum / rating.size();

    DecimalFormat df = new DecimalFormat("0.00");

    return String.valueOf(df.format(m));
  }

  /**
   * Gets the name of the Game object
   *
   * @return name as a String
   */
  public String getName()
  {
    return name;
  }

  /**
   * Sets the description for Game object
   *
   * @param description description to set
   */
  public void setDescription(String description)
  {
    this.description = description;
  }

  /**
   * Gets the description of the Game object
   *
   * @return description as a String
   */
  public String getDescription()
  {
    return description;
  }

  /**
   * Sets the maximum number of players for Game object
   *
   * @param maxPlayers maximum players to set
   */
  public void setMaxPlayers(int maxPlayers)
  {
    this.maxPlayers = maxPlayers;
  }

  /**
   * Gets the maximum number of players of the Game object
   *
   * @return maximum number of players as an integer
   */
  public int getMaxPlayers()
  {
    return maxPlayers;
  }

  /**
   * Sets the status for Game object
   *
   * @param status status to set as an integer (-1--unavailable/0--available/1--reserved/2--rented)
   */
  public void setStatus(int status)
  {
    this.status = status;
  }

  /**
   * Gets the status of the Game object
   *
   * @return status as an integer (-1--unavailable/0--available/1--reserved/2--rented)
   */
  public int getStatus()
  {
    return status;
  }

  /**
   * Checks if the Game is the same as the other Object
   *
   * @param obj the Object to check with
   * @return true if the Object obj is the same as the Game, else false
   */
  public boolean equals(Object obj)
  {
    if (obj == null || getClass() != obj.getClass())
    {
      return false;
    }

    Game other = (Game) obj;

    return name.equals(other.name) && description.equals(other.description)
        && maxPlayers == other.maxPlayers && status == other.status;

  }

  /**
   * Gets the information about the Game object
   *
   * @return name of the game as a String
   */
  public String toString()
  {
    return name;
  }
}
