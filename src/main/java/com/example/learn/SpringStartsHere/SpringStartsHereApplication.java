package com.example.learn.SpringStartsHere;


import com.example.learn.SpringStartsHere.model.Comment;
import com.example.learn.SpringStartsHere.service.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class SpringStartsHereApplication {

	public static void main(String[] args) {
	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(ProjectConfig.class);
	CommentService commentService=context.getBean(CommentService.class);
	Comment comment=new Comment();
	comment.setText("This is a comment");
	comment.setAuthor("My shit");

	commentService.publishComment(comment);























}}
