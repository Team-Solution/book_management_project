package IMPL;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Entity.Comments;
import Model.CreateCommentsRequest;
import Repository.CommentREPO;
import Service.CommentService;
@Service
public class CommentServiceImpl implements CommentService{
@Autowired
CommentREPO commentREPO;
	@Override
	public List<Comments> findAllComments() {
		// TODO Auto-generated method stub
		return commentREPO.findAllComments();
	}

	@Override
	public List<Comments> findCommentsById(Integer id) {
		// TODO Auto-generated method stub
		return commentREPO.findCommentsById(id);
	}

	@Override
	public Comments createComments(CreateCommentsRequest request) {
		// TODO Auto-generated method stub
		 Comments comments = new Comments();
		    comments.setUser_id(request.getUser_id());
		    comments.setContent(request.getContent());
		return commentREPO.save(comments) ;
	}

	@Override
	public Comments updateComments(Integer id, CreateCommentsRequest request) {
		// TODO Auto-generated method stub
		return commentREPO.save(createComments(request));
	}

	@Override
	public void deleteComments(Integer id) {
		// TODO Auto-generated method stub
		commentREPO.deleteById(id);
		
	}

}
