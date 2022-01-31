(package-initialize)
(custom-set-variables
 ;; custom-set-variables was added by Custom.
 ;; If you edit it by hand, you could mess it up, so be careful.
 ;; Your init file should contain only one such instance.
 ;; If there is more than one, they won't work right.
 '(ac-auto-show-menu 0.4)
 '(ac-auto-start 3)
 '(ac-delay 0.4)
 '(ac-dictionary-directories '("~/.emacs.d/Auto_Complete_Dict/dict"))
 '(ac-menu-height 10)
 '(ac-modes
   '(edbi:sql-mode emacs-lisp-mode lisp-mode lisp-interaction-mode slime-repl-mode c-mode cc-mode c++-mode go-mode java-mode malabar-mode clojure-mode clojurescript-mode scala-mode scheme-mode ocaml-mode tuareg-mode coq-mode haskell-mode agda-mode agda2-mode perl-mode cperl-mode python-mode ruby-mode lua-mode tcl-mode ecmascript-mode javascript-mode js-mode js2-mode php-mode css-mode scss-mode less-css-mode makefile-mode sh-mode fortran-mode f90-mode ada-mode xml-mode sgml-mode web-mode ts-mode sclang-mode verilog-mode qml-mode apples-mode text-mode sql-mode jdee-mode restclient-mode))
 '(ansi-color-names-vector
   ["#2e3436" "#a40000" "#4e9a06" "#c4a000" "#204a87" "#5c3566" "#729fcf" "#eeeeec"])
 '(appt-display-duration 999)
 '(auto-revert-verbose nil)
 '(auto-save-default nil)
 '(auto-save-timeout 0)
 '(auto-save-visited-file-name t)
 '(auto-save-visited-interval 2)
 '(auto-save-visited-mode nil)
 '(autofit-frames-flag nil)
 '(avy-all-windows 'all-frames)
 '(avy-background t)
 '(aw-ignore-on nil)
 '(battery-mode-line-format " 🁨%b%p%% ")
 '(bidi-paragraph-direction 'left-to-right)
 '(blink-cursor-mode nil)
 '(bmkp-last-as-first-bookmark-file "/home/importantDIR/EmacsBookmark/bookmarks")
 '(bookmark-default-file "/home/importantDIR/EmacsBookmark/bookmarks")
 '(calendar-latitude 31.9565783)
 '(calendar-longitude 35.945695099999966)
 '(column-number-mode t)
 '(confirm-kill-emacs 'y-or-n-p)
 '(current-language-environment "Arabic")
 '(custom-enabled-themes '(monochrome))
 '(custom-safe-themes
   '("39dd7106e6387e0c45dfce8ed44351078f6acd29a345d8b22e7b8e54ac25bac4" default))
 '(default-input-method "arabic")
 '(delete-by-moving-to-trash t)
 '(desktop-path '("/home/importantDIR/EmacsDesktop/"))
 '(desktop-save-mode t)
 '(diary-file "/home/importantDIR/EmacsBookmark/diary")
 '(dired-details-hidden-string "")
 '(dired-dwim-target t)
 '(dired-listing-switches "-alh")
 '(dired-no-confirm nil)
 '(dired-recursive-copies 'always)
 '(dired-use-ls-dired t)
 '(diredfl-global-mode t nil (diredfl))
 '(diredp-hide-details-initially-flag t)
 '(display-battery-mode t)
 '(display-time-default-load-average 0)
 '(display-time-format " ♥%I:%M %p♥")
 '(display-time-mode t)
 '(doc-view-continuous t)
 '(doc-view-pdf->png-converter-function 'ignore)
 '(emms-volume-change-amount 10)
 '(flycheck-check-syntax-automatically '(idle-change mode-enabled))
 '(flycheck-checker-error-threshold 200)
 '(flymake-allowed-file-name-masks
   '(("\\.xxxx\\'" jdee-ecj-flymake-init jdee-ecj-flymake-cleanup)))
 '(flymake-check-file-limit 250000 t)
 '(flymake-compilation-prevents-syntax-check t)
 '(flymake-cursor-auto-enable t)
 '(flymake-cursor-error-display-delay 1.5)
 '(flymake-cursor-number-of-errors-to-display nil)
 '(flymake-master-file-count-limit 10000)
 '(flymake-no-changes-timeout 2)
 '(flymake-proc-allowed-file-name-masks
   '(("\\.xxxxx\\'" jdee-ecj-flymake-init jdee-ecj-flymake-cleanup)))
 '(flymake-proc-check-file-limit 250000 t)
 '(flymake-proc-compilation-prevents-syntax-check t)
 '(flymake-proc-master-file-count-limit 10000)
 '(flymake-start-on-flymake-mode nil)
 '(flymake-start-syntax-check-on-find-file nil)
 '(flymake-start-syntax-check-on-newline nil)
 '(global-anzu-mode t)
 '(global-auto-complete-mode t)
 '(global-auto-revert-mode t)
 '(global-auto-revert-non-file-buffers t)
 '(global-dired-hide-details-mode t)
 '(global-flycheck-mode t)
 '(global-hl-line-mode t)
 '(global-semantic-idle-local-symbol-highlight-mode t nil (semantic/idle))
 '(global-semantic-idle-scheduler-mode t)
 '(global-semantic-idle-summary-mode nil)
 '(golden-ratio-exclude-modes '(treemacs-mode Dap))
 '(golden-ratio-extra-commands
   '(windmove-left windmove-right windmove-down windmove-up avy-goto-word-1 avy-pop-mark sx-display quit-window ace-window))
 '(golden-ratio-mode t)
 '(google-translate-default-source-language "en")
 '(google-translate-default-target-language "ar")
 '(grep-find-command
   '("find . -iname '*note*.txt'  -type f -exec grep --color -nHi -e \"emacs\" {} +" . 33))
 '(grep-find-template "find . <X> -type f <F> -exec grep <C> -n -e <R> NUL {} +")
 '(hippie-expand-try-functions-list
   '(try-expand-dabbrev try-expand-all-abbrevs try-expand-line try-expand-line-all-buffers try-expand-dabbrev-from-kill try-expand-dabbrev-all-buffers try-expand-list try-expand-list-all-buffers try-complete-file-name-partially try-complete-file-name))
 '(icomplete-mode t)
 '(ido-enable-flex-matching nil)
 '(ido-everywhere t)
 '(ido-max-work-directory-list 100)
 '(ido-mode 'both nil (ido))
 '(ido-save-directory-list-file "/home/importantDIR/EmacsHistory/ido.last")
 '(ido-separator "
")
 '(ido-ubiquitous-mode t)
 '(iedit-mode-line
   '(" Iedit:"
     (:eval
      (format
       #("%d/%d" 0 5
	 (face info-index-match))
       iedit-occurrence-index
       (iedit-counter)))))
 '(iedit-toggle-key-default [67108903])
 '(image-dired-show-all-from-dir-max-files 100)
 '(imaxima-scale-factor 3.0)
 '(imenu-auto-rescan nil)
 '(imenu-auto-rescan-maxout 9000000)
 '(imenu-max-item-length 800)
 '(imenu-max-items 200)
 '(imenu-space-replacement " ")
 '(imenus-delimiter " | ")
 '(jdee-compiler
   '(("eclipse java compiler server" "/home/jdee_workspace/sourcePathx/jars/private_JAR/ecj-4.7.3a-from-tomcat9.jar")))
 '(jdee-db-option-heap-profile '(nil "./java.hprof" 5000 20000 "Allocation objects"))
 '(jdee-db-option-heap-size '((200 . "megabytes") (1 . "gigabytes")))
 '(jdee-flycheck-enable-p nil)
 '(jdee-javadoc-gen-args '("-subpackages"))
 '(jdee-jdk-registry
   '(("1.10" . "/home/jdee_workspace/sourcePathx/openJDK/jdk-10")))
 '(jdee-launch-beanshell-on-demand-p nil)
 '(jdee-run-option-heap-profile '(nil "./java.hprof" 5000 20000 "Allocation objects"))
 '(jdee-run-option-heap-size '((200 . "megabytes") (1 . "gigabytes")))
 '(jdee-server-dir
   "/home/jdee_workspace/sourcePathx/jars/private_JAR/jdee-server-master/target")
 '(jtags-etags-command
   "find `pwd`  -name '*.java' -type f  | etags  --language=java  --declarations --members -o %f -")
 '(lsp-java-maven-download-sources t)
 '(magit-auto-revert-mode nil)
 '(maven-search-rows 100)
 '(mc/insert-numbers-default 1)
 '(mode-line-format
   '("%e" invocation-name mode-line-front-space mode-line-mule-info mode-line-client mode-line-modified mode-line-remote mode-line-frame-identification mode-line-buffer-identification " " mode-line-position
     (vc-mode
      (:eval
       (replace-regexp-in-string "Git.master" "" vc-mode)))
     " " mode-line-modes mode-line-misc-info mode-line-end-spaces))
 '(openwith-associations
   '(("\\.mov\\'" "smplayer"
      (file))
     ("\\.wav\\'" "smplayer"
      (file))
     ("\\.mkv\\'" "smplayer"
      (file))
     ("\\.mp3\\'" "smplayer"
      (file))
     ("\\.mp4\\'" "smplayer"
      (file))
     ("\\.flv\\'" "smplayer"
      (file))))
 '(openwith-mode t)
 '(package-archives
   '(("gnu" . "https://elpa.gnu.org/packages/")
     ("melpa" . "https://melpa.org/packages/")
;;     ("marmalade" . "https://marmalade-repo.org/packages/")
     ))
 '(package-selected-packages
   '(emacsql-psql diminish google-translate flycheck openwith pdf-tools mvn company-edbi rainbow-mode real-auto-save dap-mode imenus lsp-java lsp-mode lsp-treemacs lsp-ui projectile treemacs treemacs-icons-dired treemacs-projectile use-package hydra ido-ubiquitous format-all flymake-cursor symon plantuml-mode emms-info-mediainfo emms-mark-ext emms-soundcloud fuzzy iedit diredfl look-dired ztree yasnippet widget-mvc which-key web-mode web-completion-data web-beautify vlf sx soundklaus sos smex smartparens simple-httpd runner restclient rainbow-delimiters multi-term move-dup monochrome-theme mark-multiple magit jtags htmlize goto-chg google-maps golden-ratio fiplr expand-region elmacro eimp dirtree direx-grep dired-toggle-sudo dired-toggle dired-subtree dired-single dired-ranger dired-rainbow dired-open dired-narrow dired-k dired-imenu dired-filter dired-efap dired-dups dired-avfs dic-lookup-w3m deferred chm-view bash-completion auto-complete-nxml apt-utils-ido anzu ant ace-window ace-mc ac-html ac-emmet))
 '(pdf-occur-global-minor-mode t)
 '(pdf-view-midnight-colors '("black" . "gray"))
 '(plantuml-jar-path
   "/home/jdee_workspace/sourcePathx/jars/private_JAR/plantuml.1.2020.18.jar")
 '(plantuml-java-args '("-DPLANTUML_LIMIT_SIZE=81920000" "-Xmx1024m" "-jar"))
 '(print-region-function 'direct-print-region-function)
 '(projectile-globally-ignored-directories
   '(".idea" ".ensime_cache" ".eunit" ".git" ".hg" ".fslckout" "_FOSSIL_" ".bzr" "_darcs" ".tox" ".svn" ".stack-work" "xrefdb" "target" "dist" "build" ".settings"))
 '(projectile-globally-ignored-file-suffixes '("class"))
 '(projectile-project-root-files
   '("rebar.config" "project.clj" "build.boot" "deps.edn" "SConstruct" "pom.xml" "build.sbt" "gradlew" "build.gradle" ".ensime" "Gemfile" "requirements.txt" "setup.py" "pyproject.toml" "tox.ini" "composer.json" "Cargo.toml" "mix.exs" "stack.yaml" "info.rkt" "DESCRIPTION" "TAGS" "GTAGS" "configure.in" "configure.ac" "cscope.out" ".classpath" ".project" "prj.el"))
 '(ps-print-region-function 'direct-ps-print-region-function)
 '(rainbow-delimiters-pick-face-function 'rainbow-delimiters-default-pick-face)
 '(recent-cmds-menu-max-size 900)
 '(recent-cmds-name-length 900)
 '(recentf-auto-cleanup 'never)
 '(recentf-max-menu-items 900)
 '(recentf-max-saved-items 900)
 '(recentf-mode t)
 '(recentf-save-file "/home/importantDIR/EmacsHistory/.recentf")
 '(remember-data-file "/home/importantDIR/EmacsBookmark/notes")
 '(save-place-file "/home/importantDIR/EmacsHistory/saveplace.el")
 '(save-place-limit 1000)
 '(save-place-mode t nil (saveplace))
 '(savehist-file "/home/importantDIR/EmacsHistory/history")
 '(show-paren-mode t)
 '(smex-history-length 1000)
 '(smex-save-file "/home/importantDIR/EmacsHistory/smex-items")
 '(sp-base-key-bindings 'paredit)
 '(sql-connection-alist
   '(("postgresql-emp"
      (sql-product 'postgres)
      (sql-user "ahmad")
      (sql-database "emp")
      (sql-server ""))))
 '(sql-database "emp")
 '(sql-postgres-options '("-P" "pager=off" "-W"))
 '(sql-product 'postgres)
 '(sql-user "ahmad")
 '(sx-default-site "stackoverflow")
 '(sx-question-mode-answer-sort-function 'sx-answer-higher-score-p)
 '(sx-search-default-order 'relevance)
 '(tool-bar-mode nil)
 '(truncate-lines t)
 '(undo-limit 8000000)
 '(undo-outer-limit 120000000)
 '(undo-strong-limit 12000000)
 '(w3m-add-tab-number t)
 '(w3m-bookmark-file "/home/importantDIR/EmacsBookmark/w3mBookmark")
 '(w3m-command-arguments '("-reqlog"))
 '(w3m-cookie-accept-bad-cookies 'ask)
 '(w3m-cookie-accept-domains nil)
 '(w3m-default-display-inline-images t)
 '(w3m-default-save-directory "/home/downloads/")
 '(w3m-session-file "/home/importantDIR/w3m/.sessions")
 '(w3m-use-favicon nil)
 '(which-key-idle-delay 1.0)
 '(which-key-mode t)
 '(yas-indent-line 'nothing)
 '(yas-prompt-functions
   '(yas-ido-prompt yas-dropdown-prompt yas-completing-prompt yas-x-prompt yas-no-prompt))
 '(yas-snippet-dirs '("~/.emacs.d/mysnippet/")))


;; stop keys C-c spc and c-c c-d so can use it for c-c c-d , so can use it for c-c spc abcdefghigh
(global-unset-key (kbd "C-c C-d")) ;; undefined key must be first,so i can use c-c c-d with other keys like c-c c-d i

