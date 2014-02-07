package com.example.test;

import static com.google.android.apps.common.testing.ui.espresso.Espresso.*;
import static com.google.android.apps.common.testing.ui.espresso.assertion.ViewAssertions.*;
import static com.google.android.apps.common.testing.ui.espresso.matcher.ViewMatchers.*;
import android.test.ActivityInstrumentationTestCase2;

import com.example.MainActivity;

public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {

	public MainActivityTest() {
		super(MainActivity.class);
	}
	
	public void testPreconditions() {
		getActivity();
		onView(withText("Hello world!")).check(matches(isDisplayed()));
	}
	
	public void testToBeWritten() {
		fail("Write me!");
	}

}
