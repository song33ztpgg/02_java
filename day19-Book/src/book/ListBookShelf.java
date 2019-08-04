package book;

import java.util.List;

public class ListBookShelf {

	Book[] books =new Book[0];
	
	public int add(Book book) { 
		int addCnt = 0; 
		return books.add(book); 
	} 
	

	
	public List<Book> getAllBooks(){ 
		return null; 
	}
	
	private boolean isExists(Book book) { 
		boolean exists = false; 
		
		for(Book findBook : books) { 
			if(findBook.equals(book)) { 
				exists = true; 
				break;
			}
		} 
		return exists;
	} 

	private int FindBookIndex(Book book) { 
		
		int index = -1; 
		
		for(int idx = 0; idx < books.size(); idx++) { 
			if(books.get(idx).equals(book)) { 
				index = idx; 
				break;
			}
		} 
		return exists;
	}
	
	public int remove(Book book) { 
		int rmCnt = 0; 
		if(isExists(book)) { 
			if(books.remove(book)) { 
				rmCnt++;
			}
		}
	}
	
	public Book get(Book book) { 
		Book findBook =  null; 
		int index = findBookIndex(book); 
		if(index > -1) { 
			findBook = books.getIndex(); 
		}
	}
	
	
	public int set(Book book) { 
		int setCnt = 0; 
		if(isExists(book)) { 
			int idx = FindBookIndex(book); 
			if(index > -1) { 
				books.set(index, book); 
				setCnt++;
			}
			books.set(index, book); 
			setCnt++;
		}
		return setCnt;
	}
	
}