(global-unset-key (kbd "C-c SPC")) ;; undefined key must be first,so i can use c-c spc ,stop key c-c spc for (comint-accumulate) in *buffers*
;; sotp c-c space in shell mode, so can i use c-c space abcdefg
(defun my-stop-keys-comint-mode-hook ()
  (define-key comint-mode-map "\C-c " 	  'nil) ;; sotp c-c space in shell mode
;; add other keys to disabled it from 'comint-mode , stop keys not functions
)
(add-hook 'comint-mode-hook  'my-stop-keys-comint-mode-hook)


;;(set-cursor-color "red")
(scroll-bar-mode -1)
(icomplete-mode 1)
;;(global-hl-line-mode 1)
;;(set-face-background hl-line-face "#68B0FF")
(setq inhibit-startup-message t)
(setq backup-inhibited t)
;; Make TRAMP work nicely 

(show-paren-mode 1) ;; highlight parentheses
(add-to-list 'load-path "~/.emacs.d/plugins")


;; solve problem ==> (load "file") better than (require 'file) or delete file.elc compiler
(require 'yasnippet) ;; snippet loaded auto becacuse they are in .emacs.d/mySnippet/ ;; require yasnippet from emacs.d/elpa
(yas-global-mode 1)


;; festival for M-x read ==> (defalias 'reader 'festival-say-region)
;; apt-get install festival, then festival.el will be install in /usr/share/emacs/site-lisp/
(load "/usr/share/emacs/site-lisp/festival") 
;; [old] ~/.emacs.d/plugins/festival.el ==> move it to ~/.emacs.d/old_plugins/festival.el
;;(require 'festival) ;


;; for windows only
;;(require 'dired+)
;;(require 'mouse3)
;;(require 'ls-lisp+)
;;(require 'files+)
;;(require 'w32-browser)
;; for windows only


;; solve problem ==> (load "file") better than (require 'file) or delete file.elc compiler 
;; for database connection
(require 'edbi)

;; solve problem ==> (load "file") better than (require 'file) or delete file.elc compiler 
;; for open with files
(require 'openwith)
(openwith-mode t)


;; mysql.el and sql-completion
;;(require 'sql-completion)
;;(setq sql-interactive-mode-hook
;;       (lambda ()
;;         (define-key sql-interactive-mode-map "\t" 'comint-dynamic-complete)
;;         (sql-mysql-completion-init)))
;;


;;dbi:mysql:dbname=/var/lib/mysql/test/hi.frm
;; emacs eclipse swicher
;;(load "~/.emacs.d/elisp/eclipse-goto-offset.el")


;; load server-start if and only if is not runing
(load "server")
(unless (server-running-p) (server-start))

;; raise the emacs frame by calling it by emacsclient usefull for conkeror c-x x in fields then c-x # to send
   (defun my-px-raise-frame-and-give-focus ()                      
   (when window-system                                        
    (raise-frame)                                            
     (x-focus-frame (selected-frame))                         
   (set-mouse-pixel-position (selected-frame) 4 4)))                                                       
   (add-hook 'server-switch-hook 'my-px-raise-frame-and-give-focus)


;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;reat it,  auto-revert ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; auto-revert-mode
;; reload the changed file on disk automatically every 5 seconds if and only if it changed.
;; use it in dired and files 
;; auto-revert-mode ==> refresh if and only if it changed,(this is not a read refresh)
;;;;;;  '(auto-revert-interval 5) ;; use auto-revert 5
;;;;;;  '(auto-revert-use-notify nil) ;;stop notify me for refresh and changing every time
;;;;;;  '(auto-revert-verbose nil) ;;stop notify me for refresh and changing every time
;;;;;;  '(global-auto-revert-mode t) ;; stop notify me for refresh and changing every time
;;;;;;  '(global-auto-revert-non-file-buffers t) ;; wow that is it, revert dired 
;;;;;;  '(magit-auto-revert-mode nil) ;; must sotp revert of magit to avoid errors messages
;; [old] no need of hook  (add-hook 'dired-mode-hook  'auto-revert-mode) ;; refresh dired by auto-revert-mode every 5 seconds if and only if the dir is changed

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;end of auto-reveret ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; remove it, causing problem in lsp unix dos files in jdtls java server 
;; (prefer-coding-system 'utf-8 )

;; remove init message
(setq initial-scratch-message "")


;;(require 'w3m-load)
;; xx (setq w3m-default-display-inline-images t)

;;;;;;
;; xx(add-to-list 'load-path "/usr/local/share/emacs/site-lisp/w3m")
;; xx(autoload 'w3m "w3m" "Interface for w3m on Emacs." t)
;; xx(require 'w3m-load)
;;;;;;

 ;;Enable Cookies
 (setq w3m-use-cookies t)
 ;;Follow links in W3M
;;(setq browse-url-browser-function 'w3m-browse-urlbrowse-url-new-window-flag t)
;; xx (autoload 'w3m-browse-url "w3m" "Ask a WWW browser to show a URL." t)
;; xx (global-set-key "\C-xm" 'browse-url-at-point)
;; xx (autoload 'browse-url-interactive-arg "browse-url")
;; xx ;;Set default download directory
;; xx (let ((d "/home"))
;; xx (setq w3m-default-save-directory(or(and(file-directory-p d)d)w3m-default-directory)))
;; xx ;;W3M doesn't name buffers very intelligently. Let's fix that:
;; xx (add-hook 'w3m-display-hook(lambda (url)(rename-buffer(format "*w3m: %s*" (or w3m-current-titlew3m-current-url)) t)))

 ;;;;;;;;;;;;;
;;(set-frame-parameter (selected-frame) 'alpha 20)

(ido-mode  1)     ;; ido mode
(menu-bar-mode -1) 
(tool-bar-mode -1)
(scroll-bar-mode -1)
(savehist-mode 1)  ;; save history mode



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; run more then one emacs and change icons ;;;;;;;;;;;;;;;;;;;;;
;;Q:-  how can run more than one emacs like emacs1 emacs2 emacs3 emacs4, and change icons ? 
;;;;;;;  ;;
;;;;;;;  ;; add invocation-name variable to print (name of the link in /usr/bin/emacs1  emacs2  emcs3 or emacs4  ln -s ),
;;;;;;;  ;; add invocation-name to frame-title-format as below
;;;;;;;  ln -s /opt/emacs_webkit/emacs-26-1-second/bin/emacs-26.1              /usr/bin/emacs2
;;;;;;;  ln -s /opt/emacs_webkit/emacs-26-1-third/bin/emacs-26.1               /usr/bin/emacs3
;;;;;;;  ln -s /opt/emacs_webkit/emacs-26-2-fourth/emacs-26-2/bin/emacs-26.2   /usr/bin/emacs4
;;;;;;;  ln -s /opt/emacs_webkit/emacs-26-3-fifth/emacs-26-3/bin/emacs-26.3    /usr/bin/emacs5
;;;;;;;  
;;;;;;;  ;; it is above
;;;;;;;  '(mode-line-format
;;;;;;;     (quote
;;;;;;;      ("%e" invocation-name  mode-line-front-space mode-line-mule-info mode-line-client mode-line-modified mode-line-remote mode-line-frame-identification mode-line-buffer-identification "   " mode-line-position
;;;;;;;       (vc-mode vc-mode)
;;;;;;;       "  " mode-line-modes mode-line-misc-info mode-line-end-spaces)))
;;;;;;;  ;; then then then
;;;;;;;  ;; then then then
;;;;;;;  ;; change the name of the title bar and alt-tab by by change adding invocation-name to variable frame-title-format like this 
;;;;;;;  (setq frame-title-format
;;;;;;;    '(:eval
;;;;;;;    (concat invocation-name " ♥ " 
;;;;;;;      (if buffer-file-name
;;;;;;;          (replace-regexp-in-string
;;;;;;;           "\\\\" "/"
;;;;;;;           (replace-regexp-in-string
;;;;;;;            (regexp-quote (getenv "HOME")) "~"
;;;;;;;            (convert-standard-filename buffer-file-name)))
;;;;;;;        (buffer-name))
;;;;;;;      )
;;;;;;;    ))
;;;;;;; ;; then then then
;;;;;;; ;; then then then , Numix theme
;;;;;;; change the font size from
;;;;;;; customize look and feel ==> window border tab ==> title bar ==> font for active window title 16 
;;;;;;;                                               ==> title bar ==> font for inctive window title 16 
;;;;;;; customize look and feel ==> misc tab ==> font for on-screen display 15 bold
;;;;;;;                                      ==> font for  inactive  on-screen display 11  
;;;;;;; 
;;;;;;;   lrwxrwxrwx  1 root root       23 Mar  4  2019 emacs -> /etc/alternatives/emacs
;;;;;;;   lrwxrwxrwx  1 root root       50 Oct  4 06:06 emacs2 -> /opt/emacs_webkit/emacs-26-1-second/bin/emacs-26.1
;;;;;;;   lrwxrwxrwx  1 root root       49 Oct  4 06:06 emacs3 -> /opt/emacs_webkit/emacs-26-1-third/bin/emacs-26.1
;;;;;;;   lrwxrwxrwx  1 root root       61 Oct  4 06:06 emacs4 -> /opt/emacs_webkit/emacs-26-2-fourth/emacs-26-2/bin/emacs-26.2
;;;;;;;   lrwxrwxrwx  1 root root       60 Oct  4 06:06 emacs5 -> /opt/emacs_webkit/emacs-26-3-fifth/emacs-26-3/bin/emacs-26.3
;;;;;;; 
;;;;;;; 
;;;;;;; so, emacs ==>  emacs-26.1
;;;;;;;    emacs2 ==>  emacs-26.1
;;;;;;;    emacs3 ==>  emacs-26.1
;;;;;;;    emacs4 ==>  emacs-26.2
;;;;;;;    emacs5 ==>  emacs-26.3
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;run more then one emacs and change icons ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;


;; blue background
;; (set-background-color "#A7CAFF")  

;; max emacs must be after bars mode

;; show the absolute path in the title bar
(setq frame-title-format
  '(:eval
  (concat invocation-name " ♥ " 
    (if buffer-file-name
        (replace-regexp-in-string
         "\\\\" "/"
         (replace-regexp-in-string
          (regexp-quote (getenv "HOME")) "~"
          (convert-standard-filename buffer-file-name)))
      (buffer-name))
    )
  ))

;; modify or change keybinding 
;; c-S-q nevigator
(global-set-key (kbd "C-q")   'goto-last-change) 
(global-set-key (kbd "C-S-q") 'next-buffer)

;;;;;;;;;;;;;;;;;;;;;;;;;;;; mark ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; expand region package
(global-set-key (kbd "C-;") 'er/expand-region)
(global-set-key (kbd "C-:") 'er/contract-region)

;; mc multi-cursors   M-j new line  
 (global-set-key (kbd "C->") 'mc/mark-next-like-this)
 (global-set-key (kbd "C-<") 'mc/skip-to-next-like-this)
;; (global-set-key (kbd "C-:") 'mc/unmark-next-like-this)
(global-set-key (kbd "C-c C->") 'mc/mark-all-like-this)
(global-set-key (kbd "C-)") 'ace-mc-add-multiple-cursors) ;; mc with ace jump 


;; to skip next => mark next then skip it u cant select cut copy  part of line , M-j for new line
;; M-x flyspell use c-, and c-. without shift 

;;mark-multiple package
;;(global-set-key (kbd "C-x r t") 'inline-string-rectangle) // it make the macs very slow 
;;(global-set-key (kbd "C->") 'mark-next-like-this)
;;(global-set-key (kbd "C-<") 'mark-previous-like-this)
;;(global-set-key (kbd "C-M-m") 'mark-more-like-this) ; like the other two, but takes an argument (negative is previous)

    (add-hook 'sgml-mode-hook
              (lambda ()
                (require 'rename-sgml-tag)
                (define-key sgml-mode-map (kbd "C-c C-r") 'rename-sgml-tag)))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; keep a list of recently opened files  M-x rf and it will save in /home/importantDIR/EmacsHistory/.recentf
(recentf-mode 1)
;;; (global-set-key (kbd "M-s h o") 'recentf-open-files) ;; use M-s ho    to remeber M-s hr  highligh regex

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; my aliases ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defalias 'yes-or-no-p 'y-or-n-p) ; y or n is enough
(defalias 'list-buffers 'ibuffer) ; always use ibuffer
(defalias 'perl-mode 'cperl-mode) ; always use cperl-mode

;; make frequently used commands short

(defalias '&    'replace-html-chars)
(defalias '8d 'xwe-add-definition)
(defalias '8s 'xwe-add-source)
(defalias '8w 'xwe-new-word-entry)
(defalias '\"   'replace-straight-quotes)
(defalias '\[   'remove-square-brackets)
(defalias '\\   'escape-quotes-region)
(defalias 'ac 'auto-complete-mode)
(defalias 'ahk-mode 'xahk-mode)
(defalias 'apt 'apt-utils-show-package)
(defalias 'bbcode-mode 'xbbcode-mode)
(defalias 'c 'xah-cite)
(defalias 'chm   'chm-view-dired)
(defalias 'cs   'customize)
(defalias 'cpu   'symon-mode)
(defalias 'dd  'delete-duplicate-lines)
(defalias 'dml 'delete-matching-lines)
(defalias 'dnml 'delete-non-matching-lines)
(defalias 'ds   'dired-sort-dialogue)
(defalias 'dsm 'desktop-save-mode)
(defalias 'dtw 'delete-trailing-whitespace)
(defalias 'diredQ 'dired-do-query-replace-regexp)
(defalias 'eb 'eval-buffer)
(defalias 'ed 'eval-defun)
(defalias 'eis 'elisp-index-search)
(defalias 'elm 'emacs-lisp-mode)
(defalias 'er 'eval-region)
(defalias 'fb 'flyspell-buffer)
(defalias 'fd 'find-dired)
(defalias 'firefox-url  'browse-url-firefox)  
(defalias 'firefox-external  'w3m-external-view-current-url) ;; w3m ==> firefox
(defalias 'fg 'find-grep)
(defalias 'fgd 'find-grep-dired)
(defalias 'fm 'flyspell-mode)
(defalias 'g 'grep)
(defalias 'glm 'global-linum-mode)
(defalias 'gls 'glasses-mode) ;; best way to view CamelCaseWord as Camel_Case_Word
(defalias 'gm 'google-maps)
(defalias 'go    'w3m-search)
(defalias 'gwsm 'global-whitespace-mode)
(defalias 'hlr  'highlight-regexp)
(defalias 'hm 'html-mode)
(defalias 'html6-mode 'xah-html6-mode)
(defalias 'im   'tumme)
(defalias 'jtag  'jtags-update-tags-files)
(defalias 'lcd 'list-colors-display)
(defalias 'lch  'list-command-history)
(defalias 'lf 'load-file)
(defalias 'lml 'list-matching-lines)
(defalias 'lo   'locate)
(defalias 'ls   'dired-hide-details-mode)
(defalias 'lsl-mode 'xlsl-mode)
(defalias 'math-symbol-input-mode 'xmsi-mode)
(defalias 'mb 'menu-bar-mode)
(defalias 'moc  'multi-occur-in-matching-buffers)
(defalias 'oc   'occur)
(defalias 'ocaml-mode 'tuareg-mode)
(defalias 'om 'org-mode)
(defalias 'p   'emms-play-file)
(defalias 'pdf  'pdf-tools-install)
(defalias 'pdfb  'pdf-view-midnight-minor-mode)
(defalias 'ps  'proced)
(defalias 'qr 'query-replace-regexp)
(defalias 'r 'remember-notes)
(defalias 'rb   'rename-buffer)
(defalias 'reader 'festival-say-region)
(defalias 'rf 'recentf-open-files)
(defalias 'rnb 'rainbow-delimiters-mode)
(defalias 'rr 'reverse-region)
(defalias 'rs 'replace-string)
(defalias 'rvb 'revert-buffer)
(defalias 'rreg 'replace-regexp)
(defalias 'sbc 'set-background-color)
(defalias 'sh 'shell)
(defalias 'shh 'multi-term)
(defalias 'sl 'sort-lines)
(defalias 'sm 'my-save-current-kbd-macro-to-dot-emacs)
(defalias 'ssb  'sql-set-sqli-buffer-generally)
(defalias 'ssm 'shell-script-mode)
(defalias 'ssp  'sql-set-product )
(defalias 'stop 'emms-stop)
(defalias 'tm 'text-mode)
(defalias 'tran 'my-transparency-ring)
(defalias 'uhlr  'unhighlight-regexp)
(defalias 'vlm 'visual-line-mode)
(defalias 'w   'w3m)
(defalias 'wb  'browse-url-of-buffer)
(defalias 'wsm 'whitespace-mode)
(defalias 'wu 'browse-url)
(defalias 'wk  'which-key-show-keymap)
(defalias 'z 'amazon-linkify)
(defalias '~    'make-backup)
;;(defalias 'psh 'powershell)


;; end of short commands 

;; w3m with c-x m  with dired, url, everywhere
  (setq browse-url-browser-function 'w3m-browse-url)
  (autoload 'w3m-browse-url "w3m" "Ask a WWW browser to show a URL." t)
  (global-set-key "\C-xm" 'browse-url-at-point)
  (autoload 'browse-url-interactive-arg "browse-url")
 
 (setq browse-url-browser-function 'w3m-browse-url
           browse-url-new-window-flag t)

 (add-hook 'dired-mode-hook
	   (lambda ()
	       (define-key dired-mode-map "\C-xm" 'my-dired-w3m-find-file)))

 (defun my-dired-w3m-find-file ()
   (interactive)
   (let ((file (dired-get-filename)))
     (progn (format "Open 'w3m' %s " (file-name-nondirectory file)) (w3m-find-file file))
))


;; dont do this, because c-c c-v can extended like c-c c-v a b  c d
;; w3m with c-c c-v the current buffer

(defun my-w3m-browse-current-buffer ()
    (interactive)
    (let ((filename (concat (make-temp-file "w3m-") ".html")))
      (unwind-protect
          (progn
            (write-region (point-min) (point-max) filename)
            (w3m-find-file filename))
        (delete-file filename))))


  (defun my-w3m-copy-url-at-point ()
    (interactive)
    (let ((url (w3m-anchor)))
      (if (w3m-url-valid url)
  	  (kill-new (w3m-anchor))
        (message "No URL at point!"))))

   (add-hook 'w3m-mode-hook
	  (lambda ()
	    (local-set-key "\M-W" 'my-w3m-copy-url-at-point)))


;;
;; (defun uniq-lines (beg end)
;;   "Unique lines in region.
;; Called from a program, there are two arguments:
;; BEG and END (region to sort)."
;;   (interactive "r")
;;   (save-excursion
;;     (save-restriction
;;       (narrow-to-region beg end)
;;       (goto-char (point-min))
;;       (while (not (eobp))
;;         (kill-line 1)
;;         (yank)
;;         (let ((next-line (point)))
;;           (while
;;               (re-search-forward
;;                (format "^%s" (regexp-quote (car kill-ring))) nil t)
;;             (replace-match "" nil nil))
;;           (goto-char next-line))))))
;; 
;; 

;;;;;;---------------------------------------------------
(electric-pair-mode 1)  ;; pair () [] {} add to .emacs

;; for shell color 
(ansi-color-for-comint-mode-filter)

;; font increase and decrease 
(global-set-key [C-kp-add] 'text-scale-increase)
(global-set-key [C-kp-subtract] 'text-scale-decrease)


;; put toggle truncate line true
;;(setq-default truncate-lines t)  t or nil
;; note :- it is up man up up up so dont touch this code

;; my-mycu function
  (defun my-mycu (num macro)
  (interactive)
  (setq current-prefix-arg num) ;; C-u
  (call-interactively macro))

;; use it with dired-macro 
;; (my-mycu 4 'mymacro) c-x-e
;;  (my-mycu (how-many "repeated-statement") 'mymacro) c-x-e

;; dont use it , the pc will hang 
;; define new shell every time
;;(defadvice shell (around always-new-shell)
;;  "Always start a new shell."
;;  (let ((buffer (generate-new-buffer-name "*shell*"))) ad-do-it))
;;(ad-activate 'shell)

;;;;;;;;;M-s-x to solve it use one of these  ;;;;;;;;;;;;;;;;;;;;;;;
;;(setq x-alt-keysym 'meta)
 (setq x-super-keysym 'meta)


;; (setq  x-meta-keysym 'super
;;        x-super-keysym 'meta)
;; Both symbols (variables) are required,
;; because if you just use only x-super-keysym 'meta, it enables both keys as meta key.
;; If you just use only x-meta-keysym 'super,
;; it disables both and de command  buffer will return s-x is undefined.

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;;;;;;; doc-view mode can display many docs pdf postscript microsoft office 
;;("\\.pdf\\'" "evince" (file))

(add-hook 'doc-view-mode-hook
  (lambda ()
    (linum-mode -1)
  ))

;; it is above to use doc-view mode
;;(doc-view-mode 1)

;;;;;M-x p or  emms-play-file ;;;;; put first apt-get install mplayer and  it will be directly  /usr/bin 
;;;;; paly many files mp3 mp4 wav .... 
(setq exec-path (append exec-path '("/usr/bin/")))

;; no need for load path just type (require ')
;; (add-to-list 'load-path "~/.emacs.d/elpa/emms-20150329.1945") ;; always check the number may be changed 201408 

;; solve problem ==> (load "file") better than (require 'file) or delete file.elc compiler 
;; to fix emms open this file ==> emms-setup
  (require 'emms-setup)  
;;  (emms-all)
  (emms-default-players)
  (emms-minimalistic)  ;; after added this it will work, see emms-setup.el

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; (set-frame-parameter (selected-frame) 'alpha '(90 100))
;; (add-to-list 'default-frame-alist '(alpha 29 50))



;; M-x tran      
;; but first in kali  dconf org->gnome->metacity
(defun my-transparency-ring (arg)
  (interactive "P")
  (let* ((ring '(80 55 100))
         (current (frame-parameter nil 'alpha))
         (last (car (last ring)))
         (next (if arg
                   (if (equal current (car ring)) last (car ring))
                 (or (cadr (member current ring)) (car ring)))))
    (set-frame-parameter nil 'alpha next)))


;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; set ido-separator for minibuffer is \n instead of |
(setq ido-separator "\n")

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; to force call package dired

;; no need for load path just type (require ')
;;(add-to-list 'load-path "~/.emacs.d/elpa/dired+-20150416.2324") ;; always check the number may be changed 
;;;oooo (require 'dired+)
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; to force call package chm

;; no need for load path just type (require ')
;;(add-to-list 'load-path "~/.emacs.d/elpa/chm-view-20110616.1719") ;; always check the number may be changed
;; just require it, no need for full path 
;; solve problem ==> (load "file") better than (require 'file) or delete file.elc compiler 
(require 'chm-view)
;; first aptitude install archmage
;; use chm-view-file or
;; use chm-view-dired
;; use M-x chm only 


;;;;;;;;;;;; M-x my-ytt => open youtube 
;;;;;;;;;;;; M-x my-yt or f9 to open youtube in w3m 


(defun my-ytt (url)  
  (interactive "sURL: ")  
  (shell-command
   (concat "smplayer -fullscreen " url " &")))

;; [old]
;; in url  delete every thing after the & 
;; (replace-regexp-in-string myRegex myReplacement myStr)
;;
;; (defun my-yt ()  
;;    (interactive)  
;;          (my-ytt (replace-regexp-in-string  "&.*"   " "   (w3m-print-this-url (point)))))
;; 


;; replace fun ;; the new one is my-w3m-copy-url-at-point to view the url without any additional things
;; in url  delete every thing after the & 
;; (replace-regexp-in-string myRegex myReplacement myStr)
(defun my-yt ()  
   (interactive)  
         (my-ytt (replace-regexp-in-string  "&.*"   " "   (call-interactively  'my-w3m-copy-url-at-point))))





(global-set-key (kbd "<f9> y") 'my-yt)


;; search in youtube 
(defun my-youtube-search (str)
  "search in https://www.youtube.com"
    (interactive 
     (list
      (read-string "youtube: ")
  ))
    (browse-url (concat "https://www.youtube.com/results?search_query="  str))
  )



;;;;;;;;;;; abbrev ;;;;;;;;;;;;;;;;;;;;
;; solve problem ==> (load "file") better than (require 'file) or delete file.elc compiler 
(add-to-list 'load-path  "/home/importantDIR/EmacsElisp")
(require 'my_abbrev)

;; 8go will be google
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; c-u num  M-x  macro
;; c-u 4    M-x  a1
(defun my-cu1 (num macro)
  (interactive
   (list
    (read-number "num: ")
    (read-command "macro: ")))
  (setq current-prefix-arg num) 
  (call-interactively  macro)
)

;; now you can write macros without errors because 
;; avoid this killer statement M-x macro2(C-u 0 M-x macro1)
;; avoid C-s then C-f/b the best solution is  press enter ,
;; c-u ^[a-zA-Z]  M-x  macro
;; c-u   regexp   M-x  macro
;; very usefull function i wrote , so dont use c-u 0 but use M-x my-cu0
(defun my-cu0 (reg  macro)
  (interactive
   (list
    (read-regexp "reg: ")
    (read-command "macro: ")))
  (setq current-prefix-arg (how-many reg))
  (call-interactively  macro)
)
;; begin on line man =>       ^man
;; blank lines regex =>       ^C-j (means ctrl+j) ^ means begging of line

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;; match  paranthese color (((((hi)))))

;; no need for load path just type (require ')
;;(add-to-list 'load-path "~/.emacs.d/elpa/monochrome-theme-20140326.350") ;; always check the number may be changed
;; solve problem ==> (load "file") better than (require 'file) or delete file.elc compiler 
(require 'monochrome-theme)
;;(load-theme 'monochrome t)
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(custom-set-faces
 ;; custom-set-faces was added by Custom.
 ;; If you edit it by hand, you could mess it up, so be careful.
 ;; Your init file should contain only one such instance.
 ;; If there is more than one, they won't work right.
 '(default ((t (:inherit nil :stipple nil :background "black" :foreground "light gray" :inverse-video nil :box nil :strike-through nil :overline nil :underline nil :slant normal :weight normal :height 220 :width normal :foundry "unknown" :family "DejaVu Sans Mono"))))
 '(anzu-mode-line ((t (:foreground "#d3d3d3" :weight bold))))
 '(avy-lead-face ((t (:foreground "yellow"))))
 '(avy-lead-face-0 ((t (:foreground "yellow"))))
 '(avy-lead-face-1 ((t (:foreground "yellow"))))
 '(avy-lead-face-2 ((t (:foreground "yellow"))))
 '(aw-leading-char-face ((t (:background "red2" :foreground "yellow2" :height 1.5))))
 '(c-annotation-face ((t (:foreground "#D9D9D9" :bold nil))))
 '(company-tooltip ((t (:background "gray8" :foreground "#d3d3d3"))))
 '(company-tooltip-annotation ((t (:foreground "yellow2"))))
 '(company-tooltip-common ((t (:foreground "cyan"))))
 '(company-tooltip-selection ((t (:background "#005000"))))
 '(compilation-info ((t (:foreground "green3"))))
 '(cursor ((t (:background "red"))))
 '(diredp-compressed-file-suffix ((t (:foreground "#7474FFFF7474"))))
 '(diredp-date-time ((t (:foreground "#7474FFFF7474"))))
 '(diredp-dir-priv ((t (:foreground "#7474FFFFFFFF"))))
 '(diredp-file-suffix ((t (:foreground "#7474FFFF7474"))))
 '(ediff-current-diff-A ((t (:background "#773333"))))
 '(ediff-current-diff-C ((t (:background "#995555"))))
 '(ediff-even-diff-A ((t (:background "#555555"))))
 '(ediff-even-diff-Ancestor ((t (:background "#555555"))))
 '(ediff-even-diff-B ((t (:background "#555555"))))
 '(ediff-even-diff-C ((t (:background "#555555"))))
 '(ediff-fine-diff-Ancestor ((t (:background "#254877"))))
 '(ediff-fine-diff-B ((t (:background "#111199"))))
 '(ediff-fine-diff-C ((t (:background "#001188"))))
 '(ediff-odd-diff-A ((t (:background "#555555"))))
 '(ediff-odd-diff-B ((t (:background "gray40"))))
 '(ediff-odd-diff-C ((t (:background "gray40"))))
 '(emmet-preview-input ((t (:inherit secondary-selection :background "black" :box (:line-width 1 :color "red")))))
 '(emms-playlist-selected-face ((t (:foreground "red" :bold nil))))
 '(flymake-error ((t (:underline (:color "Red" :style wave)))))
 '(flymake-warning ((t (:underline (:color "yellow" :style wave)))))
 '(font-lock-comment-delimiter-face ((t (:foreground "#878787" :bold nil))))
 '(font-lock-comment-face ((t (:foreground "#878787" :bold nil))))
 '(font-lock-constant-face ((t (:foreground "#06CACA" :bold nil))))
 '(font-lock-function-name-face ((t (:foreground "#8AB8E6" :bold nil))))
 '(font-lock-keyword-face ((t (:foreground "#BFBFBF" :bold nil))))
 '(font-lock-string-face ((t (:foreground "#BFBFBF" :bold nil))))
 '(font-lock-type-face ((t (:foreground "#06CACA" :bold nil))))
 '(font-lock-variable-name-face ((t (:foreground "#E6E48A" :bold nil))))
 '(font-lock-warning-face ((t (:foreground "red"))))
 '(fringe ((t (:background "black" :foreground "white"))))
 '(grizzl-selection-face ((t (:foreground "yellow"))))
 '(highlight ((t (:background "#005000" :foreground "yellow2"))))
 '(hl-line ((t (:background "gray8"))))
 '(ido-first-match ((t (:foreground "yellow2"))))
 '(ido-only-match ((t (:foreground "yellow2" :underline "yellow2"))))
 '(iedit-occurrence ((t (:background "red4" :foreground "yellow3"))))
 '(isearch ((t (:background "#dcdcdc" :foreground "red3"))))
 '(lazy-highlight ((t (:background "yellow3" :foreground "red3"))))
 '(match ((t (:foreground "yellow2"))))
 '(mode-line ((t (:background "black" :foreground "#bdbdbd" :box (:line-width 1 :color "white" :style released-button)))))
 '(mode-line-buffer-id ((t (:foreground "yellow3"))))
 '(mode-line-inactive ((t (:background "black" :foreground "#4d4d4d" :box (:line-width 1 :color "white" :style released-button)))))
 '(org-table ((t (:foreground "LightGrey"))))
 '(pdf-isearch-match ((t (:background "red" :foreground "yellow"))))
 '(rainbow-delimiters-depth-1-face ((t (:foreground "white"))))
 '(rainbow-delimiters-depth-2-face ((t (:foreground "green"))))
 '(rainbow-delimiters-depth-3-face ((t (:foreground "yellow"))))
 '(rainbow-delimiters-depth-4-face ((t (:foreground "magenta"))))
 '(rainbow-delimiters-depth-5-face ((t (:foreground "cyan"))))
 '(rainbow-delimiters-depth-6-face ((t (:foreground "orange"))))
 '(rainbow-delimiters-depth-7-face ((t (:foreground "green4"))))
 '(rainbow-delimiters-depth-8-face ((t (:foreground "DarkViolet"))))
 '(rainbow-delimiters-depth-9-face ((t (:foreground "blue"))))
 '(region ((t (:background "yellow3" :foreground "black"))))
 '(semantic-idle-symbol-highlight ((t (:box (:line-width 1 :color "yellow3")))))
 '(show-paren-match ((t (:background "black" :box (:line-width 1 :color "yellow2" :style released-button)))))
 '(sx-question-mode-content-face ((t nil)))
 '(w3m-anchor ((t (:foreground "green3"))))
 '(w3m-tab-background ((t (:background "black" :foreground "white"))))
 '(w3m-tab-selected ((t (:background "black" :foreground "lime green" :box (:line-width -1 :style released-button)))))
 '(w3m-tab-unselected ((t (:background "Black" :foreground "Gray70" :box (:line-width -1 :style released-button)))))
 '(web-mode-html-attr-name-face ((t (:foreground "#E6E48A"))))
 '(web-mode-html-tag-bracket-face ((t (:foreground "#8AE68A"))))
 '(web-mode-html-tag-face ((t (:foreground "yellow3"))))
 '(which-key-command-description-face ((t (:inherit apropos-property))))
 '(which-key-key-face ((t (:inherit ido-first-match)))))


;;; match  paranthese color (((((hi)))))

;; no need for load path just type (require ')
;;(add-to-list 'load-path "~/.emacs.d/elpa/rainbow-delimiters-20150320.17") ;; always check the number may be changed 
;; solve problem ==> (load "file") better than (require 'file) or delete file.elc compiler 
(require 'rainbow-delimiters)
(rainbow-delimiters-mode t)
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;(case-fold-search nil) case sensetive char
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;(dired-filter-mode)
;;(eimp-mode 1)

;; solve problem ==> (load "file") better than (require 'file) or delete file.elc compiler 
(require 'dired-filter)
(require 'eimp)
(autoload 'eimp-mode "eimp" "Emacs Image Manipulation Package." t)
(add-hook 'image-mode-hook 'eimp-mode)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(setq redisplay-dont-pause t) ;; no hang for emacs

;;;;;;;;;;;;;;;;;;;;; smex ;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; improve  M-x  ;; first install smex
;; solve problem ==> (load "file") better than (require 'file) or delete file.elc compiler 
(require 'smex)
(smex-initialize)
(global-set-key (kbd "M-x")   'smex) ;; x is small ,  recent commands used 
(global-set-key (kbd "C-c d") 'smex) ;; d is small ,  recent commands used 
(global-set-key (kbd "M-X")   'smex-major-mode-commands) ;; X  is capital , relevant commands used 
(global-set-key (kbd "C-c D") 'smex-major-mode-commands) ;; D is capital , relevant commands used 

;; This is your old M-x.
;;(global-set-key (kbd "C-c C-c M-x") 'execute-extended-command)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; webkit
;;(add-to-list 'load-path	 "~/.emacs.d/plugins/webkit")
;; solve problem ==> (load "file") better than (require 'file) or delete file.elc compiler 
;;(require 'webkit)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; avy package ace-jump;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
(global-set-key (kbd "C-j") 'avy-goto-word-1) ;; change it to c-j as eclipse, edit file  emmet.el then press b 
(global-set-key (kbd "C-S-j") 'avy-pop-mark) ;; pop mark means return to the original point
(global-set-key (kbd "C-c c") 'avy-copy-line)  ;; copy line ;; c-x c duplicate line/area
(global-set-key (kbd "C-c k") 'avy-move-line)  ;; kill line 

;;;  c-c s in sql-mode for show all tables 
;;; (global-set-key (kbd "C-c s") 'avy-copy-region) ;; very important note  c-c c first word then c-c c secnond word then c-x c-x 
;;; (setq avy-all-windows 'all-frames)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; iedit ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; iedit package 
;;; [[dont do this]]
;;; when UPDATE emacs  put C-'  edit file /root/.emacs.d/elpa/iedit-20150915.2022/iedit.el then recompile it instead of c-;
;;; change of this line ;;    (define-key map (kbd "C-'") 'iedit-show/hide-unmatched-lines) by (c-c a) in file /root/.emacs.d/elpa/iedit-20150915.2022/iedit-lib.el and delete compiled file iedit-lib.elc
;;; by this one  (define-key map (kbd "C-c a") 'iedit-toggle-unmatched-lines-visible)
;;; compile file by press b 
;;; [[dont do this]]
;;;
;;;
;;; [[ old ]]
;;; ;;; edit any key and method without edit the original file
;;; (defun my-iedit-method ()
;;;   (interactive)
;;;   (call-interactively  'iedit-mode)
;;; )
;;; (define-key jdee-mode-map (kbd "C-'") 'my-iedit-method)
;;; ;;; make one for C-c-a also
;;; [[ old ]]
;;;
;;;
;;;  c-'    ==> select matched words
;;;  M-;    ==> unselect word
;;;  M-N    ==> numbering 
;;;  tab    ==> next
;;;  S-tab  ==> previous
;;;  c-c a  ==> hide unmatched words
;;;  c-g    ==> exit
;;;  M-M    ==> switch to mc mode
;;;  M-SPC		iedit-blank-occurrences
;;;  M-<		iedit-goto-first-occurrence
;;;  M->		iedit-goto-last-occurrence
;;;  f1 m               help-key-description for iedit 

;;;  and more and more of keys in iedit-lib.el
;;; 
;;; when UPDATE emacs,  packages in .emacs.d/auto-complete/dic will be updated also and the text-mode and sql-mode will removed . so be carefull , i chaneged dic location

;; solve problem ==> (load "file") better than (require 'file) or delete file.elc compiler 
(require 'iedit)        ;; c-' iedit mode start always

;;; no need to edit original file for iedit, just wirte this function (my-stop-and-change-keys-of-iedit-hook)

;; overide 
;; overide 
;; overide 
;; work iedit perfect 
;; [67108903] ==> means this key c-'
;;; ==> wow it is work,put this above ==>> '(iedit-toggle-key-default [67108903]) means change key from c-; to c-'
;; then use this hook to stop c-' in iedit-lib-keymap then to set c-c a for iedit-show/hide-unmatched-lines
(defun my-stop-and-change-keys-of-iedit-hook()
(define-key iedit-lib-keymap  (kbd "C-'") 'nil)  ;; stop key c-' not fun  in iedit-lib-keymap(not iedit-lib-key,copy paste from iedit-lib.el),because iedit-lib-keymap will have two keys for editing c-' and c-c a, so i will stop c-'
(define-key iedit-lib-keymap  (kbd "C-c a") 'iedit-show/hide-context-lines);; set c-c a for iedit-show/hide-unmatched-lines
;;                            (kbd "C-"")   'iedit-show/hide-occurrence-lines ;; opposite of C-c a
;; add other deprecated iedit  keys here
)
(add-hook 'iedit-mode-hook  'my-stop-and-change-keys-of-iedit-hook) ;; when start iedit-mode then start my hook to change keys and stop keys
;; to stop  keys in mode, must enter the hook
;; to chang keys in mode, must enter the hook


;;;;;;;;;;;;;;;;;;;;;;;;; emmet-mode ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; wow  http://docs.emmet.io/cheat-sheet/

;; [dont do this] ==>  change c-j to c-c z in the /root/.emacs.d/elpa/emmet-mode-20160501.1151/emmet-mode.el [dont do this]
(global-set-key (kbd "C-c z") 'emmet-expand-line)     ;;;  i  run it by c-j complete emmet but then i  change it to c-c z

;; wow it is amazing emmet-wrap-with-markup, but i not define key for it yet 
;; wow it is amazing emmet-wrap-with-markup, but i not define key for it yet 
;; wow it is amazing emmet-wrap-with-markup, but i not define key for it yet 
;; wow it is amazing emmet-wrap-with-markup, but i not define key for it yet 

;; C-c c-z ==> emmet-wrap-with-markup
;; C-c z   ==> emmet-expand-line

;; overide
;; overide 
(defun my-stop-keys-emmet-hook ()
  (define-key emmet-mode-keymap  (kbd "C-j") 'nil)            ;; stop key not function emmet-expand-line
  (define-key emmet-mode-keymap  (kbd "<C-return>") 'nil)     ;; stop key not function emmet-expand-line
  (define-key emmet-mode-keymap  (kbd "<C-M-right>") 'nil)    ;; stop key not function emmet-next-edit-point
  (define-key emmet-mode-keymap  (kbd "<C-M-left>") 'nil)     ;; stop key not function emmet-prev-edit-point

  (define-key emmet-mode-keymap  (kbd "C-c C-c w")   'nil)        ;; stop key not function 
  (define-key emmet-mode-keymap  (kbd "C-c C-z") 'emmet-wrap-with-markup)          ;; stop key not function emmet-wrap-with-markup
  ;; emment-mode-keymap put it to c-c c-z, i think it is good , means put tag around area
)
(add-hook 'emmet-mode-hook  'my-stop-keys-emmet-hook)

;; this is the way for override the key, first read the emmet.el defvar name then put the name keymap or map like this 
;; (require 'emmet-mode)
;; (define-key emmet-mode-keymap (kbd "C-c y") 'emmet-expand-line)

;; wow  http://docs.emmet.io/cheat-sheet/

;;; emmet-mode start with html css ,
;;; video http://docs.emmet.io/actions/wrap-with-abbreviation/
(add-hook 'sgml-mode-hook 'emmet-mode) ;; open sgml first then open emmet mode 
(add-hook 'sgml-mode-hook 'ac-emmet-html-setup)
(add-hook 'css-mode-hook  'emmet-mode) ;; open css mode first then open emmet mode 
(add-hook 'css-mode-hook  'ac-emmet-css-setup)

;; (global-set-key (kbd "M-x") 'helm-M-x)
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;;;;;;;;;;;;;;;;;;;;;;; autocomplete in M-x shell ;;;;;;;;;;;;;;;;;;;;;;;
;;; package bash-completion

;; solve problem ==> (load "file") better than (require 'file) or delete file.elc compiler 
(autoload 'bash-completion-dynamic-complete 
  "bash-completion"
  "BASH completion hook")
(add-hook 'shell-dynamic-complete-functions
  'bash-completion-dynamic-complete)
  (require 'bash-completion)
  (bash-completion-setup)
  
;;; package rainbow-delimiters
;;;; this way to run mode in mode by hook or by (require 'without-mode word) like this (require 'move-dup)
(add-hook 'prog-mode-hook 'rainbow-delimiters-mode) ;; rainbow parentheses colors with prog modes
;;;;;;;;;;;;;;; (add-hook 'jdee-mode-hook 'rainbow-delimiters-mode) ;; rainbow parentheses colors with java mode

;;;;;;;;;; m-x list-packages, install move-dup to move like eclipse ;;;;;;;;;;;;;;;;;;
;; solve problem ==> (load "file") better than (require 'file) or delete file.elc compiler 
(require 'move-dup)
(global-set-key (kbd "M-<up>") 'move-dup-move-lines-up)
(global-set-key (kbd "M-<down>") 'move-dup-move-lines-down)
;;(global-set-key (kbd "C-M-<up>") 'md-duplicate-up)
(global-set-key (kbd "C-x c") 'move-dup-duplicate-down)
;;;; redo ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; M-x list-packages , install redo+ (deprecated) 
;; solve problem ==> (load "file") better than (require 'file) or delete file.elc compiler 
;;;ooo (require 'redo+) (deprecated) 
;; ;; https://github.com/emacsmirror/redo-plus
(load "~/.emacs.d/plugins/redo+.el")
(global-set-key (kbd "C-?") 'redo) ;;; redo  c-? , undo c-/

;;;;;; fiplr ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
(require 'fiplr)
(global-set-key (kbd "C-c g")   'fiplr-find-file)  ;; find files
(global-set-key (kbd "C-c G")   'fiplr-find-directory) ;; find directory
(global-set-key (kbd "C-c C-g") 'fiplr-clear-cache)  ;; clear cache
;; read this please 
;; read this please 
;; read this please 
;; fiplr up up up to .git or prj.el  file or folder  and stop 
;; By default it looks through all the parent directories of the file you're editing
;; until it finds a .git, .hg, .bzr or .svn directory. You can customize this list of root markers by setting fiplr-root-markers.
(setq fiplr-root-markers '(".git" ".svn" "prj.el" ".project"  "pom.xml"  ".classpath"))

;; ignore  files and dir
;; ignore  backup files and classes
;; (files ("*.jpg" "*.png" "*.zip" "*~"))))
(setq fiplr-ignored-globs '((directories (".git" ".svn" "xrefdb" "target" "dist" "build"  ".settings"))
                            (files ("*.class" "*~" "*.log"))))





;;;;;;;;;;;;;;;;;; auto-complete ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; very important noe
;; very important noe
;; auto-complete-dict in  '(ac-dictionary-directories (quote ("~/.emacs.d/Auto_Complete_Dict/dict")))
;; not in ~/.emacs.d/elpa/auto-complete-20170124.1845/dict
;; very important noe
;; very important noe

;; to use the  (macro,template,auto-complete) togather 
;;
;; tab    ==> template
;; c-z    ==>   auto-compete one word (must be the only word  means fuzzy
;; C-tab  ==> hippie-expand not from dict




;; in dired you can add many words to any mode to complete it under dict,
;; you can also create new mode under dict directory

;;; optional  (add-to-list 'ac-dictionary-directories "~/.emacs.d/dict")
;;; optional  (require 'auto-complete)

;; solve problem ==> (load "file") better than (require 'file) or delete file.elc compiler 
(global-auto-complete-mode t)
(require 'auto-complete-config)

;; dont use this command  (ac-config-default)
;; (ac-config-default)
;;

;;  M-x apropos then ^ac-source-
;; or by built in from source
;; look at the ac-source-
;; http://auto-complete.org/doc/manual.html
(setq-default ac-sources '(
ac-source-words-in-all-buffer
ac-source-dictionary
ac-source-semantic
ac-source-semantic-raw
ac-source-filename
ac-source-functions
ac-source-yasnippet
ac-source-variables
ac-source-symbols
ac-source-features
ac-source-abbrev
))

;; there is more resources 
;;ac-source-words-in-same-mode-buffers
;;ac-source-files-in-current-dir
;;ac-source-words-in-buffer
;;ac-source-css-property
;;ac-source-emacs-lisp-features
;;ac-source-imenu
;;ac-source-nxml-attr
;;ac-source-nxml-attr-value
;;ac-source-nxml-css
;;ac-source-nxml-css-property
;;ac-source-nxml-tag
;;ac-source-nxml-tag-value-by-myself
;;ac-source-nxml-tag-value-by-nxml

;;;  M-x dabbrev-expand, means words from another buffers 


;;; put them in my function  (my-stop-keys-ac-hook)
;;;oooo;;; (define-key ac-complete-mode-map "\C-n" 'ac-next)      ;;  the way to modify any key for the mode only but must call  (require ) before map key
;;;oooo;;; (define-key ac-complete-mode-map "\C-p" 'ac-previous)  ;;  the way to modify any key for the mode only but must call  (require ) before map key


;; [[ old ]]
;; note :- remove or  comment comment comment   Tab and C-tab , 
;; in ~/.emacs.d/elpa/auto-complete-20160416.604/auto-complete.el  then byte code by shift-B
;;


;;(global-set-key [C-tab] 'dabbrev-expand)
  (global-set-key [C-tab]       'hippie-expand)
  (global-set-key (kbd "C-c f") 'hippie-expand)
;; c-tab it will take lines as sorted form here 
;; (try-expand-line try-expand-line-all-buffers try-expand-dabbrev try-expand-all-abbrevs try-expand-dabbrev-from-kill try-expand-dabbrev-all-buffers try-expand-list try-expand-list-all-buffers try-complete-file-name-partially try-complete-file-name)))



;; ac is automatically work, but if you want to show menu just press c-z
(global-set-key (kbd "C-z")   'auto-complete)  ;; it is list menu for ac, u can find files path, 

;; overide
;; overide
;; overide 
;;; stop keys in auto-complete-mode
(defun my-stop-keys-ac-hook ()
;;   (define-key ac-completing-map  "\r"  'ac-complete)   ;; \r means enter or return;; means keep it in ac-mode as is.
   (define-key ac-completing-map  "\C-n"  'ac-next)   
   (define-key ac-completing-map  "\C-p"  'ac-previous)  

   (define-key ac-completing-map  "\t"  'nil)           ;; stop key not function   'ac-expand)
   (define-key ac-completing-map  [tab]  'nil)          ;; stop key not function   'ac-expand)
   (define-key ac-completing-map  (kbd "M-TAB")  'nil)  ;; stop key not function   'auto-complete)
   (define-key ac-completing-map  "\M-n"  'nil)         ;; stop key not function   'ac-next)
   (define-key ac-completing-map  "\M-p"  'nil)         ;; stop key not function   'ac-previous)
   (define-key ac-completing-map  [down]  'nil)         ;; stop key not function   'ac-next)
   (define-key ac-completing-map  [up]  'nil)           ;; stop key not function   'ac-previous)
   (define-key ac-completing-map  [f1]  'nil)           ;; stop key not function   'ac-help)
   (define-key ac-completing-map  [M-f1]  'nil)         ;; stop key not function   'ac-persist-help)
   (define-key ac-completing-map  (kbd "C-?")  'nil)    ;; stop key not function   'ac-help)
   (define-key ac-completing-map  (kbd "C-M-?")  'nil)  ;; stop key not function   'ac-persist-help)
   (define-key ac-completing-map  [C-down]  'nil)       ;; stop key not function   'ac-quick-help-scroll-down)
   (define-key ac-completing-map  [C-up]  'nil)         ;; stop key not function   'ac-quick-help-scroll-up)
   (define-key ac-completing-map  "\C-\M-n"  'nil)      ;; stop key not function   'ac-quick-help-scroll-down)
   (define-key ac-completing-map  "\C-\M-p"  'nil)      ;; stop key not function   'ac-quick-help-scroll-up)
)
(add-hook 'auto-complete-mode-hook  'my-stop-keys-ac-hook) ;; start ac-mode-hook then my-stop-keys-ac-hook



;;;;;;;;;;;;;;;;;;;;;;;;; end of ac ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;



;;;;;;;;;;;;;;;;;;;;;;;;;web-mode;;;;;;;;;;;;;;;;;;;;;;;;
;; read this, really, read this   http://web-mode.org/
;; read this, really, read this   http://web-mode.org/

;; stop emmet mode when open web-mode 
;;(add-hook 'web-mode-hook 'emmet-mode)  ;; when open web-mode, open emmet-mode

;;(add-hook 'nxml-mode-hook  'emmet-mode) ;; open nxml mode first then open emmet mode 

(add-hook 'emmet-mode-hook 'emmet-preview-mode )  ;; when open emmet-mode, open emmet-mode

(add-hook 'web-mode-hook 'ac-emmet-html-setup)  ;; when open web-mode, open ac-emmet
(add-hook 'web-mode-hook 'ac-emmet-css-setup)  


;; this is mine
;; (add-hook 'emmet-mode-hook 'nxml-mode)  
;; (add-hook 'web-mode-hook 'global-company-mode) or add it to (ac-modes above
;;
;; read this, really, read this   http://web-mode.org/
;; read this, really, read this   http://web-mode.org/
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;;;;;;;;;;;;; google translate ;;;;;;;;;;;;;;;;;;;;;;
;; '(google-translate-default-source-language "en")
;; '(google-translate-default-target-language "ar")
;; '(google-translate-enable-ido-completion t)
;; '(google-translate-show-phonetic nil)


;; fix google-translate by changing method from emacs to curl or wget 
;; default is 'emacs means (url-retrieve-synchronously), 
;; does not work in emacs 26.1 (ur-copy-file) (url-retrieve-synchronously)
   (setq google-translate-backend-method 'curl);; so use cur or wget instead of (url-retrieve-synchronously)
;; (setq google-translate-backend-method 'wget) ;; default is 'emacs



;; translate from arabic to english
(defun my-google-translate-arabic-to-english()
"translate from arabic to english"
(interactive)
(let (
      (google-translate-default-source-language "ar")
      (google-translate-default-target-language "en")
      )
      (google-translate-at-point)
  )
)
(defalias 'gta 'my-google-translate-arabic-to-english)



;; translate from english to arabic
(defun my-google-translate-english-to-arabic()
"translate from english to arabic"
(interactive)
(let (
      (google-translate-default-source-language "en")
      (google-translate-default-target-language "ar")
      )
      (google-translate-at-point)
  )
)
(defalias 'gt 'my-google-translate-english-to-arabic)




;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;



;;;;;;;;; extension ==> open with ==> modes ;;;;;;;;;;;;;;
;; add extension to mode, then add autocomplete mode to it by  M-x cs ac-mode then type your mode
;; [important]
;; assign file-extension to major-mode
(add-to-list 'auto-mode-alist '("\\.chm?\\'" . chm-view-dired))
(add-to-list 'auto-mode-alist '("\\.pdf\\'" . pdf-tools-install))
(add-to-list 'auto-mode-alist '("\\.rest?\\'" . restclient-mode)) ;;;; open file.rest then run restclient-mode

(add-to-list 'auto-mode-alist '("\\.html?\\'" . web-mode))
(add-to-list 'auto-mode-alist '("\\.as[cp]x\\'" . web-mode))
(add-to-list 'auto-mode-alist '("\\.jsp\\'" . web-mode))
(add-to-list 'auto-mode-alist '("\\.xml?\\'" . nxml-mode))

(add-to-list 'auto-mode-alist '("\\.java?\\'" . java-mode))
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;


;; save the current macro as reusable function.
;; M-x sm ==> (defalias 'sm 'my-save-current-kbd-macro-to-dot-emacs)
(defun my-save-current-kbd-macro-to-dot-emacs (name)
  "Save the current macro as named function definition inside
your initialization file so you can reuse it anytime in the
future."
  (interactive "SSave Macro as: ")
  (name-last-kbd-macro name)
  (save-excursion 
    (find-file-literally user-init-file)
    (goto-char (point-max))
    (insert "\n\n;; Saved macro\n")
    (insert-kbd-macro name)
    (insert "\n")))


;;;;;;;;;;;;;;;;;;;;;;;;; printer ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; add  printer to menu => file 
;; add printer  Convenient printing
;; solve problem ==> (load "file") better than (require 'file) or delete file.elc compiler 
(require 'printing)
(pr-update-menus t)
; make sure we use localhost as cups server
(setenv "CUPS_SERVER" "localhost")
;;(package-require 'cups)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; auto-complete-mode with text mode 
;;using M-x cs ==> ac-mode then add new mode in it
;;using M-x cs ==> ac-mode then add new mode in it
;;using M-x cs ==> ac-mode then add new mode in it

 (add-hook 'text-mode-hook 'auto-complete-mode)  

;; then add it to mode directory file by
;;using M-x cs ==> ac-mode then add new mode in it
;;using M-x cs ==> ac-mode then add new mode in it
;;using M-x cs ==> ac-mode then add new mode in it


;;;;;;;;;;;;;;;;;;;;;;;;; sql ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; sql-list-table ==>  c-c c-l t ==> c-tab
;; sql-list-all  tables  ==> c-c c-l a  ==> c-c s 
;; edit-named-kbd-macro sql-table
;; select user. ==> auto complete from table in sql mysql 

;; sql-table   list column tables by calling M-x sql-list-table
;; keybinding in sql-mode only ;; tab for template  , use C-c o or dot 
;(define-key sql-mode-map [C-tab] 'sql-table)     ;;  the way to modify any key for the mode only but must call  (require ) before map key

;; use elmacro to write elisp code
;; use elmacro to write elisp code 

(defun my-sql_all_tables ()
  "show all tables mysql"
  (interactive)
  (sql-list-all)
  (other-window 1))  ;; jump to the other window 

;; key work only in the sql-mode 
(define-key sql-mode-map  (kbd "C-c s") 'my-sql_all_tables)

;; sql-all  list all tables by calling  M-x sql-list-all 
;; sql- sql-mode for list all tables
;; Saved macro , use abbrevaition 8dott  ==> .

;; use elmacro to write elisp code
;; use elmacro to write elisp code 


(defun my-sql-columns ()
  "show all colms for my sql table "
  (interactive)
  (sql-list-table (thing-at-point 'symbol))  ;; put the (thing-at-point 'symbol ) to read the word like this word or like this word_hi_then 
  (other-window 1)  ;; jump to the other window
  (insert "."))     ;; print . in the buffer
;; if you need the dot in the sql ==> .
;; dot work only in the sql mode to display columns 
(define-key sql-mode-map (kbd "C-.")     'my-sql-columns)
;; (define-key sql-mode-map (kbd "C-c o") 'my-sql-columns)


;; fix problem in mysql ==> [[ No prompt found or ‘comint-prompt-regexp’ not set properly ]]
;; what is means of above code ?
;; it works, but when there is no database selected,
;; the prompt is: MariaDB [(none)]> Change the regexp to match it:
(sql-set-product-feature 'mysql :prompt-regexp "^\\(MariaDB\\|MySQL\\) \\[[_a-zA-Z]*\\]> ")


;;;;;;;;;;;;;;;;;;; ER entity diagram =>  sql diagram ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; M-x my-sql-diagram  to draw sql entity diagrams 

;; Saved macro
;; M-x find-dired fd  =>  open dired with path ~/Ediagram/root/diagrams/summary/ ;;  WTF -iname \*relationships\*.png
;; (fset 'my-dired-diagram
;;   [?\M-x ?f ?d return ?~ ?/ ?E ?n backspace ?d ?i ?a ?g ?r ?a ?m ?/ ?r ?o ?o ?t ?/ ?d ?i ?a ?g ?r ?a ?m ?s ?/ ?s ?u ?m ?m ?a ?r ?y ?/ return ?\C-a ?\C-k ?- ?i ?n ?a ?m ?e ?  ?\\ ?* ?r ?e ?l ?a ?t ?i ?o ?n ?s ?h ?i ?p ?s ?\\ ?* ?. ?p ?n ?g return])

;;;;;;;;;; my old sql diagram ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; sData Base ==> s means string
;;; nAge       ==> n means number 

;;  (defun my-sql-diagram (db user password)
;;    (interactive "sData Base:
;;  sUser:
;;  sPassword:")
;;    (shell-command
;;       (concat "java -jar ~/.emacs.d/schemaSpy/schemaSpy.jar -dp ~/.emacs.d/schemaSpy/mysql-connector-java-5.0.4-bin.jar -t mysql -db " db " -all  -host localhost -port 3306 -u " user  " -p " password "  -o ~/Ediagram  -ahic  -hq " )
;;  )
;;  ;; this is the macro, i change it to elisp by elmacro 
;;  (command-execute 'my-dired-diagram)
;;  )


;;;;;;;;;; my old sql diagram ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; my my-sql-diagram
;; command exexute to run M-x dired-diagram
;; schemaSpy.jar in   ~/.emacs.d/schemaSpy/schemaSpy.jar

;;  (defun my-sql-diagram (db user password)
;;    (interactive 
;;     (list
;;      (read-string "Data Base: ")
;;      (read-string "User: ")
;;      (read-passwd "Password: ")
;;  ))
;;    (shell-command
;;       (concat "java -jar ~/.emacs.d/schemaSpy/schemaSpy.jar -dp ~/.emacs.d/schemaSpy/mysql-connector-java-5.0.4-bin.jar -t mysql -db " db " -all  -host localhost -port 3306 -u " user  " -p " password "  -o ~/Ediagram  -ahic  -hq " )
;;  )
;;  ;; this is the macro, i change it to elisp by elmacro 
;;  (command-execute 'my-dired-diagram)
;;  )

;;;;;;;;;;;;;;;;;;;; sql diagram ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; command exexute to run M-x dired-diagram
;; schemaSpy.jar in   ~/.emacs.d/schemaSpy/schemaSpy.jar
;; use elmacro to see the functions and command in the macro
;; use elmacro to see the functions and command in the macro

;; if found error, see the buffer named => [shell command output]
(defun my-sql-diagram ( user password db )
  (interactive 
   (list
   (read-string "User: "     )
   (read-passwd "Password: " )
   (read-string "Data Base: ")
   ) current-prefix-arg )      ;;  current prefix arg ==> when press M-n M-p will display the old arguments for these fields only 
  (shell-command
     (concat "java -jar  /home/jdee_workspace/sourcePathx/jars/private_JAR/schemaspy-6.0.0.jar  -t mariadb  -dp    /home/jdee_workspace/sourcePathx/jars/public_JAR/mariadb-java-client-2.3.0.jar    -db " db " -all  -host localhost -port 3306 -u " user  " -p " password "  -o  ~/Ediagram  -charset=UTF-8 " )
;;   (concat "java -jar ~/.emacs.d/schemaSpy/schemaspy-6.0.0.jar                    -t mariadb  -dp   ~/.emacs.d/schemaSpy/mariadb-java-client-2.3.0.jar                      -db " db " -all  -host localhost -port 3306 -u " user  " -p " password "  -o  ~/Ediagram  -charset=UTF-8 " )
;;   (concat "java -jar ~/.emacs.d/schemaSpy/schemaSpy.jar -dp ~/.emacs.d/schemaSpy/mysql-connector-java-5.0.4-bin.jar -t mysql -db " db " -all  -host localhost -port 3306 -u " user  " -p " password "  -o ~/Ediagram  -ahic  -hq " )
     )

    (w3m-find-file "~/Ediagram/index.html")  ;; open with w3m
;;  (dired "~/Ediagram/root/diagrams/summary/")  ;; open dired with this path 
;;  (dired-filter-by-regexp "relationships.*.png")
;;  (dired-find-file) ;; means press enter at the current file 
;;  (delete-other-windows)
)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;;; sql with auto complete mode 
(add-hook  'sql-mode-hook 'auto-complete-mode)

;;;;;;;;;;;;;;;;;;;;;;;; flycheck ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;; flycheck  

;;; c-c ! l   => list errors and warrning
;;; c-c ! v   => view checker
;;; f         => filter (errors,warrning)


;; syntax check for many languages html=tidy , php, xml

;; syntax languages check  like html-tidy css xml  js json php  shell-scripting sql xml  and more in M-x cs checkers
;; m-x list-packages flycheck
;; M-x cs checkers
;; M-x flycheck-select-checker  html-tidy
;; apt-get install tidy                => for html-tidy checker
;; apt-get install phpmd               => for php-phpmd checker
;; apt-get install  libxml2-utils ==>provide  xmllint ==> xml checker
;; [[[dont install]]] apt-get install xmlstarlet or xmllint, just use the xmlls from lsp server
;; [[[dont install]]] apt-get install xmlstarlet or xmllint, just use the xmlls from lsp server
;; [[[dont install]]] apt-get install xmlstarlet or xmllint, just use the xmlls from lsp server
;; you can add new checker by
;; M-x cs checkers
;; apt-get install [checker for language]
;; C-c ! ==> flycheck keys

;; read this 
;; http://www.flycheck.org/en/latest/user/syntax-checks.html
;;  install xmllint for xml flycheck
;; apt-get update
;; apt install libxml2 libxml2-utils tidy
;; xmllint --valid example.xml

;; important
;; M-x list-packages then update all by emacs -q 


;; tie html-tidy with web-mode 
;; xmllint better than xmlstarlet
;; dont hook it by web-mode
;; flycheck use major-mode to work

;; what is the major-mode ??
;; there is only one and only noe major-mode
;; to view current major-mode use 
;; C-h v major-mode ==> it is the fist mode in the status-bar from the left

;; the way to setup the major-mode for xml file
;; (add-to-list 'auto-mode-alist '("\\.xml?\\'" . web-mode))
;; xml-mode is the major-mode 

;; use lsp
;;  (eval-after-load 'flycheck
;;     '(flycheck-add-mode 'xml-xmllint 'xml-mode))

  (eval-after-load 'flycheck
     '(flycheck-add-mode 'html-tidy 'html-mode))


;; for javascript mode 
;;  (eval-after-load 'flycheck
;;     '(flycheck-add-mode 'javascript-eslint  'js-mode))


;; for php mode
;;  (eval-after-load 'flycheck
;;     '(flycheck-add-mode 'phpmd  'php-mode))


;; for sql  mode
;; support PostgreSQL only
;; not not not support mysql
;; not not not support mysql
;; not not not support mysql
;; not not not support mysql
;;
;; not by apt install sqlint but by gem install sqlint
;; gem install sqlint                  => sql checher 
;; gem uninstall sqlint                => to remove it 

;;  (eval-after-load 'flycheck
;;     '(flycheck-add-mode 'sql-sqlint  'sql-mode))


;; must config flycheck 
;; must config flycheck 
;; must config flycheck 
;; must config flycheck 
;; '(global-flycheck-mode t)

;;  very important note
;; '(flycheck-checker-error-threshold 100) 
;; less than 100 will disturb you every time open file like hi.el(if have more than 100 warrning and errors)

;;; M-x cs   Flycheck Check Syntax Automatically:
;;;         check after change file automatically
;;;    '(flycheck-check-syntax-automatically (quote (idle-change mode-enabled)))
;; must config flycheck 
;; must config flycheck 
;; must config flycheck 
(define-key flycheck-mode-map (kbd "C-c e") 'flycheck-next-error)    ;; also c-c ! n
(define-key flycheck-mode-map (kbd "C-c r") 'flycheck-previous-error);; also c-c ! p
(define-key flycheck-mode-map (kbd "C-c w") 'flycheck-list-errors);; also c-c ! l

;;;;;;;;;;;;;;;;;;;;;;;;;;end of flycheck;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

 
;;;;;;;;;;;;;;;;;;;;;;;;;;;; nxml mode for html tags  ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; nxml-keys
;; c-c c-f => insert end tag
;; c-c c-s c-w  => show which rnc file run
;; C-c C-s C-a, which re-applies the rules based on the current content of the document.
;; c-c c-n next error in xml, (rng-next-error)
;; c-c c-p  previous  error in xml, 
;; c-c c-v  rng-validate-mode start / stop (valid in mode line )
;; M-x nxml-mode then  <c-m-i 
;;
;;


;; without  <c-m-i 
;; remove comment if you need nxml < automatic menu complete
;;(require 'auto-complete-nxml)
;;(setq auto-complete-nxml-automatic-p t) ;; If you want to start completion manually from the beginning


;; use lsp, dont use rng files 
;; M-x rng-set-schema-file  ==> .rnc then register it automatically in schema.xml  M-x cs  Rng Schema Locating Files
;;;;; (autoload 'xml-mode "nxml" "XML editing mode" t)
;;;;; (eval-after-load 'rng-loc  '(add-to-list 'rng-schema-locating-files "/home/jdee_workspace/sourcePathx/jars/schemes/schemas.xml"))



;; c-c c-p rng-previous-error
;; go to previous  error in xml after run rng-validate-mode 
;; not work like this
;;(define-key nxml-mode-map (kbd "C-c C-p") 'rng-previous-error)   
;; must be like this
;; what is (lambda() ) ==> lambda is anonymous function, a function without a name. 
;;;;;; use lsp, dont use rng files
;;;;;;  (add-hook 'nxml-mode-hook
;;;;;;              (lambda ()
;;;;;;                  (rng-validate-mode 1)
;;;;;;                  (define-key nxml-mode-map (kbd "C-c C-p") 'rng-previous-error)))
;; c-c c-v  rng-validate-mode start / stop (valid in mode line )





;;;;;;;;;;;;;;;;;;;;;;;;;;;;; end of nxml mode ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(put 'scroll-left 'disabled nil)


;; emacs -f start-fs   you can run function of emacs from shell by this command  emacs -f (M-x function or command )
;; stop-fs protect
;;ooo;; 
;;ooo;; (fset 'stop-fs
;;ooo;;    [?\C-x ?\C-f ?/ ?e ?t ?c ?/ ?d ?e ?f ?a ?u ?l ?t ?/ ?g ?r ?u ?b return ?\M-< ?\C-s ?q ?u ?i ?e ?t ?\C-a ?\C-d ?  ?\C-a ?\C-n ?# ?\C-d ?\C-x ?\C-s ?\M-& ?u ?p ?d ?a ?t ?e ?- ?g ?r ?u ?b return])
;;ooo;; 
;;ooo;; ;; start-fs protect 
;;ooo;; (fset 'start-fs
;;ooo;;    [?\C-x ?\C-f ?/ ?e ?t ?c ?/ ?d ?e ?f ?a ?u ?l ?t ?/ ?g ?r ?u ?b return ?\M-< ?\C-s ?q ?u ?i ?e ?t ?\C-a ?# ?\C-d ?\C-a ?\C-n ?\C-d ?  ?\C-a ?\C-x ?\C-s ?\C-x ?\C-s ?\M-& ?u ?p ?d ?a ?t ?e ?- ?g ?r ?u ?b return])

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; org mode ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; (require 'org)  
;; (define-key org-mode-map (kbd "C-c j") 'avy-goto-word-1)   ;; c-j for org-mode to jumping  ;; 

;; very important note :- 
;; if you didnt require org that is will be => c-j not working
;; so in the future remember calling (require ) before map key
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;


;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; key chord 0.04 delay  ;;;;;;;;;;;;;;;;
;; must be 0.04 delay for two keys , 

;; key chord is very bad 
;;(require 'key-chord) 
;;(key-chord-mode 1)



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; copy current line if no selection 
(defun my-copy-line-or-region ()
"Copy current line, or text selection.
When `universal-argument' is called first, copy whole buffer (but respect `narrow-to-region')."
(interactive)
(let (p1 p2)
(if (null current-prefix-arg)
(progn (if (use-region-p)
(progn (setq p1 (region-beginning))
(setq p2 (region-end)))
(progn (setq p1 (line-beginning-position))
(setq p2 (line-end-position)))))
(progn (setq p1 (point-min))
(setq p2 (point-max))))
(kill-ring-save p1 p2)))
;;; more options more relax ;;; 
(global-set-key (kbd "C-c o") 'my-copy-line-or-region) ; copy
(global-set-key (kbd "M-w") 'my-copy-line-or-region) ; copy

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;



;;[important] save split window for config current session
;;M-x winner-mode
;;C-M-n/p 
;; solve problem ==> (load "file") better than (require 'file) or delete file.elc compiler 
(require 'winner)
(winner-mode 1)
(define-key winner-mode-map  (kbd "C-M-j") 'winner-undo)
(define-key winner-mode-map  (kbd "C-M-k") 'winner-redo)


;;;;;;;;;;;;;;;; jdee colors  the original one ;;;;;;;;;;;;;;;;;;;;;;;;




;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;  jdee  ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; [ dont chanage jdee, just use jtags to visit class file] 
;; for update jdee
;; i changed file  /root/.emacs.d/elpa/jdee-20160728.1152/jdee-open-source.el  
;; i changed  the function at line 212
;; 			(if (typep source 'buffer) 
;; 			    (let ((pop-up-frames nil))   ;; put nil 
;; 			      (set-buffer source)
;; 			      (display-buffer source)
;; 			      (other-window 1)          ;; add this function => means C-x o  go to the other window
;; 			      (delete-other-windows)    ;; add this function => means C-x 1  close the other windows
;; after this changed i can oepn the new class in the same window , the convert it to bytecode by shift+B 
;; [ dont chanage jdee, just use jtags to visit class file] 



;; note:-
;; C-c C-d always using semanticdb- 
;; must be the first, because it is undefined undefined key 
;; (global-unset-key (kbd "C-c C-d")) ;; undefined key must be first,so i can use c-c c-d with other keys like c-c c-d i

;; [old]
;;(global-set-key (kbd "C-c C-d s") 'replace-string);; M-x rs

;; solve problem ==> (load "file") better than (require 'file) or delete file.elc compiler 

;;;;;;;;;;  (require 'jdee)


;; must be compiled first c-c c-v c-c or c-c c-d c 
;; open decleration, visit method by  jdb ==> java debug
;; can use it for debug just one line,
;; can use it for visit current method at line by jdb command, dont forget the exclude packages in ~/.jdbrc
;;;;;;;;   (defun my-jdb-for-current-method ()
;;;;;;;;   "visit method or class  by debug jdb command). or debug jdb current line only then quit"
;;;;;;;;     (interactive)
;;;;;;;;     (jdee-debug-set-breakpoint)
;;;;;;;;     (jdee-debug)
;;;;;;;;     (sit-for 3)
;;;;;;;;     (other-window 1)  ;; jump to the other window
;;;;;;;;     (jdee-debug-cont)
;;;;;;;; ;;    (sit-for 2)
;;;;;;;; ;;    (jdee-debug-step-into)
;;;;;;;; ;;    (sit-for 1)
;;;;;;;; ;;    (jdee-debug-quit)
;;;;;;;; ;;    (sit-for 1)
;;;;;;;; ;;    (jdee-debug-clear-breakpoints)
;;;;;;;;     )
;;;;;;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;




;;;;;;;;;;   visit class at point after update classpath
;;;;;;;;;;   (defun my-jdee-open-class-source ()
;;;;;;;;;;   "visit class after update classpath"
;;;;;;;;;;     (interactive)
;;;;;;;;;;     (jdee-project-update-class-list) ;; c-c c-v c-q, update classPath to add new created classes to classPath
;;;;;;;;;;     (jdee-complete-flush-classinfo-cache)
;;;;;;;;;;     (call-interactively  'jdee-open-class-source)
;;;;;;;;;;   )
;;;;;;;;;;   (define-key jdee-mode-map  (kbd "C-c C-d t")  'my-jdee-open-class-source)
;;;;;;;;;;     
;;;;;;;;;;     
;;;;;;;;;;     ;;; stop keys not function  in jdee in ~/.emacs.d/elpa/jdee-20180218.919/jdee-keys.el
;;;;;;;;;;     ;; (require 'jdee)
;;;;;;;;;;     ;;;  
;;;;;;;;;;     ;;; put  c-c c-d i or c-c c-v z => (update classPath +kill-extra + jdee-import-all )
;;;;;;;;;;     ;;; jdee-import-kill-extra-imports ==> remove duplicate imports
;;;;;;;;;;     ;;;
;;;;;;;;;;
;;;;;;;;;;  (defun my-jdee-import-all ()
;;;;;;;;;;  "it is collection of command, first upate classPath, then import all,then kill-extra-import"
;;;;;;;;;;    (interactive)
;;;;;;;;;;  ;; [solved]
;;;;;;;;;;  ;; auto-save will stop the dap-java-debug because the class will not update-generate at the target/classes must save .java manually
;;;;;;;;;;  ;;  (call-interactively  'save-buffer) ;; c-x c-s
;;;;;;;;;;  ;; in emacs 26.1 
;;;;;;;;;;  ;; If you want auto-saving to be done in the (visited file) rather than in a (separate auto-save file),
;;;;;;;;;;  ;; enable the global minor mode
;;;;;;;;;;  ;;M-x ‘auto-save-visited-mode’.
;;;;;;;;;;  ;;In this mode, auto-saving is identical to explicit saving. 
;;;;;;;;;;  ;;  '(auto-save-default nil) ;; stop auto-save-mode
;;;;;;;;;;  ;;  '(auto-save-timeout 0)   ;; stop auto-save 
;;;;;;;;;;  ;;  '(auto-save-visited-file-name t)  ;; visited file mean (the real file), save directly in visited file not in the #file#
;;;;;;;;;;  ;;  '(auto-save-visited-interval 2)   ;; vistited file after 2 seconds    
;;;;;;;;;;  ;;  '(auto-save-visited-mode t)       ;; auto-save-visisted-mode better than auto-save-mode, because it is save as c-x c-s, so jdee and lsp-java will be see it.
;;;;;;;;;;  ;;  (auto-save-mode -1)   ;;stop auto-save  so can move java file from package to other packages 
;;;;;;;;;;    (jdee-load-project-file) ;; load prj.el 
;;;;;;;;;;    ;; return the cursor to original location, because the jdee-package-update will change the cursor location
;;;;;;;;;;    (save-excursion 
;;;;;;;;;;    (jdee-package-update)  ;;  it is change the cursor location, so i am using  (save-excursion) in jdee-package.el to save cursor location
;;;;;;;;;;    ) ;;end of save-excursion
;;;;;;;;;;    (jdee-project-update-class-list) ;; c-c c-v c-q, update classPath to add new created classes to classPath
;;;;;;;;;;    (jdee-complete-flush-classinfo-cache)
;;;;;;;;;;    (call-interactively  'jdee-import-all)
;;;;;;;;;;    (call-interactively  'jdee-import-kill-extra-imports)
;;;;;;;;;;    (format-all-buffer)  ;; format by clang-format  c-x ps
;;;;;;;;;;  ;;   (auto-save-mode 't)  ;; run auto-save again, no need [old]
;;;;;;;;;;  (call-interactively  'save-buffer) ;; c-x c-s
;;;;;;;;;; )
;;;;;;;;;;
;;;;;;;;;;
;;;;;;;;;;  (define-key jdee-mode-map  (kbd "C-c C-d i")  'my-jdee-import-all) ;; c-c c-v z and c-c c-d i are same work
;;;;;;;;;;   
;;;;;;;;;;   ;;;(define-key jdee-mode-map [?\C-c ?\C-v ?z] 'my-jdee-import-all) ==> not work like this, so must be hook defun
;;;;;;;;;;   ;;; stop jdee-keys or change keys 
;;;;;;;;;;   ;;; stop jdee-keys or change keys 
;;;;;;;;;;   ;;; stop jdee-keys or change keys 
;;;;;;;;;;   
;;;;;;;;;;   
;;;;;;;;;;   ;; override
;;;;;;;;;;   ;; override
;;;;;;;;;;   (defun my-stop-keys-jdee-hook ()
;;;;;;;;;;     (define-key jdee-mode-map  [?\C-c ?\C-v ?z]  'my-jdee-import-all)  ;; stop key C-c c-v z  in jdee-mode , stop key not function, jdee-import-all'  
;;;;;;;;;;   ;;;;  (define-key jdee-mode-map  [?\C-c ?\C-v ?z]  'nil)  ;; stop key C-c c-v z  in jdee-mode , stop key not function, jdee-import-all'  
;;;;;;;;;;   ;;; stop jdee-keys or change keys
;;;;;;;;;;   ;; add other keys to disabled it from jdee-mode from jdee-keys.el, stop keys not functions
;;;;;;;;;;   )
;;;;;;;;;;   (add-hook 'jdee-mode-hook  'my-stop-keys-jdee-hook);; start jdee-mode-hook then my-stop-keys-jdee-hook
;;;;;;;;;;   ;; to stop  keys in jdee-mode, must enter the hook
;;;;;;;;;;   ;; to chang keys in jdee-mode, must enter the hook
;;;;;;;;;;   
;;;;;;;;;;   
;;;;;;;;;;   
;;;;;;;;;;   ;; converted to function 
;;;;;;;;;;   ;; (define-key jdee-mode-map (kbd "M-.") 'jdee-open-class-at-point)
;;;;;;;;;;   
;;;;;;;;;;   ;; converted to macro
;;;;;;;;;;   ;; M-x semantic-ia-fast-jump  wow,amazing  a1.hi();  jump to hi method , then return by c-shift-j, to jump to origial a1 press M-.
;;;;;;;;;;   ;; (define-key jdee-mode-map (kbd "M-,") 'semantic-ia-fast-jump) ;; M-,,,,,, not M-........
;;;;;;;;;;   
;;;;;;;;;;   
;;;;;;;;;;        (define-key jdee-mode-map (kbd "C-c n") 'senator-next-tag) ;; if set it to global you can use it with xml
;;;;;;;;;;        (define-key jdee-mode-map (kbd "C-c p") 'senator-previous-tag) ;; if set it to global you can use it with xml
;;;;;;;;;;        
;;;;;;;;;;        (define-key jdee-mode-map (kbd "C-c C-d C-w") 'senator-kill-tag)  ;; use C-y to yank or paste 
;;;;;;;;;;        (define-key jdee-mode-map (kbd "C-c C-d M-w") 'senator-copy-tag)  ;; use C-y to yank or paste 
;;;;;;;;;;        (define-key jdee-mode-map (kbd "C-c C-d C-c o") 'senator-copy-tag) ;; use C-y to yank or paste 
;;;;;;;;;;        ;; not working  (define-key jdee-mode-map (kbd "C-c C-d C-y") 'senator-yank-tag) ;; use C-y to yank or paste 
;;;;;;;;;;        (define-key jdee-mode-map (kbd "C-c C-d g") 'semantic-symref-symbol) ;; local like M-x occur 
;;;;;;;;;;        (define-key jdee-mode-map (kbd "C-c C-d G") 'semantic-symref)        ;; current Method M-x occur 
;;;;;;;;;;        (define-key jdee-mode-map (kbd "C-c C-d j") 'semantic-complete-jump-local) ;;local  like c-] in eclipse
;;;;;;;;;;        (define-key jdee-mode-map (kbd "C-c C-d J") 'semantic-complete-jump)       ;;global  like c-] in eclipse
;;;;;;;;;;        (define-key jdee-mode-map (kbd "C-c C-d l") 'semantic-analyze-possible-completions) 
;;;;;;;;;;        (define-key jdee-mode-map (kbd "C-c C-d m") 'semantic-complete-jump-local-members) 
;;;;;;;;;;        (define-key jdee-mode-map (kbd "C-c C-d r") 'senator-copy-tag-to-register) 
;;;;;;;;;;        (define-key jdee-mode-map (kbd "C-c C-d u") 'senator-go-to-up-reference) 
;;;;;;;;;;        (define-key jdee-mode-map (kbd "C-c C-d ,") 'semantic-force-refresh) 
;;;;;;;;;;        (define-key jdee-mode-map (kbd "C-c C-d <up>") 'senator-transpose-tags-up) 
;;;;;;;;;;        (define-key jdee-mode-map (kbd "C-c C-d <down>") 'senator-transpose-tags-down) 
;;;;;;;;;;        (define-key jdee-mode-map (kbd "C-c C-d SPC") 'semantic-complete-analyze-inline) 
;;;;;;;;;;  
;;;;;;;;;;  
;;;;;;;;;;   ;; extend : it will be in /home/importantDIR/EmacsHistory/history by trying to add current-prefix-arg in the jdee-gen.el for just try 
;;;;;;;;;;   (define-key jdee-mode-map (kbd "C-c C-d n") 'jdee-gen-class) ;; same as eclipse ;; use c-c c-d c-n global
;;;;;;;;;;   (define-key jdee-mode-map (kbd "C-2 r") 'semantic-symref-rename-local-variable) ;; tab or C-i to jump to another variable
;;;;;;;;;;   (define-key jdee-mode-map (kbd "C-M-x") 'kill-sexp)
;;;;;;;;;;   (define-key jdee-mode-map (kbd "C-c t") 'jdee-gen-object-methods) ;; Generates an equals(), a hashCode() and a toString method.
;;;;;;;;;;   (define-key jdee-mode-map (kbd "C-c C-v J") ' jdee-javadoc-remdoc-at-line) ;; remove javadoc , add javadoc by c-c c-v j 
;;;;;;;;;;   (define-key jdee-mode-map (kbd "C-c C-v x") 'jdee-show-interface-source) ;; visit current interface
;;;;;;;;;; (define-key jdee-mode-map (kbd "C-c C-v l ") 'jdee-open-project-file) ;; open prj.el
;;;;;;;;;; (define-key jdee-mode-map (kbd "C-c C-v ;") 'jdee-xref-make-xref-db) ;; make ref database so can using  C-c C-v a/n 
;;;;;;;;;; (define-key jdee-mode-map (kbd "C-c C-.") 'jdee-complete-minibuf) ;; faster complete without update, to update use c-. only
;;;;;;;;;; 
;;;;;;;;;; (add-hook 'jdee-mode-hook 'hs-minor-mode) ;; open jdee first then open hs-minor mode  ;; C-c @ C-c        
;;;;;;;;;;
;;;;;;;;;;
;;;;;;;;;;
;;;;;;;;;;     ;; M-*  (pop-tag-mark), the other name is C-c s, it used in jdee
;;;;;;;;;;     ;; but you can use M-* for many othe  modes to pop tags or methods 
;;;;;;;;;;     (define-key jdee-mode-map (kbd "C-c s") 'pop-tag-mark)
;;;;;;;;;;
;;;;;;;;;;
;;;;;;;;;; ;; to flush c-. in file /root/.emacs.d/elpa/jdee-20160728.1152/jdee-complete.el  line number 875 put this function
;;;;;;;;;; ;; (jdee-complete-flush-classinfo-cache)   then byte compile the jdee-complete.el  not the jdee-compile.el
;;;;;;;;;; ;;  modify C-. in jdee so flush cache  
;;;;;;;;;; (defun  my-jdee-complete-minibuf ()
;;;;;;;;;;  (interactive)
;;;;;;;;;; (jdee-complete-flush-classinfo-cache)
;;;;;;;;;; (jdee-complete-minibuf))
;;;;;;;;;; (define-key jdee-mode-map (kbd "C-.") 'my-jdee-complete-minibuf)
;;;;;;;;;; 
;;;;;;;;;;
;;;;;;;;;;   ;; when switch to other project, must restart beanShell
;;;;;;;;;;   ;; jumping between two project, must restart beanShell
;;;;;;;;;;   (defun  my-jdee-bsh-restart ()
;;;;;;;;;;    (interactive)
;;;;;;;;;;    (kill-buffer "*JDEE bsh*")
;;;;;;;;;;    (jdee-bsh-exit)
;;;;;;;;;;    (jdee-bsh-run)
;;;;;;;;;;   )
;;;;;;;;;;   (define-key jdee-mode-map (kbd "C-c C-v k") 'my-jdee-bsh-restart)
;;;;;;;;;;    
;;;;;;;;;;    
;;;;;;;;;;     
;;;;;;;;;;     ;; call the (function with argument), without  argument sending ,
;;;;;;;;;;     ;; ex:- jdee-xref-first-caller need argument, but i call it without sending argument to it 
;;;;;;;;;;     ;; by using (call-interactively 'foo)
;;;;;;;;;;     ;; first call  jdee-xref-make-xref-db then call jdee-xref-first-caller
;;;;;;;;;;     (defun my-jdee-make-xref-then-call-first-method ()
;;;;;;;;;;       (interactive)
;;;;;;;;;;       (jdee-xref-make-xref-db)
;;;;;;;;;;       (call-interactively  'jdee-xref-first-caller)
;;;;;;;;;;     )
;;;;;;;;;;     (define-key jdee-mode-map (kbd "C-c C-v a") 'my-jdee-make-xref-then-call-first-method)
;;;;;;;;;;   
;;;;;;;;;;   
;;;;;;;;;;   
;;;;;;;;;;   ;; M-x ren-class  stop auto-save-mode then call jdee-rename-class
;;;;;;;;;;   ;; stop auto-save-mode then rename class ,because autosave will make #file.java##  so, remember that the compiler will auto enable the auto-save mode again 
;;;;;;;;;;    
;;;;;;;;;;  
;;;;;;;;;;     (defun my-jdee-rename-class ()
;;;;;;;;;;       (interactive)
;;;;;;;;;;     ;; [solved]
;;;;;;;;;;     ;; auto-save will stop the dap-java-debug because the class will not update-generate at the target/classes must save .java manually
;;;;;;;;;;     ;;  (call-interactively  'save-buffer) ;; c-x c-s
;;;;;;;;;;     ;; in emacs 26.1 
;;;;;;;;;;     ;; If you want auto-saving to be done in the (visited file) rather than in a (separate auto-save file),
;;;;;;;;;;     ;; enable the global minor mode
;;;;;;;;;;     ;;   M-x ‘auto-save-visited-mode’.
;;;;;;;;;;     ;;   In this mode, auto-saving is identical to explicit saving. 
;;;;;;;;;;     ;;   '(auto-save-default nil) ;; stop auto-save-mode
;;;;;;;;;;     ;;   '(auto-save-timeout 0)   ;; stop auto-save 
;;;;;;;;;;     ;;   '(auto-save-visited-file-name t)  ;; visited file mean (the real file), save directly in visited file not in the #file#
;;;;;;;;;;     ;;   '(auto-save-visited-interval 2)   ;; vistited file after 2 seconds    
;;;;;;;;;;     ;;   '(auto-save-visited-mode t)       ;; auto-save-visisted-mode better than auto-save-mode, because it is save as c-x c-s, so jdee and lsp-java will be see it.
;;;;;;;;;;     ;;
;;;;;;;;;;     ;; ;; no need for this line , it is old 
;;;;;;;;;;     ;;   (auto-save-mode -1)   [old]
;;;;;;;;;;       (call-interactively  'jdee-rename-class)
;;;;;;;;;;     )
;;;;;;;;;;     (defalias 'ren-class   'my-jdee-rename-class)
;;;;;;;;;;     
;;;;;;;;;; 
;;;;;;;;;;  
;;;;;;;;;;  ;; when override methods by M-x  jdee-wiz-override-method but if i modify the abstract class ,
;;;;;;;;;;  ;; then C-c C-v o not show all all  overriden methods
;;;;;;;;;;   ;; so i need to use jdee-complete-flush-classinfo-cache to clear then use override to show all methods 
;;;;;;;;;;   (defun  my-jdee-wiz-override-method()
;;;;;;;;;;    (interactive)
;;;;;;;;;;    (jdee-project-update-class-list)
;;;;;;;;;;    (jdee-complete-flush-classinfo-cache)
;;;;;;;;;;    (jdee-wiz-override-method)
;;;;;;;;;;   )
;;;;;;;;;;   (define-key jdee-mode-map (kbd "C-c C-v C-o") 'my-jdee-wiz-override-method)
;;;;;;;;;;   
;;;;;;;;;;   
;;;;;;;;;;   ;; call the (function with argument), without  argument sending ,
;;;;;;;;;;   ;; ex:- (jdee-wiz-implement-interface INTERFACE-NAME)  need argument, but i call it without sending argument to it 
;;;;;;;;;;   ;; by using (call-interactively 'foo)
;;;;;;;;;;   ;; C-c C-v i but it will give a wrong methods if i modifiy the interface class 
;;;;;;;;;;   ;;  so i will use my own C-c C-v C-i or or  C-c C-v Tab
;;;;;;;;;;   ;; exit bean shell then call  jdee-wiz-implement-interface
;;;;;;;;;;   (defun my-jdee-wiz-implement-interface ()
;;;;;;;;;;    (interactive)
;;;;;;;;;;    (jdee-bsh-exit)
;;;;;;;;;;    (call-interactively  'jdee-wiz-implement-interface)
;;;;;;;;;;   )
;;;;;;;;;;   (define-key jdee-mode-map (kbd "C-c C-v C-i") 'my-jdee-wiz-implement-interface)
;;;;;;;;;;    ;;
;;;;;;;;;;    ;;
;;;;;;;;;;    ;;
;;;;;;;;;;    ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;;;;;;;;;    ;;;;  class.method then jump to  class then visit class then C-c C-d j  
;;;;;;;;;;    ;;;;  [C-;]   [M-w]   [M-b]  [M-.]  [M-.]   [C-x 1]  [C-c C-d j] [C-y]  [return] [space]  [space]
;;;;;;;;;;    ;;;;  not work in jar zip files i think because c-c c-d t ==> semantic database 
;;;;;;;;;;    ;;;;;;;;;  notes :- very important ;;;;;;;;
;;;;;;;;;;    ;;;; visit method with class.method
;;;;;;;;;;    ;;;; if the method have space that is means we have overloading methods => C-c C-d j then C-y
;;;;;;;;;;    ;;;; if the method have not space then no overloading methods
;;;;;;;;;;    ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;;;;;;;;;    ;;
;;;;;;;;;;    ;;;; my old vist -class macro,by 
;;;;;;;;;;    ;;;; (fset 'my-visit-method
;;;;;;;;;;    ;;;;        [?\C-\; ?\M-w ?\M-b ?\M-. ?\M-. ?\C-x ?1 ?\C-c ?\C-d ?j ?\C-y return ?  ? ])
;;;;;;;;;;    ;;;;  (define-key jdee-mode-map (kbd "M-,") 'my-visit-method)
;;;;;;;;;;    ;;
;;;;;;;;;;    ;;
;;;;;;;;;;     ;; [old] dont use it 
;;;;;;;;;;     ;;; jdee-find-method in project by add method(.*{ then search by c-c c-v c-f 
;;;;;;;;;;     ;; then press n p for vist all methods, M-, ==> vist method, then return by c-u c-space(in the same class), or by c-m-j(out class)  
;;;;;;;;;;     (defun my-jdee-find-method-at-project ()
;;;;;;;;;;       "search method in project."
;;;;;;;;;;       (interactive)
;;;;;;;;;;       (call-interactively 'set-mark-command) ;; set mark and deactivate it  to select word so i can return to it by press c-u c-space(same class),or by c-m-j(if it out class)
;;;;;;;;;;       (deactivate-mark)
;;;;;;;;;;     ;;  (call-interactively  'er/expand-region);; c-; to select word so i can return to it by press c-u c-space(same class),or by c-m-j(if it out class)
;;;;;;;;;;     ;;  (call-interactively  'er/contract-region );;  c-: dont expand, so it is now marked, so i can access it by c-u c-space
;;;;;;;;;;       (jdee-find (concat "\\<" (thing-at-point 'word) "(.*{") ) ;; find  methodName(.*{  . means form begining the word \< , then word then ( then any thing then {
;;;;;;;;;;       (other-window 1)  ;; c-x o, go to the other window
;;;;;;;;;;       ;; then press n p because you are in the grep mode, dont press (tab then enter)
;;;;;;;;;;     )
;;;;;;;;;;     ;; (define-key jdee-mode-map (kbd "M-,") 'my-jdee-find-method-at-project)
;;;;;;;;;;     
;;;;;;;;;;  
;;;;;;;;;;  ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;;;;;;;;;  
;;;;;;;;;;  ;; [ old] dont use it  
;;;;;;;;;;  ;; visit jdee class then C-x 1 
;;;;;;;;;;  ;; 
;;;;;;;;;;  (defun my-visit-class()
;;;;;;;;;;   (interactive)
;;;;;;;;;;   (call-interactively  'jdee-open-class-at-point)
;;;;;;;;;;   (delete-other-windows)    ;; add this function => means C-x 1  close the other windows ()
;;;;;;;;;;   )
;;;;;;;;;;  ;; (define-key jdee-mode-map (kbd "M-.") 'my-visit-class)
;;;;;;;;;;  
;;;;;;;;;;  
;;;;;;;;;;  
;;;;;;;;;;  
;;;;;;;;;;  
;;;;;;;;;;  
;;;;;;;;;;  ;; global create full path class(directory+file) at once , my-create-new-class in .emacs,
;;;;;;;;;;  ;; can use it for jdee or in emacs any where(just press c-g when try to write package and class data) 
;;;;;;;;;;  ;; by find-file-at-point and make-directory I can create full path at once time  like this aa/bb/cc/Hi.java
;;;;;;;;;;  (defun my-create-new-class ()
;;;;;;;;;;   (interactive)
;;;;;;;;;;   (call-interactively  'find-file-at-point) ;; to create file without ido mode, same as  c-x c-f c-f 
;;;;;;;;;;  ;; (call-interactively  'make-directory)     ;; to create directory (or not, just press enter ) same as  c-x d alt-m , or in dired use ( + c-f )
;;;;;;;;;;   (call-interactively  'save-buffer)        ;; save buffer to the file (because it is empty it will not saved yet)
;;;;;;;;;;   (revert-buffer t t)                       ;; without confirm (y)  in dired press g means refresh it, go jdee can see the file 
;;;;;;;;;;   (call-interactively  'jdee-gen-class)     ;; to generate class.
;;;;;;;;;;  )
;;;;;;;;;;  ;;(global-set-key (kbd "C-c C-d C-n")   'my-create-new-class)
;;;;;;;;;;  
;;;;;;;;;;  
;;;;;;;;;;   ;; [work]==>  javadoc  -d /home/myLSP/myPath/myDoc  -classpath /home/myLSP/myPath/mariadb-java-client-2.3.0.jar:/home/myLSP/myPath/javax.servlet-api-4.0.1.jar   -sourcepath ./       -subpackages *
;;;;;;;;;;   ;; [work]==>  javadoc  -d /home/myLSP/test/  -classpath /home/myLSP/myPath/mariadb-java-client-2.3.0.jar:/home/myLSP/myPath/javax.servlet-api-4.0.1.jar   -sourcepath ./              -subpackages first
;;;;;;;;;;   ;; [work]==>  javadoc  -d /home/myLSP/test/  -classpath /home/myLSP/myPath/mariadb-java-client-2.3.0.jar:/home/myLSP/myPath/javax.servlet-api-4.0.1.jar   -sourcepath ./              -subpackages first:ok
;;;;;;;;;;   ;; [work]==>  javadoc  -d [destination dir]  -classpath [classpath:classpath]                                                                              -sourcepath [source dir]   -subpackages [package1:subpackage:subpackage]
;;;;;;;;;;   ;; execute command javadoc -d  -classpath  then package
;;;;;;;;;;   ;; to use c-c c-v c-w add in prj.el must add (setq my-list-doc-jdee-help-docsets  (quote (       ("Javadoc For App"      "file:///home/jdee_workspace/sourcePathx/doc/myAppDoc/JavaDoc"                        "1.10")
;;;;;;;;;;   ;;
;;;;;;;;;;     (defun my-jdee-javaDoc()
;;;;;;;;;;       " generate javaDoc for current package to my-list-doc-jdee-help-docsets
;;;;;;;;;;         /home/jdee_workspace/sourcePathx/doc/myAppDoc/JavaDoc
;;;;;;;;;;         then visit it by c-c c-v c-w"
;;;;;;;;;;       (interactive)
;;;;;;;;;;       (my-jdee-import-all)
;;;;;;;;;;       ;; my app javaDoc
;;;;;;;;;;       ;; M-x set-variable jdee-javadoc-gen-packages ==>  ("upDownCast") must be between ("package") then jdee-javadoc-make
;;;;;;;;;;       ;; extract package and pass it to jdee-javadoc-gen-packages
;;;;;;;;;;       ;;'(jdee-javadoc-gen-packages (list  "upDownCast"))
;;;;;;;;;;       (setq jdee-javadoc-gen-packages (list  (replace-regexp-in-string  " "   "" (replace-regexp-in-string  ";"   "" (replace-regexp-in-string  "^package "   "" (jdee-package-generate-package-statement))))))
;;;;;;;;;;       ;; generate javaDoc html at path /home/jdee_workspace/sourcePathx/doc/myAppDoc/JavaDoc  then visit it by c-c c-v c-w(setq my-list-doc-jdee-help-docsets)
;;;;;;;;;;       (setq jdee-javadoc-gen-destination-directory "/home/jdee_workspace/sourcePathx/doc/myAppDoc/JavaDoc")
;;;;;;;;;;       ;; generate javaDoc html files by javadoc command javadoc -d  -classpath   packages,
;;;;;;;;;;       ;; generate javaDoc html files by javadoc command javadoc -d (destination directory) -classpath   packages (Names of packages that you want to document, separated by spaces),
;;;;;;;;;;       (jdee-javadoc-make-internal)
;;;;;;;;;;      )
;;;;;;;;;;    
;;;;;;;;;;    
;;;;;;;;;;    
;;;;;;;;;;    
;;;;;;;;;;    ;;;;;;;;;;;;;;;;; flymake for java ;;;;;;;;;;;;;;;;;;;
;;;;;;;;;;    ;; how to setup ecj.jar for flymake  ???????????
;;;;;;;;;;    ;; all information found at ~/.emacs.d/elpa/jdee-20160728.1152/jdee-ecj-flymake.el and ~/.emacs.d/plugins/flymake.el
;;;;;;;;;;    
;;;;;;;;;;    ;; [old]flymake version 0.3 from here
;;;;;;;;;;    ;; http://cvs.savannah.gnu.org/viewvc/emacs/emacs/lisp/progmodes/flymake.el
;;;;;;;;;;    
;;;;;;;;;;    ;; [new] flymake 0.4  by  illusori https://github.com/flymake/emacs-flymake
;;;;;;;;;;    ;; now i am using flymake 0.3 not flymake 0.4
;;;;;;;;;;    
;;;;;;;;;;    ;; solve problem ==> (load "file") better than (require 'file) or delete file.elc compiler 
;;;;;;;;;;    (load "~/.emacs.d/plugins/flymake.el")
;;;;;;;;;;    (require 'jdee-ecj-flymake)     ;; ecj is eclipse compiler version 4.6.1 ==>  ~/.emacs.d/jars/private_JAR/ecj.jar  ,, all old  ecj in   /home/jdee/ecj_all/ecj-4.6.1.jar
;;;;;;;;;;    (add-hook 'jdee-mode-hook 'flymake-mode-on)
;;;;;;;;;;    (add-hook 'flymake-mode-hook 'flymake-cursor-mode) ;; flymake then flymake-cursor to show errors in minibuffer
;;;;;;;;;;  
;;;;;;;;;;  ;; you have two options now  [[[ first flymake]]] or  [[[ second  flymake]]]
;;;;;;;;;;  ;; now I am using  [[[ second  flymake]]]
;;;;;;;;;;  ;; if i face problem in flymake i will change it to jdee-ecj-flymake-init
;;;;;;;;;;  
;;;;;;;;;;  
;;;;;;;;;;  ;; [[[ first flymake]]]
;;;;;;;;;;  ;; This is the simple, robust (strong)  and painfully slow 
;;;;;;;;;;  ;; method, in which flymake forks a new jvm process each time it
;;;;;;;;;;  ;; decides to error check the buffer.
;;;;;;;;;;  ;; `flymake-allowed-file-name-masks' to (\"\\.java\\'\" jdee-ecj-flymake-init jdee-ecj-flymake-cleanup)"
;;;;;;;;;;  
;;;;;;;;;;  
;;;;;;;;;;  
;;;;;;;;;;  ;; [[[ second  flymake]]]
;;;;;;;;;;  ;; flymake server  and faster
;;;;;;;;;;  ;;  and might cause problems if you use flymake with non-java  buffers.so delete all other flymake masks in .emacs from flymake-allowed-file-name-masks', keep it only for java
;;;;;;;;;;  ;; `flymake-allowed-file-name-masks' to (\"\\.java\\'\" jdee-ecj-server-flymake-init jdee-ecj-flymake-cleanup)"
;;;;;;;;;;  
;;;;;;;;;;  
;;;;;;;;;;  
;;;;;;;;;;  ;; [new]  flymake 0.4  by  illusori https://github.com/flymake/emacs-flymake
;;;;;;;;;;  
;;;;;;;;;;  ;; [flymake error number 1]
;;;;;;;;;;  ;; [flymake error]
;;;;;;;;;;  ;; flymake(0.3) or (0.4)
;;;;;;;;;;  ;;  Error running timer ‘flymake-on-timer-event’: (wrong-number-of-arguments (1 . 1) 0)
;;;;;;;;;; ;;  it is from M-x cs flymake then when open java file the above errors appears
;;;;;;;;;; ;;  it is not not from  '(flymake-no-changes-timeout 2)
;;;;;;;;;; ;;  (defun  flymake-start-syntax-check () ) ;; now it is return nil to be correct
;;;;;;;;;; ;;  (load "~/.emacs.d/plugins/flymake.el") ;; load the original functions 
;;;;;;;;;; ;;  solution :- load .emacs
;;;;;;;;;; ;;  solution :- dont custome flymake from M-x cs flymake then return to java files, so must restart emacs first
;;;;;;;;;; ;;  or just load .emacs to solve the error above 
;;;;;;;;;; 
;;;;;;;;;; ;; [flymake error number 2]
;;;;;;;;;; ;; [flymake error]
;;;;;;;;;; ;; flymake(0.3) or (0.4)
;;;;;;;;;; ;; solve  flymake error (quote) and error at java assertion errors
;;;;;;;;;; ;; this is the error  Error running timer ‘flymake-on-timer-event’: (void-function flymake--log-1)
;;;;;;;;;; ;; the solution is 
;;;;;;;;;; ;;; use hard flymake by
;;;;;;;;;; ;;;  `flymake-allowed-file-name-masks' to (\"\\.java\\'\" jdee-ecj-flymake-init jdee-ecj-flymake-cleanup)"
;;;;;;;;;; ;;; dont use this, server start bean-shell twice
;;;;;;;;;; ;;;  `flymake-allowed-file-name-masks' to (\"\\.java\\'\" jdee-ecj-server-flymake-init jdee-ecj-flymake-cleanup)"
;;;;;;;;;; 
;;;;;;;;;; ;; [flymake error number 3]
;;;;;;;;;; ;;  (flymake 0.4)
;;;;;;;;;; ;;  when visit remote java file outside the package like String.java, then close the String.java, flymake stopped, so please use flymake(0.3)
;;;;;;;;;; 
;;;;;;;;;; 
;;;;;;;;;;
;;;;;;;;;;    
;;;;;;;;;;    
;;;;;;;;;;    (define-key jdee-mode-map (kbd "C-c w") 'flymake-display-err-menu-for-current-line)
;;;;;;;;;;    (define-key jdee-mode-map (kbd "C-c e") 'flymake-goto-next-error)
;;;;;;;;;;    (define-key jdee-mode-map (kbd "C-c r") 'flymake-goto-prev-error)
;;;;;;;;;;    (define-key jdee-mode-map (kbd "C-c i") 'jdee-wiz-get-set-methods)
;;;;;;;;;;    (define-key jdee-mode-map (kbd "C-c C-v w") 'jdee-help-class)
;;;;;;;;;;    (define-key jdee-mode-map (kbd "C-c C-z")  'jdee-import-organize)
;;;;;;;;;;    
;;;;;;;;;;    
;;;;;;;;;;    
;;;;;;;;;;
;;;;;;;;;;
;;;;;;;;;;
;;;;;;;;;;
;;;;;;;;;;  
;;;;;;;;;;  ;; old
;;;;;;;;;;  ;;  Global Semantic Idle Summary Mode =>  put (Class variable) in minibuffer 
;;;;;;;;;;  ;; (global-semantic-idle-summary-mode t) ;; not loaded automatically by M-x cs ,so i put it here
;;;;;;;;;;  
;;;;;;;;;;  
;;;;;;;;;;  ;; very important 
;;;;;;;;;;  ;; to config JDEE as IDE use M-x cs Semantic Idle defun
;;;;;;;;;;  ;; refactor and semantic convert emacs to IDE , and for c and java it is will be semantic-refactor or srefactor package 
;;;;;;;;;;  ;; for example semantic-decoration-on-private-members with (global-semantic-decoration-mode t) will colored private
;;;;;;;;;;  ;; https://www.gnu.org/software/emacs/manual/html_mono/semantic.html
;;;;;;;;;;  
;;;;;;;;;;  ;; C-c C-d always using semanticdb- 
;;;;;;;;;;  
;;;;;;;;;;  ;;  semantic modes are
;;;;;;;;;;  ;;  Global Semantic Idle Local Symbol Highlight Mode =>  surround box a around variable like eclipse 
;;;;;;;;;;  ;;  Global Semantic Idle Summary Mode =>  put (Class variable) in minibuffer 
;;;;;;;;;;  ;;  Global Semantic Mru Bookmark Mode =>  c-c b to list edited methods 
;;;;;;;;;;  ;;  Global Semantic Idle Scheduler Mode  =>  
;;;;;;;;;;  ;;  Global Semantic Idle Breadcrumbs Mode =>  display class.method at top  [noisy dont use it]
;;;;;;;;;;  ;;  Global Semantic Decoration Mode => set colors for private methods protect and all component and members of java 
;;;;;;;;;;  ;;  Global Semantic Highlight Edits Mode => Highlight text that has been edited
;;;;;;;;;;  ;;  Global Semantic Highlight Func Mode =>  Highlight current method
;;;;;;;;;;  ;;  Global Semantic Idle Completions Mode =>  Provide smart symbol completion automatically at idle time [no need]
;;;;;;;;;;  ;;  Global Semantic Show Unmatched Syntax Mode => Highlight lexical tokens which failed to be parsed.
;;;;;;;;;;  ;;  Global Semantic Stickyfunc Mode: =>   show name of function at top [ dont use it, noisy ]
;;;;;;;;;;   
;;;;;;;;;;   
;;;;;;;;;;   ;; c-,   jump to instance variable and methods, return by c-u c-space , M-x semantic-ia-fast-jump, if face errors then c-c c-d , for reparsed buffer to  reparsed fresh cache
;;;;;;;;;;   ;; c-2 r jump to local variable and rename it, dont dont dont  use M-. to  jump to local variable, to return c-c s
;;;;;;;;;;   ;; [M-. use it for class only] because somethimes jump to local variable not global, so use it for class only 
;;;;;;;;;;   ;; dont use M-. to visit local variable
;;;;;;;;;;   ;; (define-key jdee-mode-map (kbd "C-,")  'semantic-ia-fast-jump)
;;;;;;;;;;   
;;;;;;;;;;   
;;;;;;;;;;   ;; disable flycheck in jdee-mode, so i can use c-c e and c-c r for flymake in jdee 
;;;;;;;;;;   ;; also stop flycheck in jdee by 
;;;;;;;;;;   ;; '(jdee-flycheck-enable-p nil) as above
;;;;;;;;;;
;;;;;;;;;;
;;;;;;;;;;   ;; work
;;;;;;;;;;   ;; flymake start after save c-x c-s not auto-save 
;;;;;;;;;;   ;; (eval-after-load "flymake"
;;;;;;;;;;   ;;   '(progn
;;;;;;;;;;   ;;      (defun flymake-after-change-function (start stop _len)    
;;;;;;;;;;   ;;       "Start syntax check for current buffer if it isn't already running."
;;;;;;;;;;   ;;       ;; Do nothing, don't want to run checks until I save.
;;;;;;;;;;   ;;       )))
;;;;;;;;;;   
;;;;;;;;;;   
;;;;;;;;;;   ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; plantuml;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;;;;;;;;;   ;; no need for install package plantuml-mode.
;;;;;;;;;;   ;; i use M-x uml    ==> text to svg
;;;;;;;;;;   ;; i use M-x umlx   ==> folder to svg
;;;;;;;;;;   ;; i use M-x umlGUI ==> all text in folder to svg svg svg files
;;;;;;;;;;   
;;;;;;;;;;   ;; M-x uml 
;;;;;;;;;;   ;; for update i changed the path to  ~/.emacs.d/jars/private_JAR/plantuml.jar meta-inf 
;;;;;;;;;;   ;; to removet the splash screen in the plantuml.jar in the 
;;;;;;;;;;   
;;;;;;;;;;   ;; [old, use it if you install the plantuml-mode ]
;;;;;;;;;;   ;; (require 'plantuml-mode)
;;;;;;;;;;   ;; (plantuml-set-output-type "svg") ;; M-x plantuml-set-output-type svn, ping or utxt
;;;;;;;;;;   ;; (defalias 'uml    'plantuml-preview)  ;; convert text to image 
;;;;;;;;;;   
;;;;;;;;;;   



;;; list edited  methods  (jumping between edited methods)
;;; bookmark previous(edited) methods and view it as list,
;;; first need to enable  '(global-semantic-mru-bookmark-mode t) 
;;; the default key is C-x b
;;;;;;;;  (global-semantic-mru-bookmark-mode t)   ;; not loaded automatically by M-x cs, so i put it here 
;;;;;;;;  (define-key jdee-mode-map (kbd "C-c b")  'semantic-mrub-switch-tags)

;;;;;;;;;
;;;;;;;;;           (add-hook
;;;;;;;;;            'jdee-mode-hook
;;;;;;;;;            (lambda()
;;;;;;;;;              (flycheck-mode -1)
;;;;;;;;;              (flymake-mode 1)
;;;;;;;;;           ))
;;;;;;;;;







;; in  buffer, then M-x uml, c-x c-k ,  then alt-enter svg-firefox  (open with external default application ) or or or M-x umlGUI (for dynamically changed )
(defun my-plantuml-text-to-svg()
  (interactive)
    (shell-command ( concat "java -Xmx1024m  -DPLANTUML_LIMIT_SIZE=81920000 -jar /home/jdee_workspace/sourcePathx/jars/private_JAR/plantuml.1.2020.18.jar  -tsvg \'" (buffer-file-name) "\' ")) ;; \' so i can use space in absolute path
    ;;  -DPLANTUML_LIMIT_SIZE=81920000 max image size and  -Xmx1024m max java memory
    ;; -tsvg generate svg file instead of png, because it is faster

;;  (dired "~/")  ;; open dired with this path 
;;  (dired-filter-by-regexp "plantumlDependency.svg")
;;  (my-dired-open-in-external-app) open svg->firefox
;;  (dired-find-file) ;; means press enter at the current file 
;;  (delete-other-windows) ;; c-x 1
)
(defalias 'uml 'my-plantuml-text-to-svg) ;; dont dont dont install ==>apt-get install inkscape librsvg2* to open svg file
;; svg faster than png
;; svg faster than png
;; remove apt-get remove librsvg2-bin, so the command rsvg in emacs which try to open svg file, is very slow, because rsvg convert svg->png 
;; remove inkscape
;; remove librsvg2-bin



;; open dired  then M-x umlx
;; the output image in ~/plantumlDependency.svg
 ;; convert folder(dired ) to image called  ~/plantumlDependency.svg
(defun my-plantuml-dependency-dired()
  (interactive)
    (shell-command (concat "java -Xmx1024m  -jar /home/jdee_workspace/sourcePathx/jars/private_JAR/plantuml-dependency-cli-1.4.0.jar  -o \'"  default-directory "ClassDiagram.txt\' "))  ;; convert current directory( dired ) to ClassDiagram.txt 
    (shell-command (concat "java -Xmx1024m  -DPLANTUML_LIMIT_SIZE=81920000 -jar /home/jdee_workspace/sourcePathx/jars/private_JAR/plantuml.1.2020.18.jar  -tsvg \'"  default-directory"ClassDiagram.txt\' ")) ;; convert ClassDiagram.txt to image named ClassDiagram.svg
    ;;  -DPLANTUML_LIMIT_SIZE=81920000 max image size and  -Xmx1024m max java memory
    ;; -tsvg generate svg file instead of png, because it is faster
    ;; to open svg file we need apt-get install inskscape librsvg*

;;  (dired "~/")  ;; open dired with this path 
;;  (dired-filter-by-regexp "ClassDiagram.svg")
;;  (my-dired-open-in-external-app)
;;  (dired-find-file) ;; means press enter at the current file 
;;  (delete-other-windows)


)
(defalias 'umlx 'my-plantuml-dependency-dired) ;; dont dont dont install ==>apt-get install inkscape librsvg2* to open svg file
;; svg faster than png
;; svg faster than png
;; remove apt-get remove librsvg2-bin, so the command rsvg in emacs which try to open svg file, is very slow, because rsvg convert svg->png 
;; remove inkscape
;; remove librsvg2-bin







;; gui so it will be dir dynamically, then open file with firefox
;; M-x umlGUI
(defun my-plantuml-gui-dired()
  (interactive)
    (shell-command "java -Xmx1024m  -DPLANTUML_LIMIT_SIZE=81920000 -jar /home/jdee_workspace/sourcePathx/jars/private_JAR/plantuml.1.2020.18.jar  -tsvg -gui  & ") ;; gui
    ;;  -DPLANTUML_LIMIT_SIZE=81920000 max image size and  -Xmx1024m max java memory
    ;; -tsvg generate svg file instead of png, because it is faster
;; svg faster than png
;; remove apt-get remove librsvg2-bin, so the command rsvg in emacs which try to open svg file, is very slow, because rsvg convert svg->png 
;; remove inkscape
;; remove librsvg2-bin

)
(defalias 'umlGUI 'my-plantuml-gui-dired) ;;dont dont dont install  apt-get install inkscape librsvg2* to open svg file
;; svg faster than png
;; remove apt-get remove librsvg2-bin, so the command rsvg in emacs which try to open svg file, is very slow, because rsvg convert svg->png 
;; remove inkscape
;; remove librsvg2-bin

;; svg open-with firefox as default
;; 1-command pcmanfm (file-manager)
;; 2- right click open-with
;; 3- use /opt/firefox/firefox not /usr/bin/firefox 


;;;;;;;;;;;;;;;;;;;;; ace window ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; ==== ace window =========== 
;; c-x o then char
;; C-u C-x o ==> swap current window to 
;; C-u C-u C-x o => delete window 
;; jump to the other window by using char if windows >2

;; solve problem ==> (load "file") better than (require 'file) or delete file.elc compiler 
(require 'ace-window)
(global-set-key (kbd "C-x o") 'ace-window)
(setq aw-keys '(?f ?j ?d ?k ?s ?l ?a ?g ?h))  ;; so can use char 

;; add ace-windwo to the golden ratio
;; change the size and color to fg=red bg=yellow size=1.5

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;


;; golden ration take most of monitor, so icant see the words when fix spelling  it,
;; M-x my-Spell
;; M-$ for current word, or can use M-x Myspell for current word
;; select region then M-x my-Spell, spece for ignore

(defun my-Spell()
  (interactive)
  (golden-ratio-mode -1)
  (call-interactively  'ispell-word)
  (golden-ratio-mode t)
)

;; clean my-yas from not correct exit $1 $2 
;;
;; if hang when using mc and  my-yas
;; to solve message error
;; yas-expand-snippet: [my-yas] `yas-expand-snippet' needs properly setup `yas-minor-mode'
;; if you put $0 only in the snippet then will not see this error
(defun my-yas()
  (interactive)
  (yas-minor-mode)
  (yas-minor-mode)
  )

;; global insert snippet
;; (global-set-key  (kbd "C-c SPC g") 'yas-insert-snippet) ;; c-c space 




;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;


;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;  Jtags ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;


;;;; go to defintion of class or method or variable
;;;; M-x list-packages, download jtags 

;;;; so at every src will create Tag file named TAGS , in tags-table-list  in prj.el

;; TAGS files 
;; put it in the prj.el for every java project have a specific list 
    ;; (setq tags-table-list '("/home/jdee_workspace/sourcePathx/sources/src_jdk_1.7"
    ;; 			    "/home/jdee_workspace/sourcePathx/sources/servlet-api-src"
    ;; 			    "/home/jdee_workspace/app2/src"
    ;; 			    "/home/jdee_workspace/web8/src"
    ;; 			    ))


;; very important, when jtags-update file will not ask you to confirm with y/n
(setq tags-revert-without-query 't)

;; Which will tell tags functionality to re-visit the TAGS file if it changes on disk.
;; This check happens every time you invoke a tags function
;; c-c s to return 
;; solve problem ==> (load "file") better than (require 'file) or delete file.elc compiler 
;; (require 'jdee)

;; (define-key jdee-mode-map (kbd "M-.")   'jtags-update-this-tags-file) ;; update this this project TAGS file for this project only, in prj.el
;; M-x jtags-update-tags-files ) ;; update all  project TAGS file only in above tags-table-list list in prj.el
;; no need to press M-. then c-c j   why ? because see my-jtags-show-declaration function,
;; when press c-c j if not found tag it will update TAG file in table list automatically, so no need to press M-. then c-c j

;;  loooooooook looooook M-x jtag  ===>>>> only for update all jtags 
;; it is used above, so no need fo M-.
;;(defalias 'jtag  'jtags-update-tags-files)

;; i spend two days to this function with alot of pain and headache,
;; improve jtags-show-decleration, so i can update file TAGS when error occurs,
;; if errors occurs then update TAGS,then visit method decleration
;; Normally, (ignore-errors body) returns whatever body returns; but  when there's error, it returns nil.
;;
(defun my-jtags-show-declaration()
  "if errors occurs then update TAGS,then visit method decleration"
  (interactive)
  (unless (ignore-errors (jtags-show-declaration))
    (jtags-update-this-tags-file)  ;; if and only if error occurs then update file TAGS for current project which located in prj.el (setq tags-table-list)
    (pop-tag-mark)                 ;; c-c s or M-* to return to method position after errors, because error will put the cursor on position 0.0
    (jtags-show-declaration)       ;; now retry visit method decleration  after update current TAGS
    )
)

;; (define-key jdee-mode-map (kbd "C-c j") 'my-jtags-show-declaration) ;; visit tag(method,function), to return c-c s
;; c-c j set global, not local, so i can vist class file from xml 
(global-set-key  (kbd "C-c j") 'my-jtags-show-declaration) ;; visit tag(method,function), to return c-c s

;;(define-key jdee-mode-map (kbd "C-c j") 'jtags-show-declaration)

;;; this is the way to use minibuffer with call-interactively 
;;; this is the way to use minibuffer with call-interactively 
;;; this is the way to use minibuffer with call-interactively 

;; defun to insert variable ;; to insert in minibuffer prompt current word at point
(defun my-fooyyhookjtags-jtags-hook-for-me-only()
  (insert mywordd-for-jtags-with-semantic-search)
  (semantic-complete-complete-space) ;; press space 
;;  (semantic-complete-complete-tab) 
)

;; jtags second visit tags with args
(defun my-jtags-second-search-with-args()
  "second jtags search with args"
  (interactive)
  (setq mywordd-for-jtags-with-semantic-search (thing-at-point 'word))
  (my-jtags-show-declaration)
  ;; temporary hook
  (add-hook 'minibuffer-with-setup-hook 'my-fooyyhookjtags-jtags-hook-for-me-only)
  (minibuffer-with-setup-hook
      'my-fooyyhookjtags-jtags-hook-for-me-only
    (call-interactively 'semantic-complete-jump-local))
  ;; after this line of hook, cant run code, because it will invoke the hook my-fooyyhookjtags-jtags-hook-for-me-only method
)
;; stop this key, just use lsp keys
;; (define-key jdee-mode-map (kbd "C-c J") 'my-jtags-second-search-with-args) ;; C-c shift-j 

;; this is the solution to Call a function and insert text in minibuffer prompt???
;; https://emacs.stackexchange.com/questions/36208/call-a-function-and-insert-text-in-minibuffer-prompt
;; if face problem change  minibuffer-with-setup-hook by minibuffer-setup-hook


;; [ to do ]
;; add language to java, so will improve TAGS file, will add enum so good, in M-x cs jtags command 
;;  find `pwd`  -name '*.java' -type f  | etags  --language=java  --declarations --members -o %f -
;; stop 3 keys in .emacs c-, M-, M-.
;; very important i prefer to use c-. instead of .  in sql

;; just use my-stop-keys-jtags-hook() to disable keys without modify jtags 
;; [dont do this] ==> ; jtags.el and jtags-extras.el in elpa  keys disable it and then Shift-B compile jtags
;; /root/.emacs.d/elpa/jtags-20160211.1229/jtags.el

;; make all sources in jdk-java and servlet for read-only, to prevent any body editing it
;; remove jdee-help-docsets oracle https from M-x cs 

;; override
;; override
;; override
;; undefined jtags keys without modify jtags.el ;;;
;; undefine key without change .el file
;; stop key M-, from jtags mode and jtags-extras
;; (define-key jtags-mode-map  (kbd "M-,") 'nil)
;; then you need to hook or link, so when jtags start then start my hook to stop keys, look it is easy
(defun my-stop-keys-jtags-hook ()
  (define-key jtags-mode-map  [(meta ?\,)] 'nil)       ;; stop  key M-, in jtags-mode , stop key not function jtags-show-declaration'
  (define-key jtags-mode-map  [(control c) ?\,] 'nil)  ;; stop  key C-c , in jtags-mode , stop key not function, jtags-update-this-tags-file'  
  (define-key jtags-mode-map  [(control ?\,)] 'nil)    ;; stop  key C-, in jtags-mode , stop key not function jtags-member-completion'
  (define-key jtags-mode-map  [(meta f1)] 'nil)        ;; stop  key M-f1 in jtags-mode , stop key not function jtags-show-documentation'
  (define-key jtags-mode-map  [(control c) ?\+]  'nil) ;; stop  key C-+ in jtags-mode , stop key not function jtags-extras-add-import'
  (define-key jtags-mode-map  [(control c) ?\=]  'nil) ;; stop  key C-= in jtags-mode , stop key not function jtags-extras-organize-imports'
;; add other keys to disabled it from jtags-mode and jtags-extras.el, stop keys not functions
)
(add-hook 'jtags-mode-hook  'my-stop-keys-jtags-hook);; start jtags-mode-hook then my-stop-keys-jtags-hook
;; to stop  keys in mode, must enter the hook
;; to chang keys in mode, must enter the hook



;;; overrid method of function 
;;; override funciton  in elisp is just like this, very easy, for example i have my_method in telent.el and i want overrid it 
;;  (require 'telnet)
;;  (defun my_method (proc string)
;;     )
;;; or or or
;;; the second way for overriding 
;;; (eval-after-load "telnet"
;;;  '(defun telnet-initial-filter (proc string)
;;;     ...))
;; override
;; override
;; override
;; solve problem ==> (load "file") better than (require 'file) or delete file.elc compiler 
(require 'jtags) ;; if not work use (load "jtags") 
(defun jtags-show-declaration ()
  "my override function with same name of jtags-show-declaration"
  (interactive)
  (let ((definition (jtags-find-tag)))
    (if (null definition)
        (progn 
             (jtags-update-this-tags-file)
                (let ((mydefinition (jtags-find-tag)))
                     (if (null mydefinition)
                 	(message "Tag not found!")
                   (jtags-goto-tag-location mydefinition))))
      (jtags-goto-tag-location definition))))



;; very important note,
;;  M-f1(i stop key not fun)  is bound to `jtags-show-documentation' in jtags.el, so you can use it instead of jdee docs.

;;;;;;;;;;;;;;;;;;;;;;;;;;;;; end of   Jtags ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;; dont use M-x package-reinstall without M-x list-packages first
;;; dont use M-x package-reinstall without M-x list-packages first

;; use M-x bookmark-save instead of c-x ps 
;; (global-set-key (kbd "C-x ps") 'bookmark-save)  ;; save bookmark to file /home/importantDIR/EmacsBookmark/bookmarks


;;;;;;;;;;;;;;;;;;;;;;;;;;;;; end of bookmark  ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;


;;;; if is built in from  emacs 24.4
;;;; no need for extra fullscreen package, it is built-in
;;;; maximized by  ==> M-f10
     (toggle-frame-maximized) 
;;;; full screen by ==> f11
     (toggle-frame-fullscreen) 

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; LXDE emacs font 
;; work work work work work work 
;; change font size in emacs at LXDE
;; in gnome just change :height 158 in (custom-set-faces  '(default ((t (:family "DejaVu Sans Mono" :foundry "PfEd" :slant normal :weight normal :height 150 :width normal))))
;; or use defaut-system-font by '(font-use-system-font t)
;; or use (set-face-attribute 'default nil :height 160 :family "DejaVu Sans Mono")
(add-to-list 'default-frame-alist
             '(font . "DejaVu Sans Mono-22"))
;; or by M-x default-frame-alist
;; '(default-frame-alist
;;    (quote
;;     ((font . "DejaVu Sans Mono-16")


;;;;;;;;;;;;;;;;;;;;;;;;; dired  ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;;;;;;;;;;;;;;;;;;;;;;;; dired  ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;;;;;;;;;;;;;;;;;;;;;;;; dired  ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(require 'dired)
(require 'dired-subtree)

(use-package dired-subtree
        :ensure t
        :bind (:map dired-mode-map
                    ("i" . dired-subtree-insert)
                    ("r" . dired-subtree-remove)
                    ("h" . dired-subtree-up)
                    (";" . dired-subtree-down)
		    ))

;;; in dired
;;; in dired press j in dired-mode  to visit any file in folder or subfolder 
;;;
(add-hook
 'dired-mode-hook
 (lambda()
   (define-key dired-mode-map "j" 'ido-find-file)))

;;;;;;;;;;;;;;
;; in dired 
;; decrypt video files in dired by M-x gpgx
(defun my-gpg2 (file)  
  (interactive "sFile: ")  
  (shell-command
   (concat "gpg -o - -d " file " | vlc - -f & ")))

(defun my-GPG_Dired ()  
   (interactive)  
         (my-gpg2 (replace-regexp-in-string  ""   ""   (call-interactively  'dired-copy-filename-as-kill))));; regexp "" "" not important, but i copied it from (def my-yt) as above for youtube function

(defalias 'gpgx 'my-GPG_Dired)  ;; M-x gpgx in dired

;;;;;;;;;;;;;;

;; just press key (a)  in dired then the folder will opened
(put 'dired-find-alternate-file 'disabled nil)


;;; open file in external app in linux , but in windows it is work directly by M-return 
(defun my-dired-open-in-external-app ()
  "Open the current file or dired marked files in external app.
The app is chosen from your OS's preference.

Version 2015-01-26
URL `http://ergoemacs.org/emacs/emacs_dired_open_file_in_ext_apps.html'"
  (interactive)

  (let* (
         (ξfile-list
          (if (string-equal major-mode "dired-mode")
              (dired-get-marked-files)
            (list (buffer-file-name))))
         (ξdo-it-p (if (<= (length ξfile-list) 5)
                       t
                     (y-or-n-p "Open more than 5 files? "))))

    (when ξdo-it-p
      (cond
       ((string-equal system-type "windows-nt")
        (mapc
         (lambda (fPath)
           (w32-shell-execute "open" (replace-regexp-in-string "/" "\\" fPath t t))) ξfile-list))
       ((string-equal system-type "darwin")
        (mapc
         (lambda (fPath) (shell-command (format "open \"%s\"" fPath)))  ξfile-list))
       ((string-equal system-type "gnu/linux")
        (mapc
         (lambda (fPath) (let ((process-connection-type nil)) (start-process "" nil "xdg-open" fPath))) ξfile-list))))))


;;;;;;;;;; open dired file in desktop explorer or natilus in linux , it is by default in windows by C-enter or return

(defun my-dired-open-in-desktop ()
  "Show current file in desktop (OS's file manager)."
  (interactive)
  (let* (
         (ξfile-list
          (if (string-equal major-mode "dired-mode")
              (dired-get-marked-files)
            (list (buffer-file-name))))
         (ξdo-it-p (if (<= (length ξfile-list) 5)
                       t
                     (y-or-n-p "Open more than 5 files? "))))

    (when ξdo-it-p
      (cond
       ((string-equal system-type "windows-nt")
        (mapc
         (lambda (fPath)
           (w32-shell-execute "open" (replace-regexp-in-string "/" "\\" fPath t t))) ξfile-list))
       ((string-equal system-type "darwin")
        (mapc
         (lambda (fPath) (shell-command (format "open \"%s\"" fPath)))  ξfile-list))
       ((string-equal system-type "gnu/linux")
        (mapc
;;;      (lambda (fPath) (let ((process-connection-type nil)) (start-process "" nil "thunar"       (file-name-directory  fPath)  ))) ξfile-list))))))   ;; thunar or pcmanfm desktop manager  open folder not select file
         (lambda (fPath) (let ((process-connection-type nil)) (start-process "" nil "thunar"  fPath  ))) ξfile-list))))))   ;; thunar  desktop manager , select file 
;; pcmanfm or nautilus or any window manager 

;;;; notice that we use nautilus file name instead of xdg-open because we can select the file by this way !!!!
;;;; xdg-open a.jpg ==> will open the file
;;;; nautilus a.jpg ==> will select the file without open it
;;;; so the two function above are same , the difference is xdg-open and nautilus


;;;;;;; open file in explorer by M-return , open file by extension app by M-return
(global-set-key (kbd "C-<return>")   'my-dired-open-in-desktop)
(global-set-key (kbd "M-<return>")   'my-dired-open-in-external-app)


;;; dired zip compress/uncompress ;;;;;;


;; in dired  compress and uncompress .zip file
;; Z uncompress
;; z compress, can compress multi dir 
(eval-after-load "dired-aux"
   '(add-to-list 'dired-compress-file-suffixes 
                 '("\\.zip\\'" ".zip" "unzip")))

;; z uncompress by zip command
(eval-after-load "dired"
  '(define-key dired-mode-map "z" 'my-dired-zip-files))

(defun my-dired-zip-files (zip-file)
  "Create an archive containing the marked files."
  (interactive "sEnter name of zip file: ")

  ;; create the zip file
  (let ((zip-file (if (string-match ".zip$" zip-file) zip-file (concat zip-file ".zip"))))
    (shell-command 
     (concat "zip -0 -r  " 
             zip-file
             " "
             (my-concat-string-list 
              (mapcar
               '(lambda (filename)
                  (file-name-nondirectory filename))
               (dired-get-marked-files))))))

  (revert-buffer)

  ;; remove the mark on all the files  "*" to " "
  ;; (dired-change-marks 42 ?\040)
  ;; mark zip file
  ;; (dired-mark-files-regexp (filename-to-regexp zip-file))
  )

(defun my-concat-string-list (list) 
   "Return a string which is a concatenation of all elements of the list separated by spaces" 
    (mapconcat '(lambda (obj) (format "%s" obj)) list " "))

;;;;;;;;;;;;;;;;;;;;;
;; i think it is to 
;; enable the disabled command(narrow-to-region)
(put 'narrow-to-region 'disabled nil)




;;;;;;;;;;;;;;;;;;;;;;;;;;;; end of dired ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;; end of dired ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;; end of dired ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; M-x my-insert-date => 31-07-2018
(defun my-insert-date ()
  "Insert current date dd-mm-yyyy."
  (interactive)
  (insert (format-time-string "%d-%m-%Y")))


;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; M-x regexp-builder, [important] C-c TAB => string then use one \ not \\
;; solve problem ==> (load "file") better than (require 'file) or delete file.elc compiler 
(require 're-builder)
(setq reb-re-syntax 'string)  ;; c-c tab => to use \ not \\
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;;;;;;;;;;;;;;;;;;;;;;; clean mode-line ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; [old]
;; important :- add modes to be hidden("re-named by empty name") in  mode-line but but not removed from emacs
;;
;; [old]
;;(defvar my-mode-line-cleaner-alist
;;;;  `(
;;;;  (abbrev-mode . "")
;;;;  (anzu-mode . "")
;;;;  (auto-complete-mode . "")
;;;;  (emmet-mode . "")
;;;;  (golden-ratio-mode . "")
;;;;  (hs-minor-mode . "")
;;;;  (which-key-mode . "")
;;;;  (yas-minor-mode . "")
;;;;  (lisp-interaction-mode . " λ ")
;;;;  (visual-line-mode  ."") 
;;;;  (eldoc-mode . "")
;;;;  (company-mode . "")
;;;;  (real-auto-save-mode . "") 
;;  (lsp-mode . " LSP ") 
;;;;  (java-mode . "J♥") 
;;; )
;; to remove Wrap in mode-line
;;  (visual-line-mode  ."") 
;;;;;;  "Alist for `my-clean-mode-line'.
;;;;;When you add a new element to the alist, keep in mind that you
;;;;;must pass the correct minor/major mode symbol and a string you
;;;;;want to use in the modeline *in lieu of* the original.")
;;;;;
;;;;;;; end of devar my-mode-line-cleaner-alist
;;
;;
;;
;; M-x my-clean-mode-line for clean above list   my-mode-line-cleaner-alist 
;;
;;;;;
;;;;;;  (defun my-clean-mode-line ()
;;;;;;    (interactive)
;;;;;;    (loop for cleaner in my-mode-line-cleaner-alist
;;;;;;          do (let* ((mode (car cleaner))
;;;;;;                   (mode-str (cdr cleaner))
;;;;;;                   (old-mode-str (cdr (assq mode minor-mode-alist))))
;;;;;;               (when old-mode-str
;;;;;;                   (setcar old-mode-str mode-str))
;;;;;;                 ;; major mode
;;;;;;               (when (eq mode major-mode)
;;;;;;                 (setq mode-name mode-str)))))
;;;;;;  
;;;;;;  ;xxxxx;;;;; (add-hook 'after-change-major-mode-hook 'my-clean-mode-line)
;;;;;;  ;;  after-change-major-mode-hook ===> my-clean-mode-line ==> my-mode-line-cleaner-alist

;;;;;;;;;;;;;;;;;;;;;;;; end of  clean mode-line ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;


;; when using M-x replace-string 
;; if  case-replace  true   change it to false, 
;; if  case-replace  false  change it to true 
;; when case-replace is true 
;; M-x replace-string will be emacs Emacs EMACS  => gnu Gun GNU 
;; when case-replace is false
;; M-x replace-string will be emacs Emacs EMACS  => gnu gnu gnu
(defun my-toggle-case-replace ()
(interactive)
(if (eq case-replace  nil)
    (setq case-replace t)
  (setq case-replace nil))
(message "case-replace status is %s" case-replace)
)
;;; or use M-x set-variable  case-replace t or nil from -learning gun emacs- chm  book

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; old
;; all my-radio channels in 
;; https://directory.shoutcast.com/
;; work under emms in emacs 
;;  (defun my-radio()
;;    "Prompt user to choice from a my-radio list."
;;    (interactive)
;;    (let ((channels '(
;; "http://184.173.185.71:9958  الحصري"
;; "http://184.173.185.71:9978  المنشاوي"
;; "http://104.238.193.114:7048  قناة-حياة"
;; "http://184.173.185.71:8008  احمد العجمي"
;; "http://69.12.70.159:8000  اناشيد"
;;  )))
;; (emms-play-url   (ido-completing-read "radio:"  channels))))


;; my-radio by nested list (associated list)
;; (mapcar #'car channels) ==> return all keys as list ("husary" "minshaway" "hayatFM" "Ahmed"  "Songs")
;; (cdr (assoc "husary" channels))  ==> return ip (value) for husary
;; (ido-completing-read "radio:" list ) ==> must be list not not  associated list(nested list) as below
;; wow radio2 work 
;; all my-radio channels in  https://directory.shoutcast.com/ then select file .xspf(with domain)  not not not m3u(ip without domain))
;; 
;; husary
;; 
(defun my-radio()
   "Prompt user to choice from a my-radio list."
   (interactive)
   (let ((channels '(
("husary" . "https://server03.quran.com.kw:7007")
("minshaway" . "http://live.mp3quran.net:9978")
("minshaway_husary" . "http://server2.quraan.us:9918") ;; minshawy and husary
("hayatFM"   . "http://104.194.9.142:8302")
("huthefy1"    .  "http://92.222.103.14:8005")
("huthefy2"    .  "http://176.31.140.226:8005")
("music"    .  "http://23.82.11.88:3228") ;; CALM RADIO - CHRISTIAN INSTRUMENTALS
);; end of channels
))
(emms-play-url (cdr (assoc (ido-completing-read "radio:" (mapcar #'car channels)) channels)))
);; end of let
)
;; M-x stop ;; close the radio


;; stop synchronized file editing by stop  .#file--> user@cpu-id , and ask about lock file , 
;;
;; this message appear when two user try to edit file,
;; this file locked for user s,p,q  s=steal locks   p = proceed to your own, q=quit
;; (setq create-lockfiles t) ;; default
;;
;; this message appear when two user try to edit file.txt, 
;; file.txt has changed since visited or saved. save anyway ? y or no
(setq create-lockfiles nil)

;; emacs performance
;; emacs performance
;; emacs performance
;; https://emacs-lsp.github.io/lsp-mode/page/performance/
;;  
;; increase emacs stack 
;; reduce frequency of garbage collections
;; Set it to big number(100mb) like most of the popular starter 
    (setq gc-cons-threshold 100000000)
 ;; increase the amount of data which Emacs reads from the process.
    (setq read-process-output-max  (* 1024 1024)) ;; 1mb , the original is 4096 byte, 4kb Maximum number of bytes to read from subprocess in a single chunk.
 ;; Make sure that you are using company-capf as the completion provider with:
    (setq lsp-completion-provider :capf)

;; ;; Optional: fine-tune lsp-idle-delay. This variable determines how often lsp-mode will refresh the highlights, lenses, links, etc while you type.
;;    (setq lsp-idle-delay  0.500) ;; the default value

;; set max variable bindings
   (setq max-specpdl-size  400000)
;; set max eval depth
   (setq max-lisp-eval-depth 300000)
;; set max message log size
   (setq message-log-max 1000) ;; Maximum number of lines to keep in the message log buffer.
;; set max history list size
   (setq history-length 1000)
;; remove duplicates from history lists
   (setq history-delete-duplicates t)      
;; warn me  when opening files bigger than 30MB
   (setq large-file-warning-threshold 30000000)



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;


;; put it in  emacs_config
;; trailing whitespace is the space at the end lines
;; delete trailing whitespace of region without select the region
;; it is better than use M-\ or M-SPC
;;
;; if no selected region then delete trailing whitespace of current region without select the region (current pragraph),
;; if selected region then delete the trailing-whitespace at the selected region only
;;
(defun my-delete-trailing-whitespace-of-region ()
"if no selected region then delete trailing whitespace of current region without select the region, if selected region then delete the trailing-whitespace at the selected region only "
(interactive)
(if (eq mark-active nil)
;;;; if true condition
(progn
(save-excursion
(mark-paragraph)  ;; M-h
(call-interactively 'delete-trailing-whitespace) ;; delete white spaces at end lines
(setq deactivate-mark t) ;; deactivate mark region
);; end save-excursion
);; end first progn
;;;; if else condition
(progn
(save-excursion
(call-interactively 'delete-trailing-whitespace) ;; delete white spaces at end lines
(setq deactivate-mark t) ;; deactivate mark region
);; end save-excursion
);; end second progn
);; end if
)  ;; end defun
                          
(defalias 'ts 'my-delete-trailing-whitespace-of-region)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;
;;"just type c-\\ to toggle direction and input-method (arabic and english)"
;;

;; default is dynamic according to paragraph (nil)
;; put it in the above custom-set-variables
;;(setq bidi-paragraph-direction 'left-to-right)


(defun my-toggle-bidi-direction-and-input-method ()
"just type c-\\ to toggle direction and input-method (arabic and english)"
(interactive)
(if (eq bidi-paragraph-direction 'left-to-right)
    ;; if english change it to  arabic
    (progn 
      (set-input-method "arabic")
      (setq bidi-paragraph-direction 'right-to-left)
     )
   ;; if arabic change it to nil(english as default)
   (progn 
      ;;(call-interactively 'toggle-input-method)
      (set-input-method nil) ;; default is english 
      (setq bidi-paragraph-direction 'left-to-right)
    ))
 )  ;; end defun

;; default key c-\  toggle-input-method
(global-set-key (kbd "C-\\")   'my-toggle-bidi-direction-and-input-method)


;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; sleep for seconds use it with macro
;; (sit-for) use it with elisp
(defun my-sleep (second)
  (interactive
   (list
    (read-number "second: ")
    ))
  (sleep-for second)
)






;;;;;;;;;;;;;;;;;;;;;;; code formatting ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; [old]
;; [old], it is for java only, so i install format-all.el for all languages like java,web,sql
;;  jdee format code 
;;  clang-format jdee format code like eclipse 
;;  apt-get install clang-format
;;  https://clang.llvm.org/docs/ClangFormatStyleOptions.html
;;
;; .clang-format file  config to format code example
;; if i use style option, no need to determine .clang-format, because every style is have its own .clang-format
;; clang-format --style=llvm -dump-config > .clang-format
;;
;; apt-get install clang-format then clang-format.el will be in /usr/share/emacs/site-lisp/ because clang-format worked with clang, or the same file(clang-format.el) in elpa just M-x list-packages,
;; or just M-x list-packages then install clang-format
;; [old]   (load "/usr/share/emacs/site-lisp/clang-format-7/clang-format.el");; just M-x list-packages clang-format 
;;
;;;;; uncomment to run it ;;;;;;;;;  (global-set-key (kbd "C-x ps") 'clang-format-buffer)
;;
;; the default is "file" (means looking for .clang-format in current/up direcotory), but if i use (LLVM, Google, Chromium, Mozilla, WebKit) then will not looking for .clang-format in directory
;;;;; uncomment to run it ;;;;;;;;; (setq-default  clang-format-style "Chromium") ;;the option are   LLVM, Google, Chromium, Mozilla, WebKit, or file =(then will looking for .clang-format in up/current-direcotory from buffer code)
;; setq-default to set variable  as local buffer



;; 
;; [new]
;; [new]
;; format-all.el 
;; format-all java,web,sql,and all languages bly format-all.el
;;
;; apt-get install clang-format  # format jdee-mode c,java 
;; apt-get install npm 
;; npm install --global prettier # format web-mode,html-mode html,css,js,json
;; apt-get install sqlformat     # format sql-mode sql 
;;
;; there is more formatter for all languages, just install programmes(read format-all.el)
;; 
;; (prettier) JavaScript/JSON/JSX/CSS/Less/SCSS ==> web-modejs-mode js2-mode js3-mode,json-mode,css-mode,scss-mode,less-css-mode,
;; (tidy)      HTML/XHTML/XML                   ==> web-mode
;; (sqlformat) SQL                              ==> sql-mode
;; (clang-format) c,java                        ==> jdee-mode
;;
;; there is more formatter for all languages, just install programmes(read format-all.el)
;;
;;
;; format all languages like (java,web,sql, and more by one command) 
;; read the file format-all.el to see all languages and programmes 
    (global-set-key (kbd "C-x ps") 'format-all-buffer)
;;
;;



;;;;;;;;;;;;;;;;;;;;;;; end of code formatting ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; toggle 2 windows from/to horizontal from/to vertical
;; M-x vh    ==> vertical horizental
    (defun my-window-split-toggle ()
      "Toggle between horizontal and vertical split with two windows."
      (interactive)
      (if (> (length (window-list)) 2)
          (error "Can't toggle with more than 2 windows!")
        (let ((func (if (window-full-height-p)
                        #'split-window-vertically
                      #'split-window-horizontally)))
          (delete-other-windows-internal)
          (funcall func)
          (save-selected-window
            (other-window 1)
            (switch-to-buffer (other-buffer))))))

(defalias 'vh  'my-window-split-toggle)


;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;



;;;;;;;;;;;;;;;;; my battery checker ;;;;;;;;;;;;;;;;;;;;;;;;
;;;;;;;;;;;;;;;;; my battery checker ;;;;;;;;;;;;;;;;;;;;;;;;

;;;;;;;;;;;;;;;;;   (require 'battery)
;;;;;;;;;;;;;;;;;   
;;;;;;;;;;;;;;;;;   (setq *my-battery-checker-stop-checking* nil)  ;; put it t to stop my-battery-checker
;;;;;;;;;;;;;;;;;   (setq battery-load-critical 15)    ;; when 10 percentage show the warrning and read the massages below
;;;;;;;;;;;;;;;;;   
;;;;;;;;;;;;;;;;;   (defun my-battery-checker ()
;;;;;;;;;;;;;;;;;     (interactive)
;;;;;;;;;;;;;;;;;     (when (and (string-equal (cdr (assoc 66 (battery-linux-sysfs))) "Discharging")
;;;;;;;;;;;;;;;;;             (not *my-battery-checker-stop-checking*)
;;;;;;;;;;;;;;;;;             (< (string-to-number (cdr (assoc 112 (battery-linux-sysfs))))
;;;;;;;;;;;;;;;;;                battery-load-critical)) ;; 10 percentage
;;;;;;;;;;;;;;;;;    (progn
;;;;;;;;;;;;;;;;;    (shell-command  (concat " echo \"Battery WARNING, Battery WARNING, Battery WARNING, Battery WARNING, Battery WARNING \" | festival --tts" ))
;;;;;;;;;;;;;;;;;    (shell-command  (concat " xmessage -center Battery WARNING, Battery WARNING, Battery WARNING, Battery WARNING, Battery WARNING          " ))
;;;;;;;;;;;;;;;;;    )
;;;;;;;;;;;;;;;;;    ) ;; end of when
;;;;;;;;;;;;;;;;;
;;;;;;;;;;;;;;;;;       ;; 
;;;;;;;;;;;;;;;;;       ;; battery.txt log file for battery percentage, 
;;;;;;;;;;;;;;;;;       ;;                                           date = 2019-09-02 time = 08:32:25   battery percentage = 30.8
;;;;;;;;;;;;;;;;;     ;;     (write-region (concat  (format-time-string " date = %Y-%m-%d time = %T  ")  " battery percentage = " (cdr (assoc 112 (battery-linux-sysfs))) "\n" )  nil  "/home/battery.txt" t)
;;;;;;;;;;;;;;;;;       ;;
;;;;;;;;;;;;;;;;;       ;;
;;;;;;;;;;;;;;;;;  ) ;; end of the function my-battery-checker
;;;;;;;;;;;;;;;;;
;;;;;;;;;;;;;;;;;
;;;;;;;;;;;;;;;;;   ;; repeat every 4 minutes
;;;;;;;;;;;;;;;;;      (run-with-timer 0 (* 4 60) 'my-battery-checker)   ;; call function my-battery-checker  every 4 minutes
;;;;;;;;;;;;;;;;;   ;; (run-with-timer SECS REPEAT FUNCTION &rest ARGS)  ;; repeat every five minutes, zero seconds, run the function  my-battery-checker
;;;;;;;;;;;;;;;;;
;;;;;;;;;;;;;;;;;   ;; (when (true) (do these messags)  do-every-time)
;;;;;;;;;;;;;;;;;   ;;
;;;;;;;;;;;;;;;;;   ;; (when (= 1 1)
;;;;;;;;;;;;;;;;;   ;;  progn( (message "bye1")
;;;;;;;;;;;;;;;;;   ;;         (message "bye2")
;;;;;;;;;;;;;;;;;   ;;         (message "bye3")))
;;;;;;;;;;;;;;;;;   ;;
;;;;;;;;;;;;;;;;;
;;;;;;;;;;;;;;;;;
;;;;;;;;;;;;;;;;;  ;;  (battery-linux-sysfs) c-x c-e 
;;;;;;;;;;;;;;;;;  ;;  ((99 . "956636.7425456877")
;;;;;;;;;;;;;;;;;  ;;   (114 . "17.4")
;;;;;;;;;;;;;;;;;  ;;   (109 . "45")
;;;;;;;;;;;;;;;;;  ;;   (104 . "0")
;;;;;;;;;;;;;;;;;  ;;   (116 . "0:45")
;;;;;;;;;;;;;;;;;  ;;   (100 . "N/A")
;;;;;;;;;;;;;;;;;  ;;   (66 . "Charging")
;;;;;;;;;;;;;;;;;  ;;   (112 . "47.4")  ==> look at this battery percentage
;;;;;;;;;;;;;;;;;  ;;   (76 . "N/A"))
;;;;;;;;;;;;;;;;;
;;;;;;;;;;;;;;;;;

;;;;;;;;;;;;;;;;; end of  my battery checker ;;;;;;;;;;;;;;;;;;;;;;;;
;;;;;;;;;;;;;;;;; end of  my battery checker ;;;;;;;;;;;;;;;;;;;;;;;;



;;;;;;;;;;;;;;;;; my battery checker ;;;;;;;;;;;;;;;;;;;;;;;;
;;;;;;;;;;;;;;;;; my battery checker ;;;;;;;;;;;;;;;;;;;;;;;;


   (require 'battery)
   
   (setq *my-battery-checker-stop-checking* nil)  ;; put it t to stop my-battery-checker
   (setq battery-load-critical 15)    ;; when 15 percentage show the warrning and read the massages below
   
   (defun my-battery-checker ()
     (interactive)
     (when (and (string-equal (cdr (assoc 66 (battery-linux-sysfs))) "Discharging")
             (not *my-battery-checker-stop-checking*)
             (< (string-to-number (cdr (assoc 112 (battery-linux-sysfs))))
                battery-load-critical)) ;; 10 percentage
    (progn
    (shell-command  (concat " echo \"Battery WARNING, Battery WARNING, Battery WARNING, Battery WARNING, Battery WARNING \" | festival --tts" ))
    (shell-command  (concat " xmessage -center Battery WARNING, Battery WARNING, Battery WARNING, Battery WARNING, Battery WARNING          " ))
    )
    ) ;; end of when

       ;; 
       ;; battery.txt log file for battery percentage, 
       ;;                                           date = 2019-09-02 time = 08:32:25   battery percentage = 30.8
;;;;;;;; (write-region (concat  (format-time-string " date = %Y-%m-%d time = %T  ")  " battery percentage = " (cdr (assoc 112 (battery-linux-sysfs))) "\n" )  nil  "/home/battery.txt" t)
       ;;
       ;;
  ) ;; end of the function my-battery-checker


   ;; repeat every 5 minutes
      (run-with-timer 0 (* 5 60) 'my-battery-checker)   ;; call function my-battery-checker  every 4 minutes
   ;; (run-with-timer SECS REPEAT FUNCTION &rest ARGS)  ;; repeat every five minutes, zero seconds, run the function  my-battery-checker

   ;; (when (true) (do these messags)  do-every-time)
   ;;
   ;; (when (= 1 1)
   ;;  progn( (message "bye1")
   ;;         (message "bye2")
   ;;         (message "bye3")))
   ;;


  ;;  (battery-linux-sysfs) c-x c-e 
  ;;  ((99 . "956636.7425456877")
  ;;   (114 . "17.4")
  ;;   (109 . "45")
  ;;   (104 . "0")
  ;;   (116 . "0:45")
  ;;   (100 . "N/A")
  ;;   (66 . "Charging")
  ;;   (112 . "47.4")  ==> look at this battery percentage
  ;;   (76 . "N/A"))




;;;;;;;;;;;;;;;;; end of  my battery checker ;;;;;;;;;;;;;;;;;;;;;;;;
;;;;;;;;;;;;;;;;; end of  my battery checker ;;;;;;;;;;;;;;;;;;;;;;;;








;; [[ very important when update ]]
;; [[ very important when update ]]
;; [[ very important when update ]]
;; 
;; 
;; 0- apt-get update ;; not update packages, 
;;    apt-get   build-dep emacs ;; will upgrade emacs dependents packages, remove apparmor clipit [apt-get remove  apparmor clipit], stop cron [systemctl disable cron]
;;    sudo unattended-upgrade -d --dry-run ;; check if  there is any Security Updates are available in Debian/Ubuntu
;;    sudo unattended-upgrade -d           ;; install available Security Updates in Debian/Ubuntu 
;;    apt-get install openjdk-11-jdk openjdk-11-doc  	openjdk-11-source then restart computer
;;    aptitude reinstall emacs  ;; will upgrade emacs
;;    M-x list-packages  U update packages 
;; update emacs packages in ~/.emacs.d/elpa/ and plugins when change emacs version then compile it B,
;; because the .elc work with emacs version only
;; 
;; in hi.txt put
;;
;; (setq package-archives
;;    (quote
;;     (("gnu" . "https://elpa.gnu.org/packages/")
;;      ("melpa" . "https://melpa.org/packages/")
;;      ("marmalade" . "https://marmalade-repo.org/packages/")
;;      )))
;; (package-reinstall   'package)
;; (package-reinstall   'package)
;; (package-reinstall   'package)
;; all packages like this 
;;
;; then recompile plugin folder


;; [old]
;; 1- up( look at 0- )
;;    in jdee-find.el in this function (defun jdee-find-grep-internal) add --color to grep then B byte it
;;     (format "find %s %s -type f | xargs grep --color  %s %s -n \"%s\" /dev/null"
;;
;;
;; note:- the second way is to override function  using (require 'jdee-find) then override (defun jdee-find-grep-internal) in jdee-find.el  in .emacs

;; [old]
;; 2- no need, because i added  it to (defun my-jdee-import-all () above 
;; (save-excursion) return to original cursor position. after update package name in jdee-package.el in (defun jdee-package-update ()
;; /root/.emacs.d/elpa/jdee-20180711.2036/ jdee-package.el
;; add (save-excursion) to (defun jdee-package-update () in jdee-package
;; then B byte it 
;;;;;  (save-excursion
;;;;;        (goto-char (point-min))
;;;;;        (if (re-search-forward jdee-package-package-regexp nil t)
;;;;;  	  (replace-match package)
;;;;;  	(insert package)
;;;;;  	(newline))
;;;;;  ) ;; end of save-excursion
;;;;;  ))) 
;;;;;
;;;;;
;;;;; ;; note:- the second way is to override function using  (require 'jdee-package)  then override (defun jdee-package-update())  in .emacs
;;;;;

;;;
;;; 3- in emmet-mode.el ==> (defun emmet-preview (beg end) ==> remove the tip like this  (info (propertize "" 


;; 4- press B to change it to binary
;; /usr/share/emacs/site-lisp/festival.el


;; [old]
;; 5- change two lines in   /root/.emacs.d/elpa/format-all-20190408.1319/format-all.el
;;    look at (change this line) ====> then press B (build)
;;    look at (change this line) ====> then press B (build)
;;
;;     (define-format-all-formatter clang-format
;;       (:executable "clang-format")
;;       (:install (linux "apt-get  install clang-format"))
;;       (:modes
;;        (c-mode ".c")
;;        (c++-mode ".cpp")
;;(change this line)====>        (jdee-mode ".java")
;;        (objc-mode ".m")
;;        (protobuf-mode ".proto"))
;;       (:format
;;        (format-all-buffer-easy
;;         executable
;;(add this line)==>      "-style={BasedOnStyle: Chromium,AlignConsecutiveAssignments: true}"
;;     ;;  "-style=Google"
;;     ;;  notes for Ahmed :-command-line clang-format with argument  style=file this is the default, so it will looking for .clang-foramt in current/up directories, waste cpu time,so i change it to -style=Chromium, 
;;         (let ((assume-filename (or (buffer-file-name) mode-result)))
;;           (when assume-filename (concat "-assume-filename=" assume-filename)))
;;     )))
;; can add many style options  -style='{key1: value1, key2: value2, ...}'
;; https://clang.llvm.org/docs/ClangFormatStyleOptions.html
;;
;;
;; it will be like this 
;; (define-format-all-formatter clang-format
;;   (:executable "clang-format")
;;   (:install (macos "brew install clang-format"))
;;   (:modes
;;    (c-mode ".c")
;;    (c++-mode ".cpp")
;;    (jdee-mode ".java")
;;    (objc-mode ".m")
;;    (protobuf-mode ".proto"))
;;   (:format
;;    (format-all-buffer-easy
;;     executable
;;       "-style={BasedOnStyle: Chromium,AlignConsecutiveAssignments: true}"
;;     (let ((assume-filename (or (buffer-file-name) mode-result)))
;;       (when assume-filename (concat "-assume-filename=" assume-filename))))))

;; [old]
;; 6-
;; dap-java-test-runner  variable location is wrong in dap-java.el look at word ==>> .jar
;; [very important note]  location of junit-platform-console-standalone.jar  is wrong  in dap-java.el
;;   fix it by 
;; [change it like this]  ===>> (expand-file-name (locate-user-emacs-file "eclipse.jdt.ls/server/test-runner/junit-platform-console-standalone.jar"))
;; [change the date]      ===>> (load "~/.emacs.d/elpa/dap-mode-20190722.1641/dap-java")
;;  then press B to change it to Byte code 



;; 7- [old]
;; for lsp-html 
;; when update update this one
;; remove then update
;; npm uninstall -g  vscode-html-languageserver-bin
;; npm install   -g  vscode-html-languageserver-bin
;; the result is /usr/local/bin/html-languageserver -> /usr/local/lib/node_modules/vscode-html-languageserver-bin/htmlServerMain.js
;;
;; [new]
;; [new]
;;  the new is M-x lsp-install-server  html-ls

;; 8- old
;; for lsp-xml
;; when update update this one
;; update this when update system
;; temp java xsd in ~/.lsp4xml/cache ==> list all used xsd files for xml validate and help 
;; mkdir ~/.emacs.d/lsp4xml/
;; remove then update
;; rm  ~/.emacs.d/lsp4xml/org.eclipse.lsp4xml-0.3.0-uber.jar
;; wget https://github.com/angelozerr/lsp4xml/releases/download/0.3.0/org.eclipse.lsp4xml-0.3.0-uber.jar   -O  ~/.emacs.d/lsp4xml/org.eclipse.lsp4xml-0.3.0-uber.jar
;;  lsp4xml.jar is deprecated
;; the new verison 	   /home/ahmad/.emacs.d/.cache/lsp/xmlls/org.eclipse.lemminx-0.13.1-uber.jar
;;  will be download automatically M-x lsp-install-server xmlls in ~/.emacs.d/.cache/lsp/xmlls


;; 9- 
;; for lsp
;; this will update eclipse jdt ls 
;; remove server then update, this will fix the error  (( error Unable to find single point of entry ))
;; rm -rf /root/.emacs.d/eclipse.jdt.ls/server
;; M-x lsp-java-update-server
;; if not work remove repository ~/.m2

;; 10-
;;  M-x my-cleaner-lsp-temp will remove these folders and files 
;;  remove ~/.emacs.d/workspace/       ;; remove it when no c-j work
;;  remove ~/.emacs.d/.lsp-session-v1  ;; this will duplicate projects 
;;  remove /root/.emacs.d/.cache/treemacs-persist  ;; this will view old project in treemacs
;;

;; [old]
;;  11-
;;  lsp-java.el  M-x lsp-java-spring-initializr => 
;;   ;; comment this line ==> (url-copy-file download-url temp-file t)
;;   ;; substitute (url-copy-file) by
;;   (shell-command (format "wget  -O  %s  '%s'  " temp-file download-url))
;;   or  or or by
;;   (shell-command (format "curl  -o  %s  '%s' " temp-file download-url))




;; [[ end of  very important when update ]]
;; [[ end of  very important when update ]]
;; [[ end of  very important when update ]]


;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
          


;;;;;;;;;;;;;;;;;;;;;;;;; start  lsp java ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;;;;;;;;;;;;;;;;;;;;;;;; start  lsp java ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;;;;;;;;;;;;;;;;;;;;;;;; start  lsp java ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; note:-  change lsp-mode java-mode by lsp variables           


;;(add-hook 'nxml-mode-hook #'lsp)
;;(add-hook 'java-mode-hook 'company-mode)  ;;; to complete as menu c-.
;;;;(add-hook 'java-mode-hook 'flycheck-mode) ;; the variable (setq lsp-prefer-flymake nil)  and  variable ==> (setq lsp-ui-flycheck-enable t) is the correct way 
;;;;(add-hook 'java-mode-hook 'flymake-mode-off)   ;; also flymake-mode-off[old] above load(filemake) and jdee
;; (add-hook 'java-mode-hook 'hs-minor-mode) ;; open java first then open hs-minor mode  ;; C-c @ C-c or just M-x hs-minor then c-c @ c-c to hide then c-c @ c-c to show

;;;;  (add-hook 'java-mode-hook
;;;;  	  (lambda() 
;;;;     (flycheck-mode t)
;;;;     (flymake-mode -1)
;;;;     (setq flymake-mode nil)
;;;;  ))
;;
;;     (add-hook  'lsp-mode-hook 
;;       (lambda()
;;       (jdee-mode -1)
;;       (flymake-mode -1)  ;; the correct way is  ( flymake-mode-off [old] )
;;     ))






;;(push 'company-lsp company-backends) ;; put it by use-package

;; (add-hook 'lsp-mode-hook 'lsp-ui-mode)

;;      
;;      
;;      ;; You may remap xref-find-{definitions,references} (bound to M-. M-? by default):
;;       (define-key lsp-ui-mode-map [remap xref-find-definitions] #'lsp-ui-peek-find-definitions)
;;       (define-key lsp-ui-mode-map [remap xref-find-references] #'lsp-ui-peek-find-references)
;;      
;;      ;; There is a window-local jump list dedicated to cross references:
;;      ;; (lsp-ui-peek-jump-backward)
;;      ;; (lsp-ui-peek-jump-forward)


;;;     ;; to conifig use-package visit ==>> https://jwiegley.github.io/use-package/keywords/
;;;  (use-package nxml
;;;  ;;  :init
;;;    :hook (
;;;  	 (nxml-mode   . lsp-mode)
;;;  	 (nxml-mode   . lsp)
;;;  	 )
;;;  ;;   :bind (
;;;  ;;           :map nxml-mode-map  ;; after this line are local keys 
;;;  ;; 	     ("\C-c\C-v" . nil) ;; the stop key, not the command M-x rng-validate-mode at        /usr/share/emacs/26.1/lisp/nxml/rng-nxml.el.gz
;;;  ;;           ("\C-c\C-d" . nil) ;; the stop key, not the command M-x nxml-dynamic-markup-word at /usr/share/emacs/26.1/lisp/nxml/nxml-mode.el.gz
;;;  ;;           )
;;;  ;;   :config
;;;  ) ;; end of use-package nxml

;; as above  (add-to-list 'auto-mode-alist '("\\.html?\\'" . web-mode)) 
;; as above (add-to-list 'auto-mode-alist '("\\.as[cp]x\\'" . web-mode))
;; as above (add-to-list 'auto-mode-alist '("\\.jsp\\'" . web-mode))
;; 
;; when update update this one
;; npm install -g  vscode-html-languageserver-bin
;;;;  (use-package web-mode
;;;;  ;;  :init
;;;;    :hook (
;;;;  	 (web-mode   . lsp-mode)
;;;;  	 (web-mode   . lsp)
;;;;  	 )
;;;;  ;;   :bind (
;;;;  ;;           :map nxml-mode-map  ;; after this line are local keys 
;;;;  ;; 	     ("\C-c\C-v" . nil) ;; the stop key, not the command M-x rng-validate-mode at        /usr/share/emacs/26.1/lisp/nxml/rng-nxml.el.gz
;;;;  ;;           ("\C-c\C-d" . nil) ;; the stop key, not the command M-x nxml-dynamic-markup-word at /usr/share/emacs/26.1/lisp/nxml/nxml-mode.el.gz
;;;;  ;;           )
;;;;  
;;;;  ;;   :config
;;;;  ) ;; end of use-package nxml




;; when update update this one
;; update this when update system
;; mkdir ~/.emacs.d/lsp4xml/
;; wget https://github.com/angelozerr/lsp4xml/releases/download/0.3.0/org.eclipse.lsp4xml-0.3.0-uber.jar   -O  ~/.emacs.d/lsp4xml/org.eclipse.lsp4xml-0.3.0-uber.jar
;; lsp4xml.jar is deprecated

;;(require 'company-lsp) ;;;;;;; solve this error by comment this line  LSP :: `company-lsp` is not supported anymore. Using `company-capf` as the `lsp-completion-provider`.
(require 'lsp-mode)
(require 'lsp-ui)
(require 'lsp-java)
(require 'lsp-java-boot)
(require 'treemacs)
(require 'lsp-treemacs)
(require 'dap-mode)
(require 'dap-java)
(require 'dap-ui)
(require 'company)
(require 'web-mode)
(require 'nxml-mode)
(require 'imenus)
(require 'fiplr)
(require 'lsp-ido)


(use-package lsp-mode
;; Use the :init keyword to execute code before a package is loaded. 
  :init 
     (setq   lsp-response-timeout 80
             lsp-tcp-connection-timeout 80
	     lsp-prefer-flymake nil
;;;;;        lsp-xml-jar-file "/home/ahmad/.emacs.d/lsp4xml/org.eclipse.lemminx-uber.jar"      ;; automatically download xmlls here   /home/ahmad/.emacs.d/.cache/lsp/xmlls/org.eclipse.lemminx-0.13.1-uber.jar
	     lsp-treemacs-sync-mode 1 ;; To enable bidirectional synchronization of lsp workspace folders and treemacs projects.
             lsp-java-boot-enabled nil  ;; toggle it by M-x my-boot, to shutdown server by M-x lsp-workspace-shutdown ls-boot,jdtls,xmlls
	     )
  :bind (
         :map lsp-mode-map  ;; after this line are local keys 
         ("C-2 r"        .  lsp-rename)  ;; lsp-rename ==> rename local var
         ("C-c C-d C-j"    .  imenus) ;;local  like c-(squre step function) in eclipse ; M-x imenus-rescan to refresh or use C-l, fast jump to methods variables
	 ("C-c C-d f"    .  lsp-format-buffer) ;; format code or use another command  c-x ps 
	 ("C-c C-v C-w"  .  lsp-describe-thing-at-point)  ;; visit web javadoc, c-c c-v c-w  doc childframe
	 ("C-c C-v k"    .  lsp-restart-workspace)  ;; M-x lsp-restart-workspace
         ("C-c C-v l"    .  treemacs) ;; view project as tree which in file /root/.emacs.d/.cache/treemacs-persist
         ("C-c C-v C-l"  .  lsp-treemacs-java-deps-list)   ;; view project as tree, view dependents, (r g) to refresh, (q) close java file, which in file /root/emacs.d/.lsp-session-v1
         ("C-c C-v C-f"  .  lsp-treemacs-java-deps-follow) ;; in java editor, view treemacs java file location as tree, use c-c c-v c-l then  c-x o then c-c c-v c-f
	 ("C-c C-v C-r"  .  lsp-treemacs-errors-list)  ;; (x) fix , (=) hide warning, c-2 or x , (r) refresh, C-c C-v r list errors as list faster than this one
         ("C-c C-v C-m"  .  lsp-treemacs-references )     ;; M-?  find referense and sort it as tree, same as C-c C-v m
         ("C-c C-v m"    .  lsp-find-references) ;; M-?  find referense and sort it as list 
         ("C-c s"        .  pop-tag-mark)
         ("C-c J"        .  lsp-find-implementation) ;; C-c shift-j ;; M-x lsp-find-implementation     ==>  who is implement this interface 
         ("C-c C-j"      .  lsp-treemacs-implementations) ;; same as c-c J but as tree
         ("C-c M-j"      .  lsp-treemacs-call-hierarchy) ;; same as c-c c-j but as tree, With a prefix argument, show the outgoing call hierarchy.
         ("C-2 c"        .  lsp-execute-code-action) ;; c-2 c [eclipse Shift+Alt+S O]  ==> lsp-execute-code-action [c-j to run] ;; generate constroctors with argument, and toString,hashcode,getters,setters, or  use helm-lsp(M-x helm-mode then c-2 c then select by ctrl-space then enter )
         ("C-c C-d s"    .  lsp-execute-code-action) ;; c-2 c [eclipse Shift+Alt+S O]  ==> lsp-execute-code-action [c-j to run] ;; generate constroctors with argument, and toString,hashcode,getters,setters, or  use helm-lsp(M-x helm-mode then c-2 c then select by ctrl-space then enter )
         ("C-c C-d C-s"  .  lsp-execute-code-action) ;; c-2 c [eclipse Shift+Alt+S O]  ==> lsp-execute-code-action [c-j to run] ;; generate constroctors with argument, and toString,hashcode,getters,setters, or  use helm-lsp(M-x helm-mode then c-2 c then select by ctrl-space then enter )
	 ("C-c SPC n"    .  lsp-ido-workspace-symbol) ;; (require 'lsp-ido) enter @+ @/ @> @ in spring server
         :map  lsp-treemacs-error-list-mode-map
         ("C-2"          .  lsp-treemacs-quick-fix)  ;; C-2 after C-c C-v C-r  or just use    x (fix)  = (warn/error/info)  r (refresh)
	 :map  nxml-mode-map    ;; (very important notes) ==>if match global keys with local keys,use-package will drop both,
         ("\C-c\C-d"   .  nil)  ;; nxml-dynamic-markup-word, so i can see the global keys in nxml-mode like c-c c-d s, c-c c-d c-n
         ("\C-c\C-v"   .  nil)  ;; nxml-dynamic-markup-word, so i can see the global keys in nxml-mode like c-c c-d s, c-c c-d c-n
	 :map  web-mode-map     ;; (very important notes) ==>if match global keys with local keys,use-package will drop both,
         ("\C-c\C-d"   .  nil)  ;; nxml-dynamic-markup-word, so i can see the global keys in web-mode like c-c c-d s, c-c c-d c-n
         ("\C-c\C-v"   .  nil)  ;; nxml-dynamic-markup-word, so i can see the global keys in web-mode like c-c c-d s, c-c c-d c-n
         :map imenus-minibuffer-map
	 ("C-l"       .  imenus-rescan) ;; from imenus.el, the default key is M-r,
         ) ;; end of maps

  :hook (
	 ((conf-javaprop-mode nxml-mode web-mode java-mode) . lsp)   ;;; (file.properties ==> conf-javaprop-mode)   (jsp,html,as[cp]x ==> web-mode)  
	 (lsp-mode                       . company-mode)
	 (lsp-mode                       . lsp-dired-mode)           ;; when lsp-mode run then run lsp-dired-mode (for dired colors green red yellow)
;;	 (lsp-mode                       . lsp-lens-mode)            ;; optional to add the lens
;;	 (java-mode                      . lsp-java-boot-lens-mode ) ;; optional to add the lens

	 )
);; end of  use-package	 lsp-mode


;; the correct way to enable flycheck and disable flymake in lsp-mode
(use-package lsp-ui
 :init
 (setq  lsp-ui-flycheck-enable t
        lsp-ui-doc-mode nil
	lsp-ui-doc-enable nil
        lsp-ui-sideline-enable nil
	lsp-ui-doc-max-height  20
	lsp-ui-doc-max-width   50
	lsp-ui-doc-position  'bottom
	lsp-ui-doc-delay 0.2
        lsp-ui-doc-include-signature  t
	lsp-ui-doc-use-webkit nil    
	)
  :bind (:map lsp-ui-mode-map  ;; after this line are local keys 
         ("C-c C-v r"      . lsp-ui-flycheck-list) ;; same as C-c C-v C-r lsp-treemacs-errors-list  but list errors as list
	 ("C-c C-v C-S-w"  .  my-toggle-lsp-ui-doc-show-and-hide)  ;; hide/show web javadoc C-c C-v C-Shift-w 
	 ("C-c C-v w"      .  lsp-signature-toggle-full-docs)  ;; hide/show web javadoc C-c C-v C-Shift-w , view overloading  methods docs by (M-n/p)
         ("C-c C-d j"    .  lsp-ui-imenu)  ;;local  like c-(square step function) in eclipse ; M-x imenus-rescan to refresh, fast jump to methods variables
         ("C-c C-d C-S-f"  .  lsp-ui-find-workspace-symbol) ;; c-c c-d c-F search inside ~/.emacs.d/workspace not works as expected, but c-c c-d f(format code), c-c c-d c-f my-lsp-find-in-project-as-grep
         ("C-c C-v n"      .  lsp-ui-find-next-reference)   ;;      who is calling this function, reverse of c-c j(visit file), the next calling
         ("C-c C-v p"      .  lsp-ui-find-prev-reference)   ;;      who is calling this function, reverse of c-c j(visit file), first calling
         ("C-c j"          .  lsp-ui-peek-find-definitions) ;; M-.  open decleration
         ([remap xref-find-definitions] . lsp-ui-peek-find-definitions);; M-. or c-c j
	 ([remap xref-find-references]  . lsp-ui-peek-find-references) ;; M-?
       )
;;  :config can be used to execute code after a package is loaded.
    :config
    (lsp-ui-doc-mode -1)
    :after lsp-mode
) ;; end of lsp-ui



;;(add-hook 'java-mode-hook #'lsp) ;; 
;;
;; use lsp-java
    (use-package lsp-java
      :init
      (setq  lsp-java-maven-download-sources t              ;; download src with jars in maven .m2
             lsp-java-code-generation-generate-comments t   ;; generate comment when generate toString equals hashcode
             lsp-java-format-comments-enabled nil           ;;  unformat comment in lsp java
	     lsp-java-save-action-organize-imports nil      ;; resort when imports 
	     lsp-java-completion-filtered-types []          ;;  lsp-java-completion-filtered-types ["java.awt.*" "com.sun.*"] ;; stop completion of packages like java.awt.* and  com.sun,*
             lsp-java-vmargs '("-XX:+UseParallelGC" "-XX:GCTimeRatio=4" "-XX:AdaptiveSizePolicyWeight=90" "-Dsun.zip.disableMemoryMapping=true" "-Xmx3G" "-Xms250m")  ;;; run jdt(eclipse by max 3G) ;;; always check if it change from /home/ahmad/.emacs.d/elpa/lsp-java-20211124.605/lsp-java.el
	     )
      :bind( :map java-mode-map ;; work at java-mode only
         ("C-c C-v C-b"  .   lsp-java-build-project)
         ("C-c C-d i"    .   lsp-java-organize-imports) ;; import all classes
         ("C-2 a"        .   lsp-java-assign-all)                ;;[eclipse Ctrl+1 assign all parameters to new fields  ] ==> Assign to new field. sum4(int x,int y) ==> will be x5=x; y5=y; put cursor inside parenthesis()
         ("C-2 f"        .   lsp-java-assign-to-field)           ;;[eclipse Ctrl+1 assign     parameter  to new field   ] ==> Assign to new field. generate one which over the cursor 
         ("C-2 p"        .   lsp-java-create-parameter)          ;;[eclipse Ctrl+1 create parameter  ] ==> Create parameter refactoring. create parameter form the currrent variable and put it inside parenthesis()
         ("C-2 l"        .   lsp-java-extract-to-local-variable) ;; [eclipse Ctrl+1 assign statment to local variable] Extract local variable refactoring.[note] must select all region without semicolon,  sx.substring(0,2); will be ==>> String substring = sx.substring(0,2);
         ("C-2 o"        .   lsp-java-generate-overrides)        ;; c-2 o or c-.     [eclipse Shift+Alt+S V or Ctrl+1] ==> lsp-java-generate-overrides [c-j to run] ;; Generates override methods, or use c-. or use helm-lsp(M-x helm-mode then c-2 o then select by ctrl-space then enter )
         ("C-2 i"        .   lsp-java-add-unimplemented-methods) ;; c-2 i or c-.     [eclipse Shift+Alt+S V or Ctrl+1] ==> lsp-java-add-unimplemented-methods [c-j to run], or use c-. or use helm-lsp(M-x helm-mode then c-2 i then select by ctrl-space then enter )
         ("C-2 T"        .   my-lsp-try-catch)       ;; C-2 t  [eclipse Ctrl+1]  my-lsp-try-catch
         ("C-2 t"        .   lsp-java-add-throws)    ;; C-2 t  [eclipse Ctrl+1]  lsp-java-add-throws 
         ("C-2 m"        .   lsp-java-extract-method)
         ("C-c i"        .   lsp-java-generate-getters-and-setters) ;; getter and setter
         ("C-c t"        .   lsp-java-generate-equals-and-hash-code) ;; Generates an equals(), a hashCode()  method.
         ("C-c T"        .   lsp-java-generate-to-string) ;; Generates an equals(), a hashCode()  method.
         ("C-c SPC h"    .   lsp-java-type-hierarchy) ;; view hierarchy at point at point at point C-u 0 C-c SPC h for subtype, C-u 1 C-c SPC h for superType
	    )

  :hook (
	 (java-mode                      . lsp)   ;;; (file.properties ==> conf-javaprop-mode)   (jsp,html,as[cp]x ==> web-mode)  
	 (lsp-mode                       . company-mode)
;;	 (lsp-mode                       . lsp-lens-mode)            ;; optional to add the lens
;;	 (java-mode                      . lsp-java-boot-lens-mode ) ;; optional to add the lens
	 )

;;      :config
;;      :hook ((java-mode   . jmi/java-mode-config))

;;    :demand You can override package deferral with the :demand keyword.
;;      :demand t
;;      :after (lsp lsp-mode dap-mode)
      ) ;;end of  lsp-java
        ;;end of  lsp-java

;; what is :demand ????
;; In almost all cases you don't need to manually specify :defer t.
;; This is implied whenever :bind or :mode or :interpreter is used.
;; Typically, you only need to specify :defer if you know for a fact that some other package will
;; do something to cause your package to load at the appropriate time, and thus you would
;; like to defer loading even though use-package isn't creating any autoloads for you.
;; You can override package deferral with the :demand keyword. Thus, even if you use :bind,
;; using :demand will force loading to occur immediately and not establish an autoload for the
;; bound key.



;; M-x dap-java-* this will be from emacs.d/elpa/dap-mode-20190722.1641/dap-java.el 
;; no need for update dap-java.el just put this to .emacs
;; no need to add word server before /test-runner/ 
(use-package dap-mode
  :init (setq 
              dap-ui-variable-length 100       ;;   increase local variable width in dap debug lsp in java 
              dap-ui-default-fetch-count 100   ;;   increase local variable width in dap debug lsp in java "Default number of variables to load in inspect variables view for array variables."
 	      ;; dap-java-test-runner  "~/.emacs.d/eclipse.jdt.ls/server/test-runner/junit-platform-console-standalone.jar"  ;; to run and debug java by default location is "/home/ahmad/.emacs.d/eclipse.jdt.ls/test-runner/junit-platform-console-standalone.jar"
              ;;  dap-java-args ""         ;; solve the problem of hanging  after call M-x dap-debug  c-c c-v d 
	)

  :bind (
         :map dap-mode-map  ;; after this line are local keys 
         ("C-c C-v   d"  . dap-debug) ;; and new key to use M-x dap-debug with arguments then (compile/attach)
         ("C-c C-v C-c"  . dap-hydra)
         ("C-c C-v C-d"  . dap-java-debug)  ;; default debug and run  for java
         ("C-c C-v C-s"  . dap-delete-all-sessions)  ;; delete-all-sessions after kill 
         ("C-c C-v s"    . dap-disconnect)  ;; stop the program then kill it by dap-delete-all-sessions

         ) ;; end of map
;;  :config can be used to execute code after a package is loaded.
  :config
  (dap-mode t)
  (dap-ui-mode t)
;;  (setq    
;;        dap-ui-many-windows-mode -1      ;; close other windows when debug, c-x 1 ;; ;;;;   M-x  dap-ui-many-windows-mode disabled
;;	)

  );; enf of dap-mode



;; to conifig use-package visit ==>> https://jwiegley.github.io/use-package/keywords/
;; press tab to toggle between lists 
(use-package company
  :init
  (setq  company-minimum-prefix-length 4
         company-tooltip-align-annotations t
         company-tooltip-margin 3
         company-async-timeout 40   ;; 2 default
 	 )
;;;;   :hook (( ))
  :bind ( ;;;;  ("C-." . company-complete) ;;this one is global-set-key ;; Any binding occurring before the first use of :map are applied to the global keymap:
         :map company-mode-map  ;; after this line are local keys
 	 ("C-c C-d g"    .  company-yasnippet)  ;; like   c-c space  or  c-c & c-s 
	 ("C-."          .  company-complete) ;; faster complete without update, to update use c-. only
         :map company-active-map       
         ("C-."   . company-complete)  
         ("<tab>" . company-other-backend) ;; [tab] instead of "<tab>"
         ("C-n"   . company-select-next)
         ("C-p"   . company-select-previous))
;;  :config can be used to execute code after a package is loaded.
  :config
;;   (push 'company-lsp company-backends)  ;;;;; solve this error by comment this line  LSP :: `company-lsp` is not supported anymore. Using `company-capf` as the `lsp-completion-provider`.

 ;;;;  :custom keyword allows customization of package custom variables.
 ;;
 ;;     :custom-face    ;; change colors and face for company-mode visit ==>> https://jwiegley.github.io/use-package/keywords/
 ;;      (company-tooltip ((t (:background "gray8" :foreground "#d3d3d3"))))
 ;;      (company-tooltip-annotation ((t (:foreground "yellow2"))))
 ;;      (company-tooltip-common ((t (:foreground "cyan"))))
 ;;      (company-tooltip-selection ((t (:background "#005000"))))

) ;; end of defun company 





;;;;;;;;;;;;;;;;;;;;; dap-java  

;; [old]
;; dap-java-test-runner  variable location is wrong in dap-java.el
;; [very important note]  location of junit-platform-console-standalone.jar  is wrong  in dap-java.el
;;   fix it by 
;; [change it like this]  ===>> (expand-file-name (locate-user-emacs-file "eclipse.jdt.ls/server/test-runner/junit-platform-console-standalone.jar"))
;; [change the date]      ===>> (load "~/.emacs.d/elpa/dap-mode-20190722.1641/dap-java.el")
;; 
;;     (load "~/.emacs.d/elpa/dap-mode-20190831.457/dap-java.el")

      ;; load without .el extension, so it will be load the dap-java.elc
      ;; (load "~/.emacs.d/elpa/dap-mode-20190927.1418/dap-java")  


;; M-x dap-java-* this will be from emacs.d/elpa/dap-mode-20190722.1641/dap-java.el 
;; no need for update dap-java.el just put this to .emacs
;; no need to add word server before /test-runner/ 

;; (setq dap-java-test-runner   "~/.emacs.d/eclipse.jdt.ls/server/test-runner/junit-platform-console-standalone.jar")


          
;; (setenv "JAVA_OPTS" "-Xdebug -Xrunjdwp:transport=dt_socket,server=y,suspend=n,address=1044")
;;
;;  (dap-register-debug-provider
;;   "java"
;;   (lambda (conf)
;;    (plist-put conf :debugPort 1044)
;;    (plist-put conf :host "localhost")
;;    conf))
;; 
;; 
;; (dap-register-debug-template
;;  "javaConfiguration"
;;   (list :type "java"
;;      :request "launch"
;;      :args ""
;;      :name "JDbug"))

;;
;; [old] [old] [old]
;; [fixed]
;;  auto-save-visited file can be recongized by lsp server now, by these config
;; [solved]
;; auto-save will stop the dap-java-debug because the class will not update-generate at the target/classes must save .java manually
;;  (call-interactively  'save-buffer) ;; c-x c-s
;; in emacs 26.1 
;; If you want auto-saving to be done in the (visited file) rather than in a (separate auto-save file),
;; enable the global minor mode
;;   M-x ‘auto-save-visited-mode’.
;;   In this mode, auto-saving is identical to explicit saving. 
;; '(auto-save-default nil) ;; stop auto-save-mode
;; '(auto-save-timeout 0)   ;; stop auto-save 
;; '(auto-save-visited-file-name t)  ;; visited file mean (the real file), save directly in visited file not in the #file#
;; '(auto-save-visited-interval 2)   ;; vistited file after 2 seconds    
;; '(auto-save-visited-mode t)       ;; auto-save-visisted-mode better than auto-save-mode, because it is save as c-x c-s, so jdee and lsp-java will be see it.

;;;;;;;;;;;;;;



;;;;;; [[ fixed ]];;;;;;;;;;;;;;;;;;
;; [fixed]
;;  jumping to the buffers without filters 
;; '(aw-ignore-on nil) ;; aw means ace-window (jump between  windows c-x o)=> ignore some buffers, so stop it, so i can jump to all buffers
;;  so i dont need to set the  'next-multiframe-window like this 
;;  [old] ==>> (global-set-key (kbd "C-x O") 'next-multiframe-window) ;;    Select the next window, regardless of which frame it is on.

;;;;;; [[ fixed ]];;;;;;;;;;;;;;;;;;




;;;;;; [[ fixed ]];;;;;;;;;;;;;;;;;;
;; fix auto-save-visisted-mode(emacs 26) which message still appears.
;;  so the solution is real-auto-save
    (setq auto-save-default nil) ;; old auto-save in emacs 25
    (setq auto-save-visited-mode nil) ;; new auto-save in emacs 26
    (setq auto-save-timeout 0)  ;; disable auto-save
    (setq auto-save-visited-file-name t)  ;; visited file mean (the real file), save directly in visited file not in the #file#
    (setq auto-save-visited-interval 2)   ;; not work now, because the auto-save-visited-mode is nil, the default is 5
    (setq save-silently  t) ;; no messages in minibuffer
    (require 'real-auto-save)   ;; so no need to use (save-buffer like c-x c-s)  
    (setq real-auto-save-interval 2)  ;; save every 4 seconds save the buffer
    (add-hook 'find-file-hook 'real-auto-save-mode)      ;; for all modes open real-auto-save-modes
;;   no need for hooks
;;  (add-hook 'text-mode-hook 'real-auto-save-mode)  ;;when text-mode enabled then real-auto-save-mode enable
;;  (add-hook 'java-mode-hook 'real-auto-save-mode)
;;;;;; [[ fixed ]];;;;;;;;;;;;;;;;;;




;; this  apache service for linux, /var/www/
;; systemctl list-unit-files | grep enabled   ==> will list all enabled ones.
;; systemctl | grep running                   ==> If you want which ones are currently running, you need 
;;
;; is apache working or not ????
;; in emacs M-x my-tomcat-start
;; M-x ps will be 
;; root 7179 45.6  2.1  22:43 00:09 /usr/bin/java -Djava.util.logging.config.file=/home/jdee_workspace/sourcePathx/servers/tomcat9/conf/logging.properties -Djava.util.logging.manager=org.apache.juli.ClassLoaderLogManager -Djdk.tls.ephemeralDHKeySize=2048 -Djava.protocol.handler.pkgs=org.apache.catalina.webresources -Dorg.apache.catalina.security.SecurityListener.UMASK=0027 -Dignore.endorsed.dirs= -classpath /home/jdee_workspace/sourcePathx/servers/tomcat9/bin/bootstrap.jar:/home/jdee_workspace/sourcePathx/servers/tomcat9/bin/tomcat-juli.jar -Dcatalina.base=/home/jdee_workspace/sourcePathx/servers/tomcat9 -Dcatalina.home=/home/jdee_workspace/sourcePathx/servers/tomcat9 -Djava.io.tmpdir=/home/jdee_workspace/sourcePathx/servers/tomcat9/temp org.apache.catalina.startup.Bootstrap start
;;
;; :; you can see that httpd (Apache) listens on port 80
;; :; list the process which opened the (files or port 80)
;; lsof -i tcp:80
;; lsof -i tcp:8080
;;
;;  start tomcat9 in jdee_workspace
(defun my-tomcat-start()
 (interactive)
  (shell-command "sh /home/jdee_workspace/sourcePathx/servers/tomcat9/bin/startup.sh")  
)

;;  stop tomcat9 in jdee_workspace
(defun my-tomcat-stop()
 (interactive)
 (shell-command "sh /home/jdee_workspace/sourcePathx/servers/tomcat9/bin/shutdown.sh")  
)


;; restart tomcat9
(defun my-tomcat-restart()
 (interactive)
 (shell-command "sh /home/jdee_workspace/sourcePathx/servers/tomcat9/bin/shutdown.sh")  
 (shell-command "sh /home/jdee_workspace/sourcePathx/servers/tomcat9/bin/startup.sh")  
)


;;  clear apache, remove all webapps  project from apache
;;;;;
;;;;;(defun tomcat-clean()
;;;;; (interactive)
;;;;; (delete-directory "/home/jdee_workspace/sourcePathx/servers/tomcat9/webapps/" 1)
;;;;; (mkdir "/home/jdee_workspace/sourcePathx/servers/tomcat9/webapps/" )
;;;;;)
;;;;;


;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;  return  class FDQN. full name
;;
;; alternative solution is :-
;; this line for print package.package.package.class
;; (concat (replace-regexp-in-string  "/"   "." (replace-regexp-in-string ".*/src/"  "" (expand-file-name ""))) "."  (file-name-base (or (buffer-file-name)(buffer-name))) )
;; "first.ook1.ook2.ook3.MyPaste"
;;
;; alternative solution is :-
;; or can use  this line for print package/package/package/class
;; (concat (replace-regexp-in-string  "/"   "/" (replace-regexp-in-string ".*/src/"  "" (expand-file-name ""))) "/"  (file-name-base (or (buffer-file-name)(buffer-name))) )
;; "first/ook1/ook2/ook3/MyPaste"
;;
(defun my-lsp-FDQN ()
  (interactive)
  "Get class FDQN. full name"
  (-if-let* ((symbols (lsp--get-document-symbols))
             (package-name (-some->> symbols
                                     (-first (-lambda ((&hash "kind")) (= kind 4)))
                                     (gethash "name")))
             (class-name (->> symbols
                              (--first (= (gethash "kind" it) 5))
                              (gethash "name"))))
      (message (kill-new  (concat package-name "." class-name)))
    ;; kill-new ==> to copy
    ;; message to print in minibuffer
    (user-error "No class found")))

;;  M-x rc  
  (defalias 'rc   'my-lsp-FDQN) ;; return full class name




(defun my-lsp-FDQN-slash ()
  (interactive)
  "Get class FDQN with slash. full name"
  (-if-let* ((symbols (lsp--get-document-symbols))
             (package-name (-some->> symbols
                                     (-first (-lambda ((&hash "kind")) (= kind 4)))
                                     (gethash "name")))
             (class-name (->> symbols
                              (--first (= (gethash "kind" it) 5))
                              (gethash "name"))))
      (message (kill-new  (concat package-name "/" class-name)))
    ;; kill-new ==> to copy
    ;; message to print in minibuffer
    (user-error "No class found")))

;;  M-x rc  
  (defalias 'rc-slash   'my-lsp-FDQN-slash) ;; return full class name






(defun my-lsp-FDQN-dot()
  (interactive)
  "copy relative package name with dot"
  (message (kill-new (concat (replace-regexp-in-string  "/"   "." (replace-regexp-in-string ".*/src/main/java/"  "" (expand-file-name ""))) "."  (file-name-base (or (buffer-file-name)(buffer-name))))))
  )
(defalias 'rc-dot   'my-lsp-FDQN-dot)
;;  M-x rc-dot


;;;
;;;(defun my-lsp-FDQN-slash()
;;;  (interactive)
;;;  "copy relative package name with slash"
;;;  (message (kill-new (concat (replace-regexp-in-string  ""   "" (replace-regexp-in-string ".*/src/main/java/"  "" (expand-file-name ""))) "/"  (file-name-base (or (buffer-file-name)(buffer-name))))))
;;;  )
;;;(defalias 'rc-slash   'my-lsp-FDQN-slash)
;;;;;  M-x rc-slash







;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;


;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;




;;;;;;;;;;;;;;;;;;;;start of defun;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; ;; print file name without extension
;;; (file-name-base (or (buffer-file-name)(buffer-name)))
;;; hi
;;; 
;;; ;; print absolute path without / at the end 
;;; (expand-file-name "")
;;; "/home/temp/srco/sprites/src/first/second/third"
;;; 
;;; ;; print absolute path with / at the end 
;;; (file-name-directory buffer-file-name)
;;; "/home/temp/srco/sprites/src/first/second/third/"
;;;
;;; 
(defun my-lsp-new-class ()
  (interactive)
  "create new class with package name "
   (call-interactively  'find-file-at-point) ;; to create file without ido mode, same as  c-x c-f c-f 
                            ;; (call-interactively  'make-directory)     ;; to create directory (or not, just press enter ) same as  c-x d alt-m , or in dired use ( + c-f )
;;   (call-interactively  'save-buffer)        ;; save buffer to the file (because it is empty it will not saved yet)
;;   (revert-buffer t t)                       ;; without confirm (y)  in dired press g means refresh it, go lsp server  can see the file 

   ;; this line will print package name after the src folder and replace  / by . 
   ;; package first.second.third;
   (insert (concat "package " (replace-regexp-in-string  "/"   "."  (replace-regexp-in-string  ".*/src/main/java/"   ""  (expand-file-name "")))) "; \n\n"  )
   (insert "/**\n* Describe class here.\n*\n*\n*\n*\n*\n*/\n")
   ;; this line will print class name without extension
   ;; public class Hi{ }
   (insert (concat "public class "(file-name-base (or (buffer-file-name)(buffer-name)))) " {\n\n}"  )

   (call-interactively  'save-buffer)        ;; save buffer to the file (because it is empty it will not saved yet)
   (revert-buffer t t)                       ;; without confirm (y)  in dired press g means refresh it, so lsp server  can see the file 

   )
   ;; end of defun

;;
(global-set-key (kbd "C-c C-d C-n")   'my-lsp-new-class)
;;;;;;;;;;;;;;;;;;;;end of defun;;;;;;;;;;;;;;;;;;;;;;;;;;


;;;;;;;;;;;;;;;;;;;;start of defun;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; ;; print file name without extension
;;; (file-name-base (or (buffer-file-name)(buffer-name)))
;;; hi
;;; 
;;; ;; print absolute path without / at the end 
;;; (expand-file-name "")
;;; "/home/temp/srco/sprites/src/first/second/third"
;;; 
;;; ;; print absolute path with / at the end 
;;; (file-name-directory buffer-file-name)
;;; "/home/temp/srco/sprites/src/first/second/third/"
;;;
;;; 
(defun my-lsp-new-interface ()
  (interactive)
  "create new interface with package name "
   (call-interactively  'find-file-at-point) ;; to create file without ido mode, same as  c-x c-f c-f 
                            ;; (call-interactively  'make-directory)     ;; to create directory (or not, just press enter ) same as  c-x d alt-m , or in dired use ( + c-f )
;;   (call-interactively  'save-buffer)        ;; save buffer to the file (because it is empty it will not saved yet)
;;   (revert-buffer t t)                       ;; without confirm (y)  in dired press g means refresh it, go lsp server  can see the file 

   ;; this line will print package name after the src folder and replace  / by . 
   ;; package first.second.third;
   (insert (concat "package " (replace-regexp-in-string  "/"   "."  (replace-regexp-in-string  ".*/src/main/java/"   ""  (expand-file-name "")))) "; \n\n"  )
   (insert "/**\n* Describe class here.\n*\n*\n*\n*\n*\n*/\n")
   ;; this line will print class name without extension
   ;; public class Hi{ }
   (insert (concat "public interface "(file-name-base (or (buffer-file-name)(buffer-name)))) " {\n\n}"  )

   (call-interactively  'save-buffer)        ;; save buffer to the file (because it is empty it will not saved yet)
   (revert-buffer t t)                       ;; without confirm (y)  in dired press g means refresh it, so lsp server  can see the file 

   )
   ;; end of defun

;;
(global-set-key (kbd "C-c C-d C-i")   'my-lsp-new-interface)
;;;;;;;;;;;;;;;;;;;;end of defun;;;;;;;;;;;;;;;;;;;;;;;;;;







;;  try this instead of cp hard link, because the cp -l, cant see the new files, ln cant see the folders,
;;  so the best one is mount --bind
;;  mount --bind olddir newdir     ==> (all for reading and write )
;;  mount -o bind,ro olddir newdir ==> olddir (will be rw), but newdir(read only)
;;  
;;  display all mounted device/folders by command :- 
;;  mount  or findmnt

(setq my-webapp-name "")

;; the better is M-x my-maven-cargo
(defun my-webapp-launch()
(interactive)
   " launch webapp from lsp workspace to apache tomcat by mount binding, 0 means ok,  1 or else means fail => c-h e(view message errors)
      the option (o) in mount -o bind ro ==> the webapps in server will be read-only, so if you delete the ro it will be for read and write "
      (if (equal my-webapp-name  "")
	  (progn
	    (setq my-webapp-name (read-string "mount webapp name is : "))
            (shell-command (concat "umount   /home/jdee_workspace/sourcePathx/servers/tomcat9/webapps/"my-webapp-name"/WEB-INF/classes/"))
            (shell-command (concat "umount   /home/jdee_workspace/sourcePathx/servers/tomcat9/webapps/"my-webapp-name"/"))
            (shell-command (concat "mkdir -p                                                                   /home/jdee_workspace/sourcePathx/servers/tomcat9/webapps/"my-webapp-name"/"))
            (shell-command (concat "mount -o bind /home/myLSP/lspWorkspace/"my-webapp-name"/WebContent/        /home/jdee_workspace/sourcePathx/servers/tomcat9/webapps/"my-webapp-name"/"))
            (shell-command (concat "mkdir -p                                                                   /home/jdee_workspace/sourcePathx/servers/tomcat9/webapps/"my-webapp-name"/WEB-INF/classes/"))
           ;; (shell-command (concat "mount -o bind /home/myLSP/lspWorkspace/"my-webapp-name"/build/classes/     /home/jdee_workspace/sourcePathx/servers/tomcat9/webapps/"my-webapp-name"/WEB-INF/classes/"))  ;; without pom.xml maven
            (shell-command (concat "mount -o bind /home/myLSP/lspWorkspace/"my-webapp-name"/target/classes/    /home/jdee_workspace/sourcePathx/servers/tomcat9/webapps/"my-webapp-name"/WEB-INF/classes/"))    ;; with    pom.xml maven 
	    );; end of true part condition
	(progn
	  (message "website ==>( %s )<==  is already launched, type M-x my-webapp-turning-off for umount it,\n findmnt to list all mounted folders" my-webapp-name)
          );; end of false part condition
	) ;; end of if condition
    );; end of defun
  

(defun my-webapp-turning-off()
(interactive)
 "turning off launching  webapp by  umount binding,# 0 ok ;; 1 or else  fail => c-h e(view message errors)"
  (setq my-webapp-name (read-string "umount webapp name is : "))
  (shell-command (concat "umount   /home/jdee_workspace/sourcePathx/servers/tomcat9/webapps/"my-webapp-name"/WEB-INF/classes/"))
  (shell-command (concat "umount   /home/jdee_workspace/sourcePathx/servers/tomcat9/webapps/"my-webapp-name"/"))
  (setq my-webapp-name "")
)
;; end of defun




;;  java -jar /home/jdee_workspace/sourcePathx/jars/private_JAR/checkstyle-8.12-all.jar -c /home/jdee_workspace/sourcePathx/jars/private_JAR/checkstyle-8.12-all/sun_checks.xml  Hi.java
;; M-x my-lsp-new-class then  grep-mode  to visit the file
(defun my-lsp-java-checkstyle()
(interactive)
 "lsp-java checkstyle by command java -jar checkstyle -c sun.xml  current_file.java"
  (shell-command (concat "/usr/bin/java -jar /home/jdee_workspace/sourcePathx/jars/private_JAR/checkstyle-8.12-all.jar -c /home/jdee_workspace/sourcePathx/jars/private_JAR/checkstyle-8.12-all/sun_checks.xml  "(buffer-name)))
  (other-window 1)  ;; jump to the other window
  (grep-mode)  ;; so i can jump to error directly from grep mode to java line, just type n/p
)
;; end of defun



;;;
(setq my-lsp-ui-doc-hidden-state nil)
(defun my-toggle-lsp-ui-doc-show-and-hide ()
" toggle lsp-ui-doc show and hide"
(interactive)
(if (eq my-lsp-ui-doc-hidden-state  nil)

    (progn 
    (lsp-ui-doc-show)
    (setq my-lsp-ui-doc-hidden-state  t)
     );; end of false

   (progn
   (lsp-ui-doc-hide)
   (setq my-lsp-ui-doc-hidden-state  nil)
   ) ;; end of true

  ) ;; end of if-condition

(message "lsp-doc-ui-state is %s" my-lsp-ui-doc-hidden-state)
) ;;end of defun

;; (define-key java-mode-map (kbd "C-c C-v w") 'my-toggle-lsp-ui-doc-show-and-hide)  ;; hide/show web javadoc 
;; (define-key java-mode-map (kbd "C-c C-v C-w") 'lsp-describe-thing-at-point)  ;; visit web javadoc, c-c c-v c-w  doc childframe


;; generate new defun  try-catch for selected region or use C-2 quick assist 
;; insert around region, override region, 
(defun my-lsp-try-catch (start end)
  "Insert a try catch around a region."
  (interactive "r")
  (save-excursion
    (goto-char end) (insert "} catch(Exception e){\n\n} finally {\n\n}")
    (goto-char start) (insert "try {")
    ));; end of defun

;; (define-key java-mode-map (kbd "C-2 T") 'my-lsp-try-catch)       ;; C-2 t  [eclipse Ctrl+1]  my-lsp-try-catch
;; (define-key java-mode-map (kbd "C-2 t") 'lsp-java-add-throws)    ;; C-2 t  [eclipse Ctrl+1]  lsp-java-add-throws 

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;


;; clean lsp java temp folders and files 
(defun my-cleaner-lsp-temp()
 "clean lsp java temp folders and files emacs.d/workspace/ and .emacs.d/.lsp-session-v1 "
 (interactive)
 (shell-command "rm -rf  /home/ahmad/.emacs.d/workspace")  ;; remove it when no c-j work
 (shell-command "rm      /home/ahmad/.emacs.d/.lsp-session-v1")  ;; this will duplicate projects 
;; (shell-command "rm      /home/ahmad/.emacs.d/.cache/treemacs-persist")  ;; this will view old project in treemacs
)


(require 'fiplr)
(defun my-lsp-show-ClassPath-for-currentProject()
"retrun classpath for project name as two arrays, .classpath and pom.xml and CLASSPATH_ARGS from M-x getenv
 it is works without classname, and without  project name, 
but the workspace must named by lspWorkspace
but the workspace must named by lspWorkspace
but the workspace must named by lspWorkspace"
(interactive)
   (let (
         ;; "/home/myLSP/lspWorkspace/web03/" get project root  by fiplr then get project name web03 
         (my-lsp-project-name-for-classpath (format "%s" (replace-regexp-in-string "/"  ""   (replace-regexp-in-string ".*/lspWorkspace/"  "" (format "%s"  (fiplr-find-root (expand-file-name "") fiplr-root-markers))))))
    ) ;; end of let definition
 (message (kill-new (format "%s" (lsp-send-execute-command "vscode.java.resolveClasspath" (vector "" (format "%s" my-lsp-project-name-for-classpath)))))))
)



;;
(defun my-lsp-show-ClassPath-for-project()
"retrun classpath for project name as two arrays, .classpath and pom.xml and CLASSPATH_ARGS from M-x getenv
 it is works without classname, just by project name
 to print the full classpath: seperated by color just type M-x my-lsp-generate-javadoc-html "
 (interactive)
 (message (kill-new (format "%s" (lsp-send-execute-command "vscode.java.resolveClasspath" (vector "" (read-string "project-name : "))))))
 ) ;; end of defun



;; (regexp-quote "([] [") ==> to ignore special char 
;; (format "%s")  ==> to convert list,array to string
;;  lsp classpath from two arrays [.classpath]+[pom.xml]+ $CLASSPATH_ARGS   ==> M-x getenv then $CLASSPATH_ARGS
;;
;; javadoc  -d /home/myLSP/test/  -classpath /home/myLSP/myPath/mariadb-java-client-2.3.0.jar:/home/myLSP/myPath/javax.servlet-api-4.0.1.jar   -sourcepath ./              -subpackages package
;; javadoc  -d [destination dir]  -classpath [classpath:classpath]                                                                              -sourcepath [source dir]   -subpackages [package1:package2:package3]
;; the better is M-x my-maven-javadoc
(defun my-lsp-generate-javadoc-html ()
"generate javadoc html for package in /home/myLSP/myPath/myDoc/
 it also print full commad with full classpath: seperated by colon
 just type C-h e in Messages  to show the full command "
(interactive)
 (let (
  (my-classpath-for-project-temp  (replace-regexp-in-string " "  ":" 
    (replace-regexp-in-string (concat (regexp-quote "([") "\\|"  
                                      (regexp-quote "] [") "\\|" 
                                      (regexp-quote "])")  )  "" 
                     (format "%s" (lsp-send-execute-command "vscode.java.resolveClasspath" (vector ""  (read-string "project-name : ")))))))
  ;; "/home/myLSP/lspWorkspace/web03/src/"
  (my-lsp-project-name-suggest (format "%s" (replace-regexp-in-string "/src/main/java/.*"  "/src/main/java/" (expand-file-name ""))))
   ;; more than one package must seperated by colon :  package1:differentPackage2
   ;; can use also star for all packages, but must packages names without filename like package1 package2 struts.xml
  (my-lsp-package-name (format "%s" (read-string "package-name : ")))  
  ) ;; end of let definition
  (shell-command "rm -rf  /home/myLSP/myPath/myDoc/*")  ;; remove contents of myDoc 
  (message       (format "javadoc  -d /home/myLSP/myPath/myDoc/ -classpath %s  -sourcepath %s  -subpackages %s "  my-classpath-for-project-temp  my-lsp-project-name-suggest  my-lsp-package-name))
  (shell-command (format "javadoc  -d /home/myLSP/myPath/myDoc/ -classpath %s  -sourcepath %s  -subpackages %s "  my-classpath-for-project-temp  my-lsp-project-name-suggest  my-lsp-package-name))
  (w3m-find-file "/home/myLSP/myPath/myDoc/index.html")
  ) ;; end of let
) ;; end of my-lsp-generate-javadoc-html
  ;; important :- press R in w3m to reload index.html pagae




;;
;; truncate lines in help mode when press c-c c-v c-w  (lsp-describe-thing-at-point)
(require 'help-mode)
(add-hook 'help-mode-hook
  (lambda ()
     (setq   truncate-lines nil)  ;; divide long line into seperated lines
     (setq   word-wrap t)         ;; (if truncate-lines nil) then view it as complete words
  ))


;;;;
;;;;   stop dap-ui-many-windows-mode
;;;; (require 'dap-ui)
;;;; (add-hook 'dap-ui-many-windows-mode-hook
;;;;   (lambda ()
;;;;   (dap-ui-many-windows-mode -1)      ;; close other windows when debug, c-x 1 ;; (require 'dap-ui)
;;;;   ))
;;;;






;;;;;;;;;;;;;;;;;;;;;;;;;;; start of boot  spring ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; :):)  ls-boot is experimental, not complete yet, spring covers application.properties, application.yml and .java files.
;;  (setq lsp-java-boot-enabled nil) as default,
(defun my-toggle-spring-boot-server-on-off ()
" toggle spring ls-boot server on off, this is not restart
  if it is lsp-java-boot-enabled t,
  then can use M-x lsp-workspace-shutdown to shutdown ls-boot,jdtls,xmlls servers
  then can use M-x lsp-workspace-restart to restart ls-boot,jdtls,xmlls servers
"
(interactive)
(if (eq lsp-java-boot-enabled nil) ;; lsp-java-boot-enabled nil  in  (use-package lsp-mode) as above
    ;; if 
    (progn 
     (setq lsp-java-boot-enabled  t)
     (lsp) ;;call M-x lsp 
    )  
  ;; else 
  (progn
   (setq lsp-java-boot-enabled nil))
  (lsp) ;;call M-x lsp 
) ;; end-if

(message "ls-boot status is %s" lsp-java-boot-enabled)

) ;; end defun

(defalias 'my-boot  'my-toggle-spring-boot-server-on-off) ;; 
;; M-x my-boot ;; toggle spring ls-boot server on off, this is not restart, to shutdown server jdtls,ls-boot,xmlls  use M-x lsp-workspace-shutdown
;;;;;;;;;;;;;;;;;;;;;;;;;;; end of boot spring ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;


;; note :- 
;; if edit pom.xml from outside emacs then can use M-x pom to update pom.xml with lsp server,
;; but pom.xml by default is updated automatically
;; https://github.com/emacs-lsp/lsp-java/issues/135
(defalias 'my-pom   'lsp-java-update-project-configuration) ;;  update pom.xml prject, M-x my-pom inside pom.xml xml-mode not java-mode



(require 'fiplr)
(defun my-lsp-find-in-project-as-grep ()
  "search inside all files in project like this 
   /home/myLSP/lspWorkspace/web03/ get project root name by fiplr
   in grep use wildcards 
   can also search all projects in workspace 
   M-x find-grep use find and grep ==> M-x fg 
   "
  (interactive)
    ;; M-x find-grep use find and grep ==> M-x fg 
    ;; find '/home/myLSP/lspWorkspace/web03' -iname '*'  -type f -exec grep  --color  -nHi -e 'leagueList' {} +
    ;;  or 
    ;; find '/home/myLSP/lspWorkspace/' -iname '*'  -type f -exec grep  --color  -nHi -e 'leagueList' {} +
    ;;
    ;; "/home/myLSP/lspWorkspace/web03/" get project root by regexp
    ;; (my-lsp-project-name-for-search (format "/home/myLSP/lspWorkspace/%s"  (replace-regexp-in-string  "/.*" ""  (replace-regexp-in-string "/home/myLSP/lspWorkspace/"  "" (expand-file-name ""))))  )
    ;;
    ;;
    ;; use the fiplr to get current the root of project
    ;;; by these steps
    ;; 1-  (require 'fiplr)
    ;; 2-  (setq fiplr-root-markers '(".git" ".svn" "prj.el" ".project"  "pom.xml"  ".classpath"))
    ;; 3-  (fiplr-find-root "/home/myLSP/lspWorkspace/web03/notes/soccer.sql" fiplr-root-markers)
    ;;
   (let (
         ;; "/home/myLSP/lspWorkspace/web03/" get project root  by fiplr 
         (my-lsp-project-name-for-search (format "%s" (fiplr-find-root (expand-file-name "") fiplr-root-markers)))

         (my-lsp-project-search-for-word-as-grep (format "%s" (read-string "find as grep : ")))  
    ) ;; end of let definition

      (cd my-lsp-project-name-for-search)  ;; to hide the absolute path in find grep , toggle H by h ==>> H(Print the file name for each match.) (h)==>> --no-filenameby  in grep  -nHi 
;;      (find-grep (format "find  .   -iname '*' ! \\( -iname '*.log' -or -iname '*.class'  \\)  -type f -exec grep --color  -niH -e '%s'    {} +"                                  my-lsp-project-search-for-word-as-grep))

        ;; execlude folders and files in find grep
        ;; ./.settings not work because it start with dot .settings 
;;        (find-grep (format " find  . -type d \\( -path ./target -prune     -or -path ./bin -prune     -or -path ./.settings -prune   \\)   -or   \\( -not -iname '*.log'     -and -not -iname '*.class'   -and -not -iname '*.jar' \\)  -type f  -exec grep -r  --color  --exclude-dir={bin,target,.settings}  -n -i -e '%s'   {}  +"  my-lsp-project-search-for-word-as-grep))
        (find-grep (format " find  . -type d \\( -path ./target -prune     -or -path ./bin -prune     -or -path ./.settings -prune    -or -path ./.git  -prune  \\)   -or   \\( -not -iname '*.log'     -and -not -iname '*.class'   -and -not -iname '*.jar' \\)  -type f  -exec grep -r  --color  --exclude-dir={bin,target,.settings,.git}  -n -i -e '%s'   {}  +"  my-lsp-project-search-for-word-as-grep))
;;    (find-grep (format "find '%s' -iname '*' ! \\( -iname '*.log' -or -iname '*.class'  \\)  -type f -exec grep --color -i -n -e '%s'    {} +" my-lsp-project-name-for-search   my-lsp-project-search-for-word-as-grep))
;;    (find-grep (format "find '%s' -iname '*' ! \\( -iname '*.log' -or -iname '*.class'  \\)  -type f -exec grep  --color  -nHi -e '%s' {} +" my-lsp-project-name-for-search   my-lsp-project-search-for-word-as-grep))
    ) ;; end of let
   ) ;; end of my-lsp-generate-javadoc-html

   (global-set-key (kbd "C-c C-d C-f")   'my-lsp-find-in-project-as-grep) ;; 



;;;;;;;;;;;;;;;;;;;;;;;;;;;; start mvn maven ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; (add-to-list 'load-path "~/.emacs.d/plugins")
;; (add-to-list 'load-path  "/home/importantDIR/EmacsElisp")
;;  ~/.emacs.d/plugins/maven-search.el
;; search http://search.maven.org
;; M-x maven-search then c-x c-q (no read-only) then my-maven-replace-colon-by-tags ==>> convert result to tags
(require 'maven-search) ;;  ~/.emacs.d/plugins/maven-search.el
;; the end

(defalias 'my-maven-search   'maven-search) 
;; how to search then replace matched string 
;;   (search-forward ":")
;;   (replace-match"</groupId>\n<artifactId>")
;; M-x maven-search  then c-x c-q (no read-only) then my-maven-replace-colon-by-tags ==>> convert result to tags
(defun my-maven-replace-colon-by-tags()
  "replace : by maven tags after search by M-x maven-search "
  (interactive)
  (call-interactively  'move-beginning-of-line)
  (insert "<dependency>\n    <groupId>")
  (search-forward ":")
  (replace-match"</groupId>\n    <artifactId>")
  (search-forward ":")
  (replace-match"</artifactId>\n    <version>")
  (call-interactively 'move-end-of-line)
  (insert "</version>\n</dependency>")
)


;; M-x list-packages ==> then install mvn
;; M-x mvn-clean
;; M-x mvn-compile
;; M-x mvn then tab to write maven command by selecting command 



;;;; maven tomcat 9x or 10x  as plugin  and generate javadoc ;;
(require 'mvn)
(defun my-maven-cargo-run()
 "run apache tomcat as plugin by maven, to kill it close the buffer compilation"
 (interactive)
;; (mvn "clean package cargo:run")
;; (mvn "clean verify org.codehaus.cargo:cargo-maven3-plugin:run     -Dcargo.maven.containerId=tomcat10x          -Dcargo.maven.containerUrl=https://repo.maven.apache.org/maven2/org/apache/tomcat/tomcat/10.1.0-M8/tomcat-10.1.0-M8.zip ")

;; every time when restart the computer i need to download https://repo.maven.apache.org/maven2/org/apache/tomcat/tomcat/9.0.48/tomcat-9.0.48.zip ")
;; (mvn "clean verify   org.codehaus.cargo:cargo-maven3-plugin:run     -Dcargo.maven.containerId=tomcat9x          -Dcargo.maven.containerUrl=https://repo.maven.apache.org/maven2/org/apache/tomcat/tomcat/9.0.48/tomcat-9.0.48.zip ")

;; no need for download tomcat9x , just put it in file:/home/cargo/tomcat-9.0.48.zip "), just download it once from  https://repo.maven.apache.org/maven2/org/apache/tomcat/tomcat/9.0.48/tomcat-9.0.48.zip
   (mvn "clean verify   org.codehaus.cargo:cargo-maven3-plugin:run     -Dcargo.maven.containerId=tomcat9x          -Dcargo.maven.containerUrl=file:/home/cargo/tomcat-9.0.48.zip ")
)


(defun my-maven-cargo-stop()
 "stop apache tomcat as plugin by maven "
 (interactive)
 (mvn " org.codehaus.cargo:cargo-maven3-plugin:stop")
)



(require 'fiplr)
(defun my-maven-javadoc()
 "generate javadoc by maven plugin  in target/site
 it is better than M-x my-lsp-generate-javadoc-html
 in pom.xml must add plugin named maven-javadoc-plugin
 in pom.xml must add plugin named maven-javadoc-plugin
 then press R in w3m to reload index.html
"
 (interactive)
 (mvn  " -e clean package javadoc:javadoc")

;;  just for open index.html of project 
;;  just for open index.html of project 
   (let (
         ;; "/home/myLSP/lspWorkspace/web03/" get project root by fiplr 
	 (my-lsp-project-name-for-maven-javadoc (format "%s" (fiplr-find-root (expand-file-name "") fiplr-root-markers)))
	 (my-lsp-site-name-for-maven-javadoc   "target/site/apidocs/index.html")
	 )
     ;; /home/myLSP/lspWorkspace/web03/  target/site/apidocs/index.html
     (w3m-find-file (format "%s%s"  my-lsp-project-name-for-maven-javadoc my-lsp-site-name-for-maven-javadoc ))
     (message       (format "%s%s"  my-lsp-project-name-for-maven-javadoc my-lsp-site-name-for-maven-javadoc ))
   ))

;;; maven tomcat as plugin  and generate javadoc ;;;;;




(require 'fiplr)
(defun my-maven-javadoc-visit-current-site()
 "dont generate javadoc by maven plugin  in target/site
  just visit the current site 
 it is better than M-x my-lsp-generate-javadoc-html
 in pom.xml must add plugin named maven-javadoc-plugin
 in pom.xml must add plugin named maven-javadoc-plugin
 then press R in w3m to reload index.html
"
 (interactive)
;; (mvn  " -e clean package javadoc:javadoc")

;;  just for open index.html of project 
;;  just for open index.html of project 
   (let (
         ;; "/home/myLSP/lspWorkspace/web03/" get project root by fiplr 
	 (my-lsp-project-name-for-maven-javadoc (format "%s" (fiplr-find-root (expand-file-name "") fiplr-root-markers)))
	 (my-lsp-site-name-for-maven-javadoc   "target/site/apidocs/index.html")
	 )
     ;; /home/myLSP/lspWorkspace/web03/  target/site/apidocs/index.html
     (w3m-find-file (format "%s%s"  my-lsp-project-name-for-maven-javadoc my-lsp-site-name-for-maven-javadoc ))
     (message       (format "%s%s"  my-lsp-project-name-for-maven-javadoc my-lsp-site-name-for-maven-javadoc ))
   ))

;;; maven tomcat as plugin  and generate javadoc ;;;;;






;; create new maven desktop project by command line
;; mvn archetype:generate -DgroupId=ToolsQA    -DartifactId=DemoProject  -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
(defun my-maven-create-new-project-desktop (groupId artifactId)
  (interactive 
   (list
   (read-string "groupId: ")
   (read-string "artifactId: ")
   ) current-prefix-arg )      ;;  current prefix arg ==> when press M-n M-p will display the old arguments for these fields only 
  (async-shell-command
     (concat "mvn archetype:generate -DgroupId="groupId"    -DartifactId="artifactId"  -DarchetypeArtifactId=maven-archetype-quickstart   -DinteractiveMode=true ")
     )
)


;; create new maven web project by command line
;; mvn archetype:generate -DgroupId=webproject -DartifactId=SampleWebApp -DarchetypeArtifactId=maven-archetype-webapp     -DinteractiveMode=false
;; web version 1.4 maven-archetype-webapp
(defun my-maven-create-new-project-web (groupId artifactId)
  (interactive 
   (list
   (read-string "groupId: ")
   (read-string "artifactId: ")
   ) current-prefix-arg )      ;;  current prefix arg ==> when press M-n M-p will display the old arguments for these fields only 
  (async-shell-command
     (concat "mvn archetype:generate -DgroupId="groupId"    -DartifactId="artifactId"  -DarchetypeArtifactId=maven-archetype-webapp  -DinteractiveMode=true")
     )
)



;; ;; interactive maven create web 
;; (defun my-maven-create-new-project-web2 ()
;;   (interactive)
;;   (async-shell-command
;;      (concat "mvn archetype:generate  -DarchetypeArtifactId=maven-archetype-webapp  -DarchetypeVersion=1.4 ")
;;      )
;; )



(defun my-maven-create-new-project-springMVC ( )
  (interactive )
   ;; interactive command prombt by async-shell-command
  (async-shell-command
        (concat  "mvn archetype:generate  -DarchetypeGroupId=co.ntier  -DarchetypeArtifactId=spring-mvc-archetype  -DarchetypeVersion=1.0.2") 
   )
)



(defun my-maven-create-new-project-listAll ( )
  (interactive )
   ;; interactive command prombt by async-shell-command
  (async-shell-command
        (concat  "mvn archetype:generate ")
   )
)




;;;;;;;;;;;;;;;;;;;;;;;;;;;; end of mvn maven ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; lsp-java keys ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; C-c C-v C-r then C-2
;; C-c C-v C-r ==> lsp-treemacs-errors-list then can fix auto-fix errors from here by command M-x  lsp-treemacs-quick-fix C-2
;;  in lsp-treemacs-errors-mode-map not java-mode
;;
;; in lsp-treemacs.el define-key  [[ x r = ]] are already exisit
;; thes keys  are already in lsp-treemacs.el but i added C-2 for 'lsp-treemacs-quick-fix looks like eclipse quick-assist 
;; x     (c-2)                   lsp-treemacs-quick-fix ;; like C-2 in eclipse to fix-errors
;; r     (refresh)               lsp-treemacs-java-deps-refresh ;; 
;; =     (show/hide ifo/warning) lsp-treemacs-cycle-severity ;; hide/show info,warning
;;

;; (define-key java-mode-map (kbd "C-c C-d j") 'imenus) ;;local  like c-] in eclipse ; M-x imenus-rescan to refresh, fast jump to methods variables
;; (define-key java-mode-map (kbd "C-c C-d J") 'lsp-ui-imenu)  ;;local  like c-] in eclipse ; M-x imenus-rescan to refresh, fast jump to methods variables

;;(define-key java-mode-map (kbd "C-c C-d f") 'lsp-format-buffer) ;; format code

;; use M-. M-? to find definition, c-c s to  pop-tag-mark==> return to original point
;;; (define-key lsp-ui-mode-map     [remap xref-find-definitions] #'lsp-ui-peek-find-definitions);; M-. or c-c j
;;; (define-key lsp-ui-mode-map     [remap xref-find-references]  #'lsp-ui-peek-find-references) ;; M-?

;; (define-key java-mode-map (kbd "C-c C-v m") 'lsp-find-references) ;; M-?  find referense and sort it as list 
;; (define-key java-mode-map (kbd "C-c C-v n") 'lsp-ui-find-next-reference)   ;;      who is calling this function, reverse of c-c j(visit file), the next calling
;; (define-key java-mode-map (kbd "C-c C-v p") 'lsp-ui-find-prev-reference)   ;;      who is calling this function, reverse of c-c j(visit file), first calling

;; (define-key java-mode-map (kbd "C-c s") 'pop-tag-mark)
;; (define-key java-mode-map (kbd "C-.")   'company-complete) ;; faster complete without update, to update use c-. only
;; (define-key java-mode-map (kbd "C-c j") 'lsp-ui-peek-find-definitions) ;; M-.  open decleration
;; (define-key java-mode-map (kbd "C-c J") 'lsp-find-implementation) ;; C-c shift-j ;; M-x lsp-find-implementation     ==>  who is implement this interface 


;;(define-key java-mode-map (kbd "C-c C-v C-b") 'lsp-java-build-project)
;;(define-key java-mode-map (kbd "C-c C-v C-r") 'lsp-treemacs-errors-list)

;; (define-key java-mode-map (kbd "C-c C-v C-d") 'dap-java-debug)
;; (define-key java-mode-map (kbd "C-c C-v   d") 'dap-debug) ;; and new key to use M-x dap-debug with arguments then (compile/attach)
;; (define-key java-mode-map (kbd "C-c C-v C-c") 'dap-hydra)


;; (define-key java-mode-map (kbd "C-c C-v k") 'lsp-restart-workspace)  ;; M-x lsp-restart-workspace
;; (define-key java-mode-map (kbd "C-c C-d g") 'company-yasnippet)  ;; like   c-c space  or  c-c & c-s 
;; (define-key java-mode-map (kbd "C-c C-v l") 'treemacs) ;; view project as tree

;;[not work](define-key java-mode-map (kbd "C-c C-v l")   'treemacs-add-and-display-current-project) ;; view project as tree

;; this line  is already above 
;; (add-hook 'java-mode-hook 'hs-minor-mode) ;; open jdee first then open hs-minor mode  ;; C-c @ C-c , it is above ,
;; or just use M-x hs-minor-mode then c-c @ c-c to hide  then c-c @ c-c to show

;; log file 
;; (setq  lsp-log-io  t) ;;reads messages from server
;; M-x   lsp-workspace-show-log
;; see also .log
;;
;; tail -f ~/.emacs.d/workspace/.metadata/.log
;; bookmark ==> lsp-log

;; javadoc
;; javadoc  -d /home/myLSP/test/  -classpath /home/myLSP/myPath/mariadb-java-client-2.3.0.jar:/home/myLSP/myPath/javax.servlet-api-4.0.1.jar          -sourcepath ./              -subpackages first
;; javadoc  -d /home/myLSP/test/  -classpath /home/myLSP/myPath/mariadb-java-client-2.3.0.jar:/home/myLSP/myPath/javax.servlet-api-4.0.1.jar          -sourcepath ./              -subpackages first:ok
;; javadoc  -d [destination dir]  -classpath [classpath:classpath]                                                                                     -sourcepath [source dir]   -subpackages [package1:subpackage:subpackage]


;;  (defalias 'rc   'my-lsp-FDQN)   ;; return full class name

;;  C-M-n   ==> next method
;;  C-M-p   ==> pre  method
;;  C-M-a   ==> begging of the  method
;;  C-M-e   ==> endding of the   method
;;  c-M-u/d ==> backward-up-list

;;[not work] (define-key java-mode-map (kbd "C-c n") 'senator-next-tag) ;; if set it to global you can use it with xml
;;[not work] (define-key java-mode-map (kbd "C-c p") 'senator-previous-tag) ;; if set it to global you can use it with xml
;;[not work] (define-key java-mode-map (kbd "C-c C-d C-w") 'senator-kill-tag)  ;; use C-y to yank or paste 
;;[not work] (define-key java-mode-map (kbd "C-c C-d M-w") 'senator-copy-tag)  ;; use C-y to yank or paste 
;;[not work] (define-key java-mode-map (kbd "C-c C-d C-c o") 'senator-copy-tag) ;; use C-y to yank or paste 
;;[not work]  (define-key java-mode-map (kbd "C-c C-d C-y") 'senator-yank-tag) ;; use C-y to yank or paste 
;;[not work] (define-key java-mode-map (kbd "C-c C-d r") 'senator-copy-tag-to-register)
;;[not work] (define-key java-mode-map (kbd "C-c C-d ,") 'semantic-force-refresh)
;;[not work] (define-key java-mode-map (kbd "C-c C-d <up>") 'senator-transpose-tags-up) 
;;[not work] (define-key java-mode-map (kbd "C-c C-d <down>") 'senator-transpose-tags-down) 

;; need shortcut keys
;; need shortcut keys
;; M-x  lsp-java-update-project-uris     Update WORKSPACE project uris.
;; M-x lsp-java-actionable-notifications
;; M-x lsp-goto-implementation  ==>  Find implementations of the symbol under point.;; same as  (define-key java-mode-map (kbd "C-c J") 'lsp-ui-peek-find-implementation) ;; C-c shift-j ;; M-x lsp-ui-peek-find-implementation     ==>  who is implement this interface 
;; M-x treemacs-add-project-to-workspace
;; M-x lsp-workspace-show-log  first must set-variable lsp-log-io  t, then viewt the massages
;; M-x lsp-workspace-show-log  first must set-variable lsp-print-io  t, then viewt the massages
;; M-x lsp-java-update-server	         Update LDT LS server form internet
;; M-x lsp-java-classpath-open
;; M-x lsp-java-create-parameter        Create parameter refactoring.
;;
;; [[lsp variables]]
;;  lsp-java-bundles  nil
;;
;;
;;
;; xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
;; xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx

;;; empty keys 
;;; empty keys 
;;; (define-key java-mode-map (kbd "C-c C-d SPC") 'semantic-symref-symbol) ;; local like M-x occur 
;;; (define-key java-mode-map (kbd "C-c C-.") 'jdee-complete-minibuf) ;; faster complete without update, to update use c-. only
;;; (define-key java-mode-map (kbd "C-c C-d l") 'semantic-analyze-possible-completions) 
;;; (define-key java-mode-map (kbd "C-c C-d u") 'senator-go-to-up-reference) 
;;; (define-key java-mode-map (kbd "C-c C-d n") 'jdee-gen-class) ;; same as eclipse ;; use c-c c-d c-n global
;;; (define-key java-mode-map (kbd "C-c C-v z") 'my-jdee-import-all)  ;; stop key C-c c-v z  in jdee-mode , stop key not function, jdee-import-all'  
;;; (define-key java-mode-map (kbd "C-c C-d G") 'semantic-symref)        ;; current Method M-x occur 
;;; (define-key java-mode-map (kbd "C-M-x") 'kill-sexp)
;;; (define-key java-mode-map (kbd "C-c C-v J") ' jdee-javadoc-remdoc-at-line) ;; remove javadoc , add javadoc by c-c c-v j 
;;; (define-key java-mode-map (kbd "C-c C-v x") 'jdee-show-interface-source) ;; visit current interface
;;; (define-key java-mode-map (kbd "C-c C-z")  'jdee-import-organize)
;;; (define-key java-mode-map (kbd "C-c b")  'semantic-mrub-switch-tags)
;;; c-c c-v C-o
;;; c-c c-v c-i



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; lsp-java keys ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;







;; dired auto refresh by
;; refresh dired auto by 
;; (setq global-auto-revert-non-file-buffers t) (global-auto-revert-mode)
;;
;; stop auto fresh in dired 
;;     M-x global-auto-revert-mode all  disabled
;;



(require 'dap-mode)
;;
;; dap1 for java
;; call my-dap1 once in java-window 
(defun my-dap1()
"dap java for java buffer, close breakpoint window then c-x 0(exit)  or just hide it by right click"
(interactive)
 (setq dap-auto-configure-features '(sessions locals  expressions controls tooltip))    ;; remove breakpoint window from list in dap-mode.el , then close it by c-x 0 (close window) or just hide it by right click
;; (call-interactively  'dap-ui-many-windows-mode ) ;;   group of windows and still group
;; (call-interactively  'dap-tooltip-mode ) ;;  stop tooltip mouse or or or remove it from  dap-auto-configure-features as above or below
;; (setq dap-auto-configure-features '(sessions locals  expressions controls ))    ;; remove tooltip window
  (call-interactively  'golden-ratio-mode ) ;; after debug enable it by M-x golden-ratio-mode
  (call-interactively  'treemacs-toggle-fixed-width) ;; toggle locked unlocked, can resize window
)


;;
;; dap2 for  java
;; call my-dap2  many times  windows (sessions locals  expressions controls tooltip), so can resize it by mouse drag
(defun my-dap2()
" resize tree windows in dap debug java for locals expression 
   for local,expression,session buffers, can resize by mouse or by w w w w w w w "
  (interactive)
  (call-interactively  'treemacs-toggle-fixed-width) ;; toggle locked unlocked, can resize window
)




;;
;; resize font face to 12
(defun my-face-small()
"set font face small for dap java, font size 12"
(interactive)
(custom-set-faces
 '(default ((t (:inherit nil :stipple nil :background "black" :foreground "light gray" :inverse-video nil :box nil :strike-through nil :overline nil :underline nil :slant normal :weight normal :height 120 :width normal :foundry "unknown" :family "DejaVu Sans Mono"))))
 )
)


;;
;; resize font face to 16
(defun my-face-default()
"set font face defult for dap java, font size 16"
(interactive)
(custom-set-faces
 '(default ((t (:inherit nil :stipple nil :background "black" :foreground "light gray" :inverse-video nil :box nil :strike-through nil :overline nil :underline nil :slant normal :weight normal :height 220 :width normal :foundry "unknown" :family "DejaVu Sans Mono"))))
 )
)



;;;;;;;;;;;;;;;;;;;;;;;;;end  lsp java;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;;;;;;;;;;;;;;;;;;;;;;;;end  lsp java;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;;;;;;;;;;;;;;;;;;;;;;;;end  lsp java;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;




;; C-x 1 not work ??
;; temp fix c-x 1 causing by dap causing by treemacs mode
;; the problem occurs after calling M-x dap-java-debug, C-c c-v c-d
;; it is temporary solution  becuase when use c-x 1 (delete-other-windows) not work because treemacs-mode error after calling dap-java 
;; waiting for the fixing bug in  treemacs-mode
;; so my  temp solution is 
(global-set-key (kbd "C-x 1")   'delete-other-windows-internal)





;;;;;;;;;;;;;;;;;;;;;;;; clean mode-line ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; clean modes in mode line, 
;; M-x package-install diminish
;;  diminish can hide minor mode only
;; important get the names of modes from below
;; C-h v ==> major-mode (cant hide))
;; C-h v ==> minor-mode
;; or or or or
;; M-x diminish then select the minor mode only 
;; M-x diminish-undo to view ti again
(diminish 'emms-volume-minor-mode)
(diminish 'emms-playing-time-display-mode)
(diminish 'emms-playing-time-mode)
(diminish 'lsp-diagnostics-mode)
(diminish 'lsp-headerline-breadcrumb-mode)
(diminish 'lsp-modeline-workspace-status-mode)
(diminish 'lsp-modeline-diagnostics-mode)
(diminish 'lsp-modeline-code-actions-mode)
(diminish 'dap-tooltip-mode)
(diminish 'diff-minor-mode)
(diminish 'diff-auto-refine-mode)
(diminish 'lsp-dired-mode)
(diminish 'lsp-rust-analyzer-inlay-hints-mode)
(diminish 'lsp-completion-mode)
(diminish 'real-auto-save-mode)
(diminish 'rng-validate-mode)
(diminish 'html-autoview-mode)
(diminish 'sgml-electric-tag-pair-mode)
(diminish 'company-search-mode)
(diminish 'global-company-mode)
(diminish 'company-mode)
(diminish 'dap-ui-many-windows-mode)
(diminish 'dap-ui-breakpoints-mode)
(diminish 'dap-ui-sessions-mode)
(diminish 'dap-ui-controls-mode)
(diminish 'dap-ui-mode)
(diminish 'gdb-many-windows)
(diminish 'gdb-speedbar-auto-raise)
(diminish 'gdb-enable-debug)
(diminish 'gud-tooltip-mode)
(diminish 'lsp-lens-mode)
(diminish 'lsp-treemacs-error-list-mode)
(diminish 'lsp-treemacs-generic-mode)
(diminish 'lsp-treemacs-sync-mode)
(diminish 'lsp-treemacs-deps-list-mode)
(diminish 'treemacs-filewatch-mode)
(diminish 'treemacs-follow-mode)
(diminish 'treemacs-git-mode)
(diminish 'treemacs-fringe-indicator-mode)
(diminish 'lsp-java-boot-lens-mode)
(diminish 'dap-auto-configure-mode)
(diminish 'dap-mode)
(diminish 'lsp-java-lens-mode)
(diminish 'lsp-ui-mode)
(diminish 'lsp-ui-doc-frame-mode)
(diminish 'lsp-ui-doc-mode)
(diminish 'goto-address-prog-mode)
(diminish 'goto-address-mode)
(diminish 'lsp-ui-imenu-buffer-mode)
(diminish 'lsp-ui-peek-mode)
(diminish 'lsp-ui-sideline-mode)
(diminish 'buffer-face-mode)
(diminish 'text-scale-mode)
(diminish 'lsp-installation-buffer-mode)
(diminish 'lsp-signature-mode)
(diminish 'lsp-managed-mode)
(diminish 'markdown-live-preview-mode)
(diminish 'outline-minor-mode)
(diminish 'override-global-mode)
(diminish 'jtags-mode)
(diminish 'xref-etags-mode)
(diminish 'ace-window-display-mode)
(diminish 'avy-linum-mode)
(diminish 'winner-mode)
(diminish 'fiplr-mode)
(diminish 'global-move-dup-mode)
(diminish 'move-dup-mode)
(diminish 'mc-hide-unmatched-lines-mode)
(diminish 'multiple-cursors-mode)
(diminish 'rectangle-mark-mode)
(diminish 'eimp-mode)
(diminish 'dired-filter-mode)
(diminish 'dired-filter-group-mode)
(diminish 'dired-utils-format-information-line-mode)
(diminish 'dired-isearch-filenames-mode)
(diminish 'dired-omit-mode)
(diminish 'rainbow-delimiters-mode)
(diminish 'electric-pair-mode)
(diminish 'savehist-mode)
(diminish 'server-mode)
(diminish 'flymake-mode)
(diminish 'yas-global-mode)
(diminish 'yas-minor-mode)
(diminish 'shell-dirtrack-mode)
(diminish 'semantic-idle-breadcrumbs-mode)
(diminish 'global-semantic-idle-breadcrumbs-mode)
(diminish 'semantic-idle-completions-mode)
(diminish 'global-semantic-idle-completions-mode)
(diminish 'global-semantic-idle-scheduler-mode)
(diminish 'semantic-idle-local-symbol-highlight-mode)
(diminish 'global-semantic-idle-local-symbol-highlight-mode)
(diminish 'global-semantic-idle-summary-mode)
(diminish 'semantic-idle-summary-mode)
(diminish 'semantic-idle-scheduler-mode)
(diminish 'which-key-mode)
(diminish 'show-paren-mode)
(diminish 'save-place-mode)
(diminish 'recentf-mode)
(diminish 'pdf-occur-dired-minor-mode)
(diminish 'pdf-occur-ibuffer-minor-mode)
(diminish 'pdf-occur-global-minor-mode)
(diminish 'ibuffer-auto-mode)
(diminish 'tablist-edit-column-minor-mode)
(diminish 'tablist-minor-mode)
(diminish 'semantic-highlight-func-mode)
(diminish 'global-semantic-highlight-func-mode)
(diminish 'semantic-stickyfunc-mode)
(diminish 'global-semantic-stickyfunc-mode)
(diminish 'semantic-show-parser-state-mode)
(diminish 'global-semantic-show-parser-state-mode)
(diminish 'semantic-show-unmatched-syntax-mode)
(diminish 'global-semantic-show-unmatched-syntax-mode)
(diminish 'semantic-highlight-edits-mode)
(diminish 'global-semantic-highlight-edits-mode)
(diminish 'semantic-mode)
(diminish 'pdf-isearch-batch-mode)
(diminish 'pdf-isearch-minor-mode)
(diminish 'pdf-isearch-active-mode)
(diminish 'pdf-misc-context-menu-minor-mode)
(diminish 'pdf-misc-menu-bar-minor-mode)
(diminish 'pdf-misc-size-indication-minor-mode)
(diminish 'pdf-misc-minor-mode)
(diminish 'pdf-view-midnight-minor-mode)
(diminish 'pdf-view-printer-minor-mode)
(diminish 'pdf-view-dark-minor-mode)
(diminish 'pdf-view-auto-slice-minor-mode)
(diminish 'pdf-cache-prefetch-minor-mode)
(diminish 'image-minor-mode)
(diminish 'openwith-mode)
(diminish 'magit-auto-revert-mode)
(diminish 'ido-ubiquitous-mode)
(diminish 'ido-cr+-debug-mode)
(diminish 'minibuffer-electric-default-mode)
(diminish 'ido-everywhere)
(diminish 'icomplete-mode)
(diminish 'fido-mode)
(diminish 'compilation-minor-mode)
(diminish 'compilation-shell-minor-mode)
(diminish 'golden-ratio-mode)
(diminish 'global-hl-line-mode)
(diminish 'hl-line-mode)
(diminish 'global-flycheck-mode)
(diminish 'flycheck-mode)
(diminish 'global-dash-fontify-mode)
(diminish 'dash-fontify-mode)
(diminish 'global-auto-revert-mode)
(diminish 'auto-revert-tail-mode)
(diminish 'auto-revert-mode)
(diminish 'global-auto-complete-mode)
(diminish 'auto-complete-mode)
(diminish 'global-anzu-mode)
(diminish 'anzu-mode)
(diminish 'display-time-mode)
(diminish 'display-battery-mode)
(diminish 'diredfl-global-mode)
(diminish 'diredfl-mode)
(diminish 'dired-hide-details-mode)
(diminish 'desktop-save-mode)
(diminish 'url-handler-mode)
(diminish 'cl-old-struct-compat-mode)
(diminish 'tooltip-mode)
(diminish 'global-eldoc-mode)
(diminish 'eldoc-mode)
(diminish 'electric-quote-mode)
(diminish 'electric-layout-mode)
(diminish 'electric-indent-mode)
(diminish 'mouse-wheel-mode)
(diminish 'tool-bar-mode)
(diminish 'paragraph-indent-minor-mode)
(diminish 'global-prettify-symbols-mode)
(diminish 'prettify-symbols-mode)
(diminish 'use-hard-newlines)
(diminish 'tab-bar-history-mode)
(diminish 'tab-bar-mode)
(diminish 'menu-bar-mode)
(diminish 'file-name-shadow-mode)
(diminish 'horizontal-scroll-bar-mode)
(diminish 'jit-lock-debug-mode)
(diminish 'global-font-lock-mode)
(diminish 'font-lock-mode)
(diminish 'blink-cursor-mode)
(diminish 'window-divider-mode)
(diminish 'completion-in-region-mode)
(diminish 'auto-composition-mode)
(diminish 'unify-8859-on-decoding-mode)
(diminish 'unify-8859-on-encoding-mode)
(diminish 'auto-encryption-mode)
(diminish 'auto-compression-mode)
(diminish 'temp-buffer-resize-mode)
(diminish 'visible-mode)
(diminish 'buffer-read-only)
(diminish 'size-indication-mode)
(diminish 'column-number-mode)
(diminish 'line-number-mode)
(diminish 'auto-fill-function)
(diminish 'global-visual-line-mode)
(diminish 'visual-line-mode)
(diminish 'transient-mark-mode)
(diminish 'next-error-follow-minor-mode)
(diminish 'auto-save-visited-mode)
(diminish 'auto-save-mode)
(diminish 'auto-fill-mode)
(diminish 'abbrev-mode)
(diminish 'overwrite-mode)
(diminish 'view-mode)
(diminish 'hs-minor-mode)
;;(diminish 'lsp-mode)

;; hide git-master vc-mode
 (setcdr (assq 'vc-mode mode-line-format)
         '((:eval (replace-regexp-in-string "Git.master" "" vc-mode))))


;;;;;;;;;;;;;;;;;;;;;;;; clean mode-line ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;





;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; load emacs_config.el now 
;; (add-to-list 'load-path "~/.emacs.d/plugins")
;; (add-to-list 'load-path  "/home/importantDIR/EmacsElisp")
;; (requie 'emacs_config) 
(load "/home/importantDIR/EmacsElisp/emacs_config.el")
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; ================================================================              
;; (line-number-at-pos) 4933 4931 4930 4734  4675 
;; ================================================================

