package com.cvs.proxy;

import com.cvs.model.Comment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Primary
@Component
@Qualifier("PUSH")
public class CommentPushNotificationProxy implements CommentNotificationProxy {


    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending push notification for comment: "+ comment.getText());
    }
}
