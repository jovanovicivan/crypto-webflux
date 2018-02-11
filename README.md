A small demo combining Spring-WebFlux, Mongo reactive driver and SSE.

It has a scheduled job that takes current bitcoin value from coinmarketcap.com and inserts it into the DB.

The demo app is a simple webpage that displays the last value from the DB reactively (upon insertion) without the refresh of the page using SSE and reactive mongo driver.

This app is just for my own learning and demoing purposes.

Steps to run the application:

1.  Install and run Mongo locally 
2.  Run the script src/main/resources/mongo-init on your Mongo DB
3.  Run the Application class from java folder