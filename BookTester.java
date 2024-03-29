/**
 * BookTester.java
 * @author August Cho
 * @author Jamie Hsieh
 * @version 2024-01-31
 */

public class BookTester
{
	public static void main(String[] args)
	{	
		Book b = new Book("Communist Manifesto", "Karl Marx", 68);
		System.out.println(b.getTitle() + " by " + b.getAuthor());
		b.editPage(0, "A spectre is haunting Europe – the spectre of communism. All the powers of old Europe have entered into a holy alliance to exorcise this spectre: Pope and Tsar, Metternich and Guizot, French Radicals and German police-spies.");
		b.editPage(1, "Where is the party in opposition that has not been decried as communistic by its opponents in power? Where is the opposition that has not hurled back the branding reproach of communism, against the more advanced opposition parties, as well as against its reactionary adversaries?");
		b.editPage(2, "To this end, Communists of various nationalities have assembled in London and sketched the following manifesto, to be published in the English, French, German, Italian, Flemish and Danish languages. ");
		System.out.println(b.readPages(3));
		b.setBookmark(0);
		System.out.println(b.readPages(1));
	}
}
