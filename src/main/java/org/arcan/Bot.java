package org.arcan;


import org.telegram.telegrambots.longpolling.util.LongPollingSingleThreadUpdateConsumer;
import org.telegram.telegrambots.meta.api.objects.Update;

class Bot implements LongPollingSingleThreadUpdateConsumer{

    int i = 0;


    @Override
    public void consume(Update update){
        if (update.hasMessage() && update.getMessage().hasText()) {
            System.out.println(update.getMessage().getDate());

        }
    }
}