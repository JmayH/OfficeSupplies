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

	public Book(String title, String author, int numberOfPages)
	{
		this.title = title;
		this.author = author;
		this.pages = new String[numberOfPages];
		this.bookmark = 0;
	}

	public String getTitle()
	{
		return title;
	}
	public String getAuthor()
	{
		return author;
	}
	public void editPage(int page, String newText)
	{
		pages[page] = newText;
	}
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
	public void setBookmark(int page)
	{
		bookmark = page;
	}
}
