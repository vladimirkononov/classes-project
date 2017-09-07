/**
 * File Name: Book.java<br>
 * Nepton, Jean-francois<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Sep 6, 2017
 */
package com.sqa.vk;

/**
 * Book //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Nepton, Jean-francois
 * @version 1.0.0
 * @since 1.0
 */
public class Book {

	private String language;

	private String read;

	private int numPages;

	private boolean hardCover;

	private boolean bookmark;

	private int readPages;

	public Book() {
		super();
		this.language = "English";
		this.numPages = 500;
		this.read = read(457);
		this.hardCover = true;
	}

	/**
	 * @param read
	 */
	public Book(boolean bookmark) {
		this();
		this.bookmark = bookmark;
	}

	public Book(int read) {
		this();
		this.read = this.read;
	}

	public Book(int readPages, boolean hardCover) {
		this();
		this.readPages = this.readPages;
		this.hardCover = hardCover;
	}

	/**
	 * @param language
	 * @param numPages
	 * @param hardCover
	 */
	public Book(int readPages, String language) {
		this();
		this.language = language;
		this.readPages = this.readPages;
	}

	/**
	 * @param language
	 * @param read
	 * @param numPages
	 * @param hardCover
	 * @param bookmark
	 */
	public Book(String language, String read, int numPages, boolean hardCover, boolean bookmark) {
		super();
		this.language = language;
		// this.read = read;
		this.numPages = this.readPages;
		this.hardCover = hardCover;
		this.bookmark = bookmark;
	}

	public void closeBook(boolean bookmark) {
		bookmark = isBookmark();
		System.out.println("You are reading page " + this.readPages);
		if (bookmark = true) {
			System.out.println("The page " + this.readPages + " is bookmarked.");
		}
	}

	/**
	 * @return the language
	 */
	public String getLanguage() {
		return this.language;
	}

	/**
	 * @return the numPages
	 */
	public int getNumPages() {
		return this.numPages;
	}

	/**
	 * @return the read
	 */
	public String getRead() {
		return this.read;
	}

	/**
	 * @return the readPages
	 */
	public int getReadPages() {
		return this.readPages;
	}

	/**
	 * @return the bookmark
	 */
	public boolean isBookmark() {
		if (this.numPages > 380) {
			System.out.println("The page " + this.readPages + " will be bookmarked. Have a good night.");
			return true;
		}
		return this.bookmark;
	}

	/**
	 * @return the hardCover
	 */
	public boolean isHardCover() {
		return this.hardCover;
	}

	public String read(int readPages) {
		return String.valueOf(readPages);
	}

	/**
	 * @param bookmark
	 *            the bookmark to set
	 */
	public void setBookmark(boolean bookmark) {
		this.bookmark = bookmark;
	}

	/**
	 * @param hardCover
	 *            the hardCover to set
	 */
	public void setHardCover(boolean hardCover) {
		this.hardCover = hardCover;
	}

	/**
	 * @param language
	 *            the language to set
	 */
	public void setLanguage(String language) {
		this.language = language;
	}

	/**
	 * @param numPages
	 *            the numPages to set
	 */
	public void setNumPages(int numPages) {
		this.numPages = numPages;
	}

	/**
	 * @param read
	 *            the read to set
	 */
	public void setRead(int readPages) {
		this.read = this.read;
	}

	/**
	 * @param read
	 *            the read to set
	 */
	public void setRead(String read) {
		this.read = read;
	}

	/**
	 * @param readPages
	 *            the readPages to set
	 */
	public void setReadPages(int readPages) {
		this.readPages = readPages;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Book [language=" + this.language + ", read=" + this.read + ", numPages=" + this.readPages
				+ ", hardCover=" + this.hardCover + ", bookmark=" + this.bookmark + "]";
	}

	public boolean turnPage(int readPages) {
		System.out.println("You are on the page " + this.readPages + ". Let's turn the page over.");
		return false;
	}
}
