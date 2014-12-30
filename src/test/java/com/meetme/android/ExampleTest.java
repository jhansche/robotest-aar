package com.meetme.android;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;

import static org.assertj.android.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThat;

@RunWith(RobolectricTestRunner.class)
public class ExampleTest {
    @Test
    public void simpleTest() {
        Example obj = new Example(Robolectric.application);
        assertThat(obj).isOfAnyClassIn(Example.class);
        assertThat(obj.getTag()).isNull();
    }
}