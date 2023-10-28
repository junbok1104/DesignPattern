package Java.DesignPattern.Decorator;

public class TrimmingCommentDecorator extends CommentDecorator {
    public TrimmingCommentDecorator(CommentServiceForDecorator commentServiceForDecorator) {
        super(commentServiceForDecorator);
        System.out.println("TT");
    }

    @Override
    public void addComment(String comment) {
        super.addComment(trim(comment));
    }

    public String trim(String comment) {
        return comment.replace("!", "~");
    }
}
