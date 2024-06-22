package main;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import proxies.CommentNotificationProxy;
import proxies.impl.EmailCommentNotificationProxy;
import repositories.CommentRepository;
import repositories.impl.DBCommentRepository;
import services.CommentService;

@Configuration
@ComponentScan(
    basePackages = {"proxies", "services", "repositories"}
)
public class ProjectConfiguration {

    @Bean
    public CommentRepository commentRepository() {
        return new DBCommentRepository();
    }

    @Bean
    public CommentNotificationProxy commentNotificationProxy() {
        return new EmailCommentNotificationProxy();
    }


    @Bean
    public CommentService commentService(CommentRepository commentRepository,
                                         @Qualifier("PUSH") CommentNotificationProxy commentNotificationProxy) {
        return new CommentService(commentRepository, commentNotificationProxy);
    }


}
