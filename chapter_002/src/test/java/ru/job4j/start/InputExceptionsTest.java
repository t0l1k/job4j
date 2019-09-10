package ru.job4j.start;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.hamcrest.Matchers.is;

public class InputExceptionsTest {
    private final PrintStream out = System.out;
    private final ByteArrayOutputStream mem = new ByteArrayOutputStream();

    @Before
    public void loadOutput() {
        System.setOut(new PrintStream(this.mem));
    }

    @After
    public void backOutput() {
        System.setOut(this.out);
    }

    @Test
    public void whenInvalidInput() {
        ValidateInput input = new ValidateInput(new StubInput(new String[]{"invalid", "1"}));
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        input.ask("Enter", arr);
        Assert.assertThat(this.mem.toString(), is("Please enter validate data again.\r\n"));
    }

    @Test
    public void whenInvalidInputMinusOne() {
        ValidateInput input = new ValidateInput(new StubInput(new String[]{"-1", "6"}));
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(6);
        input.ask("Enter", arr);
        Assert.assertThat(this.mem.toString(), is("Please select key from menu.\r\n"));
    }

    @Test
    public void whenInvalidInputA() {
        ValidateInput input = new ValidateInput(new StubInput(new String[]{"a", "6"}));
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(6);
        input.ask("Enter", arr);
        Assert.assertThat(this.mem.toString(), is("Please enter validate data again.\r\n"));
    }
//
//    @Test
//    public void whenShowAllSelect() {
//        ValidateInput input = new ValidateInput(new StubInput(new String[]{"0", "test name", "desc", "1", "6"}));
//        ArrayList<Integer> arr = new ArrayList<Integer>();
//        for (int i = 0; i < 7; i++) {
//            arr.add(i);
//        }
//        input.ask("Enter", arr);
//        Assert.assertThat(this.mem.toString(), is("test\r\n"));
//    }
}
