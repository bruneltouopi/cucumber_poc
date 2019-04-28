package com.fabrice.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fabrice on 4/28/19.
 */
public class Order {
    private String from;
    private String to;
    private List<String> contents = new ArrayList<>();
    private String message;

    public void declareOwner(String romeo) {
        this.from = romeo ;
    }

    public void declareTarget(String juliette) {
        this.to = juliette ;
        contents.add("bingo");
    }
    public List<String> getCocktails() {
        return contents;
    }

    public void withMessage(String something) {
        this.message = something;
    }
    public String getTicketMessage() {
        return "From " + from + " to " + to + ": " + message;
    }
}
