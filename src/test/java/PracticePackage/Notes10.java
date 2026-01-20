//--------------------------------------------Xpath vs CSS-------------------------------------------

//If I can uniquely identify an element using a simple id or class, I prefer using CSS selectors because they’re easier to write and read — 
//like #id or .class. CSS can only go from parent to child — it can’t go upward in the DOM — but for basic selections, that’s usually enough.

//When I need to do more complex things, like selecting a parent, filtering based on text, or combining multiple conditions, I switch to XPath. 
//XPath supports many functions and axes that CSS doesn’t, like contains(), ancestor::, and following-sibling.

//Talking about speed — CSS is usually faster than XPath because browsers are designed to use CSS for rendering and styling. 
//They optimize CSS selectors internally, and they’re also used directly in JavaScript methods like querySelector, which makes them efficient.

//So overall, I choose between CSS and XPath based on the requirement — CSS for simplicity and speed, XPath for complex or advanced selection.

/*

O(n)
Big O notation is a way to describe how fast an algorithm’s time or memory usage grows as the input size grows.
Think of it as a “speedometer” for algorithms — it doesn’t give exact seconds, but tells you how much slower it gets when the input gets bigger.
n = number of items your algorithm has to handle.



*/