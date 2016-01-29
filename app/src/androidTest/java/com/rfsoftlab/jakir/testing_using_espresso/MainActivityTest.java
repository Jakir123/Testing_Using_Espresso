package com.rfsoftlab.jakir.testing_using_espresso;

import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;

import org.hamcrest.Matchers;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.closeSoftKeyboard;
import static android.support.test.espresso.Espresso.getIdlingResources;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.intent.Intents.intended;
import static android.support.test.espresso.intent.matcher.IntentMatchers.hasExtra;
import static android.support.test.espresso.intent.matcher.IntentMatchers.toPackage;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
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
    public void ensureTextChangesWork() {
        onView(withId(R.id.etInputField)).
                perform(ViewActions.typeText("Hi"));

        onView(withId(R.id.btnChangeText)).
                perform(ViewActions.click());

        onView(withId(R.id.etInputField)).
                check(matches(withText("Hi")));
    }

    @Test
    public void changeTextNewActivity() {
        onView(withId(R.id.etInputField)).
                perform(ViewActions.typeText("how are you"));

        onView(withId(R.id.btnSwitchActivity)).
                perform(ViewActions.click());

        onView(withId(R.id.tvResultView)).
                check(matches(withText("how are you")));
    }


}
