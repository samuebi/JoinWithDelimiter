package com.bsamuel.exercise.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JoinWithDelimiterTest {

    @Test
    public void joinWithDelimiter() {
        JoinWithDelimiter jWD = new JoinWithDelimiter();
        String[] strAr2 = {"Ani", "Sam", "Joe"};

        String result = jWD.joinByDelimiter(':', strAr2);
        assertEquals("Ani:Sam:Joe", result);
    }

}