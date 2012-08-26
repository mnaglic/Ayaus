(ns ayaus.views.common
  (:use [noir.core :only [defpartial]]
        [hiccup.page :only [include-css include-js html5]]))

(defpartial layout [& content]
            (html5              
              [:head
               [:title "ayaus"]
               (include-css "/css/bootstrap.css")]              
              [:body
               [:div.container
                content]]
              (include-js "/js/main.js")))