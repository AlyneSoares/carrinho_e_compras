## Steps to run the test:

### Required:
You need JAVA JDK with maven, Selenium, Cucumber and WebDrivers (ChromeDriver, GeckoDriver, EdgeDriver) installed.
- When you import the test to your machine, remember substitute the Driver's path ( folder /infrastructure - SetUp class: SetWebDriver() line15: `/home/alyne/workspace/chromedriver`) to your won driver's path

### Run tests:
Open 'prova_4all' in your terminal and type: 
Run test: `mvn test`
it will run all tests (runner: `$ RunCucumberTest.java`)

To run specific tests, go to the Runners:
To run 'BuyCandies' feature:
`$ RunFeatureBuyCandies.java`

To run 'BuySnacksAndDrinks' feature:
`$ RunFeatureBuySnacksAndDrinks.java`

Run parallel tests (I could only do it in VSCode):
- Open 'Explorer' window, go to Maven Projects > prova_4all > plugins > surefire > surefire:test (click)


By default, tests will run on Chrome. 
To change that, specify:
` -Dbrowser={browser}` where {browser} is either chrome, edge or firefox

### Reports
Go to the folder `target/reports` open file `index.html`  to see the test report

