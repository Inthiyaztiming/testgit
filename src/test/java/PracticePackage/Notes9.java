//---------------------------Fork in Github-----------------------------
//A fork is a personal copy of someone else’s repository on GitHub. When you fork a repo, you create your own copy where you can freely 
//experiment, make changes, and develop independently without affecting the original project. Later, you can propose your changes back to 
//the original repo using a pull request.
//Technically, forking is meant for copying other people’s repositories, not your own. But if you want a copy of your own repo, you 
//usually just clone it locally or create a new repo and push your code there.
//we can do that using copy paste also but if we use fork it
//Keeps commit history so you keep track of changes over time, You can fetch updates from the original repo and keep your fork up to date
//Visibility: GitHub clearly shows your repo is a fork, so others know it’s based on the original.

//---------------------------Fork in Postman-----------------------------
//In Postman, forking creates a copy of a collection or environment, allowing you to work independently without affecting the original. 
//When you fork a collection, the "Watch original collection" option (enabled by default) lets you receive notifications if any changes 
//are made to the original. This is useful for staying up to date.
//Postman clearly marks which collection is the original and which is a fork, helping maintain transparency. Forking also enables 
//collaboration, allowing multiple team members to work on APIs simultaneously without conflicts. Changes made in the fork can later
//be merged back into the original using a merge request.


//-------------------------------Delete---------------------------
//Delete removes all rows from a table and keeps the table structure intact.
//Removes rows from a table based on a condition using a WHERE clause.
//If WHERE is not used, it deletes all rows but keeps the table structure intact.
//Deletes rows one by one, so it can be slower for large tables.

//-------------------------------Truncate---------------------------
//TRUNCATE removes all rows from a table and keeps the table structure intact similar to delete
//We Cannot use a WHERE clause — removes all rows, and faster than DELETE because it deallocates data pages instead of deleting row by row.
//deallocating data pages means the database frees whole chunks of storage at once, effectively removing all rows at once, 
//rather than deleting them one by one.

//-------------------------------Drop---------------------------
//Removes the entire table structure and all data permanently.
//We Cannot use a WHERE clause- removes entire table from the database.


//---------------------------------------------Equi/Simple/Inner Join------------------------------------
//An INNER JOIN returns only the rows that have matching values in both tables based on the join condition. It retrieves the 
//common records between two tables.

//Suppose you have two tables: customers and orders

//Customers

//customer_id	 name
//1	             Alice
//2	              Bob
//3	             Charlie

//Orders
//order_id	 customer_id	     amount
//101	          1	              500
//102	          2	              300
//103	          4	              200

//How it works:-
//The customer_id is the common column in both tables. INNER JOIN returns only the rows where the customer_id exists in both tables. 
//So, for customer_id 1 and 2, which are present in both tables, it returns the matching data (Alice and Bob with their order amounts). 
//It excludes customer_id 3 (which exists only in Customers) and customer_id 4 (which exists only in Orders) 
//because they don’t have matches in both tables.

//---------------------------------------------LEFT JOIN (or LEFT OUTER JOIN)------------------------------------
//A LEFT JOIN returns all rows from the left table and the matched rows from the right table based on a specified condition. 
//If there’s no match in the right table for a left table row, the right table columns show NULL.

//---------------------------------------------RIGHT JOIN (or RIGHT OUTER JOIN)------------------------------------
//A RIGHT JOIN returns all rows from the right table, and matching rows from the left table.
//If there’s no match in the left table for a right table row, the left table columns show NULL.

//---------------------------------------------FULL OUTER JOIN------------------------------------
//A FULL OUTER JOIN returns all rows from both tables, whether they have matching rows or not.
//If there’s a match, you get combined data from both tables.
//If there’s no match in the right table for a left table row, the right table columns show NULL.
//If there’s no match in the left table for a right table row, the left table columns show NULL.

//---------------------------------------------SELF JOIN------------------------------------
//SELF JOIN compares rows to rows inside the same table.
//You use aliases (nicknames) to give the table two different names in the same query.
//This helps SQL tell which copy of the table you’re referring to.
//Useful to compare rows inside the same table, like finding an employee’s manager when both are in the same table.

/*
A Primary Key uniquely identifies each record in a table 
Must be unique for each record and cannot be null.
Defined within the same table.

A Foreign Key creates a link between two tables by referencing the Primary Key of another table.
Can have duplicates (same value can appear in multiple rows).
Can be NULL (if relationship allows).
*/








