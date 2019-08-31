package ru.job4j.start;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.hamcrest.core.Is.is;

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
        Assert.assertThat(this.mem.toString(), is("enter valid data\n"));
    }
}
