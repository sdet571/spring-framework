package com.cvs.proxy;

import com.cvs.model.Comment;

public interface CommentNotificationProxy {

    void sendComment(Comment comment);

}
