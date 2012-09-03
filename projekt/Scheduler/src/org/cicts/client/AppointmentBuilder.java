package org.cicts.client;

import java.util.ArrayList;
import java.util.Date;

import com.bradrydzewski.gwt.calendar.client.Appointment;
import com.bradrydzewski.gwt.calendar.client.AppointmentStyle;
import com.bradrydzewski.gwt.calendar.client.Attendee;
import com.bradrydzewski.gwt.calendar.client.Attending;

import com.google.gwt.user.client.Random;

/**
 * Utility class to create random sample appointments from hard-coded arrays of
 * dummy data.
 *
 * @author Brad Rydzewski
 * @author Carlos D. Morales
 */
public class AppointmentBuilder {
    /**
     * The available styles that can be applied to appointments when using the
     * the &quot;Google&quot; theme.
     */
    public static final AppointmentStyle[] GOOGLE_STYLES =
            new AppointmentStyle[]{AppointmentStyle.GREEN, AppointmentStyle.BLUE,
    	AppointmentStyle.LIGHT_GREEN, AppointmentStyle.BLUE_GREY};

    /**
     * The available styles that can be applied to appointments when using the
     * &quot;iCal&quot; theme.
     */
    public static final AppointmentStyle[] ICAL_STYLES =
            new AppointmentStyle[]{AppointmentStyle.GREEN, /*AppointmentStyle.BLUE,*/
    	AppointmentStyle.PURPLE,AppointmentStyle.RED};

    /**
     * Available hours for appointments, from 0 to 24.
     */
    protected static Integer[] HOURS =
            new Integer[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15,
                    16, 17, 18, 19, 20, 21, 22, 23, 24};

    /**
     * Available minutes for the appointments, multiples of 15 being used.
     */
    protected static Integer[] MINUTES = new Integer[]{0, 15, 30, 45};

    /**
     * Available durations for the appointments in minutes; from 15 minutes to 4
     * hours.
     */
    protected static Integer[] DURATIONS =
            new Integer[]{15, 30, 45, 60, 90, 120, 180, 240};
    /**
     * The maximum number of appointments to generate per day.
     */
    protected static int appointmentsPerDay = 8;

    /**
     * Available locations for the generated appointments.
     */
    protected static final String[] LOCATIONS =
            new String[]{
    	"Shepherds’ Field - The Big Grotto (I Grotto)", 
    	" Convent of the Good Shepherd - Jericho Church",
    	"Gethsemane - Basilica of the Agony",
        "Shepherds’ Field - The monastery (IV Grotto)"};

    /**
     * Sample email addresses for the appointment attendees.
     */
    protected static final String[] EMAIL =
            new String[]{"trojnaradam@gmail.com", "epredator@wp.pl",
                    "gastroj@wp.pl", "adamtrojnar@hotmail.com"};

    /**
     * Available options for attending an appointment.
     */
    protected static final Attending[] ATTENDING =
            new Attending[]{Attending.Yes, Attending.No, Attending.Maybe};

    /**
     * Titles of the generated appointments. Position of each entry in this
     * array corresponds with the same position in the {@link #DESCRIPTIONS}
     * array.
     */
    protected static final String[] TITLES =
            new String[]{"MASS", 
    	"NO MASS", 
    	"Other"
                  };

    /**
     * Descriptions for the generated appointments. Position of each entry in
     * this array corresponds with the title in the same position in the {@link
     * #TITLES} array.
     */
    protected static String[] DESCRIPTIONS =
            new String[]{
                    "Pilgrims can reserve a Mass",
                    "Local Mass",
                    "Other Event"};

    /**
     * Builds a collection of randomly generated appointments created after the
     * available elements in this builder class.
     *
     * @return A list with random appointments. A maximum of {@link
     *         #appointmentsPerDay} appointments will be generated per day.
     */
    public static ArrayList<Appointment> build() {
        return build(GOOGLE_STYLES);
    }

    /**
     * Generate random Appointments.
     */
    @SuppressWarnings("deprecation")
    public static ArrayList<Appointment> build(AppointmentStyle[] styles) {
        ArrayList<Appointment> list = new ArrayList<Appointment>();

        Date now = new Date();
        now.setHours(0);
        now.setMinutes(0);
        now.setSeconds(0);
        now.setDate(now.getDate());

        for (int day = 0; day < 14; day++) {

            for (int a = 0; a < appointmentsPerDay; a++) {

                Date start = (Date) now.clone();
                int hour = HOURS[Random.nextInt(HOURS.length)];
                int min = MINUTES[Random.nextInt(MINUTES.length)];
                int dur = DURATIONS[Random.nextInt(DURATIONS.length)];
                start.setHours(hour);
                start.setMinutes(min);

                Date end = (Date) start.clone();
                end.setMinutes(start.getMinutes() + dur);

                AppointmentStyle style = styles[Random.nextInt(styles.length)];
                Appointment appt = new Appointment();
                appt.setStart(start);
                appt.setEnd(end);
                appt.setCreatedBy((EMAIL[Random.nextInt(EMAIL.length)]));
                int titleId = Random.nextInt(TITLES.length);
                appt.setTitle(TITLES[titleId]);
                appt.setDescription(DESCRIPTIONS[titleId]);
                appt.setStyle(style);
                appt.setLocation(LOCATIONS[Random.nextInt(LOCATIONS.length)]);
                int attendees = Random.nextInt(EMAIL.length) + 1;
                for (int i = 0; i < attendees; i++) {
                    Attendee attendee = new Attendee();
                    attendee.setEmail(EMAIL[Random.nextInt(EMAIL.length)]);
                    attendee.setAttending(
                            ATTENDING[Random.nextInt(ATTENDING.length)]);
                    appt.getAttendees().add(attendee);
                }

//                if (appt.getStart().getDate() != appt.getEnd().getDate())
//                    appt.setMultiDay(true);

                list.add(appt);
            }

            //increment date by +1
            now.setDate(now.getDate() + 1);
        }
        return list;
    }
}