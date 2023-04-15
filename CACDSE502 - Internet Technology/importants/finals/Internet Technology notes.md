# What is an email address?
An email address is a designation for an electronic mailbox that sends
and receives messages, known as email, on a computer network. Since the
1980s, all email addresses follow the same format: @. An example is
below.

<h5 style="text-align: center;">
janedoe@domainname.com
</h5>

On the far right, the .com component represents the top level domain 
(TLD) for the email address.

An email address, such as john.smith@example.com, is made up from a
local-part, the symbol @, and a domain, which may be a domain name or
an IP address enclosed in brackets.

# SLIP and PPP
The Serial Line Internet Protocol (SLIP) is an encapsulation of the
Internet Protocol designed to work over serial ports and modem
connections. SLIP has been largely replaced by the Point-to-Point
Protocol (PPP), which has more features and does not require a
predefined IP address configuration.

# URL
A Uniform Resource Locator, colloquially termed as a web address, is a
reference to a web resource that specifies its location on a computer
network and a mechanism for retrieving it. A URL is a specific type of
Uniform Resource Identifier, although many people use the two terms
interchangeably.

# Router vs Switch
| | Router | Switch|
| --- | --- | --- |
| 1 | The main objective of router is to connect various networks simultaneously. | While the main objective of switch is to connect various devices simultaneously. |
| 2 | It works in network layer. | While it works in data link layer. |
| 3 | Router is used by LAN as well as MAN. | While switch is used by only LAN. |
| 4 | Through the router, data is sent in the form of packets. | While through switch data is sent in the form of frame. |
| 5 | There is less collision taking place in the router. | While there is no collision taking place in full duplex switch. |
| 6 | Router is compatible with NAT. | While it is not compatible with NAT. |

# TCP/IP
TCP/IP Reference Model is a four-layered suite of communication
protocols. It was developed by the DoD (Department of Defence) in the
1960s. It is named after the two main protocols that are used in the
model, namely, TCP and IP. TCP stands for Transmission Control Protocol
and IP stands for Internet Protocol.

The following diagram shows the layers and the protocols in each of the
layers
![[tcpip.jpeg]]

# Client-Server Model
The Client-server model is a distributed application structure that
partitions task or workload between the providers of a resource or
service, called servers, and service requester called clients. In the
client-server architecture, when the client computer sends a request
for data to the server through the internet, the server accepts the
requested process and deliver the data packets requested back to the
client. Clients do not share any of their resources. Examples of
Client-Server Model are Email, World Wide Web, etc.

## Working
![[cliserv.jpeg]]
### Client
When we talk the word Client, it mean to talk of a person or an
organization using a particular service. Similarly in the digital
world a Client is a computer (Host) i.e. capable of receiving
information or using a particular service from the service providers 
(Servers).

### Servers
Similarly, when we talk the word Servers, it mean a person or medium
that serves something. Similarly in this digital world a Server is a
remote computer which provides information (data) or access to
particular services. So, its basically the Client requesting something
and the Server serving it as long as its present in the database.
![[serv.jpeg]]
Advantages of Client-Server model:
- Centralized system with all data in a single place.
- Cost efficient requires less maintenance cost and Data recovery is possible.
- The capacity of the Client and Servers can be changed separately

# HTTP vs HTTPS
|HTTP|HTTPS|
|---|---|
|It is hypertext transfer protocol|It is hypertext transfer protocol with extra security.|
| It is neither secure or reliable. | It is secure and reliable. |
| HTTP URL begins with `http://` | HTTPS URL begins with `https://` |
|It uses port 80 by default.|It uses port 443 by default.|
|It is subjected to man-in-the-middle and eavesdropping attack|It is designed to withstand such attacks and is considered a secure option due to this feature.|

# Search Engine
A search engine is a software system designed to carry out web
searches. They search the World Wide Web in a systematic way for
particular information specified in a textual web search query. The
search results are generally presented in a line of results, often
referred to as search engine results pages.

# Cookies
HTTP cookies are small blocks of data created by a web server while a
user is browsing a website and placed on the user’s computer or other
device by the user’s web browser. Cookies are placed on the device used
to access a website, and more than one cookie may be placed on a user’s
device during a session.

# Web-server
A web server is computer software and underlying hardware that accepts
requests via HTTP or its secure variant HTTPS. A user agent, commonly a
web browser or web crawler, initiates communication by making a request
for a web page or other resource using HTTP, and the server responds
with the content of that resource or an error message.

