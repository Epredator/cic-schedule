/*
Vaadin Calendar
Copyright (C) 2009-2011 Oy Vaadin Ltd

This program is available under GNU Affero General Public License (version
3 or later at your option).

See the file licensing.txt distributed with this software for more
information about licensing.

You should have received a copy of the GNU Affero General Public License
along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.vaadin.addon.calendar.event;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.vaadin.addon.calendar.event.CalendarEvent.EventChangeNotifier;

/**
 * Simple implementation of
 * {@link com.vaadin.addon.calendar.event.CalendarEvent CalendarEvent}. Has
 * setters for all required fields and fires events when this event is changed.
 * 
 * @author Vaadin Ltd.
 * @version
 * 1.2.1
 */

@Entity
@SuppressWarnings("serial")
public class BasicEvent implements CalendarEventEditor, EventChangeNotifier {

	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
    private String caption;
    private String description;
    @Temporal(TemporalType.DATE)
    private Date end;
    @Temporal(TemporalType.DATE)
    private Date start;
    private String styleName;
    private transient List<EventChangeListener> listeners = new ArrayList<EventChangeListener>();

    private boolean isAllDay;

    /**
     * Default constructor
     */
    public BasicEvent() {

    }

    /**
     * Constructor for creating an event with the same start and end date
     * 
     * @param caption
     *            The caption for the event
     * @param description
     *            The description for the event
     * @param date
     *            The date the event occurred
     */
    public BasicEvent(String caption, String description, Date date) {
        this.caption = caption;
        this.description = description;
        this.start = date;
        this.end = date;
    }

    /**
     * Constructor for creating an event with a start date and an end date.
     * Start date should be before the end date
     * 
     * @param caption
     *            The caption for the event
     * @param description
     *            The description for the event
     * @param startDate
     *            The start date of the event
     * @param endDate
     *            The end date of the event
     */
    public BasicEvent(String caption, String description, Date startDate,
            Date endDate) {
        this.caption = caption;
        this.description = description;
        this.start = startDate;
        this.end = endDate;
    }
    
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.vaadin.addon.calendar.event.CalendarEvent#getCaption()
     */
    public String getCaption() {
        return caption;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.vaadin.addon.calendar.event.CalendarEvent#getDescription()
     */
    public String getDescription() {
        return description;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.vaadin.addon.calendar.event.CalendarEvent#getEnd()
     */
    public Date getEnd() {
        return end;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.vaadin.addon.calendar.event.CalendarEvent#getStart()
     */
    public Date getStart() {
        return start;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.vaadin.addon.calendar.event.CalendarEvent#getStyleName()
     */
    public String getStyleName() {
        return styleName;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.vaadin.addon.calendar.event.CalendarEvent#isAllDay()
     */
    public boolean isAllDay() {
        return isAllDay;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.vaadin.addon.calendar.event.CalendarEventEditor#setCaption(java.lang
     * .String)
     */
    public void setCaption(String caption) {
        this.caption = caption;
        fireEventChange();
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.vaadin.addon.calendar.event.CalendarEventEditor#setDescription(java
     * .lang.String)
     */
    public void setDescription(String description) {
        this.description = description;
        fireEventChange();
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.vaadin.addon.calendar.event.CalendarEventEditor#setEnd(java.util.
     * Date)
     */
    public void setEnd(Date end) {
        this.end = end;
        fireEventChange();
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.vaadin.addon.calendar.event.CalendarEventEditor#setStart(java.util
     * .Date)
     */
    public void setStart(Date start) {
        this.start = start;
        fireEventChange();
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.vaadin.addon.calendar.event.CalendarEventEditor#setStyleName(java
     * .lang.String)
     */
    public void setStyleName(String styleName) {
        this.styleName = styleName;
        fireEventChange();
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.vaadin.addon.calendar.event.CalendarEventEditor#setAllDay(boolean)
     */
    public void setAllDay(boolean isAllDay) {
        this.isAllDay = isAllDay;
        fireEventChange();
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.vaadin.addon.calendar.ui.CalendarComponentEvents.EventChangeNotifier
     * #addListener
     * (com.vaadin.addon.calendar.ui.CalendarComponentEvents.EventChangeListener
     * )
     */
    public void addListener(EventChangeListener listener) {
        listeners.add(listener);
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.vaadin.addon.calendar.ui.CalendarComponentEvents.EventChangeNotifier
     * #removeListener
     * (com.vaadin.addon.calendar.ui.CalendarComponentEvents.EventChangeListener
     * )
     */
    public void removeListener(EventChangeListener listener) {
        listeners.remove(listener);
    }

    /**
     * Fires an event change event to the listeners. Should be triggered when
     * some property of the event changes.
     */
    protected void fireEventChange() {
        EventChange event = new EventChange(this);

        for (EventChangeListener listener : listeners) {
            listener.eventChange(event);
        }
    }
}
