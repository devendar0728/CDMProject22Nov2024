package com.cdm.pages;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.interactive.action.PDActionURI;
import org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotation;
import org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLink;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.cdm.common.CommonActions;

public class PDFUtils extends CommonActions {

	public PDFUtils(WebDriver driver, ExtentTest logger) // created WebDriver Constructor
	{
		super(driver, logger);

		PageFactory.initElements(driver, this);
	}



	public List<String> getLinksInPDF(String pdfUrl) throws Exception {
        List<String> links = new ArrayList<>();
        int totalLinks = 0;

        // Use HttpURLConnection to open a connection to the PDF URL
        URL url = new URL(pdfUrl);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        // Open the input stream to read the PDF content
        try (InputStream input = connection.getInputStream();
             PDDocument document = PDDocument.load(input)) {

            // Iterate over each page in the PDF document
            for (PDPage page : document.getPages()) {
                // Iterate through all annotations on the page
                for (PDAnnotation annotation : page.getAnnotations()) {
                    // Check if the annotation is a link annotation
                    if (annotation instanceof PDAnnotationLink) {
                        PDAnnotationLink linkAnnotation = (PDAnnotationLink) annotation;

                        // Get the action of the link
                        if (linkAnnotation.getAction() instanceof PDActionURI) {
                            String link = ((PDActionURI) linkAnnotation.getAction()).getURI();
                            if (link != null) {
                                totalLinks++;
                                links.add(link);  // Add the link to the list
                            }
                        }
                    }
                }
            }
        } finally {
            connection.disconnect();
        }

        // Print total number of links
        System.out.println("Total number of links: " + totalLinks);

        // Print each link found
        for (String link : links) {
            System.out.println("Link: " + link);
        }

        // Return the list of links
        return links;
    }
	}



