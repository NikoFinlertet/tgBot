package org.arcan;

import org.telegram.telegrambots.longpolling.TelegramBotsLongPollingApplication;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;



//Documentaion: https://github.com/rubenlagus/TelegramBots/tree/master


public class Main {
    public static void main(String[] args) {
        try {
            String Token = "7748278054:AAFHAFi7iS30VrmAlJhIo_wI97X_077rWe0";
            TelegramBotsLongPollingApplication tgBot = new TelegramBotsLongPollingApplication();

            tgBot.registerBot(Token, new Bot());

        } catch (TelegramApiException e){
            e.printStackTrace();
        }

    }
}