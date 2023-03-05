package com.cvs.model;

import lombok.Data;

// Model/Entity : refers to objects that model the data the app uses.
@Data
public class Comment {

    private String author;
    private String text;
}
