package model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * A class that stores all the Game objects into a list
 * @author Cristian Josan
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
   * @param game the Game to add
   */
  public void addGame(Game game)
  {
    games.add(game);
  }

  /**
   * Removes a Game object from the list
   * @param game the Game to remove
   * @return true if the Game is removed, false if the Game is not found
   */
  public boolean removeGame(Game game)
  {
    return games.remove(game);
  }

  /**
   * Gets a Game object from position index from the list
   * @param index the position of the Game object in the list
   * @return the Game at index if one exists, else null
   */
  public Game getGameByIndex(int index)
  {
    if( index >= 0 && index < games.size() )
      return games.get(index);
    else
      return null;
  }

  /**
   * Gets all Game objects by name from the list
   * @param name the name of the Game
   * @return all the Game objects with the specified name into a list
   */
  public ArrayList<Game> getGamesByName(String name)
  {
    ArrayList<Game> gamesByName = new ArrayList<Game>();

    for (int i = 0; i < games.size(); i++)
    {
      if( games.get(i).getName().equals(name) )
        gamesByName.add(games.get(i));
    }

    return gamesByName;
  }

  /**
   * Gets all Game objects by maximum number of players from the list
   * @param maxPlayers maximum number of players of the Game
   * @return all the Game objects with the specified maximum number of players into a list
   */
  public ArrayList<Game> getGamesByMaxPlayers(int maxPlayers)
  {
    ArrayList<Game> gamesByMaxPlayers = new ArrayList<Game>();

    for (int i = 0; i < games.size(); i++)
    {
      if( games.get(i).getMaxPlayers() == maxPlayers )
        gamesByMaxPlayers.add(games.get(i));
    }

    return gamesByMaxPlayers;
  }

  /**
   * Gets all Game objects by status (unavailable/available/reserved/rented) from the list
   * @param status the status of the Game
   * @return all the Game objects with the specified status into a list
   */
  public ArrayList<Game> getGamesByStatus(int status)
  {
    ArrayList<Game> gamesByStatus = new ArrayList<Game>();

    for (int i = 0; i < games.size(); i++)
    {
      if( games.get(i).getStatus() == status )
        gamesByStatus.add(games.get(i));
    }

    return gamesByStatus;
  }

  /**
   * Gets all Game objects from the list
   * @return all the Game objects into a list
   */
  public ArrayList<Game> getAllGames()
  {
    return games;
  }
}
