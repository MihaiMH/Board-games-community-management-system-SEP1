package model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * A class that stores all the Member objects into a list
 *
 * @author Tomas Masiar && Mihai Mihaila
 * @version 1.0
 */
public class MemberList implements Serializable
{
  private ArrayList<Member> members;

  /**
   * No-argument constructor initialing the list
   */
  public MemberList()
  {
    members = new ArrayList<Member>();
  }

  /**
   * Adds a Member object to the list
   *
   * @param member the Member to add
   */
  public void addMember(Member member)
  {
    members.add(member);
  }

  /**
   * Removes a Member object from the list
   *
   * @param member the Member to remove
   * @return true if the Member is removed, false if the Member is not found
   */
  public boolean removeMember(Member member)
  {
    return members.remove(member);
  }


  /**
   * Gets a Member from position index from the list
   *
   * @param index the position of the Member object in the list
   * @return the Member at index if one exists, else null
   */
  public Member getMemberByIndex(int index)
  {
    if (index >= 0 && index < members.size())
    {
      return members.get(index);
    }
    else
      return null;
  }

  /**
   * Gets all Member objects from the list
   *
   * @return all the Member objects into a list
   */
  public ArrayList<Member> getMembers()
  {
    return members;
  }
}
