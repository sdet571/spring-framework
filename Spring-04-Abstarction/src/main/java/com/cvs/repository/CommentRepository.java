package com.cvs.repository;

import com.cvs.model.Comment;

// Repository : refers to the objects working directly with a database.
public interface CommentRepository {

    void storeComment(Comment comment);
}
