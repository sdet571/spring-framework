package com.cvs.service;

import com.cvs.model.Comment;
import com.cvs.proxy.CommentNotificationProxy;
import com.cvs.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * - Service : refers to the objects implementing use cases.
 * - Repository : refers to the objects working directly with a database.
 * - Proxy : refers to the objects whose responsibilities are to establish communication with something outside the app.
 * - Model/Entity : refers to objects that model the data the app uses.
 */

//Service : refers to the objects implementing use cases.
@Component
public class CommentService { // dependency injection

    private final CommentRepository commentRepository;
    private final CommentNotificationProxy commentNotificationProxy;

    /**
     * CommentPushNotificationProxy & EmailCommentNotificationProxy both classes implement the same interface
     * · We have 2 implementations, but Spring will always inject one of them ?
     *        - Use the @Primary annotation to mark one of them as default.
     *        - Use the @Qualifier annotation to name the bean and then instruct Spring to inject that bean by name.
     *
     *
     */

    //@Autowired
    public CommentService(CommentRepository commentRepository, @Qualifier("EMAIL") CommentNotificationProxy commentNotificationProxy) {
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
    }

    public void publishComment(Comment comment){
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }


}
