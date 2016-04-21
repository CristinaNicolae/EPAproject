package com.cristina.timezonealarm;

import android.app.AlarmManager;
import android.content.ContentProvider;

import com.cristina.timezonealarm.custom.Alarm;
import com.cristina.timezonealarm.custom.AnalogClock;
import com.cristina.timezonealarm.data.AlarmsDatabaseHelper;
import com.cristina.timezonealarm.data.AlarmsProvider;

@RunWith(MockitoJUnitRunner.class)
public class ArticleManagerTest  {

    @Mock private Alarm alarm;
    @Mock private AlarmsDatabaseHelper database;
    @Spy private ContentProvider alarmProvider = new AlarmsProvider();

    // creates instance of ArticleManager
    // and performs constructor injection on it
    @InjectMocks private AlarmManager manager;

    @Test public void shouldDoSomething() {
        // assume that ArticleManager has a method called initialize which calls a method
        // addListener with an instance of ArticleListener
        manager.initialize();

        // validate that addListener was called
        verify(database).addListener(any(AnalogClock.AnalogClockListener.class));
    }
}