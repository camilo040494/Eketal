package co.edu.icesi.eketal.ui;

public class EketalConstants {
	/**
	 * Constants
	 */

	// Project
	public static final String INTERNTE_CONNNECTIVITY_PING_URL = "java.sun.com";

	// Messages UI text
	public static final String FIRST_PAGE_NAME = "Eketal Maven Project Wizard";
	public static final String FIRST_PAGE_TITLE = "Eketal New Maven Project";
	public static final String FIRST_PAGE_DESCRIPTION = "Create Eketal New Maven Project";
	public static final String WIZARD_NAME = "Eketal Maven Project Wizard";
	public static final String INTERNET_CONNECTION_REQUIRED_MESSAGE_TITLE = "Internet connectivity";
	// advertise
//	public static final String ASPOSE_ALL_COMPONENTS_TEXT = "» Generate reports using mail merge"
//			+ "\n» Excel Reporting - Build dynamic Excel reports on the fly"
//			+ "\n» Create Excel dashboards, incorporating charts and pivot tables"
//			+ "\n» High-fidelity Excel rendering and printing"
//			+ "\n» Create new PDF documents using the product API"
//			+ "\n» Transform an XML document into PDF format"
//			+ "\n» Convert an Image file into PDF format"
//			+ "\n» Create new slides or clone existing slides from templates"
//			+ "\n» Add, remove, replace or extract text from PDF files"
//			+ "\n» Add, remove, replace or extract images from PDF files"
//			+ "\n» Convert a PDF file to an image"
//			+ "\n» Generate barcode images and save to stream or image file"
//			+ "\n» Project management, such as project planning, definition and tracking"
//			+ "\n» Recognize barcodes from stream or image file"
//			+ "\n» Create, load and manipulate Microsoft Visio drawings within Java application";
//
//	public static final String ASPOSE_CELLS_FEATURE_TEXT = "Aspose.Cells for Java is an Excel® "
//			+ "\nspreadsheet reporting component that"
//			+ "\n enables Java applications to create "
//			+ "\nand manage Excel® spreadsheets without"
//			+ "\n using Microsoft Excel®. Aspose.Cells "
//			+ "\nfor Java is an incredibly feature rich "
//			+ "\ncomponent that offers much more than "
//			+ "\njust basic data export functions.";
//	public static final String ASPOSE_WORDS_FEATURE_TEXT = "Aspose.Words for Java is an advanced "
//			+ "\nclass library for Java that enables "
//			+ "\nyou to perform a great range of document"
//			+ "\n processing tasks directly within your "
//			+ "\nJava applications."
//			+ "\nAspose.Words for Java supports DOC, OOXML,"
//			+ "\n RTF, HTML and OpenDocument formats. With"
//			+ "\n Aspose.Words you can generate, modify, and"
//			+ "\n convert documents without using Microsoft Word.";
//	public static final String ASPOSE_PDF_FEATURE_TEXT = "Aspose.Pdf for Java is a PDF document "
//			+ "\ncreation component that enables your "
//			+ "\nJava applications to read, write and "
//			+ "\nmanipulate PDF documents without using " + "\nAdobe Acrobat.";
//	public static final String ASPOSE_SLIDES_FEATURE_TEXT = "Aspose.Slides for Java is a unique "
//			+ "\nPowerPoint management component that"
//			+ "\n enables Java applications to read, "
//			+ "\nwrite and manipulate PowerPoint documents"
//			+ "\n without using Microsoft PowerPoint."
//			+ "\nAspose.Slides for Java supports formats "
//			+ "\nincluding PPT, PPS, POT and PresentationML"
//			+ "\n (OOXML, PPTX). ";
//	public static final String ASPOSE_PDF_KIT_FEATURE_TEXT = "Aspose.Pdf.Kit for Java is a PDF document "
//			+ "\nmanipulation component that enables Java "
//			+ "\ndevelopers to manage and manipulate existing"
//			+ "\n PDF files as well as manage form fields"
//			+ "\n embedded within PDF files."
//			+ "\nIf you need to create new PDF files, Aspose.Pdf"
//			+ "\n is the right tool. But developers often need "
//			+ "\nto edit pre-existing PDF documents and for this"
//			+ "\n task, Aspose.Pdf.Kit is the tool to use.";
//	public static final String ASPOSE_BARCODE_FEATURE_TEXT = "Aspose.BarCode for Java is a robust and reliable "
//			+ "\nbarcode generation and recognition component, "
//			+ "\nwritten in Java, it allows developers to quickly"
//			+ "\n and easily add barcode generation and recognition"
//			+ "\n functionality to their Java applications."
//			+ "\nAspose.BarCode for Java supports the Java SE, "
//			+ "\nJava EE and Java ME platforms.";
//	public static final String ASPOSE_TASKS_FEATURE_TEXT = "Aspose.Tasks for Java is a project management "
//			+ "\nAPI that enables Java application developers "
//			+ "\nto provide Microsoft Project® document manipulation"
//			+ "\n capability in their applications – all without "
//			+ "\nusing Microsoft Project®. With this powerful API, "
//			+ "\ndevelopers can control various stages of project"
//			+ "\n management, such as project planning, definition"
//			+ "\n and tracking.";
//	public static final String ASPOSE_EMAIL_FEATURE_TEXT = "Aspose.Email for Java is a Java class library "
//			+ "\nthat enables Java applications to read and "
//			+ "\nwrite Outlook MSG files without Microsoft "
//			+ "\nOutlook. It provides classes to read and update"
//			+ "\n MSG files, add/remove attachments and recipients,"
//			+ "\n update subject, body and other MSG file properties.";
//	public static final String ASPOSE_OCR_FEATURE_TEXT = "Aspose.OCR for Java is a character recognition "
//			+ "\ncomponent built to allow developers to add OCR"
//			+ "\n functionality in their Java applications. "
//			+ "\nAspose.OCR provides simple set of classes that"
//			+ "\n allow developers to recognize characters from "
//			+ "\nthe images.";
//	public static final String ASPOSE_IMAGING_FEATURE_TEXT = "Aspose.Imaging for Java is an imaging library"
//			+ "\n that lets developers create, edit, draw or"
//			+ "\n convert images in their Java applications "
//			+ "\nwith ease and performance. It offers broad "
//			+ "\nspectrum of traditional image processing "
//			+ "\noperations as well as most demanded features "
//			+ "\nthat makes it most widely used imaging engine.";
//	public static final String ASPOSE_DIAGRAM_FEATURE_TEXT = "Aspose.Diagram for Java is a Non-Graphical and "
//			+ "\nwell-structured API that allows developers to load, "
//			+ "\ncreate, save and manipulate Microsoft Visio "
//			+ "\ndrawings within a Java application without using "
//			+ "\nMicrosoft Visio. It provides better performance and "
//			+ "\nis easier to use to manipulate diagrams and convert "
//			+ "\nfiles than Microsoft Office Automation.";
	private static final boolean printing_allowed = true;

	public static final String MAVEN_INTERNET_CONNECTION_REQUIRED_MESSAGE = "Internet connectivity is not available!\nInternet connectivity is required to retrieve latest Aspose Maven Artifacts";

	public static final void println(String message) {
		if (printing_allowed) {
			System.out.println(message);
		}
	}
}