# Internet vs Intranet
|Internet|Intranet|
|---|---|
|The Internet is a wide network or computers.|The Internet is a wide network or computers.|
|Internet contains a large number of intranet.|Intranet can be accessed from the internet with specific instructions.|
|Number of internet users are very high.|Number of users is limited.|
|Internet contains various source of information.|Intranet only contains group-specific information.|
|Anyone can access the internet.|Accessible only by the organization employees or admin who have login details|
|It is not as safe as compared to intranet|It is a safe and secure network.|
|It is public by nature.|It is private by nature.|



# What is markup language?
Markup language refers to a text-encoding system consisting of a set of
symbols inserted in a text document to control its structure,
formatting, or the relationship between its parts. Markup is often used
to control the display of the document or to enrich its content to
facilitating automated processing.

# HTML
The HyperText Markup Language or HTML is the standard markup language
for documents designed to be displayed in a web browser. It can be
assisted by technologies such as Cascading Style Sheets (CSS) and
scripting languages such as JavaScript.

## Features
- It is a very easy and simple language. It can be easily understood and modified.
- It is a markup language, so it provides a flexible way to design web pages along with the text.
- It is Platform-independent because it can be displayed on any platform like Windows, Linux, and Mac etc.
- It facilitates the programmer to add Graphics, Videos, and Audio to the web pages which makes it more attractive and interactive.
- HTML is a case-insensitive language, which means we can use tags either in lowercase or upper-case.

# DHTML
Dynamic HyperText Markup Language(DHTML) is a combination of web
development technologies used to create dynamically changing websites.
Web pages may include animation, dynamic menus and text effects. The
technologies used include a combination of HTML, JavaScript or VB
Script, CSS and the Document Object Model(DOM).

## Features
- Simplest feature is that we can create web pages dynamically.
- Dynamic Style is a feature, that allows the user to alter the font, size, color and content of a web page.
- Using DHTML, users can easily create dynamic fonts for their websites or web pages.
- With the help of DHTML, users can easily change the tags and their properties.
- It also provides the feature in browsers for data binding.

# HTML vs DHTML
| HTML | DHTML |
| --- | --- |
| HTML is a mark-up language. | DHTML is a collection of technology. |
| HTML is used to build a static document page and to specify the hyperlinks. | DHTML describes the technologies used to build dynamic and interactive web pages. |
| HTML does not include server-side code. | DHTML includes server-side code. |
| HTML does not require database connectivity. | DHTML may require database connectivity as it interacts with the user. |
| HTML pages do not use event methods. | DHTML pages make use of event methods. |


# Different HTML tags
```html
<html>
<head>
<body>
<h1......h6>
<p>
<br>
<hr>
<style>
<table>
<td>
<tr>
```
# Tables in html (nested table)
The HTML table allow web author or web developers to arrange data like
text, images, link, other table etc into row & column of cells.

The HTML table are created using the \<table> tag in which the \<tr>
tags is used to create table rows & \<td> tag is used to create table
data cell.

The format for table is
```html
<table>
	<tr>
		<th></th>
		<th></th>
	</tr>
	<tr>
		<td></td>
		<td></td>
	</tr>
</table>
```
Let us take an example of nested table to understand how the table is
work.
```html
<!DOCTYPE html>
<html>
	<head>
	</head>
	<body>
		<table border="1">
		<tr>
			<td>
			</td>
			<td>This cell contains a table:
				<table border="1">
					<tr>
						<td>A</td>
						<td>B</td>
					</tr>
					<tr>
						<td>C </td>
						<td>D</td>
					</tr>
				</table>
			</td>
		</tr>
		<tr>
			<td>Hello </td>
			<td>HELLO</td>
		</tr>
		</table>
	</body>
</html>
```
![[Pasted image 20230203155112.png]]

# CSS
CSS stands for Cascading Style Sheets. It is a style sheet language
which is used to describe the look and formatting of a document written
in markup language. It provides an additional feature to HTML. It is
generally used with HTML to change the style of web pages and user
interfaces.

## Features
- CSS saves time
- Easy Maintenance
- Multiple device compatibility
- Provides more attribut

