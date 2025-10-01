package org.example;

import net.dv8tion.jda.api.JDABuilder;

public class Bot {
    public static void main(String[] args) {
        String token = ; // Store securely in env variables
        JDABuilder.createDefault(token).build(); // builds discord bot using the token and makes the bot have default settings and then build finalizes and connects to discord.
    }
}
