package ru.job4j.start;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class InputExceptionsTest {
    private final PrintStream stdout = System.out;
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    @Before
    public void loadOutput() {
        System.out.println("execute before method");
        System.setOut(new PrintStream(this.out));
    }

    @After
    public void backOutput() {
        System.setOut(this.stdout);
        System.out.println("execute after method");
    }

    @Test
    public void whenUserInputMinusOneAskInputAgain() {
//        Tracker tracker = new Tracker();
//        Input input = new StubInput(new String[]{"-1"});
//        new StartUi(input, tracker).init();
//        Assert.assertThat(
//                new String(out.toByteArray()),
//                is(
//                        new StringBuilder()
//                                .append("enter valid data\n")
//                                .append(System.lineSeparator())
//                                .toString()
//                )
//        );
    }
}
