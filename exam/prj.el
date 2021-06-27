(jdee-project-file-version "1.0")
(jdee-set-variables
'(jdee-jdk-registry (quote (("1.7" . "/usr/lib/jvm/java-7-openjdk-i386"))))
'(jdee-import-auto-sort t)
'(jdee-build-function (quote jdee-ant-build))
'(jdee-ant-user-jar-files (quote ("/usr/share/java/ant-contrib-1.0b5-SNAPSHOT.jar")));; must install ant ant-contrib
;;'(jdee-bug-jre-home "/usr/lib/jvm/java-7-openjdk-i386/jre")
'(jdee-checkstyle-classpath (quote ("~/.emacs.d/jars/checkstyle-all.jar")) t) ;;  override global-classpath , must be  classes for all sources 
'(jdee-checkstyle-style "~/.emacs.d/jars/checkstyle-all/sun_checks.xml" t)
'(jdee-compile-option-debug (quote ("all" (t t t))))
;'(jdee-help-browser-function (quote browse-url-firefox)) ;; open doc by firefox
'(jdee-help-browser-function "w3m-browse-url")
'(jdee-server-dir "~/.emacs.d/jdee-server-master/target")
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; 
;;   '(jdee-ecj-command-line-args( quote ("-g" "-d" "/ssh:bandit12@bandit.labs.overthewire.org:/tmp/"  "-source"   "1.7"  "-target"  "1.7"  "-warn:-serial")))  ;; this is for flymake , it is already contains -Xemacs  -noExit to hook ecj.jar  into flymake, see  /root/.emacs.d/elpa/jdee-20160728.1152/jdee-ecj-flymake.el 
;;'(jdee-run-option-classpath "global")  ;;will not override  jdee-global-classpath, global means same as jdee-global-classpath
'(jdee-xref-cache-size 3)  ;; memory for 3 package at once cache memory 
'(jdee-xref-store-prefixes (quote     ("a" "b" "c" "d" "e" "f" "g" "h" "i" "j" "k" "l" "m" "n" "o" "p" "q" "r" "s" "t" "u" "v" "w" "x" "y" "z" "A" "B" "C" "D" "E" "F" "G" "H" "I" "J" "K" "L" "M" "N" "O" "P" "Q" "R" "S" "T" "U" "V" "W" "X" "Y" "Z" ))) ;; c-h v .must be done, then  jdee-xref-make-xref-db
'(jdee-xref-db-base-directory                  "/home/jdee_workspace/exam")      

'(jdee-compile-option-directory "./bin") ;; must be one classes, this is for compiler C-c C-v C-c, not for flymake , the flymake destination is (jdee-ecj-command-line-args -d [here]
'(jdee-ecj-command-line-args( quote ("-g" "-d" "/home/jdee_workspace/exam/bin/" "-source"   "1.7"  "-target"  "1.7"  "-warn:-serial")))  ;; this is for flymake , it is already contains -Xemacs  -noExit to hook ecj.jar  into flymake, see  /root/.emacs.d/elpa/jdee-20160728.1152/jdee-ecj-flymake.el 
;; all jars in the system here  /usr/share/java/
'(jdee-sourcepath (quote               ("./src"   "../sourcePathx/sources/src_jdk_1.7.zip" ))) ;;java for current package  and  external packages 
'(jdee-compile-option-classpath (quote ("./src" ))) ;; java of current package, then  [[[classes ]]] of  external packages 
'(jdee-run-option-classpath (quote     ("./bin" ))) ;; override global-classpath , must be  classes for all sources 
'(jdee-db-option-classpath (quote      ("./bin" ))) ;; override global-classpath , must be  classes for all sources 
'(jdee-global-classpath (quote         ("./bin" ))) ;; classes for all sources
'(jdee-built-class-path    (quote      ("./bin" ))) ;; used by xref, then  jdee-xref-make-xref-db

;;'(jdee-jdk-doc-url "file:///root/.emacs.d/jars/docs/api")
;; documentation , must be without / at the end 
;; c-c c-v c-w
;; ../sourcepathx/
'(jdee-help-docsets
    (quote
    (
     ("JDK 1.7 Javadoc" "file:///home/jdee_workspace/sourcePathx/doc/jdk-7u79-docs-all/api"       "1.7")
     ("serlvet3 doc"    "file:///home/jdee_workspace/sourcePathx/doc/servlet-3_0-final-javadoc"   "1.7")
     (nil "http://docs.oracle.com/javase/8/docs/api" "1.8")
     (nil "http://docs.oracle.com/javase/6/docs/api" "1.6")
     (nil "http://docs.oracle.com/j2se/1.5.0/docs/api" "1.5"))))

)


;; '(semantic-java-dependency-system-include-path (quote  ("/home/jdee_workspace/second/src/" "~/.emacs.d/jars/src_jdk_1.7.zip") ))
;; '(semantic-java-dependency-system-include-path (quote ("/home/jdee_workspace/second/src/")))
;;'(semanticdb-persistent-path (quote /home/jdee_workspace/second/src/))

;; '(jdee-lib-directory-names (quote ("/lib$" "/jar$")))
;;'(jdee-run-working-directory ".")
;; "/usr/lib/jvm/java-7-openjdk-i386/jre/lib/rt.jar"
;; /root/.emacs.d/jars/src_jdk_1.7.zip:/home/jdee_workspace/web1/bin:/home/jdee_workspace/web1/src:/usr/lib/jvm/java-7-openjdk-i386/jre/lib/rt.jar
;; '(jdee-sourcepath (quote ("./src/main/java" "./src/test/java" "$JAVA_HOME/src.zip")))
;; (setenv "ANT_HOME" "/usr/local/oss/apache-ant-1.9.6")
;; (setenv "JAVA_HOME"  "/usr/local/oss/jdk1.8.0_60")
;; (setenv "MAVEN_HOME" "/usr/local/oss/apache-maven-3.3.3")
;; (setenv "CLASSPATH"  "/root/.emacs.d/jars/src_jdk_1.7.zip:/home/jdee_workspace/web1/bin:/home/jdee_workspace/web1/src:/home/jdee/lib/rt.jar" ) 

;; [[[ very important ]]]
;; jdee-checkstyle-classpath  override       jdee-global-classpath
;; jdee-db-option-classpath   override       jdee-global-classpath
;; jdee-run-option-classpath  local overrid  jdee-global-classpath but global not overrid jdee-global-classpath




