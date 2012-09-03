/*package org.cicts.data;

import java.util.ArrayList;
import java.util.Collections;

import com.bradrydzewski.gwt.calendar.client.Appointment;



public class GroupManager {
	
	
	  private GroupSerializable selectedGroup = null;
	  private GroupSerializable hoveredGroup = null;
	  private GroupSerializable rollbackGroup = null;
	  private GroupSerializable committedGroup = null;
	  private ArrayList<GroupSerializable> groups = new ArrayList<GroupSerializable>();
	  private boolean sortPending = true;


	  
	  public ArrayList<GroupSerializable> getGroups() {
	        return groups;
	    }
	  
	  
	  public GroupSerializable getSelectedGroup() {
	        return selectedGroup;
	    }
	  
	  
	  
	  public void addGroup(GroupSerializable gs) {
	        if (gs != null) {
	            groups.add(gs);
	            sortPending = true;
	        }
	    }
	  
	  
	  public void removeGroup (GroupSerializable group) {
		  if (group != null) {
			  boolean wasRemoved = groups.remove(group);
			  if (wasRemoved) {
				  sortPending = true;
			  }
		  }
	  }
	 
	    public void clearGroups() {
	        groups.clear();
	    }
	    
	    
	    public boolean hasGroupSelected() {
	        return selectedGroup!= null;
	    }
	    
	    
	    public void addGroups(ArrayList<GroupSerializable> groups) {
	        if (groups != null) {
	            for (GroupSerializable group : groups) {
	                addGroup(group);
	            }
	        }
	    }
	    
	    

	    
	    
	    public boolean selectPreviousGroup() {
	        boolean moveSucceeded = false;
	        if (getSelectedGroup() != null) {
	            int selectedGsIndex =
	                    getGroups().indexOf(getSelectedGroup());
	            GroupSerializable prevGs;
	            if (selectedGsIndex > 0 && (prevGs =
	                    getGroups().get(selectedGsIndex - 1)) != null) {
	                selectedGroup = prevGs;
	                moveSucceeded = true;
	            }
	        }
	        return moveSucceeded;
	    }
	    
	    
	    public boolean selectNextGroup() {
	        boolean moveSucceeded = false;

	        if (getSelectedGroup() != null) {
	            int selectedGsIndex =
	            		getGroups().indexOf(getSelectedGroup());
	            int lastIndex = getGroups().size() - 1;

	            GroupSerializable nextGs;
	            if (selectedGsIndex < lastIndex &&
	                    (nextGs = getGroups().get(selectedGsIndex + 1)) !=
	                            null) {
	                selectedGroup = nextGs;
	                moveSucceeded = true;
	            }
	        }

	        return moveSucceeded;
	    }
	    

	  
	  //===========================end

}
  */