package model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * A class that stores all the Game objects into a list
 *
 * @author Cristian Josan && Dominika Krullova
 * @version 1.0
 */
public class GameList implements Serializable
{
  private ArrayList<Game> games;

  /**
   * No-argument constructor initialing the list
   */
  public GameList()
  {
    games = new ArrayList<Game>();
  }

  /**
   * Adds a Game object to the list
   *
   * @param game the Game to add
   */
  public void addGame(Game game)
  {
    games.add(game);
  }

  /**
   * Removes a Game object from the list
   *
   * @param game the Game to remove
   * @return true if the Game is removed, false if the Game is not found
   */
  public boolean removeGame(Game game)
  {
    return games.remove(game);
  }

  /**
   * Gets a Game object from position index from the list
   *
   * @param index the position of the Game object in the list
   * @return the Game at index if one exists, else null
   */
  public Game getGameByIndex(int index)
  {
    if (index >= 0 && index < games.size())
      return games.get(index);
    else
      return null;
  }

  /**
   * Gets all Game objects from the list
   *
   * @return all the Game objects into a list
   */
  public ArrayList<Game> getAllGames()
  {
    return games;
  }
}