# Inline CSS, Internal CSS, External CSS.
## Inline CSS
\<h1 style="background-color:yellow;"> This is a heading </h1>
\<p style="color:red"> This is some pragraph </p>

## Internal CSS
```html
<style>
 h1{
 background-color : yellow;
 color : red; }
</style>
<h1> This is a heading </h1>
```

## External CSS
*To create an external css file, we use the `.css` extension*
```css
/* Using tag name as a selector here */
 h1{
 background-color:orange;
}
/* Using class as a selector here */
.box{
 height:200px;
 width:300px;
 background-color:yellow;
}
/* Using ID as a selector here */
#circle{
 height:200px;
 width:200px;
background-color:red;
 border-radius:50%;
}
```

# HTML form control(different attribute)
There are types HTML form attributes i.e.
- Action attribute
	- The action attributes defines the action to be performed when the form is submitted.
	- Usually the form data is sent to a file on the server when the user clicks on the submit button.
- Target attribute
	- The target attribute specifies where to display the response that is received after submitting the form.
- Method attribute
	- The method attribute specifies the HTTP method to be used when submitting the form data.
- Autocomplete attribute
	- The autocomplete attribute specifies whether a form should have autocomplete on or off.

# Style-sheets.
A style sheet is a mechanism used to define the overall look and feel of the markup language file. For example, a CSS file contains style sheets that could define the page's font type, background color, and other qualities.

There are three types of SS which are given below:
1. **Inline SS:** Inline SS contain the SS property in the body section attached with element is known as inline SS.
2. **Internal or Embedded SS:** This can be used when a single HTML document must be style uniquely. The SS rule set should be within the HTML file in the head section i.e. the SS is embedded within the HTML file. 
3. **External SS:** External SS contains separate SS file which contains only style property with the help of tag attribute. (e.g. class, id, heading etc.).

# DTD(Document type decoration)
The XML document type declaration commonly known as DTD, is a way to describe XML language precisely. DTD check vocabulary & validity of the structure of XML document against grammatical rules of appropriate XML language.

An XML DTD can be either specified inside the document, or it can be kept us a separate document & these liked separately.

## Purpose of DTD
Its main purpose is to define structure of an XML document. It contains a list of legal element & define the structure with the help of them.

Let’s take an example of well-formed & valid XML document. It follows all the rules of DTD.
```xml
<?xml version="1.0"?>
	<!DOCTYPE employee SYSTEM "employee.dtd">
	<employee>
		 <firstname>vimal</firstname>
		 <lastname>jaiswal</lastname>
		 <email>vimal@javatpoint.com</email>
	</employee> 
```

# WML
Wireless Markup Language, based on XML, is a now-obsolete markup language intended for devices that implement the Wireless Application Protocol specification, such as mobile phones. It provides navigational support, data input, hyperlinks, text and image presentation, and forms, much like HTML.

# What is frame and frame set in HTML?
1. Frameset:
	1. All frames are defined under frameset. To use frameset, use `<frameset>` tag and avoid `<body>` tag. We can set the rows and columns attributes for this frameset to define layout. 
	2. Example of Frameset: `<frameset rows="70%,30%" border="3">`
 2. Frame:
	 1. Each frame section defined using a frame tag along with page or file source that you want to load in that frame. You can set a name to each frame. 
	 2. Example of Frameset: `<frame name="left-frame" src="leftsection.html">`
*Example:*
```html
<!DOCTYPE html>
<html>
	<frameset cols="25%,50%,25%">
		<frame src="page1.htm">
		<frame src="page2.htm">
		<frame src="page3.htm">
	</frameset>
</html>
```
# List tags
HTML lists allow web developers to group a set of related items in lists.
## Unordered HTML List
An unordered list starts with the `<ul>` tag. Each list item starts with the `<li>` tag.

The list items will be marked with bullets (small black circles) by default: 
```html
<ul>
    <li>Coffee</li>
    <li>Tea</li>
	<li>Milk</li>
</ul>
```
## Ordered HTML List
An ordered list starts with the `<ol>` tag. Each list item starts with the `<li>` tag.

The list items will be marked with numbers by default:
```html
<ol>
    <li>Coffee</li>
    <li>Tea</li>
    <li>Milk</li>
</ol>
```

# What is scripting language? What are the different types of scripting languages?
A scripting language is a programming language that is interpreted. It is translated into machine code when the code is run, rather than beforehand. A scripting language is a programming language designed for integrating and communicating with other programming languages.

