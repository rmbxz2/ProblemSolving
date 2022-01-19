#!/bin/csh -f
# This UNIX script deploys JSP pages and static pages to the ROOT

echo Copying any HTML pages to the ROOT context
cp *.html $TOMCAT_HOME/webapps/ROOT

echo Copying any JSP page to Tomcat root
cp *.jsp $TOMCAT_HOME/webapps/ROOT
