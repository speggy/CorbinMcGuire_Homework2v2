# CorbinMcGuire_Homework2 Clock Application
This application is the second homework assignment for CEG 4110. The purpose of this project is to practice various 
software design patterns. 

### Software Design
<p>This application is setup to use Model-View-Controller design pattern. The timeDate Model supplies all the member variables and getter and setter
functions when setting the time via the views and controllers. The main features implemented allow the user to change the model by inputting 
new values for the time (hours, minutes, seconds) and the date (months, days, years). Users are also capable of starting multiple views of 
different clock types -- Analog or Digital. The digital and analog clocks also show the current time that has been updated by the user. </p>
<img src="time.png" alt="digital view">

### Personal Experience of Implementation
<p>This proved to be a difficult task implementing. Due to time constraints and the programming environment, I did not finish this assignment. 
I worked in Android Studio and it was difficult to implement MVC when dealing with various activities and trying to decide which file was 
a controller or a view or whichever it was. I didn't get around to implementing the Command design pattern. I used the Singleton design pattern
to make sure only ever one instance of the dateTime was created to make sure all the views updated from the same model object. </p>
