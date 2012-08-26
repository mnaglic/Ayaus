(defproject ayaus "0.1.0-SNAPSHOT"
            :description "And yet another URL shortener"
            :dependencies [[org.clojure/clojure "1.4.0"]
                           [noir "1.3.0-beta3"]
                           [fetch "0.1.0-alpha2"]
                           [domina "1.0.0"]
                           [com.novemberain/monger "1.1.0"]]
            :cljsbuild {
               :builds [{
                  :source-path "src-cljs"
                  :compiler {
                     :output-to "resources/public/js/main.js"
                     :optimizations :advanced}}]}
            :main ayaus.server)

