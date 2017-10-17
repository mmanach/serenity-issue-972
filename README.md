# serenity-issue-972
Please see the link for the issue details.
https://github.com/serenity-bdd/serenity-core/issues/972

**It seems that it comes from a combination of the same folder name / story name and a @issue meta tag in the story**

```
        at net.thucydides.core.reports.html.Breadcrumbs$BreadcrumbsBuilder.fromTagsIn(Breadcrumbs.java:32)
SOME REPORT PAGES COULD NOT BE GENERATED
 * Failed to generate report for TagReportingTask for TestTag{name='Search2/Search2', type='story'} - java.util.concurrent.ExecutionException: java.lang.StackOverflowError
com.google.common.base.Splitter$SplittingIterator.computeNext(Splitter.java:506)

```

## Configurations
For now, only tested on Windows 10 and with Chrome and Firefox (both last version).

* Selenium
    * Currently using 3.5.2 selenium libs embedded by Serenity 1.6.5

To run  tests in local, you need to download the browser's drivers :
* chromedriver
    * Tested 2.32 with Chrome 60 (64bits)
    * https://sites.google.com/a/chromium.org/chromedriver/downloads
* geckodriver
    * Tested 0.19 with Firefox 55 (64bits)
    * https://github.com/mozilla/geckodriver/releases
    
And to set up them in your environment path.


## Run tests
For running and reproduce issue, one way, with gradle :
```
> gradle clean testGui aggregate
```
(parallel execution)
   

