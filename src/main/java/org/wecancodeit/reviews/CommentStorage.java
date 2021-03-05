package org.wecancodeit.reviews;


import org.springframework.stereotype.Service;

@Service
public class CommentStorage {

        private CommentRepository commentRepo;
        public CommentStorage(CommentRepository commentRepo){
            this.commentRepo = commentRepo;
        }
        public void addComment(Comment comment){
            commentRepo.save(comment);
        }
        public Comment getCommentById(Long id) {
            if (commentRepo.findById(id).isPresent()) {
                return commentRepo.findById(id).get();
            }
            else{
                return null;
            }
        }
    }



