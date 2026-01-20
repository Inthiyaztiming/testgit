//--------------------------------COOKIES-----------------
//A cookie is a small piece of data that is stored on your browser by a website you visit. It's used to store information about your 
//interaction with the site. This can include things like:
//Session information (whether you're logged in or not)
//User preferences (language selection, theme settings)
//Tracking data (behavioral analytics, advertisement targeting)
//Authentication tokens (used to maintain your login state)

//-------------------------------How Cache Works---------------------
//When you visit a website for the first time, your browser downloads resources like:
//Images (logos, product images, banners)
//CSS files (stylesheets for the website’s design)
//JavaScript files (scripts for website functionality)
//HTML files (the structure of the web page)
//The browser saves these files in a cache on your local system so that the next time you visit the same website, it can load these
//resources faster without having to download them again from the server.


//Cookies: Store who you are (like login details and preferences) so the website remembers you the next time you visit.

//Cache: Stores static files (like images and styles) to make the page load faster the next time you visit.

//Both are stored after the visit, but they serve different purposes—cookies for identity and cache for speed.

//--------------------------------Waits--------------------------
//In Selenium, waits are crucial for controlling the timing of interactions with web elements. Web elements may not always be immediately 
//available due to delays like network latency, JavaScript rendering, or animations. Without waits, we might encounter errors like 
//ElementNotVisibleException, ElementNotInteractableException, or NoSuchElementException, which happen when we attempt to interact with an 
//before it’s fully loaded or ready.

//1. Implicit Wait
//What it does: Instructs Selenium to wait for a specified amount of time when it can't find an element immediately.
//Key Point: Implicit wait is global and applies to all elements. However, if set too long, it can slow down your tests.
//Implicit wait affects the findElement and findElements calls across the whole WebDriver instance.

//2. WebDriverWait (Explicit Wait)
//What it does: Waits for a specific condition (like visibility or clickability) to be true before proceeding. 
//Use Case: Ideal when you need to wait for an element to be in a ready state (e.g., visible or clickable) before interacting with it.

//3. Fluent Wait
//What it does: An advanced version of WebDriverWait where you can customize:
//Polling frequency (how often the condition is checked).
//Exceptions to ignore while waiting.

//---------------------------------------Acceptance Testing----------------------------------
//Alpha testing is conducted internally by QA and development teams in staging or QA environments. It does not involve production systems or 
//live user data. 
//Once the application passes internal validation, and we're ready to move toward release, now a beta version may be deployed to a 
//limited set of real users outside the organization. This allows us to observe how the application performs in real-world conditions and 
//gather feedback. However, in most companies, especially enterprises, the beta phase is often skipped. 
//Instead, after alpha testing, a dedicated UAT (User Acceptance Testing) team — typically composed of internal business users 
//who understand the application’s requirements and workflows — validates the system. They perform end-to-end business process testing 
//and report any issues. Once UAT is successful and sign-off is given, the product is approved for production release






