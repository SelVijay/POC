java -jar selenium-server-standalone-2.48.2.jar -role webdriver -hub http://localhost:4444/grid/register -browser "browserName=firefox, platform=WINDOWS, maxInstances=3" -port 5555 