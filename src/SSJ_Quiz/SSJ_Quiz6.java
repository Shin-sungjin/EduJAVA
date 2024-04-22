package SSJ_Quiz;

import java.util.ArrayList;
import java.util.List;

public class SSJ_Quiz6 {
	public static void main(String[] args) {
		User user = new User("¼ºÁø", "1234");
		user.writePost("test", "testCon");
		user.writePost("test2", "testCon2");
		
		List<Post> posts = user.getPosts();
		for(Post post : posts) {
			System.out.println("Title : " + post.getTitle());
			System.out.println("Autor : " + post.getAutor());
			System.out.println("content :" + post.getContent());
		}
	}
}


class User {
	private String name;
	private String id;
	private List<Post> posts;
	
	public User(String name, String id) {
		this.name = name;
		this.id = id;
		posts = new ArrayList<Post>();
	}
	
	public void writePost(String title, String content) {
		posts.add(new Post(title, content, this.id));
		//new Post(title, this.name, content)
	}
	
	public List<Post> getPosts() {
		return this.posts;
	}

	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}
}
	
	


class Post {


	String title;
	String content;
	String autor;
	
	public Post(String title, String content, String autor) {
		this.title = title;
		this.content = content;
		this.autor = autor;
	}

	public String getTitle() {
		return title;
	}

	public String getContent() {
		return content;
	}


	public String getAutor() {
		return autor;
	}
	
	
	
}