package Service;

import java.util.List;

import org.springframework.stereotype.Service;

import Entity.Comments;
import Model.CreateCommentsRequest;
@Service
public interface CommentService {
List<Comments>findAllComments();
List<Comments>findCommentsById(Integer id);
Comments createComments(CreateCommentsRequest request);
Comments updateComments(Integer id, CreateCommentsRequest request);
void deleteComments(Integer id);

}
