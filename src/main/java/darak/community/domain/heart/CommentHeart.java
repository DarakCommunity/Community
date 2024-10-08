package darak.community.domain.heart;

import darak.community.domain.Comment;
import jakarta.persistence.*;
import lombok.Getter;

@Entity
@DiscriminatorValue("C")
@Getter
public class CommentHeart extends Heart {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "comment_id")
    private Comment comment;
}
