package Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CommentREPO extends JpaRepository<CommentREPO, Integer>{

}