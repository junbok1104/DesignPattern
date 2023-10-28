package Java.DesignPattern.Decorator;

public class ClientForDecorator {
    private CommentServiceForDecorator commentServiceForDecorator;

    public ClientForDecorator(CommentServiceForDecorator commentServiceForDecorator) {
        this.commentServiceForDecorator = commentServiceForDecorator;
    }
    public void writeComment (String comment) {
        commentServiceForDecorator.addComment(comment);
    }
}
