/* package org.cicts.data;

import java.util.ArrayList;
import java.util.Date;

import com.bradrydzewski.gwt.calendar.client.Appointment;
import com.bradrydzewski.gwt.calendar.client.AppointmentManager;
import com.bradrydzewski.gwt.calendar.client.DateUtils;
import com.bradrydzewski.gwt.calendar.client.InteractiveWidget;
import com.bradrydzewski.gwt.calendar.client.event.DeleteEvent;
import com.google.gwt.event.logical.shared.SelectionEvent;
import com.google.gwt.user.client.Element;
import com.google.gwt.user.client.Event;

public class Widget extends InteractiveWidget {
	
	
	private GroupManager groupManager = null;
	private Date date;
	
	
	
	
	   /**
	    * Creates a <code>Widget</code> with an empty set of groups
	    * and the current system date as the date currently displayed by the
	    * widget form.
	    */
/*
	 public Widget() {
	      this(new Date());
	   }

	 
	 public Widget(Date date) {
	      super();
	      groupManager = new GroupManager();
	      this.date = date;
	      DateUtils.resetTime(this.date);
	   }
	 
	 
	 
	   public ArrayList<GroupSerializable> getGroups() {
		      return groupManager.getGroups();
		   }
	   
	   public GroupSerializable  getSelectedGroup() {
		      return groupManager.getSelectedGroup();
		   }
	   
	   
	   public void removeGroup(GroupSerializable group, boolean fireEvents) {
		      boolean commitChange = true;
		      if (fireEvents) {
		         // commitChange = DeleteEvent.fire(this, getSelectedGroup()); TODO: like in CalendarWidget
		       }

		       if (commitChange) {
		          groupManager.removeGroup(group);
		         
		       }
		    }
	   
	   public void removeGroup(GroupSerializable group) {
		      removeGroup(group, false);
		   }
	   
	   
	   public boolean selectPreviousGroup() {

		      boolean selected = groupManager.selectPreviousGroup();
		      if (selected) {
		         fireSelectionEvent(getSelectedGroup());
		      }

		      return selected;
		   }

		   public boolean selectNextGroup() {
		      boolean selected = groupManager.selectNextGroup();
		      if (selected)
		         fireSelectionEvent(getSelectedGroup());
		      return selected;
		   }
		   
		   
		   public void fireSelectionEvent(GroupSerializable group) {
			    
			     // SelectionEvent.fire(this, group);
			   }
		   
		   
		   public void addGroups(ArrayList<GroupSerializable> groups) {
			      groupManager.addGroups(groups);
			     
			   }

	@Override
	public void onDoubleClick(Element element, Event event) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onMouseOver(Element element, Event event) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onMouseDown(Element element, Event event) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onDeleteKeyPressed() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onUpArrowKeyPressed() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onDownArrowKeyPressed() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onLeftArrowKeyPressed() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onRightArrowKeyPressed() {
		// TODO Auto-generated method stub
		
	}

}
     */