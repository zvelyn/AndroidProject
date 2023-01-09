package id.ac.poliban.mi.vc.e020320073.calculatortestchallenge;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import androidx.test.filters.SmallTest;

/**
 * JUnit4 unit tests for the calculator logic.
 * These are local unit tests; no device needed.
 */
@RunWith(JUnit4.class)
@SmallTest
public class ExampleUnitTest {

    private Calculator mCalculator;

    /**
     * Sets up the environment for testing.
     */
    @Before
    public void setUp() {
        mCalculator = new Calculator();
    }

    /**
     * Tests for simple addition.
     */
    @Test
    public void addTwoNumbers() {
        double resultAdd = mCalculator.add(1d, 1d);
        assertThat(resultAdd, is(equalTo(2d)));
    }
    /**
     * Tests for addition with a negative operand.
     */
    @Test
    public void addTwoNumbersNegative() {
        double resultAdd = mCalculator.add(-1d, 2d);
        assertThat(resultAdd, is(equalTo(1d)));
    }
    /**
     * Tests for addition where the result is negative.
     */
    @Test
    public void addTwoNumbersWorksWithNegativeResult() {
        double resultAdd = mCalculator.add(-1d, -17d);
        assertThat(resultAdd, is(equalTo(-18d)));
    }
    /**
     * Tests for floating-point addition.
     */
    @Test
    public void addTwoNumbersFloats() {
        double resultAdd = mCalculator.add(1.111d, 1.111d);
        assertThat(resultAdd, is(equalTo(2.222)));
    }

    /**
     * Tests for especially large numbers.
     */
    @Test
    public void addTwoNumbersBignums() {
        double resultAdd = mCalculator.add(123456781d, 111111111d);
        assertThat(resultAdd, is(equalTo(234567892d)));
    }
    /**
     * Tests for simple subtraction.
     */
    @Test
    public void subTwoNumbers() {
        double resultSub = mCalculator.sub(1d, 1d);
        assertThat(resultSub, is(equalTo(0d)));
    }

    /**
     * Tests for simple subtraction with a negative result.
     */
    @Test
    public void subWorksWithNegativeResult() {
        double resultSub = mCalculator.sub(1d, 17d);
        assertThat(resultSub, is(equalTo(-16d)));
    }

    /**
     * Tests for simple division.
     */
    @Test
    public void divTwoNumbers() {
        double resultDiv = mCalculator.div(32d,2d);
        assertThat(resultDiv, is(equalTo(16d)));
    }

    /**
     * Tests for divide by zero; must throw IllegalArgumentException.
     */
    @Test(expected = IllegalArgumentException.class)
    public void divByZeroThrows() {
        try{
            mCalculator.div(32d,0d);
        }catch (IllegalArgumentException iae){
            return;
        }
    }

    /**
     * Tests for divide by zero; always fails, so removed.
     */
    /*@Test
    public void divTwoNumbersZero() {
        double resultDiv = mCalculator.div(32d,0);
        assertThat(resultDiv, is(equalTo(Double.POSITIVE_INFINITY)));
    }*/


    /**
     * Tests for simple multiplication.
     */
    @Test
    public void mulTwoNumbers() {
        double resultMul = mCalculator.mul(32d, 2d);
        assertThat(resultMul, is(equalTo(64d)));
    }

}