package Java.DesignPattern.Decorator;

public class DefaultCommentService implements CommentServiceForDecorator{
    @Override
    public void addComment(String comment) {
        System.out.println(comment);
    }
}
