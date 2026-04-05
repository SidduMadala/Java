package InterviewProg;

public class AssenDesind_Order {

	public static void main(String[] args) {
		int sid[] = { 5, 7, 9, 3, 1, 2, 4, 6, 8, 0 };
		for (int i = 0; i < sid.length; i++) {
			for (int j = i + 1; j < sid.length; j++) {
				if (sid[i] > sid[j]) {
					int temp = sid[i];
					sid[i] = sid[j];
					sid[j] = temp;
				}
			}
		}
		System.out.println("assending order:");
		for (int num : sid) {
			System.out.println(num + "");
		}
	}

}




//In my project, I work on automation testing using Java, Selenium WebDriver, TestNG, and Cucumber. We developed a framework using the Page Object Model (POM) design pattern, where each web page is maintained as a separate class to improve reusability and maintainability.

//We implemented data-driven testing using Excel and JSON to execute the same test cases with multiple data sets. For test management, we use TestNG features like prioritization, grouping (Smoke, Sanity, Integration), and retry analyzers.

//We also capture screenshots automatically when test cases fail and generate reports using Extent Reports and Cucumber HTML Reports. The framework is managed with Apache Maven and integrated with Jenkins for CI/CD to run automated regression tests.

//My responsibilities include writing automation scripts, maintaining the framework, debugging issues, and supporting CI/CD execution.
