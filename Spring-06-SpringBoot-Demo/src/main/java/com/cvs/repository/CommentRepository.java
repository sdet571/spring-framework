package com.cvs.repository;

import com.cvs.model.Comment;

public interface CommentRepository {

    void storeComment(Comment comment);
}
