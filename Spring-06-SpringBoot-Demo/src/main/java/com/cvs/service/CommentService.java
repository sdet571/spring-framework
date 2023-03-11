package com.cvs.service;

import com.cvs.model.Comment;
import com.cvs.proxy.CommentNotificationProxy;
import com.cvs.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * Spring has multiple different approaches for creating beans and managing their lifecycle. These approaches are called “scopes”
 * Spring bean scopes:
 *    · Singleton · Prototype · Request · Session
 *
 *
 *** Eager and Lazy Instantiation
 * · Spring creates all singleton beans when it initializes the context. This default behavior is called “eager instantiation”
 * · With lazy instantiation, Spring does not create the singleton instances when it creates the context. Instead, Spring
 * creates each instance the first time when someone refers to the bean.
 * · @Lazy annotation tell Spring that it needs to create the bean only when someone refers to the bean for the first time.
 *
 *** Prototype Bean Scope
 * · It called prototype, because every time you request a reference to a prototype-scoped bean, Spring creates a new object instance.
 * · For prototype beans, Spring does not create and manage an object instance directly. The framework manages the object’s
 * type and creates a new instance every time someone requests a reference to the bean.
 * · We need to use @Scope annotation to change the bean’s scope.
 *
 */

@Component
//@Scope("prototype") // @Scope annotation is used to change the bean scope. New instance will be created each time you refer to it.
//@Scope(BeanDefinition.SCOPE_PROTOTYPE)
@Lazy
public class CommentService { // dependency injection

    private final CommentRepository commentRepository;
    private final CommentNotificationProxy commentNotificationProxy;

    //@Autowired
    public CommentService(CommentRepository commentRepository, @Qualifier("EMAIL") CommentNotificationProxy commentNotificationProxy) {
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
        System.out.println("Hello"); // Testing @Lazy
    }

    public void publishComment(Comment comment){
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }


}
