package model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * A class that stores all the Member objects into a list
 * @author Tomás Mäsiar
 * @version 1.0
 */
public class MemberList implements Serializable
{
  private ArrayList<Member> members;

  /**
   * No-argument constructor initialing the list
   */
  public MemberList(){
    members =  new ArrayList<Member>();
  }

  /**
   * Adds a Member object to the list
   * @param member the Member to add
   */
  public void addMember(Member member){
    members.add(member);
  }

  /**
   * Removes a Member object from the list
   * @param member the Member to remove
   * @return true if the Member is removed, false if the Member is not found
   */
  public boolean removeMember(Member member){
    return members.remove(member);
  }

  /**
   * Gets a Member by ID from the list
   * @param ID ID of the Member
   * @return the Member with the specified ID if one exists, else null
   */
  public Member getMemberByID(String ID){
    for(int i = 0; i < members.size(); i++){
      if(members.get(i).getID().equals(ID)){
        return members.get(i);
      }
    }

    return null;
  }

  /**
   * Gets a Member from position index from the list
   * @param index the position of the Member object in the list
   * @return the Member at index if one exists, else null
   */
  public Member getMemberByIndex(int index){
    if( index >= 0 && index < members.size()){
      return members.get(index);
    }
    else
      return null;
  }

  /**
   * Gets all Member objects by first name from the list
   * @param first_name first name of the Member
   * @return all the Member objects with the specified first name into a list
   */
  public ArrayList<Member> getMembersByFirstName(String first_name){
    ArrayList<Member> membersByFirstName = new ArrayList<Member>();

    for(int i = 0; i < members.size(); i++){
      if(members.get(i).getFirstName().equals(first_name)){
        membersByFirstName.add(members.get(i));
      }
    }

    return membersByFirstName;
  }

  /**
   * Gets all Member objects by last name from the list
   * @param last_name last name of the Member
   * @return all the Member objects with the specified last name into a list
   */
  public ArrayList<Member> getMembersByLastName(String last_name){
    ArrayList<Member> membersByLastName = new ArrayList<Member>();

    for(int i = 0; i < members.size(); i++){
      if(members.get(i).getLastName().equals(last_name)){
        membersByLastName.add(members.get(i));
      }
    }

    return membersByLastName;
  }

  /**
   * Gets all Member objects by first name and last name from the list
   * @param first_name first name of the Member
   * @param last_name last name of the Member
   * @return all the Member objects with the specified first name and last name into a list
   */
  public ArrayList<Member> getMembersByFullName(String first_name, String last_name){
    ArrayList<Member> membersByFullName = new ArrayList<Member>();

    for(int i = 0; i < members.size(); i++){
      if(members.get(i).getFirstName().equals(first_name) && members.get(i).getLastName().equals(last_name)){
        membersByFullName.add(members.get(i));
      }
    }

    return membersByFullName;
  }

  /**
   * Gets all Member objects by status from the list
   * @param status status of the Member
   * @return all the Member objects with the specified status into a list
   */
  public ArrayList<Member> getMembersByStatus(boolean status){
    ArrayList<Member> membersByStatus = new ArrayList<Member>();

    for(int i = 0; i < members.size(); i++){
      if(members.get(i).getStatus() == status){
        membersByStatus.add(members.get(i));
      }
    }

    return membersByStatus;
  }

  /**
   * Gets all Member objects from the list
   * @return all the Member objects into a list
   */
  public ArrayList<Member> getMembers(){
    return members;
  }
}
