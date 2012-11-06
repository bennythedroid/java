
/**
* A class that maintains information on a book.
* This might form part of a larger application such
* as a library system, for instance.
*
* @author (Ben Poland.)
* @version (10/15/12.)
*/
public class Book {

// The fields.
String refNumber;
String author;
String title;
String publisher;
Integer pages;
Binding binding;
//binding = {HARDCOVER, PAPERBACK, EPUB, MOBI, APK};

/*
* Constructor. Set the author, title and binding fields when this object
* is constructed.
*/
public Book(String bookAuthor, String bookTitle, String bookPublisher, Binding bindingType, Integer bookPages, String refNumber) {
author = bookAuthor;
title = bookTitle;
publisher = bookPublisher;
pages = bookPages;
binding = bindingType;
refNumber = "";
}

// Add the methods here ...

//Our get accessor methods
public String getAuthor()
{
	return author;
}
public String getTitle()
{
	return title;
}
public String getPublisher()
{
	return publisher;
}
public Integer getPages()
{
	return pages;
}
public Enum getBinding()
{
	return binding;
}
public String getRefNumber()
{
	return refNumber;
}

//The set mutator for refNumber
public void setRefNumber(String refNumber)
{
	this.refNumber = refNumber;
	int length = refNumber.length();
	if (length < 3)
	{
		System.out.println("Blah vague error message");
	}
}

//The print methods
public void printAuthor()
{
	System.out.println(author);
}
public void printTitle()
{
	System.out.println(title);
}
public void printPublisher()
{
	System.out.println(publisher);
}
public void printBinding()
{
	System.out.println(binding);
}

//print method for all details
public void printDetails()
{
	if (refNumber != null)
	{
		System.out.println("Author: " + author + ", Title: " + title + ", Publisher: " + publisher + ", Binding Type: " + binding + ", number of pages: " + pages + ", ref number: " + refNumber);
	}
		else
		{
			System.out.println("Author: " + author + ", Title: " + title + ", Publisher: " + publisher + ", Binding Type: " + binding + ", number of pages: " + pages + ", ref number: ZZZ");			
		}
}

}
