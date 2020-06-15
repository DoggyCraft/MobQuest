package com.hiphurra.mq.Commands;

public @interface CommandInfo {

    String name();

    String pattern();

    String usage();

    String desc();

    String permission();
}
