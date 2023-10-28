package Java.DesignPattern.Decorator;

public class SpamFilteringCommentService extends CommentService {
    @Override
    public void addComment(String comment) {
        if(!isNotSpam(comment)) { // http를 포함하면 댓글등록 X
            super.addComment(comment);
        }
    }

    private boolean isNotSpam(String comment) {
        return comment.contains("http");
    }
}