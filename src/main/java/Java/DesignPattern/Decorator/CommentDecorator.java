package Java.DesignPattern.Decorator;

public class CommentDecorator implements CommentServiceForDecorator{
    private CommentServiceForDecorator commentServiceForDecorator;

    public CommentDecorator(CommentServiceForDecorator commentServiceForDecorator) {
        this.commentServiceForDecorator = commentServiceForDecorator;
    }

    @Override
    public void addComment(String comment) {
        commentServiceForDecorator.addComment(comment);
    }
}
