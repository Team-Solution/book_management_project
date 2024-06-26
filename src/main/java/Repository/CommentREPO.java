package Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Entity.Comments;
@Repository
public interface CommentREPO extends JpaRepository<Comments, Integer>{
	List<Comments>findAllComments();
	List<Comments>findCommentsById(Integer id);
	@SuppressWarnings("unchecked")
	Comments save(Comments comments);
}
