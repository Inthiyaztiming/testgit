package PracticePackage;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class printingLinks {
	WebDriver driver;

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://example.com");
		List<WebElement> links = driver.findElements(By.tagName("a"));

		// Initialize HttpClient
		HttpClient client = HttpClient.newHttpClient();

		// Iterate through each link
		for (WebElement link : links) {
			String url = link.getAttribute("href");

			// Send HTTP request and print status code
			HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url))
					.method("HEAD", HttpRequest.BodyPublishers.noBody()).build();

			HttpResponse<Void> response = client.send(request, HttpResponse.BodyHandlers.discarding());
			System.out.println(url + " | " + response.statusCode());
		}

		// Close the browser
		driver.quit();
	}

	public void forPrintinglinks(WebDriver driver) {
		this.driver = driver;
		List<WebElement> links = driver.findElements(By.tagName("a"));

		System.out.println("Total links: " + links.size());

		for (WebElement link : links) {
			System.out.println(link.getText() + " --> " + link.getAttribute("href"));
		}

	}

}
