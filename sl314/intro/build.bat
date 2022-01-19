@echo off
REM This Windows script deploys JSP and static pages to the ROOT context

if %TOMCAT_HOME%a==a goto setupError

echo Copying any HTML pages to the ROOT context
copy *.html %TOMCAT_HOME%\webapps\ROOT

echo Copying any JSP page to Tomcat root
copy *.jsp %TOMCAT_HOME%\webapps\ROOT

echo Done.
goto :done

:setupError
echo You must first initialize the build environment
echo The following environment variables must be set: TOMCAT_HOME

:done
