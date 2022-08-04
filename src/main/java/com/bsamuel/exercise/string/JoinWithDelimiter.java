package com.bsamuel.exercise.string;

import java.util.StringJoiner;

public class JoinWithDelimiter {
    public String joinByDelimiter(char delimiter, String...args) {

        StringJoiner joiner = new StringJoiner(String.valueOf(delimiter));

        for(String arg: args) {
            joiner.add(arg);
        }
        return joiner.toString();
    }
