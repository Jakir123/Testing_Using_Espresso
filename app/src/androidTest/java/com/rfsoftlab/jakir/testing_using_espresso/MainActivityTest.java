package com.rfsoftlab.jakir.testing_using_espresso;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * @version 1.3.0
 * @Author Jakir Hossain
 * @desc description of the class
 * @link n/a
 * @created on 19-Jan-16.
 * @updated on
 * @modified by
 * @updated on
 * @since 1.0
 */
@RunWith(AndroidJUnit4.class)
@LargeTest
public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule(MainActivity.class);

    @Test
    public void shouldBeAbleToLunchMainScreen(){
        onView(withText("Hello world!")).check(matches(isDisplayed()));
    }

}