Scripting language do not required the compilation step rather than its interpreted.It is translated into machine code when the code is run.Scripting language is design to integrating and communicating with other programming languages.

Different types of scripting languages are :
- JavaScript
- Python
- Ruby
- Bash
- Perl etc. 

# What is client-side scripting and server-side scripting?
The main difference between server-side scripting and client-side scripting are as follows:

## Server-side Scripting
1. The main function of server-side scripting is to manipulate and grant access to the requested database.
2. It is employed at the backend, where the source code is invisible or concealed on the client side.
3. It needs server interaction.
4. It more secure while working on a web app.
5. It execute on the web server.
6. It enables the backend developer to hide the source code from the user.
7. The server-side scripting programming languages, such as PHP, Python, ASP.net, Java, C++, Ruby, C#, etc.

## Client-side scripting
1. The main purpose of client-side scripting is to give the requested output to the end-user.
2. It is utilized at the front end, which users may view through the browser.
3. It doesn’t need any server interaction.
4. It is less secure than server-side scripting due to the code accessibility offered to the client.
5. It executes on the remote computer system.
6. It depends on the user’s browser version.
7. Its programming languages are HTML, CSS, and JavaScript. 

# What us JavaScript variable? How JavaScript variable declare and initialized?
A JavaScript variable is simply a name of storage location. There are two types of variables in JavaScript: local variable and global variable.In JavaScript we can declare a variable in 4 ways i.e.
## Using `var`
```html
<script>
	var x=5;
	var y=4;
	var z= x+y;
	document.write(z);
</script>
```
## Using `let`
```html
<script>
	let x= 5;
	let y= 7;
	let z= x+y;
	document.write(z);
</script>
```
## Using `const`
```html
<script>
	const price1 = 5
	const price2 = 6;
	let total = price1 + price2;
	document.write(total);
</script>
```
## Using nothing
```html
<script>
	x = 5;
	y = 7;
	z = x+y;
	document.write(z);
</script>
```

# How function are used in JavaScript? Give example.
JavaScript Functions are used to perform operations. We can call JavaScript function many times to reuse the code.

Advantage of JavaScript function:
- **Code re-usability:** We can call a function several times so it save coding.
- **Less coding:** It makes our program compact. We don’t need to write many lines of code each time to perform a common task.

JavaScript Function Syntax:
```javascript
function functionName([arg1, arg2, ...argN]){
	//code to be executed 
}
```

Let us take an example:
```html
<!DOCTYPE html>
<html>
	<head>
		<title>Function</title>
	</head>
	<script>
		function msg(){
			alert("hello! this is message");
		}
	</script>
	<body>
		<input type="button" onclick="msg()" value="call function"/>
	</body>
</html>
```
# Write a JavaScript program to demonstrate how form validations are perform.
```html
<html>
	<body>
	<script type="text/javascript">
		function validate() {
			var name=document.valid.name.value;
			var pass=document.valid.pwd.value;
			if(name==null || name=="") {
				alert("Name can't be blank");
				return false;
			} else if(pass.length<6) {
				alert("Password must be atleast 6 characters long");
			return false;
			}
		}
	</script>
		<form name="valid" onsubmit="return validate()">
			Name : <input type="text" name="name"><br />
			Password : <input type="Password" name="pwd"> <br />
			<input type="submit" value="Register">
		</form>
	</body>
</html>
```

# What is event and how event are handle in JavaScript explain with example.
The change in the state of an object is known as an Event. In html, there are various events which represent that some activity is performed by user or by the browser. When JavaScript code is included in html, JavaScript react over these events and allow the execution. This process of reacting over the events is called Event Handling. Thus, JavaScript handles the html events via Event Handlers.

In the following there are some events and there event handlers:
- click : `onclick`
- mouseover: `onmouseover`
- Keydown & Keyup: `onkeydown` & `onkeyup`

Let us take an example:
```html
<html>
	<head> Javascript Events </head>
	<body>
		<script language="Javascript" type="text/Javascript">
		function clickevent() {
			document.write("Im your Dad");
		}
		</script>
		<form>
			<input type="button" onclick="clickevent()" value="Who's this?"/>
		</form>
	</body>
</html>
```

