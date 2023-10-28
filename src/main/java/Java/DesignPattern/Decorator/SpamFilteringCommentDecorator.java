package Java.DesignPattern.Decorator;

public class SpamFilteringCommentDecorator extends CommentDecorator {
    public SpamFilteringCommentDecorator(CommentServiceForDecorator commentServiceForDecorator) {
        super(commentServiceForDecorator);
        System.out.println("SP");
    }

    @Override
    public void addComment(String comment) {
        if(!isNotSpam(comment)) {
            super.addComment(comment);
        }
    }

    private boolean isNotSpam(String comment) {
        return comment.contains("http");
    }
}
