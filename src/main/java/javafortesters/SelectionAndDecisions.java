package javafortesters;

import org.testng.annotations.Test;
import org.testng.Assert;

import static org.testng.AssertJUnit.assertFalse;
import static org.testng.AssertJUnit.assertTrue;

public class SelectionAndDecisions {
    @Test
    public void Truthy1() {
        boolean truthy = true;
        if (truthy) {
            Assert.assertTrue(truthy, "Boolean is not equal to true");
        }
    }

    @Test
    public void Truthy2() {
        boolean truthy = true;
        if (truthy) {
            assertTrue("Boolean is not equal to true", truthy);
        } else {
            assertFalse("Boolean is not equal to false", truthy);
        }
    }

    @Test
    public void TruthyFalsey1() {
        boolean truthy = false;
        if (truthy) {
            assertTrue("Boolean is not equal to true", truthy);
        } else {
            assertFalse("Boolean is not equal to false", truthy);
        }
    }

    @Test
    public void TruthyFalsey2() {
        boolean truthy = false;
        if (truthy) {
            assertTrue("Boolean is not equal to true", truthy);
        }
        if (!truthy) {
            assertFalse("Boolean is not equal to false 1", truthy);
        } else {
            assertFalse("Boolean is not equal to false 2", truthy);
        }
    }

    @Test
    public void TruthyFalsey3() {
        boolean truthy = true;
        boolean falsey = false;
        if (truthy) {
            if (!falsey) {
                if (truthy && !falsey) {
                    if (truthy || falsey) {
                        assertTrue("Truthy is not equal to true", truthy);
                        assertFalse("Falsey is not equal to false", falsey);
                    } else {
                        assertTrue("Truthy is not equal to true", truthy);
                        assertTrue("Falsey is not equal to true", falsey);
                    }
                } else if (!truthy) {
                    assertTrue("Falsey is not equal to true", falsey);
                    assertFalse("Truthy is not equal to true", truthy);
                } else {
                    assertFalse("Falsey is not equal to false", falsey);
                    assertFalse("Truthy is not equal to false", truthy);
                }
            }
        }
    }
}

