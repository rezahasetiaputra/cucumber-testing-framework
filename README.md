# cucumber-testing-framework and API testing pactum
precondition :
1. Clone this repo

How to run Automation Test for Web
1. have chrome browser and chromedriver installed
2. make sure already installed maven , if no you can download in this [link](https://maven.apache.org/download.cgi)
3. cd cucumber/ 
4. mvn clean verify

to open report : <br>
open target/site/serenity/index.html

How to run API Test
1. cd testAPI/
2. npm install -D pactum 
3. npm install -g mocha
4. npm run test