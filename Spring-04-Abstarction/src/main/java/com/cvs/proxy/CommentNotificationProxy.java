package com.cvs.proxy;
import com.cvs.model.Comment;

//Proxy : refers to the objects whose responsibilities are to establish communication with something outside the app.
// Interfaces are abstract. Never use stereotype annotations on interfaces.
public interface CommentNotificationProxy {

    void sendComment(Comment comment);

}
