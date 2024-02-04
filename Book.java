/**
 * Book class
 * @author August Cho
 * @author Jamie Hsieh 
 * @version 2024-01-31
 */

public class Book
{
	private String title;
	private String author;
	private String[] pages;
	private int bookmark;
/**
 * Constructor for objects of Book class 
 */
	public Book(String title, String author, int numberOfPages)
	{
		this.title = title;
		this.author = author;
		this.pages = new String[numberOfPages];
		this.bookmark = 0;
	}
/**
 * getTitle method returns title of book
 * @return title
 */
	public String getTitle()
	{
		return title;
	}
/**
 * getAuthor method returns author of book
 * @return author
 */
	public String getAuthor()
	{
		return author;
	}
/**
 * editPage method edits the text of a given page number
 * 
 * @param page  number
 * @param newText edited text
 */
	public void editPage(int page, String newText)
	{
		pages[page] = newText;
	}
/**
 * readPages method reads a certain number of pages of the book and saves the bookmark to the current page
 * @param numberOfPages read
 * @return output   confirmation of pages read
 */
	public String readPages(int numberOfPages)
	{
		String output = "";
		for (int i = 0; i < numberOfPages; i++)
		{
			output += "Page " + (bookmark + i);
			output += "\n--------\n";
			output += pages[bookmark + i];
			output += "\n--------\n";
		}
		bookmark += numberOfPages;
		return output;
	}
/**
 * setBookmark method changes bookmark to a certain page
 * @param page number
 */
	public void setBookmark(int page)
	{
		bookmark = page;
	}
}