# Write a JavaScript program to find the average of three number(or average of n number).
```html
<html>
	<head>
		<title>Greatest Number Finder</title>
	</head>
	<body>
		Enter numbers:
		<input type="text" id="numbersInput" />
		<br> <br>
		<input type="button" value="Find Greatest" onclick="findGreatest()">
		<script>
			function findGreatest() {
				var input = document.getElementById("numbersInput").value;
				var numbers = input.split(" ").map(function(item) {
				return parseInt(item, 10);
				});
				var greatest = numbers[0];
				for (var i = 1; i < numbers.length; i++) {
					if (numbers[i] > greatest) {
						greatest = numbers[i];
					}
				}
				alert("The greatest number is " + greatest);
			}
		</script>
	</body>
</html>
```

# Constant in JavaScript
Constant are immutable variables whose value cannot be changed. Once we have created a constant, its value can’t be changed.

Lets take an example:
```html
<script>
	const x = 16;
	x = 23; //Type Error
</script> 
```
Above code will generate a type error because it is not possible to reassign the value to a constant.

# Mutable value of JavaScript.
A mutable value is one that can be changed without creating an entirely new value. In JavaScript, objects and arrays are mutable by default, but primitive values are not — once a primitive value is created, it cannot be changed, although the variable that holds it may be reassigned.

# ASP
ASP stands for Active Server Pages. ASP is a development framework for building web pages.
- ASP is an old (but still powerful) tool for making dynamic Web pages.
- ASP is a technology (much like PHP) for executing scripts on a web server.
- ASP is a Microsoft Technology
- ASP is a program that runs inside a web server

## Uses
- Edit, change, add content, or customize any web page
- Respond to user queries or data submitted from HTML forms
- Access databases or other server data and return results to a browser
- Provide web security since ASP code cannot be viewed in a browser
- Offer simplicity and speed

## Working
-When a browser requests a normal HTML file, the server just returns the file. When a browser requests an ASP file, the server passes the request to the ASP engine which reads the ASP file and executes the server scripts in the file. Finally, the ASP file is returned to the browser as plain HTML.

![[Pasted image 20230203222615.png]]

## Session in ASP
In ASP session is a state that is used to store and retrieve values of a user. It helps to identify requests from the same browser during a time period (session). It is used to store value for the particular time session. By default, ASP session state is enabled for all ASP applications.

### Session Variable
The most important thing about the Session object is that you can store variables in it. The example below will set the Session variable username to "Donald Duck" and the Session variable age to "50":`<%Session("username")="Donald Duck"Session("age")=50%>`

When the value is stored in a session variable it can be reached from ANY page in the ASP application: Welcome `<%Response.Write(Session("username"))%>`

## Session object
A Session object stores information about, or change settings for a user session. Variables stored in a Session object hold information about one single user, and are available to all pages in one application.

# IIS/What is IIS used for?
Internet Information Services, also known as IIS, is a Microsoft web server that runs on the Windows operating system and is used to exchange static and dynamic web content with internet users. IIS can be used to host, deploy, and manage web applications using technologies such as ASP/ASP.NET and PHP.

# AJAX? How AJAX works?
AJAX stands for Asynchronous JavaScript and XML. AJAX is a new technique for creating better, faster, and more interactive web applications with the help of XML, HTML, CSS, and Java Script.

- Ajax uses XHTML for content, CSS for presentation, along with Document Object Model and JavaScript for dynamic content display.
- Conventional web applications transmit information to and from the sever using synchronous requests. It means you fill out a form, hit submit, and get directed to a new page with new information from the server.
- With AJAX, when you hit submit, JavaScript will make a request to the server, interpret the results, and update the current screen. In the purest sense, the user would never know that anything was even transmitted to the server.
- XML is commonly used as the format for receiving server data, although any format, including plain text, can be used.
- AJAX is a web browser technology independent of web server software.
![[Pasted image 20230203224101.png]]

## Advantages
1. Reduce server traffic and increase speed: The first and foremost advantage of Ajax is its ability to improve the performance and usability of web applications.
2. Enable asynchronous calls: Ajax benefits web developers in how its framework can be used for lazy loading.
3. `XMLHttpRequest`: `XMLHttpRequest` is a request type widely used for sending a request to Ajax pages.
4. Reduce bandwidth usage: One more advantage of Ajax comes from the bandwidth usage.
5. Form Validation: In contrast to traditional form submission, where client-side validations occur after submission, the AJAX method enables precise and immediate form validation

