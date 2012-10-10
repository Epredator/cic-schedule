package war.domain;

//import java.util.ArrayList;
//import java.util.Date;
//import java.util.List;

import com.vaadin.addon.calendar.event.BasicEvent;
//import com.vaadin.addon.calendar.event.CalendarEventEditor;
//import com.vaadin.addon.calendar.event.CalendarEvent.EventChange;
//import com.vaadin.addon.calendar.event.CalendarEvent.EventChangeListener;
//import com.vaadin.addon.calendar.event.CalendarEvent.EventChangeNotifier;



public class CalendarEventCIC  extends BasicEvent {

    private static final long serialVersionUID = 2820133201983036866L;
    private String pop;
    private Object data;

    public String getPop() {
        return pop;
    }

    public void setPop(String pop) {
        this.pop = pop;
        fireEventChange();
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
        fireEventChange();
    }
}
