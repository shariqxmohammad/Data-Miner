This web app was created to extract data from specific Excel files and present it in a more user-friendly, readable way. The Excel files are generated monthly to track sales data, and they tend to span a few hundred lines. The Excel data is also packed in adjacent rows and much of it exceeeds the base display area of a cell, making it necessary to click on each individual cell to view its data. This application takes the most crucial data from these files and presents it in a way that is much cleaner. Additionally, this app generates some new data, such as the total monthly revenue and the locations at which there is an unfulfilled order.

The project was built primarily using Maven, Spring MVC, Bootstrap and Java. Our final deployed version is on an OpenShift server (note that sometimes this openshift server can be a bit slow in loading our app).

http://dataminer-gloriousapps.rhcloud.com/

Screenshots:

![Alt text](http://i.imgur.com/B2vDljV.png "Home Page")
![Alt text](http://i.imgur.com/bsE6DHm.png "Upload File")
![Alt text](http://i.imgur.com/VT9dZ6X.png "View of Excel document")
![Alt text](http://i.imgur.com/JzwG4zf.png "Results Page")
![Alt text](http://i.imgur.com/8qBbvlx.png "Error Page")