# VBScript in ASP
VBScript is the simplest language for writing ASP pages. All the code samples in the Creating ASP Pages section are written in VBScript except for samples that are duplicated in JScript for comparison.

# What is ActiveX control in asp?
ActiveX controls are component program objects that Microsoft developed to enable applications to perform specific functions, such as displaying a calendar or playing a video. An ActiveX control is a small program that other applications can reuse to enable the same functionality, without the extra development work.

## What is ActiveX control/component used for?
ActiveX controls are small building blocks that create applications that work over the Internet through Web browsers. Examples include customized applications for collecting data, viewing certain kinds of files, and displaying animation. Common uses of ActiveX controls are command buttons, list boxes, and dialog boxes.

### Looping Statements in ASP
Looping statements are used to run the same block of code a specified number of times. All the code samples in the Creating ASP Pages section are written in VBScript. So, in VBScript we have four looping statements.
1. For...Next statement - runs code a specified number of times
2. For Each...Next statement - runs code for each item in a collection or each element of an array
3. Do...Loop statement - loops while or until a condition is true
4. While...Wend statement - Do not use it - use the Do...Loop statement instead

#### For...Next Loop
We use the For...Next statement to run a block of code a specified number of times. The For statement specifies the counter variable (i), and its start and end values. The Next statement increases the counter variable (i) by one.
```asp
<html>
	<body>
	<%
	For i = 0 To 5
		response.write("The number is " & i & "<br />")
		Next
	%>
	</body>
</html>
```
#### For Each...Next Loop
A For Each...Next loop repeats a block of code for each item in a collection, or for each element of an array.
```asp
<html>
	<body>
	<%
	Dim cars(2)
	cars(0)="Volvo"
	cars(1)="Saab"
	cars(2)="BMW"
	For Each x In cars
		response.write(x & "<br />")
	Next
	%>
	</body>
</html>
```
#### Do...Loop
The Do...Loop statement repeats a block of code while a condition is true, or until a condition becomes true.
```asp
<html>
	<body>
	<%
	i=0
	Do While i < 10
		response.write(i & "<br>")
		i=i+1
	Loop
	%>
	</body>
</html>
```
#### While...Wend statement
In a While..Wend loop, if the condition is True, all statements are executed until Wend keyword is encountered.
```asp
<html>
	<body>
	<%
	i=0
	While i < 10
		response.write(i & "<br>")
		i=i+1
	wend
	%>
	</body>
</html>
```

# ADO
- ADO is a Microsoft technology
- ADO stands for ActiveX Data Objects
- ADO is a Microsoft Active-X component
- ADO is automatically installed with Microsoft IIS
- ADO is a programming interface to access data in a database

# How to accessing a Database from an ASP Page?
The common way to access a database from inside an ASP page is to:
1. Create an ADO connection to a database
2. Open the database connection
3. Create an ADO recordset
4. Open the recordset
5. Extract the data you need from the recordset
6. Close the recordset
7. Close the connection

# ADO Database Connection(ADO Connect)?
Before a database can be accessed from a web page, a database connection has to be established.The easiest way to connect to a database is to use a DSN-less connection. A DSN-less connection can be used against any Microsoft Access database on your web site.

We can connect to the database with the following ASP code:
```asp
<%
set conn=Server.CreateObject("ADODB.Connection")
conn.Provider="Microsoft.Jet.OLEDB.4.0"
conn.Open "c:/webdata/northwind.mdb"
%>
```

# ADO Recordset
To be able to read database data, the data must first be loaded into a recordset. After an ADO Database Connection has been created, it is possible to create an ADO Recordset.

Suppose we have a database named "Northwind", we can get access to the "Customers" table inside the database with the following lines:

```asp
<%
set conn=Server.CreateObject("ADODB.Connection")
conn.Provider="Microsoft.Jet.OLEDB.4.0"
conn.Open "c:/webdata/northwind.mdb"

set rs=Server.CreateObject("ADODB.recordset")
rs.Open "Select * from Customers", conn
%>
```

# Factorial Program
```asp
<html>
	<body>
	<%
	function factorial(n)
	if n = 0 then
		factorial = 1
	else
		factorial = n * factorial(n-1)
	end if
	end function
	n = 5
	response.write("The factorial of " & n & " is " & factorial(n))
	%>
	</body>
</html>
```
