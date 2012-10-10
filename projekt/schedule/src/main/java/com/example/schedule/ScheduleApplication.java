package com.example.schedule;

import com.vaadin.Application;
import com.vaadin.ui.*;

public class ScheduleApplication extends Application {
	@Override
	public void init() {
		Window mainWindow = new Window("Schedule Application");
		Label label = new Label("Hello Vaadin user");
		mainWindow.addComponent(label);
		setMainWindow(mainWindow);
	}

}
