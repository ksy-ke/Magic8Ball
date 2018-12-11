package com.ksy;

import java.util.concurrent.ThreadLocalRandom;

public enum Answer {
    CERTAIN("It is certain"),
    DECIDEDLY("It is decidedly so"),
    NO_DOUBT("Without a doubt"),
    DEFINITELY("Yes — definitely"),
    LIKELY("Most likely"),
    GOOD("Outlook good"),
    YES("Signs point to yes"),
    HAZY("Reply hazy, try again"),
    LATER("Ask again later"),
    NOT_NOW("Cannot predict now"),
    NEVER("Don’t count on it"),
    NO("My sources say no"),
    NOT_GOOD("Outlook not so good"),
    DOUBTFUL("Very doubtful");

    private final String message;

    Answer(String message) { this.message = message; }

    public static Answer getAny() {
        ThreadLocalRandom random = ThreadLocalRandom.current();
        Answer[] mas = Answer.values();
        int answerNumber = random.nextInt(0, mas.length);
        return mas[answerNumber];
    }

    @Override
    public String toString() { return message; }
}